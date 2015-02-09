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
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.cs.PhysicalLinkCategory;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.log.LogHelper;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

public class PhysicalLinkCategoryRule extends org.polarsys.capella.transition.system2subsystem.rules.cs.PhysicalLinkCategoryRule {

  /**
   * {@inheritDoc}
   */
  @Override
  public IStatus transformRequired(EObject source_p, IContext context_p) {
    IStatus status = super.transformRequired(source_p, context_p);

    if (status.isOK()) {
      PhysicalLinkCategory category = (PhysicalLinkCategory) source_p;

      boolean shouldTransform = false;
      for (PhysicalLink link : category.getLinks()) {
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

}
