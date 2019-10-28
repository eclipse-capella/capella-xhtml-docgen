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
import java.util.Collections;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.common.data.activity.ActivityEdge;
import org.polarsys.capella.common.data.activity.ActivityNode;
import org.polarsys.capella.common.data.activity.InputPin;
import org.polarsys.capella.common.data.activity.OutputPin;
import org.polarsys.capella.core.data.capellacommon.State;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionInputPort;
import org.polarsys.capella.core.data.fa.FunctionOutputPort;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.docgen.util.pattern.helper.FunctionHelper;

/**
 * Function template services.
 */
public class CapellaFunctionServices {

	/**
	 * 
	 * @param function
	 * @return
	 */
	public static Collection<FunctionalExchange> getIncomingFunctionalExchanges(AbstractFunction function) {
		Collection<FunctionalExchange> functionalExchanges = new ArrayList<FunctionalExchange>();
		Collection<ActivityEdge> incomingActivityEdges = getIncomingActivityEdges(function);
		for (ActivityEdge activityEdge : incomingActivityEdges) {
			if (activityEdge instanceof FunctionalExchange) {
				functionalExchanges.add((FunctionalExchange) activityEdge);
			}
		}

		return functionalExchanges;
	}

	/**
	 * 
	 * @param abstractFunction
	 * @return
	 */
	private static Collection<ActivityEdge> getIncomingActivityEdges(AbstractFunction abstractFunction) {

		if (abstractFunction instanceof AbstractFunction) {
			Collection<ActivityEdge> activityEdges = new ArrayList<ActivityEdge>();
			for (InputPin inputPin : ((AbstractFunction) abstractFunction).getInputs()) {
				activityEdges.addAll(inputPin.getIncoming());
			}

			for (ActivityEdge iActivityEdge : ((AbstractFunction) abstractFunction).getIncoming()) {
				if (!activityEdges.contains(iActivityEdge)) {
					activityEdges.add(iActivityEdge);
				}
			}
			return activityEdges;
		} else if (abstractFunction instanceof ActivityNode) {

			return ((ActivityNode) abstractFunction).getIncoming();

		}
		return Collections.emptyList();
	}

	/**
	 * 
	 * @param function
	 * @return
	 */
	public static Collection<FunctionalExchange> getIncomingInternalFunctionalExchanges(AbstractFunction function) {
		Collection<FunctionalExchange> functionalExchanges = new ArrayList<FunctionalExchange>();
		for (AbstractFunction abstractFunction : getAllSubFunctions(function)) {
			Collection<FunctionalExchange> allIncomingFunctionalExchanges = getIncomingFunctionalExchanges(abstractFunction);
			for (FunctionalExchange currentFunctionalExchange : allIncomingFunctionalExchanges) {
				if (containsExternalSource(currentFunctionalExchange, function)) {
					functionalExchanges.add(currentFunctionalExchange);
				}
			}
		}
		return functionalExchanges;
	}

	/**
	 * 
	 * @param function
	 * @return
	 */
	public static Collection<FunctionalExchange> getOutgoingFunctionalExchanges(AbstractFunction function) {
		Collection<FunctionalExchange> functionalExchanges = new ArrayList<FunctionalExchange>();

		for (ActivityEdge activityEdge : getOutgoingActivityEdges(function)) {
			if (activityEdge instanceof FunctionalExchange) {
				functionalExchanges.add((FunctionalExchange) activityEdge);
			}

		}
		return functionalExchanges;
	}

	private static Collection<ActivityEdge> getOutgoingActivityEdges(AbstractFunction abstractFunction) {

		if (abstractFunction instanceof AbstractFunction) {
			Collection<ActivityEdge> activityEdges = new ArrayList<ActivityEdge>();
			for (OutputPin outputPin : ((AbstractFunction) abstractFunction).getOutputs()) {
				activityEdges.addAll(outputPin.getOutgoing());
			}
			for (ActivityEdge iActivityEdge : ((AbstractFunction) abstractFunction).getOutgoing()) {
				if (!activityEdges.contains(iActivityEdge)) {
					activityEdges.add(iActivityEdge);
				}
			}
			return activityEdges;
		} else if (abstractFunction instanceof ActivityNode) {

			return ((ActivityNode) abstractFunction).getOutgoing();

		}
		return Collections.emptyList();
	}

	/**
	 * 
	 * @param function
	 * @return
	 */
	public static Collection<FunctionalExchange> getOutgoingInternalFunctionalExchanges(AbstractFunction function) {
		Collection<FunctionalExchange> functionalExchanges = new ArrayList<FunctionalExchange>();
		for (AbstractFunction abstractFunction : getAllSubFunctions(function)) {
			Collection<FunctionalExchange> allOutgoingFunctionalExchanges = getOutgoingFunctionalExchanges(abstractFunction);
			for (FunctionalExchange currentFunctionalExchange : allOutgoingFunctionalExchanges) {
				if (containsExternalTarget(currentFunctionalExchange, function)) {
					functionalExchanges.add(currentFunctionalExchange);
				}
			}
		}
		return functionalExchanges;
	}

	public static Collection<String> getAvailableModeAndState(String projectName, String outputFolder, AbstractFunction abstractFunction) {
		Collection<String> ret = new ArrayList<String>();
		for (State currentStateMode : abstractFunction.getAvailableInStates()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(currentStateMode, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(currentStateMode));
			ret.add(buffer.toString());
		}
		return ret;
	}

	private static boolean containsExternalTarget(FunctionalExchange currentFunctionalExchange, AbstractFunction function) {
		Collection<ActivityNode> targetFunctions = getTargetFunctions(currentFunctionalExchange);
		for (ActivityNode currentFunction : targetFunctions) {
			if (!EcoreUtil.isAncestor(function, currentFunction)) {
				return true;
			}
		}
		return false;
	}

	private static boolean containsExternalSource(FunctionalExchange currentFunctionalExchange, AbstractFunction function) {
		Collection<ActivityNode> sourceFunctions = getSourceFunctions(currentFunctionalExchange);
		for (ActivityNode currentFunction : sourceFunctions) {
			if (!EcoreUtil.isAncestor(function, currentFunction)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Retrieves functionalExchange source function.
	 * 
	 * @param functionalExchange
	 * @return the collection of source functions.
	 */
	private static Collection<ActivityNode> getSourceFunctions(FunctionalExchange functionalExchange) {
		Collection<ActivityNode> sourceFunctions = new ArrayList<ActivityNode>();
		ActivityNode sourceActivityNode = functionalExchange.getSource();
		if (sourceActivityNode instanceof FunctionOutputPort)
			sourceFunctions.add((AbstractFunction) (sourceActivityNode.eContainer()));
		else if (sourceActivityNode != null) {
			sourceFunctions.add(sourceActivityNode);
		}
		return sourceFunctions;
	}

	/**
	 * Retrieves functionalExchange target function.
	 * 
	 * @param functionalExchange
	 * @return the collection of target functions.
	 */
	private static Collection<ActivityNode> getTargetFunctions(FunctionalExchange functionalExchange) {
		Collection<ActivityNode> targetFunctions = new ArrayList<ActivityNode>();
		ActivityNode targetActivityNode = functionalExchange.getTarget();
		if (targetActivityNode instanceof FunctionInputPort)
			targetFunctions.add((AbstractFunction) (targetActivityNode.eContainer()));
		else if (targetActivityNode != null) {
			targetFunctions.add(targetActivityNode);
		}
		return targetFunctions;
	}

	private static String getDescription(FunctionalExchange functionalExchange, String projectName, String outputFolder) {
		if (functionalExchange.getDescription() != null)
			return StringUtil.transformAREFString(functionalExchange, functionalExchange.getDescription(), projectName, outputFolder);
		return "";
	}

	/**
	 * 
	 * @param functionalExchange
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static String incomingFunctionalExchangeToTableLine(FunctionalExchange functionalExchange, String projectName, String outputFolder) {
		return functionalExchangeToTableLine(functionalExchange, false, true, projectName, outputFolder);
	}

	/**
	 * 
	 * @param functionalExchange
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static String outgoingFunctionalExchangeToTableLine(FunctionalExchange functionalExchange, String projectName, String outputFolder) {
		return functionalExchangeToTableLine(functionalExchange, false, false, projectName, outputFolder);
	}

	/**
	 * 
	 * @param functionalExchange
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static String externalFunctionalExchangeToTableLine(FunctionalExchange functionalExchange, String projectName, String outputFolder) {
		return functionalExchangeToTableLine(functionalExchange, true, true, projectName, outputFolder);
	}

	private static String functionalExchangeToTableLine(FunctionalExchange functionalExchange, boolean external, boolean incoming, String projectName, String outputFolder) {
		StringBuffer buffer = new StringBuffer();
		CapellaElement distantPort = incoming ? functionalExchange.getSourceFunctionOutputPort() : functionalExchange.getTargetFunctionInputPort();

		if (distantPort != null) {
			buffer.append("<tr>");
			
			buffer.append("<td id=\"" + CapellaServices.getAnchorId(functionalExchange) + "\">");
			buffer.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, functionalExchange));
			buffer.append("</td>");

			// Involving functional chains
			buffer.append("<td>");
			buffer.append(FunctionHelper.getInvolvingFunctionalChains(projectName, outputFolder, functionalExchange));
			buffer.append("</td>");

			// Allocating component Exchanges
			buffer.append("<td>");
			buffer.append(FunctionHelper.getAllocatingComponentExchangess(projectName, outputFolder, functionalExchange));
			buffer.append("</td>");

			// Distant port
			buffer.append("<td>");
			buffer.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, distantPort));
			buffer.append("</td>");

			// Distant function
			buffer.append("<td>");
			Collection<ActivityNode> activityNodes;
			if (incoming)
				activityNodes = getSourceFunctions(functionalExchange);
			else
				activityNodes = getTargetFunctions(functionalExchange);
			for (ActivityNode currentFunction : activityNodes) {
				buffer.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, currentFunction));
			}
			buffer.append("</td>");
			
			// Additional Source or Target function if external
			if (external) {
				buffer.append("<td>");
				Collection<ActivityNode> activityNodesExternal;
				if (!incoming) {
					activityNodesExternal = getSourceFunctions(functionalExchange);
				} else {
					activityNodesExternal = getTargetFunctions(functionalExchange);
				}
				for (ActivityNode currentFunction : activityNodesExternal) {
					buffer.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, currentFunction));
				}
				buffer.append("</td>");
			}
			
			// Description
			buffer.append("<td>");
			buffer.append(getDescription(functionalExchange, projectName, outputFolder));
			buffer.append("</td>");
			
			// Exchange Items
			buffer.append("<td>");
			buffer.append(FunctionHelper.getExchangedItems(functionalExchange, projectName, outputFolder));
			buffer.append("</td>");
			
			//Realized functional Exchange
			buffer.append("<td>");
			buffer.append(FunctionHelper.getRealizedFunctionalExchanges(functionalExchange, projectName, outputFolder));
			buffer.append("</td>");
			
			//Realizing functional Exchange
			buffer.append("<td>");
			buffer.append(FunctionHelper.getRealizingFunctionalExchanges(functionalExchange, projectName, outputFolder));
			buffer.append("</td>");
			
			buffer.append("</tr>");
		}

		return buffer.toString();
	}
	
	/**
	 * Formats an HTML row representation for an incoming FunctionalExchange element
	 * @param functionalExchange
	 * @param projectName
	 * @param outputFolder
	 * @return An HTML row representation for an incoming FunctionalExchange element
	 */
	public static String incomingInteractionToTableLine(FunctionalExchange functionalExchange, String projectName, String outputFolder) {
		return interactionToTableLine(functionalExchange, false, true, false, projectName, outputFolder);
	}

	/**
	 * Formats an HTML row representation for an outgoing FunctionalExchange element
	 * @param functionalExchange
	 * @param projectName
	 * @param outputFolder
	 * @return An HTML row representation for an outgoing FunctionalExchange element
	 */
	public static String outgoingInteractionToTableLine(FunctionalExchange functionalExchange, String projectName, String outputFolder) {
		return interactionToTableLine(functionalExchange, false, false, false, projectName, outputFolder);
	}

	/**
	 * Formats an HTML row representation for an ActivityEdge element
	 * @param functionalExchange
	 * @param projectName
	 * @param outputFolder
	 * @return An HTML row representation for a FunctionalExchange element
	 */
	public static String externalInteractionToTableLine(FunctionalExchange activityEdge, String projectName, String outputFolder) {
		return interactionToTableLine(activityEdge, true, true, true, projectName, outputFolder);
	}
	
	/**
	 * Generic method for the production of an HTML row element for an OperationalInteraction element  
	 * @param activityEdge An OperationalInteraction element
	 * @param external Is the OperationalInteraction element referencing other elements than context on both ends
	 * @param incoming Is the OperationalInteraction element incoming with regards to the context
	 * @param showBothSourceAndTarget Does the output needs to provide HTML columns for both sources and target elements (overrides 'incoming' parameter behavior)
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	private static String interactionToTableLine(FunctionalExchange activityEdge, boolean external, boolean incoming, boolean showBothSourceAndTarget, String projectName,
			String outputFolder) {
		StringBuffer buffer = new StringBuffer();

		buffer.append("<tr>");

		buffer.append("<td id=\"" + CapellaServices.getAnchorId(activityEdge) + "\">");
		buffer.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, activityEdge));
		buffer.append("</td>");
		
		if(external) {
			// Involving functional chains
			buffer.append("<td>");
			buffer.append(FunctionHelper.getInvolvingFunctionalChains(projectName, outputFolder, activityEdge));
			buffer.append("</td>");
		}

		if (incoming || showBothSourceAndTarget) {
			// Source
			buffer.append("<td>");
			buffer.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, activityEdge.getSource()));
			buffer.append("</td>");
		} 
		if (!incoming || showBothSourceAndTarget) {
			// Target
			buffer.append("<td>");
			buffer.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, activityEdge.getTarget()));
			buffer.append("</td>");
		}

		// Description
		buffer.append("<td>");
		buffer.append(getDescription(activityEdge, projectName, outputFolder));
		buffer.append("</td>");
		

		// Exchange Items
		buffer.append("<td>");
		buffer.append(FunctionHelper.getExchangedItems(activityEdge, projectName, outputFolder));
		buffer.append("</td>");
		
		if (external) {
			//Realized functional Exchange
			buffer.append("<td>");
			buffer.append(FunctionHelper.getRealizedFunctionalExchanges(activityEdge, projectName, outputFolder));
			buffer.append("</td>");
			
			//Realizing functional Exchange
			buffer.append("<td>");
			buffer.append(FunctionHelper.getRealizingFunctionalExchanges(activityEdge, projectName, outputFolder));
			buffer.append("</td>");
		}
		
		buffer.append("</tr>");

		return buffer.toString();
	}

	private static Collection<AbstractFunction> getAllSubFunctions(AbstractFunction function) {
		Collection<AbstractFunction> abstractFunctions = new ArrayList<AbstractFunction>();
		for (AbstractFunction currentAbstractFunction : function.getOwnedFunctions()) {
			abstractFunctions.add(currentAbstractFunction);
			if (currentAbstractFunction instanceof AbstractFunction)
				abstractFunctions.addAll(getAllSubFunctions((AbstractFunction) currentAbstractFunction));
		}
		return abstractFunctions;
	}
}
