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
package org.polarsys.capella.transition.system2subsystem.rules.fa;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.core.data.capellacore.Involvement;
import org.polarsys.capella.core.data.capellacore.InvolverElement;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.interaction.AbstractCapability;
import org.polarsys.capella.core.data.interaction.FunctionalChainAbstractCapabilityInvolvement;
import org.polarsys.capella.core.model.helpers.FunctionalChainExt;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.handlers.log.LogHelper;
import org.polarsys.capella.transition.system2subsystem.handlers.attachment.FunctionalChainAttachmentHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


public class FunctionalChainRule extends org.polarsys.capella.core.transition.system.rules.fa.FunctionalChainRule {

  @Override
  public IStatus transformRequired(EObject element_p, IContext context_p) {
    // transforms if bounds are transformed or will be transformed
    FunctionalChain element = (FunctionalChain) element_p;

    if (!(FunctionalChainExt.isFunctionalChainValid(element))) {
      return new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind("Functional Chain ''{0}'' is not valid.",
          LogHelper.getInstance().getText(element_p)));
    }

    return Status.OK_STATUS;
  }

  @Override
  public void apply(EObject element_p, IContext context_p) throws Exception {
    // Perform a computation of valid involvement
    if (applyRequired(element_p, context_p).isOK()) {
      FunctionalChain element = (FunctionalChain) element_p;
      if (FunctionalChainExt.isFunctionalChainValid(element)) {
        FunctionalChainAttachmentHelper.getInstance(context_p).computeChain(element, context_p);
      }
    }

    super.apply(element_p, context_p);
  }

  @Override
  protected void retrieveGoDeep(EObject source_p, List<EObject> result_p, IContext context_p) {
    super.retrieveGoDeep(source_p, result_p, context_p);
    FunctionalChain element = (FunctionalChain) source_p;

    if (FunctionalChainExt.isFunctionalChainValid(element)) {
      retrieveDeepValidChain(element, result_p, context_p);
    }
  }

  @Override
  protected void retrieveDeepValidChain(EObject source_p, List<EObject> result_p, IContext context_p) {
    FunctionalChain element = (FunctionalChain) source_p;

    super.retrieveDeepValidChain(source_p, result_p, context_p);
    for (Involvement involvement : element.getInvolvingInvolvements()) {
      InvolverElement involver = involvement.getInvolver();

      // Add all involving Capabilities
      if (involvement instanceof FunctionalChainAbstractCapabilityInvolvement) {
        result_p.add(involvement);
        if ((involver != null) && (involver instanceof AbstractCapability)) {
          result_p.add(involver);
        }
      }
    }

    // Add all Owning Capabilities.
    EObject parent = element.eContainer();
    if (parent instanceof AbstractCapability) {
      result_p.add(parent);
    }
  }

}
