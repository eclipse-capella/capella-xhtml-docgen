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

package org.polarsys.capella.core.semantic.data.information.datatype.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage;
import org.polarsys.capella.core.semantic.data.information.datatype.StringType;

import org.polarsys.capella.core.semantic.data.information.datavalue.AbstractStringValue;
import org.polarsys.capella.core.semantic.data.information.datavalue.NumericValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.impl.StringTypeImpl#getOwnedDefaultValue <em>Owned Default Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.impl.StringTypeImpl#getOwnedNullValue <em>Owned Null Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.impl.StringTypeImpl#getOwnedMinLength <em>Owned Min Length</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.impl.StringTypeImpl#getOwnedMaxLength <em>Owned Max Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringTypeImpl extends DataTypeImpl implements StringType {
	/**
	 * The cached value of the '{@link #getOwnedDefaultValue() <em>Owned Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected AbstractStringValue ownedDefaultValue;

	/**
	 * The cached value of the '{@link #getOwnedNullValue() <em>Owned Null Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNullValue()
	 * @generated
	 * @ordered
	 */
	protected AbstractStringValue ownedNullValue;

	/**
	 * The cached value of the '{@link #getOwnedMinLength() <em>Owned Min Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMinLength()
	 * @generated
	 * @ordered
	 */
	protected NumericValue ownedMinLength;

	/**
	 * The cached value of the '{@link #getOwnedMaxLength() <em>Owned Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMaxLength()
	 * @generated
	 * @ordered
	 */
	protected NumericValue ownedMaxLength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypePackage.Literals.STRING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStringValue getOwnedDefaultValue() {
		return ownedDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedDefaultValue(AbstractStringValue newOwnedDefaultValue, NotificationChain msgs) {
		AbstractStringValue oldOwnedDefaultValue = ownedDefaultValue;
		ownedDefaultValue = newOwnedDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypePackage.STRING_TYPE__OWNED_DEFAULT_VALUE, oldOwnedDefaultValue, newOwnedDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedDefaultValue(AbstractStringValue newOwnedDefaultValue) {
		if (newOwnedDefaultValue != ownedDefaultValue) {
			NotificationChain msgs = null;
			if (ownedDefaultValue != null)
				msgs = ((InternalEObject)ownedDefaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypePackage.STRING_TYPE__OWNED_DEFAULT_VALUE, null, msgs);
			if (newOwnedDefaultValue != null)
				msgs = ((InternalEObject)newOwnedDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypePackage.STRING_TYPE__OWNED_DEFAULT_VALUE, null, msgs);
			msgs = basicSetOwnedDefaultValue(newOwnedDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.STRING_TYPE__OWNED_DEFAULT_VALUE, newOwnedDefaultValue, newOwnedDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStringValue getOwnedNullValue() {
		return ownedNullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedNullValue(AbstractStringValue newOwnedNullValue, NotificationChain msgs) {
		AbstractStringValue oldOwnedNullValue = ownedNullValue;
		ownedNullValue = newOwnedNullValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypePackage.STRING_TYPE__OWNED_NULL_VALUE, oldOwnedNullValue, newOwnedNullValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedNullValue(AbstractStringValue newOwnedNullValue) {
		if (newOwnedNullValue != ownedNullValue) {
			NotificationChain msgs = null;
			if (ownedNullValue != null)
				msgs = ((InternalEObject)ownedNullValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypePackage.STRING_TYPE__OWNED_NULL_VALUE, null, msgs);
			if (newOwnedNullValue != null)
				msgs = ((InternalEObject)newOwnedNullValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypePackage.STRING_TYPE__OWNED_NULL_VALUE, null, msgs);
			msgs = basicSetOwnedNullValue(newOwnedNullValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.STRING_TYPE__OWNED_NULL_VALUE, newOwnedNullValue, newOwnedNullValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericValue getOwnedMinLength() {
		return ownedMinLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMinLength(NumericValue newOwnedMinLength, NotificationChain msgs) {
		NumericValue oldOwnedMinLength = ownedMinLength;
		ownedMinLength = newOwnedMinLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypePackage.STRING_TYPE__OWNED_MIN_LENGTH, oldOwnedMinLength, newOwnedMinLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMinLength(NumericValue newOwnedMinLength) {
		if (newOwnedMinLength != ownedMinLength) {
			NotificationChain msgs = null;
			if (ownedMinLength != null)
				msgs = ((InternalEObject)ownedMinLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypePackage.STRING_TYPE__OWNED_MIN_LENGTH, null, msgs);
			if (newOwnedMinLength != null)
				msgs = ((InternalEObject)newOwnedMinLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypePackage.STRING_TYPE__OWNED_MIN_LENGTH, null, msgs);
			msgs = basicSetOwnedMinLength(newOwnedMinLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.STRING_TYPE__OWNED_MIN_LENGTH, newOwnedMinLength, newOwnedMinLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericValue getOwnedMaxLength() {
		return ownedMaxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMaxLength(NumericValue newOwnedMaxLength, NotificationChain msgs) {
		NumericValue oldOwnedMaxLength = ownedMaxLength;
		ownedMaxLength = newOwnedMaxLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypePackage.STRING_TYPE__OWNED_MAX_LENGTH, oldOwnedMaxLength, newOwnedMaxLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMaxLength(NumericValue newOwnedMaxLength) {
		if (newOwnedMaxLength != ownedMaxLength) {
			NotificationChain msgs = null;
			if (ownedMaxLength != null)
				msgs = ((InternalEObject)ownedMaxLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypePackage.STRING_TYPE__OWNED_MAX_LENGTH, null, msgs);
			if (newOwnedMaxLength != null)
				msgs = ((InternalEObject)newOwnedMaxLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypePackage.STRING_TYPE__OWNED_MAX_LENGTH, null, msgs);
			msgs = basicSetOwnedMaxLength(newOwnedMaxLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.STRING_TYPE__OWNED_MAX_LENGTH, newOwnedMaxLength, newOwnedMaxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypePackage.STRING_TYPE__OWNED_DEFAULT_VALUE:
				return basicSetOwnedDefaultValue(null, msgs);
			case DatatypePackage.STRING_TYPE__OWNED_NULL_VALUE:
				return basicSetOwnedNullValue(null, msgs);
			case DatatypePackage.STRING_TYPE__OWNED_MIN_LENGTH:
				return basicSetOwnedMinLength(null, msgs);
			case DatatypePackage.STRING_TYPE__OWNED_MAX_LENGTH:
				return basicSetOwnedMaxLength(null, msgs);
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
			case DatatypePackage.STRING_TYPE__OWNED_DEFAULT_VALUE:
				return getOwnedDefaultValue();
			case DatatypePackage.STRING_TYPE__OWNED_NULL_VALUE:
				return getOwnedNullValue();
			case DatatypePackage.STRING_TYPE__OWNED_MIN_LENGTH:
				return getOwnedMinLength();
			case DatatypePackage.STRING_TYPE__OWNED_MAX_LENGTH:
				return getOwnedMaxLength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatatypePackage.STRING_TYPE__OWNED_DEFAULT_VALUE:
				setOwnedDefaultValue((AbstractStringValue)newValue);
				return;
			case DatatypePackage.STRING_TYPE__OWNED_NULL_VALUE:
				setOwnedNullValue((AbstractStringValue)newValue);
				return;
			case DatatypePackage.STRING_TYPE__OWNED_MIN_LENGTH:
				setOwnedMinLength((NumericValue)newValue);
				return;
			case DatatypePackage.STRING_TYPE__OWNED_MAX_LENGTH:
				setOwnedMaxLength((NumericValue)newValue);
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
			case DatatypePackage.STRING_TYPE__OWNED_DEFAULT_VALUE:
				setOwnedDefaultValue((AbstractStringValue)null);
				return;
			case DatatypePackage.STRING_TYPE__OWNED_NULL_VALUE:
				setOwnedNullValue((AbstractStringValue)null);
				return;
			case DatatypePackage.STRING_TYPE__OWNED_MIN_LENGTH:
				setOwnedMinLength((NumericValue)null);
				return;
			case DatatypePackage.STRING_TYPE__OWNED_MAX_LENGTH:
				setOwnedMaxLength((NumericValue)null);
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
			case DatatypePackage.STRING_TYPE__OWNED_DEFAULT_VALUE:
				return ownedDefaultValue != null;
			case DatatypePackage.STRING_TYPE__OWNED_NULL_VALUE:
				return ownedNullValue != null;
			case DatatypePackage.STRING_TYPE__OWNED_MIN_LENGTH:
				return ownedMinLength != null;
			case DatatypePackage.STRING_TYPE__OWNED_MAX_LENGTH:
				return ownedMaxLength != null;
		}
		return super.eIsSet(featureID);
	}

} //StringTypeImpl
