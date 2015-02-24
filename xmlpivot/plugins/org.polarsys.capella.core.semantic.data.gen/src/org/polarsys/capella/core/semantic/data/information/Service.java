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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Service#getSynchronismKind <em>Synchronism Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Service#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getService()
 * @model
 * @generated
 */
public interface Service extends Operation {
	/**
	 * Returns the value of the '<em><b>Synchronism Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.information.SynchronismKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronism Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronism Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.SynchronismKind
	 * @see #setSynchronismKind(SynchronismKind)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getService_SynchronismKind()
	 * @model
	 * @generated
	 */
	SynchronismKind getSynchronismKind();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.Service#getSynchronismKind <em>Synchronism Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronism Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.SynchronismKind
	 * @see #getSynchronismKind()
	 * @generated
	 */
	void setSynchronismKind(SynchronismKind value);

	/**
	 * Returns the value of the '<em><b>Thrown Exceptions</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.communication.Exception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thrown Exceptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thrown Exceptions</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getService_ThrownExceptions()
	 * @model
	 * @generated
	 */
	EList<org.polarsys.capella.core.semantic.data.information.communication.Exception> getThrownExceptions();

} // Service
