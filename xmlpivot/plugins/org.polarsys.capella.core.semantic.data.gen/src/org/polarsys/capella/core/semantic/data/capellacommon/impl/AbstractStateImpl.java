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

package org.polarsys.capella.core.semantic.data.capellacommon.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.semantic.data.capellacommon.AbstractState;
import org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage;

import org.polarsys.capella.core.semantic.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.semantic.data.modellingcore.IState;
import org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.impl.AbstractStateImpl#getReferencedStates <em>Referenced States</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.impl.AbstractStateImpl#getAvailableInStates <em>Available In States</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.impl.AbstractStateImpl#getRealizedAbstractStates <em>Realized Abstract States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractStateImpl extends NamedElementImpl implements AbstractState {
	/**
	 * The cached value of the '{@link #getReferencedStates() <em>Referenced States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<IState> referencedStates;

	/**
	 * The cached value of the '{@link #getAvailableInStates() <em>Available In States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableInStates()
	 * @generated
	 * @ordered
	 */
	protected EList<IState> availableInStates;

	/**
	 * The cached value of the '{@link #getRealizedAbstractStates() <em>Realized Abstract States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedAbstractStates()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractState> realizedAbstractStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.ABSTRACT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IState> getReferencedStates() {
		if (referencedStates == null) {
			referencedStates = new EObjectResolvingEList<IState>(IState.class, this, CapellacommonPackage.ABSTRACT_STATE__REFERENCED_STATES);
		}
		return referencedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IState> getAvailableInStates() {
		if (availableInStates == null) {
			availableInStates = new EObjectResolvingEList<IState>(IState.class, this, CapellacommonPackage.ABSTRACT_STATE__AVAILABLE_IN_STATES);
		}
		return availableInStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractState> getRealizedAbstractStates() {
		if (realizedAbstractStates == null) {
			realizedAbstractStates = new EObjectEList<AbstractState>(AbstractState.class, this, CapellacommonPackage.ABSTRACT_STATE__REALIZED_ABSTRACT_STATES);
		}
		return realizedAbstractStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapellacommonPackage.ABSTRACT_STATE__REFERENCED_STATES:
				return getReferencedStates();
			case CapellacommonPackage.ABSTRACT_STATE__AVAILABLE_IN_STATES:
				return getAvailableInStates();
			case CapellacommonPackage.ABSTRACT_STATE__REALIZED_ABSTRACT_STATES:
				return getRealizedAbstractStates();
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
			case CapellacommonPackage.ABSTRACT_STATE__REFERENCED_STATES:
				getReferencedStates().clear();
				getReferencedStates().addAll((Collection<? extends IState>)newValue);
				return;
			case CapellacommonPackage.ABSTRACT_STATE__AVAILABLE_IN_STATES:
				getAvailableInStates().clear();
				getAvailableInStates().addAll((Collection<? extends IState>)newValue);
				return;
			case CapellacommonPackage.ABSTRACT_STATE__REALIZED_ABSTRACT_STATES:
				getRealizedAbstractStates().clear();
				getRealizedAbstractStates().addAll((Collection<? extends AbstractState>)newValue);
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
			case CapellacommonPackage.ABSTRACT_STATE__REFERENCED_STATES:
				getReferencedStates().clear();
				return;
			case CapellacommonPackage.ABSTRACT_STATE__AVAILABLE_IN_STATES:
				getAvailableInStates().clear();
				return;
			case CapellacommonPackage.ABSTRACT_STATE__REALIZED_ABSTRACT_STATES:
				getRealizedAbstractStates().clear();
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
			case CapellacommonPackage.ABSTRACT_STATE__REFERENCED_STATES:
				return referencedStates != null && !referencedStates.isEmpty();
			case CapellacommonPackage.ABSTRACT_STATE__AVAILABLE_IN_STATES:
				return availableInStates != null && !availableInStates.isEmpty();
			case CapellacommonPackage.ABSTRACT_STATE__REALIZED_ABSTRACT_STATES:
				return realizedAbstractStates != null && !realizedAbstractStates.isEmpty();
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
		if (baseClass == IState.class) {
			switch (derivedFeatureID) {
				case CapellacommonPackage.ABSTRACT_STATE__REFERENCED_STATES: return ModellingcorePackage.ISTATE__REFERENCED_STATES;
				case CapellacommonPackage.ABSTRACT_STATE__AVAILABLE_IN_STATES: return ModellingcorePackage.ISTATE__AVAILABLE_IN_STATES;
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
		if (baseClass == IState.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ISTATE__REFERENCED_STATES: return CapellacommonPackage.ABSTRACT_STATE__REFERENCED_STATES;
				case ModellingcorePackage.ISTATE__AVAILABLE_IN_STATES: return CapellacommonPackage.ABSTRACT_STATE__AVAILABLE_IN_STATES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AbstractStateImpl
