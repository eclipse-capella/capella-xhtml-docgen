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

import org.polarsys.capella.core.data.capellacore.GeneralizableElement;
import org.polarsys.capella.core.data.capellacore.impl.GeneralizableElementImpl;

/**
 * 
 */
public class GeneralizableElementServices {
	/**
	 * <b>Get the list of subclasses of a class</b>
	 * <p>
	 * Get the list of subclasses of a class
	 * 
	 * @param eObject_p
	 * @return
	 */
	public static List<String> getClassInheritedBy(EObject eObject_p, String projectName, String outputFolder) {
		// Create the list to return
		List<String> ret = new ArrayList<String>();
		// If eObject is a Class
		if (eObject_p instanceof GeneralizableElementImpl) {
			// For each sub Generalizable Element
			for (GeneralizableElement elt : ((GeneralizableElementImpl) eObject_p).getSub()) {
				// If the element is a Class
				if (elt instanceof GeneralizableElementImpl) {
					// Add the class to the list to return
					ret.add(CapellaServices.getImageLinkFromElement(elt, projectName, outputFolder) + " " + CapellaServices.getFullDataPkgHierarchyLink(elt));
				}
			}
		}
		return ret;
	}

	/**
	 * <b>Get the list of super classes of a class</b>
	 * <p>
	 * Get the list of super classes of a class
	 * 
	 * @param eObject_p
	 * @return
	 */
	public static List<String> getClassInheritingFrom(EObject eObject_p, String projectName, String outputFolder) {
		// Create the list to return
		List<String> ret = new ArrayList<String>();

		if (eObject_p instanceof GeneralizableElementImpl) {
			// For each super Generalizable Element
			for (GeneralizableElement elt : ((GeneralizableElementImpl) eObject_p).getSuper()) {
				// If the element is a Class
				if (elt instanceof GeneralizableElementImpl) {
					// Add the class to the list to return
					ret.add(CapellaServices.getImageLinkFromElement(elt, projectName, outputFolder) + " " + CapellaServices.getFullDataPkgHierarchyLink(elt));
				}
			}
		}
		return ret;
	}

}
