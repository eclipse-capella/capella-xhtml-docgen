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

import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemContext;
import org.polarsys.capella.core.data.epbs.EPBSArchitecture;
import org.polarsys.capella.core.data.epbs.EPBSContext;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalContext;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalContext;
import org.polarsys.capella.common.data.modellingcore.AbstractType;

/**
 * This part walker sets the type of a root part according to its
 * parent block architecture.
 * 
 */
public class PartWalker extends AbstractModelWalker {

  @Override
  public void accept(EObject eObject_p, ModelWalkerHelper helper) {
    Part part = (Part) eObject_p;
    if (part.getType() == null){
      AbstractType newType = null;
      if (part.eContainer() instanceof LogicalContext && part.eContainer().eContainer() instanceof LogicalArchitecture){
        LogicalArchitecture archi = (LogicalArchitecture) part.eContainer().eContainer();
        newType = archi.getOwnedLogicalComponent();
      } else if (part.eContainer() instanceof PhysicalContext && part.eContainer().eContainer() instanceof PhysicalArchitecture){
        PhysicalArchitecture arch = (PhysicalArchitecture) part.eContainer().eContainer();
        newType = arch.getOwnedPhysicalComponent();
      } else if (part.eContainer() instanceof EPBSContext && part.eContainer().eContainer() instanceof EPBSArchitecture){
        EPBSArchitecture arch = (EPBSArchitecture) part.eContainer().eContainer();
        newType = arch.getOwnedConfigurationItem();
      } else if (part.eContainer() instanceof SystemContext && part.eContainer().eContainer() instanceof SystemAnalysis){
        SystemAnalysis arch = (SystemAnalysis) part.eContainer().eContainer();
        newType = arch.getOwnedSystem();
      }
      part.setAbstractType(newType);
    }    
  }

}
