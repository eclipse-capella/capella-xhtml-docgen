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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.equinox.app.IApplicationContext;
import org.polarsys.capella.core.commandline.core.CommandLineConstants;
import org.polarsys.capella.docgen.configuration.commandline.HTMLConfigurationCommandLine;

/**
 * This test aims as testing the generation using the configuration files in order to conduct a selective documentation generation.
 * For yes unknown reasons this tests does not work on the CI but does works locally.
 * 
 * @author <a href="mailto:arnaud.dieumegard@obeo.fr">Arnaud Dieumegard</a> *
 */
public class CommandLineConfigurationTest extends CommandLineHTMLTest {
    
  @Override
  public void test() throws Exception {

    IFile capellaFileForLoadedModel = getCapellaFileForLoadedModel("doc_configuration");
    IPath fullPath = capellaFileForLoadedModel.getProject().getParent().getLocation();
    IProject testProject = capellaFileForLoadedModel.getProject();
    
    String[] validationCommandLineArguments = { CommandLineConstants.ID, "org.polarsys.kitalpha.doc.conf.gen.business.capella.commandline",
        CommandLineConstants.DATA, fullPath.toOSString(),
        CommandLineConstants.INPUT, "/doc_configuration/doc_configuration.aird",
        HTMLConfigurationCommandLine.CONFIGURATION, "/doc_configuration/doc_configuration.configuration",
        CommandLineConstants.OUTPUTFOLDER, "/doc_configuration/doc"};
    
    IApplicationContext mockApplicationContext = new MockApplicationContext(validationCommandLineArguments);

    // Simulate launching from command line
    HTMLConfigurationCommandLine htmlCommandLine = new HTMLConfigurationCommandLine();
    launchApplication(mockApplicationContext, htmlCommandLine);
    
    assertTrue("\"doc\" output folder should exist", testProject.getFolder("doc").exists());
    assertTrue("\"output\" output folder should exist", testProject.getFolder("doc").getFolder("output").exists());
    assertTrue("\"doc_configuration\" output folder should exist", testProject.getFolder("doc").getFolder("output").getFolder("doc_configuration").exists());
    assertTrue("\"3279224371c14f69940a3b5e697e652a\" output folder should exist", testProject.getFolder("doc").getFolder("output").getFolder("doc_configuration").getFolder("3279224371c14f69940a3b5e697e652a").exists());
    // SA element has a page
    assertTrue("SA Package element should have a page", testProject.getFile(new Path("doc/output/doc_configuration/c56d049a88f2443aacd6c2ab179c2316.html")).exists());
    // SAB diagram generated
    assertTrue("SAB diagram should be generated", testProject.getFile(new Path("doc/output/doc_configuration/3279224371c14f69940a3b5e697e652a/_ZX00sPhMEey6iIOHW45W1w.jpg")).exists());
    // LA element has no page    
    assertFalse("LA element should not have a page", testProject.getFile(new Path("doc/output/doc_configuration/33364288f52740fdb18d11cf692ca022.html")).exists());
    // SA Root function has no page
    assertFalse("SA Root function should not have a page", testProject.getFile(new Path("doc/output/doc_configuration/481c994673424617be3bdb4f3a3013bd.html")).exists());
    // SA Root function SFBD diagram is not generated
    assertFalse("SA Root function SFBD should not be generated", testProject.getFile(new Path("doc/output/doc_configuration/481c994673424617be3bdb4f3a3013bd/_e_QXQPhMEey6iIOHW45W1w.jpg")).exists());
  }
  
  @Override
    public List<String> getRequiredTestModels() {
        List<String> res = new ArrayList<>();
        res.add("doc_configuration");
        return res;
    }

}
