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
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.core.data.information.AbstractEventOperation;
import org.polarsys.capella.core.data.information.AbstractInstance;
import org.polarsys.capella.core.data.interaction.AbstractEnd;
import org.polarsys.capella.core.data.interaction.Execution;
import org.polarsys.capella.core.data.interaction.ExecutionEnd;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.handlers.attachment.AttachmentHelper;
import org.polarsys.capella.core.transition.common.handlers.log.LogHelper;
import org.polarsys.capella.core.transition.common.handlers.traceability.TraceabilityHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.handlers.attachment.AbstractScenarioHelper;
import org.polarsys.capella.transition.system2subsystem.handlers.attachment.ScenarioAttachmentHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;


/**
 * 
 */
public class AbstractEndRule extends InteractionFragmentRule {

  @Override
  protected EClass getSourceType() {
    return InteractionPackage.Literals.ABSTRACT_END;
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
    AbstractEnd end = (AbstractEnd) source_p;

    ScenarioAttachmentHelper helper = ScenarioAttachmentHelper.getInstance(context_p);

    IStatus result = super.transformRequired(source_p, context_p);

    if (result.isOK()) {
      if (ScenarioAttachmentHelper.getInstance(context_p).isUnwantedObject(end, context_p)) {
        return new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind("{0} is an unwanted object.", LogHelper.getInstance().getText(source_p)));
      }

      if (end instanceof ExecutionEnd) {
        Execution execution = ((ExecutionEnd) end).getExecution();
        AbstractEnd sourceEnd = (AbstractEnd) execution.getStart();
        if (!TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(sourceEnd, context_p).isOK()) {
          helper.registerUnwantedObject(end.getEvent(), context_p);
          return new Status(IStatus.WARNING, Messages.Activity_Transformation,
              NLS.bind("{0} is an unwanted object.", LogHelper.getInstance().getText(source_p)));
        }

      } else if (end.getEvent() != null) {

        result = TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(end.getEvent(), context_p);
      }

    }

    return result;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void premicesRelated(EObject element_p, ArrayList<IPremise> needed_p) {
    super.premicesRelated(element_p, needed_p);
    needed_p.addAll(createDefaultCriticalPremices(element_p, InteractionPackage.Literals.ABSTRACT_END__EVENT));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void attachRelated(EObject element_p, EObject result_p, IContext context_p) {
    super.attachRelated(element_p, result_p, context_p);
    AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, InteractionPackage.Literals.ABSTRACT_END__EVENT, context_p);
    if (element_p instanceof ExecutionEnd) {
      AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, InteractionPackage.Literals.EXECUTION_END__EXECUTION, context_p);
    }
  }

  @Override
  protected void attachRelatedRoles(EObject element_p, EObject result_p, IContext context_p) {
    AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, InteractionPackage.Literals.INTERACTION_FRAGMENT__COVERED_INSTANCE_ROLES,
        context_p);

    AbstractEnd end = (AbstractEnd) element_p;
    EClass targetType = end.eClass();

    //Retrieve in a map<Part, InstanceRole> transitioned CoveredInstanceRoles
    HashMap<AbstractInstance, InstanceRole> partRoles = new HashMap<AbstractInstance, InstanceRole>();
    for (InstanceRole role : end.getCoveredInstanceRoles()) {
      List<InstanceRole> rolesTransformed = (List) TraceabilityHandlerHelper.getInstance(context_p).retrieveTracedElements(role, context_p, role.eClass());
      for (InstanceRole tRole : rolesTransformed) {
        partRoles.put(tRole.getRepresentedInstance(), tRole);
      }
    }

    //For an execution end, we aren't able to determine which instance role are related :
    //an IR can be transitioned to some IR, information stored into ExecutionEnd is not enough, 
    //so we use the abstract end of the start of the execution
    AbstractEnd toFind = end;
    if (element_p instanceof ExecutionEnd) {
      ExecutionEnd eend = (ExecutionEnd) element_p;
      Execution e = eend.getExecution();
      toFind = (AbstractEnd) e.getStart();
    }

    //Attach transitioned AbstractEnd to InstanceRoles covered by related parts of operation carried by message
    for (EObject endTransitioned : TraceabilityHandlerHelper.getInstance(context_p).retrieveTracedElements(toFind, context_p,
        InteractionPackage.Literals.ABSTRACT_END)) {
      if (endTransitioned instanceof AbstractEnd) {
        AbstractEventOperation operation = AbstractScenarioHelper.getOperation(toFind, context_p);
        if (operation == null) {
          for (InstanceRole role : end.getCoveredInstanceRoles()) {
            for (EObject tRole : TraceabilityHandlerHelper.getInstance(context_p).retrieveTracedElements(role, context_p, role.eClass())) {
              AttachmentHelper.getInstance(context_p).attachElementByRel(result_p, tRole,
                  InteractionPackage.Literals.INTERACTION_FRAGMENT__COVERED_INSTANCE_ROLES);
            }
          }
        } else {
          AbstractInstance part = ScenarioAttachmentHelper.getInstance(context_p).getRelatedInstance(toFind, end, operation, context_p);
          if ((part != null) && partRoles.containsKey(part)) {
            InstanceRole role = partRoles.get(part);
            AttachmentHelper.getInstance(context_p)
                .attachElementByRel(result_p, role, InteractionPackage.Literals.INTERACTION_FRAGMENT__COVERED_INSTANCE_ROLES);
          }
        }
      }
    }

  }
}
