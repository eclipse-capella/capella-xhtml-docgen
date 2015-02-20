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

package org.polarsys.capella.core.semantic.data.information.datatype;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement;
import org.polarsys.capella.core.semantic.data.capellacore.VisibilityKind;

import org.polarsys.capella.core.semantic.data.information.datavalue.DataValue;
import org.polarsys.capella.core.semantic.data.information.datavalue.DataValueContainer;

import org.polarsys.capella.core.semantic.data.modellingcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.DataType#isDiscrete <em>Discrete</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.DataType#isMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.DataType#isMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.DataType#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.DataType#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.DataType#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.DataType#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.DataType#getRealizedDataTypes <em>Realized Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getDataType()
 * @model abstract="true"
 * @generated
 */
public interface DataType extends GeneralizableElement, DataValueContainer, ModelElement {
	/**
	 * Returns the value of the '<em><b>Discrete</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discrete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discrete</em>' attribute.
	 * @see #setDiscrete(boolean)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getDataType_Discrete()
	 * @model default="true"
	 * @generated
	 */
	boolean isDiscrete();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.DataType#isDiscrete <em>Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discrete</em>' attribute.
	 * @see #isDiscrete()
	 * @generated
	 */
	void setDiscrete(boolean value);

	/**
	 * Returns the value of the '<em><b>Min Inclusive</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Inclusive</em>' attribute.
	 * @see #setMinInclusive(boolean)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getDataType_MinInclusive()
	 * @model default="true"
	 * @generated
	 */
	boolean isMinInclusive();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.DataType#isMinInclusive <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Inclusive</em>' attribute.
	 * @see #isMinInclusive()
	 * @generated
	 */
	void setMinInclusive(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Inclusive</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Inclusive</em>' attribute.
	 * @see #setMaxInclusive(boolean)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getDataType_MaxInclusive()
	 * @model default="true"
	 * @generated
	 */
	boolean isMaxInclusive();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.DataType#isMaxInclusive <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Inclusive</em>' attribute.
	 * @see #isMaxInclusive()
	 * @generated
	 */
	void setMaxInclusive(boolean value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getDataType_Pattern()
	 * @model
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.DataType#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.capellacore.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getDataType_Visibility()
	 * @model
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.DataType#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' reference.
	 * @see #setDefaultValue(DataValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getDataType_DefaultValue()
	 * @model
	 * @generated
	 */
	DataValue getDefaultValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.DataType#getDefaultValue <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(DataValue value);

	/**
	 * Returns the value of the '<em><b>Null Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Value</em>' reference.
	 * @see #setNullValue(DataValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getDataType_NullValue()
	 * @model
	 * @generated
	 */
	DataValue getNullValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.DataType#getNullValue <em>Null Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Value</em>' reference.
	 * @see #getNullValue()
	 * @generated
	 */
	void setNullValue(DataValue value);

	/**
	 * Returns the value of the '<em><b>Realized Data Types</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.datatype.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Data Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Data Types</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getDataType_RealizedDataTypes()
	 * @model
	 * @generated
	 */
	EList<DataType> getRealizedDataTypes();

} // DataType
