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

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.polarsys.capella.common.data.modellingcore.AbstractTrace;
import org.polarsys.capella.common.helpers.TransactionHelper;
import org.polarsys.capella.common.tools.report.EmbeddedMessage;
import org.polarsys.capella.common.tools.report.config.registry.ReportManagerRegistry;
import org.polarsys.capella.common.tools.report.util.IReportManagerDefaultComponents;
import org.polarsys.capella.common.ui.services.helper.EObjectLabelProviderHelper;
import org.polarsys.capella.common.ui.toolkit.dialogs.SelectElementsDialog;
import org.polarsys.capella.common.ui.toolkit.viewers.data.DataLabelProvider;
import org.polarsys.capella.core.data.capellacommon.TransfoLink;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.model.handler.provider.CapellaAdapterFactoryProvider;
import org.polarsys.capella.xmlpivot.exporter.XMLPivotExport;
import org.polarsys.capella.xmlpivot.ui.editor.CapellamodellerEditor;


/** <p>
* <strong>EXPERIMENTAL</strong>. This class or interface has been added as
* part of a work in progress. There is no guarantee that this API will
* work or that it will remain the same. Please do not use this API without
* consulting with the Capella team.
* </p>
*/
public class ExportHandler extends AbstractHandler implements IHandler {

  final static String PARAM_DYNAMIC_EXPORT = "org.polarsys.capella.xmlpivot.ui.dynamicExport"; //$NON-NLS-1$

  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {

    final @SuppressWarnings("unchecked")
    List<EObject> selectedObjects = ((IStructuredSelection) HandlerUtil.getCurrentSelection(event)).toList();
    final AtomicReference<Collection<? extends EObject>> skippedElements = new AtomicReference<Collection<? extends EObject>>();
    final boolean dynamic = "true".equals(event.getParameter(PARAM_DYNAMIC_EXPORT));
    final URI destination = getExportDestination(selectedObjects, dynamic, HandlerUtil.getActiveShell(event));
    if (destination == null) {
      return null;
    }

    IRunnableWithProgress runnable = new IRunnableWithProgress() {

      @Override
      public void run(IProgressMonitor monitor_p) throws InvocationTargetException, InterruptedException {

        XMLPivotExport export = new XMLPivotExport(selectedObjects, destination, event.getCommand().getId(), dynamic);
        try {
          export.run(monitor_p);
        } catch (IOException exception_p) {
          throw new InvocationTargetException(exception_p);
        } catch (CoreException exception_p) {
          throw new InvocationTargetException(exception_p);
        }
        skippedElements.set(export.getSkippedElements());
      }

    };

    try {
      new ProgressMonitorDialog(HandlerUtil.getActiveShell(event)).run(true, true, runnable);
    } catch (InvocationTargetException exception_p) {
      throw new ExecutionException(exception_p.getMessage(), exception_p.getCause());
    } catch (InterruptedException exception_p) {
      throw new ExecutionException(exception_p.getMessage(), exception_p);
    }

    logSkippedElements(event, skippedElements.get());

    IEditorInput editorInput = new URIEditorInput(destination);
    boolean alreadyOpen = false;
    try {
      for (IEditorReference ref : HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getEditorReferences()) {
        if (ref.getEditorInput().equals(editorInput)) {
          alreadyOpen = true;
          break;
        }
      }
    } catch (PartInitException exception_p) {
      throw new ExecutionException(exception_p.getMessage(), exception_p);
    }

    if (!alreadyOpen && MessageDialog.openQuestion(HandlerUtil.getActiveShell(event), "Export successful", "Do you want to open the result in an editor?")) {
      try {
        String editorID = dynamic ? CapellamodellerEditor.Dynamic.EDITOR_ID : CapellamodellerEditor.EDITOR_ID;
        HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().openEditor(editorInput, editorID);
      } catch (PartInitException exception_p) {
        throw new ExecutionException(exception_p.getMessage(), exception_p);
      }
    }
    return null;
  }

  protected void logSkippedElements(ExecutionEvent event, final Collection<? extends EObject> skipped) {
    if (skipped.size() > 0) {

      // FIXME we log here because EObjectLabelProviderHelper depends on ui, but shouldn't
      Logger logger = ReportManagerRegistry.getInstance().subscribe(IReportManagerDefaultComponents.DEFAULT);
      for (EObject s : skipped) {
        logger.info(new EmbeddedMessage(EObjectLabelProviderHelper.getText(s) + " was not exported", IReportManagerDefaultComponents.DEFAULT, s));
      }

      Shell shell = HandlerUtil.getActiveShell(event);
      TransactionalEditingDomain domain = TransactionHelper.getEditingDomain(skipped.iterator().next());
      AdapterFactory factory = CapellaAdapterFactoryProvider.getInstance().getAdapterFactory();

      DataLabelProvider labelProvider = new DataLabelProvider(domain, factory) {
        @Override
        protected Color getValidElementColor() {
          return Display.getDefault().getSystemColor(SWT.COLOR_RED);
        }
      };

      final Collection<EObject> skippedNoTraces = new ArrayList<EObject>();
      for (EObject e : skipped) {
        if (!((e instanceof AbstractTrace) || (e.eContainer() instanceof TransfoLink))) {
          skippedNoTraces.add(e);
        }
      }
      Window dialog =
          new SelectElementsDialog(shell, labelProvider, "Skipped Elements Report",
              "Elements in Red are not part of the exported XML file because they do not belong to the Capella simplified Metamodel", skippedNoTraces,
              false, null, AbstractTreeViewer.ALL_LEVELS) {

    	  	/**
    	  	 * @see org.polarsys.capella.common.ui.toolkit.dialogs.SelectElementsDialog#doCreateDialogArea(org.eclipse.swt.widgets.Composite)
    	  	 */
            @Override
            protected void doCreateDialogArea(Composite parent_p) {

              createTreeViewerPart(parent_p);
              // Create Tree Viewer part.
              final Button check = new Button(parent_p, SWT.CHECK);
              check.setText("Show abstract trace elements");
              check.addSelectionListener(new SelectionListener() {

                @Override
                public void widgetSelected(SelectionEvent e) {
                  if (check.getSelection()) {
                    getViewer().setInput(skipped, null);
                  } else {
                    getViewer().setInput(skippedNoTraces, null);
                  }
                }

                @Override
                public void widgetDefaultSelected(SelectionEvent e) {
                }

              });
              GridData data = new GridData(GridData.FILL, GridData.BEGINNING, true, false);
              data.horizontalIndent = 5;
              check.setLayoutData(data);
              configureInitialDisplay();
            }

            @Override
            protected void configureShell(Shell newShell_p) {
              super.configureShell(newShell_p);
              newShell_p.setText("XML Pivot Export");
            }

            // TODO unhack this
            @Override
            protected void createButtonsForButtonBar(Composite parent) {
              createButton(parent, IDialogConstants.CANCEL_ID, "OK", false);
            }
          };
      dialog.open();
    }
  }

  private URI getExportDestination(Collection<? extends EObject> selectedObjects, boolean dynamic, Shell shell) {
    String fileName = dynamic ? "export.xml" : "export_static.xml";
    if (selectedObjects.iterator().next() instanceof NamedElement) {
      String name = ((NamedElement) selectedObjects.iterator().next()).getName();
      if ((name != null) && !name.isEmpty()) {
        fileName = name + (dynamic ? ".xml" : "_static.xml");
      }
    }

    FileDialog dialog = new FileDialog(shell, SWT.OPEN);
    dialog.setFilterExtensions(new String[] { "*.xml" });
    dialog.setFileName(fileName);

    URI selectionURI = selectedObjects.iterator().next().eResource().getURI();
    if (selectionURI.isPlatformResource()) {
      String segment = URI.decode(selectionURI.segment(1));
	  IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(segment);
      dialog.setFilterPath(project.getLocation().toOSString());
    }

    String result = dialog.open();
    if (result == null) {
      return null;
    }

    if (new File(result).exists()) {
      if (!MessageDialog.openConfirm(shell, "Overwrite existing file?", "The destination file already exists and will be overwritten.")) {
        return null;
      }
    }

    IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(result));
    if (file != null) {
      return URI.createPlatformResourceURI(file.getFullPath().toString(), true);
    }

    return URI.createFileURI(result);
  }

}
