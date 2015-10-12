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

import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.perfo.perfo.UnityElement#getMeasurementUnit <em>Measurement Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.vp.perfo.perfo.PerfoPackage#getUnityElement()
 * @model
 * @generated
 */

public interface UnityElement extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Measurement Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.vp.perfo.perfo.measurementUnit_Type}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Unit</em>' attribute.
	 * @see org.polarsys.capella.vp.perfo.perfo.measurementUnit_Type
	 * @see #setMeasurementUnit(measurementUnit_Type)
	 * @see org.polarsys.capella.vp.perfo.perfo.PerfoPackage#getUnityElement_MeasurementUnit()
	 * @model
	 * @generated
	 */

	measurementUnit_Type getMeasurementUnit();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.perfo.perfo.UnityElement#getMeasurementUnit <em>Measurement Unit</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Unit</em>' attribute.
	 * @see org.polarsys.capella.vp.perfo.perfo.measurementUnit_Type
	 * @see #getMeasurementUnit()
	 * @generated
	 */

	void setMeasurementUnit(measurementUnit_Type value);

} // UnityElement
