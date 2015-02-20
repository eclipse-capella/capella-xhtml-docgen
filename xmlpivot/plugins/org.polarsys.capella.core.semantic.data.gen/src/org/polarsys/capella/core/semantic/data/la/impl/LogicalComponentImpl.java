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

import org.polarsys.capella.core.semantic.data.cs.impl.SystemComponentImpl;

import org.polarsys.capella.core.semantic.data.la.LaPackage;
import org.polarsys.capella.core.semantic.data.la.LogicalComponent;
import org.polarsys.capella.core.semantic.data.la.LogicalComponentPkg;
import org.polarsys.capella.core.semantic.data.la.LogicalFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalComponentImpl#getOwnedLogicalComponents <em>Owned Logical Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalComponentImpl#getOwnedLogicalComponentPkgs <em>Owned Logical Component Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalComponentImpl#getAllocatedLogicalFunctions <em>Allocated Logical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalComponentImpl#getRealizedSystems <em>Realized Systems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalComponentImpl extends SystemComponentImpl implements LogicalComponent {
	/**
	 * The cached value of the '{@link #getOwnedLogicalComponents() <em>Owned Logical Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComponent> ownedLogicalComponents;

	/**
	 * The cached value of the '{@link #getOwnedLogicalComponentPkgs() <em>Owned Logical Component Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalComponentPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComponentPkg> ownedLogicalComponentPkgs;

	/**
	 * The cached value of the '{@link #getAllocatedLogicalFunctions() <em>Allocated Logical Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedLogicalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalFunction> allocatedLogicalFunctions;

	/**
	 * The cached value of the '{@link #getRealizedSystems() <em>Realized Systems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<org.polarsys.capella.core.semantic.data.ctx.System> realizedSystems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaPackage.Literals.LOGICAL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalComponent> getOwnedLogicalComponents() {
		if (ownedLogicalComponents == null) {
			ownedLogicalComponents = new EObjectContainmentEList<LogicalComponent>(LogicalComponent.class, this, LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENTS);
		}
		return ownedLogicalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalComponentPkg> getOwnedLogicalComponentPkgs() {
		if (ownedLogicalComponentPkgs == null) {
			ownedLogicalComponentPkgs = new EObjectContainmentEList<LogicalComponentPkg>(LogicalComponentPkg.class, this, LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_PKGS);
		}
		return ownedLogicalComponentPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalFunction> getAllocatedLogicalFunctions() {
		if (allocatedLogicalFunctions == null) {
			allocatedLogicalFunctions = new EObjectResolvingEList<LogicalFunction>(LogicalFunction.class, this, LaPackage.LOGICAL_COMPONENT__ALLOCATED_LOGICAL_FUNCTIONS);
		}
		return allocatedLogicalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.polarsys.capella.core.semantic.data.ctx.System> getRealizedSystems() {
		if (realizedSystems == null) {
			realizedSystems = new EObjectResolvingEList<org.polarsys.capella.core.semantic.data.ctx.System>(org.polarsys.capella.core.semantic.data.ctx.System.class, this, LaPackage.LOGICAL_COMPONENT__REALIZED_SYSTEMS);
		}
		return realizedSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENTS:
				return ((InternalEList<?>)getOwnedLogicalComponents()).basicRemove(otherEnd, msgs);
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_PKGS:
				return ((InternalEList<?>)getOwnedLogicalComponentPkgs()).basicRemove(otherEnd, msgs);
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
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENTS:
				return getOwnedLogicalComponents();
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_PKGS:
				return getOwnedLogicalComponentPkgs();
			case LaPackage.LOGICAL_COMPONENT__ALLOCATED_LOGICAL_FUNCTIONS:
				return getAllocatedLogicalFunctions();
			case LaPackage.LOGICAL_COMPONENT__REALIZED_SYSTEMS:
				return getRealizedSystems();
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
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENTS:
				getOwnedLogicalComponents().clear();
				getOwnedLogicalComponents().addAll((Collection<? extends LogicalComponent>)newValue);
				return;
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_PKGS:
				getOwnedLogicalComponentPkgs().clear();
				getOwnedLogicalComponentPkgs().addAll((Collection<? extends LogicalComponentPkg>)newValue);
				return;
			case LaPackage.LOGICAL_COMPONENT__ALLOCATED_LOGICAL_FUNCTIONS:
				getAllocatedLogicalFunctions().clear();
				getAllocatedLogicalFunctions().addAll((Collection<? extends LogicalFunction>)newValue);
				return;
			case LaPackage.LOGICAL_COMPONENT__REALIZED_SYSTEMS:
				getRealizedSystems().clear();
				getRealizedSystems().addAll((Collection<? extends org.polarsys.capella.core.semantic.data.ctx.System>)newValue);
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
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENTS:
				getOwnedLogicalComponents().clear();
				return;
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_PKGS:
				getOwnedLogicalComponentPkgs().clear();
				return;
			case LaPackage.LOGICAL_COMPONENT__ALLOCATED_LOGICAL_FUNCTIONS:
				getAllocatedLogicalFunctions().clear();
				return;
			case LaPackage.LOGICAL_COMPONENT__REALIZED_SYSTEMS:
				getRealizedSystems().clear();
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
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENTS:
				return ownedLogicalComponents != null && !ownedLogicalComponents.isEmpty();
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_PKGS:
				return ownedLogicalComponentPkgs != null && !ownedLogicalComponentPkgs.isEmpty();
			case LaPackage.LOGICAL_COMPONENT__ALLOCATED_LOGICAL_FUNCTIONS:
				return allocatedLogicalFunctions != null && !allocatedLogicalFunctions.isEmpty();
			case LaPackage.LOGICAL_COMPONENT__REALIZED_SYSTEMS:
				return realizedSystems != null && !realizedSystems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalComponentImpl
