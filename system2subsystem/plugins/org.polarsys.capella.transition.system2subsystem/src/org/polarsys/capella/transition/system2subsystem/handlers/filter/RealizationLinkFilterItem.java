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
package org.polarsys.capella.transition.system2subsystem.handlers.filter;

import org.eclipse.emf.diffmerge.api.Role;
import org.eclipse.emf.diffmerge.api.diff.IDifference;
import org.eclipse.emf.diffmerge.api.diff.IElementRelativeDifference;
import org.eclipse.emf.diffmerge.api.diff.IReferenceValuePresence;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.filter.AbstractFilterItem;
import org.polarsys.capella.core.transition.common.handlers.traceability.ITraceabilityHandler;
import org.polarsys.capella.core.transition.common.handlers.traceability.ITraceabilityTraceHandler;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 * 
 *
 */
public class RealizationLinkFilterItem extends AbstractFilterItem {

  /**
   * @param target_p
   * @return
   */
  private boolean isTrace(EObject element_p, IContext context_p) {
    ITraceabilityHandler sourceHandler = (ITraceabilityHandler) context_p.get(ITransitionConstants.TRACEABILITY_TRANSFORMATION_HANDLER);
    if (sourceHandler instanceof ITraceabilityTraceHandler) {
      ITraceabilityTraceHandler tH = (ITraceabilityTraceHandler) sourceHandler;
      if (tH.isTrace(element_p, context_p)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean isDisplayable(IDifference difference_p, Role role_p, IContext context_p) {

    if (difference_p instanceof IElementRelativeDifference) {
      IElementRelativeDifference diff = (IElementRelativeDifference) difference_p;
      EObject target = diff.getElementMatch().get(Role.TARGET);
      if (isTrace(target, context_p)) {
        return false;
      }
      target = diff.getElementMatch().get(Role.REFERENCE);
      if (isTrace(target, context_p)) {
        return false;
      }

      if (difference_p instanceof IReferenceValuePresence) {
        IReferenceValuePresence ref = (IReferenceValuePresence) difference_p;
        target = ref.getValue().get(Role.TARGET);
        if (isTrace(target, context_p)) {
          return false;
        }
        target = ref.getValue().get(Role.REFERENCE);
        if (isTrace(target, context_p)) {
          return false;
        }
      }
    }

    return true;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isReadOnly(IDifference diff_p, Role role_p, IContext context_p) {
    return role_p == Role.TARGET;
  }

}
