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

import java.util.ArrayList;
import java.util.List;

import org.polarsys.capella.common.data.modellingcore.AbstractExchangeItem;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.cs.PhysicalLinkCategory;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeCategory;
import org.polarsys.capella.core.data.fa.ExchangeCategory;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.information.ExchangeItem;

/**
 * @author Boubekeur Zendagui.
 */
public class ExchangesServices {
	
	public static final String SOURCE_PORT_TREE_ID = "sourcePortTreeView";
	public static final String TARGET_PORT_TREE_ID = "targetPortTreeView";
	
	/**
	 * @param element a Capella model element. It can be:
	 * <ul>
	 * <li> {@link FunctionalExchange}</li>
	 * <li> {@link ComponentExchange}</li>
	 * <li> {@link PhysicalLink}</li>
	 * </ul>
	 * @return an HTML text displaying the source port of an Exchange 
	 */
	public static String getSource(CapellaElement element, String projectName, String outputFolder) {
		CapellaElement port = null;
		if (element instanceof PhysicalLink) {
			port = ((PhysicalLink) element).getSourcePhysicalPort();
		} else if (element instanceof ComponentExchange){
			port = ((ComponentExchange) element).getSourcePort();
		} else if (element instanceof FunctionalExchange) {
			port = ((FunctionalExchange) element).getSourceFunctionOutputPort();
		}
		return port != null ? getPort(port, projectName, outputFolder, true) : "";
	}
	
	/**
	 * @param element a Capella model element. It can be:
	 * <ul>
	 * <li> {@link FunctionalExchange}</li>
	 * <li> {@link ComponentExchange}</li>
	 * <li> {@link PhysicalLink}</li>
	 * </ul>
	 * @return an HTML text displaying the target port of an Exchange 
	 */
	public static String getTarget(CapellaElement element, String projectName, String outputFolder) {
		CapellaElement port = null;
		if (element instanceof PhysicalLink) {
			port = ((PhysicalLink) element).getTargetPhysicalPort();
		} else if (element instanceof ComponentExchange){
			port = ((ComponentExchange) element).getTargetPort();
		} else if (element instanceof FunctionalExchange) {
			port = ((FunctionalExchange) element).getTargetFunctionInputPort();
		}
		return port != null ? getPort(port, projectName, outputFolder, false) : "";
	}
	
	private static String getPort(CapellaElement port, String projectName, String outputFolder, boolean source) {
		StringBuilder sb = new StringBuilder();
		CapellaElement parent = (CapellaElement) port.eContainer();
		sb.append("<ul id=\"").append(source ? SOURCE_PORT_TREE_ID : TARGET_PORT_TREE_ID).append("\" class=\"treeview\">");
		sb.append(CapellaServices.LI_OPEN);
		sb.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, port));
		sb.append(CapellaServices.UL_OPEN);
		sb.append(CapellaServices.LI_OPEN);
		sb.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, parent));
		sb.append(CapellaServices.LI_CLOSE);
		sb.append(CapellaServices.UL_CLOSE);
		sb.append(CapellaServices.LI_CLOSE);
		sb.append(CapellaServices.UL_CLOSE);
		return sb.toString();
	}
	
	/**
	 * @param element a Capella model element. It can be:
	 * @return an HTML text displaying the allocated FunctionExchanges to the component exchange.
	 */
	public static String getAllocatedComponentExchanges(PhysicalLink element, String projectName, String outputFolder) {
		List<String> list = new ArrayList<>();
		for (ComponentExchange ce : element.getAllocatedComponentExchanges()) {
			list.add(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, ce));
		}
		return StringUtil.stringListToBulette(list);
	}
	
	public static boolean genAllocatedComponentExchanges(CapellaElement element) {
		if (element instanceof PhysicalLink) {
			return ! ((PhysicalLink)element).getAllocatedComponentExchanges().isEmpty();
		}
		return false;
	}
	
	/**
	 * @param element a Capella model element. 
	 * @return an HTML text displaying the allocated FunctionExchanges to the component exchange.
	 */
	public static String getAllocatedFunctionExchanges(ComponentExchange element, String projectName, String outputFolder) {
		List<String> list = new ArrayList<>();
		for (FunctionalExchange fe : element.getAllocatedFunctionalExchanges()) {
			list.add(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, fe));
		}
		return StringUtil.stringListToBulette(list);
	}
	
	public static boolean genAllocatedFunctionExchanges(CapellaElement element) {
		if (element instanceof ComponentExchange) {
			return ! ((ComponentExchange)element).getAllocatedFunctionalExchanges().isEmpty();
		}
		return false;
	}
	
	/**
	 * @param element a Capella model element. It can be:
	 * <ul>
	 * <li> {@link FunctionalExchange}</li>
	 * <li> {@link ComponentExchange}</li>
	 * </ul>
	 * @return an HTML text displaying the allocated ExchangeItems
	 */
	public static String getAllocatedExchangeItems(CapellaElement element, String projectName, String outputFolder) {
		List<String> list = new ArrayList<>();
		if (element instanceof FunctionalExchange)  {
			for (ExchangeItem ei : ((FunctionalExchange) element).getExchangedItems()) {
				list.add(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, ei));
			}
		}
		if (element instanceof ComponentExchange)  {
			for (AbstractExchangeItem ei : ((ComponentExchange) element).getConvoyedInformations()) {
				list.add(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, ei));
			}
		}
		return StringUtil.stringListToBulette(list);
	}
	
	public static boolean genAllocatedExchangeItems(CapellaElement element) {
		if (element instanceof FunctionalExchange)  {
			return ! ((FunctionalExchange) element).getExchangedItems().isEmpty();
		}
		if (element instanceof ComponentExchange)  {
			return ! ((ComponentExchange) element).getConvoyedInformations().isEmpty();
		}
		return false;
	}
	
	
	/**
	 * @param element a Capella model element. It can be:
	 * <ul>
	 * <li> {@link FunctionalExchange}</li>
	 * <li> {@link ComponentExchange}</li>
	 * <li> {@link PhysicalLink}</li>
	 * </ul>
	 * @return an HTML text displaying the category
	 */
	public static String getCategories(CapellaElement element, String projectName, String outputFolder) {
		List<String> list = new ArrayList<>();
		if (element instanceof FunctionalExchange)  {
			for (ExchangeCategory ecat : ((FunctionalExchange) element).getCategories()) {
				list.add(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, ecat));
			}
		}
		if (element instanceof ComponentExchange)  {
			for (ComponentExchangeCategory ecat : ((ComponentExchange) element).getCategories()) {
				list.add(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, ecat));
			}
		}
		
		if (element instanceof PhysicalLink)  {
			for (PhysicalLinkCategory ecat : ((PhysicalLink) element).getCategories()) {
				list.add(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, ecat));
			}
		}
		return StringUtil.stringListToBulette(list);
	}
	
	public static boolean genCategories(CapellaElement element) {
		if (element instanceof FunctionalExchange)  {
			return ! ((FunctionalExchange) element).getCategories().isEmpty();
		}
		if (element instanceof ComponentExchange)  {
			return ! ((ComponentExchange) element).getCategories().isEmpty();
		}
		
		if (element instanceof PhysicalLink)  {
			return ! ((PhysicalLink) element).getCategories().isEmpty();
		}
		return false;
	}
}
