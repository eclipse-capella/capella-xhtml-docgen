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
package org.polarsys.capella.transition.system2subsystem.multiphases.activities;

import java.util.Collection;

import org.polarsys.capella.core.data.capellacore.TypedElement;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.pa.PhysicalComponent;

/**
 *  Updates root component names of the transformation result according to
 *  <p>
 *  The transition shall create a system named as the selected Node Physical Component, 
 *  that has been selected to initiate the transition, in the System Analysis phase of the target model.
 *  </p>
 *  and
 *  <p>
 *  The transition shall create a Logical System named as the selected Node Physical Component, 
 *  that has been selected to initiate the transition, in the System Analysis phase of the target model.
 *  </p>
 */
public class RootComponentNameUpdater {

  public void updateRootComponentNames(SystemEngineering se_p, Collection<? extends PhysicalComponent> selectedPhysicalComponents_p) {

   // only if one component was selected. otherwise keep default values.
   if (selectedPhysicalComponents_p.size() == 1){
     Component[] toRename = new Component[] {
         se_p.getContainedSystemAnalysis().get(0).getOwnedSystem(),
         se_p.getContainedLogicalArchitectures().get(0).getOwnedLogicalComponent(),
     };
     String newName = selectedPhysicalComponents_p.iterator().next().getName();
     for (Component rename : toRename){
       rename.setName(newName);
       for (TypedElement e : rename.getTypedElements()){
         e.setName(newName);
       }
     }
   }

 }

}
