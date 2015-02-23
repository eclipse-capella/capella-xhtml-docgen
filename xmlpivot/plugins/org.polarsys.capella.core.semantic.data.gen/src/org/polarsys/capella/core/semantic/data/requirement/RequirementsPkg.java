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

package org.polarsys.capella.core.semantic.data.requirement;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacore.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.requirement.RequirementsPkg#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.requirement.RequirementsPkg#getLevel <em>Level</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.requirement.RequirementsPkg#getOwnedRequirements <em>Owned Requirements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.requirement.RequirementsPkg#getOwnedRequirementPkgs <em>Owned Requirement Pkgs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirementsPkg()
 * @model
 * @generated
 */
public interface RequirementsPkg extends Structure {
	/**
	 * Returns the value of the '<em><b>Additional Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Information</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Information</em>' attribute.
	 * @see #setAdditionalInformation(String)
	 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirementsPkg_AdditionalInformation()
	 * @model
	 * @generated
	 */
	String getAdditionalInformation();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.requirement.RequirementsPkg#getAdditionalInformation <em>Additional Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Information</em>' attribute.
	 * @see #getAdditionalInformation()
	 * @generated
	 */
	void setAdditionalInformation(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirementsPkg_Level()
	 * @model
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.requirement.RequirementsPkg#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

	/**
	 * Returns the value of the '<em><b>Owned Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.requirement.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Requirements</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirementsPkg_OwnedRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getOwnedRequirements();

	/**
	 * Returns the value of the '<em><b>Owned Requirement Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.requirement.RequirementsPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Requirement Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Requirement Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirementsPkg_OwnedRequirementPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementsPkg> getOwnedRequirementPkgs();

} // RequirementsPkg
