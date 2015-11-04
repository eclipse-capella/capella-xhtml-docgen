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
package org.polarsys.capella.xmlpivot.test;

import org.junit.Test;
import org.polarsys.capella.xmlpivot.common.CapellaPackageRegistry;
import org.polarsys.capella.xmlpivot.extraction.XMLPivotExtractor;


import junit.framework.TestCase;

/**
 *
 */
public class XMLPivotExtractorTest extends TestCase {

	@Test
	public void testXMLPivotExtractor() throws Exception{
		XMLPivotExtractor.Builder extractor = new XMLPivotExtractor.Builder();
		extractor.projectName = "XMLPivotExtractorTest";
		extractor.genmodelName = "simplified.genmodel";
		extractor.reportModelName = "unmapped.report";
		extractor.genmodelBasePackage = "org.polarsys.capella.semantic.data";
		extractor.modelPluginClass = "corg.polarsys.capella.semantic.data.capellamodeller.CapellaModellerPlugin";
		extractor.editPluginClass = "org.polarsys.capella.semantic.data.capellamodeller.provider.CapellaymodellerEditPlugin";
		extractor.editorPluginClass = "org.polarsys.capella.semantic.data.capellamodeller.presentation.CapellamodellerEditorPlugin";
		extractor.pluginVersion = "1.0.0"; // TODO maybe derive this from source package version or the plugin that is providing it..
		extractor.sourcePackages = CapellaPackageRegistry.getAllCapellaPackages();
		extractor.bootstrap = true;
		extractor.build().extract();
	}
}
