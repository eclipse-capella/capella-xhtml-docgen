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
package org.polarsys.capella.xmlpivot.exporter.cli;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.equinox.app.IApplicationContext;
import org.polarsys.capella.common.ef.ExecutionManager;
import org.polarsys.capella.common.ef.ExecutionManagerRegistry;
import org.polarsys.capella.core.commandline.core.AbstractCommandLine;
import org.polarsys.capella.core.commandline.core.CommandLineArgumentHelper;
import org.polarsys.capella.core.commandline.core.CommandLineException;
import org.polarsys.capella.core.model.handler.command.CapellaResourceHelper;
import org.polarsys.capella.xmlpivot.XMLPivotActivator;
import org.polarsys.capella.xmlpivot.exporter.XMLPivotExport;


public class XMLPivotExportCommandline extends AbstractCommandLine {

  /**
   * {@inheritDoc}  
   */
  @Override
  public boolean execute(IApplicationContext context_p) throws CommandLineException {
    String filePath = CommandLineArgumentHelper.getInstance().getFilePath();
    if (filePath == null) {
      return false;
    }

    URI uri = null;
    if (new File(filePath).isAbsolute()) {
      uri = URI.createFileURI(filePath);
    } else {
      uri = URI.createPlatformResourceURI("/" + filePath, true);
    }
    if (CapellaResourceHelper.AIRD_FILE_EXTENSION.equals(uri.fileExtension())) {
      uri = uri.trimFileExtension().appendFileExtension(CapellaResourceHelper.CAPELLA_MODEL_FILE_EXTENSION);
    }

    ExecutionManager manager = ExecutionManagerRegistry.getInstance().addNewManager();
    Resource resource = manager.getEditingDomain().getResourceSet().getResource(uri, true);
    Collection<? extends EObject> selection = resource.getContents();
    XMLPivotExport export = new XMLPivotExport(selection, uri.appendFileExtension("xml"), XMLPivotExport.DEFAULT_EXPORT_COMMAND, true);
    try {
      export.run(new NullProgressMonitor());
    } catch (IOException exception_p) {
      XMLPivotActivator.getDefault().getLog().log(new Status(IStatus.ERROR, XMLPivotActivator.PLUGIN_ID, exception_p.getMessage(), exception_p));
      return false;
    } catch (CoreException exception_p) {
      XMLPivotActivator.getDefault().getLog().log(new Status(IStatus.ERROR, XMLPivotActivator.PLUGIN_ID, exception_p.getMessage(), exception_p));
      return false;
    } finally {
      manager.getEditingDomain().dispose();
    }
    return true;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void checkArgs(IApplicationContext context_p) throws CommandLineException {
    // 
  }

}
