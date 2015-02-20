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

import org.polarsys.capella.core.semantic.data.information.datavalue.NumericValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.NumericType#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.NumericType#getOwnedDefaultValue <em>Owned Default Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.NumericType#getOwnedNullValue <em>Owned Null Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.NumericType#getOwnedMinValue <em>Owned Min Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.NumericType#getOwnedMaxValue <em>Owned Max Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getNumericType()
 * @model
 * @generated
 */
public interface NumericType extends DataType {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"INTEGER"</code>.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.information.datatype.NumericTypeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.NumericTypeKind
	 * @see #setKind(NumericTypeKind)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getNumericType_Kind()
	 * @model default="INTEGER"
	 * @generated
	 */
	NumericTypeKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.NumericType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.NumericTypeKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(NumericTypeKind value);

	/**
	 * Returns the value of the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Default Value</em>' containment reference.
	 * @see #setOwnedDefaultValue(NumericValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getNumericType_OwnedDefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	NumericValue getOwnedDefaultValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.NumericType#getOwnedDefaultValue <em>Owned Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Default Value</em>' containment reference.
	 * @see #getOwnedDefaultValue()
	 * @generated
	 */
	void setOwnedDefaultValue(NumericValue value);

	/**
	 * Returns the value of the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Null Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Null Value</em>' containment reference.
	 * @see #setOwnedNullValue(NumericValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getNumericType_OwnedNullValue()
	 * @model containment="true"
	 * @generated
	 */
	NumericValue getOwnedNullValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.NumericType#getOwnedNullValue <em>Owned Null Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Null Value</em>' containment reference.
	 * @see #getOwnedNullValue()
	 * @generated
	 */
	void setOwnedNullValue(NumericValue value);

	/**
	 * Returns the value of the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Min Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Min Value</em>' containment reference.
	 * @see #setOwnedMinValue(NumericValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getNumericType_OwnedMinValue()
	 * @model containment="true"
	 * @generated
	 */
	NumericValue getOwnedMinValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.NumericType#getOwnedMinValue <em>Owned Min Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Min Value</em>' containment reference.
	 * @see #getOwnedMinValue()
	 * @generated
	 */
	void setOwnedMinValue(NumericValue value);

	/**
	 * Returns the value of the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Max Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Max Value</em>' containment reference.
	 * @see #setOwnedMaxValue(NumericValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getNumericType_OwnedMaxValue()
	 * @model containment="true"
	 * @generated
	 */
	NumericValue getOwnedMaxValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.NumericType#getOwnedMaxValue <em>Owned Max Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Max Value</em>' containment reference.
	 * @see #getOwnedMaxValue()
	 * @generated
	 */
	void setOwnedMaxValue(NumericValue value);

} // NumericType
