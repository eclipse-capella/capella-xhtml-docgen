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

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Capacity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.perfo.perfo.TimeCapacity#getCurrentExecutionTime <em>Current Execution Time</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.perfo.perfo.PerfoPackage#getTimeCapacity()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/fa/1.0.0#//FunctionalChain'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//FunctionalChain'"
 * @generated
 */

public interface TimeCapacity extends PerformanceCapacity, UnityElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Current Execution Time</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Execution Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Execution Time</em>' attribute.
	 * @see #setCurrentExecutionTime(int)
	 * @see org.polarsys.capella.vp.perfo.perfo.PerfoPackage#getTimeCapacity_CurrentExecutionTime()
	 * @model
	 * @generated
	 */

	int getCurrentExecutionTime();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.perfo.perfo.TimeCapacity#getCurrentExecutionTime <em>Current Execution Time</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Execution Time</em>' attribute.
	 * @see #getCurrentExecutionTime()
	 * @generated
	 */

	void setCurrentExecutionTime(int value);

} // TimeCapacity
