/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
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
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.data.modellingcore.AbstractExchangeItem;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.core.data.information.ExchangeItemElement;
import org.polarsys.capella.core.data.information.ExchangeMechanism;
import org.polarsys.capella.core.data.information.ParameterDirection;
import org.polarsys.capella.core.model.helpers.InterfaceExt;
import org.polarsys.capella.docgen.util.CapellaDataValueServices;
import org.polarsys.capella.docgen.util.CapellaLabelProviderHelper;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.docgen.util.StringUtil;

public class CapellaInterfaceHelper {

	private static String exchangeItemToString(String projectName, String outputFolder, ExchangeItem exchangeItem) {
		StringBuffer buffer = new StringBuffer();

		// exchange title
		buffer.append("<table style=\"border:0px;\"><tr><td style=\"border:0px; vertical-align:top; max-width:none; white-space: nowrap;\">");
		buffer.append(CapellaServices.getImageLinkFromElement(exchangeItem, projectName, outputFolder));
		buffer.append("&nbsp;");
		buffer.append("<strong id=\"" + CapellaServices.getAnchorId(exchangeItem) + "\">");
		buffer.append(CapellaServices.getHyperlinkFromElement(exchangeItem));
		buffer.append("</strong></td><td style=\"border:0px; max-width:none;\">");
		ExchangeItemElement returnElement = null;
		if (exchangeItem.getOwnedElements().size() > 0) {
			buffer.append(" (");
			Iterator<ExchangeItemElement> iterator = exchangeItem.getOwnedElements().iterator();
			while (iterator.hasNext()) {
				ExchangeItemElement currentTypedElement = iterator.next();
				if (currentTypedElement.getDirection().equals(ParameterDirection.RETURN)) {
					returnElement = currentTypedElement;
				} else {
					buffer.append(currentTypedElement.getDirection().getName());
					buffer.append(" <strong>");
					buffer.append(currentTypedElement.getName());
					buffer.append("</strong>");
					if (null != currentTypedElement.getOwnedMinCard() && null != currentTypedElement.getOwnedMaxCard()) {
						String min = CapellaDataValueServices.getSimpleValueOfDataValue(currentTypedElement.getOwnedMinCard());
						String max = CapellaDataValueServices.getSimpleValueOfDataValue(currentTypedElement.getOwnedMaxCard());
						if (!min.equals("1") || !max.equals("1")) {
							// Add the min cardinality to the buffer
							buffer.append("&nbsp;");
							buffer.append(CapellaServices.CRO_OPEN);
							buffer.append(min);
							buffer.append(", ");
							// Add the max cardinality to the buffer
							buffer.append(max);
							buffer.append(CapellaServices.CRO_CLOSE);
						}
					}
					if (currentTypedElement.getType() != null) {
						buffer.append(": ");
						buffer.append(CapellaServices.getFullDataPkgHierarchyLink(currentTypedElement.getType()));
					} else {
						buffer.append(": &lt;undefined&gt;");
					}
					if (iterator.hasNext()) {
						buffer.append(", <br />");
					}
				}
			}
			buffer.append(")");
		}
		buffer.append("</td></tr>");
		if (returnElement != null) {
			buffer.append("<tr><td style=\"border:0px; max-width:none;\"></td><td style=\"border:0px; max-width:none;\">");
			buffer.append("RETURN ");
			buffer.append(returnElement.getName());
			if (returnElement.getType() != null) {
				buffer.append(":");
				buffer.append(CapellaServices.getFullDataPkgHierarchyLink(returnElement.getType()));
			}
			buffer.append("</td></tr>");
		}
		buffer.append("</table>");
		// summary and description
		if (exchangeItem.getSummary() != null && exchangeItem.getSummary().length() > 0) {
			buffer.append("\n<br />");
			buffer.append(exchangeItem.getSummary());
		}

		if (exchangeItem.getDescription() != null && exchangeItem.getDescription().length() > 0) {
			buffer.append("\n<br />");
			buffer.append(StringUtil.transformAREFString(exchangeItem, exchangeItem.getDescription(), projectName, outputFolder));
		}

		// exchange item elements
		Collection<String> exchangeItemElementStrings = new ArrayList<String>();
		for (ExchangeItemElement exchangeItemElement : exchangeItem.getOwnedElements()) {
			exchangeItemElementStrings.add(CapellaExchangeItemElementHelper.exchangeItemElementToString(exchangeItemElement, projectName, outputFolder));

		}
		if (exchangeItemElementStrings.size() > 0) {
			buffer.append(StringUtil.stringListToBulette(exchangeItemElementStrings));
		}

		return buffer.toString();
	}

	/**
	 * 
	 * @param interface1
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getProvidedBy(Interface interface1, String projectName, String outputFolder) {
		Collection<String> ret = new ArrayList<String>();
		for (ComponentPort componentPort : InterfaceExt.getProvidedByPorts(interface1)) {
			EObject componentEObject = componentPort.eContainer();
			if (componentEObject instanceof Component) {
				ret.add(componentToString(projectName, outputFolder, componentPort, componentEObject));
			}
		}
		return ret;

	}

	/**
	 * 
	 * @param interface1
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getImplementedBy(Interface interface1, String projectName, String outputFolder) {
		Collection<String> ret = new ArrayList<String>();
		for (Component component : interface1.getImplementorComponents()) {
			ret.add(componentToString(projectName, outputFolder, component));
		}
		return ret;

	}

	/**
	 * 
	 * @param interface1
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getRequiredBy(Interface interface1, String projectName, String outputFolder) {
		Collection<String> ret = new ArrayList<String>();
		for (ComponentPort componentPort : InterfaceExt.getRequiredByPorts(interface1)) {
			EObject componentEObject = componentPort.eContainer();
			if (componentEObject instanceof Component) {
				ret.add(componentToString(projectName, outputFolder, componentPort, componentEObject));
			}
		}
		return ret;

	}

	/**
	 * 
	 * @param interface1
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getUsedBy(Interface interface1, String projectName, String outputFolder) {
		Collection<String> ret = new ArrayList<String>();
		for (Component component : interface1.getUserComponents()) {
			ret.add(componentToString(projectName, outputFolder, component));
		}
		return ret;

	}

	private static String componentToString(String projectName, String outputFolder, EObject componentEObject) {
		return componentToString(projectName, outputFolder, null, componentEObject);
	}

	private static String componentToString(String projectName, String outputFolder, ComponentPort componentPort, EObject componentEObject) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(CapellaServices.getImageLinkFromElement(componentEObject, projectName, outputFolder));
		buffer.append(" ");
		buffer.append(CapellaServices.getHyperlinkFromElement(componentEObject));
		if (componentPort != null) {
			buffer.append(" ");
			buffer.append("(");
			buffer.append(CapellaLabelProviderHelper.getText(componentPort));
			buffer.append(")");
		}
		return buffer.toString();
	}

	/**
	 * 
	 * @param interface1
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getOperationExchangeItems(Interface interface1, String projectName, String outputFolder) {
		return getExchangeItems(interface1, projectName, outputFolder, ExchangeMechanism.OPERATION_VALUE);
	}

	/**
	 * 
	 * @param interface1
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getSharedDataExchangeItems(Interface interface1, String projectName, String outputFolder) {
		return getExchangeItems(interface1, projectName, outputFolder, ExchangeMechanism.SHARED_DATA_VALUE);
	}

	/**
	 * 
	 * @param interface1
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getEventExchangeItems(Interface interface1, String projectName, String outputFolder) {
		return getExchangeItems(interface1, projectName, outputFolder, ExchangeMechanism.EVENT_VALUE);
	}

	/**
	 * 
	 * @param interface1
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getFlowExchangeItems(Interface interface1, String projectName, String outputFolder) {
		return getExchangeItems(interface1, projectName, outputFolder, ExchangeMechanism.FLOW_VALUE);
	}

	/**
	 * 
	 * @param interface1
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getUnsetExchangeItems(Interface interface1, String projectName, String outputFolder) {
		return getExchangeItems(interface1, projectName, outputFolder, ExchangeMechanism.UNSET_VALUE);
	}

	/**
	 * 
	 * @param interface1
	 * @param projectName
	 * @param outputFolder
	 * @param exchangeMechanismValue
	 * @return
	 */
	public static Collection<String> getExchangeItems(Interface interface1, String projectName, String outputFolder, int exchangeMechanismValue) {

		Collection<String> exchangeItems = new ArrayList<String>();
		for (AbstractExchangeItem currentExchangeItem : interface1.getExchangeItems()) {
			if (currentExchangeItem instanceof ExchangeItem && ((ExchangeItem) currentExchangeItem).getExchangeMechanism().getValue() == exchangeMechanismValue) {
				exchangeItems.add(exchangeItemToString(projectName, outputFolder, (ExchangeItem) currentExchangeItem));
			}
		}

		return exchangeItems;
	}
}
