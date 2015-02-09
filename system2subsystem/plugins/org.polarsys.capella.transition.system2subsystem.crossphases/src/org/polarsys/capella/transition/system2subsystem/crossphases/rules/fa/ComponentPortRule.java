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
package org.polarsys.capella.transition.system2subsystem.crossphases.rules.fa;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.model.helpers.ComponentExchangeExt;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.log.LogHelper;
import org.polarsys.capella.transition.system2subsystem.crossphases.handlers.attachment.CrossPhasesAttachmentHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


public class ComponentPortRule extends org.polarsys.capella.core.transition.system.rules.fa.ComponentPortRule {

  @Override
  public IStatus transformRequired(EObject source_p, IContext context_p) {

    ComponentPort cp = (ComponentPort) source_p;

    if (cp.getComponentExchanges().isEmpty()) {
      //we transform not connected ports
      return super.transformRequired(source_p, context_p);
    }

    for (ComponentExchange exchange : cp.getComponentExchanges()) {

      Component sourceComponent = ComponentExchangeExt.getSourceComponent(exchange);
      boolean sourceComponentIncluded =
          ContextScopeHandlerHelper.getInstance(context_p).contains(ITransitionConstants.SOURCE_SCOPE, sourceComponent, context_p);

      Component targetComponent = ComponentExchangeExt.getTargetComponent(exchange);
      boolean targetComponentIncluded =
          ContextScopeHandlerHelper.getInstance(context_p).contains(ITransitionConstants.SOURCE_SCOPE, targetComponent, context_p);

      if (targetComponentIncluded ^ sourceComponentIncluded) {
        return super.transformRequired(source_p, context_p);
      }
    }

    return new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind("ComponentPort ''{0}'' is linked to internal elements", LogHelper
        .getInstance().getText(cp)));
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
