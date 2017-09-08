/*******************************************************************************
 * Copyright (c) 2006, 2017 THALES GLOBAL SERVICES.
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
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.core.data.capellacommon.State;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.Involvement;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.docgen.util.CapellaServices;

public class FunctionalChainHelper {

	public static Collection<String> getAvailableModeAndState(String projectName, String outputFolder, FunctionalChain functionalChain) {
		Collection<String> ret = new ArrayList<String>();
		for (State currentStateMode : functionalChain.getAvailableInStates()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(currentStateMode, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(currentStateMode));
			ret.add(buffer.toString());
		}
		return ret;
	}

	public static Collection<String> getAvailableFunctions(String projectName, String outputFolder, FunctionalChain functionalChain) {
		Collection<String> ret = new ArrayList<String>();
		for (AbstractFunction function : functionalChain.getInvolvedFunctions()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(function, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(function));
			ret.add(buffer.toString());
		}
		return ret;
	}
	
	/**
	 * Return a map which keys are hyperlinks to function pages and values are the description of the
	 * involvement functions in the functional chain
	 * @param projectName
	 * @param outputFolder
	 * @param functionalChain
	 * @return
	 */
	public static Map<String, String> getAvailableFunctionWithInvolvementDescription(String projectName, String outputFolder, FunctionalChain functionalChain){
		Map<String, String> ret = new LinkedHashMap<String, String>();
		for (AbstractFunction function : functionalChain.getInvolvedFunctions()) {
			addHyperLinkAndInvolvementFunction(projectName, outputFolder, ret, function, functionalChain);
		}
		return ret;
	}
	
	/**
	 * Add the description of the involvement to the result
	 * @param projectName
	 * @param outputFolder
	 * @param result
	 * @param function
	 * @param functionalChain
	 */
	private static void addHyperLinkAndInvolvementFunction(String projectName, String outputFolder,
			Map<String, String> result, InvolvedElement function, CapellaElement functionalChain) {
		StringBuffer hyperLinkBuffer = new StringBuffer();
		StringBuffer involvementDescriptionBuffer = new StringBuffer();
		
		//Build the hyperlink of the function
		hyperLinkBuffer.append(CapellaServices.getImageLinkFromElement(function, projectName, outputFolder));
		hyperLinkBuffer.append(" "); //$NON-NLS-1$
		hyperLinkBuffer.append(CapellaServices.getHyperlinkFromElement(function));
		
		//Retrieve the function involvement description from involvment
		EList<Involvement> involvements = function.getInvolvingInvolvements();
		for (Involvement involvement : involvements) {
			if (involvement.eContainer() != null && involvement.eContainer().equals(functionalChain)){
				String description = involvement.getDescription();
				if (description != null && !description.isEmpty()){
					involvementDescriptionBuffer.append(description);
				} else {
					involvementDescriptionBuffer.append(""); //$NON-NLS-1$
				}
				break;
			}
		}
		
		result.put(hyperLinkBuffer.toString(), involvementDescriptionBuffer.toString());
	}
	
	
	public static Map<String, String> getInvolvedFunctionalExchanges(String projectName, String outputFolder, FunctionalChain functionalChain) {

		Map<String, String> ret = new LinkedHashMap<String, String>();
		for (FunctionalExchange functionalExchange : functionalChain.getInvolvedFunctionalExchanges()) {
			addHyperLinkAndInvolvementFunction(projectName, outputFolder, ret, functionalExchange, functionalChain);
		}
		return ret;
	}
}
