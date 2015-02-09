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
import org.polarsys.capella.core.transition.common.ui.handlers.options.TransitionUIOptionsHandler;
import org.polarsys.capella.transition.system2subsystem.multiphases.launcher.HeadlessMultiphasesLauncher;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;


public class MultiphasesLauncher {

  public void launch(Collection<Object> selection_p, IProgressMonitor monitor_p) {
    new HeadlessMultiphasesLauncher(new TransitionUIOptionsHandler() {

      @Override
      protected String getTitle() {
        return "SA-LA-PA " + super.getTitle(); //$NON-NLS-1$
      }

    }, Collections.<GenericParameter<?>> emptyList(), true).launch(selection_p, monitor_p);
  }

}
