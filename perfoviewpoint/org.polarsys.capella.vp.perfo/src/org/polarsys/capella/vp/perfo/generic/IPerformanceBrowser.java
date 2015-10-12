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
package org.polarsys.capella.vp.perfo.generic;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public interface IPerformanceBrowser {

	public static final int PerformanceCapacityObject = 1;
	
	public static final int PerformanceConsumptionObject = 2;
	
	/**
	 * The list of the Leafs. A leaf object is the one containing the Consumption Object
	 * @param eObject
	 * @return The list of the Leafs
	 */
	public EList<EObject> getLeafsObjects(EObject eObject);

	/**
	 * 
	 * @param eObject
	 * @return the List of subComponent
	 */
	public EList<EObject> getSubComponentsObjects(EObject eObject);
	
	/**
	 * 
	 * @param container
	 * @return
	 */
	public abstract EObject getPerformanceCriteriaObject(EObject container);
	
	/**
	 * 
	 * @param container
	 * @param PerformanceCriteriaKind
	 * @return
	 */
	public abstract EObject getPerformanceCriteriaObject(EObject container, int PerformanceCriteriaKind);	
}
