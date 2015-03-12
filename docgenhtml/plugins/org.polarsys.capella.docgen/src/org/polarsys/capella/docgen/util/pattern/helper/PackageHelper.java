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

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.docgen.util.DocGenHtmlCapellaControl;

public class PackageHelper {

	public static Collection<String> getContent(org.polarsys.capella.core.data.capellacore.Structure structure, String projectName, String outputFolder) {
		Collection<String> ret = new ArrayList<String>();
		for (EObject current : structure.eContents()) {
			if (current instanceof CapellaElement && DocGenHtmlCapellaControl.isPageCandidate((CapellaElement) current)) {
				StringBuffer buffer = new StringBuffer();
				buffer.append(CapellaServices.getImageLinkFromElement(current, projectName, outputFolder));
				buffer.append(" ");
				buffer.append(CapellaServices.getHyperlinkFromElement(current));
				ret.add(buffer.toString());
			}
		}
		return ret;
	}
}
