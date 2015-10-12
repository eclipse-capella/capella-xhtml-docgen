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
package org.polarsys.capella.vp.price.generic;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.vp.price.price.Price;

public class PriceService implements IPriceService{

	public int getMaxValue(EObject priceObj) {
		return priceObj != null ? getPriceObject(priceObj).getMaxValue() : 0;
	}

	public int getMinValue(EObject priceObj) {
		return priceObj != null ? getPriceObject(priceObj).getMinValue() : 0;
	}

	public int getValue(EObject priceObj) {
		return priceObj != null ? getPriceObject(priceObj).getValue() : 0;
	}
	
	/**
	 * This method calculate the Price of a component
	 * @param  component
	 * @return component Price
	 */
	
	public int compute(EObject eObject, IPriceVisitor visitor) {
		if (eObject instanceof Price){
			eObject = eObject.eContainer();
		}
		EList<EObject> child = visitor.getSubComponentsObjects(eObject);
		int subComponentTotalPrice = 0;
		for (EObject eO : child) {
			subComponentTotalPrice += compute(eO, visitor);
		}
		return getValue(getPriceObject(eObject)) + subComponentTotalPrice;
	}

	/**
	 * This method return the the Price object 
	 * @param container : the component container of the Price object
	 * @return Price object
	 */
	public Price getPriceObject(EObject container) {
		if (!(container instanceof EObject)){
			return null;
		}
		
		if (container instanceof Price){
			return (Price)container;
		}
		
		for (EObject i : container.eContents()) {
			if (i instanceof Price){
				return (Price)i;
			}
		}
		return null;
	}

}
