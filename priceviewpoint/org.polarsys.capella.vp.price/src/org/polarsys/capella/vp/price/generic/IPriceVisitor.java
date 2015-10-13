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


public interface IPriceVisitor {
	
	public static int PriceObject  = 1;
	
	/**
	 * return the Price Object for a given container
	 * @param container : a Part or a PhusicalComponent
	 * @return
	 */
	public EList<Price> getPriceObjects(EObject container);
	
	public Price getPriceObject(EObject eObject);
	
	/**
	 * return the child object needed to browse the model. 
	 * @param modelElement : father 
	 * @return EList<EObject> : child
	 */
	public EList<EObject> getSubComponentsObjects(EObject modelElement);
}
