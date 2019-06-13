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
package org.polarsys.capella.docgen.util.pattern.helper;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
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
				allocatingComponents.append(CapellaServices.getImageLinkFromElement(componentExchange, projectName, outputFolder));
				allocatingComponents.append(CapellaServices.SPACE);
				allocatingComponents.append(CapellaServices.getHyperlinkFromElement((CapellaElement)componentExchange));
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

}