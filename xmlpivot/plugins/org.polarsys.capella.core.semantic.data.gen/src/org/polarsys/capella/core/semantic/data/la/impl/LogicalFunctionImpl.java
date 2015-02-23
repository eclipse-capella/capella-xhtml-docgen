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

package org.polarsys.capella.core.semantic.data.la.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.ctx.SystemFunction;

import org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionImpl;

import org.polarsys.capella.core.semantic.data.la.LaPackage;
import org.polarsys.capella.core.semantic.data.la.LogicalFunction;
import org.polarsys.capella.core.semantic.data.la.LogicalFunctionPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalFunctionImpl#getOwnedLogicalFunctionPkgs <em>Owned Logical Function Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalFunctionImpl#getRealizedSystemFunctions <em>Realized System Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalFunctionImpl#getContainedLogicalFunctions <em>Contained Logical Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalFunctionImpl extends AbstractFunctionImpl implements LogicalFunction {
	/**
	 * The cached value of the '{@link #getOwnedLogicalFunctionPkgs() <em>Owned Logical Function Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalFunctionPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalFunctionPkg> ownedLogicalFunctionPkgs;

	/**
	 * The cached value of the '{@link #getRealizedSystemFunctions() <em>Realized System Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedSystemFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFunction> realizedSystemFunctions;

	/**
	 * The cached value of the '{@link #getContainedLogicalFunctions() <em>Contained Logical Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedLogicalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalFunction> containedLogicalFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaPackage.Literals.LOGICAL_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalFunctionPkg> getOwnedLogicalFunctionPkgs() {
		if (ownedLogicalFunctionPkgs == null) {
			ownedLogicalFunctionPkgs = new EObjectContainmentEList<LogicalFunctionPkg>(LogicalFunctionPkg.class, this, LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS);
		}
		return ownedLogicalFunctionPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemFunction> getRealizedSystemFunctions() {
		if (realizedSystemFunctions == null) {
			realizedSystemFunctions = new EObjectResolvingEList<SystemFunction>(SystemFunction.class, this, LaPackage.LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS);
		}
		return realizedSystemFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalFunction> getContainedLogicalFunctions() {
		if (containedLogicalFunctions == null) {
			containedLogicalFunctions = new EObjectContainmentEList<LogicalFunction>(LogicalFunction.class, this, LaPackage.LOGICAL_FUNCTION__CONTAINED_LOGICAL_FUNCTIONS);
		}
		return containedLogicalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS:
				return ((InternalEList<?>)getOwnedLogicalFunctionPkgs()).basicRemove(otherEnd, msgs);
			case LaPackage.LOGICAL_FUNCTION__CONTAINED_LOGICAL_FUNCTIONS:
				return ((InternalEList<?>)getContainedLogicalFunctions()).basicRemove(otherEnd, msgs);
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
			case LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS:
				return getOwnedLogicalFunctionPkgs();
			case LaPackage.LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS:
				return getRealizedSystemFunctions();
			case LaPackage.LOGICAL_FUNCTION__CONTAINED_LOGICAL_FUNCTIONS:
				return getContainedLogicalFunctions();
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
			case LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS:
				getOwnedLogicalFunctionPkgs().clear();
				getOwnedLogicalFunctionPkgs().addAll((Collection<? extends LogicalFunctionPkg>)newValue);
				return;
			case LaPackage.LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS:
				getRealizedSystemFunctions().clear();
				getRealizedSystemFunctions().addAll((Collection<? extends SystemFunction>)newValue);
				return;
			case LaPackage.LOGICAL_FUNCTION__CONTAINED_LOGICAL_FUNCTIONS:
				getContainedLogicalFunctions().clear();
				getContainedLogicalFunctions().addAll((Collection<? extends LogicalFunction>)newValue);
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
			case LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS:
				getOwnedLogicalFunctionPkgs().clear();
				return;
			case LaPackage.LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS:
				getRealizedSystemFunctions().clear();
				return;
			case LaPackage.LOGICAL_FUNCTION__CONTAINED_LOGICAL_FUNCTIONS:
				getContainedLogicalFunctions().clear();
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
			case LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS:
				return ownedLogicalFunctionPkgs != null && !ownedLogicalFunctionPkgs.isEmpty();
			case LaPackage.LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS:
				return realizedSystemFunctions != null && !realizedSystemFunctions.isEmpty();
			case LaPackage.LOGICAL_FUNCTION__CONTAINED_LOGICAL_FUNCTIONS:
				return containedLogicalFunctions != null && !containedLogicalFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalFunctionImpl
