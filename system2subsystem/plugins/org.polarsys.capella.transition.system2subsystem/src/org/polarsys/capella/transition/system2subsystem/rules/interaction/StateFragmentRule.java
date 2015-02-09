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
package org.polarsys.capella.transition.system2subsystem.rules.interaction;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.common.ui.services.helper.EObjectLabelProviderHelper;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.interaction.StateFragment;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.handlers.attachment.AttachmentHelper;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 * 
 */
public class StateFragmentRule extends TimeLapseRule {
  /**
   * {@inheritDoc}
   */
  @Override
  protected EClass getSourceType() {
    return InteractionPackage.Literals.STATE_FRAGMENT;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void attachRelated(EObject element_p, EObject result_p, IContext context_p) {
    super.attachRelated(element_p, result_p, context_p);

    StateFragment source = (StateFragment) element_p;
    StateFragment use = (StateFragment) result_p;
    if (source.getRelatedAbstractState() != null) {
      AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, InteractionPackage.Literals.STATE_FRAGMENT__RELATED_ABSTRACT_STATE,
          context_p);
    }
    if (source.getRelatedAbstractFunction() != null) {
      AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, InteractionPackage.Literals.STATE_FRAGMENT__RELATED_ABSTRACT_FUNCTION,
          context_p);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public IStatus transformRequired(EObject source_p, IContext context_p) {

    IStatus result = super.transformRequired(source_p, context_p);
    if (result.isOK()) {
      StateFragment ce = (StateFragment) source_p;

      if (ce.getRelatedAbstractState() != null) {
        if (!TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(ce.getRelatedAbstractState(), context_p).isOK()) {
          return new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind(
              org.polarsys.capella.transition.system2subsystem.constants.Messages.SourceBoundNotTransitioned,
              EObjectLabelProviderHelper.getText(ce.getRelatedAbstractState())));
        }
      }
      if (ce.getRelatedAbstractFunction() != null) {
        if (!TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(ce.getRelatedAbstractFunction(), context_p).isOK()) {
          return new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind(
              org.polarsys.capella.transition.system2subsystem.constants.Messages.SourceBoundNotTransitioned,
              EObjectLabelProviderHelper.getText(ce.getRelatedAbstractFunction())));
        }
      }
    }
    return result;

  }

}
