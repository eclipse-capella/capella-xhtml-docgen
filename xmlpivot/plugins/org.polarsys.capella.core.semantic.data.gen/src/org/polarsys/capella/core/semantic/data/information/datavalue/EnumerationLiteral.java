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
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datavalue.EnumerationLiteral#getDomainValue <em>Domain Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage#getEnumerationLiteral()
 * @model
 * @generated
 */
public interface EnumerationLiteral extends AbstractEnumerationValue {
	/**
	 * Returns the value of the '<em><b>Domain Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Value</em>' containment reference.
	 * @see #setDomainValue(DataValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage#getEnumerationLiteral_DomainValue()
	 * @model containment="true"
	 * @generated
	 */
	DataValue getDomainValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datavalue.EnumerationLiteral#getDomainValue <em>Domain Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Value</em>' containment reference.
	 * @see #getDomainValue()
	 * @generated
	 */
	void setDomainValue(DataValue value);

} // EnumerationLiteral
