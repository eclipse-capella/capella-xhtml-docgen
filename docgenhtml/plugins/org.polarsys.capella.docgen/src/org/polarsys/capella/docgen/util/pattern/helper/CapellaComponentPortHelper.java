/*******************************************************************************
 * Copyright (c) 2006, 2021 THALES GLOBAL SERVICES.
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
import java.util.HashMap;
import java.util.Map;

import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeKind;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.docgen.util.StringUtil;

public class CapellaComponentPortHelper {
	
	private CapellaComponentPortHelper() {}
	
	/**
	 * Get the provided interfaces of a ComponentPort as html
	 * 
	 * @param component
	 * @param projectName
	 * @param outputFolder
	 * @return the provided interfaces as Map of Interface Name and List of Exchange Items
	 */
	public static Map<String, String> getProvidedInterfaces(ComponentPort component, String projectName,
	    String outputFolder) {
		final Map<String, String> providedInterfaces = new HashMap<>();
		for (Interface modelInterface : component.getProvidedInterfaces()) {
			String interfaceString = CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, modelInterface);
			String interfaceExchangeItems = getInterfaceExchangeItemsAsList(modelInterface, projectName, outputFolder);
			providedInterfaces.put(interfaceString, interfaceExchangeItems);
		}
		return providedInterfaces;
	}

	/**
	 * Get the required interfaces of a componentPort as html
	 * 
	 * @param component
	 * @param projectName
	 * @param outputFolder
	 * @return the required interfaces as Map of Interface Name and List of Exchange Items
	 */
	public static Map<String, String> getRequiredInterfaces(ComponentPort component, String projectName,
	    String outputFolder) {
		final Map<String, String> requiredInterfaces = new HashMap<>();
		for (Interface modelInterface : component.getRequiredInterfaces()) {
			String interfaceString = CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, modelInterface);
			String interfaceExchangeItems = getInterfaceExchangeItemsAsList(modelInterface, projectName, outputFolder);
			requiredInterfaces.put(interfaceString, interfaceExchangeItems);
		}
		return requiredInterfaces;
	}

	/**
	 * Get the exchangeItems of an interface as html
	 * 
	 * @param modelInterface
	 * @param projectName
	 * @param outputFolder
	 * @return the exchange items of an interface as class generatedList
	 */
	private static String getInterfaceExchangeItemsAsList(Interface modelInterface, String projectName,
	    String outputFolder) {
		StringBuilder buffer = new StringBuilder();
		if (!modelInterface.getExchangeItems().isEmpty()) {
			buffer.append(CapellaServices.UL_OPEN);
			for (ExchangeItem exchangeItem : modelInterface.getExchangeItems()) {
				buffer.append("<li>");
				buffer.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, exchangeItem));
				buffer.append("</li>");
			}
			buffer.append(CapellaServices.UL_CLOSE);
		}
		return buffer.toString();
	}

	/**
	 * Get the componentExchanges of a ComponentPort as HTML
	 * 
	 * @param modelInterface
	 * @param projectName
	 * @param outputFolder
	 * @return the exchanges
	 */
	public static Collection<ComponentExchange> getComponentPortExchanges(ComponentPort componentPort) {
		return getComponentPortExchanges(componentPort, null, null);
	}

	/**
	 * Get the componentExchanges of a ComponentPort as HTML
	 * 
	 * @param modelInterface
	 * @deprecated @param projectName
	 * @deprecated @param outputFolder
	 * @return the exchanges
	 * @deprecated Will be removed in a future release to simplify its interface. Prefer {@linkplain CapellaComponentPortHelper.getComponentPortExchanges(ComponentPort)}.
	 */
	@Deprecated
	public static Collection<ComponentExchange> getComponentPortExchanges(ComponentPort componentPort, String projectName,
	    String outputFolder) {
		return deleteDelegations(componentPort.getComponentExchanges());
	}

	/**
	 * Get the component Delegations of a ComponentPort as HTML
	 * 
	 * @param modelInterface
	 * @param projectName
	 * @param outputFolder
	 * @return the delegations
	 */
	public static Collection<ComponentExchange> getComponentPortDelegations(ComponentPort componentPort) {
		return getComponentPortDelegations(componentPort, null, null);
	}

	/**
	 * Get the component Delegations of a ComponentPort as HTML
	 * 
	 * @param modelInterface
	 * @deprecated @param projectName
	 * @deprecated @param outputFolder
	 * @return the delegations
	 * @deprecated Will be removed in a future release to simplify its interface. Prefer {@linkplain CapellaComponentPortHelper.getComponentPortExchanges(ComponentPort)}.
	 */
	@Deprecated
	public static Collection<ComponentExchange> getComponentPortDelegations(ComponentPort componentPort,
	    String projectName, String outputFolder) {
		return extractDelegations(componentPort.getComponentExchanges());
	}

	public static String getComponentPortString(ComponentPort port, String projectName, String outputFolder) {
		return CapellaServices.buildNameWithIcon(projectName, outputFolder, port);
	}

	public static String componentExchangeToTableLine(ComponentPort currentComponentPort,
	    ComponentExchange componentExchange, String projectName, String outputFolder) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(CapellaServices.TR_OPEN);
		stringBuilder.append("<td id=\"" + CapellaServices.getAnchorId(componentExchange) + "\">");
		stringBuilder.append(CapellaServices.getImageLinkFromElement(componentExchange, projectName, outputFolder));
		stringBuilder.append(" ");
		stringBuilder.append(CapellaServices.getHyperlinkFromElement(componentExchange));
		stringBuilder.append(CapellaServices.TD_CLOSE);

		ModelElement sourceTargetComponentPort = getOppositeComponentPort(currentComponentPort, componentExchange);
		if (sourceTargetComponentPort != null) {
			ModelElement sourceTargetComponent = (ModelElement) sourceTargetComponentPort.eContainer();
			stringBuilder.append(CapellaServices.TD_OPEN);
			stringBuilder.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, sourceTargetComponentPort));
			stringBuilder.append(CapellaServices.TD_CLOSE);
			if (sourceTargetComponent != null) {
				stringBuilder.append(CapellaServices.TD_OPEN);
				stringBuilder.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, sourceTargetComponent));
				stringBuilder.append(CapellaServices.TD_CLOSE);
			}
		}

		stringBuilder.append(CapellaServices.TD_OPEN);
		stringBuilder.append(getDescription(componentExchange, projectName, outputFolder));
		stringBuilder.append(CapellaServices.TD_CLOSE);
		stringBuilder.append(CapellaServices.TR_CLOSE);
		return stringBuilder.toString();
	}

	/**
	 * Suppress all delegations
	 * 
	 * @param componentExchanges
	 * @return list containing no delegation
	 */
	private static Collection<ComponentExchange> deleteDelegations(Collection<ComponentExchange> componentExchanges) {
		final Collection<ComponentExchange> newComponentExchanges = new ArrayList<>(componentExchanges);
		for (ComponentExchange currentComponentExchange : componentExchanges) {
			if (currentComponentExchange.getKind().getValue() == ComponentExchangeKind.DELEGATION_VALUE) {
				newComponentExchanges.remove(currentComponentExchange);
			}
		}
		return newComponentExchanges;
	}

	/**
	 * Keep only the delegations
	 * 
	 * @param componentExchanges
	 * @return list containing only delegations
	 */
	private static Collection<ComponentExchange> extractDelegations(Collection<ComponentExchange> componentExchanges) {
		final Collection<ComponentExchange> newComponentExchanges = new ArrayList<>(componentExchanges);
		for (ComponentExchange currentComponentExchange : componentExchanges) {
			if (currentComponentExchange.getKind().getValue() != ComponentExchangeKind.DELEGATION_VALUE) {
				newComponentExchanges.remove(currentComponentExchange);
			}
		}
		return newComponentExchanges;
	}

	private static Object getDescription(ComponentExchange componentExchange, String projectName, String outputFolder) {
		if (componentExchange.getDescription() != null)
			return StringUtil.transformAREFString(componentExchange, componentExchange.getDescription(), projectName,
			    outputFolder);
		return "";
	}

	private static ModelElement getOppositeComponentPort(ComponentPort currentComponentPort,
	    ComponentExchange componentExchange) {
		if (componentExchange.getSourcePort() != currentComponentPort) {
			return componentExchange.getSourcePort();
		}
		return componentExchange.getTargetPort();
	}

}