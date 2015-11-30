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
package org.polarsys.capella.vp.mass.generic;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.vp.mass.mass.Mass;


public class MassService implements IMassService{

	public int getMaxValue(EObject massObj) {
		return massObj != null ? getCriteriaObject(massObj).getMaxValue() : 0;
	}

	public int getMinValue(EObject massObj) {
		return massObj != null ? getCriteriaObject(massObj).getMinValue() : 0;
	}

	public int getValue(EObject massObj) {
		return massObj != null ? getCriteriaObject(massObj).getValue() : 0;
	}
	
	/**
	 * This method calculate the component Weight
	 * @param eObject
	 * @return Component Weight
	 */

	public int compute(EObject eObject, IMassVisitor visitor) {
		if (eObject instanceof Mass)
			eObject = eObject.eContainer();
		
		EList<EObject> l = visitor.getSubComponentsObjects(eObject);
		int subComponentTotalWeight = 0;
		for (EObject eO : l) 
			subComponentTotalWeight += compute(eO, visitor);
		
		return getValue(getCriteriaObject(eObject)) + subComponentTotalWeight;
	}
	
	/**
	 * This method return the the Mass object 
	 * @param container : the component container of the Weight object
	 * @return Mass object
	 */
	public Mass getCriteriaObject(EObject container) {
		if (!(container instanceof EObject))
			return null;
		
		if (container instanceof Mass)
			return (Mass)container;
		
		for (EObject i : container.eContents()) 
		{
			if (i instanceof Mass)
				return (Mass)i;
		}
		return null;
	}

}
