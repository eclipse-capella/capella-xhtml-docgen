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

package org.polarsys.capella.core.semantic.data.capellacommon;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;

import org.polarsys.capella.core.semantic.data.modellingcore.IState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.AbstractState#getRealizedAbstractStates <em>Realized Abstract States</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getAbstractState()
 * @model abstract="true"
 * @generated
 */
public interface AbstractState extends NamedElement, IState {
	/**
	 * Returns the value of the '<em><b>Realized Abstract States</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacommon.AbstractState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Abstract States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Abstract States</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getAbstractState_RealizedAbstractStates()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<AbstractState> getRealizedAbstractStates();

} // AbstractState
