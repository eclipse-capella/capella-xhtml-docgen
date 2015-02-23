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

import org.polarsys.capella.core.semantic.data.information.datavalue.AbstractEnumerationValue;
import org.polarsys.capella.core.semantic.data.information.datavalue.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.Enumeration#getOwnedLiterals <em>Owned Literals</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.Enumeration#getOwnedDefaultValue <em>Owned Default Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.Enumeration#getOwnedNullValue <em>Owned Null Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.Enumeration#getOwnedMinValue <em>Owned Min Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.Enumeration#getOwnedMaxValue <em>Owned Max Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.Enumeration#getDomainType <em>Domain Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends DataType {
	/**
	 * Returns the value of the '<em><b>Owned Literals</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.datavalue.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Literals</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getEnumeration_OwnedLiterals()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getOwnedLiterals();

	/**
	 * Returns the value of the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Default Value</em>' containment reference.
	 * @see #setOwnedDefaultValue(AbstractEnumerationValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getEnumeration_OwnedDefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	AbstractEnumerationValue getOwnedDefaultValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.Enumeration#getOwnedDefaultValue <em>Owned Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Default Value</em>' containment reference.
	 * @see #getOwnedDefaultValue()
	 * @generated
	 */
	void setOwnedDefaultValue(AbstractEnumerationValue value);

	/**
	 * Returns the value of the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Null Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Null Value</em>' containment reference.
	 * @see #setOwnedNullValue(AbstractEnumerationValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getEnumeration_OwnedNullValue()
	 * @model containment="true"
	 * @generated
	 */
	AbstractEnumerationValue getOwnedNullValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.Enumeration#getOwnedNullValue <em>Owned Null Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Null Value</em>' containment reference.
	 * @see #getOwnedNullValue()
	 * @generated
	 */
	void setOwnedNullValue(AbstractEnumerationValue value);

	/**
	 * Returns the value of the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Min Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Min Value</em>' containment reference.
	 * @see #setOwnedMinValue(AbstractEnumerationValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getEnumeration_OwnedMinValue()
	 * @model containment="true"
	 * @generated
	 */
	AbstractEnumerationValue getOwnedMinValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.Enumeration#getOwnedMinValue <em>Owned Min Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Min Value</em>' containment reference.
	 * @see #getOwnedMinValue()
	 * @generated
	 */
	void setOwnedMinValue(AbstractEnumerationValue value);

	/**
	 * Returns the value of the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Max Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Max Value</em>' containment reference.
	 * @see #setOwnedMaxValue(AbstractEnumerationValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getEnumeration_OwnedMaxValue()
	 * @model containment="true"
	 * @generated
	 */
	AbstractEnumerationValue getOwnedMaxValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.Enumeration#getOwnedMaxValue <em>Owned Max Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Max Value</em>' containment reference.
	 * @see #getOwnedMaxValue()
	 * @generated
	 */
	void setOwnedMaxValue(AbstractEnumerationValue value);

	/**
	 * Returns the value of the '<em><b>Domain Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Type</em>' reference.
	 * @see #setDomainType(DataType)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getEnumeration_DomainType()
	 * @model
	 * @generated
	 */
	DataType getDomainType();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.Enumeration#getDomainType <em>Domain Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Type</em>' reference.
	 * @see #getDomainType()
	 * @generated
	 */
	void setDomainType(DataType value);

} // Enumeration
