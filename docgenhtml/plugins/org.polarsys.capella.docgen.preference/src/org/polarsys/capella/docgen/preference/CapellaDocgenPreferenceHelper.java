/*******************************************************************************
 * Copyright (c) 2019 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.docgen.preference;

import org.eclipse.jface.preference.IPreferenceStore;
import org.polarsys.kitalpha.doc.gen.business.core.preference.Activator;

public class CapellaDocgenPreferenceHelper {
	
	public final static IPreferenceStore STORE =  Activator.getDefault().getPreferenceStore();
	
	/**
	 * @return The value of the preference STATUS_AND_REVIEW
	 */
	public static boolean isExportStatusAndReview(){
		return getCustomizedBooleanValue(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__STATUS_AND_REVIEW);
	}
	
	/**
	 * Set STATUS_AND_REVIEW preference to it default value.
	 */
	public static void restorDefautCopyrightDefaultValues(){
		STORE.setDefault(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__STATUS_AND_REVIEW, 
				CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__STATUS_AND_REVIEW_DEFAULT_VALUE);
	}
	
	/**
	 * Get a string value of a preference
	 * @param preferenceName name of a preference
	 * @return the value of a preference
	 */
	private static boolean getCustomizedBooleanValue(String preferenceName){
		return STORE.getBoolean(preferenceName);
	}
}
