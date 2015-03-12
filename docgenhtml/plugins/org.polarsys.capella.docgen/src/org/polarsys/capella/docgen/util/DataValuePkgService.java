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
package org.polarsys.capella.docgen.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.information.datavalue.DataValue;
import org.polarsys.capella.core.data.information.datavalue.DataValueContainer;

/**
 * 
 */
public class DataValuePkgService {
	/**
	 * <b>Get the datavalue of an element</b>
	 * <p>
	 * Get the datavalue informations of an element
	 * 
	 * @param eObj_p
	 * @return
	 */
	public static List<String> getDataValues(EObject eObj_p, String projectName, String outputFolder) {
		List<String> ret = new ArrayList<String>();

		if (eObj_p instanceof DataValueContainer) {
			// For each datavalues
			for (DataValue data : ((DataValueContainer) eObj_p).getOwnedDataValues()) {
				// Add the hyper link to the list
				ret.add(CapellaDataValueServices.getDataValueInformation(data, projectName, outputFolder));
			}
		}
		return ret;
	}

}
