/*******************************************************************************
 * Copyright (c) 2006, 2019 THALES GLOBAL SERVICES.
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
		for (SystemComponent involvedElement : mission.getInvolvedSystemComponents()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(involvedElement, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(involvedElement));
			ret.add(buffer.toString());
		}
		return ret;
	}
}
