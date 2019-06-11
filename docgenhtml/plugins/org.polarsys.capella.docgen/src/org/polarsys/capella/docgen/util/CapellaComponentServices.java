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

	public static Collection<ComponentExchange> getIncomingComponentExchanges(Component element) {
		Collection<ComponentExchange> componentExchanges = new ArrayList<ComponentExchange>();
		for (Feature currentFeature : element.getOwnedFeatures()) {
			if (currentFeature instanceof ComponentPort) {

				if (((ComponentPort) currentFeature).getOrientation().getValue() == OrientationPortKind.IN_VALUE)
					componentExchanges.addAll(((ComponentPort) currentFeature).getComponentExchanges());
			}
		}
		return deleteDelegations(componentExchanges);
	}

	public static Collection<ComponentExchange> getOutgoingComponentExchanges(Component element) {
		Collection<ComponentExchange> componentExchanges = new ArrayList<ComponentExchange>();
		for (Feature currentFeature : element.getOwnedFeatures()) {
			if (currentFeature instanceof ComponentPort) {

				if (((ComponentPort) currentFeature).getOrientation().getValue() == OrientationPortKind.OUT_VALUE) {
					componentExchanges.addAll(((ComponentPort) currentFeature).getComponentExchanges());
				}
			}
		}
		return deleteDelegations(componentExchanges);
	}

	public static Collection<ComponentExchange> getInOutComponentExchanges(Component element) {
		Collection<ComponentExchange> componentExchanges = new ArrayList<ComponentExchange>();
		for (Feature currentFeature : element.getOwnedFeatures()) {
			if (currentFeature instanceof ComponentPort) {

				if (((ComponentPort) currentFeature).getOrientation().getValue() == OrientationPortKind.INOUT_VALUE) {
					componentExchanges.addAll(((ComponentPort) currentFeature).getComponentExchanges());
				}
			}
		}
		return deleteDelegations(componentExchanges);
	}

	public static String componentExchangeToTableLine(Component currentComponent, ComponentExchange componentExchange, String projectName, String outputFolder) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<tr>");
		buffer.append("<td id=\"" + CapellaServices.getAnchorId(componentExchange) + "\">");
		buffer.append(CapellaServices.getImageLinkFromElement(componentExchange, projectName, outputFolder));
		buffer.append(" ");
		buffer.append(CapellaServices.getHyperlinkFromElement(componentExchange));
		buffer.append("</td>");

		ModelElement sourceTargetComponent;
		sourceTargetComponent = getOppositeComponent(currentComponent, componentExchange);
		if (sourceTargetComponent != null) {
			// for (ActivityNode currentFunction : activityNodes) {
			buffer.append("<td>");
			buffer.append(CapellaServices.getImageLinkFromElement(sourceTargetComponent, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(sourceTargetComponent));
			// }
			buffer.append("</td>");
		}

		buffer.append("<td>");
		buffer.append(getDescription(componentExchange, projectName, outputFolder));
		buffer.append("</td>");
		buffer.append("<td>");
		EList<FunctionalExchange> functionalExchanges = componentExchange.getAllocatedFunctionalExchanges();
		if (functionalExchanges.size() > 0) {
			buffer.append(CapellaServices.UL_OPEN);

			for (FunctionalExchange currentItem : functionalExchanges) {
				buffer.append("<li>");
				buffer.append(CapellaServices.getImageLinkFromElement(currentItem, projectName, outputFolder));
				buffer.append(" ");
				buffer.append(CapellaServices.getHyperlinkFromElement(currentItem));
				buffer.append("</li>");
			}
			buffer.append(CapellaServices.UL_CLOSE);
		}
		buffer.append("</td>");
		buffer.append("<td>");
		if (componentExchange.getConvoyedInformations().size() > 0) {
			buffer.append(CapellaServices.UL_OPEN);
			for (AbstractExchangeItem currentItem : componentExchange.getConvoyedInformations()) {
				buffer.append("<li>");
				buffer.append(CapellaServices.getImageLinkFromElement(currentItem, projectName, outputFolder));
				buffer.append(" ");
				buffer.append(CapellaServices.getHyperlinkFromElement(currentItem));
				buffer.append("</li>");
			}
			buffer.append(CapellaServices.UL_CLOSE);
		}
		buffer.append("</td>");
		
		EList<ComponentExchange> realizedComponentExchanges = componentExchange.getRealizedComponentExchanges();
		buffer.append("<td>");
		buffer.append(CapellaServices.UL_OPEN);
		for (ComponentExchange realizedComponentExchange : realizedComponentExchanges) {
			buffer.append("<li>");
			buffer.append(CapellaServices.getImageLinkFromElement(realizedComponentExchange, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(realizedComponentExchange));
			buffer.append("</li>");
		}
		buffer.append(CapellaServices.UL_CLOSE);
		buffer.append("</td>");
		buffer.append("<td>");
		
		EList<ComponentExchange> realizingComponentExchanges = componentExchange.getRealizingComponentExchanges();
		buffer.append(CapellaServices.UL_OPEN);
		for (ComponentExchange realizingComponentExchange : realizingComponentExchanges) {
			buffer.append("<li>");
			buffer.append(CapellaServices.getImageLinkFromElement(realizingComponentExchange, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(realizingComponentExchange));
			buffer.append("</li>");
		}
		buffer.append(CapellaServices.UL_CLOSE);
		buffer.append("</td>");
		buffer.append("</tr>");

		return buffer.toString();
	}

	private static Collection<ComponentExchange> deleteDelegations(Collection<ComponentExchange> componentExchanges) {
		final Collection<ComponentExchange> newComponentExchanges = new ArrayList<ComponentExchange>(componentExchanges);
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
		final Collection<String> functionsString = new ArrayList<String>();

		for (AbstractFunction currentAbstractFunction : component.getAllocatedFunctions()) {
			final StringBuffer buffer = new StringBuffer();
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
		final Collection<String> implementedInterfaces = new ArrayList<String>();
		for (Interface currenInterface : component.getImplementedInterfaces()) {
			final StringBuffer buffer = new StringBuffer();
			buffer.append(interfaceToSingleLineDescription(projectName, outputFolder, currenInterface));
			final Collection<Component> userAndRequiringComponents = getUserAndRequiringComponents(currenInterface);

			if (userAndRequiringComponents.size() > 0) {
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
		final StringBuffer buffer = new StringBuffer();
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
		final Set<Component> userAndRequiringComponents = new HashSet<Component>();

		userAndRequiringComponents.addAll(currenInterface.getUserComponents());
		userAndRequiringComponents.addAll(InterfaceExt.getRequireComponent(currenInterface));
		return userAndRequiringComponents;
	}

	private static Set<Component> getImplementorAndProviderComponents(Interface currenInterface) {
		final Set<Component> implementorAndProviderComponents = new HashSet<Component>();

		implementorAndProviderComponents.addAll(currenInterface.getImplementorComponents());
		implementorAndProviderComponents.addAll(InterfaceExt.getProviderComponent(currenInterface));
		return implementorAndProviderComponents;
	}

	private static String componentsToSingleLineList(String projectName, String outputFolder, final Collection<Component> userAndRequiringComponents) {
		StringBuffer buffer = new StringBuffer();
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
		final Collection<String> providedInterfaces = new ArrayList<String>();
		for (Interface currentInterface : component.getProvidedInterfaces()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(interfaceToSingleLineDescription(projectName, outputFolder, currentInterface));

			if (currentInterface instanceof Interface) {
				final Collection<Component> userAndRequiringComponents = getUserAndRequiringComponents((Interface) currentInterface);
				buffer.append(CapellaServices.UL_OPEN);
				buffer.append(CapellaServices.LI_OPEN);
				buffer.append("<table style=\"border:0px;\">");
				if (userAndRequiringComponents.size() > 0) {
					buffer.append("<tr>");
					buffer.append("<td style=\"border:0px\"><strong>For</strong> </td>");
					buffer.append("<td style=\"max-width:100%; border:0px\">");
					buffer.append(componentsToSingleLineList(projectName, outputFolder, userAndRequiringComponents));
					buffer.append("</td>");
					buffer.append("</tr>");

				}
				ComponentPort port = getCorrespondingParentPort(component, InterfaceExt.getProvidedByPorts((Interface) currentInterface));
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
		final Collection<String> usedInterfaces = new ArrayList<String>();
		for (Interface currenInterface : component.getUsedInterfaces()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(interfaceToSingleLineDescription(projectName, outputFolder, currenInterface));
			if (currenInterface instanceof Interface) {
				final Collection<Component> implementorAndProviderComponents = getImplementorAndProviderComponents((Interface) currenInterface);

				if (implementorAndProviderComponents.size() > 0) {
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
		final Collection<String> requiredInterfaces = new ArrayList<String>();
		for (Interface currentInterface : component.getRequiredInterfaces()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(interfaceToSingleLineDescription(projectName, outputFolder, currentInterface));

			if (currentInterface instanceof Interface) {
				final Collection<Component> implementorAndProviderComponents = getImplementorAndProviderComponents((Interface) currentInterface);
				buffer.append(CapellaServices.UL_OPEN);
				buffer.append(CapellaServices.LI_OPEN);
				buffer.append("<table style=\"border:0px;\">");
				if (implementorAndProviderComponents.size() > 0) {

					buffer.append("<tr>");
					buffer.append("<td style=\"border:0px\"><strong>From</strong> </td>");
					buffer.append("<td style=\"max-width:100%; border:0px\">");
					buffer.append(componentsToSingleLineList(projectName, outputFolder, implementorAndProviderComponents));
					buffer.append("</td>");
					buffer.append("</tr>");

				}
				ComponentPort port = getCorrespondingParentPort(component, InterfaceExt.getRequiredByPorts((Interface) currentInterface));
				if (port != null) {
					buffer.append(portToSingleLine(projectName, outputFolder, port));
				}
				buffer.append("</table>");
				buffer.append(CapellaServices.LI_CLOSE);
				buffer.append(CapellaServices.UL_CLOSE);
			}
			requiredInterfaces.add(buffer.toString());
		}

		return requiredInterfaces;
	}

	private static String portToSingleLine(String projectName, String outputFolder, ComponentPort port) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n");
		buffer.append("<tr>");
		buffer.append("<td style=\"border:0px\"><strong>Through</strong> </td>");
		buffer.append("<td style=\"max-width:100%; border:0px\">");
		buffer.append(CapellaServices.getImageLinkFromElement(port, projectName, outputFolder));
		buffer.append(" ");
		buffer.append(CapellaServices.getHyperlinkFromElement(port));
		buffer.append("</td>");
		buffer.append("</tr>");
		return buffer.toString();
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
		Collection<String> ret = new ArrayList<String>();
		for (Port port : ComponentExt.getOwnedPort(component)) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(port, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(port));
			ret.add(buffer.toString());
		}
		return ret;
	}
}
