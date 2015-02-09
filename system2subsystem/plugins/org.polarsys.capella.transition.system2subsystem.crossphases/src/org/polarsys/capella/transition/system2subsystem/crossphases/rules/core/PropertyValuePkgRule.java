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
package org.polarsys.capella.transition.system2subsystem.crossphases.rules.core;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.transition.system2subsystem.crossphases.handlers.attachment.CrossPhasesAttachmentHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


public class PropertyValuePkgRule extends org.polarsys.capella.transition.system2subsystem.rules.core.PropertyValuePkgRule {

  @Override
  protected EObject getSourceContainer(EObject element_p, EObject result_p, IContext context_p) {
    if (element_p.eContainer() instanceof Component) {
      EObject bestContainer = CrossPhasesAttachmentHelper.getInstance(context_p).getRelatedComponent((Component) element_p.eContainer(), context_p);
      return bestContainer;
    }
    return super.getSourceContainer(element_p, result_p, context_p);
  }

}
