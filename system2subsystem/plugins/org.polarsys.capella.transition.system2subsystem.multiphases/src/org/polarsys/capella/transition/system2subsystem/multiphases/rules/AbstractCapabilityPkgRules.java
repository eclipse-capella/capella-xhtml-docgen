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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.transition.system2subsystem.crossphases.rules.interaction.AbstractCapabilityPkgRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;



public class AbstractCapabilityPkgRules {

	public static class ToSA extends AbstractCapabilityPkgRule {
		
	}
	
	public static class ToLA extends AbstractCapabilityPkgRule {

		@Override
		public EClass getTargetType(EObject element_p, IContext context_p) {
			return LaPackage.Literals.CAPABILITY_REALIZATION_PKG;
		}
		
	}

	public static class ToPA extends AbstractCapabilityPkgRule {
	
		@Override
		public EClass getTargetType(EObject element_p, IContext context_p) {
			return LaPackage.Literals.CAPABILITY_REALIZATION_PKG;
		}
		
	}
	
}
