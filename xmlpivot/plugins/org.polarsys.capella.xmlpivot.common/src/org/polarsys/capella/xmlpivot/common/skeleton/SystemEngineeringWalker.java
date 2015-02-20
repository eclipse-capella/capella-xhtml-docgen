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
import org.polarsys.capella.core.data.epbs.EPBSArchitecture;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FaFactory;
import org.polarsys.capella.core.data.fa.FunctionRealization;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.oa.OperationalAnalysis;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.capella.core.model.helpers.SystemEngineeringExt;

/**
 *
 */
public class SystemEngineeringWalker extends AbstractModelWalker {
  
  @Override
  public void accept(EObject eObject_p, ModelWalkerHelper helper){
    
    SystemEngineering engineering = (SystemEngineering) eObject_p;

    OperationalAnalysis oa = SystemEngineeringExt.getOwnedOperationalAnalysis(engineering); 
    SystemAnalysis sa = SystemEngineeringExt.getOwnedSystemAnalysis(engineering);
    LogicalArchitecture la = SystemEngineeringExt.getOwnedLogicalArchitecture(engineering);
    PhysicalArchitecture pa = SystemEngineeringExt.getOwnedPhysicalArchitecture(engineering);
    EPBSArchitecture epbs = SystemEngineeringExt.getEPBSArchitecture(engineering);
    
    int index = 0;
    
    if (oa == null){
      oa = helper.getOperationalAnalysis();
      if (oa != null){
        engineering.getOwnedArchitectures().add(index++, oa);
      }
    } else {
      engineering.getOwnedArchitectures().move(index++, oa);
    }
    
    if (sa == null){
      sa = helper.getSystemAnalysis();
      if (sa != null){
        engineering.getOwnedArchitectures().add(index++, sa);
      }
    } else {
      engineering.getOwnedArchitectures().move(index++, sa);
    }
    
    if (la == null){
      la = helper.getLogicalArchitecture();
      if (la != null){
        engineering.getOwnedArchitectures().add(index++, la);
      }
    } else {
      engineering.getOwnedArchitectures().move(index++, la);
    }
    
    if (pa == null){
      pa = helper.getPhysicalArchitecture();
      if (pa != null){
        engineering.getOwnedArchitectures().add(index++, pa);
      }
    } else {
      engineering.getOwnedArchitectures().move(index++, pa);
    }
    
    if (epbs == null){
      epbs = helper.getEPBSArchitecture();
      if (epbs != null){
        engineering.getOwnedArchitectures().add(index++, epbs);
      }
    } else {
      engineering.getOwnedArchitectures().move(index++, epbs);
    }

    //
    // Recreate root function realizations.
    // TODO maybe move somewhere else..
    //
    AbstractFunction rootOperationalActivity =  BlockArchitectureExt.getRootFunction(oa);
    AbstractFunction rootSystemFunction      =  BlockArchitectureExt.getRootFunction(sa);
    AbstractFunction rootLogicalFunction     =  BlockArchitectureExt.getRootFunction(la);
    AbstractFunction rootPhysicalFunction    =  BlockArchitectureExt.getRootFunction(pa);
    if (rootSystemFunction != null && rootOperationalActivity != null){
      realize(rootSystemFunction, rootOperationalActivity);
    }
    if (rootLogicalFunction != null && rootSystemFunction != null){
      realize(rootLogicalFunction, rootSystemFunction);
    }
    if (rootPhysicalFunction != null && rootLogicalFunction != null){
      realize(rootPhysicalFunction, rootLogicalFunction);
    } 
  }

  private void realize(AbstractFunction realizingFunction, AbstractFunction realizedFunction){
    for (FunctionRealization re : realizingFunction.getOwnedFunctionRealizations()){
      if (re.getSourceElement() == realizingFunction && re.getTargetElement() == realizedFunction){
        return;
      }
    }
    FunctionRealization realization = FaFactory.eINSTANCE.createFunctionRealization();
    realization.setSourceElement(realizingFunction);
    realization.setTargetElement(realizedFunction);
    realizingFunction.getOwnedFunctionRealizations().add(realization);
  }

}
