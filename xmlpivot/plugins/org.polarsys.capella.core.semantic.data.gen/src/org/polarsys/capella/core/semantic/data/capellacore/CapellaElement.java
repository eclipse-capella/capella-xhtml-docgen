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

package org.polarsys.capella.core.semantic.data.capellacore;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.modellingcore.ModelElement;
import org.polarsys.capella.core.semantic.data.modellingcore.TraceableElement;

import org.polarsys.capella.core.semantic.data.requirement.Requirement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capella Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.CapellaElement#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.CapellaElement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.CapellaElement#getReview <em>Review</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.CapellaElement#getOwnedPropertyValues <em>Owned Property Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.CapellaElement#getOwnedEnumerationPropertyTypes <em>Owned Enumeration Property Types</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.CapellaElement#getAppliedPropertyValues <em>Applied Property Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.CapellaElement#getOwnedPropertyValueGroups <em>Owned Property Value Groups</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.CapellaElement#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.CapellaElement#getStatus <em>Status</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.CapellaElement#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.CapellaElement#getAppliedRequirements <em>Applied Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getCapellaElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CapellaElement extends TraceableElement, ModelElement {
	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getCapellaElement_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.capellacore.CapellaElement#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getCapellaElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.capellacore.CapellaElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Review</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review</em>' attribute.
	 * @see #setReview(String)
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getCapellaElement_Review()
	 * @model
	 * @generated
	 */
	String getReview();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.capellacore.CapellaElement#getReview <em>Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review</em>' attribute.
	 * @see #getReview()
	 * @generated
	 */
	void setReview(String value);

	/**
	 * Returns the value of the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacore.AbstractPropertyValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Property Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Property Values</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getCapellaElement_OwnedPropertyValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractPropertyValue> getOwnedPropertyValues();

	/**
	 * Returns the value of the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacore.EnumerationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Enumeration Property Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Enumeration Property Types</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getCapellaElement_OwnedEnumerationPropertyTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationPropertyType> getOwnedEnumerationPropertyTypes();

	/**
	 * Returns the value of the '<em><b>Applied Property Values</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacore.AbstractPropertyValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Property Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Property Values</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getCapellaElement_AppliedPropertyValues()
	 * @model
	 * @generated
	 */
	EList<AbstractPropertyValue> getAppliedPropertyValues();

	/**
	 * Returns the value of the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacore.PropertyValueGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Property Value Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Property Value Groups</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getCapellaElement_OwnedPropertyValueGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyValueGroup> getOwnedPropertyValueGroups();

	/**
	 * Returns the value of the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacore.PropertyValueGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Property Value Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Property Value Groups</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getCapellaElement_AppliedPropertyValueGroups()
	 * @model
	 * @generated
	 */
	EList<PropertyValueGroup> getAppliedPropertyValueGroups();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(EnumerationPropertyLiteral)
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getCapellaElement_Status()
	 * @model
	 * @generated
	 */
	EnumerationPropertyLiteral getStatus();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.capellacore.CapellaElement#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EnumerationPropertyLiteral value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacore.EnumerationPropertyLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getCapellaElement_Features()
	 * @model
	 * @generated
	 */
	EList<EnumerationPropertyLiteral> getFeatures();

	/**
	 * Returns the value of the '<em><b>Applied Requirements</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.requirement.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Requirements</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getCapellaElement_AppliedRequirements()
	 * @model
	 * @generated
	 */
	EList<Requirement> getAppliedRequirements();

} // CapellaElement
