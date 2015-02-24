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

import org.polarsys.capella.core.data.ctx.CtxFactory;
import org.polarsys.capella.core.data.ctx.OperationalAnalysisRealization;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.oa.OperationalAnalysis;
import org.polarsys.capella.core.model.helpers.SystemEngineeringExt;

/**
 *
 */
public class SystemAnalysisWalker extends BlockArchitectureWalker {


  @Override
  public void accept(EObject parent_p, ModelWalkerHelper helper) {
    
    super.accept(parent_p, helper);
    
    SystemAnalysis analysis = (SystemAnalysis) parent_p;
    
    if (analysis.getOwnedFunctionPkg() == null){
      analysis.setOwnedFunctionPkg(helper.getFunctionPkg(analysis));
    }
    
    if (analysis.getOwnedMissionPkg() == null){
      analysis.setOwnedMissionPkg(helper.getMissionPkg());
    }
    
    if (analysis.getOwnedActorPkg() == null){
      analysis.setOwnedActorPkg(helper.getActorPkg());
    }
    
    if (analysis.getOwnedSystemContext() == null){
      analysis.setOwnedSystemContext(helper.getSystemContext());
    }
   
    if (analysis.getOwnedSystem() == null){
      analysis.setOwnedSystem(helper.getSystem());
    }
    
    createOperationalAnalysisRealization(analysis);
    
  }
  
  
  private void createOperationalAnalysisRealization(SystemAnalysis sa){
    SystemEngineering se = SystemEngineeringExt.getSystemEngineering(sa);
    if (se != null){
      OperationalAnalysis oa = SystemEngineeringExt.getOwnedOperationalAnalysis(se);
      if (oa != null){
        for (OperationalAnalysisRealization oar : sa.getOwnedOperationalAnalysisRealizations()){
          if (oar.getSourceElement() == sa && oar.getTargetElement() == oa){
            return;
          }
        }
        OperationalAnalysisRealization oar = CtxFactory.eINSTANCE.createOperationalAnalysisRealization();
        sa.getOwnedOperationalAnalysisRealizations().add(oar);
        oar.setSourceElement(sa);
        oar.setTargetElement(oa);
      }
    }
  }


}
