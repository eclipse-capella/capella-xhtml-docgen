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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.cs.ActorCapabilityRealizationInvolvement;
import org.polarsys.capella.core.data.cs.SystemComponentCapabilityRealizationInvolvement;
import org.polarsys.capella.core.data.ctx.ActorCapabilityInvolvement;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.ctx.SystemCapabilityInvolvement;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.oa.EntityOperationalCapabilityInvolvement;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.transition.system.rules.common.InvolvementRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 * 
 */
public class ActorCapabilityInvolvementRule extends InvolvementRule {

  @Override
  protected EClass getSourceType() {
    return CapellacorePackage.Literals.INVOLVEMENT;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public EClass getTargetType(EObject element_p, IContext context_p) {
    return super.getTargetType(element_p, context_p);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected EStructuralFeature getTargetContainementFeature(EObject element_p, EObject result_p, EObject container_p, IContext context_p) {
    if (result_p instanceof SystemComponentCapabilityRealizationInvolvement) {
      return LaPackage.Literals.CAPABILITY_REALIZATION__OWNED_SYSTEM_COMPONENT_CAPABILITY_REALIZATIONS;

    } else if (result_p instanceof ActorCapabilityRealizationInvolvement) {
      return LaPackage.Literals.CAPABILITY_REALIZATION__OWNED_ACTOR_CAPABILITY_REALIZATIONS;

    } else if (result_p instanceof SystemCapabilityInvolvement) {
      return CtxPackage.Literals.CAPABILITY__OWNED_SYSTEM_CAPABILITY_INVOLVEMENT;

    } else if (result_p instanceof ActorCapabilityInvolvement) {
      return CtxPackage.Literals.CAPABILITY__OWNED_ACTOR_CAPABILITY_INVOLVEMENTS;

    } else if (result_p instanceof EntityOperationalCapabilityInvolvement) {
      return OaPackage.Literals.OPERATIONAL_CAPABILITY__OWNED_ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENTS;
    }

    return super.getTargetContainementFeature(element_p, result_p, container_p, context_p);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void attachContainement(EObject element_p, EObject result_p, IContext context_p) {
    super.attachContainement(element_p, result_p, context_p);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void apply(EObject element_p, IContext context_p) throws Exception {
    super.apply(element_p, context_p);
  }

  @Override
  public boolean isApplicableOn(EObject element_p) {
    if (super.isApplicableOn(element_p)) {
      return (element_p instanceof EntityOperationalCapabilityInvolvement) || (element_p instanceof ActorCapabilityInvolvement)
             || (element_p instanceof SystemCapabilityInvolvement) || (element_p instanceof ActorCapabilityRealizationInvolvement)
             || (element_p instanceof SystemComponentCapabilityRealizationInvolvement);
    }
    return false;
  }

}
