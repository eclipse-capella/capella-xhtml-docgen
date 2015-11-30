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
package org.polarsys.capella.vp.mass.mass.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.vp.mass.mass.Mass;
import org.polarsys.capella.vp.mass.mass.MassPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.mass.mass.impl.MassImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.mass.mass.impl.MassImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.mass.mass.impl.MassImpl#getMinValue <em>Min Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MassImpl extends NamedElementImpl implements Mass {

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected int maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected int minValue = MIN_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MassImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MassPackage.Literals.MASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getValue() {

		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setValue(int newValue) {

		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MassPackage.MASS__VALUE, oldValue, value));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getMaxValue() {

		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMaxValue(int newMaxValue) {

		int oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MassPackage.MASS__MAX_VALUE, oldMaxValue, maxValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getMinValue() {

		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMinValue(int newMinValue) {

		int oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MassPackage.MASS__MIN_VALUE, oldMinValue, minValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MassPackage.MASS__VALUE:
			return getValue();
		case MassPackage.MASS__MAX_VALUE:
			return getMaxValue();
		case MassPackage.MASS__MIN_VALUE:
			return getMinValue();
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
		case MassPackage.MASS__VALUE:
			setValue((Integer) newValue);
			return;
		case MassPackage.MASS__MAX_VALUE:
			setMaxValue((Integer) newValue);
			return;
		case MassPackage.MASS__MIN_VALUE:
			setMinValue((Integer) newValue);
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
		case MassPackage.MASS__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case MassPackage.MASS__MAX_VALUE:
			setMaxValue(MAX_VALUE_EDEFAULT);
			return;
		case MassPackage.MASS__MIN_VALUE:
			setMinValue(MIN_VALUE_EDEFAULT);
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
		case MassPackage.MASS__VALUE:
			return value != VALUE_EDEFAULT;
		case MassPackage.MASS__MAX_VALUE:
			return maxValue != MAX_VALUE_EDEFAULT;
		case MassPackage.MASS__MIN_VALUE:
			return minValue != MIN_VALUE_EDEFAULT;
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
		result.append(" (value: "); //$NON-NLS-1$
		result.append(value);
		result.append(", maxValue: "); //$NON-NLS-1$
		result.append(maxValue);
		result.append(", minValue: "); //$NON-NLS-1$
		result.append(minValue);
		result.append(')');
		return result.toString();
	}

} //MassImpl
