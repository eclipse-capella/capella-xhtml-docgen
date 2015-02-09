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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.information.AbstractEventOperation;
import org.polarsys.capella.core.data.information.AbstractInstance;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.InteractionFragment;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.interaction.InteractionState;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.data.interaction.SequenceMessage;
import org.polarsys.capella.core.data.interaction.StateFragment;
import org.polarsys.capella.core.data.interaction.TimeLapse;
import org.polarsys.capella.core.model.helpers.ComponentExt;
import org.polarsys.capella.core.transition.system.rules.AbstractCapellaElementRule;
import org.polarsys.capella.transition.system2subsystem.handlers.attachment.AbstractScenarioHelper;
import org.polarsys.capella.transition.system2subsystem.handlers.attachment.ScenarioAttachmentHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;


/**
 * 
 */
public class ScenarioRule extends AbstractCapellaElementRule {

  public ScenarioRule() {
    super();
    registerUpdatedAttribute(InteractionPackage.Literals.SCENARIO__KIND);
  }

  @Override
  protected EClass getSourceType() {
    return InteractionPackage.Literals.SCENARIO;
  }

  @Override
  protected boolean isOrderedContainment(EObject element_p) {
    return true;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected Collection<EObject> transformElement(EObject element_p, IContext context_p) {
    return super.transformElement(element_p, context_p);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public IStatus transformRequired(EObject source_p, IContext context_p) {
    return super.transformRequired(source_p, context_p);
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
  protected void retrieveGoDeep(EObject source_p, List<EObject> result_p, IContext context_p) {
    super.retrieveGoDeep(source_p, result_p, context_p);

    Scenario s = (Scenario) source_p;
    result_p.addAll(s.getOwnedInstanceRoles());
    result_p.addAll(s.getOwnedMessages());
    result_p.addAll(s.getOwnedEvents());
    result_p.addAll(s.getOwnedInteractionFragments());
    result_p.addAll(s.getOwnedTimeLapses());
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void premicesRelated(EObject element_p, ArrayList<IPremise> needed_p) {
    super.premicesRelated(element_p, needed_p);
    ArrayList<EObject> related = new ArrayList<EObject>();

    Scenario scenario = (Scenario) element_p;
    for (InstanceRole role : scenario.getOwnedInstanceRoles()) {
      AbstractInstance instance = role.getRepresentedInstance();
      if (instance != null) {
        related.add(instance);
        if (instance.getAbstractType() instanceof Component) {
          Component type = (Component) instance.getAbstractType();
          related.add(type);
          related.addAll(type.getUsedInterfaceLinks());
          related.addAll(type.getImplementedInterfaceLinks());
          related.addAll(ComponentExt.getOwnedComponentPort(type));
        }
      }
    }

    for (InteractionFragment fragment : scenario.getOwnedInteractionFragments()) {
      if (fragment instanceof InteractionState) {
        InteractionState state = (InteractionState) fragment;
        if (state.getRelatedAbstractFunction() != null) {
          related.add(state.getRelatedAbstractFunction());
        }
        if (state.getRelatedAbstractState() != null) {
          related.add(state.getRelatedAbstractState());
        }
      }
    }

    for (TimeLapse timeLapse : scenario.getOwnedTimeLapses()) {
      if (timeLapse instanceof StateFragment) {
        StateFragment state = (StateFragment) timeLapse;
        if (state.getRelatedAbstractFunction() != null) {
          related.add(state.getRelatedAbstractFunction());
        }
        if (state.getRelatedAbstractState() != null) {
          related.add(state.getRelatedAbstractState());
        }
      }
    }

    for (SequenceMessage message : scenario.getOwnedMessages()) {
      ScenarioAttachmentHelper.getInstance(getCurrentContext());
      AbstractEventOperation operation = AbstractScenarioHelper.getOperation(message, getCurrentContext());
      if (operation != null) {
        related.add(operation);
      }
    }

    needed_p.addAll(createDefaultCriticalPremices(related, "relateds")); ////$NON-NLS-1$
  }
}
