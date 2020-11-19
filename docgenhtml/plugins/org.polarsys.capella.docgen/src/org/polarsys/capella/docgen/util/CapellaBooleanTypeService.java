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
import org.polarsys.capella.core.data.information.datatype.BooleanType;
import org.polarsys.capella.core.data.information.datavalue.DataValue;

/**
 * 
 */
public class CapellaBooleanTypeService {
	/**
	 * <b>Get the literal list</b>
	 * <p>
	 * Get the list of literal value of a BooleanType
	 * 
	 * @param eObj_p
	 * @return
	 */
	public static List<String> getLiterals(EObject eObj_p, String projectName,
			String outputFolder) {
		// Initialize a String list
		List<String> ret = new ArrayList<String>();
		if (eObj_p instanceof BooleanType) {
			// For each Literal values
			for (DataValue dataValue : ((BooleanType) eObj_p)
					.getOwnedLiterals()) {
				// Add the information of the literal value to the list
				ret.add(CapellaDataValueServices.getDataValueInformation(
						dataValue, projectName, outputFolder));
			}
		}
		return ret;
	}

}
