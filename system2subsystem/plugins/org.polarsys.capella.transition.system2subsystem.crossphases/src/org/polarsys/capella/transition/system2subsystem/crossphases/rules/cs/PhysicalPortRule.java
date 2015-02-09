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
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.cs.PhysicalPort;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.crossphases.handlers.attachment.CrossPhasesAttachmentHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


public class PhysicalPortRule extends org.polarsys.capella.core.transition.system.rules.cs.PhysicalPortRule {

  /**
   * Physical ports are only considered if the other end is not in the reference scope.
   */
  @Override
  public IStatus transformRequired(EObject source_p, IContext context_p) {
    IStatus result = super.transformRequired(source_p, context_p);
    PhysicalPort port = (PhysicalPort) source_p;

    if (port.getInvolvedLinks().isEmpty()) {
      return super.transformRequired(source_p, context_p);
    }
    boolean isInternalPort = true;
    for (PhysicalLink link : port.getInvolvedLinks()) {
      for (AbstractPhysicalLinkEnd end : link.getLinkEnds()) {

        if (!ContextScopeHandlerHelper.getInstance(context_p).contains(ITransitionConstants.SOURCE_SCOPE,
            org.polarsys.capella.core.data.helpers.cs.services.PhysicalLinkExt.getRelatedPort(end), context_p)) {
          isInternalPort = false;
          break;
        }
      }
    }
    if (isInternalPort) {
      result = new Status(IStatus.CANCEL, Messages.Activity_Transformation, "Won't transform physical port that only connects internal components");
    }
    return result;
  }

  @Override
  protected EObject getSourceContainer(EObject element_p, EObject result_p, IContext context_p) {
    EObject bestContainer = CrossPhasesAttachmentHelper.getInstance(context_p).getRelatedComponent((Component) element_p.eContainer(), context_p);
    return bestContainer;
  }

  @Override
  protected void updateElement(EObject element_p, EObject result_p, IContext context_p) {
    super.updateElement(element_p, result_p, context_p);
  }
}
