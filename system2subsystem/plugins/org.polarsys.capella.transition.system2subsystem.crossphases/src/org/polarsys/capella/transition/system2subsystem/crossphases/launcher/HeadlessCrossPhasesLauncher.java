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
package org.polarsys.capella.transition.system2subsystem.crossphases.launcher;

import java.util.Collection;
import java.util.Collections;

import org.polarsys.capella.core.transition.common.activities.DifferencesComputingActivity;
import org.polarsys.capella.core.transition.common.activities.DifferencesMergingActivity;
import org.polarsys.capella.core.transition.common.activities.FinalizeTransitionActivity;
import org.polarsys.capella.core.transition.common.activities.InitializeScopeActivity;
import org.polarsys.capella.core.transition.common.activities.PostDiffMergeActivity;
import org.polarsys.capella.core.transition.common.activities.PostTransformationActivity;
import org.polarsys.capella.core.transition.system.activities.InitializeTransformationActivity;
import org.polarsys.capella.transition.system2subsystem.activities.DifferencesFilteringActivity;
import org.polarsys.capella.transition.system2subsystem.activities.FinalizeSubsystemTransitionActivity;
import org.polarsys.capella.transition.system2subsystem.crossphases.activities.InitializeDiffMergeActivity;
import org.polarsys.capella.transition.system2subsystem.crossphases.activities.InitializeTransitionActivity;
import org.polarsys.capella.transition.system2subsystem.launcher.SubSystemLauncher;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;
import org.polarsys.kitalpha.transposer.rules.handler.api.IRulesHandler;


public class HeadlessCrossPhasesLauncher extends SubSystemLauncher {

  private final String MAPPING = "org.polarsys.capella.transition.system2subsystem.crossphases"; //$NON-NLS-1$

  @Override
  protected String getMapping() {
    return MAPPING;
  }

  @Override
  protected Collection<GenericParameter<?>> getHeadlessParameters() {
    return Collections.EMPTY_LIST;
  }

  /**
   * Activities to be loaded in the workflow element of cadence "PRE ANALYSIS"
   * @return the associated workflow element
   */
  @Override
  protected WorkflowActivityParameter buildPreAnalysisActivities() {
    WorkflowActivityParameter parameter = new WorkflowActivityParameter();

    if (getTransposer() != null) {

      // InitializeTransitionActivity
      parameter.addActivity(InitializeTransitionActivity.ID);

      // Add Rule handler
      GenericParameter<IRulesHandler> param2 =
          new GenericParameter<IRulesHandler>(org.polarsys.capella.core.transition.common.activities.InitializeTransitionActivity.PARAMETER_RULE_HANDLER,
              getTransposer().getRulesHandler(), "Transposer Rule handler"); //$NON-NLS-1$
      parameter.addParameter(InitializeTransitionActivity.ID, param2);
      for (GenericParameter<?> paramHeadless : getHeadlessParameters()) {
        parameter.addParameter(InitializeTransitionActivity.ID, paramHeadless);
      }

      // InitializeTransformationActivity
      parameter.addActivity(InitializeTransformationActivity.ID);

      // InitializeScopeActivity
      parameter.addActivity(InitializeScopeActivity.ID);

    }

    return parameter;
  }

  /**
   * Activities to be loaded in the workflow element of cadence "POST EXECUTION"
   * @return the associated workflow element
   */
  @Override
  protected WorkflowActivityParameter buildPostExecutionActivities() {
    WorkflowActivityParameter parameter = new WorkflowActivityParameter();

    if (getTransposer() != null) {

      // PostTransformationActivity
      parameter.addActivity(getActivity(PostTransformationActivity.ID));

      // InitializeDiffMergeActivity
      parameter.addActivity(InitializeDiffMergeActivity.ID);

      // DifferencesComputingActivity
      parameter.addActivity(DifferencesComputingActivity.ID);

      // HeadlessDifferencesFilteringActivity
      parameter.addActivity(DifferencesFilteringActivity.ID);

      // DifferencesMergingActivity
      parameter.addActivity(DifferencesMergingActivity.ID);

      // PostDiffMergeActivity
      parameter.addActivity(PostDiffMergeActivity.ID);

      // PostDiffMergeActivity
      parameter.addActivity(FinalizeTransitionActivity.ID);

    }

    return parameter;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected WorkflowActivityParameter buildFinalizationActivities() {
    WorkflowActivityParameter parameter = super.buildFinalizationActivities();
    parameter.addActivity(FinalizeSubsystemTransitionActivity.ID);
    return parameter;
  }
  
}
