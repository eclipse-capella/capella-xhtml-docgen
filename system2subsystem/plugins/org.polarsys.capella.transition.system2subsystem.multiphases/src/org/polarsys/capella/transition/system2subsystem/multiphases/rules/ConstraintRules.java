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
import org.polarsys.capella.core.data.capellacore.Constraint;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.multiphases.MultiphasesActivator;
import org.polarsys.capella.transition.system2subsystem.rules.core.ConstraintRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


public class ConstraintRules {

  public static class ToSA extends ConstraintRule {

    @Override
    public IStatus transformRequired(EObject source_p, IContext context_p) {
      IStatus result = super.transformRequired(source_p, context_p);
      if (result.isOK()) {
        Constraint c = (Constraint) source_p;
        for (EObject e : c.getConstrainedElements()) {
          if (TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(e, context_p).isOK()) {
            return result;
          }
        }
        result = new Status(IStatus.CANCEL, MultiphasesActivator.PLUGIN_ID, "Won't transform constraint of which no constrained element will be transformed");
      }
      return result;
    }
  }

  public static class ToLA extends ConstraintRule {

    @Override
    public IStatus transformRequired(EObject source_p, IContext context_p) {
      IStatus result = super.transformRequired(source_p, context_p);
      if (result.isOK()) {
        Constraint c = (Constraint) source_p;
        for (EObject e : c.getConstrainedElements()) {
          if (TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(e, context_p).isOK()) {
            return result;
          }
        }
        result = new Status(IStatus.CANCEL, MultiphasesActivator.PLUGIN_ID, "Won't transform constraint of which no constrained element will be transformed");
      }
      return result;
    }

  }

  public static class ToPA extends ConstraintRule {

    @Override
    public IStatus transformRequired(EObject source_p, IContext context_p) {
      IStatus result = super.transformRequired(source_p, context_p);
      if (result.isOK()) {
        Constraint c = (Constraint) source_p;
        for (EObject e : c.getConstrainedElements()) {
          if (TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(e, context_p).isOK()) {
            return result;
          }
        }
        result = new Status(IStatus.CANCEL, MultiphasesActivator.PLUGIN_ID, "Won't transform constraint of which no constrained element will be transformed");
      }
      return result;
    }
  }
}
