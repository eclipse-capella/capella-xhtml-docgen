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

package org.polarsys.capella.core.semantic.data.la;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.cs.SystemComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalComponent#getOwnedLogicalComponents <em>Owned Logical Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalComponent#getOwnedLogicalComponentPkgs <em>Owned Logical Component Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalComponent#getAllocatedLogicalFunctions <em>Allocated Logical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalComponent#getRealizedSystems <em>Realized Systems</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalComponent()
 * @model
 * @generated
 */
public interface LogicalComponent extends SystemComponent {
	/**
	 * Returns the value of the '<em><b>Owned Logical Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.LogicalComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Components</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalComponent_OwnedLogicalComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalComponent> getOwnedLogicalComponents();

	/**
	 * Returns the value of the '<em><b>Owned Logical Component Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.LogicalComponentPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Component Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Component Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalComponent_OwnedLogicalComponentPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalComponentPkg> getOwnedLogicalComponentPkgs();

	/**
	 * Returns the value of the '<em><b>Allocated Logical Functions</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.LogicalFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Logical Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Logical Functions</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalComponent_AllocatedLogicalFunctions()
	 * @model
	 * @generated
	 */
	EList<LogicalFunction> getAllocatedLogicalFunctions();

	/**
	 * Returns the value of the '<em><b>Realized Systems</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Systems</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Systems</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalComponent_RealizedSystems()
	 * @model
	 * @generated
	 */
	EList<org.polarsys.capella.core.semantic.data.ctx.System> getRealizedSystems();

} // LogicalComponent
