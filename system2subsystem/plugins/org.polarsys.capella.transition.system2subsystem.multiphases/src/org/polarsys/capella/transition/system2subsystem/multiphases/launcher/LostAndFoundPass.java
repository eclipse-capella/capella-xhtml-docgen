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
package org.polarsys.capella.transition.system2subsystem.multiphases.launcher;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellamodeller.ModelRoot;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.sharedmodel.GenericPkg;
import org.polarsys.capella.core.data.sharedmodel.SharedPkg;
import org.polarsys.capella.core.data.sharedmodel.SharedmodelFactory;
import org.polarsys.capella.core.model.handler.helpers.HoldingResourceHelper;
import org.polarsys.capella.transition.system2subsystem.multiphases.MultiphasesContext;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * Moves containerless elements that are contained in the holding resource to
 * a special 'lost and found package'. Such elements should have been added to a 
 * container element previously, and any element that remains in the holding
 * resource when this phase is reached indicates a bug in the transformation itself.
 */
public class LostAndFoundPass {

  private static final String PACKAGE_NAME = "Lost+Found"; //$NON-NLS-1$
  
  /**
   * @param lostAndFoundPackage_p
   */
  public void attachLostAndFound(MultiphasesContext context_p) {
    
    Resource resource = HoldingResourceHelper.getHoldingResource(TransactionUtil.getEditingDomain(context_p.getTempSystemEngineering()));
    
    for (EObject e : new ArrayList<EObject>(resource.getContents())){
      
      
      if (e.eContainer() == null){ 

        // we would like to store any EObject, but this is as good as it gets..
        if (e instanceof CapellaElement){
          getLostAndFoundPackage(context_p).getCapellaElements().add((CapellaElement) e);
          resource.getContents().remove(e);
          
        } else if (e instanceof ElementExtension){
          getLostAndFoundPackage(context_p).getOwnedExtensions().add((ElementExtension) e);
          resource.getContents().remove(e);
        }
      }

    }
  }
    
    private GenericPkg getLostAndFoundPackage(MultiphasesContext context_p){
      SystemEngineering se = context_p.getTempSystemEngineering();
      SharedPkg shared = null;
      for (ModelRoot mr : ((Project) se.eContainer()).getOwnedModelRoots()){
        if (mr instanceof SharedPkg && PACKAGE_NAME.equals(((SharedPkg) mr).getName())){
          shared = (SharedPkg) mr;
        }
      }

      if (shared == null){
        shared = SharedmodelFactory.eINSTANCE.createSharedPkg(PACKAGE_NAME);
        ((Project)se.eContainer()).getOwnedModelRoots().add(shared);
      }

      if (shared.getOwnedGenericPkg() == null){
        shared.setOwnedGenericPkg(SharedmodelFactory.eINSTANCE.createGenericPkg());
      }

      return shared.getOwnedGenericPkg();
    }

}
