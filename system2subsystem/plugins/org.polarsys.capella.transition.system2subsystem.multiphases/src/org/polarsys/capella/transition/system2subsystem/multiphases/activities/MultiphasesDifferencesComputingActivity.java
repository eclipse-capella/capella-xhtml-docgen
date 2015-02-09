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
package org.polarsys.capella.transition.system2subsystem.multiphases.activities;

import org.eclipse.emf.diffmerge.api.IMatchPolicy;
import org.polarsys.capella.transition.system2subsystem.activities.DifferencesComputingActivity;
import org.polarsys.capella.transition.system2subsystem.multiphases.diffmerge.MultiphasesMatchPolicy;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


public class MultiphasesDifferencesComputingActivity extends DifferencesComputingActivity {

	public static final String ID = "org.polarsys.capella.transition.system2subsystem.multiphases.activities.MultiphasesDifferencesComputingActivity";
	
	@Override
	protected IMatchPolicy createMatchPolicy(IContext context_p) {
		return new MultiphasesMatchPolicy();
	}

}
