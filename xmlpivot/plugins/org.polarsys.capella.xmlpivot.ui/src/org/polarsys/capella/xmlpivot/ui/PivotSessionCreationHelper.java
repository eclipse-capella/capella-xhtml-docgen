/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *    
 *  Contributors:
 *     Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.xmlpivot.ui;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.polarsys.capella.common.ef.command.ICommand;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.model.handler.helpers.CapellaProjectHelper.ProjectApproach;
import org.polarsys.capella.core.model.skeleton.impl.cmd.CreateCapellaProjectCmd;
import org.polarsys.capella.core.platform.sirius.ui.project.operations.ProjectSessionCreationHelper;
import org.polarsys.capella.xmlpivot.ResourceLoader;
import org.polarsys.capella.xmlpivot.XMLPivotActivator;
import org.polarsys.capella.xmlpivot.XMLPivotResourceFactory;
import org.polarsys.capella.xmlpivot.importer.ImportAsNewProjectRunner;


public class PivotSessionCreationHelper extends ProjectSessionCreationHelper {

  private ResourceLoader loader;
  private ImportAsNewProjectRunner runner;
  private URI uri;
  private Shell shell = null;

  public PivotSessionCreationHelper(Shell shell_p, boolean epbsSelected_p, boolean opaSelected_p, ProjectApproach projectApproach_p, URI uri_p) {
    super(epbsSelected_p, opaSelected_p, projectApproach_p);
    runner = new ImportAsNewProjectRunner();
    loader = new ResourceLoader();
    uri = uri_p;
    shell = shell_p;
  }

  @Override
  public void fillNewModel(Project project, String name_p, IProgressMonitor monitor_p) {
    // overriden, the skeleton is already created during createProject
  }

  @Override
  protected ICommand createInitialElementsCommand(Resource resource_p, String projectName_p, IProgressMonitor monitor_p) {
    return new CreateCapellaProjectCmd(resource_p, projectName_p, getProjectApproach()) {

      /**
       * {@inheritDoc}
       */
      @Override
      public void run() {
        super.run();
        getProject().eResource().getContents().addAll(runner.getOtherHunks());
      }

      /**
       * {@inheritDoc}
       */
      @Override
      protected Project createProject(String name_p) {

        // First we load the input model.
        // Note that an error during load may not necessarily force the whole operation to fail,
        // The emf resource implementation will load as much as possible and that's what's finally
        // being imported to Capella. Famous example: Static import of model extensions for which no packages are registered in the global registry.
        ResourceSet set = new ResourceSetImpl();
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLPivotResourceFactory());
        boolean dynamic = true;
        if (dynamic) {
          set.setPackageRegistry(XMLPivotActivator.getDefault().getDynamicPackageRegistry());
        }

        Resource resource = loader.load(set, uri);
        Diagnostic diagnostic = loader.getDiagostic(resource);
        if (diagnostic.getSeverity() != Diagnostic.OK) {
          DiagnosticDialog.open(shell, "XML Pivot Import", "Project will be created with partially loaded model", diagnostic);
        }
        try {
          runner.run(resource.getContents(), name_p, dynamic, new NullProgressMonitor());
        } catch (WrappedException e) {
          if (e instanceof Resource.Diagnostic) {
            MessageDialog.openError(shell, "Error", ((Resource.Diagnostic) e).getMessage());
            return null;
          }
          throw e;
        }

        return runner.getProjectHunk();

      }

    };
  }

  // This is quite a hack. EMF drag/drop commands will only work
  // if a fragment has an owner. So we create an artificial one..
  private EObject createFragmentHolder(Collection<EObject> fragments) {
    EPackage pack = EcoreFactory.eINSTANCE.createEPackage();
    pack.setNsURI("http://xmlPivotImportHelper");
    EClass clazz = EcoreFactory.eINSTANCE.createEClass();
    pack.getEClassifiers().add(clazz);
    clazz.setName("LostAndFound");
    EReference contents = EcoreFactory.eINSTANCE.createEReference();
    contents.setContainment(true);
    contents.setName("elements");
    contents.setUpperBound(-1);
    clazz.getEStructuralFeatures().add(contents);
    contents.setEType(EcorePackage.Literals.EOBJECT);
    EObject holder = EcoreUtil.create(clazz);
    ((List<EObject>) holder.eGet(contents)).addAll(fragments);
    return holder;
  }
}
