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
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.core.data.information.AbstractEventOperation;
import org.polarsys.capella.core.data.information.AbstractInstance;
import org.polarsys.capella.core.data.interaction.AbstractEnd;
import org.polarsys.capella.core.data.interaction.EventReceiptOperation;
import org.polarsys.capella.core.data.interaction.EventSentOperation;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.interaction.MessageEnd;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.handlers.attachment.AttachmentHelper;
import org.polarsys.capella.core.transition.common.handlers.log.LogHelper;
import org.polarsys.capella.core.transition.system.rules.AbstractCapellaElementRule;
import org.polarsys.capella.transition.system2subsystem.handlers.attachment.AbstractScenarioHelper;
import org.polarsys.capella.transition.system2subsystem.handlers.attachment.ScenarioAttachmentHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;


/**
 * 
 */
public class EventRule extends AbstractCapellaElementRule {

  @Override
  protected EClass getSourceType() {
    return InteractionPackage.Literals.EVENT;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void attachRelated(EObject element_p, EObject result_p, IContext context_p) {
    super.attachRelated(element_p, result_p, context_p);

    if (element_p instanceof EventSentOperation) {
      EventSentOperation src = (EventSentOperation) element_p;
      EventSentOperation tgt = (EventSentOperation) result_p;
      ScenarioAttachmentHelper.getInstance(context_p);
      AbstractEventOperation operation = ScenarioAttachmentHelper.getTransitionedOperation(element_p, context_p);
      if (operation != null) {
        AttachmentHelper.getInstance(context_p).attachElementByRel(tgt, operation, InteractionPackage.Literals.EVENT_SENT_OPERATION__OPERATION);
      }

    } else if (element_p instanceof EventReceiptOperation) {
      EventReceiptOperation src = (EventReceiptOperation) element_p;
      EventReceiptOperation tgt = (EventReceiptOperation) result_p;
      ScenarioAttachmentHelper.getInstance(context_p);
      AbstractEventOperation operation = ScenarioAttachmentHelper.getTransitionedOperation(element_p, context_p);
      if (operation != null) {
        AttachmentHelper.getInstance(context_p).attachElementByRel(tgt, operation, InteractionPackage.Literals.EVENT_RECEIPT_OPERATION__OPERATION);
      }
    }

  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void premicesRelated(EObject element_p, ArrayList<IPremise> needed_p) {
    super.premicesRelated(element_p, needed_p);
    needed_p.addAll(createDefaultCriticalPremices((Collection) ((Scenario) element_p.eContainer()).getOwnedInstanceRoles(), "instances"));
    needed_p.addAll(createDefaultCriticalPremices(
        (Collection) Collections.singletonList(ScenarioAttachmentHelper.getInstance(getCurrentContext()).getOperation(element_p, getCurrentContext())),
        "operation"));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public IStatus transformRequired(EObject source_p, IContext context_p) {
    IStatus result = super.transformRequired(source_p, context_p);
    ScenarioAttachmentHelper helper = ScenarioAttachmentHelper.getInstance(context_p);

    if (result.isOK()) {
      List<EObject> ends = EObjectExt.getReferencers(source_p, InteractionPackage.Literals.ABSTRACT_END__EVENT);
      if (ends.size() > 0) {
        AbstractEnd end = (AbstractEnd) ends.get(0);
        AbstractEventOperation operation = AbstractScenarioHelper.getOperation(end, context_p);
        ScenarioAttachmentHelper.getInstance(context_p);
        AbstractEventOperation toperation = ScenarioAttachmentHelper.getTransitionedOperation(end, context_p);
        AbstractInstance instance = ScenarioAttachmentHelper.getInstance(context_p).getRelatedInstance(end, end, operation, context_p);
        if ((operation == null) || (toperation == null) || (instance == null)) {
          if (end instanceof MessageEnd) {
            for (AbstractEnd relatedEnd : AbstractScenarioHelper.getDirectRelateds((MessageEnd) end)) {
              helper.registerUnwantedObject(relatedEnd.getEvent(), context_p);
            }
          } else {
            helper.registerUnwantedObject(end.getEvent(), context_p);
          }
        }
      }

      if (ScenarioAttachmentHelper.getInstance(context_p).isUnwantedObject(source_p, context_p)) {
        return new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind("{0} is an unwanted object.", LogHelper.getInstance().getText(source_p)));
      }
    }
    return result;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void retrieveGoDeep(EObject source_p, List<EObject> result_p, IContext context_p) {
    super.retrieveGoDeep(source_p, result_p, context_p);
  }

}
