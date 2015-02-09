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
package org.polarsys.capella.transition.system2subsystem.crossphases.rules.cs;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.AbstractPhysicalLinkEnd;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.Activator;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


public class PhysicalLinkRule extends org.polarsys.capella.transition.system2subsystem.rules.cs.PhysicalLinkRule {

  /**
   * Physical Links are only considered if one end is in the reference scope and the other end is not.
   */
  @Override
  public IStatus transformRequired(EObject source_p, IContext context_p) {

    IStatus result = super.transformRequired(source_p, context_p);
    PhysicalLink pl = (PhysicalLink) source_p;
    boolean isInternalLink = true;
    for (AbstractPhysicalLinkEnd end : pl.getLinkEnds()) {
      if (!ContextScopeHandlerHelper.getInstance(context_p).contains(ITransitionConstants.SOURCE_SCOPE, end, context_p)) {
        isInternalLink = false;
        break;
      }
    }
    if (isInternalLink) {
      result = new Status(IStatus.CANCEL, Activator.PLUGIN_ID, "Won't transform physical link between internal components");
    }
    return result;
  }
}
