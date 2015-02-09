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
import org.eclipse.emf.diffmerge.api.diff.IReferenceValuePresence;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.core.transition.common.handlers.filter.AbstractFilterItem;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 * 
 *
 */
public class ReferenceOnReconciliation extends AbstractFilterItem {

  /**
   * {@inheritDoc}
   */
  @Override
  public FilterAction getDestinationRole(IDifference difference_p, Role role_p, IContext context_p) {
    if (difference_p instanceof IReferenceValuePresence) {

      //We merge reference if target was a reconciliation with an existing element
      IReferenceValuePresence avp = (IReferenceValuePresence) difference_p;
      if (role_p == Role.REFERENCE) {
        if (isFromReconciliation(avp.getElementMatch().get(Role.TARGET))) {
          if (!avp.getFeature().isContainment() && !avp.getFeature().isDerived()) {
            return FilterAction.TARGET;
          }
        }
      }

    }
    return null;
  }

  /**
   * Returns whether the eObject has been reconciliated with a new element
   * @param eObject_p
   * @return
   */
  protected boolean isFromReconciliation(EObject eObject_p) {
    return (eObject_p != null) && (eObject_p instanceof ModelElement) && (((ModelElement) eObject_p).getSid() == null);
  }

}
