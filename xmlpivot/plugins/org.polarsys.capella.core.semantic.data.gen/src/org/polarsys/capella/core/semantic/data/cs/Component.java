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

import org.polarsys.capella.core.semantic.data.fa.ComponentPort;

import org.polarsys.capella.core.semantic.data.information.PartitionableElement;

import org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkExchanger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Component#getUsedInterfaces <em>Used Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Component#getImplementedInterfaces <em>Implemented Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Component#getAllocatedComponents <em>Allocated Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Component#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Component#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Component#getContainedComponentPorts <em>Contained Component Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Component#getContainedParts <em>Contained Parts</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Component#getContainedPhysicalPorts <em>Contained Physical Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Component#getOwnedPhysicalPath <em>Owned Physical Path</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Component#getOwnedPhysicalLinks <em>Owned Physical Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Component#getOwnedPhysicalLinkCategories <em>Owned Physical Link Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends Block, PartitionableElement, CommunicationLinkExchanger, CapellaElement {
	/**
	 * Returns the value of the '<em><b>Used Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Interfaces</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getComponent_UsedInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getUsedInterfaces();

	/**
	 * Returns the value of the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implemented Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented Interfaces</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getComponent_ImplementedInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getImplementedInterfaces();

	/**
	 * Returns the value of the '<em><b>Allocated Components</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Components</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getComponent_AllocatedComponents()
	 * @model
	 * @generated
	 */
	EList<Component> getAllocatedComponents();

	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getComponent_ProvidedInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getProvidedInterfaces();

	/**
	 * Returns the value of the '<em><b>Required Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interfaces</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getComponent_RequiredInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getRequiredInterfaces();

	/**
	 * Returns the value of the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.ComponentPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Component Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Component Ports</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getComponent_ContainedComponentPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentPort> getContainedComponentPorts();

	/**
	 * Returns the value of the '<em><b>Contained Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.Part}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Parts</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getComponent_ContainedParts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Part> getContainedParts();

	/**
	 * Returns the value of the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.PhysicalPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Physical Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Physical Ports</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getComponent_ContainedPhysicalPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalPort> getContainedPhysicalPorts();

	/**
	 * Returns the value of the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.PhysicalPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Path</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Path</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getComponent_OwnedPhysicalPath()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalPath> getOwnedPhysicalPath();

	/**
	 * Returns the value of the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Links</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getComponent_OwnedPhysicalLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalLink> getOwnedPhysicalLinks();

	/**
	 * Returns the value of the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.PhysicalLinkCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Link Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Link Categories</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getComponent_OwnedPhysicalLinkCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalLinkCategory> getOwnedPhysicalLinkCategories();

} // Component
