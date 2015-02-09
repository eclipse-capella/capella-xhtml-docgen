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
package org.polarsys.capella.transition.system2subsystem.multiphases.commands;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;

import org.polarsys.capella.transition.system2subsystem.commands.SubSystemCommand;
import org.polarsys.capella.transition.system2subsystem.multiphases.launcher.HeadlessMultiphasesLauncher;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;

public class HeadlessMultiphasesCommand extends SubSystemCommand {

  private final Collection<GenericParameter<?>> headlessParameters;
  private final boolean merge;
  
  /**
   * @param _rootElement_p
   * @param progressMonitor_p
   */
  public HeadlessMultiphasesCommand(Collection<?> selection_p, Collection<GenericParameter<?>> headlessParameters_p, IProgressMonitor progressMonitor_p) {
    this(selection_p, headlessParameters_p, progressMonitor_p, true);
  }
  
  /**
   * @param _rootElement_p
   * @param progressMonitor_p
   */
  public HeadlessMultiphasesCommand(Collection<?> selection_p, Collection<GenericParameter<?>> headlessParameters_p, IProgressMonitor progressMonitor_p, boolean merge_p) {
    //FIXME use wildcard in superclass constructors
	  super(new ArrayList<Object>(selection_p), progressMonitor_p);
    headlessParameters = headlessParameters_p;
    merge = merge_p;
  }
  
  

  @Override
  protected void performTransformation(Collection<Object> elements_p) {
    new HeadlessMultiphasesLauncher(headlessParameters, merge).launch(elements_p, getProgressMonitor());
  }

  
}
