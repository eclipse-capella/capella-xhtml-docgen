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

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.transition.common.handlers.IHandler;
import org.polarsys.capella.core.transition.common.handlers.traceability.CompoundTraceabilityHandler;
import org.polarsys.capella.core.transition.common.handlers.traceability.config.ITraceabilityConfiguration;
import org.polarsys.capella.core.transition.common.merge.scope.IModelScopeFilter;
import org.polarsys.capella.core.transition.system.activities.InitializeDiffMergeActivity;
import org.polarsys.capella.transition.system2subsystem.multiphases.handlers.traceability.config.MultiphasesSourceConfiguration;
import org.polarsys.capella.transition.system2subsystem.multiphases.handlers.traceability.config.MultiphasesTargetConfiguration;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;



/**
 *
 */
public class InitializeMultiphasesDiffMergeActivity extends InitializeDiffMergeActivity {

  public static final String ID = "org.polarsys.capella.transition.system2subsystem.multiphases.activities.InitializeMultiphasesDiffMergeActivity"; //$NON-NLS-1$
  
  @Override
  protected IHandler createDefaultTraceabilitySourceHandler(IContext context_p) {
    ITraceabilityConfiguration configuration = new MultiphasesSourceConfiguration();
    return new CompoundTraceabilityHandler(configuration);
  }

  @Override
  protected IHandler createDefaultTraceabilityTargetHandler(IContext context_p) {
    ITraceabilityConfiguration configuration = new MultiphasesTargetConfiguration();
    return new CompoundTraceabilityHandler(configuration);
  }

  @Override
  protected IModelScopeFilter getTargetFilter(final IContext context_p) {
    return new IModelScopeFilter() {
      public boolean accepts(EObject element_p) {
        return true;
      }
    };
  }

}
