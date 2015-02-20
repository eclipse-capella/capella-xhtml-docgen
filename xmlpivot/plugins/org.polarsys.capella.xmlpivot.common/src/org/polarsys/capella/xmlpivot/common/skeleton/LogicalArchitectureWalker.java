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

import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.la.LaFactory;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.data.la.SystemAnalysisRealization;
import org.polarsys.capella.core.data.la.SystemRealization;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.model.helpers.SystemEngineeringExt;

/**
 *
 */
public class LogicalArchitectureWalker extends BlockArchitectureWalker {
  
  @Override
  public void accept(EObject parent_p, ModelWalkerHelper helper) {
    
    super.accept(parent_p, helper);
    
    LogicalArchitecture la = (LogicalArchitecture) parent_p;
    
    if (la.getOwnedFunctionPkg() == null){
      la.setOwnedFunctionPkg(helper.getFunctionPkg(la));
    }
    
    if (la.getOwnedLogicalComponent() == null){
      la.setOwnedLogicalComponent(helper.getLogicalComponent());
    }
    
    if (la.getOwnedLogicalContext() == null){
      la.setOwnedLogicalContext(helper.getLogicalContext());
    }
    
    if (la.getOwnedLogicalActorPkg() == null){
      la.setOwnedLogicalActorPkg(helper.getLogicalActorPkg());
    }
 
    createSystemAnalysisRealization(la);
    createSystemRealization(la);
  }
  
  private void createSystemRealization(LogicalArchitecture la){
    SystemEngineering eng = SystemEngineeringExt.getSystemEngineering(la);
    if (eng != null){
      SystemAnalysis sa = SystemEngineeringExt.getOwnedSystemAnalysis(eng);
      if (sa != null){
        LogicalComponent lc = la.getOwnedLogicalComponent();
        org.polarsys.capella.core.data.ctx.System sys = sa.getOwnedSystem();
        if (sys != null && lc != null){
          for (SystemRealization sr : lc.getOwnedSystemRealizations()){
            if (sr.getSourceElement() == lc && sr.getTargetElement() == sys){
              return;
            }
          }
          SystemRealization sr = LaFactory.eINSTANCE.createSystemRealization();
          lc.getOwnedSystemRealizations().add(sr);
          sr.setSourceElement(lc);
          sr.setTargetElement(sys);
        }
      }
    }
  }
  
  private void createSystemAnalysisRealization(LogicalArchitecture la){
    SystemEngineering se = SystemEngineeringExt.getSystemEngineering(la);
    if (se != null){
      SystemAnalysis sa = SystemEngineeringExt.getOwnedSystemAnalysis(se);
      if (sa != null){
        for (SystemAnalysisRealization sar : la.getOwnedSystemAnalysisRealizations()){
          if (sar.getSourceElement() == la && sar.getTargetElement() == sa){
            return;
          }
        }
        SystemAnalysisRealization sar = LaFactory.eINSTANCE.createSystemAnalysisRealization();
        la.getOwnedSystemAnalysisRealizations().add(sar);
        sar.setSourceElement(la);
        sar.setTargetElement(sa);
      }
    }
  }
  
}
