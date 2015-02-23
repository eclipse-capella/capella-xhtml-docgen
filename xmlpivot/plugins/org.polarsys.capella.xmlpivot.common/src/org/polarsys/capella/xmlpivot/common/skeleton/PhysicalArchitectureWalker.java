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

import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.pa.LogicalArchitectureRealization;
import org.polarsys.capella.core.data.pa.LogicalComponentRealization;
import org.polarsys.capella.core.data.pa.PaFactory;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.model.helpers.SystemEngineeringExt;

/**
 *
 */
public class PhysicalArchitectureWalker extends BlockArchitectureWalker {



  @Override
  public void accept(EObject eObject_p, ModelWalkerHelper helper) {

    super.accept(eObject_p, helper);
    
    PhysicalArchitecture pa = (PhysicalArchitecture) eObject_p;
    
    if (pa.getOwnedFunctionPkg() == null){
      pa.setOwnedFunctionPkg(helper.getFunctionPkg(pa));
    }
    
    
    if (pa.getOwnedPhysicalActorPkg() == null){
      pa.setOwnedPhysicalActorPkg(helper.getPhysicalActorPkg());
    }
    
    if (pa.getOwnedPhysicalComponent() == null){
      pa.setOwnedPhysicalComponent(helper.getPhysicalComponent());
    }
    
    if (pa.getOwnedPhysicalContext() == null){
      pa.setOwnedPhysicalContext(helper.getPhysicalContext());
    }
    
    createLogicalArchitectureRealization(pa);
    createLogicalComponentRealization(pa);
  }
  
  
  private void createLogicalComponentRealization(PhysicalArchitecture pa){
    SystemEngineering eng = SystemEngineeringExt.getSystemEngineering(pa);
    if (eng != null){
      LogicalArchitecture la = SystemEngineeringExt.getOwnedLogicalArchitecture(eng);
      if (la != null){
        PhysicalComponent pc = pa.getOwnedPhysicalComponent();
        LogicalComponent lc = la.getOwnedLogicalComponent();
        if (pc != null && lc != null){
          for (LogicalComponentRealization lcr : pc.getOwnedLogicalComponentRealizations()){
            if (lcr.getSourceElement() == pc && lcr.getTargetElement() == lc){
              return;
            }
          }
          LogicalComponentRealization lcr = PaFactory.eINSTANCE.createLogicalComponentRealization();
          pc.getOwnedLogicalComponentRealizations().add(lcr);
          lcr.setSourceElement(pc);
          lcr.setTargetElement(lc);
        }
      }
    }
  }
  
  private void createLogicalArchitectureRealization(PhysicalArchitecture pa){
    SystemEngineering se = SystemEngineeringExt.getSystemEngineering(pa);
    if (se != null){
      LogicalArchitecture la = SystemEngineeringExt.getOwnedLogicalArchitecture(se);
      if (la != null){
        for (LogicalArchitectureRealization lar : pa.getOwnedLogicalArchitectureRealizations()){
          if (lar.getSourceElement() == pa && lar.getTargetElement() == la){
            return;
          }
        }
        LogicalArchitectureRealization lar = PaFactory.eINSTANCE.createLogicalArchitectureRealization();
        pa.getOwnedLogicalArchitectureRealizations().add(lar);
        lar.setSourceElement(pa);
        lar.setTargetElement(la);
      }
    }
  }
  

}
