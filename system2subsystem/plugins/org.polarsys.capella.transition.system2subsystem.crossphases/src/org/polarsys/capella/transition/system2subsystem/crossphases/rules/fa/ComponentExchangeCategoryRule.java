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

import java.util.ArrayList;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeCategory;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.handlers.attachment.AttachmentHelper;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.log.LogHelper;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;

public class ComponentExchangeCategoryRule extends org.polarsys.capella.transition.system2subsystem.rules.fa.ComponentExchangeCategoryRule {

  /**
   * {@inheritDoc}
   */
  @Override
  public IStatus transformRequired(EObject source_p, IContext context_p) {
    IStatus status = super.transformRequired(source_p, context_p);

    if (status.isOK()) {
      ComponentExchangeCategory category = (ComponentExchangeCategory) source_p;

      boolean shouldTransform = false;
      for (ComponentExchange link : category.getExchanges()) {
        if (ContextScopeHandlerHelper.getInstance(context_p).contains(ITransitionConstants.SOURCE_SCOPE, link, context_p)) {
          if (TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(link, context_p).isOK()) {
            shouldTransform = true;
            break;
          }

        }
      }

      if (!shouldTransform) {
        return new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind("Category ''{0}'' will not be transformed", LogHelper.getInstance()
            .getText(source_p)));
      }

    }
    return status;
  }

  @Override
  protected void attachRelated(EObject element_p, EObject result_p, IContext context_p) {
    super.attachRelated(element_p, result_p, context_p);
    AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, FaPackage.Literals.COMPONENT_EXCHANGE_CATEGORY__EXCHANGES, context_p);
  }

  @Override
  protected void premicesRelated(EObject element_p, ArrayList<IPremise> needed_p) {
    super.premicesRelated(element_p, needed_p);
    needed_p.addAll(createDefaultPrecedencePremices(element_p, FaPackage.Literals.COMPONENT_EXCHANGE_CATEGORY__EXCHANGES));
  }

}
