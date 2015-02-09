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

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.log.LogHelper;
import org.polarsys.capella.core.transition.common.handlers.selection.ISelectionContext;
import org.polarsys.capella.core.transition.common.handlers.selection.SelectionContextHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.crossphases.handlers.attachment.CrossPhasesAttachmentHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 * 
 */
public class PartRule extends org.polarsys.capella.transition.system2subsystem.rules.cs.PartRule {

  @Override
  protected EObject transformDirectElement(EObject element_p, IContext context_p) {
    EClass targetType = TransformationHandlerHelper.getInstance(context_p).getTargetType(((Part) element_p).getAbstractType(), context_p);
    if (CtxPackage.Literals.SYSTEM.isSuperTypeOf(targetType)) {
      ISelectionContext sContext =
          SelectionContextHandlerHelper.getHandler(context_p).getSelectionContext(context_p, ITransitionConstants.SELECTION_CONTEXT__TRANSFORMATION);

      EObject target = TransformationHandlerHelper.getInstance(context_p).getBestTracedElement(((Part) element_p).getAbstractType(), context_p, sContext);
      Component tComponent = (Component) target;
      if ((tComponent != null) && (tComponent.getRepresentingPartitions() != null) && (tComponent.getRepresentingPartitions().size() > 0)) {
        return tComponent.getRepresentingPartitions().get(0);
      }
    }
    EObject res = super.transformDirectElement(element_p, context_p);
    return res;
  }

  @Override
  public IStatus transformRequired(EObject element_p, IContext context_p) {
    EClass target = TransformationHandlerHelper.getInstance(context_p).getTargetType(((Part) element_p).getAbstractType(), context_p);
    Component e = (Component) ((Part) element_p).getAbstractType();

    if (CtxPackage.Literals.SYSTEM.isSuperTypeOf(target)) {
      Component d = CrossPhasesAttachmentHelper.getInstance(context_p).getRelatedComponent(e, context_p);
      if (d != e) {
        return new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind("Part ''{0}'' is typed by an element transitioned to the System.",
            LogHelper.getInstance().getText(element_p)));
      }
    }
    return super.transformRequired(element_p, context_p);
  }

  @Override
  protected void retrieveGoDeep(EObject source_p, List<EObject> result_p, IContext context_p) {
    super.retrieveGoDeep(source_p, result_p, context_p);

    if (!ContextScopeHandlerHelper.getInstance(context_p).contains(ITransitionConstants.SOURCE_SCOPE, source_p, context_p)) {
      result_p.addAll(((Part) source_p).getDeployingLinks());

    }

  }

  @Override
  protected EObject getBestContainer(EObject element_p, EObject result_p, IContext context_p) {
    return null;
  }
}
