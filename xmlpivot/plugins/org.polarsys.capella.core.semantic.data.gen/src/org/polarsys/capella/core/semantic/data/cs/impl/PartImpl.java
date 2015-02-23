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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.semantic.data.cs.CsPackage;
import org.polarsys.capella.core.semantic.data.cs.Part;

import org.polarsys.capella.core.semantic.data.information.impl.PropertyImpl;

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PartImpl#getDeployedParts <em>Deployed Parts</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PartImpl#getOwnedAbstractType <em>Owned Abstract Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartImpl extends PropertyImpl implements Part {
	/**
	 * The cached value of the '{@link #getDeployedParts() <em>Deployed Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> deployedParts;

	/**
	 * The cached value of the '{@link #getOwnedAbstractType() <em>Owned Abstract Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAbstractType()
	 * @generated
	 * @ordered
	 */
	protected AbstractType ownedAbstractType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getDeployedParts() {
		if (deployedParts == null) {
			deployedParts = new EObjectResolvingEList<Part>(Part.class, this, CsPackage.PART__DEPLOYED_PARTS);
		}
		return deployedParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType getOwnedAbstractType() {
		return ownedAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedAbstractType(AbstractType newOwnedAbstractType, NotificationChain msgs) {
		AbstractType oldOwnedAbstractType = ownedAbstractType;
		ownedAbstractType = newOwnedAbstractType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.PART__OWNED_ABSTRACT_TYPE, oldOwnedAbstractType, newOwnedAbstractType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedAbstractType(AbstractType newOwnedAbstractType) {
		if (newOwnedAbstractType != ownedAbstractType) {
			NotificationChain msgs = null;
			if (ownedAbstractType != null)
				msgs = ((InternalEObject)ownedAbstractType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.PART__OWNED_ABSTRACT_TYPE, null, msgs);
			if (newOwnedAbstractType != null)
				msgs = ((InternalEObject)newOwnedAbstractType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.PART__OWNED_ABSTRACT_TYPE, null, msgs);
			msgs = basicSetOwnedAbstractType(newOwnedAbstractType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PART__OWNED_ABSTRACT_TYPE, newOwnedAbstractType, newOwnedAbstractType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.PART__OWNED_ABSTRACT_TYPE:
				return basicSetOwnedAbstractType(null, msgs);
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
			case CsPackage.PART__DEPLOYED_PARTS:
				return getDeployedParts();
			case CsPackage.PART__OWNED_ABSTRACT_TYPE:
				return getOwnedAbstractType();
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
			case CsPackage.PART__DEPLOYED_PARTS:
				getDeployedParts().clear();
				getDeployedParts().addAll((Collection<? extends Part>)newValue);
				return;
			case CsPackage.PART__OWNED_ABSTRACT_TYPE:
				setOwnedAbstractType((AbstractType)newValue);
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
			case CsPackage.PART__DEPLOYED_PARTS:
				getDeployedParts().clear();
				return;
			case CsPackage.PART__OWNED_ABSTRACT_TYPE:
				setOwnedAbstractType((AbstractType)null);
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
			case CsPackage.PART__DEPLOYED_PARTS:
				return deployedParts != null && !deployedParts.isEmpty();
			case CsPackage.PART__OWNED_ABSTRACT_TYPE:
				return ownedAbstractType != null;
		}
		return super.eIsSet(featureID);
	}

} //PartImpl
