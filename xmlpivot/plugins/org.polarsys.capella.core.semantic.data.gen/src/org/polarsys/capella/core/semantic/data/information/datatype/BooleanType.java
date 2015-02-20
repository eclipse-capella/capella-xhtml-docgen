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

import org.polarsys.capella.core.semantic.data.information.datavalue.AbstractBooleanValue;
import org.polarsys.capella.core.semantic.data.information.datavalue.LiteralBooleanValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.BooleanType#getOwnedLiterals <em>Owned Literals</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.BooleanType#getOwnedDefaultValue <em>Owned Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getBooleanType()
 * @model
 * @generated
 */
public interface BooleanType extends DataType {
	/**
	 * Returns the value of the '<em><b>Owned Literals</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.datavalue.LiteralBooleanValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Literals</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getBooleanType_OwnedLiterals()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<LiteralBooleanValue> getOwnedLiterals();

	/**
	 * Returns the value of the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Default Value</em>' containment reference.
	 * @see #setOwnedDefaultValue(AbstractBooleanValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getBooleanType_OwnedDefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	AbstractBooleanValue getOwnedDefaultValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.BooleanType#getOwnedDefaultValue <em>Owned Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Default Value</em>' containment reference.
	 * @see #getOwnedDefaultValue()
	 * @generated
	 */
	void setOwnedDefaultValue(AbstractBooleanValue value);

} // BooleanType
