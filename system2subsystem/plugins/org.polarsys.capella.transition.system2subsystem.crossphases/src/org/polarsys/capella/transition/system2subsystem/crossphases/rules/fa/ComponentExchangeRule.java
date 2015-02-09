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
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.model.helpers.ComponentExchangeExt;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

public class ComponentExchangeRule extends org.polarsys.capella.transition.system2subsystem.rules.fa.ComponentExchangeRule {

  /**
   * {@inheritDoc}
   */
  @Override
  public IStatus transformRequired(EObject element_p, IContext context_p) {
    IStatus result = super.transformRequired(element_p, context_p);

    if (result.isOK()) {
      ComponentExchange element = (ComponentExchange) element_p;
      EObject sourceElement = ComponentExchangeExt.getSourcePort(element);
      EObject targetElement = ComponentExchangeExt.getTargetPort(element);

      result = TransformationHandlerHelper.getInstance(context_p).checkTransformRequired(element_p, context_p, sourceElement, targetElement);
    }
    return result;
  }
}
