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
package org.polarsys.capella.docgen.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.common.data.activity.ActivityEdge;
import org.polarsys.capella.core.data.fa.FunctionInputPort;
import org.polarsys.capella.core.data.fa.FunctionOutputPort;
import org.polarsys.capella.core.data.fa.FunctionPort;
import org.polarsys.capella.core.data.fa.FunctionalExchange;

public class CapellaFunctionPortServices {
	
	/**
	 * 
	 * @param port
	 * @return
	 */
	public static Collection<FunctionalExchange> getIncomingFunctionalExchanges(FunctionPort port) {
		Collection<FunctionalExchange> functionalExchanges = new ArrayList<FunctionalExchange>();
		if(port instanceof FunctionInputPort) {
			EList<ActivityEdge> incomingActivityEdges = ((FunctionInputPort)port).getIncoming();
			for (ActivityEdge activityEdge : incomingActivityEdges) {
				if (activityEdge instanceof FunctionalExchange) {
					functionalExchanges.add((FunctionalExchange) activityEdge);
				}
			}
		}
		return functionalExchanges;
	}

	/**
	 * 
	 * @param port
	 * @return
	 */
	public static Collection<FunctionalExchange> getOutgoingFunctionalExchanges(FunctionPort port) {
		Collection<FunctionalExchange> functionalExchanges = new ArrayList<FunctionalExchange>();
		if(port instanceof FunctionOutputPort) {
			EList<ActivityEdge> incomingActivityEdges = ((FunctionOutputPort)port).getOutgoing();
			for (ActivityEdge activityEdge : incomingActivityEdges) {
				if (activityEdge instanceof FunctionalExchange) {
					functionalExchanges.add((FunctionalExchange) activityEdge);
				}
			}
		}
		return functionalExchanges;
	}
}
