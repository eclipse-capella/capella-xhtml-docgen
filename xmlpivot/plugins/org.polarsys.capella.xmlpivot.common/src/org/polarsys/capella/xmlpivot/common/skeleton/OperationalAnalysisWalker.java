/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *    
 *  Contributors:
 *     Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.xmlpivot.common.skeleton;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.oa.OperationalAnalysis;

/**
 *
 */
public class OperationalAnalysisWalker extends BlockArchitectureWalker {


  @Override
  public void accept(EObject eObject_p, ModelWalkerHelper helper) {
    
    super.accept(eObject_p, helper);
    
    OperationalAnalysis analysis = (OperationalAnalysis) eObject_p;
   
    if (analysis.getOwnedFunctionPkg() == null){
      analysis.setOwnedFunctionPkg(helper.getFunctionPkg(analysis));
    }

    if (analysis.getOwnedRolePkg() == null){
      analysis.setOwnedRolePkg(helper.getRolePkg());
    }
    
    if (analysis.getOwnedEntityPkg() == null){
      analysis.setOwnedEntityPkg(helper.getEntityPkg());
    }
    
    if (analysis.getOwnedOperationalContext() == null){
      analysis.setOwnedOperationalContext(helper.getOperationalContext());
    }
    
  }
  
}
