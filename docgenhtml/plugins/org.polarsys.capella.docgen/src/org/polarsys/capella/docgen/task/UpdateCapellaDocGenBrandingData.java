/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
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
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenBrandingPreferenceConstant;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenBrandingPreferencesHelper;

/**
 * 
 */
public class UpdateCapellaDocGenBrandingData implements ITaskProduction {
	
	// Contracts names
	private static final String COPYRIGHT_CONTRACT = "copyright"; //$NON-NLS-0$
	private static final String LOGO_PATH_CONTRACT = "logo.path"; //$NON-NLS-0$
	private static final String LOGO_ALT_CONTRACT = "logo.alt"; //$NON-NLS-0$
	
	// Capella default values 
	private static final String LOGO_PATH_CAPELLA_DEFAULT_VALUE  = 
								"platform:/plugin/org.polarsys.capella.docgen.ui/icons/intro-capella.png"; //$NON-NLS-0$
	
	private static final String LOGO_ALT_CAPELLA_DEFAULT_VALUE = "[Capella Logo]"; //$NON-NLS-0$
	
	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		String copyright = productionContext.getInputValue(COPYRIGHT_CONTRACT, String.class);
		String logo_path = productionContext.getInputValue(LOGO_PATH_CONTRACT, String.class);
		String logo_alt = productionContext.getInputValue(LOGO_ALT_CONTRACT, String.class);
		DocumentationBrandingData.getInstance().removeAllData();
		
		// Initialize Branding data for the current generation
		if (copyright != null)
			productionContext.setOutputValue(COPYRIGHT_CONTRACT, copyright);

		if (doChangeCapellaLogoPath(logo_path))
		{
			productionContext.setOutputValue(LOGO_PATH_CONTRACT, LOGO_PATH_CAPELLA_DEFAULT_VALUE);
		}
		else
		{
			productionContext.setOutputValue(LOGO_PATH_CONTRACT, logo_path);
		}
			
		
		if (doChangeCapellaLogoAlt(logo_alt))
		{
			productionContext.setOutputValue(LOGO_ALT_CONTRACT, LOGO_ALT_CAPELLA_DEFAULT_VALUE);
		}
		else
		{
			productionContext.setOutputValue(LOGO_ALT_CONTRACT, logo_alt);
		}
	}
	
	private boolean doChangeCapellaLogoPath(String currentLogoPath){
		Object defaultLogoPath = DocgenBrandingPreferenceConstant.DOCGEN_BRANDING_LOGO_PATH_DEFAULT_VALUE;
		Object preferenceLogoPath = DocgenBrandingPreferencesHelper.getLogoPath();
		if (currentLogoPath != null)
			return currentLogoPath.equals(defaultLogoPath) && preferenceLogoPath.equals(defaultLogoPath);
		else
			return preferenceLogoPath.equals(defaultLogoPath);
	}
	
	private boolean doChangeCapellaLogoAlt(String currentLogoAlt){
		Object defaultLogoAlt = DocgenBrandingPreferenceConstant.DOCGEN_BRANDING_LOGO_ALT_DEFAULT_VALUE;
		Object preferenceLogoAlt = DocgenBrandingPreferencesHelper.getLogoAlternateText();
		if (currentLogoAlt != null)
			return currentLogoAlt.equals(defaultLogoAlt) && preferenceLogoAlt.equals(defaultLogoAlt);
		else
			return preferenceLogoAlt.equals(defaultLogoAlt);
	}

	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
	}
	
	@Override
	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
	}

}
