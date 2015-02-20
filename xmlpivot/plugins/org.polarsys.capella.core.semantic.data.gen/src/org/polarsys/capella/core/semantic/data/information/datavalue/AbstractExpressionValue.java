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
 * A representation of the model object '<em><b>Abstract Expression Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datavalue.AbstractExpressionValue#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datavalue.AbstractExpressionValue#getUnparsedExpression <em>Unparsed Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage#getAbstractExpressionValue()
 * @model abstract="true"
 * @generated
 */
public interface AbstractExpressionValue extends AbstractBooleanValue, AbstractComplexValue, AbstractEnumerationValue, NumericValue, AbstractStringValue {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage#getAbstractExpressionValue_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datavalue.AbstractExpressionValue#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Unparsed Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unparsed Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unparsed Expression</em>' attribute.
	 * @see #setUnparsedExpression(String)
	 * @see org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage#getAbstractExpressionValue_UnparsedExpression()
	 * @model
	 * @generated
	 */
	String getUnparsedExpression();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datavalue.AbstractExpressionValue#getUnparsedExpression <em>Unparsed Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unparsed Expression</em>' attribute.
	 * @see #getUnparsedExpression()
	 * @generated
	 */
	void setUnparsedExpression(String value);

} // AbstractExpressionValue
