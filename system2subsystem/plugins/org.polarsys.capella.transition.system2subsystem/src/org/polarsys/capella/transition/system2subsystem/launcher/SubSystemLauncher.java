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
package org.polarsys.capella.transition.system2subsystem.launcher;

import org.polarsys.capella.core.transition.common.context.TransitionContext;
import org.polarsys.capella.core.transition.common.handlers.log.ILogHandler;
import org.polarsys.capella.core.transition.common.handlers.log.LogHelper;
import org.polarsys.capella.core.transition.common.launcher.TransitionLauncher;
import org.polarsys.capella.core.transition.system.handlers.log.CapellaLogHandler;
import org.polarsys.capella.transition.system2subsystem.constants.Messages;


public class SubSystemLauncher extends TransitionLauncher {

  private final String MAPPING = "org.polarsys.capella.transition.system2subsystem"; //$NON-NLS-1$

  @Override
  protected void initializeLogHandler() {
    ILogHandler handler = new CapellaLogHandler(getReportComponent());
    handler.init(TransitionContext.EMPTY_CONTEXT);
    LogHelper.setInstance(handler);
  }

  @Override
  protected String getMapping() {
    return MAPPING;
  }

  @Override
  protected String getName() {
    return Messages.SubSystemLauncher_Title;
  }

}
