/*******************************************************************************
 * Copyright (c) 2006, 2015 Thales Global Services
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.mass.design.service.nodes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.vp.mass.mass.Mass;
import org.polarsys.capella.vp.mass.mass.PartMass;
import org.polarsys.capella.vp.mass.services.MassCapellaService;
import org.polarsys.kitalpha.emde.model.ElementExtension;

public class MassLevelHelper {
	
	
	private MassCapellaService maMassService = new MassCapellaService();
	
	
	/**
	 * Adapted Weight Services 
	 */
	
	public int computeMass(EObject eObject) {
		int m = maMassService.compute(eObject, maMassService.getVisitor(), Mass.class);
		((PartMass)maMassService.getMassObject(eObject)).setCurrentMass(m);
		return m;
	}
	
	public boolean isMassOverhead(EObject eObject, EObject view,
			EObject container) {
		if (eObject instanceof Mass){
			return evaluateMassStatus(eObject, MassStatus.OVERHEAD);
		}
		
		return computePartStatus((Part)eObject, view, container, MassStatus.OVERHEAD);
	}


	public boolean isMassSaturated(EObject eObject, EObject view,
			EObject container) {
		
		if (eObject instanceof Mass){
			return evaluateMassStatus(eObject, MassStatus.SATURATED);
		}
		
		return computePartStatus((Part)eObject, view, container, MassStatus.SATURATED);
	}



	private boolean computePartStatus(Part part, EObject view,
			EObject container, MassStatus flag) {
		
		Mass currentPCMass = getMassExtension(part);
		
		if (currentPCMass != null)
			return evaluateMassStatus(currentPCMass, flag);
		
		return false;
	}

	private Mass getMassExtension(Part part) {
		
		EList<ElementExtension> extensions = part.getOwnedExtensions();
		
		for (ElementExtension elementExtension : extensions) {
			if (elementExtension instanceof Mass)
				return (Mass)elementExtension;
		}
		
		return null;
	}
	
	
	private boolean evaluateMassStatus(EObject eObject, MassStatus flag){
		
		int current = maMassService.computeMass(eObject);
		
		if (flag.equals(MassStatus.OVERHEAD)){
			return current > ((Mass) eObject).getMaxValue();
		}
		
		if (flag.equals(MassStatus.SATURATED)){
			return current != 0 && current == ((Mass) eObject).getMaxValue();
		}
		
		//May be a runtimeException
		return false;
	}
	
	private enum MassStatus {
		OVERHEAD,
		SATURATED
	}
}
