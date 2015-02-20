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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.capellacore.InvolvedElement;

import org.polarsys.capella.core.semantic.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.semantic.data.cs.AbstractPathInvolvedElement;
import org.polarsys.capella.core.semantic.data.cs.CsPackage;
import org.polarsys.capella.core.semantic.data.cs.PhysicalPath;
import org.polarsys.capella.core.semantic.data.cs.PhysicalPathInvolvement;

import org.polarsys.capella.core.semantic.data.fa.ComponentExchange;
import org.polarsys.capella.core.semantic.data.fa.ComponentExchangeAllocator;
import org.polarsys.capella.core.semantic.data.fa.FaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathImpl#getAllocatedComponentExchanges <em>Allocated Component Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathImpl#getOwnedPhysicalPathInvolvements <em>Owned Physical Path Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathImpl#getFirstPhysicalPathInvolvements <em>First Physical Path Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathImpl#getRealizedPhysicalPaths <em>Realized Physical Paths</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalPathImpl extends NamedElementImpl implements PhysicalPath {
	/**
	 * The cached value of the '{@link #getAllocatedComponentExchanges() <em>Allocated Component Exchanges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedComponentExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchange> allocatedComponentExchanges;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalPathInvolvements() <em>Owned Physical Path Involvements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalPathInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPathInvolvement> ownedPhysicalPathInvolvements;

	/**
	 * The cached value of the '{@link #getFirstPhysicalPathInvolvements() <em>First Physical Path Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPhysicalPathInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPathInvolvement> firstPhysicalPathInvolvements;

	/**
	 * The cached value of the '{@link #getRealizedPhysicalPaths() <em>Realized Physical Paths</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedPhysicalPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPath> realizedPhysicalPaths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PHYSICAL_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentExchange> getAllocatedComponentExchanges() {
		if (allocatedComponentExchanges == null) {
			allocatedComponentExchanges = new EObjectResolvingEList<ComponentExchange>(ComponentExchange.class, this, CsPackage.PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES);
		}
		return allocatedComponentExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalPathInvolvement> getOwnedPhysicalPathInvolvements() {
		if (ownedPhysicalPathInvolvements == null) {
			ownedPhysicalPathInvolvements = new EObjectContainmentEList<PhysicalPathInvolvement>(PhysicalPathInvolvement.class, this, CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS);
		}
		return ownedPhysicalPathInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalPathInvolvement> getFirstPhysicalPathInvolvements() {
		if (firstPhysicalPathInvolvements == null) {
			firstPhysicalPathInvolvements = new EObjectResolvingEList<PhysicalPathInvolvement>(PhysicalPathInvolvement.class, this, CsPackage.PHYSICAL_PATH__FIRST_PHYSICAL_PATH_INVOLVEMENTS);
		}
		return firstPhysicalPathInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalPath> getRealizedPhysicalPaths() {
		if (realizedPhysicalPaths == null) {
			realizedPhysicalPaths = new EObjectResolvingEList<PhysicalPath>(PhysicalPath.class, this, CsPackage.PHYSICAL_PATH__REALIZED_PHYSICAL_PATHS);
		}
		return realizedPhysicalPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS:
				return ((InternalEList<?>)getOwnedPhysicalPathInvolvements()).basicRemove(otherEnd, msgs);
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
			case CsPackage.PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES:
				return getAllocatedComponentExchanges();
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS:
				return getOwnedPhysicalPathInvolvements();
			case CsPackage.PHYSICAL_PATH__FIRST_PHYSICAL_PATH_INVOLVEMENTS:
				return getFirstPhysicalPathInvolvements();
			case CsPackage.PHYSICAL_PATH__REALIZED_PHYSICAL_PATHS:
				return getRealizedPhysicalPaths();
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
			case CsPackage.PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES:
				getAllocatedComponentExchanges().clear();
				getAllocatedComponentExchanges().addAll((Collection<? extends ComponentExchange>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS:
				getOwnedPhysicalPathInvolvements().clear();
				getOwnedPhysicalPathInvolvements().addAll((Collection<? extends PhysicalPathInvolvement>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH__FIRST_PHYSICAL_PATH_INVOLVEMENTS:
				getFirstPhysicalPathInvolvements().clear();
				getFirstPhysicalPathInvolvements().addAll((Collection<? extends PhysicalPathInvolvement>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH__REALIZED_PHYSICAL_PATHS:
				getRealizedPhysicalPaths().clear();
				getRealizedPhysicalPaths().addAll((Collection<? extends PhysicalPath>)newValue);
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
			case CsPackage.PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES:
				getAllocatedComponentExchanges().clear();
				return;
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS:
				getOwnedPhysicalPathInvolvements().clear();
				return;
			case CsPackage.PHYSICAL_PATH__FIRST_PHYSICAL_PATH_INVOLVEMENTS:
				getFirstPhysicalPathInvolvements().clear();
				return;
			case CsPackage.PHYSICAL_PATH__REALIZED_PHYSICAL_PATHS:
				getRealizedPhysicalPaths().clear();
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
			case CsPackage.PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES:
				return allocatedComponentExchanges != null && !allocatedComponentExchanges.isEmpty();
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS:
				return ownedPhysicalPathInvolvements != null && !ownedPhysicalPathInvolvements.isEmpty();
			case CsPackage.PHYSICAL_PATH__FIRST_PHYSICAL_PATH_INVOLVEMENTS:
				return firstPhysicalPathInvolvements != null && !firstPhysicalPathInvolvements.isEmpty();
			case CsPackage.PHYSICAL_PATH__REALIZED_PHYSICAL_PATHS:
				return realizedPhysicalPaths != null && !realizedPhysicalPaths.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ComponentExchangeAllocator.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES: return FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__ALLOCATED_COMPONENT_EXCHANGES;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractPathInvolvedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ComponentExchangeAllocator.class) {
			switch (baseFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__ALLOCATED_COMPONENT_EXCHANGES: return CsPackage.PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractPathInvolvedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PhysicalPathImpl
