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
package org.polarsys.capella.transition.system2subsystem.interphases.handlers.traceability.config;

import org.polarsys.capella.core.transition.system.handlers.traceability.config.MergeTargetConfiguration;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 *
 */
public class TargetConfiguration extends MergeTargetConfiguration {

  @Override
  protected void initHandlers(IContext fContext_p) {
    addHandler(fContext_p, new TargetReconciliationTraceabilityHandler(getIdentifier(fContext_p)));
    addHandler(fContext_p, new TargetSIDTraceabilityHandler(getIdentifier(fContext_p)));
  }
}
