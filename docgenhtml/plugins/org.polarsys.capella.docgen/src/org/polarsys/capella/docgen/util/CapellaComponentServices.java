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
package org.polarsys.capella.docgen.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.data.modellingcore.AbstractExchangeItem;
import org.polarsys.capella.common.data.modellingcore.InformationsExchanger;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.core.data.capellacore.Feature;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeEnd;
import org.polarsys.capella.core.data.fa.ComponentExchangeKind;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.fa.OrientationPortKind;
import org.polarsys.capella.core.data.information.Port;
import org.polarsys.capella.core.model.helpers.ComponentExt;
import org.polarsys.capella.core.model.helpers.InterfaceExt;

public class CapellaComponentServices {

	private CapellaComponentServices() {}
	
	public static Collection<ComponentExchange> getIncomingComponentExchanges(Component element) {
		Collection<ComponentExchange> componentExchanges = new ArrayList<>();
		for (Feature currentFeature : element.getOwnedFeatures()) {
			if (currentFeature instanceof ComponentPort && ((ComponentPort) currentFeature).getOrientation().getValue() == OrientationPortKind.IN_VALUE)
				componentExchanges.addAll(((ComponentPort) currentFeature).getComponentExchanges());
		}
		return deleteDelegations(componentExchanges);
	}

	public static Collection<ComponentExchange> getOutgoingComponentExchanges(Component element) {
		Collection<ComponentExchange> componentExchanges = new ArrayList<>();
		for (Feature currentFeature : element.getOwnedFeatures()) {
			if (currentFeature instanceof ComponentPort && ((ComponentPort) currentFeature).getOrientation().getValue() == OrientationPortKind.OUT_VALUE) {
				componentExchanges.addAll(((ComponentPort) currentFeature).getComponentExchanges());
			}
		}
		return deleteDelegations(componentExchanges);
	}

	public static Collection<ComponentExchange> getInOutComponentExchanges(Component element) {
		Collection<ComponentExchange> componentExchanges = new ArrayList<>();
		for (Feature currentFeature : element.getOwnedFeatures()) {
			if (currentFeature instanceof ComponentPort && ((ComponentPort) currentFeature).getOrientation().getValue() == OrientationPortKind.INOUT_VALUE) {
				componentExchanges.addAll(((ComponentPort) currentFeature).getComponentExchanges());
			}
		}
		return deleteDelegations(componentExchanges);
	}

	public static String componentExchangeToTableLine(Component currentComponent, ComponentExchange componentExchange, String projectName, String outputFolder) {
		StringBuilder buffer = new StringBuilder();
		buffer.append(CapellaServices.TR_OPEN);
		buffer.append("<td id=\"" + CapellaServices.getAnchorId(componentExchange) + "\">");
		buffer.append(CapellaServices.getImageLinkFromElement(componentExchange, projectName, outputFolder));
		buffer.append(" ");
		buffer.append(CapellaServices.getHyperlinkFromElement(componentExchange));
		buffer.append(CapellaServices.TD_CLOSE);

		ModelElement sourceTargetComponent;
		sourceTargetComponent = getOppositeComponent(currentComponent, componentExchange);
		if (sourceTargetComponent != null) {
			buffer.append(CapellaServices.TD_OPEN);
			buffer.append(CapellaServices.getImageLinkFromElement(sourceTargetComponent, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(sourceTargetComponent));
			buffer.append(CapellaServices.TD_CLOSE);
		}

		buffer.append(CapellaServices.TD_OPEN);
		buffer.append(getDescription(componentExchange, projectName, outputFolder));
		buffer.append(CapellaServices.TD_CLOSE);
		buffer.append(CapellaServices.TD_OPEN);
		EList<FunctionalExchange> functionalExchanges = componentExchange.getAllocatedFunctionalExchanges();
		if (!functionalExchanges.isEmpty()) {
			buffer.append(CapellaServices.UL_OPEN);

			for (FunctionalExchange currentItem : functionalExchanges) {
				buffer.append(CapellaServices.LI_OPEN);
				buffer.append(CapellaServices.getImageLinkFromElement(currentItem, projectName, outputFolder));
				buffer.append(" ");
				buffer.append(CapellaServices.getHyperlinkFromElement(currentItem));
				buffer.append(CapellaServices.LI_CLOSE);
			}
			buffer.append(CapellaServices.UL_CLOSE);
		}
		buffer.append(CapellaServices.TD_CLOSE);
		buffer.append(CapellaServices.TD_OPEN);
		if (!componentExchange.getConvoyedInformations().isEmpty()) {
			buffer.append(CapellaServices.UL_OPEN);
			for (AbstractExchangeItem currentItem : componentExchange.getConvoyedInformations()) {
				buffer.append(CapellaServices.LI_OPEN);
				buffer.append(CapellaServices.getImageLinkFromElement(currentItem, projectName, outputFolder));
				buffer.append(" ");
				buffer.append(CapellaServices.getHyperlinkFromElement(currentItem));
				buffer.append(CapellaServices.LI_CLOSE);
			}
			buffer.append(CapellaServices.UL_CLOSE);
		}
		buffer.append(CapellaServices.TD_CLOSE);
		
		EList<ComponentExchange> realizedComponentExchanges = componentExchange.getRealizedComponentExchanges();
		buffer.append(CapellaServices.TD_OPEN);
		buffer.append(CapellaServices.UL_OPEN);
		for (ComponentExchange realizedComponentExchange : realizedComponentExchanges) {
			buffer.append(CapellaServices.LI_OPEN);
			buffer.append(CapellaServices.getImageLinkFromElement(realizedComponentExchange, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(realizedComponentExchange));
			buffer.append(CapellaServices.LI_CLOSE);
		}
		buffer.append(CapellaServices.UL_CLOSE);
		buffer.append(CapellaServices.TD_CLOSE);
		buffer.append(CapellaServices.TD_OPEN);
		
		EList<ComponentExchange> realizingComponentExchanges = componentExchange.getRealizingComponentExchanges();
		buffer.append(CapellaServices.UL_OPEN);
		for (ComponentExchange realizingComponentExchange : realizingComponentExchanges) {
			buffer.append(CapellaServices.LI_OPEN);
			buffer.append(CapellaServices.getImageLinkFromElement(realizingComponentExchange, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(realizingComponentExchange));
			buffer.append(CapellaServices.LI_CLOSE);
		}
		buffer.append(CapellaServices.UL_CLOSE);
		buffer.append(CapellaServices.TD_CLOSE);
		buffer.append(CapellaServices.TR_CLOSE);

		return buffer.toString();
	}

	private static Collection<ComponentExchange> deleteDelegations(Collection<ComponentExchange> componentExchanges) {
		final Collection<ComponentExchange> newComponentExchanges = new ArrayList<>(componentExchanges);
		for (ComponentExchange currentComponentExchange : componentExchanges) {
			if (currentComponentExchange.getKind().getValue() == ComponentExchangeKind.DELEGATION_VALUE) {
				newComponentExchanges.remove(currentComponentExchange);
			}
		}
		return newComponentExchanges;
	}

	private static ModelElement getOppositeComponent(Component currentComponent, ComponentExchange componentExchange) {
		ModelElement candidate = resolveInformationExchanger(componentExchange.getSource());
		if (candidate != null && candidate.equals(currentComponent)) {
			candidate = resolveInformationExchanger(componentExchange.getTarget());
		}
		return candidate;
	}

	private static ModelElement resolveInformationExchanger(InformationsExchanger informationsExchanger) {
		if (informationsExchanger instanceof ComponentPort) {
			EObject portContainer = ((ComponentPort) informationsExchanger).eContainer();
			if (portContainer instanceof ModelElement)
				return (ModelElement) portContainer;
		} else if (informationsExchanger instanceof ComponentExchangeEnd) {
			Port port = ((ComponentExchangeEnd) informationsExchanger).getPort();
			if (port instanceof InformationsExchanger) {
				return resolveInformationExchanger((InformationsExchanger) port);
			}
			return port;
		}
		return informationsExchanger;
	}

	private static Object getDescription(ComponentExchange componentExchange, String projectName, String outputFolder) {
		if (componentExchange.getDescription() != null)
			return StringUtil.transformAREFString(componentExchange, componentExchange.getDescription(), projectName, outputFolder);
		return "";
	}

	/**
	 * 
	 * @param component
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getAllocatedFunctionsInformation(Component component, String projectName, String outputFolder) {
		final Collection<String> functionsString = new ArrayList<>();

		for (AbstractFunction currentAbstractFunction : component.getAllocatedFunctions()) {
			final StringBuilder buffer = new StringBuilder();
			buffer.append(CapellaServices.getImageLinkFromElement(currentAbstractFunction, projectName, outputFolder));
			buffer.append(CapellaServices.SPACE);
			buffer.append(CapellaServices.getHyperlinkFromElement(currentAbstractFunction));
			functionsString.add(buffer.toString());
		}

		return functionsString;
	}

	/**
	 * 
	 * @param component
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getImplementedInterfaces(Component component, String projectName, String outputFolder) {
		final Collection<String> implementedInterfaces = new ArrayList<>();
		for (Interface currenInterface : component.getImplementedInterfaces()) {
			final StringBuilder buffer = new StringBuilder();
			buffer.append(interfaceToSingleLineDescription(projectName, outputFolder, currenInterface));
			final Collection<Component> userAndRequiringComponents = getUserAndRequiringComponents(currenInterface);

			if (!userAndRequiringComponents.isEmpty()) {
				buffer.append("\n<br />");
				buffer.append(CapellaServices.UL_OPEN);
				buffer.append(CapellaServices.LI_OPEN);
				buffer.append("<strong>For</strong> ");
				buffer.append(componentsToSingleLineList(projectName, outputFolder, userAndRequiringComponents));
				buffer.append(CapellaServices.LI_CLOSE);
				buffer.append(CapellaServices.UL_CLOSE);
			}

			implementedInterfaces.add(buffer.toString());
		}

		return implementedInterfaces;
	}

	private static String interfaceToSingleLineDescription(String projectName, String outputFolder, Interface currenInterface) {
		final StringBuilder buffer = new StringBuilder();
		buffer.append(CapellaServices.getImageLinkFromElement(currenInterface, projectName, outputFolder));
		buffer.append(" ");
		buffer.append(CapellaServices.getFullDataPkgHierarchyLink(currenInterface));
		if (currenInterface.getSummary() != null && currenInterface.getSummary().length() > 0) {
			buffer.append(": ");
			buffer.append(currenInterface.getSummary());
		}
		return buffer.toString();
	}

	private static Set<Component> getUserAndRequiringComponents(Interface currenInterface) {
		final Set<Component> userAndRequiringComponents = new HashSet<>();

		userAndRequiringComponents.addAll(currenInterface.getUserComponents());
		userAndRequiringComponents.addAll(InterfaceExt.getRequireComponent(currenInterface));
		return userAndRequiringComponents;
	}

	private static Set<Component> getImplementorAndProviderComponents(Interface currenInterface) {
		final Set<Component> implementorAndProviderComponents = new HashSet<>();

		implementorAndProviderComponents.addAll(currenInterface.getImplementorComponents());
		implementorAndProviderComponents.addAll(InterfaceExt.getProviderComponent(currenInterface));
		return implementorAndProviderComponents;
	}

	private static String componentsToSingleLineList(String projectName, String outputFolder, final Collection<Component> userAndRequiringComponents) {
		StringBuilder buffer = new StringBuilder();
		Iterator<Component> userAndRequiringComponentsIterator = userAndRequiringComponents.iterator();
		while (userAndRequiringComponentsIterator.hasNext()) {
			Component currentComponent = userAndRequiringComponentsIterator.next();
			buffer.append(CapellaServices.getImageLinkFromElement(currentComponent, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(currentComponent));
			if (userAndRequiringComponentsIterator.hasNext()) {
				buffer.append(", ");
			}
		}
		return buffer.toString();
	}

	/**
	 * 
	 * @param component
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getProvidedInterfaces(Component component, String projectName, String outputFolder) {
		final Collection<String> providedInterfaces = new ArrayList<>();
		for (Interface currentInterface : component.getProvidedInterfaces()) {
			StringBuilder buffer = new StringBuilder();
			buffer.append(interfaceToSingleLineDescription(projectName, outputFolder, currentInterface));

			if (currentInterface instanceof Interface) {
				final Collection<Component> userAndRequiringComponents = getUserAndRequiringComponents(currentInterface);
				buffer.append(CapellaServices.UL_OPEN);
				buffer.append(CapellaServices.LI_OPEN);
				buffer.append("<table style=\"border:0px;\">");
				if (!userAndRequiringComponents.isEmpty()) {
					buffer.append(CapellaServices.TR_OPEN);
					buffer.append("<td style=\"border:0px\"><strong>For</strong> </td>");
					buffer.append(CapellaServices.TD_STYLE_MAX_WIDTH_100_BORDER_0PX);
					buffer.append(componentsToSingleLineList(projectName, outputFolder, userAndRequiringComponents));
					buffer.append(CapellaServices.TD_CLOSE);
					buffer.append(CapellaServices.TR_CLOSE);

				}
				ComponentPort port = getCorrespondingParentPort(component, InterfaceExt.getProvidedByPorts(currentInterface));
				if (port != null) {
					buffer.append(portToSingleLine(projectName, outputFolder, port));
				}
				buffer.append("</table>");
				buffer.append(CapellaServices.LI_CLOSE);
				buffer.append(CapellaServices.UL_CLOSE);
			}
			providedInterfaces.add(buffer.toString());
		}

		return providedInterfaces;
	}

	/**
	 * 
	 * @param component
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getUsedInterfaces(Component component, String projectName, String outputFolder) {
		final Collection<String> usedInterfaces = new ArrayList<>();
		for (Interface currenInterface : component.getUsedInterfaces()) {
			StringBuilder buffer = new StringBuilder();
			buffer.append(interfaceToSingleLineDescription(projectName, outputFolder, currenInterface));
			if (currenInterface instanceof Interface) {
				final Collection<Component> implementorAndProviderComponents = getImplementorAndProviderComponents(currenInterface);

				if (!implementorAndProviderComponents.isEmpty()) {
					buffer.append("\n<br />");
					buffer.append(CapellaServices.UL_OPEN);
					buffer.append(CapellaServices.LI_OPEN);
					buffer.append("<strong>From</strong> ");
					buffer.append(componentsToSingleLineList(projectName, outputFolder, implementorAndProviderComponents));
					buffer.append(CapellaServices.LI_CLOSE);
					buffer.append(CapellaServices.UL_CLOSE);
				}
			}
			usedInterfaces.add(buffer.toString());
		}

		return usedInterfaces;
	}

	/**
	 * 
	 * @param component
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getRequiredInterfaces(Component component, String projectName, String outputFolder) {
		final Collection<String> requiredInterfaces = new ArrayList<>();
		for (Interface currentInterface : component.getRequiredInterfaces()) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(interfaceToSingleLineDescription(projectName, outputFolder, currentInterface));

			if (currentInterface instanceof Interface) {
				final Collection<Component> implementorAndProviderComponents = getImplementorAndProviderComponents(currentInterface);
				stringBuilder.append(CapellaServices.UL_OPEN);
				stringBuilder.append(CapellaServices.LI_OPEN);
				stringBuilder.append("<table style=\"border:0px;\">");
				if (!implementorAndProviderComponents.isEmpty()) {

					stringBuilder.append(CapellaServices.TR_OPEN);
					stringBuilder.append("<td style=\"border:0px\"><strong>From</strong> </td>");
					stringBuilder.append(CapellaServices.TD_STYLE_MAX_WIDTH_100_BORDER_0PX);
					stringBuilder.append(componentsToSingleLineList(projectName, outputFolder, implementorAndProviderComponents));
					stringBuilder.append(CapellaServices.TD_CLOSE);
					stringBuilder.append(CapellaServices.TR_CLOSE);

				}
				ComponentPort port = getCorrespondingParentPort(component, InterfaceExt.getRequiredByPorts(currentInterface));
				if (port != null) {
					stringBuilder.append(portToSingleLine(projectName, outputFolder, port));
				}
				stringBuilder.append("</table>");
				stringBuilder.append(CapellaServices.LI_CLOSE);
				stringBuilder.append(CapellaServices.UL_CLOSE);
			}
			requiredInterfaces.add(stringBuilder.toString());
		}

		return requiredInterfaces;
	}

	private static String portToSingleLine(String projectName, String outputFolder, ComponentPort port) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\n");
		stringBuilder.append(CapellaServices.TR_OPEN);
		stringBuilder.append("<td style=\"border:0px\"><strong>Through</strong> </td>");
		stringBuilder.append(CapellaServices.TD_STYLE_MAX_WIDTH_100_BORDER_0PX);
		stringBuilder.append(CapellaServices.getImageLinkFromElement(port, projectName, outputFolder));
		stringBuilder.append(" ");
		stringBuilder.append(CapellaServices.getHyperlinkFromElement(port));
		stringBuilder.append(CapellaServices.TD_CLOSE);
		stringBuilder.append(CapellaServices.TR_CLOSE);
		return stringBuilder.toString();
	}

	private static ComponentPort getCorrespondingParentPort(Component component, List<ComponentPort> requiredByPorts) {
		for (ComponentPort currentComponentPort : requiredByPorts) {
			if (currentComponentPort.eContainer().equals(component)) {
				return currentComponentPort;
			}
		}
		return null;
	}

	public static Collection<String> getPorts(Component component, String projectName, String outputFolder) {
		Collection<String> ret = new ArrayList<>();
		for (Port port : ComponentExt.getOwnedPort(component)) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(CapellaServices.getImageLinkFromElement(port, projectName, outputFolder));
			stringBuilder.append(" ");
			stringBuilder.append(CapellaServices.getHyperlinkFromElement(port));
			ret.add(stringBuilder.toString());
		}
		return ret;
	}

	/**
	 * Get the values of the common features to all Components:
	 * <ul>
	 * 	<li>isActor</li>
	 * 	<li>isHuman</li>
	 * 	<li>isAbstract</li>
	 * </ul>
	 * @param component A component
	 * @return A list of {@code <feature_name>:<feature_value>} strings
	 */
	public static Collection<String> getFeatures(Component component) {
		Collection<String> ret = new ArrayList<>();
		ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.IS_ACTOR + CapellaServices.BOLD_END + component.isActor());
		ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.IS_HUMAN + CapellaServices.BOLD_END + component.isHuman());
		ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.IS_ABSTRACT + CapellaServices.BOLD_END + component.isAbstract());
		return ret;
	}
}
