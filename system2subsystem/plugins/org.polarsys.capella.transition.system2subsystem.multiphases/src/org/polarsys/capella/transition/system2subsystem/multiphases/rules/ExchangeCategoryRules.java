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
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.transition.system.rules.fa.ExchangeCategoryRule;
import org.polarsys.capella.transition.system2subsystem.multiphases.MultiphasesActivator;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 *
 */
public class ExchangeCategoryRules {

  public static class ToSA extends ExchangeCategoryRule {

  }

  public static class ToLA extends ExchangeCategoryRule {

  }

  public static class ToPA extends ExchangeCategoryRule {

    @Override
    public IStatus transformRequired(EObject source_p, IContext context_p) {
      return new Status(IStatus.CANCEL, MultiphasesActivator.PLUGIN_ID, "ExchangeCategory not transformed");
    }
  }

}
