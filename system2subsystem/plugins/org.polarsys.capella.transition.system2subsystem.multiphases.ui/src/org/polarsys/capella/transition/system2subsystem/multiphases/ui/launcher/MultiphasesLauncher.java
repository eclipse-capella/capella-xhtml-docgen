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
package org.polarsys.capella.transition.system2subsystem.multiphases.ui.launcher;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.runtime.IProgressMonitor;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.IHandler;
import org.polarsys.capella.core.transition.common.ui.handlers.filter.FilteringUIDifferencesHandler;
import org.polarsys.capella.core.transition.common.ui.handlers.options.TransitionUIOptionsHandler;
import org.polarsys.capella.transition.system2subsystem.multiphases.MultiphasesContext;
import org.polarsys.capella.transition.system2subsystem.multiphases.launcher.HeadlessMultiphasesLauncher;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;

public class MultiphasesLauncher {

  public void launch(Collection<Object> selection_p, IProgressMonitor monitor_p) {
    new HeadlessMultiphasesLauncher(new TransitionUIOptionsHandler() {

      @Override
      protected String getTitle() {
        return "SA-LA-PA " + super.getTitle(); //$NON-NLS-1$
      }

    }, Collections.<GenericParameter<?>> emptyList(), true) {

      @Override
      protected ActivityParameters createPostTransformationParameters(MultiphasesContext context_p) {
        ActivityParameters parameter = super.createPostTransformationParameters(context_p);

        // Add UI Filtering handler
        GenericParameter<IHandler> param =
            new GenericParameter<IHandler>(ITransitionConstants.FILTERING_DIFFERENCES_HANDLER, new FilteringUIDifferencesHandler(),
                "Transposer Options handler"); //$NON-NLS-1$
        parameter.addParameter(param);

        return parameter;
      }
    }.launch(selection_p, monitor_p);
  }

}
