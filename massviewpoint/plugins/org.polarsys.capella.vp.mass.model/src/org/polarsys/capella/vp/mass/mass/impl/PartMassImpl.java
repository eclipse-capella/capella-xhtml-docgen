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

import org.polarsys.capella.vp.mass.mass.MassPackage;
import org.polarsys.capella.vp.mass.mass.PartMass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Mass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.mass.mass.impl.PartMassImpl#getCurrentMass <em>Current Mass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartMassImpl extends MassImpl implements PartMass {

	/**
	 * The default value of the '{@link #getCurrentMass() <em>Current Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMass()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_MASS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentMass() <em>Current Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMass()
	 * @generated
	 * @ordered
	 */
	protected int currentMass = CURRENT_MASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartMassImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MassPackage.Literals.PART_MASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getCurrentMass() {

		return currentMass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setCurrentMass(int newCurrentMass) {

		int oldCurrentMass = currentMass;
		currentMass = newCurrentMass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MassPackage.PART_MASS__CURRENT_MASS, oldCurrentMass,
					currentMass));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MassPackage.PART_MASS__CURRENT_MASS:
			return getCurrentMass();
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
		case MassPackage.PART_MASS__CURRENT_MASS:
			setCurrentMass((Integer) newValue);
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
		case MassPackage.PART_MASS__CURRENT_MASS:
			setCurrentMass(CURRENT_MASS_EDEFAULT);
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
		case MassPackage.PART_MASS__CURRENT_MASS:
			return currentMass != CURRENT_MASS_EDEFAULT;
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
		result.append(" (currentMass: "); //$NON-NLS-1$
		result.append(currentMass);
		result.append(')');
		return result.toString();
	}

} //PartMassImpl
