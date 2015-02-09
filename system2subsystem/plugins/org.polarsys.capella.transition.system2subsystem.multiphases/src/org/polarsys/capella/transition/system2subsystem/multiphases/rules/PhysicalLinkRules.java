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

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

public class PhysicalLinkRules {

  public static class ToSA extends org.polarsys.capella.transition.system2subsystem.crossphases.rules.cs.PhysicalLinkRule {

    @Override
    protected EObject getBestContainer(EObject element_p, EObject result_p, IContext context_p) {
      SystemEngineering se = (SystemEngineering) context_p.get(ITransitionConstants.TRANSFORMATION_TARGET_ROOT);
      return se.getContainedSystemAnalysis().get(0).getOwnedSystem();
    }
  }

  public static class ToLA extends org.polarsys.capella.transition.system2subsystem.crossphases.rules.cs.PhysicalLinkRule {

    @Override
    protected EObject getBestContainer(EObject element_p, EObject result_p, IContext context_p) {
      SystemEngineering se = (SystemEngineering) context_p.get(ITransitionConstants.TRANSFORMATION_TARGET_ROOT);
      return se.getContainedLogicalArchitectures().get(0).getOwnedLogicalComponent();
    }

  }

  public static class ToPA extends org.polarsys.capella.transition.system2subsystem.rules.cs.PhysicalLinkRule {

    @Override
    protected EObject getBestContainer(EObject element_p, EObject result_p, IContext context_p) {
      SystemEngineering se = (SystemEngineering) context_p.get(ITransitionConstants.TRANSFORMATION_TARGET_ROOT);
      return se.getContainedPhysicalArchitectures().get(0).getOwnedPhysicalComponent();
    }

  }

}
