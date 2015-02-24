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

import org.polarsys.capella.core.data.epbs.ConfigurationItem;
import org.polarsys.capella.core.data.epbs.EPBSArchitecture;
import org.polarsys.capella.core.data.epbs.EpbsFactory;
import org.polarsys.capella.core.data.epbs.PhysicalArchitectureRealization;
import org.polarsys.capella.core.data.epbs.PhysicalArtifactRealization;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.model.helpers.SystemEngineeringExt;


/**
 *
 */
public class EPBSArchitectureWalker extends BlockArchitectureWalker {

  @Override
  public void accept(EObject eObject_p, ModelWalkerHelper helper) {

    super.accept(eObject_p, helper);
    
    EPBSArchitecture epbs = (EPBSArchitecture) eObject_p;

    if (epbs.getOwnedConfigurationItem() == null){
      epbs.setOwnedConfigurationItem(helper.getConfigurationItem());
    }
    
    if (epbs.getOwnedEPBSContext() == null){
      epbs.setOwnedEPBSContext(helper.getEPBSContext());
    }

    if (epbs.getOwnedAbstractCapabilityPkg() == null){
      epbs.setOwnedAbstractCapabilityPkg(helper.getAbstractCapabilityPkg(epbs));
    }
    
    createPhysicalArchitectureRealization(epbs);
    createPhysicalComponentRealization(epbs);
  }
  
  private void createPhysicalComponentRealization(EPBSArchitecture epbs){
    SystemEngineering eng = SystemEngineeringExt.getSystemEngineering(epbs);
    if (eng != null){
      PhysicalArchitecture pa = SystemEngineeringExt.getOwnedPhysicalArchitecture(eng);
      if (pa != null){
        ConfigurationItem ci = epbs.getOwnedConfigurationItem();
        PhysicalComponent pc = pa.getOwnedPhysicalComponent();
        if (ci != null && pc != null){
          for (PhysicalArtifactRealization par : ci.getOwnedPhysicalArtifactRealizations()){
            if (par.getSourceElement() == ci && par.getTargetElement() == pc){
              return;
            }
          }
          PhysicalArtifactRealization par = EpbsFactory.eINSTANCE.createPhysicalArtifactRealization();
          ci.getOwnedPhysicalArtifactRealizations().add(par);
          par.setSourceElement(ci);
          par.setTargetElement(pc);
        }
      }
    }
  }
  
  
  private void createPhysicalArchitectureRealization(EPBSArchitecture epbs){
    SystemEngineering se = SystemEngineeringExt.getSystemEngineering(epbs);
    if (se != null){
      PhysicalArchitecture pa = SystemEngineeringExt.getOwnedPhysicalArchitecture(se);
      if (pa != null){
        for (PhysicalArchitectureRealization par : epbs.getOwnedPhysicalArchitectureRealizations()){
          if (par.getSourceElement() == epbs && par.getTargetElement() == pa){
            return;
          }
        }
        PhysicalArchitectureRealization par = EpbsFactory.eINSTANCE.createPhysicalArchitectureRealization();
        epbs.getOwnedPhysicalArchitectureRealizations().add(par);
        par.setSourceElement(epbs);
        par.setTargetElement(pa);
      }
    }
  }

  @Override
  protected boolean hasOwnedDataPkg(){
	  return false;
  }
  
  @Override
  protected boolean hasOwnedInterfacePkg(){
	  return false;
  }
  
  
}
