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

package org.polarsys.capella.core.semantic.data.information;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.information.datavalue.DataValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.CollectionValue#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.CollectionValue#getOwnedDefaultElement <em>Owned Default Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getCollectionValue()
 * @model
 * @generated
 */
public interface CollectionValue extends AbstractCollectionValue {
	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.datavalue.DataValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getCollectionValue_OwnedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataValue> getOwnedElements();

	/**
	 * Returns the value of the '<em><b>Owned Default Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Default Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Default Element</em>' containment reference.
	 * @see #setOwnedDefaultElement(DataValue)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getCollectionValue_OwnedDefaultElement()
	 * @model containment="true"
	 * @generated
	 */
	DataValue getOwnedDefaultElement();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.CollectionValue#getOwnedDefaultElement <em>Owned Default Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Default Element</em>' containment reference.
	 * @see #getOwnedDefaultElement()
	 * @generated
	 */
	void setOwnedDefaultElement(DataValue value);

} // CollectionValue
