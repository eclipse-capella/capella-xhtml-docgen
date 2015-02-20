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
package org.polarsys.capella.xmlpivot.extraction;

import org.eclipse.equinox.app.IApplicationContext;
import org.polarsys.capella.core.commandline.core.AbstractCommandLine;
import org.polarsys.capella.core.commandline.core.CommandLineException;
import org.polarsys.capella.xmlpivot.common.CapellaPackageRegistry;
import org.polarsys.capella.xmlpivot.extraction.XMLPivotExtractor.Builder;


public class XMLPivotExtractorCmd extends AbstractCommandLine {
  /**
   * {@inheritDoc}
   */
  @Override
  public boolean execute(IApplicationContext context_p) throws CommandLineException {

    Builder builder = new XMLPivotExtractor.Builder();
    builder.projectName = "org.polarsys.capella.core.semantic.data.gen"; //$NON-NLS-1$
    builder.genmodelName = "simplified.genmodel"; //$NON-NLS-1$
    builder.reportModelName = "unmapped.report"; //$NON-NLS-1$
    builder.genmodelBasePackage = "org.polarsys.capella.core.semantic.data"; //$NON-NLS-1$
    builder.modelPluginClass = "org.polarsys.capella.core.semantic.data.capellamodeller.CapellaModellerPlugin"; //$NON-NLS-1$
    builder.editPluginClass = "org.polarsys.capella.core.semantic.data.capellamodeller.provider.CapellamodellerEditPlugin"; //$NON-NLS-1$
    builder.editorPluginClass = "org.polarsys.capella.core.semantic.data.capellamodeller.presentation.CapellamodellerEditorPlugin"; //$NON-NLS-1$
    builder.pluginVersion = "0.8.0.qualifier"; //$NON-NLS-1$
    builder.sourcePackages = CapellaPackageRegistry.getAllCapellaPackages();
    builder.bootstrap = true;

    XMLPivotExtractor extractor = builder.build();
    try {
      extractor.extract();
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    return true;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void checkArgs(IApplicationContext context_p) throws CommandLineException {
    // check nothing
  }

  @Override
  public boolean projectVersionIsCompliant() throws CommandLineException {
    return true;
  }
}
