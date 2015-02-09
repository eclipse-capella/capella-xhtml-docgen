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
package org.polarsys.capella.transition.system2subsystem.activities;

import org.eclipse.emf.diffmerge.api.IMatchPolicy;
import org.polarsys.capella.transition.system2subsystem.policies.match.TraceabilityHandlerMatchPolicy;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 * 
 */
public class DifferencesComputingActivity extends org.polarsys.capella.core.transition.common.activities.DifferencesComputingActivity {

  public static final String ID = "org.polarsys.capella.transition.system2subsystem.activities.DifferencesComputingActivity"; //$NON-NLS-1$

  /**
   * @return
   */
  @Override
  protected IMatchPolicy createMatchPolicy(IContext context_p) {
    IMatchPolicy policy = new TraceabilityHandlerMatchPolicy(context_p);
    return policy;
  }

}
