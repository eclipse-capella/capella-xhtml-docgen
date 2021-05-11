/*******************************************************************************
 * Copyright (c) 2019, 2021 THALES GLOBAL SERVICES.
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

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.FunctionalExchange;

public class CapellaCategoryServices {
	
	private static final String TD_TD = "</td><td>";

	private CapellaCategoryServices() {}
	
	public static String edgeToTableLine(NamedElement edge, String projectName, String outputFolder) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<tr>");
		stringBuilder.append("<td id=\"" + CapellaServices.getAnchorId(edge) + "\">");
		
		// provide element name
		stringBuilder.append(CapellaServices.getImageLinkFromElement(edge, projectName, outputFolder));
		stringBuilder.append(" ");
		NamedElement ne = edge;
		stringBuilder.append(ne.getName());
		stringBuilder.append(TD_TD);
		
		// get source & target elements
		EObject source = null;
		EObject target = null;
		if (edge instanceof FunctionalExchange) {
			FunctionalExchange fe = (FunctionalExchange) edge;
			source = fe.getSource().eContainer();
			target = fe.getTarget().eContainer();
		} else if (edge instanceof ComponentExchange) {
			ComponentExchange ce = (ComponentExchange) edge;
			source = ce.getSource().eContainer();
			target = ce.getTarget().eContainer();
		} else if (edge instanceof PhysicalLink) {
			PhysicalLink pl = (PhysicalLink) edge;
			source = pl.getSourcePhysicalPort().eContainer();
			target = pl.getTargetPhysicalPort().eContainer();
		}
		
		// display source element
		stringBuilder.append(CapellaServices.getImageLinkFromElement(source, projectName, outputFolder));
		stringBuilder.append(" ");
		stringBuilder.append(CapellaServices.getHyperlinkFromElement(source));
		stringBuilder.append(TD_TD);
		
		// display target element
		stringBuilder.append(CapellaServices.getImageLinkFromElement(target, projectName, outputFolder));
		stringBuilder.append(" ");
		stringBuilder.append(CapellaServices.getHyperlinkFromElement(target));
		stringBuilder.append(TD_TD);
		
		// provide description
		if (edge.getDescription() != null) {
			stringBuilder.append(StringUtil.transformAREFString(edge, edge.getDescription(), projectName, outputFolder));
		} else {
			stringBuilder.append("");
		}
		stringBuilder.append("</td></tr>");
		return stringBuilder.toString();
	}
}
