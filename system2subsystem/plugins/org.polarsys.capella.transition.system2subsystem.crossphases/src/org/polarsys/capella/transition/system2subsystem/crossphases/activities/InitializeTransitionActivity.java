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
package org.polarsys.capella.transition.system2subsystem.crossphases.activities;

import org.eclipse.core.runtime.IStatus;
import org.polarsys.capella.core.transition.common.handlers.IHandler;
import org.polarsys.capella.core.transition.common.handlers.traceability.CompoundTraceabilityHandler;
import org.polarsys.capella.core.transition.common.handlers.traceability.config.ITraceabilityConfiguration;
import org.polarsys.capella.transition.system2subsystem.constants.ISubSystemConstants;
import org.polarsys.capella.transition.system2subsystem.crossphases.handlers.attachment.ScenarioAttachmentHelper;
import org.polarsys.capella.transition.system2subsystem.crossphases.handlers.traceability.config.TargetConfiguration;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 * 
 */
public class InitializeTransitionActivity extends org.polarsys.capella.transition.system2subsystem.activities.InitializeTransitionActivity {

  public static final String ID = "org.polarsys.capella.transition.system2subsystem.crossphases.activities.InitializeTransitionActivity"; //$NON-NLS-1$

  @Override
  protected String getDefaultOptionsScope() {
    return "capella.core.transition.system2subsystem.crossphases"; //$NON-NLS-1$
  }

  @Override
  protected IStatus initializeContext(IContext context_p, ActivityParameters activityParams_p) {
    IStatus result = super.initializeContext(context_p, activityParams_p);

    IHandler handler = new ScenarioAttachmentHelper();
    handler.init(context_p);
    context_p.put(ISubSystemConstants.SCENARIO_ATTACHMENT_HELPER, handler);

    return result;
  }

  @Override
  protected IHandler createDefaultTraceabilityTargetHandler() {
    ITraceabilityConfiguration configuration = new TargetConfiguration();
    return new CompoundTraceabilityHandler(configuration);
  }

}
