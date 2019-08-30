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

/**
 * @author Boubekeur Zendagui
 */
public class CapellaDocgenPreferenceHelper {
	
	/**
	 * @return The value of the preference {@link CapellaDocgenPreferenceConstant#DOCGEN_EXPORT__STATUS_AND_REVIEW} 
	 */
	public static boolean isExportStatusAndReview(){
		return getCustomizedBooleanValue(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__STATUS_AND_REVIEW);
	}
	
	/**
	 * @return The value of the preference {@link CapellaDocgenPreferenceConstant#DOCGEN_EXPORT__COMPONENT_EXCHANGE} 
	 */
	public static boolean isExportComponentExchange(){
		return getCustomizedBooleanValue(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__COMPONENT_EXCHANGE);
	}
	
	/**
	 * @return The value of the preference {@link CapellaDocgenPreferenceConstant#DOCGEN_EXPORT__PHYSICAL_LINK} 
	 */
	public static boolean isExportPhysialLink(){
		return getCustomizedBooleanValue(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__PHYSICAL_LINK);
	}
	
	/**
	 * @return The value of the preference {@link CapellaDocgenPreferenceConstant#DOCGEN_EXPORT__FUNCTIONAL_EXCHANGE} 
	 */
	public static boolean isExportFunctionalExchange(){
		return getCustomizedBooleanValue(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__FUNCTIONAL_EXCHANGE);
	}
	
	/**
	 * Get a string value of a preference
	 * @param preferenceName name of a preference
	 * @return the value of a preference
	 */
	private static boolean getCustomizedBooleanValue(String preferenceName){
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		return store.getBoolean(preferenceName);
	}
	
	/**
	 * Set default values of preference.
	 */
	public static void setDefaultValues(){
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__STATUS_AND_REVIEW, 
				CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__STATUS_AND_REVIEW_DEFAULT_VALUE);
		store.setDefault(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__COMPONENT_EXCHANGE, 
				CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__COMPONENT_EXCHANGE_DEFAULT_VALUE);
		store.setDefault(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__FUNCTIONAL_EXCHANGE,
				CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__FUNCTIONAL_EXCHANGE_DEFAULT_VALUE);
		store.setDefault(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__PHYSICAL_LINK, 
				CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__PHYSICAL_LINK_DEFAULT_VALUE);
	}
	
	/**
	 * Restore default values of preference.
	 */
	public static void restoreDefaultValues(){
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setValue(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__STATUS_AND_REVIEW, 
				CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__STATUS_AND_REVIEW_DEFAULT_VALUE);
		store.setValue(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__COMPONENT_EXCHANGE, 
				CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__COMPONENT_EXCHANGE_DEFAULT_VALUE);
		store.setValue(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__FUNCTIONAL_EXCHANGE,
				CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__FUNCTIONAL_EXCHANGE_DEFAULT_VALUE);
		store.setValue(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__PHYSICAL_LINK, 
				CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__PHYSICAL_LINK_DEFAULT_VALUE);
	}
}
