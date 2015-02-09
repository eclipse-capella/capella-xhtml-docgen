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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.core.transition.system.rules.fa.ComponentPortRule;
import org.polarsys.capella.transition.system2subsystem.crossphases.handlers.attachment.CrossPhasesAttachmentHelper;
import org.polarsys.capella.transition.system2subsystem.multiphases.MultiphasesActivator;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


public class ComponentPortRules {

  public static class ToSA extends org.polarsys.capella.transition.system2subsystem.crossphases.rules.fa.ComponentPortRule {
    //Nothing more
  }

  public static class ToLA extends ComponentPortRule {

    @Override
    protected EObject getSourceContainer(EObject element_p, EObject result_p, IContext context_p) {
      if (ContextScopeHandlerHelper.getInstance(context_p).contains(ITransitionConstants.SOURCE_SCOPE, element_p.eContainer(), context_p)) {
        return element_p.eContainer();
      } else if (element_p.eContainer() instanceof PhysicalComponent) {
        return CrossPhasesAttachmentHelper.getInstance(context_p).getRelatedComponent((PhysicalComponent) element_p.eContainer(), context_p);
      }
      return element_p.eContainer();
    }

  }

  public static class ToPA extends ComponentPortRule {

    @Override
    protected EObject getSourceContainer(EObject element_p, EObject result_p, IContext context_p) {
      EObject bestContainer = CrossPhasesAttachmentHelper.getInstance(context_p).getRelatedComponent((Component) element_p.eContainer(), context_p);
      return bestContainer;
    }

    @Override
    public IStatus transformRequired(EObject source_p, IContext context_p) {
      if (ContextScopeHandlerHelper.getInstance(context_p).contains(ITransitionConstants.SOURCE_SCOPE, source_p.eContainer(), context_p)) {
        return new Status(IStatus.CANCEL, MultiphasesActivator.PLUGIN_ID, "Won't transform source port");
      }

      return super.transformRequired(source_p, context_p);

    }

  }

}
