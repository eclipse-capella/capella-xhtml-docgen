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
import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;

import org.polarsys.capella.core.semantic.data.fa.ComponentExchangeAllocator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPath#getOwnedPhysicalPathInvolvements <em>Owned Physical Path Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPath#getFirstPhysicalPathInvolvements <em>First Physical Path Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPath#getRealizedPhysicalPaths <em>Realized Physical Paths</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalPath()
 * @model
 * @generated
 */
public interface PhysicalPath extends NamedElement, ComponentExchangeAllocator, AbstractPathInvolvedElement, CapellaElement {
	/**
	 * Returns the value of the '<em><b>Owned Physical Path Involvements</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.PhysicalPathInvolvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Path Involvements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Path Involvements</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalPath_OwnedPhysicalPathInvolvements()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalPathInvolvement> getOwnedPhysicalPathInvolvements();

	/**
	 * Returns the value of the '<em><b>First Physical Path Involvements</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.PhysicalPathInvolvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Physical Path Involvements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Physical Path Involvements</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalPath_FirstPhysicalPathInvolvements()
	 * @model
	 * @generated
	 */
	EList<PhysicalPathInvolvement> getFirstPhysicalPathInvolvements();

	/**
	 * Returns the value of the '<em><b>Realized Physical Paths</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.PhysicalPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Physical Paths</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Physical Paths</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalPath_RealizedPhysicalPaths()
	 * @model
	 * @generated
	 */
	EList<PhysicalPath> getRealizedPhysicalPaths();

} // PhysicalPath
