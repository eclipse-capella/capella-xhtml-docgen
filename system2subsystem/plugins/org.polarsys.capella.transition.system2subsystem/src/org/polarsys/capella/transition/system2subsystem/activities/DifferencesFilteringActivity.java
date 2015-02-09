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
package org.polarsys.capella.transition.system2subsystem.activities;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.transition.common.handlers.filter.CompoundFilteringItems;
import org.polarsys.capella.core.transition.common.handlers.filter.TargetAttributeFilterItem;
import org.polarsys.capella.core.transition.common.handlers.filter.UnmatchableElementFilterItem;
import org.polarsys.capella.core.transition.common.handlers.filter.UpdateOfFilterItem;
import org.polarsys.capella.transition.system2subsystem.handlers.filter.RealizationLinkFilterItem;
import org.polarsys.capella.transition.system2subsystem.handlers.filter.ReferenceOnReconciliation;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 * 
 */
public class DifferencesFilteringActivity extends org.polarsys.capella.core.transition.system.activities.DifferencesFilteringActivity implements
    ITransposerWorkflow {

  public static final String ID = "org.polarsys.capella.transition.system2subsystem.activities.DifferencesFilteringActivity"; //$NON-NLS-1$

  @Override
  protected IStatus initializeFilterItemHandlers(IContext context_p, CompoundFilteringItems handler_p, ActivityParameters activityParams_p) {
    super.initializeFilterItemHandlers(context_p, handler_p, activityParams_p);

    handler_p.addFilterItem(new TargetAttributeFilterItem(), context_p);
    handler_p.addFilterItem(new UnmatchableElementFilterItem(), context_p);
    handler_p.addFilterItem(new RealizationLinkFilterItem(), context_p);
    handler_p.addFilterItem(new ReferenceOnReconciliation(), context_p);

    handler_p.addFilterItem(new UpdateOfFilterItem(FaPackage.Literals.FUNCTIONAL_CHAIN), context_p);
    handler_p.addFilterItem(new UpdateOfFilterItem(CsPackage.Literals.PHYSICAL_PATH), context_p);
    handler_p.addFilterItem(new UpdateOfFilterItem(InteractionPackage.Literals.SCENARIO), context_p);

    return Status.OK_STATUS;
  }

}
