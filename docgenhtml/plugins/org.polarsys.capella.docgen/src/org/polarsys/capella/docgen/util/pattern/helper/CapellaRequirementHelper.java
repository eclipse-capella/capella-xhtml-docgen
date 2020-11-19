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
package org.polarsys.capella.docgen.util.pattern.helper;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.requirement.Requirement;
import org.polarsys.capella.common.data.modellingcore.AbstractTrace;
import org.polarsys.capella.docgen.util.CapellaServices;

public class CapellaRequirementHelper {

	public static Collection<String> getTracingModelElements(Requirement requirement, String projectName, String outputFolder) {
		Collection<String> elementsToDisplay = new ArrayList<String>();
		for (AbstractTrace trace : requirement.getIncomingTraces()) {
			EObject element = trace.getSourceElement();
			if (element != null) {
				StringBuffer buffer = new StringBuffer();
				buffer.append(CapellaServices.getImageLinkFromElement(element, projectName, outputFolder));
				buffer.append(" ");
				buffer.append(CapellaServices.getHyperlinkFromElement(element));
				elementsToDisplay.add(buffer.toString());
			}

		}

		return elementsToDisplay;
	}
}
