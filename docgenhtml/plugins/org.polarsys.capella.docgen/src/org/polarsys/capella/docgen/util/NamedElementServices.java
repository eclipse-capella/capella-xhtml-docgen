/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
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
import org.polarsys.capella.common.data.modellingcore.AbstractConstraint;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.Constraint;
import org.polarsys.capella.core.linkedtext.ui.CapellaEmbeddedLinkedTextEditorInput;

/**
 * 
 */
public class NamedElementServices {

	/**
	 * <b>Get Constraint</b>
	 * <p>
	 * Get the constraint of an Element
	 * 
	 * @param eObj_p
	 * @return
	 */
	public static List<String> getConstraint(EObject eObj_p) {
		// Create a list of string to return
		List<String> ret = new ArrayList<String>();
		// Test if the object is a CapellaElement
		if (eObj_p instanceof CapellaElement) {
			CapellaElement elt = (CapellaElement) eObj_p;
			// For each constraint
			for (AbstractConstraint cons : ((CapellaElement) elt).getConstraints()) {
				if (cons instanceof Constraint) {
					// Typing the element
					Constraint constraint = (Constraint) cons;
					// Initialize a string buffer
					StringBuffer buffer = new StringBuffer();
					// Add the name to the buffer
					buffer.append(constraint.getName());
					buffer.append(CapellaServices.VALUE_PRESENTER);
					// Add the content of the constraint to the buffer
					// FIXME: (Check result) Handle the following API change
					buffer.append(CapellaEmbeddedLinkedTextEditorInput.getDefaultText(constraint));
					ret.add(buffer.toString());
				}
			}
		}
		return ret;
	}
}
