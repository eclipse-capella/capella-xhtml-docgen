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

package org.polarsys.capella.core.semantic.data.cs;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;
import org.polarsys.capella.core.semantic.data.capellacore.GeneralClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Interface#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Interface#getOwnedExchangeItemAllocations <em>Owned Exchange Item Allocations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Interface#getRealizedContextInterfaces <em>Realized Context Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Interface#getRealizedLogicalInterfaces <em>Realized Logical Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends GeneralClass, CapellaElement {
	/**
	 * Returns the value of the '<em><b>Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mechanism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanism</em>' attribute.
	 * @see #setMechanism(String)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getInterface_Mechanism()
	 * @model
	 * @generated
	 */
	String getMechanism();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.Interface#getMechanism <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanism</em>' attribute.
	 * @see #getMechanism()
	 * @generated
	 */
	void setMechanism(String value);

	/**
	 * Returns the value of the '<em><b>Owned Exchange Item Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Exchange Item Allocations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Exchange Item Allocations</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getInterface_OwnedExchangeItemAllocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExchangeItemAllocation> getOwnedExchangeItemAllocations();

	/**
	 * Returns the value of the '<em><b>Realized Context Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Context Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Context Interfaces</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getInterface_RealizedContextInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getRealizedContextInterfaces();

	/**
	 * Returns the value of the '<em><b>Realized Logical Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Logical Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Logical Interfaces</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getInterface_RealizedLogicalInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getRealizedLogicalInterfaces();

} // Interface
