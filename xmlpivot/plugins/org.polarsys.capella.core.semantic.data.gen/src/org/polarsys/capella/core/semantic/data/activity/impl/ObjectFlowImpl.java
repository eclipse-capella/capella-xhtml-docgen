/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *     
 * Contributors:
 *    Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.core.semantic.data.activity.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.semantic.data.activity.ActivityPackage;
import org.polarsys.capella.core.semantic.data.activity.ObjectFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.impl.ObjectFlowImpl#isIsMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.impl.ObjectFlowImpl#isIsMultireceive <em>Is Multireceive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ObjectFlowImpl extends ActivityEdgeImpl implements ObjectFlow {
	/**
	 * The default value of the '{@link #isIsMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMulticast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTICAST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMulticast()
	 * @generated
	 * @ordered
	 */
	protected boolean isMulticast = IS_MULTICAST_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultireceive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTIRECEIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultireceive()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultireceive = IS_MULTIRECEIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.OBJECT_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMulticast() {
		return isMulticast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMulticast(boolean newIsMulticast) {
		boolean oldIsMulticast = isMulticast;
		isMulticast = newIsMulticast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.OBJECT_FLOW__IS_MULTICAST, oldIsMulticast, isMulticast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMultireceive() {
		return isMultireceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultireceive(boolean newIsMultireceive) {
		boolean oldIsMultireceive = isMultireceive;
		isMultireceive = newIsMultireceive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.OBJECT_FLOW__IS_MULTIRECEIVE, oldIsMultireceive, isMultireceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityPackage.OBJECT_FLOW__IS_MULTICAST:
				return isIsMulticast();
			case ActivityPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
				return isIsMultireceive();
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
			case ActivityPackage.OBJECT_FLOW__IS_MULTICAST:
				setIsMulticast((Boolean)newValue);
				return;
			case ActivityPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
				setIsMultireceive((Boolean)newValue);
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
			case ActivityPackage.OBJECT_FLOW__IS_MULTICAST:
				setIsMulticast(IS_MULTICAST_EDEFAULT);
				return;
			case ActivityPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
				setIsMultireceive(IS_MULTIRECEIVE_EDEFAULT);
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
			case ActivityPackage.OBJECT_FLOW__IS_MULTICAST:
				return isMulticast != IS_MULTICAST_EDEFAULT;
			case ActivityPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
				return isMultireceive != IS_MULTIRECEIVE_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isMulticast: ");
		result.append(isMulticast);
		result.append(", isMultireceive: ");
		result.append(isMultireceive);
		result.append(')');
		return result.toString();
	}

} //ObjectFlowImpl
