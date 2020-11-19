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

import org.polarsys.capella.core.data.capellacommon.Region;
import org.polarsys.capella.common.data.modellingcore.IState;
import org.polarsys.capella.docgen.util.CapellaServices;

public class RegionHelper {

	public static Collection<String> getState(String projectName, String outputFolder, Region region) {
		Collection<String> ret = new ArrayList<String>();
		for (IState currentState : region.getInvolvedStates()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(currentState, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(currentState));

			if (!region.getOwnedStates().contains(currentState)) {
				buffer.append(" <em><span style=\"font-size:10px; color:#999999\">(");
				buffer.append(CapellaStateHelper.getPathFromStateMachine(currentState));
				buffer.append(")</span></em>");
			}
			ret.add(buffer.toString());
		}
		return ret;
	}

}
