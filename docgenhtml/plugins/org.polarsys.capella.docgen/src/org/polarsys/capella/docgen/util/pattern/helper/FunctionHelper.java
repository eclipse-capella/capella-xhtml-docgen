/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.data.modellingcore.AbstractExchangeItem;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.docgen.util.CapellaServices;

public class FunctionHelper {

	/**
	 * Get the involving functional chains
	 * 
	 * @param function
	 * @return
	 */
	public static Collection<String> getInvolvingFunctionalChains(String projectName, String outputFolder,
	    AbstractFunction function) {
		Collection<String> functionalChains = new ArrayList<String>();
		for (FunctionalChain involvingFunctionalChain : function.getInvolvingFunctionalChains()) {
			functionalChains.add(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, involvingFunctionalChain));
		}
		return functionalChains;
	}

	/**
	 * Get the allocating components
	 * 
	 * @param function
	 * @return
	 */
	public static Collection<String> getAllocatingComponents(String projectName, String outputFolder,
	    AbstractFunction function) {
		Collection<String> allocatingComponents = new ArrayList<String>();
		for (EObject componentAllocation : function.getComponentFunctionalAllocations()) {
			EObject component = componentAllocation.eContainer();
			allocatingComponents.add(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, component));
		}
		return allocatingComponents;
	}

	/**
	 * Get the allocating component exchanges of a functional exchange
	 */
	public static String getAllocatingComponentExchangess(String projectName, String outputFolder,
	    FunctionalExchange functionalExchange) {
		StringBuilder allocatingComponents = new StringBuilder();
		if (!functionalExchange.getAllocatingComponentExchanges().isEmpty()) {
			allocatingComponents.append(CapellaServices.UL_OPEN);
			for (EObject componentExchange : functionalExchange.getAllocatingComponentExchanges()) {
				allocatingComponents.append(CapellaServices.LI_OPEN);
				allocatingComponents.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, componentExchange));
				allocatingComponents.append(CapellaServices.LI_CLOSE);
			}
			allocatingComponents.append(CapellaServices.UL_CLOSE);
		}
		return allocatingComponents.toString();
	}

	/**
	 * Get the involving functional chains of a functional exchange
	 */
	public static String getInvolvingFunctionalChains(String projectName, String outputFolder,
	    FunctionalExchange functionalExchange) {
		StringBuilder involvingFunctionalChainsString = new StringBuilder();
		if (!functionalExchange.getInvolvingFunctionalChains().isEmpty()) {
			involvingFunctionalChainsString.append(CapellaServices.UL_OPEN);
			for (EObject involvingFunctionalChain : functionalExchange.getInvolvingFunctionalChains()) {
				involvingFunctionalChainsString.append(CapellaServices.LI_OPEN);
				involvingFunctionalChainsString
				    .append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, involvingFunctionalChain));
				involvingFunctionalChainsString.append(CapellaServices.LI_CLOSE);
			}
			involvingFunctionalChainsString.append(CapellaServices.UL_CLOSE);
		}
		return involvingFunctionalChainsString.toString();
	}

	/**
	 * Get the Exchanged Items of a functional exchange 
	 */
	public static String getExchangedItems(FunctionalExchange functionalExchange, String projectName,
			String outputFolder) {
		StringBuilder sb = new StringBuilder();
		EList<ExchangeItem> abstractExchangeItems = functionalExchange.getExchangedItems();
		if (abstractExchangeItems.size() > 0) {
			sb.append(CapellaServices.UL_OPEN);
			for (AbstractExchangeItem currentItem : abstractExchangeItems) {
				sb.append(CapellaServices.LI_OPEN);
				sb.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, currentItem));
				sb.append(CapellaServices.LI_CLOSE);
			}
			sb.append(CapellaServices.UL_CLOSE);
		}
		return sb.toString();
	}

	/**
	 * Get the Realized functional exchanges of a functional exchange 
	 */
	public static String getRealizedFunctionalExchanges(FunctionalExchange functionalExchange, String projectName,
			String outputFolder) {
		StringBuilder sb = new StringBuilder();
		EList<FunctionalExchange> realizedFunctionalExchanges = functionalExchange.getRealizedFunctionalExchanges();
		if (!realizedFunctionalExchanges.isEmpty()) {
			sb.append(CapellaServices.UL_OPEN);
			for (FunctionalExchange exchange : realizedFunctionalExchanges) {
				sb.append(CapellaServices.LI_OPEN);
				sb.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, exchange));
				sb.append(CapellaServices.LI_CLOSE);
			}
			sb.append(CapellaServices.UL_CLOSE);
		}
		return sb.toString();
	}

	/**
	 * Get the Realizing functional exchanges of a functional exchange 
	 */
	public static String getRealizingFunctionalExchanges(FunctionalExchange functionalExchange, String projectName,
			String outputFolder) {
		StringBuilder sb = new StringBuilder();
		EList<FunctionalExchange> realizingFunctionalExchanges = functionalExchange.getRealizingFunctionalExchanges();
		if (!realizingFunctionalExchanges.isEmpty()) {
			sb.append(CapellaServices.UL_OPEN);
			for (FunctionalExchange exchange : realizingFunctionalExchanges) {
				sb.append(CapellaServices.LI_OPEN);
				sb.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, exchange));
				sb.append(CapellaServices.LI_CLOSE);
			}
			sb.append(CapellaServices.UL_CLOSE);
		}
		return sb.toString();
	}
}