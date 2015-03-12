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

import org.polarsys.capella.core.data.ctx.ActorMissionInvolvement;
import org.polarsys.capella.core.data.ctx.Capability;
import org.polarsys.capella.core.data.ctx.Mission;
import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.docgen.util.CapellaServices;

public class CapellaMissionHelper {

	public static Collection<String> getCapabilities(String projectName, String outputFolder, Mission mission) {
		Collection<String> ret = new ArrayList<String>();
		for (Capability currentCapability : mission.getExploitedCapabilities()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(currentCapability, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(currentCapability));
			ret.add(buffer.toString());
		}
		return ret;
	}

	public static Collection<String> getInvolvedActors(String projectName, String outputFolder, Mission mission) {
		Collection<String> ret = new ArrayList<String>();
		for (ActorMissionInvolvement currentInvolvement : mission.getInvolvedActors()) {
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
