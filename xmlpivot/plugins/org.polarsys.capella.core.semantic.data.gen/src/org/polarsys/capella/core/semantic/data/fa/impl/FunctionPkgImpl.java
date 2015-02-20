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

package org.polarsys.capella.core.semantic.data.fa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.capellacommon.GenericTrace;

import org.polarsys.capella.core.semantic.data.capellacore.PropertyValuePkg;

import org.polarsys.capella.core.semantic.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.semantic.data.fa.ExchangeCategory;
import org.polarsys.capella.core.semantic.data.fa.FaPackage;
import org.polarsys.capella.core.semantic.data.fa.FunctionPkg;

import org.polarsys.capella.core.semantic.data.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionPkgImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionPkgImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionPkgImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionPkgImpl#getOwnedCategories <em>Owned Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FunctionPkgImpl extends NamedElementImpl implements FunctionPkg {
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
	 * The cached value of the '{@link #getOwnedCategories() <em>Owned Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeCategory> ownedCategories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTION_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericTrace> getContainedGenericTraces() {
		if (containedGenericTraces == null) {
			containedGenericTraces = new EObjectContainmentEList<GenericTrace>(GenericTrace.class, this, FaPackage.FUNCTION_PKG__CONTAINED_GENERIC_TRACES);
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
			containedRequirementsTraces = new EObjectContainmentEList<RequirementsTrace>(RequirementsTrace.class, this, FaPackage.FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES);
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
			ownedPropertyValuePkgs = new EObjectContainmentEList<PropertyValuePkg>(PropertyValuePkg.class, this, FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeCategory> getOwnedCategories() {
		if (ownedCategories == null) {
			ownedCategories = new EObjectContainmentEList<ExchangeCategory>(ExchangeCategory.class, this, FaPackage.FUNCTION_PKG__OWNED_CATEGORIES);
		}
		return ownedCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaPackage.FUNCTION_PKG__CONTAINED_GENERIC_TRACES:
				return ((InternalEList<?>)getContainedGenericTraces()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return ((InternalEList<?>)getContainedRequirementsTraces()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTION_PKG__OWNED_CATEGORIES:
				return ((InternalEList<?>)getOwnedCategories()).basicRemove(otherEnd, msgs);
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
			case FaPackage.FUNCTION_PKG__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case FaPackage.FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case FaPackage.FUNCTION_PKG__OWNED_CATEGORIES:
				return getOwnedCategories();
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
			case FaPackage.FUNCTION_PKG__CONTAINED_GENERIC_TRACES:
				getContainedGenericTraces().clear();
				getContainedGenericTraces().addAll((Collection<? extends GenericTrace>)newValue);
				return;
			case FaPackage.FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES:
				getContainedRequirementsTraces().clear();
				getContainedRequirementsTraces().addAll((Collection<? extends RequirementsTrace>)newValue);
				return;
			case FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case FaPackage.FUNCTION_PKG__OWNED_CATEGORIES:
				getOwnedCategories().clear();
				getOwnedCategories().addAll((Collection<? extends ExchangeCategory>)newValue);
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
			case FaPackage.FUNCTION_PKG__CONTAINED_GENERIC_TRACES:
				getContainedGenericTraces().clear();
				return;
			case FaPackage.FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES:
				getContainedRequirementsTraces().clear();
				return;
			case FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case FaPackage.FUNCTION_PKG__OWNED_CATEGORIES:
				getOwnedCategories().clear();
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
			case FaPackage.FUNCTION_PKG__CONTAINED_GENERIC_TRACES:
				return containedGenericTraces != null && !containedGenericTraces.isEmpty();
			case FaPackage.FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return containedRequirementsTraces != null && !containedRequirementsTraces.isEmpty();
			case FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case FaPackage.FUNCTION_PKG__OWNED_CATEGORIES:
				return ownedCategories != null && !ownedCategories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionPkgImpl
