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
package org.polarsys.capella.transition.system2subsystem.interphases.activities;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;


import org.polarsys.capella.core.transition.common.handlers.IHandler;
import org.polarsys.capella.core.transition.common.handlers.traceability.CompoundTraceabilityHandler;
import org.polarsys.capella.core.transition.common.handlers.traceability.config.ITraceabilityConfiguration;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.merge.scope.IModelScopeFilter;
import org.polarsys.capella.core.transition.common.merge.scope.ITargetModelScope;
import org.polarsys.capella.transition.system2subsystem.interphases.handlers.traceability.config.SourceConfiguration;
import org.polarsys.capella.transition.system2subsystem.interphases.handlers.traceability.config.TargetConfiguration;


import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 *
 */
public class InitializeDiffMergeActivity extends org.polarsys.capella.core.transition.system.activities.InitializeDiffMergeActivity {

  public static final String ID = "org.polarsys.capella.transition.system2subsystem.interphases.activities.InitializeDiffMergeActivity"; //$NON-NLS-1$

  @Override
  protected IHandler createDefaultTraceabilitySourceHandler(IContext context_p) {
    ITraceabilityConfiguration configuration = new SourceConfiguration();
    return new CompoundTraceabilityHandler(configuration);
  }

  @Override
  protected IHandler createDefaultTraceabilityTargetHandler(IContext context_p) {
    ITraceabilityConfiguration configuration = new TargetConfiguration();
    return new CompoundTraceabilityHandler(configuration);
  }

  @Override
  protected IModelScopeFilter getTargetFilter(final IContext context_p) {
    return new IModelScopeFilter() {
      public boolean accepts(EObject element_p) {
        Collection<EObject> scope = (Collection) context_p.get(ITransitionConstants.TRANSITION_SOURCES);
        EObject source = scope.iterator().next();

        // In interphases, we filter the target according to the source architecture eClass.
        // Interphase is disabled in EPBS, so we don't have to reup to physical
        BlockArchitecture architectureSource = BlockArchitectureExt.getRootBlockArchitecture(source);
        BlockArchitecture architectureElement = BlockArchitectureExt.getRootBlockArchitecture(element_p);
        if ((architectureElement == null) || (architectureSource == null)) {
          return true;
        }

        if (architectureSource.eClass().isInstance(architectureElement)) {
          return true;
        }

        // For all elements in other architecture, element is in the scope if it is in the transformed model
        Object targetScope = context_p.get(ITransitionConstants.MERGE_TARGET_SCOPE);
        if ((targetScope != null) && (targetScope instanceof ITargetModelScope)) {
          if (((ITargetModelScope) targetScope).retrieveTransformedElementsFromTarget(element_p).size() > 0) {
            return true;
          }
        }

        return false;
      }
    };
  }

}
