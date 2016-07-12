/*******************************************************************************
 * Copyright (c) 2006, 2016 THALES GLOBAL SERVICES.
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.ctx.Capability;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.capellacommon.Region;
import org.polarsys.capella.core.data.capellacommon.State;
import org.polarsys.capella.core.data.capellacommon.StateMachine;
import org.polarsys.capella.core.data.capellacommon.StateTransition;
import org.polarsys.capella.core.semantic.queries.basic.queries.AbstractStateAvailableElements;
import org.polarsys.capella.common.data.behavior.AbstractEvent;
import org.polarsys.capella.common.data.modellingcore.IState;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.docgen.util.StringUtil;

public class CapellaStateHelper {

	public static String getDoActivity(String projectName, String outputFolder, State state) {
		StringBuffer ret = new StringBuffer();
		EList<AbstractEvent> abstractEvents = state.getDoActivity();
		for (AbstractEvent event : abstractEvents) 
		{
			if (event != null) {
				StringBuffer buffer = new StringBuffer();
				buffer.append(CapellaServices.getImageLinkFromElement(event, projectName, outputFolder));
				buffer.append(" ");
				buffer.append(CapellaServices.getHyperlinkFromElement(event));
				ret.append(CapellaServices.NEW_LINE) ;
				ret.append(buffer) ;
			}
		}
		
		return ret.toString();
	}

	public static Collection<String> getOwnedReferencedStatesModes(String projectName, String outputFolder, State state) {
		Collection<String> ret = new ArrayList<String>();
		Map<Region, List<IState>> orderedByRegion = new HashMap<Region, List<IState>>();
		for (IState currentStateMode : state.getReferencedStates()) {
			if (getEObjectPathFromStateMachine(currentStateMode).contains(state)) {
				EObject parent = currentStateMode.eContainer();
				if (parent instanceof Region) {
					Region region = (Region) parent;
					List<IState> list = orderedByRegion.get(region);
					if (list != null) {
						list.add(currentStateMode);
					} else {
						List<IState> tempList = new ArrayList<IState>();
						tempList.add(currentStateMode);
						orderedByRegion.put(region, tempList);
					}
				}
			}
		}
		for (Region currentRegion : orderedByRegion.keySet()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(currentRegion, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(currentRegion));
			Collection<String> subRet = new ArrayList<String>();
			for (IState regionState : orderedByRegion.get(currentRegion)) {
				StringBuffer buffer2 = new StringBuffer();
				buffer2.append(CapellaServices.getImageLinkFromElement(regionState, projectName, outputFolder));
				buffer2.append(" ");
				buffer2.append(CapellaServices.getHyperlinkFromElement(regionState));
				subRet.add(buffer2.toString());
			}

			buffer.append(StringUtil.stringListToBulette(subRet));
			ret.add(buffer.toString());
		}
		return ret;
	}

	public static Collection<String> getReferencedStatesModes(String projectName, String outputFolder, State state) {
		Collection<String> ret = new ArrayList<String>();
		for (IState currentStateMode : state.getReferencedStates()) {
			if (!getEObjectPathFromStateMachine(currentStateMode).contains(state)) {
				StringBuffer buffer = new StringBuffer();
				buffer.append(CapellaServices.getImageLinkFromElement(currentStateMode, projectName, outputFolder));
				buffer.append(" ");
				buffer.append(CapellaServices.getHyperlinkFromElement(currentStateMode));
				buffer.append(" <em><span style=\"font-size:10px; color:#999999\">(");
				buffer.append(getPathFromStateMachine(currentStateMode));
				buffer.append(")</span></em>");
				ret.add(buffer.toString());
			}
		}
		return ret;
	}

	public static Collection<String> getPreviousStatesModes(String projectName, String outputFolder, State state) {
		Collection<String> ret = new ArrayList<String>();
		for (StateTransition currentAbstractStateTransition : state.getIncoming()) {
			IState source = currentAbstractStateTransition.getSource();
			if (source != null) {
				StringBuffer buffer = new StringBuffer();
				buffer.append(CapellaServices.getImageLinkFromElement(source, projectName, outputFolder));
				buffer.append(" ");
				buffer.append(CapellaServices.getHyperlinkFromElement(source));
				ret.add(buffer.toString());
			}
		}
		return ret;
	}

	public static Collection<String> getFollowingStatesModes(String projectName, String outputFolder, State state) {
		Collection<String> ret = new ArrayList<String>();
		for (StateTransition currentAbstractStateTransition : state.getOutgoing()) {
			IState target = currentAbstractStateTransition.getTarget();
			if (target != null) {
				StringBuffer buffer = new StringBuffer();
				buffer.append(CapellaServices.getImageLinkFromElement(target, projectName, outputFolder));
				buffer.append(" ");
				buffer.append(CapellaServices.getHyperlinkFromElement(target));
				ret.add(buffer.toString());
			}
		}
		return ret;
	}

	public static Collection<String> getFunctions(String projectName, String outputFolder, State state) {
		Collection<String> ret = new ArrayList<String>();
		AbstractStateAvailableElements query = new AbstractStateAvailableElements();
		List<Object> list = query.compute(state);
		for (Object currentObject : list) {
			if (currentObject instanceof AbstractFunction) {
				StringBuffer buffer = new StringBuffer();
				buffer.append(CapellaServices.getImageLinkFromElement((AbstractFunction) currentObject, projectName, outputFolder));
				buffer.append(" ");
				buffer.append(CapellaServices.getHyperlinkFromElement((AbstractFunction) currentObject));
				ret.add(buffer.toString());
			}
		}
		return ret;
	}

	public static Collection<String> getFunctionalChain(String projectName, String outputFolder, State state) {
		Collection<String> ret = new ArrayList<String>();
		AbstractStateAvailableElements query = new AbstractStateAvailableElements();
		List<Object> list = query.compute(state);
		for (Object currentObject : list) {
			if (currentObject instanceof FunctionalChain) {
				StringBuffer buffer = new StringBuffer();
				buffer.append(CapellaServices.getImageLinkFromElement((FunctionalChain) currentObject, projectName, outputFolder));
				buffer.append(" ");
				buffer.append(CapellaServices.getHyperlinkFromElement((FunctionalChain) currentObject));
				ret.add(buffer.toString());
			}
		}
		return ret;
	}

	public static Collection<String> getCapabilities(String projectName, String outputFolder, State state) {
		Collection<String> ret = new ArrayList<String>();
		AbstractStateAvailableElements query = new AbstractStateAvailableElements();
		List<Object> list = query.compute(state);
		for (Object currentObject : list) {
			if (currentObject instanceof Capability) {
				StringBuffer buffer = new StringBuffer();
				buffer.append(CapellaServices.getImageLinkFromElement((Capability) currentObject, projectName, outputFolder));
				buffer.append(" ");
				buffer.append(CapellaServices.getHyperlinkFromElement((Capability) currentObject));
				ret.add(buffer.toString());
			}
		}
		return ret;
	}

	public static String getPathFromStateMachine(IState state) {
		StringBuffer buffer = new StringBuffer();
		Iterator<EObject> iterator = getEObjectPathFromStateMachine(state).iterator();
		while (iterator.hasNext()) {
			buffer.append(CapellaServices.getHyperlinkFromElement(iterator.next()));
			if (iterator.hasNext()) {
				buffer.append(" > ");
			}
		}
		return buffer.toString();
	}

	private static List<EObject> getEObjectPathFromStateMachine(EObject element) {
		List<EObject> eObjects = new ArrayList<EObject>();
		EObject parent = element.eContainer();
		if (parent instanceof StateMachine) {
			eObjects.add(parent);
		} else if (parent instanceof EObject) {
			eObjects.addAll(getEObjectPathFromStateMachine(parent));
		}
		eObjects.add(element);
		return eObjects;
	}
}
