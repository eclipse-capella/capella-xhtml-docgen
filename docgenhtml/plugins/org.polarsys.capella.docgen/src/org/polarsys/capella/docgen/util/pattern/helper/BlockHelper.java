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

import org.polarsys.capella.core.data.cs.Block;
import org.polarsys.capella.core.data.capellacommon.StateMachine;
import org.polarsys.capella.docgen.util.CapellaServices;

public class BlockHelper {

	public static Collection<String> getStateMachine(String projectName, String outputFolder, Block block) {
		Collection<String> ret = new ArrayList<String>();
		for (StateMachine currentStateMachine : block.getOwnedStateMachines()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(currentStateMachine, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(currentStateMachine));
			ret.add(buffer.toString());
		}
		return ret;
	}
}
