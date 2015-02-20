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

package org.polarsys.capella.core.semantic.data.capellacore.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.capellacommon.GenericTrace;

import org.polarsys.capella.core.semantic.data.capellacore.AbstractExchangeItemPkg;
import org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.semantic.data.capellacore.PropertyValuePkg;

import org.polarsys.capella.core.semantic.data.information.ExchangeItem;

import org.polarsys.capella.core.semantic.data.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Exchange Item Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.impl.AbstractExchangeItemPkgImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.impl.AbstractExchangeItemPkgImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.impl.AbstractExchangeItemPkgImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.impl.AbstractExchangeItemPkgImpl#getOwnedExchangeItems <em>Owned Exchange Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractExchangeItemPkgImpl extends NamedElementImpl implements AbstractExchangeItemPkg {
	/**
	 * The cached value of the '{@link #getContainedGenericTraces() <em>Contained Generic Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedGenericTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericTrace> containedGenericTraces;

	/**
	 * The cached value of the '{@link #getContainedRequirementsTraces() <em>Contained Requirements Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedRequirementsTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementsTrace> containedRequirementsTraces;

	/**
	 * The cached value of the '{@link #getOwnedPropertyValuePkgs() <em>Owned Property Value Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValuePkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValuePkg> ownedPropertyValuePkgs;

	/**
	 * The cached value of the '{@link #getOwnedExchangeItems() <em>Owned Exchange Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExchangeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeItem> ownedExchangeItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractExchangeItemPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacorePackage.Literals.ABSTRACT_EXCHANGE_ITEM_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericTrace> getContainedGenericTraces() {
		if (containedGenericTraces == null) {
			containedGenericTraces = new EObjectContainmentEList<GenericTrace>(GenericTrace.class, this, CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_GENERIC_TRACES);
		}
		return containedGenericTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementsTrace> getContainedRequirementsTraces() {
		if (containedRequirementsTraces == null) {
			containedRequirementsTraces = new EObjectContainmentEList<RequirementsTrace>(RequirementsTrace.class, this, CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_REQUIREMENTS_TRACES);
		}
		return containedRequirementsTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValuePkg> getOwnedPropertyValuePkgs() {
		if (ownedPropertyValuePkgs == null) {
			ownedPropertyValuePkgs = new EObjectContainmentEList<PropertyValuePkg>(PropertyValuePkg.class, this, CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeItem> getOwnedExchangeItems() {
		if (ownedExchangeItems == null) {
			ownedExchangeItems = new EObjectContainmentEList<ExchangeItem>(ExchangeItem.class, this, CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_EXCHANGE_ITEMS);
		}
		return ownedExchangeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_GENERIC_TRACES:
				return ((InternalEList<?>)getContainedGenericTraces()).basicRemove(otherEnd, msgs);
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return ((InternalEList<?>)getContainedRequirementsTraces()).basicRemove(otherEnd, msgs);
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_EXCHANGE_ITEMS:
				return ((InternalEList<?>)getOwnedExchangeItems()).basicRemove(otherEnd, msgs);
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
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_EXCHANGE_ITEMS:
				return getOwnedExchangeItems();
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
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_GENERIC_TRACES:
				getContainedGenericTraces().clear();
				getContainedGenericTraces().addAll((Collection<? extends GenericTrace>)newValue);
				return;
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_REQUIREMENTS_TRACES:
				getContainedRequirementsTraces().clear();
				getContainedRequirementsTraces().addAll((Collection<? extends RequirementsTrace>)newValue);
				return;
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_EXCHANGE_ITEMS:
				getOwnedExchangeItems().clear();
				getOwnedExchangeItems().addAll((Collection<? extends ExchangeItem>)newValue);
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
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_GENERIC_TRACES:
				getContainedGenericTraces().clear();
				return;
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_REQUIREMENTS_TRACES:
				getContainedRequirementsTraces().clear();
				return;
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_EXCHANGE_ITEMS:
				getOwnedExchangeItems().clear();
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
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_GENERIC_TRACES:
				return containedGenericTraces != null && !containedGenericTraces.isEmpty();
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return containedRequirementsTraces != null && !containedRequirementsTraces.isEmpty();
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_EXCHANGE_ITEMS:
				return ownedExchangeItems != null && !ownedExchangeItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractExchangeItemPkgImpl
