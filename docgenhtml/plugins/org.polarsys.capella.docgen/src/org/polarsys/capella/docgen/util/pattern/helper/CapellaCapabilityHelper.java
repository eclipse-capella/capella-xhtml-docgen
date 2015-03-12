/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
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

import org.polarsys.capella.core.data.cs.SystemComponentCapabilityRealizationInvolvement;
import org.polarsys.capella.core.data.ctx.Actor;
import org.polarsys.capella.core.data.ctx.Capability;
import org.polarsys.capella.core.data.ctx.Mission;
import org.polarsys.capella.core.data.helpers.ctx.services.CapabilityExt;
import org.polarsys.capella.core.data.interaction.AbstractCapability;
import org.polarsys.capella.core.data.interaction.AbstractFunctionAbstractCapabilityInvolvement;
import org.polarsys.capella.core.data.la.CapabilityRealization;
import org.polarsys.capella.core.data.capellacommon.State;
import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.docgen.util.CapellaServices;

public class CapellaCapabilityHelper {
	public static CapellaCapabilityHelper INSTANCE = new CapellaCapabilityHelper();

	private CapellaCapabilityHelper() {

	}

	public Collection<String> getExploitingMissions(String projectName, String outputFolder, Capability capability) {
		Collection<String> ret = new ArrayList<String>();
		for (Mission m : CapabilityExt.getPurposeMissions(capability)) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(m, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(m));
			ret.add(buffer.toString());
		}
		return ret;
	}

	public Collection<String> getInvolvedActors(String projectName, String outputFolder, Capability capability) {
		Collection<String> ret = new ArrayList<String>();
		for (Actor currentActor : CapabilityExt.getInvolvedActors(capability)) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(currentActor, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(currentActor));
			ret.add(buffer.toString());
		}
		return ret;
	}

	public Collection<String> getExtendedCapabilities(String projectName, String outputFolder, Capability capability) {
		Collection<String> ret = new ArrayList<String>();
		for (AbstractCapability currentCapability : capability.getExtendedAbstractCapabilities()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(currentCapability, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(currentCapability));
			ret.add(buffer.toString());
		}
		return ret;
	}

	public Collection<String> getIncludedCapabilities(String projectName, String outputFolder, Capability capability) {
		Collection<String> ret = new ArrayList<String>();
		for (AbstractCapability currentCapability : capability.getIncludedAbstractCapabilities()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(currentCapability, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(currentCapability));
			ret.add(buffer.toString());
		}
		return ret;
	}

	public Collection<String> getParentCapabilities(String projectName, String outputFolder, Capability capability) {
		Collection<String> ret = new ArrayList<String>();
		for (AbstractCapability currentCapability : capability.getSuper()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(currentCapability, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(currentCapability));
			ret.add(buffer.toString());
		}
		return ret;
	}

	public Collection<String> getInvolvedFunctions(String projectName, String outputFolder, AbstractCapability capability) {
		Collection<String> ret = new ArrayList<String>();
		for (AbstractFunctionAbstractCapabilityInvolvement currentCapabilityInvolvement : capability.getOwnedAbstractFunctionAbstractCapabilityInvolvements()) {
			InvolvedElement involvedElement = currentCapabilityInvolvement.getInvolved();
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(involvedElement, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(involvedElement));
			ret.add(buffer.toString());
		}
		return ret;
	}

	public Collection<String> getAvailableModeAndState(String projectName, String outputFolder, Capability capability) {
		Collection<String> ret = new ArrayList<String>();
		for (State currentStateMode : capability.getAvailableInStates()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(currentStateMode, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(currentStateMode));
			ret.add(buffer.toString());
		}
		return ret;
	}

	public Collection<String> getInvolvedComponent(String projectName, String outputFolder, CapabilityRealization capability) {
		Collection<String> ret = new ArrayList<String>();
		for (SystemComponentCapabilityRealizationInvolvement currentInvolvement : capability.getInvolvedSystemComponents()) {
			InvolvedElement involvedElement = currentInvolvement.getInvolved();
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(involvedElement, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(involvedElement));
			ret.add(buffer.toString());
		}
		return ret;
	}

}
