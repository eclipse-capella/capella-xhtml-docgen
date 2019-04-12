/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
	
	public static String edgeToTableLine(NamedElement edge, String projectName, String outputFolder) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<tr>");
		buffer.append("<td id=\"" + CapellaServices.getAnchorId(edge) + "\">");
		
		// provide element name
		buffer.append(CapellaServices.getImageLinkFromElement(edge, projectName, outputFolder));
		buffer.append(" ");
		NamedElement ne = (NamedElement) edge;
		buffer.append(ne.getName());
		buffer.append("</td><td>");
		
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
		buffer.append(CapellaServices.getImageLinkFromElement(source, projectName, outputFolder));
		buffer.append(" ");
		buffer.append(CapellaServices.getHyperlinkFromElement(source));
		buffer.append("</td><td>");
		
		// display target element
		buffer.append(CapellaServices.getImageLinkFromElement(target, projectName, outputFolder));
		buffer.append(" ");
		buffer.append(CapellaServices.getHyperlinkFromElement(target));
		buffer.append("</td><td>");
		
		// provide description
		if (edge.getDescription() != null) {
			buffer.append(StringUtil.transformAREFString(edge, edge.getDescription(), projectName, outputFolder));
		} else {
			buffer.append("");
		}
		buffer.append("</td></tr>");
		return buffer.toString();
	}
}
