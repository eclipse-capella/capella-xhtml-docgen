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

package org.polarsys.capella.core.semantic.data.information.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.capellacore.impl.FeatureImpl;

import org.polarsys.capella.core.semantic.data.information.ExchangeItem;
import org.polarsys.capella.core.semantic.data.information.InformationPackage;
import org.polarsys.capella.core.semantic.data.information.Operation;
import org.polarsys.capella.core.semantic.data.information.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.impl.OperationImpl#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.impl.OperationImpl#getAllocatedOperations <em>Allocated Operations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.impl.OperationImpl#getRealizedExchangeItems <em>Realized Exchange Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OperationImpl extends FeatureImpl implements Operation {
	/**
	 * The cached value of the '{@link #getOwnedParameters() <em>Owned Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameters;

	/**
	 * The cached value of the '{@link #getAllocatedOperations() <em>Allocated Operations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> allocatedOperations;

	/**
	 * The cached value of the '{@link #getRealizedExchangeItems() <em>Realized Exchange Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedExchangeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeItem> realizedExchangeItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameters() {
		if (ownedParameters == null) {
			ownedParameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, InformationPackage.OPERATION__OWNED_PARAMETERS);
		}
		return ownedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getAllocatedOperations() {
		if (allocatedOperations == null) {
			allocatedOperations = new EObjectResolvingEList<Operation>(Operation.class, this, InformationPackage.OPERATION__ALLOCATED_OPERATIONS);
		}
		return allocatedOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeItem> getRealizedExchangeItems() {
		if (realizedExchangeItems == null) {
			realizedExchangeItems = new EObjectResolvingEList<ExchangeItem>(ExchangeItem.class, this, InformationPackage.OPERATION__REALIZED_EXCHANGE_ITEMS);
		}
		return realizedExchangeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InformationPackage.OPERATION__OWNED_PARAMETERS:
				return ((InternalEList<?>)getOwnedParameters()).basicRemove(otherEnd, msgs);
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
			case InformationPackage.OPERATION__OWNED_PARAMETERS:
				return getOwnedParameters();
			case InformationPackage.OPERATION__ALLOCATED_OPERATIONS:
				return getAllocatedOperations();
			case InformationPackage.OPERATION__REALIZED_EXCHANGE_ITEMS:
				return getRealizedExchangeItems();
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
			case InformationPackage.OPERATION__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case InformationPackage.OPERATION__ALLOCATED_OPERATIONS:
				getAllocatedOperations().clear();
				getAllocatedOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case InformationPackage.OPERATION__REALIZED_EXCHANGE_ITEMS:
				getRealizedExchangeItems().clear();
				getRealizedExchangeItems().addAll((Collection<? extends ExchangeItem>)newValue);
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
			case InformationPackage.OPERATION__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				return;
			case InformationPackage.OPERATION__ALLOCATED_OPERATIONS:
				getAllocatedOperations().clear();
				return;
			case InformationPackage.OPERATION__REALIZED_EXCHANGE_ITEMS:
				getRealizedExchangeItems().clear();
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
			case InformationPackage.OPERATION__OWNED_PARAMETERS:
				return ownedParameters != null && !ownedParameters.isEmpty();
			case InformationPackage.OPERATION__ALLOCATED_OPERATIONS:
				return allocatedOperations != null && !allocatedOperations.isEmpty();
			case InformationPackage.OPERATION__REALIZED_EXCHANGE_ITEMS:
				return realizedExchangeItems != null && !realizedExchangeItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationImpl
