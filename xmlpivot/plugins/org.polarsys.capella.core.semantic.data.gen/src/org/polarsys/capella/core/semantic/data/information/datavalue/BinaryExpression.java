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

package org.polarsys.capella.core.semantic.data.information.datavalue;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datavalue.BinaryExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datavalue.BinaryExpression#getOwnedLeftOperand <em>Owned Left Operand</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datavalue.BinaryExpression#getOwnedRightOperand <em>Owned Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends AbstractExpressionValue {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.information.datavalue.BinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.datavalue.BinaryOperator
	 * @see #setOperator(BinaryOperator)
	 * @see org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage#getBinaryExpression_Operator()
	 * @model
	 * @generated
	 */
	BinaryOperator getOperator();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datavalue.BinaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.datavalue.BinaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryOperator value);

	/**
	 * Returns the value of the '<em><b>Owned Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Left Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Left Operand</em>' containment reference.
	 * @see #setOwnedLeftOperand(DataValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage#getBinaryExpression_OwnedLeftOperand()
	 * @model containment="true"
	 * @generated
	 */
	DataValue getOwnedLeftOperand();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datavalue.BinaryExpression#getOwnedLeftOperand <em>Owned Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Left Operand</em>' containment reference.
	 * @see #getOwnedLeftOperand()
	 * @generated
	 */
	void setOwnedLeftOperand(DataValue value);

	/**
	 * Returns the value of the '<em><b>Owned Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Right Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Right Operand</em>' containment reference.
	 * @see #setOwnedRightOperand(DataValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage#getBinaryExpression_OwnedRightOperand()
	 * @model containment="true"
	 * @generated
	 */
	DataValue getOwnedRightOperand();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datavalue.BinaryExpression#getOwnedRightOperand <em>Owned Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Right Operand</em>' containment reference.
	 * @see #getOwnedRightOperand()
	 * @generated
	 */
	void setOwnedRightOperand(DataValue value);

} // BinaryExpression
