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

import org.polarsys.capella.core.semantic.data.la.LogicalComponent;

import org.polarsys.capella.core.semantic.data.pa.PaPackage;
import org.polarsys.capella.core.semantic.data.pa.PhysicalComponent;
import org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg;
import org.polarsys.capella.core.semantic.data.pa.PhysicalFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentImpl#getOwnedPhysicalComponents <em>Owned Physical Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentImpl#getOwnedPhysicalComponentPkgs <em>Owned Physical Component Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentImpl#getRealizedLogicalComponents <em>Realized Logical Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentImpl#getAllocatedPhysicalFunctions <em>Allocated Physical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentImpl#getDeployedPhysicalComponents <em>Deployed Physical Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalComponentImpl extends AbstractPhysicalComponentImpl implements PhysicalComponent {
	/**
	 * The cached value of the '{@link #getOwnedPhysicalComponents() <em>Owned Physical Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponent> ownedPhysicalComponents;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalComponentPkgs() <em>Owned Physical Component Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalComponentPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponentPkg> ownedPhysicalComponentPkgs;

	/**
	 * The cached value of the '{@link #getRealizedLogicalComponents() <em>Realized Logical Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedLogicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComponent> realizedLogicalComponents;

	/**
	 * The cached value of the '{@link #getAllocatedPhysicalFunctions() <em>Allocated Physical Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedPhysicalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalFunction> allocatedPhysicalFunctions;

	/**
	 * The cached value of the '{@link #getDeployedPhysicalComponents() <em>Deployed Physical Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedPhysicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponent> deployedPhysicalComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaPackage.Literals.PHYSICAL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalComponent> getOwnedPhysicalComponents() {
		if (ownedPhysicalComponents == null) {
			ownedPhysicalComponents = new EObjectContainmentEList<PhysicalComponent>(PhysicalComponent.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS);
		}
		return ownedPhysicalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalComponentPkg> getOwnedPhysicalComponentPkgs() {
		if (ownedPhysicalComponentPkgs == null) {
			ownedPhysicalComponentPkgs = new EObjectContainmentEList<PhysicalComponentPkg>(PhysicalComponentPkg.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS);
		}
		return ownedPhysicalComponentPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalComponent> getRealizedLogicalComponents() {
		if (realizedLogicalComponents == null) {
			realizedLogicalComponents = new EObjectResolvingEList<LogicalComponent>(LogicalComponent.class, this, PaPackage.PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS);
		}
		return realizedLogicalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalFunction> getAllocatedPhysicalFunctions() {
		if (allocatedPhysicalFunctions == null) {
			allocatedPhysicalFunctions = new EObjectResolvingEList<PhysicalFunction>(PhysicalFunction.class, this, PaPackage.PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS);
		}
		return allocatedPhysicalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalComponent> getDeployedPhysicalComponents() {
		if (deployedPhysicalComponents == null) {
			deployedPhysicalComponents = new EObjectResolvingEList<PhysicalComponent>(PhysicalComponent.class, this, PaPackage.PHYSICAL_COMPONENT__DEPLOYED_PHYSICAL_COMPONENTS);
		}
		return deployedPhysicalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS:
				return ((InternalEList<?>)getOwnedPhysicalComponents()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS:
				return ((InternalEList<?>)getOwnedPhysicalComponentPkgs()).basicRemove(otherEnd, msgs);
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
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS:
				return getOwnedPhysicalComponents();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS:
				return getOwnedPhysicalComponentPkgs();
			case PaPackage.PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS:
				return getRealizedLogicalComponents();
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS:
				return getAllocatedPhysicalFunctions();
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYED_PHYSICAL_COMPONENTS:
				return getDeployedPhysicalComponents();
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
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS:
				getOwnedPhysicalComponents().clear();
				getOwnedPhysicalComponents().addAll((Collection<? extends PhysicalComponent>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS:
				getOwnedPhysicalComponentPkgs().clear();
				getOwnedPhysicalComponentPkgs().addAll((Collection<? extends PhysicalComponentPkg>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS:
				getRealizedLogicalComponents().clear();
				getRealizedLogicalComponents().addAll((Collection<? extends LogicalComponent>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS:
				getAllocatedPhysicalFunctions().clear();
				getAllocatedPhysicalFunctions().addAll((Collection<? extends PhysicalFunction>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYED_PHYSICAL_COMPONENTS:
				getDeployedPhysicalComponents().clear();
				getDeployedPhysicalComponents().addAll((Collection<? extends PhysicalComponent>)newValue);
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
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS:
				getOwnedPhysicalComponents().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS:
				getOwnedPhysicalComponentPkgs().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS:
				getRealizedLogicalComponents().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS:
				getAllocatedPhysicalFunctions().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYED_PHYSICAL_COMPONENTS:
				getDeployedPhysicalComponents().clear();
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
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS:
				return ownedPhysicalComponents != null && !ownedPhysicalComponents.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS:
				return ownedPhysicalComponentPkgs != null && !ownedPhysicalComponentPkgs.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS:
				return realizedLogicalComponents != null && !realizedLogicalComponents.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS:
				return allocatedPhysicalFunctions != null && !allocatedPhysicalFunctions.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYED_PHYSICAL_COMPONENTS:
				return deployedPhysicalComponents != null && !deployedPhysicalComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalComponentImpl
