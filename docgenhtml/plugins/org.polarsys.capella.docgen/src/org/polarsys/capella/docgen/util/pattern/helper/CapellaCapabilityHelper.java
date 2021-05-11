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

import org.polarsys.capella.core.data.ctx.Capability;
import org.polarsys.capella.core.data.ctx.Mission;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.helpers.ctx.services.CapabilityExt;
import org.polarsys.capella.core.data.interaction.AbstractCapability;
import org.polarsys.capella.core.data.interaction.AbstractFunctionAbstractCapabilityInvolvement;
import org.polarsys.capella.core.data.la.CapabilityRealization;
import org.polarsys.capella.core.data.capellacommon.CapabilityRealizationInvolvedElement;
import org.polarsys.capella.core.data.capellacommon.State;
import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.docgen.util.CapellaServices;

public class CapellaCapabilityHelper {
	public static CapellaCapabilityHelper INSTANCE = new CapellaCapabilityHelper();

	private CapellaCapabilityHelper() {

	}

	public Collection<String> getExploitingMissions(String projectName, String outputFolder, Capability capability) {
		Collection<String> ret = new ArrayList<>();
		for (Mission m : CapabilityExt.getPurposeMissions(capability)) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(CapellaServices.getImageLinkFromElement(m, projectName, outputFolder));
			stringBuilder.append(" ");
			stringBuilder.append(CapellaServices.getHyperlinkFromElement(m));
			ret.add(stringBuilder.toString());
		}
		return ret;
	}

	public Collection<String> getInvolvedActors(String projectName, String outputFolder, Capability capability) {
		Collection<String> ret = new ArrayList<>();
		for (SystemComponent currentSystemComponent : CapabilityExt.getInvolvedSystemComponents(capability)) {
			if (currentSystemComponent.isActor()) {
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append(CapellaServices.getImageLinkFromElement(currentSystemComponent, projectName, outputFolder));
				stringBuilder.append(" ");
				stringBuilder.append(CapellaServices.getHyperlinkFromElement(currentSystemComponent));
				ret.add(stringBuilder.toString());
			}
		}
		return ret;
	}

	public Collection<String> getExtendedCapabilities(String projectName, String outputFolder, Capability capability) {
		Collection<String> ret = new ArrayList<>();
		for (AbstractCapability currentCapability : capability.getExtendedAbstractCapabilities()) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(CapellaServices.getImageLinkFromElement(currentCapability, projectName, outputFolder));
			stringBuilder.append(" ");
			stringBuilder.append(CapellaServices.getHyperlinkFromElement(currentCapability));
			ret.add(stringBuilder.toString());
		}
		return ret;
	}

	public Collection<String> getIncludedCapabilities(String projectName, String outputFolder, Capability capability) {
		Collection<String> ret = new ArrayList<>();
		for (AbstractCapability currentCapability : capability.getIncludedAbstractCapabilities()) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(CapellaServices.getImageLinkFromElement(currentCapability, projectName, outputFolder));
			stringBuilder.append(" ");
			stringBuilder.append(CapellaServices.getHyperlinkFromElement(currentCapability));
			ret.add(stringBuilder.toString());
		}
		return ret;
	}

	public Collection<String> getParentCapabilities(String projectName, String outputFolder, Capability capability) {
		Collection<String> ret = new ArrayList<>();
		for (AbstractCapability currentCapability : capability.getSuper()) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(CapellaServices.getImageLinkFromElement(currentCapability, projectName, outputFolder));
			stringBuilder.append(" ");
			stringBuilder.append(CapellaServices.getHyperlinkFromElement(currentCapability));
			ret.add(stringBuilder.toString());
		}
		return ret;
	}

	public Collection<String> getInvolvedFunctions(String projectName, String outputFolder, AbstractCapability capability) {
		Collection<String> ret = new ArrayList<>();
		for (AbstractFunctionAbstractCapabilityInvolvement currentCapabilityInvolvement : capability.getOwnedAbstractFunctionAbstractCapabilityInvolvements()) {
			InvolvedElement involvedElement = currentCapabilityInvolvement.getInvolved();
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(CapellaServices.getImageLinkFromElement(involvedElement, projectName, outputFolder));
			stringBuilder.append(" ");
			stringBuilder.append(CapellaServices.getHyperlinkFromElement(involvedElement));
			ret.add(stringBuilder.toString());
		}
		return ret;
	}

	public Collection<String> getAvailableModeAndState(String projectName, String outputFolder, Capability capability) {
		Collection<String> ret = new ArrayList<>();
		for (State currentStateMode : capability.getAvailableInStates()) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(CapellaServices.getImageLinkFromElement(currentStateMode, projectName, outputFolder));
			stringBuilder.append(" ");
			stringBuilder.append(CapellaServices.getHyperlinkFromElement(currentStateMode));
			ret.add(stringBuilder.toString());
		}
		return ret;
	}

	public Collection<String> getInvolvedComponent(String projectName, String outputFolder, CapabilityRealization capability) {
		Collection<String> ret = new ArrayList<>();
		for (CapabilityRealizationInvolvedElement involvedElement : capability.getInvolvedComponents()) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(CapellaServices.getImageLinkFromElement(involvedElement, projectName, outputFolder));
			stringBuilder.append(" ");
			stringBuilder.append(CapellaServices.getHyperlinkFromElement(involvedElement));
			ret.add(stringBuilder.toString());
		}
		return ret;
	}

}
