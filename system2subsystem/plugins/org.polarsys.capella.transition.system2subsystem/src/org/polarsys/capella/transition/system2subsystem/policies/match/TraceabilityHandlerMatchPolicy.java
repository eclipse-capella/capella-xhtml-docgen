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
package org.polarsys.capella.transition.system2subsystem.policies.match;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.diffmerge.api.scopes.IModelScope;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.helpers.EcoreUtil2;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.traceability.ITraceabilityHandler;
import org.polarsys.capella.core.transition.common.merge.scope.TargetModelScope;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 * A match policy for diff/merge within pairs of corresponding elements.
 */
public class TraceabilityHandlerMatchPolicy extends org.polarsys.capella.core.transition.common.policies.match.TraceabilityHandlerMatchPolicy {

  /**
   * Constructor
   * @param a non-null mapping of corresponding elements whose further modifications will impact this policy
   */
  public TraceabilityHandlerMatchPolicy(IContext context_p2) {
    super(context_p2);
  }

  /**
   * Some elements should not be matched even if they are traced to an element from the model source.
   * for instance, a scenario is automatically erased
   * @param element_p
   * @param scope_p
   * @param context_p
   * @return
   */
  @Override
  public boolean isMatchable(EObject element_p, IModelScope scope_p, IContext context_p) {
    Collection<EObject> bounds = new ArrayList<EObject>();

    ITraceabilityHandler handler = null;

    if (scope_p instanceof TargetModelScope) {
      handler = (ITraceabilityHandler) context_p.get(ITransitionConstants.TRACEABILITY_TARGET_MERGE_HANDLER);
    } else {
      handler = (ITraceabilityHandler) context_p.get(ITransitionConstants.TRACEABILITY_SOURCE_MERGE_HANDLER);
    }

    if (scope_p instanceof TargetModelScope) {
      bounds = handler.retrieveSourceElements(element_p, context_p);
      if (bounds.size() > 0) {

        if (InteractionPackage.Literals.SCENARIO.isInstance(element_p)) {
          return false;

        } else if (EcoreUtil2.isContainedBy(element_p, InteractionPackage.Literals.SCENARIO)) {
          return false;
        }
      }
    }

    return true;
  }

}
