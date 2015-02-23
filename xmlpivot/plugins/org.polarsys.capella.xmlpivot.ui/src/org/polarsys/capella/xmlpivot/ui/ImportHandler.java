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

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.polarsys.capella.xmlpivot.ResourceLoader;
import org.polarsys.capella.xmlpivot.XMLPivotActivator;
import org.polarsys.capella.xmlpivot.XMLPivotResourceFactory;
import org.polarsys.capella.xmlpivot.importer.ImportRunner;


/** <p>
* <strong>EXPERIMENTAL</strong>. This class or interface has been added as
* part of a work in progress. There is no guarantee that this API will
* work or that it will remain the same. Please do not use this API without
* consulting with the Capella team.
* </p>
*/
public class ImportHandler extends AbstractHandler {

  final static String PARAM_DYNAMIC_IMPORT = "org.polarsys.capella.xmlpivot.ui.dynamicImport";
  
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    
    final IFile sourceFile = (IFile) ((IStructuredSelection) HandlerUtil.getCurrentSelection(event)).getFirstElement();
    
    try {
      final ProgressMonitorDialog dialog = new ProgressMonitorDialog(HandlerUtil.getActiveShell(event));
      IRunnableWithProgress runnable = new IRunnableWithProgress() {
        @Override
        public void run(IProgressMonitor monitor_p) throws InvocationTargetException, InterruptedException {
          try {
            
            boolean dynamic = "true".equals(event.getParameter(PARAM_DYNAMIC_IMPORT));
          
            SubMonitor progress = SubMonitor.convert(monitor_p, "XML Pivot Import", 100);
            URI uri = URI.createPlatformResourceURI(sourceFile.getFullPath().toString(), true);
            
            // First we load the input model. user may decide to abort if an error occurred during load.
            // note that an error during load may not necessarily force the whole operation to fail,
            // the emf resource implementation will load as much as possible and that's what is finally
            // being imported to Capella.
            
            ResourceSet sourceRs = new ResourceSetImpl();
            sourceRs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLPivotResourceFactory());
            if (dynamic){
            	sourceRs.setPackageRegistry(XMLPivotActivator.getDefault().getDynamicPackageRegistry());
            }
            ResourceLoader loader = new ResourceLoader();
            Resource resource = loader.load(sourceRs, uri);
            final Diagnostic diagnostic = loader.getDiagostic(resource); 
            if (diagnostic.getSeverity() != Diagnostic.OK){
              dialog.getShell().getDisplay().syncExec(new Runnable(){
                @Override
                public void run(){
                  DiagnosticDialog.open(dialog.getShell(), "XML Pivot Import", "Import continues with partially loaded model", diagnostic);
                }
              });
            }
            
            Collection<EObject> result = new ImportRunner().run(resource.getContents(), dynamic, progress.newChild(90));

            
            Resource targetResource = sourceRs.createResource(uri.appendFileExtension("melodymodeller"));
            for (EObject e : result){
              targetResource.getContents().add(e);
            }
            try {
              targetResource.save(Collections.emptyMap());
            } catch (IOException exception_p) {
              throw new InvocationTargetException(exception_p);
            }
          } finally {
            if (monitor_p != null){
              monitor_p.done();
            }
          }
        }
      };
      
      dialog.run(true, true, runnable);
      
      
    } catch (InvocationTargetException exception_p) {
      throw new ExecutionException(exception_p.getMessage(), exception_p);
    } catch (InterruptedException exception_p) {
      throw new ExecutionException(exception_p.getMessage(), exception_p);
    }  
    
    return null;
  }

}
  
