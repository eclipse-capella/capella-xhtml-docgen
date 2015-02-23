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

package org.polarsys.capella.core.semantic.data.ctx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.ctx.CtxPackage;
import org.polarsys.capella.core.semantic.data.ctx.SystemFunction;
import org.polarsys.capella.core.semantic.data.ctx.SystemFunctionPkg;

import org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionImpl;

import org.polarsys.capella.core.semantic.data.oa.OperationalActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemFunctionImpl#getOwnedSystemFunctionPkgs <em>Owned System Function Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemFunctionImpl#getRealizedOperationalActivities <em>Realized Operational Activities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemFunctionImpl#getContainedSystemFunctions <em>Contained System Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemFunctionImpl extends AbstractFunctionImpl implements SystemFunction {
	/**
	 * The cached value of the '{@link #getOwnedSystemFunctionPkgs() <em>Owned System Function Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemFunctionPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFunctionPkg> ownedSystemFunctionPkgs;

	/**
	 * The cached value of the '{@link #getRealizedOperationalActivities() <em>Realized Operational Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedOperationalActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalActivity> realizedOperationalActivities;

	/**
	 * The cached value of the '{@link #getContainedSystemFunctions() <em>Contained System Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedSystemFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFunction> containedSystemFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.SYSTEM_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemFunctionPkg> getOwnedSystemFunctionPkgs() {
		if (ownedSystemFunctionPkgs == null) {
			ownedSystemFunctionPkgs = new EObjectContainmentEList<SystemFunctionPkg>(SystemFunctionPkg.class, this, CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS);
		}
		return ownedSystemFunctionPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalActivity> getRealizedOperationalActivities() {
		if (realizedOperationalActivities == null) {
			realizedOperationalActivities = new EObjectResolvingEList<OperationalActivity>(OperationalActivity.class, this, CtxPackage.SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES);
		}
		return realizedOperationalActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemFunction> getContainedSystemFunctions() {
		if (containedSystemFunctions == null) {
			containedSystemFunctions = new EObjectContainmentEList<SystemFunction>(SystemFunction.class, this, CtxPackage.SYSTEM_FUNCTION__CONTAINED_SYSTEM_FUNCTIONS);
		}
		return containedSystemFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS:
				return ((InternalEList<?>)getOwnedSystemFunctionPkgs()).basicRemove(otherEnd, msgs);
			case CtxPackage.SYSTEM_FUNCTION__CONTAINED_SYSTEM_FUNCTIONS:
				return ((InternalEList<?>)getContainedSystemFunctions()).basicRemove(otherEnd, msgs);
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
			case CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS:
				return getOwnedSystemFunctionPkgs();
			case CtxPackage.SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES:
				return getRealizedOperationalActivities();
			case CtxPackage.SYSTEM_FUNCTION__CONTAINED_SYSTEM_FUNCTIONS:
				return getContainedSystemFunctions();
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
			case CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS:
				getOwnedSystemFunctionPkgs().clear();
				getOwnedSystemFunctionPkgs().addAll((Collection<? extends SystemFunctionPkg>)newValue);
				return;
			case CtxPackage.SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES:
				getRealizedOperationalActivities().clear();
				getRealizedOperationalActivities().addAll((Collection<? extends OperationalActivity>)newValue);
				return;
			case CtxPackage.SYSTEM_FUNCTION__CONTAINED_SYSTEM_FUNCTIONS:
				getContainedSystemFunctions().clear();
				getContainedSystemFunctions().addAll((Collection<? extends SystemFunction>)newValue);
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
			case CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS:
				getOwnedSystemFunctionPkgs().clear();
				return;
			case CtxPackage.SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES:
				getRealizedOperationalActivities().clear();
				return;
			case CtxPackage.SYSTEM_FUNCTION__CONTAINED_SYSTEM_FUNCTIONS:
				getContainedSystemFunctions().clear();
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
			case CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS:
				return ownedSystemFunctionPkgs != null && !ownedSystemFunctionPkgs.isEmpty();
			case CtxPackage.SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES:
				return realizedOperationalActivities != null && !realizedOperationalActivities.isEmpty();
			case CtxPackage.SYSTEM_FUNCTION__CONTAINED_SYSTEM_FUNCTIONS:
				return containedSystemFunctions != null && !containedSystemFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemFunctionImpl
