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

import org.polarsys.capella.core.semantic.data.modellingcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Path Involvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPathInvolvement#getNextInvolvements <em>Next Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPathInvolvement#getInvolvedElement <em>Involved Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalPathInvolvement()
 * @model
 * @generated
 */
public interface PhysicalPathInvolvement extends CapellaElement, ModelElement {
	/**
	 * Returns the value of the '<em><b>Next Involvements</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.PhysicalPathInvolvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Involvements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Involvements</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalPathInvolvement_NextInvolvements()
	 * @model
	 * @generated
	 */
	EList<PhysicalPathInvolvement> getNextInvolvements();

	/**
	 * Returns the value of the '<em><b>Involved Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Element</em>' reference.
	 * @see #setInvolvedElement(AbstractPathInvolvedElement)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalPathInvolvement_InvolvedElement()
	 * @model
	 * @generated
	 */
	AbstractPathInvolvedElement getInvolvedElement();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPathInvolvement#getInvolvedElement <em>Involved Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Involved Element</em>' reference.
	 * @see #getInvolvedElement()
	 * @generated
	 */
	void setInvolvedElement(AbstractPathInvolvedElement value);

} // PhysicalPathInvolvement
