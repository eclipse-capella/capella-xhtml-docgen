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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.information.AbstractInstance;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.transition.common.handlers.traceability.TraceabilityHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.capella.core.transition.system.rules.AbstractCapellaElementRule;
import org.polarsys.capella.transition.system2subsystem.handlers.attachment.ScenarioAttachmentHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;


/**
 * 
 */
public class InstanceRoleRule extends AbstractCapellaElementRule {

  @Override
  protected EClass getSourceType() {
    return InteractionPackage.Literals.INSTANCE_ROLE;
  }

  @Override
  protected boolean isOrderedContainment(EObject element_p) {
    return true;
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
  @SuppressWarnings({ "rawtypes", "unchecked" })
  @Override
  protected Collection<EObject> transformElement(EObject element_p, IContext context_p) {

    List<InstanceRole> tgtTransformed = new ArrayList<InstanceRole>();

    InstanceRole src = (InstanceRole) element_p;
    Scenario scenario = (Scenario) src.eContainer();
    List<InstanceRole> tgt = (List) TraceabilityHandlerHelper.getInstance(context_p).retrieveTracedElements(src, context_p, getSourceType());
    if (tgt.size() > 0) {
      tgtTransformed.addAll(tgt);

    } else {
      List<AbstractInstance> parts = ScenarioAttachmentHelper.getInstance(context_p).getTracedInstances(src, context_p);

      for (AbstractInstance part : parts) {
        if (part != null) {
          InstanceRole ir2 = ScenarioAttachmentHelper.getInstance(context_p).getInstanceRole(scenario, part);

          if (ir2 == null) {
            ir2 = (InstanceRole) transformDirectElement(element_p, context_p);
            ir2.setRepresentedInstance(part);
            ScenarioAttachmentHelper.getInstance(context_p).registerInstanceRole(scenario, part, ir2);
          }

          tgtTransformed.add(ir2);
        }
      }
    }

    return (Collection) tgtTransformed;

  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void premicesRelated(EObject element_p, ArrayList<IPremise> needed_p) {
    super.premicesRelated(element_p, needed_p);
    needed_p.addAll(createDefaultPrecedencePremices(element_p, InteractionPackage.Literals.INSTANCE_ROLE__REPRESENTED_INSTANCE));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void attachRelated(EObject element_p, EObject result_p, IContext context_p) {
    super.attachRelated(element_p, result_p, context_p);

    // The instance role represents the same instance than the source.
    InstanceRole src = (InstanceRole) element_p;
    InstanceRole role = (InstanceRole) result_p;

    if (role.getRepresentedInstance() == null) {

      AbstractInstance tgtInstance =
          (AbstractInstance) TransformationHandlerHelper.getInstance(context_p).getBestTracedElement(src.getRepresentedInstance(), context_p,
              InformationPackage.Literals.ABSTRACT_INSTANCE);
      if (tgtInstance == null) {
        tgtInstance = src.getRepresentedInstance();
      }
      role.setRepresentedInstance(tgtInstance);
    }

  }

}
