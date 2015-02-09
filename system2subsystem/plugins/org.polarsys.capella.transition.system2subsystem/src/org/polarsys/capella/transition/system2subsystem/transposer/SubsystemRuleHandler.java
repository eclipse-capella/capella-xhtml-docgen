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
package org.polarsys.capella.transition.system2subsystem.transposer;

import java.util.Collections;
import java.util.List;

import org.polarsys.capella.core.transition.common.rules.AbstractRule;
import org.polarsys.capella.core.transition.common.transposer.ExtendedRulesHandler;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.purposes.NonExistingPurposeException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.ComputePremisesException;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility;

public class SubsystemRuleHandler extends ExtendedRulesHandler {

  public SubsystemRuleHandler(String purpose_p, String mappingId_p) throws NonExistingPurposeException {
    super(purpose_p, mappingId_p);
  }

  @Override
  public List getPremises(Object object_p) throws ComputePremisesException {
    MappingPossibility applicablePossibility = null;
    try {
      applicablePossibility = getApplicablePossibility(object_p);
    } catch (MappingPossibilityResolutionException e) {
      throw new ComputePremisesException(e, object_p, getPurpose());
    }

    if (applicablePossibility != null) {
      IRule completeRule = applicablePossibility.getCompleteRule();
      if (completeRule instanceof AbstractRule) {
        ((AbstractRule) completeRule).setCurrentContext(getContext());
      }
      return completeRule.getPremises(object_p);
    }
    return Collections.emptyList();
  }

}