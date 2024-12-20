/*******************************************************************************
 * Copyright (c) 2022 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.docgen.test.ju.cases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang.NotImplementedException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.business.api.session.Session;
import org.junit.AfterClass;
import org.junit.Before;
import org.osgi.framework.Bundle;
import org.polarsys.capella.docgen.preference.CapellaDocgenPreferenceConstant;
import org.polarsys.capella.docgen.test.ju.launch.XHTMLDocumentationGenerationLauncher;
import org.polarsys.capella.docgen.test.ju.reporter.CapellaDocGenHtmlDomainElementReporter;
import org.polarsys.capella.test.framework.api.BasicTestCase;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenPreferenceConstant;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;
import org.polarsys.kitalpha.doc.gen.business.core.ui.helper.InvokeActivityHelper;

public abstract class AbstractCapellaDocGenTest extends BasicTestCase {

  protected static String OUTPUT_FOLDER_PATH = "doc/";

  private static final URI CAPELLA_TEST_LAUNCHER_URI = URI.createURI(
      "platform:/plugin/org.polarsys.capella.docgen.test.ju/egf/capellatestlauncher.fcore#_zup7kAkdEeCBJtEcjZDVOA",
      true);

  private static CapellaDocGenHtmlDomainElementReporter reporter;
  private static Session sessionForTestModel;

  protected String getProjectName() {
    throw new NotImplementedException("Method \"getProjectName\" should be implemented for this test case.");
  }

  protected String getModelName() {
    throw new NotImplementedException("Method \"getModelName\" should be implemented for this test case.");
  }

  protected static List<String> evaluatedModelElementIDs = Arrays.asList();

  public String getPathPrefix() {
    return "/" + getProjectName() + "/" + getModelName() + ".";
  }

  public URI getSemanticModelURI() {
    return URI.createPlatformResourceURI(getPathPrefix()
        + org.polarsys.capella.core.model.handler.command.CapellaResourceHelper.CAPELLA_MODEL_FILE_EXTENSION, true);
  }

  private URI getDesignModelURI() {
    return URI.createPlatformResourceURI(getPathPrefix() + "aird", true);
  }

  @Override
  public List<String> getRequiredTestModels() {
    return Arrays.asList(getModelName());
  }

  @SuppressWarnings("unchecked")
  protected static Collection<Object[]> getTestParameters(Path path, List<String> evaluatedModelElementIDs) {
    Bundle bundle = Platform.getBundle("org.polarsys.capella.docgen.test.ju");
    URL fileURL = FileLocator.find(bundle, path, null);
    Collection<Object[]> data = new ArrayList<Object[]>();
    try {
      InputStream fileIn = fileURL.openStream();
      ObjectInputStream in = new ObjectInputStream(fileIn);
      Object res = in.readObject();
      if (res instanceof Map<?, ?>) {
        Map<?, ?> mapRes = (Map<?, ?>) res;
        boolean typeMatch = mapRes.values().stream().anyMatch(elem -> elem instanceof String);
        if (typeMatch) {
          data = ((Map<String, String>) res).entrySet().stream().filter(entry -> {
            return evaluatedModelElementIDs == null || evaluatedModelElementIDs.isEmpty()
                || evaluatedModelElementIDs.stream().anyMatch(val -> entry.getKey().startsWith(val));
          }).map(entry -> {
            String[] table = { entry.getKey(), entry.getValue() };
            return table;
          }).collect(Collectors.toList());
        }
      }
      in.close();
      fileIn.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return data;
  }

  private CapellaDocGenHtmlDomainElementReporter setReporter() {
    reporter = new CapellaDocGenHtmlDomainElementReporter(this);
    return reporter;
  }

  protected static CapellaDocGenHtmlDomainElementReporter getReporter() {
    return reporter;
  }

  @Override
  @Before
  public void setUp() throws Exception {

    // This is the first launch so we generate documentation
    if (getReporter() == null) {
      super.setUp();

      getAirdFileForLoadedModel(getModelName());
      getCapellaFileForLoadedModel(getModelName());

      DiagramSessionHelper.setAirdUri(getDesignModelURI());

      sessionForTestModel = DiagramSessionHelper.initSession();
      sessionForTestModel.open(new NullProgressMonitor());

      // Load all representations (so that the status is the same in case of lazy loading)
      DiagramSessionHelper.getSessionDRepresentation();

      IEclipsePreferences docgenPref = InstanceScope.INSTANCE.getNode("org.polarsys.capella.docgen.preference");
      docgenPref.put(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__COMPONENT_EXCHANGE, "true");
      docgenPref.put(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__PHYSICAL_LINK, "true");
      docgenPref.put(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__FUNCTIONAL_EXCHANGE, "true");
      docgenPref.put(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__ASSOCIATION, "true");
      // docgenPref.put(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__STATUS_AND_REVIEW, "true");
      docgenPref.flush();

      IEclipsePreferences kitalphaDocgenPref = InstanceScope.INSTANCE
          .getNode("org.polarsys.kitalpha.doc.gen.business.core.preference");
      kitalphaDocgenPref.put(DocgenPreferenceConstant.DOCGEN_DIAGRAMS_EXPORT, "true");
      kitalphaDocgenPref.flush();

      launchDocumentationGeneration();
    }
  }

  private void launchDocumentationGeneration() {
    System.out.println("[" + this.getName() + "] " + ">> begin documentation generation ");
    setReporter();
    // Launch docgen
    Activity melodyLauncher = InvokeActivityHelper.getActivity(CAPELLA_TEST_LAUNCHER_URI);
    if (melodyLauncher instanceof FactoryComponent) {
      FactoryComponent factoryComponent = (FactoryComponent) melodyLauncher;
      XHTMLDocumentationGenerationLauncher.gen(getProjectName(), OUTPUT_FOLDER_PATH, factoryComponent,
          getSemanticModelURI(), reporter);
    }
    System.out.println("[" + this.getName() + "] " + ">> end documentation generation ");
  }

  @AfterClass
  public static void afterTestExecution() {
    getReporter().afterTestExecution();
  }
}
