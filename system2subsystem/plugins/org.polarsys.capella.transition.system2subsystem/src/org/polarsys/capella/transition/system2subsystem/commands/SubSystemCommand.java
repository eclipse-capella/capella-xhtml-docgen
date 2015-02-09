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
package org.polarsys.capella.transition.system2subsystem.commands;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.runtime.IProgressMonitor;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.transition.common.commands.TransitionCommand;
import org.polarsys.capella.transition.system2subsystem.constants.Messages;


public abstract class SubSystemCommand extends TransitionCommand {

  /**
   * @param _rootElement_p
   * @param progressMonitor_p
   */
  public SubSystemCommand(Collection<Object> selection_p, IProgressMonitor progressMonitor_p) {
    super(selection_p, progressMonitor_p);
  }

  @Override
  public String getName() {
    return Messages.SubSystemLauncher_Title;
  }

  /**
   * @param rootElement_p
   * @return
   */
  @Override
  protected Collection<Object> retrieveRelatedElements(Object rootElement_p) {
    Object rootElement = rootElement_p;
    if (rootElement instanceof Part) {
      rootElement = ((Part) rootElement).getAbstractType();
    }
    return Collections.singleton(rootElement);
  }

}
