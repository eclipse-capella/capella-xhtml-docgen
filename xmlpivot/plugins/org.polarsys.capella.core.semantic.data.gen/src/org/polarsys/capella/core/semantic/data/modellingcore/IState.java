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

package org.polarsys.capella.core.semantic.data.modellingcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IState</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.modellingcore.IState#getReferencedStates <em>Referenced States</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.modellingcore.IState#getAvailableInStates <em>Available In States</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getIState()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IState extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Referenced States</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.modellingcore.IState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced States</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getIState_ReferencedStates()
	 * @model
	 * @generated
	 */
	EList<IState> getReferencedStates();

	/**
	 * Returns the value of the '<em><b>Available In States</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.modellingcore.IState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available In States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available In States</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getIState_AvailableInStates()
	 * @model
	 * @generated
	 */
	EList<IState> getAvailableInStates();

} // IState
