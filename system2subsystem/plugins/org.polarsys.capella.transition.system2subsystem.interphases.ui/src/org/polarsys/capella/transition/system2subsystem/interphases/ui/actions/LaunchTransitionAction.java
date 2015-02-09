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
package org.polarsys.capella.transition.system2subsystem.interphases.ui.actions;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.polarsys.capella.common.ef.command.ICommand;
import org.polarsys.capella.core.transition.common.ui.actions.TransitionAction;
import org.polarsys.capella.transition.system2subsystem.interphases.ui.commands.InterPhasesCommand;


public class LaunchTransitionAction extends TransitionAction {

  @Override
  protected ICommand createCommand(Collection<Object> selection_p, IProgressMonitor progressMonitor_p) {
    return new InterPhasesCommand(selection_p, progressMonitor_p);
  }

}
