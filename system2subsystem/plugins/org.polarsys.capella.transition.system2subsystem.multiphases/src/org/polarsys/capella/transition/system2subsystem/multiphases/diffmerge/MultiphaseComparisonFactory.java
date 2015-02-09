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
package org.polarsys.capella.transition.system2subsystem.multiphases.diffmerge;

import org.eclipse.emf.diffmerge.ui.specification.IComparisonMethod;
import org.eclipse.emf.diffmerge.ui.specification.IModelScopeDefinition;
import org.polarsys.capella.core.compare.CapellaComparisonMethodFactory;

public class MultiphaseComparisonFactory extends CapellaComparisonMethodFactory {

	@Override
	public String getLabel() {
		return "Multiphase Capella Comparison";
	}

	/**
   * {@inheritDoc}
   */
  @Override
  public IComparisonMethod createComparisonMethod(IModelScopeDefinition leftScopeSpec_p, IModelScopeDefinition rightScopeSpec_p,
      IModelScopeDefinition ancestorScopeSpec_p) {
    return new MultiphaseCapellaComparisonSpecification(leftScopeSpec_p, rightScopeSpec_p, ancestorScopeSpec_p);
  }

	

}
