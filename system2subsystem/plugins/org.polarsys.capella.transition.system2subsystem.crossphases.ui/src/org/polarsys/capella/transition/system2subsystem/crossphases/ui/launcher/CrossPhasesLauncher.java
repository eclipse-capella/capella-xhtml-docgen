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
package org.polarsys.capella.transition.system2subsystem.crossphases.ui.launcher;

import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.IHandler;
import org.polarsys.capella.core.transition.common.ui.handlers.options.TransitionUIOptionsHandler;
import org.polarsys.capella.transition.system2subsystem.activities.DifferencesFilteringActivity;
import org.polarsys.capella.transition.system2subsystem.crossphases.activities.InitializeTransitionActivity;
import org.polarsys.capella.transition.system2subsystem.crossphases.launcher.HeadlessCrossPhasesLauncher;
import org.polarsys.capella.transition.system2subsystem.ui.handlers.SubSystemFilteringUIHandler;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;


public class CrossPhasesLauncher extends HeadlessCrossPhasesLauncher {

  private final String MAPPING = "org.polarsys.capella.transition.system2subsystem.crossphases"; //$NON-NLS-1$

  @Override
  protected String getMapping() {
    return MAPPING;
  }

  /**
   * Activities to be loaded in the workflow element of cadence "PRE ANALYSIS"
   * @return the associated workflow element
   */
  @Override
  protected WorkflowActivityParameter buildPreAnalysisActivities() {
    WorkflowActivityParameter parameter = super.buildPreAnalysisActivities();

    // Add UI Options handler
    GenericParameter<IHandler> param = new GenericParameter<IHandler>(ITransitionConstants.OPTIONS_HANDLER, new TransitionUIOptionsHandler() {

      @Override
      protected String getTitle() {
        return "SA " + super.getTitle(); //$NON-NLS-1$
      }

    }, "Transposer Options handler"); //$NON-NLS-1$
    parameter.addParameter(InitializeTransitionActivity.ID, param);

    return parameter;
  }

  /**
   * Activities to be loaded in the workflow element of cadence "POST EXECUTION"
   * @return the associated workflow element
   */
  @Override
  protected WorkflowActivityParameter buildPostExecutionActivities() {
    WorkflowActivityParameter parameter = super.buildPostExecutionActivities();

    // Add UI Filtering handler
    GenericParameter<IHandler> param =
        new GenericParameter<IHandler>(ITransitionConstants.FILTERING_DIFFERENCES_HANDLER, new SubSystemFilteringUIHandler(), "Transposer Options handler"); //$NON-NLS-1$
    parameter.addParameter(DifferencesFilteringActivity.ID, param);

    return parameter;
  }
}
