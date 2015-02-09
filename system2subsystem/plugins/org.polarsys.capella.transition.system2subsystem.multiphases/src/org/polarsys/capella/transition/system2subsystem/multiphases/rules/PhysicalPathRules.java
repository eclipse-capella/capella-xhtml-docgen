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
package org.polarsys.capella.transition.system2subsystem.multiphases.rules;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.transition.system2subsystem.rules.pa.PhysicalPathRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


public class PhysicalPathRules {

  public static class ToSA extends PhysicalPathRule {

    @Override
    protected void retrieveContainer(EObject element_p, List<EObject> result_p, IContext context_p) {
    }

    @Override
    protected void retrieveGoDeep(EObject source_p, List<EObject> result_p, IContext context_p) {

    }
  }

  public static class ToLA extends PhysicalPathRule {
    @Override
    protected void retrieveContainer(EObject element_p, List<EObject> result_p, IContext context_p) {
    }

    @Override
    protected void retrieveGoDeep(EObject source_p, List<EObject> result_p, IContext context_p) {
    }
  }

  public static class ToPA extends PhysicalPathRule {

    /**
     * {@inheritDoc}
     */
    @Override
    public IStatus transformRequired(EObject element_p, IContext context_p) {
      return super.transformRequired(element_p, context_p);
    }

    @Override
    protected void retrieveContainer(EObject element_p, List<EObject> result_p, IContext context_p) {
    }
  }
}
