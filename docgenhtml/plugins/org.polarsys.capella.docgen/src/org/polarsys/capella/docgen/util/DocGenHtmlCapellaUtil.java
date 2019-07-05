/*******************************************************************************
 * Copyright (c) 2006, 2019 THALES GLOBAL SERVICES.
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
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlConstants;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.IFileNameService;

import org.polarsys.capella.core.data.cs.ExchangeItemAllocation;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.helpers.fa.services.FunctionExt;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.oa.CommunicationMean;
import org.polarsys.capella.core.model.helpers.ComponentExchangeExt;
import org.polarsys.kitalpha.doc.gen.business.core.extension.page.PageExtensionRegistry;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlConstants;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.IFileNameService;

public class DocGenHtmlCapellaUtil {

//	class CapellaFileNameService implements IFileNameService {
//		public String getFileName(EObject eObject) {
//			EObject element;
//			element = eObject;
//			if (CapellaServices.isLinkable(eObject) == 1) {
//				if (eObject instanceof ExchangeItemAllocation) {
//					element = ((ExchangeItemAllocation) eObject).getAllocatingInterface();
//				} else if (eObject instanceof CommunicationMean) {
//					element = ((CommunicationMean) eObject).getSource();
//				} else if (eObject instanceof ComponentExchange) {
//					element = ComponentExchangeExt.getSourceComponent((ComponentExchange) eObject);
//				} else if (eObject instanceof FunctionalExchange) {
//					element = FunctionExt.getIncomingAbstractFunction(((FunctionalExchange) eObject));
//				} else {
//					element = eObject.eContainer();
//				}
//			}
//			String fileName = DocGenHtmlCapellaUtil.getFileName(element);
//			return DocGenHtmlUtil.getValidFileName(fileName);
//		}
//	}

	public static IFileNameService SERVICE = new CapellaFileNameService();

	public static String getFileName(EObject eObject) {
		if (eObject instanceof NamedElement) {
			NamedElement namedElement = (NamedElement) eObject;
			return getNamedElementRootFileName(namedElement);
		}
		if (eObject instanceof CapellaElement) {
			CapellaElement element = (CapellaElement) eObject;
			return getCapellaElementRootFileName(element);
		}
		return "";
	}

	/**
	 * File name definition for CapellaElement without extension
	 * 
	 * @param CapellaElement
	 * @return
	 */
	public static String getCapellaElementRootFileName(CapellaElement element) {

		StringBuffer buffer = new StringBuffer();

		buffer.append(element.getId());

		return DocGenHtmlUtil.getValidFileName(buffer.toString());
	}

	/**
	 * File name definition for CapellaElement
	 * 
	 * @param fileName
	 * @return
	 */
	public static String getCapellaElementFileName(CapellaElement element) {

		StringBuffer buffer = new StringBuffer(getCapellaElementRootFileName(element));
		buffer.append(DocGenHtmlConstants.DOT_CHARACTER).append(DocGenHtmlConstants.HTML_FILE_EXTENSION);

		return buffer.toString();
	}

	/**
	 * File name definition for NamedElement without extension
	 * 
	 * @param CapellaElement
	 * @return
	 */
	public static String getNamedElementRootFileName(CapellaElement element) {

		NamedElement namedElement = ((NamedElement) element);
		StringBuffer buffer = new StringBuffer();

		buffer.append(namedElement.getId());

		return DocGenHtmlUtil.getValidFileName(buffer.toString());
	}

	/**
	 * File name definition for NamedElement
	 * 
	 * @param fileName
	 * @return
	 */
	public static String getNamedElementFileName(CapellaElement element) {

		StringBuffer buffer = new StringBuffer(getNamedElementRootFileName(element));
		buffer.append(DocGenHtmlConstants.DOT_CHARACTER).append(DocGenHtmlConstants.HTML_FILE_EXTENSION);

		return buffer.toString();
	}

	/**
	 * Check whether given element will have children in side bar. This method
	 * is used for example to determine if we have to generate
	 * <code>&lsaquo;ul&rsaquo;&lsaquo;/ul&rsaquo;</code> tags.
	 * 
	 * @param element
	 *            the current element.
	 * @return true if has children otherwise false.
	 */
	public static boolean hasChildren(CapellaElement element) {
		for (EObject subElement : element.eContents()) {
			if (subElement instanceof CapellaElement && DocGenHtmlCapellaControl.isPageCandidate((CapellaElement) subElement)) {
				return true;
			} 
			if (PageExtensionRegistry.getInstance().isPageCandidate(subElement, "capella")) {
				return true;
			}
		}
		return false;
	}

}
