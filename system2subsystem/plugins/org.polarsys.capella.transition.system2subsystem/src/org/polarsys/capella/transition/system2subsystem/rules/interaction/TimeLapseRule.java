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
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.common.ui.services.helper.EObjectLabelProviderHelper;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.data.interaction.TimeLapse;
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
public class TimeLapseRule extends AbstractCapellaElementRule {

  @Override
  protected EClass getSourceType() {
    return InteractionPackage.Literals.TIME_LAPSE;
  }

  @Override
  protected boolean isOrderedContainment(EObject element_p) {
    return true;
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

  /**
   * {@inheritDoc}
   */
  @Override
  public IStatus transformRequired(EObject source_p, IContext context_p) {

    IStatus result = super.transformRequired(source_p, context_p);
    if (result.isOK()) {
      TimeLapse ce = (TimeLapse) source_p;

      if (ce.getStart() == null) {
        return new Status(IStatus.WARNING, Messages.Activity_Transformation,
            org.polarsys.capella.transition.system2subsystem.constants.Messages.SourceNull);
      }
      if (ce.getFinish() == null) {
        return new Status(IStatus.WARNING, Messages.Activity_Transformation,
            org.polarsys.capella.transition.system2subsystem.constants.Messages.TargetNull);
      }
      if (!TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(ce.getStart(), context_p).isOK()) {
        return new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind(
            org.polarsys.capella.transition.system2subsystem.constants.Messages.SourceBoundNotTransitioned,
            EObjectLabelProviderHelper.getText(ce.getStart())));
      }
      if (!TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(ce.getFinish(), context_p).isOK()) {
        return new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind(
            org.polarsys.capella.transition.system2subsystem.constants.Messages.TargetBoundNotTransitioned,
            EObjectLabelProviderHelper.getText(ce.getFinish())));
      }
    }
    return result;

  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void attachRelated(EObject element_p, EObject result_p, IContext context_p) {
    super.attachRelated(element_p, result_p, context_p);

    AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, InteractionPackage.Literals.TIME_LAPSE__START, context_p);
    AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, InteractionPackage.Literals.TIME_LAPSE__FINISH, context_p);

  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void premicesRelated(EObject element_p, ArrayList<IPremise> needed_p) {
    super.premicesRelated(element_p, needed_p);
    needed_p.addAll(createDefaultCriticalPremices((Collection) ((Scenario) element_p.eContainer()).getOwnedInstanceRoles(), "instances"));
    needed_p.addAll(createDefaultCriticalPremices(element_p, InteractionPackage.Literals.TIME_LAPSE__START));
    needed_p.addAll(createDefaultCriticalPremices(element_p, InteractionPackage.Literals.TIME_LAPSE__FINISH));
  }

}
