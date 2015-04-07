/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.transition.system2subsystem.multiphases.rules;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.InterfaceUse;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalComponentNature;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.crossphases.rules.cs.InterfaceUseRule;
import org.polarsys.capella.transition.system2subsystem.multiphases.MultiphasesActivator;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

public class InterfaceUseRules {
	public static class ToSA extends InterfaceUseRule {
		// Nothing more
	}

	public static class ToLA extends InterfaceUseRule {
		// Nothing more
	}

	public static class ToPA extends InterfaceUseRule {
		@Override
		public IStatus transformRequired(EObject element_p, IContext context_p) {
			IStatus result = Status.OK_STATUS;
			if (element_p instanceof InterfaceUse) {
				/* Ignore InterfaceUse for Behavioral Components since they are not created in PA */
				Component user = ((InterfaceUse) element_p).getInterfaceUser();
				if (user instanceof PhysicalComponent 
						&& ContextScopeHandlerHelper.getInstance(context_p).contains(ITransitionConstants.SOURCE_SCOPE, element_p, context_p)
						&& ((PhysicalComponent)user).getNature() == PhysicalComponentNature.BEHAVIOR) {

					result = new Status(IStatus.WARNING, MultiphasesActivator.PLUGIN_ID, "SKIPPING");
				}
			}
			return result;
		}
	}
}
