/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.docgen.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.polarsys.kitalpha.doc.gen.business.core.branding.DocumentationBrandingData;
import org.polarsys.kitalpha.doc.gen.business.core.branding.DocumentationBrandingDefaultData;

/**
 * 
 */
public class InitializeCapellaDocGenBrandingData implements ITaskProduction {
	
	private static final String COPYRIGHT_CONTRACT = "copyright";
	private static final String LOGO_PATH_CONTRACT = "logo.path";
	private static final String LOGO_ALT_CONTRACT = "logo.alt";
	
	private static final String COPYRIGHT_KEY = "copyright";
	private static final String LOGO_PATH_KEY  = "logoPath";
	private static final String LOGO_ALT_KEY  = "logoAlt";
	
	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		String copyright = productionContext.getInputValue(COPYRIGHT_CONTRACT, String.class);
		String logo_path = productionContext.getInputValue(LOGO_PATH_CONTRACT, String.class);
		String logo_alt = productionContext.getInputValue(LOGO_ALT_CONTRACT, String.class);
		DocumentationBrandingData documentationBrandingData = DocumentationBrandingData.getInstance();
		// Remove branding data initialized by previous generation 
		documentationBrandingData.removeAllData();
		
		// Initialize Branding data for the current generation
		if (copyright != null && copyright.isEmpty() == false)
			documentationBrandingData.addData(COPYRIGHT_KEY, copyright);
		
		if (logo_path != null && logo_path.isEmpty() == false)
			documentationBrandingData.addData(LOGO_PATH_KEY, logo_path);
		else
		{
			// Make "intro-capella.png" file the default logo for Capella documentation generations 
			Object defaultLogo = DocumentationBrandingDefaultData.getDefaultData("logoPath");
			Object currentLogoPath = documentationBrandingData.getData("logoPath");
			if (currentLogoPath.equals(defaultLogo))
			{
				documentationBrandingData.addData(LOGO_PATH_KEY, "platform:/plugin/org.polarsys.kitalpha.doc.gen.business.capella.ui/icons/intro-capella.png");
			}
		}
		
		if (logo_alt != null && logo_alt.isEmpty() == false)
			documentationBrandingData.addData(LOGO_ALT_KEY, logo_alt);
	}

	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
	}
	
	@Override
	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
	}

}
