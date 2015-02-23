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

package org.polarsys.capella.core.semantic.data.pa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionImpl;

import org.polarsys.capella.core.semantic.data.la.LogicalFunction;

import org.polarsys.capella.core.semantic.data.pa.PaPackage;
import org.polarsys.capella.core.semantic.data.pa.PhysicalFunction;
import org.polarsys.capella.core.semantic.data.pa.PhysicalFunctionPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalFunctionImpl#getOwnedPhysicalFunctionPkgs <em>Owned Physical Function Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalFunctionImpl#getRealizedLogicalFunctions <em>Realized Logical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalFunctionImpl#getContainedPhysicalFunctions <em>Contained Physical Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalFunctionImpl extends AbstractFunctionImpl implements PhysicalFunction {
	/**
	 * The cached value of the '{@link #getOwnedPhysicalFunctionPkgs() <em>Owned Physical Function Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalFunctionPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalFunctionPkg> ownedPhysicalFunctionPkgs;

	/**
	 * The cached value of the '{@link #getRealizedLogicalFunctions() <em>Realized Logical Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedLogicalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalFunction> realizedLogicalFunctions;

	/**
	 * The cached value of the '{@link #getContainedPhysicalFunctions() <em>Contained Physical Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPhysicalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalFunction> containedPhysicalFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaPackage.Literals.PHYSICAL_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalFunctionPkg> getOwnedPhysicalFunctionPkgs() {
		if (ownedPhysicalFunctionPkgs == null) {
			ownedPhysicalFunctionPkgs = new EObjectContainmentEList<PhysicalFunctionPkg>(PhysicalFunctionPkg.class, this, PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS);
		}
		return ownedPhysicalFunctionPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalFunction> getRealizedLogicalFunctions() {
		if (realizedLogicalFunctions == null) {
			realizedLogicalFunctions = new EObjectResolvingEList<LogicalFunction>(LogicalFunction.class, this, PaPackage.PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS);
		}
		return realizedLogicalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalFunction> getContainedPhysicalFunctions() {
		if (containedPhysicalFunctions == null) {
			containedPhysicalFunctions = new EObjectContainmentEList<PhysicalFunction>(PhysicalFunction.class, this, PaPackage.PHYSICAL_FUNCTION__CONTAINED_PHYSICAL_FUNCTIONS);
		}
		return containedPhysicalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS:
				return ((InternalEList<?>)getOwnedPhysicalFunctionPkgs()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_FUNCTION__CONTAINED_PHYSICAL_FUNCTIONS:
				return ((InternalEList<?>)getContainedPhysicalFunctions()).basicRemove(otherEnd, msgs);
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
			case PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS:
				return getOwnedPhysicalFunctionPkgs();
			case PaPackage.PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS:
				return getRealizedLogicalFunctions();
			case PaPackage.PHYSICAL_FUNCTION__CONTAINED_PHYSICAL_FUNCTIONS:
				return getContainedPhysicalFunctions();
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
			case PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS:
				getOwnedPhysicalFunctionPkgs().clear();
				getOwnedPhysicalFunctionPkgs().addAll((Collection<? extends PhysicalFunctionPkg>)newValue);
				return;
			case PaPackage.PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS:
				getRealizedLogicalFunctions().clear();
				getRealizedLogicalFunctions().addAll((Collection<? extends LogicalFunction>)newValue);
				return;
			case PaPackage.PHYSICAL_FUNCTION__CONTAINED_PHYSICAL_FUNCTIONS:
				getContainedPhysicalFunctions().clear();
				getContainedPhysicalFunctions().addAll((Collection<? extends PhysicalFunction>)newValue);
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
			case PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS:
				getOwnedPhysicalFunctionPkgs().clear();
				return;
			case PaPackage.PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS:
				getRealizedLogicalFunctions().clear();
				return;
			case PaPackage.PHYSICAL_FUNCTION__CONTAINED_PHYSICAL_FUNCTIONS:
				getContainedPhysicalFunctions().clear();
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
			case PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS:
				return ownedPhysicalFunctionPkgs != null && !ownedPhysicalFunctionPkgs.isEmpty();
			case PaPackage.PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS:
				return realizedLogicalFunctions != null && !realizedLogicalFunctions.isEmpty();
			case PaPackage.PHYSICAL_FUNCTION__CONTAINED_PHYSICAL_FUNCTIONS:
				return containedPhysicalFunctions != null && !containedPhysicalFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalFunctionImpl
