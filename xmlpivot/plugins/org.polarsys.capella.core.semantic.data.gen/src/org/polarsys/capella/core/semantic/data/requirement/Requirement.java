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

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;
import org.polarsys.capella.core.semantic.data.capellacore.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.requirement.Requirement#isIsObsolete <em>Is Obsolete</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.requirement.Requirement#getRequirementId <em>Requirement Id</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.requirement.Requirement#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.requirement.Requirement#getVerificationMethod <em>Verification Method</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.requirement.Requirement#getVerificationPhase <em>Verification Phase</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.requirement.Requirement#getImplementationVersion <em>Implementation Version</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.requirement.Requirement#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.requirement.Requirement#getRelatedCapellaElements <em>Related Capella Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirement()
 * @model abstract="true"
 * @generated
 */
public interface Requirement extends Namespace {
	/**
	 * Returns the value of the '<em><b>Is Obsolete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Obsolete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Obsolete</em>' attribute.
	 * @see #setIsObsolete(boolean)
	 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirement_IsObsolete()
	 * @model
	 * @generated
	 */
	boolean isIsObsolete();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.requirement.Requirement#isIsObsolete <em>Is Obsolete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Obsolete</em>' attribute.
	 * @see #isIsObsolete()
	 * @generated
	 */
	void setIsObsolete(boolean value);

	/**
	 * Returns the value of the '<em><b>Requirement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Id</em>' attribute.
	 * @see #setRequirementId(String)
	 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirement_RequirementId()
	 * @model
	 * @generated
	 */
	String getRequirementId();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.requirement.Requirement#getRequirementId <em>Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Id</em>' attribute.
	 * @see #getRequirementId()
	 * @generated
	 */
	void setRequirementId(String value);

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
	 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirement_AdditionalInformation()
	 * @model
	 * @generated
	 */
	String getAdditionalInformation();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.requirement.Requirement#getAdditionalInformation <em>Additional Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Information</em>' attribute.
	 * @see #getAdditionalInformation()
	 * @generated
	 */
	void setAdditionalInformation(String value);

	/**
	 * Returns the value of the '<em><b>Verification Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Method</em>' attribute.
	 * @see #setVerificationMethod(String)
	 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirement_VerificationMethod()
	 * @model
	 * @generated
	 */
	String getVerificationMethod();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.requirement.Requirement#getVerificationMethod <em>Verification Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Method</em>' attribute.
	 * @see #getVerificationMethod()
	 * @generated
	 */
	void setVerificationMethod(String value);

	/**
	 * Returns the value of the '<em><b>Verification Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Phase</em>' attribute.
	 * @see #setVerificationPhase(String)
	 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirement_VerificationPhase()
	 * @model
	 * @generated
	 */
	String getVerificationPhase();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.requirement.Requirement#getVerificationPhase <em>Verification Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Phase</em>' attribute.
	 * @see #getVerificationPhase()
	 * @generated
	 */
	void setVerificationPhase(String value);

	/**
	 * Returns the value of the '<em><b>Implementation Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Version</em>' attribute.
	 * @see #setImplementationVersion(String)
	 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirement_ImplementationVersion()
	 * @model
	 * @generated
	 */
	String getImplementationVersion();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.requirement.Requirement#getImplementationVersion <em>Implementation Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Version</em>' attribute.
	 * @see #getImplementationVersion()
	 * @generated
	 */
	void setImplementationVersion(String value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirement_Feature()
	 * @model
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.requirement.Requirement#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

	/**
	 * Returns the value of the '<em><b>Related Capella Elements</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacore.CapellaElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Capella Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Capella Elements</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirement_RelatedCapellaElements()
	 * @model
	 * @generated
	 */
	EList<CapellaElement> getRelatedCapellaElements();

} // Requirement
