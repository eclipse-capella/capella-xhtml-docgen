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
package org.polarsys.capella.docgen.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.information.datavalue.DataValue;
import org.polarsys.capella.core.data.information.datavalue.DataValueContainer;

public class CapellaDataValuePkgService {
	/**
	 * <b>Get the Data Value</b>
	 * <p>
	 * Get the information of all data value of a DataValuePkg
	 * 
	 * @param eObject_p
	 * @return
	 */
	public static List<String> getDataValues(EObject eObject_p, String projectName, String outputFolder) {
		// Create the list to return
		List<String> ret = new ArrayList<String>();

		// If the Object is a Class
		if (eObject_p instanceof DataValueContainer) {
			for (DataValue dataValue : ((DataValueContainer) eObject_p).getOwnedDataValues()) {
				// Add the information of the data value to the list
				ret.add(CapellaDataValueServices.getDataValueInformation(dataValue, projectName, outputFolder));
			}
		}
		return ret;
	}
}
