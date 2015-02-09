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
package org.polarsys.capella.transition.system2subsystem.multiphases.rules;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.selection.ISelectionContext;
import org.polarsys.capella.core.transition.common.handlers.selection.SelectionContextHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.capella.core.transition.system.rules.cs.PhysicalPortRule;
import org.polarsys.capella.transition.system2subsystem.crossphases.handlers.attachment.CrossPhasesAttachmentHelper;
import org.polarsys.capella.transition.system2subsystem.multiphases.MultiphasesContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


public class PhysicalPortRules {

  public static class ToSA extends org.polarsys.capella.transition.system2subsystem.crossphases.rules.cs.PhysicalPortRule {
    /**
     * @param element_p
     * @param result_p
     * @param context_p
     * @return
     */
    @Override
    protected EObject getBestContainer(EObject element_p, EObject result_p, IContext context_p) {

      /*
       * If it's in the reference scope the target container is the target logical system
       */
      if (ContextScopeHandlerHelper.getInstance(context_p).contains(ITransitionConstants.SOURCE_SCOPE, element_p, context_p)) {
        return ((MultiphasesContext) context_p).getTempRootComponent();
      }

      /*
       * if it's in the external scope the source container is the related source component of the containing component 
       */
      if (element_p.eContainer() instanceof Component) {
        Component related = CrossPhasesAttachmentHelper.getInstance(context_p).getRelatedComponent((Component) element_p.eContainer(), context_p);
        ISelectionContext sContext =
            SelectionContextHandlerHelper.getHandler(context_p).getSelectionContext(context_p, ITransitionConstants.SELECTION_CONTEXT__TRANSFORMATION,
                element_p, result_p);
        return TransformationHandlerHelper.getInstance(context_p).getBestTracedElement(related, context_p, sContext);
      }

      /*
       * FIXME Container is not a component (Maybe multipart ?)
       */
      return super.getBestContainer(element_p, result_p, context_p);

    }

  }

  public static class ToLA extends org.polarsys.capella.transition.system2subsystem.crossphases.rules.cs.PhysicalPortRule {
    /**
     * @param element_p
     * @param result_p
     * @param context_p
     * @return
     */
    @Override
    protected EObject getBestContainer(EObject element_p, EObject result_p, IContext context_p) {

      /*
       * If it's in the reference scope the target container is the target logical system
       */
      if (ContextScopeHandlerHelper.getInstance(context_p).contains(ITransitionConstants.SOURCE_SCOPE, element_p, context_p)) {
        return ((MultiphasesContext) context_p).getTempRootComponent();
      }

      /*
       * if it's in the external scope the source container is the related source component of the containing component 
       */
      if (element_p.eContainer() instanceof Component) {
        Component related = CrossPhasesAttachmentHelper.getInstance(context_p).getRelatedComponent((Component) element_p.eContainer(), context_p);
        ISelectionContext sContext =
            SelectionContextHandlerHelper.getHandler(context_p).getSelectionContext(context_p, ITransitionConstants.SELECTION_CONTEXT__TRANSFORMATION,
                element_p, result_p);
        return TransformationHandlerHelper.getInstance(context_p).getBestTracedElement(related, context_p, sContext);
      }

      /*
       * FIXME Container is not a component (Maybe multipart ?).
       */
      return super.getBestContainer(element_p, result_p, context_p);

    }

  }

  public static class ToPA extends PhysicalPortRule {

    @Override
    protected EObject getSourceContainer(EObject element_p, EObject result_p, IContext context_p) {
      EObject bestContainer = CrossPhasesAttachmentHelper.getInstance(context_p).getRelatedComponent((Component) element_p.eContainer(), context_p);
      return bestContainer;
    }

  }

}
