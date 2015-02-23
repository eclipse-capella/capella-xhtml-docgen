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

package org.polarsys.capella.core.semantic.data.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.capellacore.impl.GeneralClassImpl;

import org.polarsys.capella.core.semantic.data.cs.CsPackage;
import org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation;
import org.polarsys.capella.core.semantic.data.cs.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.InterfaceImpl#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.InterfaceImpl#getOwnedExchangeItemAllocations <em>Owned Exchange Item Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.InterfaceImpl#getRealizedContextInterfaces <em>Realized Context Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.InterfaceImpl#getRealizedLogicalInterfaces <em>Realized Logical Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends GeneralClassImpl implements Interface {
	/**
	 * The default value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final String MECHANISM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected String mechanism = MECHANISM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedExchangeItemAllocations() <em>Owned Exchange Item Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExchangeItemAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeItemAllocation> ownedExchangeItemAllocations;

	/**
	 * The cached value of the '{@link #getRealizedContextInterfaces() <em>Realized Context Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedContextInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> realizedContextInterfaces;

	/**
	 * The cached value of the '{@link #getRealizedLogicalInterfaces() <em>Realized Logical Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedLogicalInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> realizedLogicalInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMechanism() {
		return mechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMechanism(String newMechanism) {
		String oldMechanism = mechanism;
		mechanism = newMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.INTERFACE__MECHANISM, oldMechanism, mechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeItemAllocation> getOwnedExchangeItemAllocations() {
		if (ownedExchangeItemAllocations == null) {
			ownedExchangeItemAllocations = new EObjectContainmentEList<ExchangeItemAllocation>(ExchangeItemAllocation.class, this, CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS);
		}
		return ownedExchangeItemAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRealizedContextInterfaces() {
		if (realizedContextInterfaces == null) {
			realizedContextInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.INTERFACE__REALIZED_CONTEXT_INTERFACES);
		}
		return realizedContextInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRealizedLogicalInterfaces() {
		if (realizedLogicalInterfaces == null) {
			realizedLogicalInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.INTERFACE__REALIZED_LOGICAL_INTERFACES);
		}
		return realizedLogicalInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedExchangeItemAllocations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.INTERFACE__MECHANISM:
				return getMechanism();
			case CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
				return getOwnedExchangeItemAllocations();
			case CsPackage.INTERFACE__REALIZED_CONTEXT_INTERFACES:
				return getRealizedContextInterfaces();
			case CsPackage.INTERFACE__REALIZED_LOGICAL_INTERFACES:
				return getRealizedLogicalInterfaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CsPackage.INTERFACE__MECHANISM:
				setMechanism((String)newValue);
				return;
			case CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
				getOwnedExchangeItemAllocations().clear();
				getOwnedExchangeItemAllocations().addAll((Collection<? extends ExchangeItemAllocation>)newValue);
				return;
			case CsPackage.INTERFACE__REALIZED_CONTEXT_INTERFACES:
				getRealizedContextInterfaces().clear();
				getRealizedContextInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case CsPackage.INTERFACE__REALIZED_LOGICAL_INTERFACES:
				getRealizedLogicalInterfaces().clear();
				getRealizedLogicalInterfaces().addAll((Collection<? extends Interface>)newValue);
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
			case CsPackage.INTERFACE__MECHANISM:
				setMechanism(MECHANISM_EDEFAULT);
				return;
			case CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
				getOwnedExchangeItemAllocations().clear();
				return;
			case CsPackage.INTERFACE__REALIZED_CONTEXT_INTERFACES:
				getRealizedContextInterfaces().clear();
				return;
			case CsPackage.INTERFACE__REALIZED_LOGICAL_INTERFACES:
				getRealizedLogicalInterfaces().clear();
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
			case CsPackage.INTERFACE__MECHANISM:
				return MECHANISM_EDEFAULT == null ? mechanism != null : !MECHANISM_EDEFAULT.equals(mechanism);
			case CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
				return ownedExchangeItemAllocations != null && !ownedExchangeItemAllocations.isEmpty();
			case CsPackage.INTERFACE__REALIZED_CONTEXT_INTERFACES:
				return realizedContextInterfaces != null && !realizedContextInterfaces.isEmpty();
			case CsPackage.INTERFACE__REALIZED_LOGICAL_INTERFACES:
				return realizedLogicalInterfaces != null && !realizedLogicalInterfaces.isEmpty();
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
		result.append(" (mechanism: ");
		result.append(mechanism);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
