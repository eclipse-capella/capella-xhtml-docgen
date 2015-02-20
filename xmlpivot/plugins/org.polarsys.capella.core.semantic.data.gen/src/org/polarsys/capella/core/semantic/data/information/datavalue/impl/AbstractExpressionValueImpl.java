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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.semantic.data.information.Unit;

import org.polarsys.capella.core.semantic.data.information.datavalue.AbstractComplexValue;
import org.polarsys.capella.core.semantic.data.information.datavalue.AbstractEnumerationValue;
import org.polarsys.capella.core.semantic.data.information.datavalue.AbstractExpressionValue;
import org.polarsys.capella.core.semantic.data.information.datavalue.AbstractStringValue;
import org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage;
import org.polarsys.capella.core.semantic.data.information.datavalue.NumericValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Expression Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datavalue.impl.AbstractExpressionValueImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datavalue.impl.AbstractExpressionValueImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datavalue.impl.AbstractExpressionValueImpl#getUnparsedExpression <em>Unparsed Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractExpressionValueImpl extends AbstractBooleanValueImpl implements AbstractExpressionValue {
	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit unit;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnparsedExpression() <em>Unparsed Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnparsedExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String UNPARSED_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnparsedExpression() <em>Unparsed Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnparsedExpression()
	 * @generated
	 * @ordered
	 */
	protected String unparsedExpression = UNPARSED_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractExpressionValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatavaluePackage.Literals.ABSTRACT_EXPRESSION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (Unit)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Unit newUnit) {
		Unit oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnparsedExpression() {
		return unparsedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnparsedExpression(String newUnparsedExpression) {
		String oldUnparsedExpression = unparsedExpression;
		unparsedExpression = newUnparsedExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNPARSED_EXPRESSION, oldUnparsedExpression, unparsedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__EXPRESSION:
				return getExpression();
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNPARSED_EXPRESSION:
				return getUnparsedExpression();
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
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT:
				setUnit((Unit)newValue);
				return;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__EXPRESSION:
				setExpression((String)newValue);
				return;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNPARSED_EXPRESSION:
				setUnparsedExpression((String)newValue);
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
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT:
				setUnit((Unit)null);
				return;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNPARSED_EXPRESSION:
				setUnparsedExpression(UNPARSED_EXPRESSION_EDEFAULT);
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
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT:
				return unit != null;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNPARSED_EXPRESSION:
				return UNPARSED_EXPRESSION_EDEFAULT == null ? unparsedExpression != null : !UNPARSED_EXPRESSION_EDEFAULT.equals(unparsedExpression);
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
		if (baseClass == AbstractComplexValue.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEnumerationValue.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NumericValue.class) {
			switch (derivedFeatureID) {
				case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT: return DatavaluePackage.NUMERIC_VALUE__UNIT;
				default: return -1;
			}
		}
		if (baseClass == AbstractStringValue.class) {
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
		if (baseClass == AbstractComplexValue.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEnumerationValue.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NumericValue.class) {
			switch (baseFeatureID) {
				case DatavaluePackage.NUMERIC_VALUE__UNIT: return DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT;
				default: return -1;
			}
		}
		if (baseClass == AbstractStringValue.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (expression: ");
		result.append(expression);
		result.append(", unparsedExpression: ");
		result.append(unparsedExpression);
		result.append(')');
		return result.toString();
	}

} //AbstractExpressionValueImpl
