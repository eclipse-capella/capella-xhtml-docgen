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

package org.polarsys.capella.core.semantic.data.information.datavalue.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.semantic.data.information.datavalue.BinaryExpression;
import org.polarsys.capella.core.semantic.data.information.datavalue.BinaryOperator;
import org.polarsys.capella.core.semantic.data.information.datavalue.DataValue;
import org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datavalue.impl.BinaryExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datavalue.impl.BinaryExpressionImpl#getOwnedLeftOperand <em>Owned Left Operand</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datavalue.impl.BinaryExpressionImpl#getOwnedRightOperand <em>Owned Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryExpressionImpl extends AbstractExpressionValueImpl implements BinaryExpression {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryOperator OPERATOR_EDEFAULT = BinaryOperator.UNSET;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected BinaryOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedLeftOperand() <em>Owned Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLeftOperand()
	 * @generated
	 * @ordered
	 */
	protected DataValue ownedLeftOperand;

	/**
	 * The cached value of the '{@link #getOwnedRightOperand() <em>Owned Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRightOperand()
	 * @generated
	 * @ordered
	 */
	protected DataValue ownedRightOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatavaluePackage.Literals.BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(BinaryOperator newOperator) {
		BinaryOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatavaluePackage.BINARY_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue getOwnedLeftOperand() {
		return ownedLeftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedLeftOperand(DataValue newOwnedLeftOperand, NotificationChain msgs) {
		DataValue oldOwnedLeftOperand = ownedLeftOperand;
		ownedLeftOperand = newOwnedLeftOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatavaluePackage.BINARY_EXPRESSION__OWNED_LEFT_OPERAND, oldOwnedLeftOperand, newOwnedLeftOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedLeftOperand(DataValue newOwnedLeftOperand) {
		if (newOwnedLeftOperand != ownedLeftOperand) {
			NotificationChain msgs = null;
			if (ownedLeftOperand != null)
				msgs = ((InternalEObject)ownedLeftOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatavaluePackage.BINARY_EXPRESSION__OWNED_LEFT_OPERAND, null, msgs);
			if (newOwnedLeftOperand != null)
				msgs = ((InternalEObject)newOwnedLeftOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatavaluePackage.BINARY_EXPRESSION__OWNED_LEFT_OPERAND, null, msgs);
			msgs = basicSetOwnedLeftOperand(newOwnedLeftOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatavaluePackage.BINARY_EXPRESSION__OWNED_LEFT_OPERAND, newOwnedLeftOperand, newOwnedLeftOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue getOwnedRightOperand() {
		return ownedRightOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedRightOperand(DataValue newOwnedRightOperand, NotificationChain msgs) {
		DataValue oldOwnedRightOperand = ownedRightOperand;
		ownedRightOperand = newOwnedRightOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatavaluePackage.BINARY_EXPRESSION__OWNED_RIGHT_OPERAND, oldOwnedRightOperand, newOwnedRightOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedRightOperand(DataValue newOwnedRightOperand) {
		if (newOwnedRightOperand != ownedRightOperand) {
			NotificationChain msgs = null;
			if (ownedRightOperand != null)
				msgs = ((InternalEObject)ownedRightOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatavaluePackage.BINARY_EXPRESSION__OWNED_RIGHT_OPERAND, null, msgs);
			if (newOwnedRightOperand != null)
				msgs = ((InternalEObject)newOwnedRightOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatavaluePackage.BINARY_EXPRESSION__OWNED_RIGHT_OPERAND, null, msgs);
			msgs = basicSetOwnedRightOperand(newOwnedRightOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatavaluePackage.BINARY_EXPRESSION__OWNED_RIGHT_OPERAND, newOwnedRightOperand, newOwnedRightOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatavaluePackage.BINARY_EXPRESSION__OWNED_LEFT_OPERAND:
				return basicSetOwnedLeftOperand(null, msgs);
			case DatavaluePackage.BINARY_EXPRESSION__OWNED_RIGHT_OPERAND:
				return basicSetOwnedRightOperand(null, msgs);
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
			case DatavaluePackage.BINARY_EXPRESSION__OPERATOR:
				return getOperator();
			case DatavaluePackage.BINARY_EXPRESSION__OWNED_LEFT_OPERAND:
				return getOwnedLeftOperand();
			case DatavaluePackage.BINARY_EXPRESSION__OWNED_RIGHT_OPERAND:
				return getOwnedRightOperand();
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
			case DatavaluePackage.BINARY_EXPRESSION__OPERATOR:
				setOperator((BinaryOperator)newValue);
				return;
			case DatavaluePackage.BINARY_EXPRESSION__OWNED_LEFT_OPERAND:
				setOwnedLeftOperand((DataValue)newValue);
				return;
			case DatavaluePackage.BINARY_EXPRESSION__OWNED_RIGHT_OPERAND:
				setOwnedRightOperand((DataValue)newValue);
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
			case DatavaluePackage.BINARY_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case DatavaluePackage.BINARY_EXPRESSION__OWNED_LEFT_OPERAND:
				setOwnedLeftOperand((DataValue)null);
				return;
			case DatavaluePackage.BINARY_EXPRESSION__OWNED_RIGHT_OPERAND:
				setOwnedRightOperand((DataValue)null);
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
			case DatavaluePackage.BINARY_EXPRESSION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case DatavaluePackage.BINARY_EXPRESSION__OWNED_LEFT_OPERAND:
				return ownedLeftOperand != null;
			case DatavaluePackage.BINARY_EXPRESSION__OWNED_RIGHT_OPERAND:
				return ownedRightOperand != null;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //BinaryExpressionImpl
