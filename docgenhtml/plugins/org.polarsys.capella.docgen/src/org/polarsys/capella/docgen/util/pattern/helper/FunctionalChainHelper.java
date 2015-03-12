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

import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.capellacommon.State;
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
}
