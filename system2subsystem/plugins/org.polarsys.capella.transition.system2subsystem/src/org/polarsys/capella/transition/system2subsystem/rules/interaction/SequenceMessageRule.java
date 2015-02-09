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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.common.ui.services.helper.EObjectLabelProviderHelper;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.interaction.SequenceMessage;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.handlers.attachment.AttachmentHelper;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.capella.core.transition.system.rules.AbstractCapellaElementRule;
import org.polarsys.kitalpha.transposer.rules.handler.business.premises.PrecedencePremise;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;

/**
 * 
 */
public class SequenceMessageRule extends AbstractCapellaElementRule {

  public SequenceMessageRule() {
    super();
    registerUpdatedAttribute(InteractionPackage.Literals.SEQUENCE_MESSAGE__KIND);
  }

  @Override
  protected EClass getSourceType() {
    return InteractionPackage.Literals.SEQUENCE_MESSAGE;
  }

  @Override
  public List<PrecedencePremise<EObject>> createDefaultCriticalPremices(EObject eObject_p, EReference reference_p) {
    List<PrecedencePremise<EObject>> premices = createDefaultPrecedencePremices(eObject_p, reference_p);
    for (PrecedencePremise<EObject> premice : premices) {
      premice.setCritical(true);
    }
    return premices;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void retrieveGoDeep(EObject source_p, List<EObject> result_p, IContext context_p) {
    super.retrieveGoDeep(source_p, result_p, context_p);

  }

  @Override
  protected boolean isOrderedContainment(EObject element_p) {
    return true;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void attachRelated(EObject element_p, EObject result_p, IContext context_p) {
    super.attachRelated(element_p, result_p, context_p);

    AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, InteractionPackage.Literals.SEQUENCE_MESSAGE__RECEIVING_END, context_p);
    AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, InteractionPackage.Literals.SEQUENCE_MESSAGE__SENDING_END, context_p);

  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void premicesRelated(EObject element_p, ArrayList<IPremise> needed_p) {
    super.premicesRelated(element_p, needed_p);
    needed_p.addAll(createDefaultCriticalPremices(element_p, InteractionPackage.Literals.SEQUENCE_MESSAGE__RECEIVING_END));
    needed_p.addAll(createDefaultCriticalPremices(element_p, InteractionPackage.Literals.SEQUENCE_MESSAGE__SENDING_END));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public IStatus transformRequired(EObject source_p, IContext context_p) {

    IStatus result = super.transformRequired(source_p, context_p);
    if (result.isOK()) {
      SequenceMessage ce = (SequenceMessage) source_p;

      if (ce.getSendingEnd() != null) {
        if (!TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(ce.getSendingEnd(), context_p).isOK()) {
          return new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind(
              org.polarsys.capella.transition.system2subsystem.constants.Messages.SourceBoundNotTransitioned,
              EObjectLabelProviderHelper.getText(ce.getSendingEnd())));
        }
      }
      if (ce.getReceivingEnd() != null) {
        if (!TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(ce.getReceivingEnd(), context_p).isOK()) {
          return new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind(
              org.polarsys.capella.transition.system2subsystem.constants.Messages.TargetBoundNotTransitioned,
              EObjectLabelProviderHelper.getText(ce.getReceivingEnd())));
        }
      }
    }
    return result;

  }

}
