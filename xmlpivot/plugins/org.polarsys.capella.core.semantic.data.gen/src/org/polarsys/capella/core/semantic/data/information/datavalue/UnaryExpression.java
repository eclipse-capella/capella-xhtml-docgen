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
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datavalue.UnaryExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datavalue.UnaryExpression#getOwnedOperand <em>Owned Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends AbstractExpressionValue {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.information.datavalue.UnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.datavalue.UnaryOperator
	 * @see #setOperator(UnaryOperator)
	 * @see org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage#getUnaryExpression_Operator()
	 * @model
	 * @generated
	 */
	UnaryOperator getOperator();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datavalue.UnaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.datavalue.UnaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryOperator value);

	/**
	 * Returns the value of the '<em><b>Owned Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operand</em>' containment reference.
	 * @see #setOwnedOperand(DataValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage#getUnaryExpression_OwnedOperand()
	 * @model containment="true"
	 * @generated
	 */
	DataValue getOwnedOperand();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datavalue.UnaryExpression#getOwnedOperand <em>Owned Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Operand</em>' containment reference.
	 * @see #getOwnedOperand()
	 * @generated
	 */
	void setOwnedOperand(DataValue value);

} // UnaryExpression
