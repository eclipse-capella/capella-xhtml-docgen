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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.InteractionFragment;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.handlers.attachment.AttachmentHelper;
import org.polarsys.capella.core.transition.common.handlers.log.LogHelper;
import org.polarsys.capella.core.transition.common.handlers.traceability.TraceabilityHandlerHelper;
import org.polarsys.capella.core.transition.system.rules.AbstractCapellaElementRule;
import org.polarsys.kitalpha.transposer.rules.handler.business.premises.PrecedencePremise;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;

/**
 * 
 */
public class InteractionFragmentRule extends AbstractCapellaElementRule {

  @Override
  protected EClass getSourceType() {
    return InteractionPackage.Literals.INTERACTION_FRAGMENT;
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

  @Override
  public IStatus transformRequired(EObject source_p, IContext context_p) {
    InteractionFragment end = (InteractionFragment) source_p;

    for (InstanceRole role : end.getCoveredInstanceRoles()) {
      List<InstanceRole> rolesTransformed = (List) TraceabilityHandlerHelper.getInstance(context_p).retrieveTracedElements(role, context_p, role.eClass());
      if (rolesTransformed.size() > 0) {
        return Status.OK_STATUS;
      }
    }
    return new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind("{0} is not covered by an instance role.",
        LogHelper.getInstance().getText(source_p)));

  }

  /**
   * 
   * {@inheritDoc}
   */
  @Override
  protected EStructuralFeature getTargetContainementFeature(EObject element_p, EObject result_p, EObject container_p, IContext context_p) {
    return InteractionPackage.Literals.SCENARIO__OWNED_INTERACTION_FRAGMENTS;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void premicesRelated(EObject element_p, ArrayList<IPremise> needed_p) {
    super.premicesRelated(element_p, needed_p);
    needed_p.addAll(createDefaultCriticalPremices((Collection) ((Scenario) element_p.eContainer()).getOwnedInstanceRoles(), "instances"));
    needed_p.addAll(createDefaultCriticalPremices(element_p, InteractionPackage.Literals.INTERACTION_FRAGMENT__COVERED_INSTANCE_ROLES));
  }

  @Override
  protected void attachRelated(EObject element_p, EObject result_p, IContext context_p) {
    super.attachRelated(element_p, result_p, context_p);
    attachRelatedRoles(element_p, result_p, context_p);
  }

  protected void attachRelatedRoles(EObject element_p, EObject result_p, IContext context_p) {
    AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, InteractionPackage.Literals.INTERACTION_FRAGMENT__COVERED_INSTANCE_ROLES,
        context_p);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void retrieveGoDeep(EObject source_p, List<EObject> result_p, IContext context_p) {
    super.retrieveGoDeep(source_p, result_p, context_p);
  }

}
