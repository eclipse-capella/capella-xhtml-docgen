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
package org.polarsys.capella.vp.perfo.perfo.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.vp.perfo.perfo.PerfoPackage;
import org.polarsys.capella.vp.perfo.perfo.UnityElement;
import org.polarsys.capella.vp.perfo.perfo.measurementUnit_Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unity Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.perfo.perfo.impl.UnityElementImpl#getMeasurementUnit <em>Measurement Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnityElementImpl extends NamedElementImpl implements UnityElement {

	/**
	 * The default value of the '{@link #getMeasurementUnit() <em>Measurement Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementUnit()
	 * @generated
	 * @ordered
	 */
	protected static final measurementUnit_Type MEASUREMENT_UNIT_EDEFAULT = measurementUnit_Type.MILLISECOND;

	/**
	 * The cached value of the '{@link #getMeasurementUnit() <em>Measurement Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementUnit()
	 * @generated
	 * @ordered
	 */
	protected measurementUnit_Type measurementUnit = MEASUREMENT_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnityElementImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PerfoPackage.Literals.UNITY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public measurementUnit_Type getMeasurementUnit() {

		return measurementUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMeasurementUnit(measurementUnit_Type newMeasurementUnit) {

		measurementUnit_Type oldMeasurementUnit = measurementUnit;
		measurementUnit = newMeasurementUnit == null ? MEASUREMENT_UNIT_EDEFAULT
				: newMeasurementUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PerfoPackage.UNITY_ELEMENT__MEASUREMENT_UNIT,
					oldMeasurementUnit, measurementUnit));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PerfoPackage.UNITY_ELEMENT__MEASUREMENT_UNIT:
			return getMeasurementUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PerfoPackage.UNITY_ELEMENT__MEASUREMENT_UNIT:
			setMeasurementUnit((measurementUnit_Type) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PerfoPackage.UNITY_ELEMENT__MEASUREMENT_UNIT:
			setMeasurementUnit(MEASUREMENT_UNIT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PerfoPackage.UNITY_ELEMENT__MEASUREMENT_UNIT:
			return measurementUnit != MEASUREMENT_UNIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (measurementUnit: "); //$NON-NLS-1$
		result.append(measurementUnit);
		result.append(')');
		return result.toString();
	}

} //UnityElementImpl