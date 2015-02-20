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

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.CompareUI;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;
import org.polarsys.capella.common.ef.ExecutionManager;
import org.polarsys.capella.common.ef.ExecutionManagerRegistry;
import org.polarsys.capella.common.helpers.EcoreUtil2;
import org.polarsys.capella.core.model.handler.command.CapellaResourceHelper;
import org.polarsys.capella.xmlpivot.ResourceLoader;
import org.polarsys.capella.xmlpivot.XMLPivotActivator;
import org.polarsys.capella.xmlpivot.XMLPivotResourceFactory;
import org.polarsys.capella.xmlpivot.importer.ImportAsNewProjectRunner;
import org.polarsys.capella.xmlpivot.merge.CompareEditorInputFactory;


public class MergeHandler extends AbstractHandler {

  private static final String PARAM_DYNAMIC_MERGE = "org.polarsys.capella.xmlpivot.ui.dynamicMerge";

  ViewerFilter capellamodellerViewerFilter = new ViewerFilter() {

    @Override
    public boolean select(Viewer viewer_p, Object parentElement_p, Object element_p) {
      if ((element_p instanceof IFile) && ((IFile) element_p).getFileExtension().equals(CapellaResourceHelper.CAPELLA_MODEL_FILE_EXTENSION)) {
        return true;
      }
      if (element_p instanceof IContainer) {
        IContainer c = (IContainer) element_p;
        try {
          for (IResource member : c.members()) {
            if (select(viewer_p, element_p, member)) {
              return true;
            }
          }
        } catch (CoreException e) {
          StatusManager.getManager().handle(e, XMLPivotUIActivator.PLUGIN_ID);
          return false;
        }
      }

      return false;
    }
  };

  private URI getTargetModelURI(ExecutionEvent event_p) {
    IFile[] targetFile =
        WorkspaceResourceDialog.openFileSelection(HandlerUtil.getActiveShell(event_p), "XML Pivot Merge", "Select existing .melodymodeller file", false,
            new Object[] {}, Collections.singletonList(capellamodellerViewerFilter));
    if (targetFile.length == 0) {
      return null;
    }
    return EcoreUtil2.getURI(targetFile[0]);
  }

  @Override
  public Object execute(final ExecutionEvent event_p) throws ExecutionException {

    final URI target = getTargetModelURI(event_p);

    if (target != null) {

      IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event_p);
      final URI source = URI.createPlatformResourceURI(((IFile) selection.getFirstElement()).getFullPath().toString(), true);

      final ProgressMonitorDialog loaderDialog = new ProgressMonitorDialog(HandlerUtil.getActiveShell(event_p));
      final boolean dynamic = "true".equals(event_p.getParameter(PARAM_DYNAMIC_MERGE));
      final ResourceSet set = new ResourceSetImpl();
      set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLPivotResourceFactory());
      if (dynamic) {
        set.setPackageRegistry(XMLPivotActivator.getDefault().getDynamicPackageRegistry());
      }

      ExecutionManager manager = ExecutionManagerRegistry.getInstance().addNewManager();
      final CompareEditorInputFactory factory = new CompareEditorInputFactory(manager.getEditingDomain(), new ImportAsNewProjectRunner(), new ResourceLoader());
      final AtomicReference<CompareEditorInput> editorInput = new AtomicReference<CompareEditorInput>();

      try {
        loaderDialog.run(true, true, new IRunnableWithProgress() {
          @Override
          public void run(IProgressMonitor monitor_p) throws InvocationTargetException, InterruptedException {
            editorInput.set(factory.create(target, source, dynamic, set, monitor_p));
          }
        });
      } catch (InvocationTargetException exception_p) {
        throw new ExecutionException(exception_p.getMessage(), exception_p);
      } catch (InterruptedException exception_p) {
        throw new ExecutionException(exception_p.getMessage(), exception_p);
      } finally {
        manager.getEditingDomain().dispose();
      }
      if (editorInput.get() != null) {
        CompareUI.openCompareEditor(editorInput.get());
      }
    }
    return null;
  }

}
