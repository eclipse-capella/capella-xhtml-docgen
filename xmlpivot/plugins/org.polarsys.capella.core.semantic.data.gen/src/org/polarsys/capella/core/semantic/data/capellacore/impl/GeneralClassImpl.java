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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.semantic.data.capellacore.GeneralClass;
import org.polarsys.capella.core.semantic.data.capellacore.VisibilityKind;

import org.polarsys.capella.core.semantic.data.information.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.impl.GeneralClassImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.impl.GeneralClassImpl#getContainedOperations <em>Contained Operations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.impl.GeneralClassImpl#getNestedGeneralClasses <em>Nested General Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GeneralClassImpl extends ClassifierImpl implements GeneralClass {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.UNSET;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainedOperations() <em>Contained Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> containedOperations;

	/**
	 * The cached value of the '{@link #getNestedGeneralClasses() <em>Nested General Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedGeneralClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralClass> nestedGeneralClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacorePackage.Literals.GENERAL_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacorePackage.GENERAL_CLASS__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getContainedOperations() {
		if (containedOperations == null) {
			containedOperations = new EObjectContainmentEList<Operation>(Operation.class, this, CapellacorePackage.GENERAL_CLASS__CONTAINED_OPERATIONS);
		}
		return containedOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralClass> getNestedGeneralClasses() {
		if (nestedGeneralClasses == null) {
			nestedGeneralClasses = new EObjectContainmentEList<GeneralClass>(GeneralClass.class, this, CapellacorePackage.GENERAL_CLASS__NESTED_GENERAL_CLASSES);
		}
		return nestedGeneralClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellacorePackage.GENERAL_CLASS__CONTAINED_OPERATIONS:
				return ((InternalEList<?>)getContainedOperations()).basicRemove(otherEnd, msgs);
			case CapellacorePackage.GENERAL_CLASS__NESTED_GENERAL_CLASSES:
				return ((InternalEList<?>)getNestedGeneralClasses()).basicRemove(otherEnd, msgs);
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
			case CapellacorePackage.GENERAL_CLASS__VISIBILITY:
				return getVisibility();
			case CapellacorePackage.GENERAL_CLASS__CONTAINED_OPERATIONS:
				return getContainedOperations();
			case CapellacorePackage.GENERAL_CLASS__NESTED_GENERAL_CLASSES:
				return getNestedGeneralClasses();
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
			case CapellacorePackage.GENERAL_CLASS__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case CapellacorePackage.GENERAL_CLASS__CONTAINED_OPERATIONS:
				getContainedOperations().clear();
				getContainedOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case CapellacorePackage.GENERAL_CLASS__NESTED_GENERAL_CLASSES:
				getNestedGeneralClasses().clear();
				getNestedGeneralClasses().addAll((Collection<? extends GeneralClass>)newValue);
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
			case CapellacorePackage.GENERAL_CLASS__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case CapellacorePackage.GENERAL_CLASS__CONTAINED_OPERATIONS:
				getContainedOperations().clear();
				return;
			case CapellacorePackage.GENERAL_CLASS__NESTED_GENERAL_CLASSES:
				getNestedGeneralClasses().clear();
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
			case CapellacorePackage.GENERAL_CLASS__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case CapellacorePackage.GENERAL_CLASS__CONTAINED_OPERATIONS:
				return containedOperations != null && !containedOperations.isEmpty();
			case CapellacorePackage.GENERAL_CLASS__NESTED_GENERAL_CLASSES:
				return nestedGeneralClasses != null && !nestedGeneralClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //GeneralClassImpl
