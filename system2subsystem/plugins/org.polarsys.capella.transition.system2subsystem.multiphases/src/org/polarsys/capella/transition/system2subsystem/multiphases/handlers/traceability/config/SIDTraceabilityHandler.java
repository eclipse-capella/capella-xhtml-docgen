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
package org.polarsys.capella.transition.system2subsystem.multiphases.handlers.traceability.config;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

public class SIDTraceabilityHandler extends org.polarsys.capella.core.transition.system.handlers.traceability.SIDTraceabilityHandler {

  public SIDTraceabilityHandler(String identifier_p) {
    super(identifier_p);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void initializeRootMappings(IContext context_p) {
    super.initializeRootMappings(context_p);
    EObject source = (EObject) context_p.get(ITransitionConstants.TRANSFORMATION_SOURCE_ROOT);
    EObject target = (EObject) context_p.get(ITransitionConstants.TRANSFORMATION_TARGET_ROOT);
    initializeMappings(source, target, context_p);
  }

}
