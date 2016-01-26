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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.vp.mass.mass.Mass;


public class MassHelper {
	
	private static final int Mass = 2;
	
	/**
	 * Check if a given model element is the Physical system.
	 * @param eObject a model element
	 * @return <code> True </code> if the element is the Physical System, <code> False </code> otherwise.
	 */
	public static final boolean isPhysicalSystem(EObject eObject){
		return eObject instanceof PhysicalComponent && eObject.eContainer() instanceof PhysicalArchitecture;
	}
	
	public EList<EObject> getRootMassObjects(EObject eO){
		EList<EObject> list = new BasicEList<EObject>();
		if (eO instanceof NamedElement){
			PhysicalComponent pc = (PhysicalComponent) eO;
			Part part = (Part)pc.getAbstractTypedElements().get(0);
			list.add(part);
			//list.addAll(getWPObjects(part, Weight));
		}
		return list;
	}
	
	
	/**
	 * Return all Price and Weight objects defined for a given Part or Physical Component  
	 * @param eObject : A Part or a Physical Component 
	 * @return
	 */
	public EList<EObject> getMassObjects(EObject eObject){
		EList<EObject> resultat = new BasicEList<EObject>();
		resultat.addAll((getMassObjects(eObject, Mass)));
		return resultat;
	}
	
	public EList<EObject> getMassObject(EObject eObject){
		return getMassObjects(eObject, Mass);
	}
	
	/**
	 * This method is useful when the Melody Avdance project is defined as a mono part project. 
	 * It get the first part defined for a Physical Component. Only the first because it contain only one.
	 * @param container
	 * @return
	 */
	private EObject getCorrectContainer(EObject container){
		if (! (container instanceof Part || container instanceof PhysicalComponent)){
			return null;
		}else{
			if (container instanceof PhysicalComponent){
				PhysicalComponent pc = (PhysicalComponent)container;
				
				if (isPhysicalSystem(pc)){
					return pc.getAbstractTypedElements().get(0);
				}else{
					if (pc.getOwnedPartitions() != null &&
							pc.getOwnedPartitions().size() != 0){
						return pc.getOwnedPartitions().get(0);
					}
				}
			}
		}
		return container;
	}
	
	private EList<EObject> getMassObjects(EObject eObject, int kind){
		
		EObject obj = getCorrectContainer(eObject);
		if (obj == null){
			return null;
		}
		
		EList<EObject> resulat = new BasicEList<EObject>(); 
		
		for (EObject i : obj.eContents()) {
			if (kind == Mass) {
				if (i instanceof Mass){
					resulat.add(i);
				}
			}
		}

		return resulat;
	}

}
