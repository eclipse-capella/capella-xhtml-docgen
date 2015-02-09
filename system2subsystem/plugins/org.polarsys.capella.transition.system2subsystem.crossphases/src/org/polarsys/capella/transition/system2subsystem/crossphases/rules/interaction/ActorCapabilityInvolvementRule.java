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
package org.polarsys.capella.transition.system2subsystem.crossphases.rules.interaction;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.Involvement;
import org.polarsys.capella.core.data.capellacore.InvolverElement;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.interaction.AbstractCapability;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.selection.ISelectionContext;
import org.polarsys.capella.core.transition.common.handlers.selection.SelectionContextHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.crossphases.handlers.attachment.CrossPhasesAttachmentHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 * 
 */
public class ActorCapabilityInvolvementRule extends org.polarsys.capella.transition.system2subsystem.rules.interaction.ActorCapabilityInvolvementRule {

  @Override
  protected EClass getSourceType() {
    return CapellacorePackage.Literals.INVOLVEMENT;
  }

  @Override
  protected EObject transformDirectElement(EObject element_p, IContext context_p) {

    EClass targetType = getTargetType(element_p, context_p);

    Involvement involvment = (Involvement) element_p;
    if (involvment.getInvolved() != null) {
      if (involvment.getInvolved() instanceof Component) {
        Component component = (Component) involvment.getInvolved();
        Component element = CrossPhasesAttachmentHelper.getInstance(context_p).getRelatedComponent(component, context_p);
        ISelectionContext sContext =
            SelectionContextHandlerHelper.getHandler(context_p).getSelectionContext(context_p, ITransitionConstants.SELECTION_CONTEXT__TRANSFORMATION);

        EObject target = TransformationHandlerHelper.getInstance(context_p).getBestTracedElement(element, context_p, sContext);
        AbstractCapability capability = (AbstractCapability) involvment.getInvolver();
        EObject targetCapability = TransformationHandlerHelper.getInstance(context_p).getBestTracedElement(capability, context_p, sContext);

        //Add all involving involvements to capabilities
        if (target instanceof InvolvedElement) {
          for (Involvement involvement : ((InvolvedElement) target).getInvolvingInvolvements()) {
            InvolverElement fc = involvement.getInvolver();
            if (targetType.isInstance(involvement)) {
              //And owned in the correct capability
              if (fc.equals(targetCapability)) {
                return involvement;
              }
            }
          }
        }
      }
    }

    return super.transformDirectElement(element_p, context_p);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public EClass getTargetType(EObject element_p, IContext context_p) {
    Involvement involvment = (Involvement) element_p;
    if (involvment.getInvolved() != null) {

      if (ContextScopeHandlerHelper.getInstance(context_p).contains(ITransitionConstants.SOURCE_SCOPE, involvment.getInvolved(), context_p)) {
        return CtxPackage.Literals.SYSTEM_CAPABILITY_INVOLVEMENT;
      }
    }
    return CtxPackage.Literals.ACTOR_CAPABILITY_INVOLVEMENT;
  }

}
