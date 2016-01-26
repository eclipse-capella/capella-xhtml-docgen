/*******************************************************************************
 * Copyright (c) 2006, 2016 Thales Global Services
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.mass.helpers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.cs.AbstractActor;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.vp.mass.mass.Mass;
import org.polarsys.capella.vp.mass.mass.PartMass;
import org.polarsys.capella.vp.mass.mass.impl.MassFactoryImpl;
import org.polarsys.kitalpha.emde.model.ElementExtension;




public class MassCreationToolHelper {
	
	public boolean createMass(EObject eObject, int cls){
		return createMassObject(eObject, cls);
	}
	
	private boolean createMassObject(EObject eObject, int cls){
		
		EObject correctPart = eObject;
		
		if (eObject instanceof PhysicalComponent){
			if (MassHelper.isPhysicalSystem(eObject)){
				correctPart = ((PhysicalComponent)eObject).getAbstractTypedElements().get(0);
			}
		}

		for (EObject iEO : correctPart.eContents()) {		
			if (iEO instanceof PartMass ){
				return false;
			}
		}
		
		Mass newMassObject = null;
		
		switch (cls) {
		case 1:
			newMassObject = MassFactoryImpl.eINSTANCE.createPartMass();
			break;
		}

		if (newMassObject != null){
			newMassObject.setMaxValue(0);
			newMassObject.setMinValue(0);
			newMassObject.setValue(0);
			((CapellaElement)newMassObject).setId(EcoreUtil.generateUUID());
			
			if (eObject instanceof PhysicalComponent){
				PhysicalComponent pc = (PhysicalComponent)eObject;
				if (MassHelper.isPhysicalSystem(pc)){
					eObject = (Part)pc.getAbstractTypedElements().get(0);
				}else{
					return false;
				}
			}
			
			
			if (eObject instanceof Part){
				Part part = (Part) eObject;
				if (part.getAbstractType() instanceof AbstractActor)
					return false;
				
				part.getOwnedExtensions().add((ElementExtension)newMassObject);
				return true;
			}
			
		}else{
			return false;
		}
		return false;
	}

}
