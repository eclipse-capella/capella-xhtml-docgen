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
