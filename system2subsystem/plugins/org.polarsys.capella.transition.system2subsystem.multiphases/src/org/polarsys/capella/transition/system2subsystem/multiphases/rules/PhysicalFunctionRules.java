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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.transition.system2subsystem.crossphases.rules.pa.PhysicalFunctionRule;
import org.polarsys.capella.transition.system2subsystem.multiphases.MultiphasesActivator;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 *
 */
public class PhysicalFunctionRules {

  public static class ToSystemFunction extends PhysicalFunctionRule {

  }

  public static class ToLogicalFunction extends PhysicalFunctionRule {

    @Override
    public EClass getTargetType(EObject element_p, IContext context_p) {
      return LaPackage.Literals.LOGICAL_FUNCTION;
    }

  }

  public static class ToPhysicalFunction extends PhysicalFunctionRule {

    @Override
    public IStatus transformRequired(EObject source_p, IContext context_p) {
      return new Status(IStatus.WARNING, MultiphasesActivator.PLUGIN_ID, "SKIPPED!");
    }

  }

}
