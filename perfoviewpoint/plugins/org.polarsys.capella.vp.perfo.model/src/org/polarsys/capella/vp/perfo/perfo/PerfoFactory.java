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
package org.polarsys.capella.vp.perfo.perfo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.vp.perfo.perfo.PerfoPackage
 * @generated
 */
public interface PerfoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PerfoFactory eINSTANCE = org.polarsys.capella.vp.perfo.perfo.impl.PerfoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Performance Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Criteria</em>'.
	 * @generated
	 */
	PerformanceCriteria createPerformanceCriteria();

	/**
	 * Returns a new object of class '<em>Performance Consumption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Consumption</em>'.
	 * @generated
	 */
	PerformanceConsumption createPerformanceConsumption();

	/**
	 * Returns a new object of class '<em>Performance Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Capacity</em>'.
	 * @generated
	 */
	PerformanceCapacity createPerformanceCapacity();

	/**
	 * Returns a new object of class '<em>Time Consumption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Consumption</em>'.
	 * @generated
	 */
	TimeConsumption createTimeConsumption();

	/**
	 * Returns a new object of class '<em>Time Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Capacity</em>'.
	 * @generated
	 */
	TimeCapacity createTimeCapacity();

	/**
	 * Returns a new object of class '<em>Unity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unity Element</em>'.
	 * @generated
	 */
	UnityElement createUnityElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PerfoPackage getPerfoPackage();

} //PerfoFactory
