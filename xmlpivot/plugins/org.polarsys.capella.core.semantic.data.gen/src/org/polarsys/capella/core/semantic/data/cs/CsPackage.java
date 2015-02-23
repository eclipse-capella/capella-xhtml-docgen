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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage;

import org.polarsys.capella.core.semantic.data.fa.FaPackage;

import org.polarsys.capella.core.semantic.data.information.InformationPackage;

import org.polarsys.capella.core.semantic.data.information.communication.CommunicationPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.core.semantic.data.cs.CsFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/capella/xmlpivot sourceNsURI='http://www.polarsys.org/capella/core/cs/0.8.0'"
 * @generated
 */
public interface CsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/capella/core/cs/0.8.0/semantic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.polarsys.capella.core.data.cs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CsPackage eINSTANCE = org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.BlockArchitectureImpl <em>Block Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.BlockArchitectureImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getBlockArchitecture()
	 * @generated
	 */
	int BLOCK_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__OWNED_EXTENSIONS = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__ID = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__SID = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__OWNED_CONSTRAINTS = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__NAME = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__SUMMARY = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__DESCRIPTION = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__REVIEW = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__OWNED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__OWNED_ENUMERATION_PROPERTY_TYPES = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__APPLIED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__OWNED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__APPLIED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__STATUS = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__FEATURES = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__APPLIED_REQUIREMENTS = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__CONTAINED_GENERIC_TRACES = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__CONTAINED_REQUIREMENTS_TRACES = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Requirement Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE__OWNED_DATA_PKG = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Block Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ARCHITECTURE_FEATURE_COUNT = FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.BlockImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNED_EXTENSIONS = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ID = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SID = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNED_CONSTRAINTS = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SUMMARY = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DESCRIPTION = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__REVIEW = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNED_ENUMERATION_PROPERTY_TYPES = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__APPLIED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__APPLIED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATUS = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__FEATURES = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__APPLIED_REQUIREMENTS = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTAINED_GENERIC_TRACES = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTAINED_REQUIREMENTS_TRACES = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNED_COMPONENT_EXCHANGES = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNED_ABSTRACT_CAPABILITY_PKG = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNED_INTERFACE_PKG = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNED_DATA_PKG = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNED_STATE_MACHINES = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = FaPackage.ABSTRACT_FUNCTIONAL_BLOCK_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_EXTENSIONS = BLOCK__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SID = BLOCK__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_CONSTRAINTS = BLOCK__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUMMARY = BLOCK__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = BLOCK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REVIEW = BLOCK__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_PROPERTY_VALUES = BLOCK__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES = BLOCK__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__APPLIED_PROPERTY_VALUES = BLOCK__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_PROPERTY_VALUE_GROUPS = BLOCK__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS = BLOCK__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STATUS = BLOCK__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FEATURES = BLOCK__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__APPLIED_REQUIREMENTS = BLOCK__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTAINED_GENERIC_TRACES = BLOCK__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTAINED_REQUIREMENTS_TRACES = BLOCK__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_COMPONENT_EXCHANGES = BLOCK__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES = BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG = BLOCK__OWNED_ABSTRACT_CAPABILITY_PKG;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_INTERFACE_PKG = BLOCK__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_DATA_PKG = BLOCK__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_STATE_MACHINES = BLOCK__OWNED_STATE_MACHINES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ABSTRACT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUPER = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUB = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTAINED_PROPERTIES = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_COMMUNICATION_LINKS = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Used Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__USED_INTERFACES = BLOCK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IMPLEMENTED_INTERFACES = BLOCK_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Allocated Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ALLOCATED_COMPONENTS = BLOCK_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROVIDED_INTERFACES = BLOCK_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REQUIRED_INTERFACES = BLOCK_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTAINED_COMPONENT_PORTS = BLOCK_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTAINED_PARTS = BLOCK_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTAINED_PHYSICAL_PORTS = BLOCK_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_PHYSICAL_PATH = BLOCK_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_PHYSICAL_LINKS = BLOCK_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES = BLOCK_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.AbstractActorImpl <em>Abstract Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.AbstractActorImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getAbstractActor()
	 * @generated
	 */
	int ABSTRACT_ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__OWNED_EXTENSIONS = COMPONENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__SID = COMPONENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__OWNED_CONSTRAINTS = COMPONENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__SUMMARY = COMPONENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__REVIEW = COMPONENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__OWNED_PROPERTY_VALUES = COMPONENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__OWNED_ENUMERATION_PROPERTY_TYPES = COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__APPLIED_PROPERTY_VALUES = COMPONENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__OWNED_PROPERTY_VALUE_GROUPS = COMPONENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__APPLIED_PROPERTY_VALUE_GROUPS = COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__STATUS = COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__APPLIED_REQUIREMENTS = COMPONENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__CONTAINED_GENERIC_TRACES = COMPONENT__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__CONTAINED_REQUIREMENTS_TRACES = COMPONENT__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__OWNED_COMPONENT_EXCHANGES = COMPONENT__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__OWNED_COMPONENT_EXCHANGE_CATEGORIES = COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__OWNED_ABSTRACT_CAPABILITY_PKG = COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__OWNED_INTERFACE_PKG = COMPONENT__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__OWNED_DATA_PKG = COMPONENT__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__OWNED_STATE_MACHINES = COMPONENT__OWNED_STATE_MACHINES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__ABSTRACT = COMPONENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__SUPER = COMPONENT__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__SUB = COMPONENT__SUB;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__CONTAINED_PROPERTIES = COMPONENT__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__OWNED_COMMUNICATION_LINKS = COMPONENT__OWNED_COMMUNICATION_LINKS;

	/**
	 * The feature id for the '<em><b>Used Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__USED_INTERFACES = COMPONENT__USED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__IMPLEMENTED_INTERFACES = COMPONENT__IMPLEMENTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Allocated Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__ALLOCATED_COMPONENTS = COMPONENT__ALLOCATED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__PROVIDED_INTERFACES = COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__REQUIRED_INTERFACES = COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__CONTAINED_COMPONENT_PORTS = COMPONENT__CONTAINED_COMPONENT_PORTS;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__CONTAINED_PARTS = COMPONENT__CONTAINED_PARTS;

	/**
	 * The feature id for the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__CONTAINED_PHYSICAL_PORTS = COMPONENT__CONTAINED_PHYSICAL_PORTS;

	/**
	 * The feature id for the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__OWNED_PHYSICAL_PATH = COMPONENT__OWNED_PHYSICAL_PATH;

	/**
	 * The feature id for the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__OWNED_PHYSICAL_LINKS = COMPONENT__OWNED_PHYSICAL_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__OWNED_PHYSICAL_LINK_CATEGORIES = COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES;

	/**
	 * The number of structural features of the '<em>Abstract Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.PartImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getPart()
	 * @generated
	 */
	int PART = 4;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__OWNED_EXTENSIONS = InformationPackage.PARTITION__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ID = InformationPackage.PARTITION__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__SID = InformationPackage.PARTITION__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__OWNED_CONSTRAINTS = InformationPackage.PARTITION__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = InformationPackage.PARTITION__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__SUMMARY = InformationPackage.PARTITION__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__DESCRIPTION = InformationPackage.PARTITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__REVIEW = InformationPackage.PARTITION__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__OWNED_PROPERTY_VALUES = InformationPackage.PARTITION__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__OWNED_ENUMERATION_PROPERTY_TYPES = InformationPackage.PARTITION__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__APPLIED_PROPERTY_VALUES = InformationPackage.PARTITION__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__OWNED_PROPERTY_VALUE_GROUPS = InformationPackage.PARTITION__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__APPLIED_PROPERTY_VALUE_GROUPS = InformationPackage.PARTITION__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__STATUS = InformationPackage.PARTITION__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__FEATURES = InformationPackage.PARTITION__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__APPLIED_REQUIREMENTS = InformationPackage.PARTITION__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__IS_ABSTRACT = InformationPackage.PARTITION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__IS_STATIC = InformationPackage.PARTITION__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__VISIBILITY = InformationPackage.PARTITION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__TYPE = InformationPackage.PARTITION__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ORDERED = InformationPackage.PARTITION__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__UNIQUE = InformationPackage.PARTITION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__MIN_INCLUSIVE = InformationPackage.PARTITION__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__MAX_INCLUSIVE = InformationPackage.PARTITION__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__OWNED_DEFAULT_VALUE = InformationPackage.PARTITION__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__OWNED_MIN_VALUE = InformationPackage.PARTITION__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__OWNED_MAX_VALUE = InformationPackage.PARTITION__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__OWNED_NULL_VALUE = InformationPackage.PARTITION__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__OWNED_MIN_CARD = InformationPackage.PARTITION__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__OWNED_MIN_LENGTH = InformationPackage.PARTITION__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__OWNED_MAX_CARD = InformationPackage.PARTITION__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__OWNED_MAX_LENGTH = InformationPackage.PARTITION__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__AGGREGATION_KIND = InformationPackage.PARTITION__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__IS_DERIVED = InformationPackage.PARTITION__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__IS_READ_ONLY = InformationPackage.PARTITION__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__IS_PART_OF_KEY = InformationPackage.PARTITION__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Deployed Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__DEPLOYED_PARTS = InformationPackage.PARTITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Abstract Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__OWNED_ABSTRACT_TYPE = InformationPackage.PARTITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = InformationPackage.PARTITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.SystemComponentImpl <em>System Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.SystemComponentImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getSystemComponent()
	 * @generated
	 */
	int SYSTEM_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__OWNED_EXTENSIONS = COMPONENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__SID = COMPONENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__OWNED_CONSTRAINTS = COMPONENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__SUMMARY = COMPONENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__REVIEW = COMPONENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__OWNED_PROPERTY_VALUES = COMPONENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES = COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__APPLIED_PROPERTY_VALUES = COMPONENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__OWNED_PROPERTY_VALUE_GROUPS = COMPONENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS = COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__STATUS = COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__APPLIED_REQUIREMENTS = COMPONENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__CONTAINED_GENERIC_TRACES = COMPONENT__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__CONTAINED_REQUIREMENTS_TRACES = COMPONENT__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__OWNED_COMPONENT_EXCHANGES = COMPONENT__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES = COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG = COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__OWNED_INTERFACE_PKG = COMPONENT__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__OWNED_DATA_PKG = COMPONENT__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__OWNED_STATE_MACHINES = COMPONENT__OWNED_STATE_MACHINES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__ABSTRACT = COMPONENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__SUPER = COMPONENT__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__SUB = COMPONENT__SUB;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__CONTAINED_PROPERTIES = COMPONENT__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__OWNED_COMMUNICATION_LINKS = COMPONENT__OWNED_COMMUNICATION_LINKS;

	/**
	 * The feature id for the '<em><b>Used Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__USED_INTERFACES = COMPONENT__USED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__IMPLEMENTED_INTERFACES = COMPONENT__IMPLEMENTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Allocated Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__ALLOCATED_COMPONENTS = COMPONENT__ALLOCATED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__PROVIDED_INTERFACES = COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__REQUIRED_INTERFACES = COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__CONTAINED_COMPONENT_PORTS = COMPONENT__CONTAINED_COMPONENT_PORTS;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__CONTAINED_PARTS = COMPONENT__CONTAINED_PARTS;

	/**
	 * The feature id for the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__CONTAINED_PHYSICAL_PORTS = COMPONENT__CONTAINED_PHYSICAL_PORTS;

	/**
	 * The feature id for the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__OWNED_PHYSICAL_PATH = COMPONENT__OWNED_PHYSICAL_PATH;

	/**
	 * The feature id for the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__OWNED_PHYSICAL_LINKS = COMPONENT__OWNED_PHYSICAL_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES = COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Data Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__DATA_COMPONENT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.InterfacePkgImpl <em>Interface Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.InterfacePkgImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getInterfacePkg()
	 * @generated
	 */
	int INTERFACE_PKG = 6;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__OWNED_EXTENSIONS = CommunicationPackage.MESSAGE_REFERENCE_PKG__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__ID = CommunicationPackage.MESSAGE_REFERENCE_PKG__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__SID = CommunicationPackage.MESSAGE_REFERENCE_PKG__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__OWNED_CONSTRAINTS = CommunicationPackage.MESSAGE_REFERENCE_PKG__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__NAME = CommunicationPackage.MESSAGE_REFERENCE_PKG__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__SUMMARY = CommunicationPackage.MESSAGE_REFERENCE_PKG__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__DESCRIPTION = CommunicationPackage.MESSAGE_REFERENCE_PKG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__REVIEW = CommunicationPackage.MESSAGE_REFERENCE_PKG__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__OWNED_PROPERTY_VALUES = CommunicationPackage.MESSAGE_REFERENCE_PKG__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__OWNED_ENUMERATION_PROPERTY_TYPES = CommunicationPackage.MESSAGE_REFERENCE_PKG__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__APPLIED_PROPERTY_VALUES = CommunicationPackage.MESSAGE_REFERENCE_PKG__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__OWNED_PROPERTY_VALUE_GROUPS = CommunicationPackage.MESSAGE_REFERENCE_PKG__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__APPLIED_PROPERTY_VALUE_GROUPS = CommunicationPackage.MESSAGE_REFERENCE_PKG__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__STATUS = CommunicationPackage.MESSAGE_REFERENCE_PKG__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__FEATURES = CommunicationPackage.MESSAGE_REFERENCE_PKG__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__APPLIED_REQUIREMENTS = CommunicationPackage.MESSAGE_REFERENCE_PKG__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__CONTAINED_GENERIC_TRACES = CommunicationPackage.MESSAGE_REFERENCE_PKG__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__CONTAINED_REQUIREMENTS_TRACES = CommunicationPackage.MESSAGE_REFERENCE_PKG__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__OWNED_PROPERTY_VALUE_PKGS = CommunicationPackage.MESSAGE_REFERENCE_PKG__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Message References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__OWNED_MESSAGE_REFERENCES = CommunicationPackage.MESSAGE_REFERENCE_PKG__OWNED_MESSAGE_REFERENCES;

	/**
	 * The feature id for the '<em><b>Owned Exchange Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__OWNED_EXCHANGE_ITEMS = CommunicationPackage.MESSAGE_REFERENCE_PKG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__OWNED_INTERFACES = CommunicationPackage.MESSAGE_REFERENCE_PKG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG__OWNED_INTERFACE_PKGS = CommunicationPackage.MESSAGE_REFERENCE_PKG_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interface Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PKG_FEATURE_COUNT = CommunicationPackage.MESSAGE_REFERENCE_PKG_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.InterfaceImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OWNED_EXTENSIONS = CapellacorePackage.GENERAL_CLASS__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ID = CapellacorePackage.GENERAL_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SID = CapellacorePackage.GENERAL_CLASS__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OWNED_CONSTRAINTS = CapellacorePackage.GENERAL_CLASS__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = CapellacorePackage.GENERAL_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SUMMARY = CapellacorePackage.GENERAL_CLASS__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DESCRIPTION = CapellacorePackage.GENERAL_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__REVIEW = CapellacorePackage.GENERAL_CLASS__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OWNED_PROPERTY_VALUES = CapellacorePackage.GENERAL_CLASS__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.GENERAL_CLASS__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__APPLIED_PROPERTY_VALUES = CapellacorePackage.GENERAL_CLASS__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.GENERAL_CLASS__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.GENERAL_CLASS__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__STATUS = CapellacorePackage.GENERAL_CLASS__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__FEATURES = CapellacorePackage.GENERAL_CLASS__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__APPLIED_REQUIREMENTS = CapellacorePackage.GENERAL_CLASS__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONTAINED_GENERIC_TRACES = CapellacorePackage.GENERAL_CLASS__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONTAINED_REQUIREMENTS_TRACES = CapellacorePackage.GENERAL_CLASS__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ABSTRACT = CapellacorePackage.GENERAL_CLASS__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SUPER = CapellacorePackage.GENERAL_CLASS__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SUB = CapellacorePackage.GENERAL_CLASS__SUB;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONTAINED_PROPERTIES = CapellacorePackage.GENERAL_CLASS__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__VISIBILITY = CapellacorePackage.GENERAL_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Contained Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONTAINED_OPERATIONS = CapellacorePackage.GENERAL_CLASS__CONTAINED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Nested General Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NESTED_GENERAL_CLASSES = CapellacorePackage.GENERAL_CLASS__NESTED_GENERAL_CLASSES;

	/**
	 * The feature id for the '<em><b>Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MECHANISM = CapellacorePackage.GENERAL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Exchange Item Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS = CapellacorePackage.GENERAL_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realized Context Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__REALIZED_CONTEXT_INTERFACES = CapellacorePackage.GENERAL_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Realized Logical Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__REALIZED_LOGICAL_INTERFACES = CapellacorePackage.GENERAL_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = CapellacorePackage.GENERAL_CLASS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.ExchangeItemAllocationImpl <em>Exchange Item Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.ExchangeItemAllocationImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getExchangeItemAllocation()
	 * @generated
	 */
	int EXCHANGE_ITEM_ALLOCATION = 8;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__OWNED_EXTENSIONS = InformationPackage.ABSTRACT_EVENT_OPERATION__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__ID = InformationPackage.ABSTRACT_EVENT_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__SID = InformationPackage.ABSTRACT_EVENT_OPERATION__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__OWNED_CONSTRAINTS = InformationPackage.ABSTRACT_EVENT_OPERATION__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__NAME = InformationPackage.ABSTRACT_EVENT_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__SUMMARY = InformationPackage.ABSTRACT_EVENT_OPERATION__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__DESCRIPTION = InformationPackage.ABSTRACT_EVENT_OPERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__REVIEW = InformationPackage.ABSTRACT_EVENT_OPERATION__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__OWNED_PROPERTY_VALUES = InformationPackage.ABSTRACT_EVENT_OPERATION__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__OWNED_ENUMERATION_PROPERTY_TYPES = InformationPackage.ABSTRACT_EVENT_OPERATION__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__APPLIED_PROPERTY_VALUES = InformationPackage.ABSTRACT_EVENT_OPERATION__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__OWNED_PROPERTY_VALUE_GROUPS = InformationPackage.ABSTRACT_EVENT_OPERATION__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__APPLIED_PROPERTY_VALUE_GROUPS = InformationPackage.ABSTRACT_EVENT_OPERATION__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__STATUS = InformationPackage.ABSTRACT_EVENT_OPERATION__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__FEATURES = InformationPackage.ABSTRACT_EVENT_OPERATION__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__APPLIED_REQUIREMENTS = InformationPackage.ABSTRACT_EVENT_OPERATION__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Send Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__SEND_PROTOCOL = InformationPackage.ABSTRACT_EVENT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receive Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__RECEIVE_PROTOCOL = InformationPackage.ABSTRACT_EVENT_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allocated Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION__ALLOCATED_ITEM = InformationPackage.ABSTRACT_EVENT_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Exchange Item Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ITEM_ALLOCATION_FEATURE_COUNT = InformationPackage.ABSTRACT_EVENT_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.DeployableElementImpl <em>Deployable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.DeployableElementImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getDeployableElement()
	 * @generated
	 */
	int DEPLOYABLE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Deployable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.DeploymentTargetImpl <em>Deployment Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.DeploymentTargetImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getDeploymentTarget()
	 * @generated
	 */
	int DEPLOYMENT_TARGET = 10;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Deployment Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.AbstractDeploymentLinkImpl <em>Abstract Deployment Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.AbstractDeploymentLinkImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getAbstractDeploymentLink()
	 * @generated
	 */
	int ABSTRACT_DEPLOYMENT_LINK = 11;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__OWNED_EXTENSIONS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__ID = CapellacorePackage.CAPELLA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__SID = CapellacorePackage.CAPELLA_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__OWNED_CONSTRAINTS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__SUMMARY = CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__DESCRIPTION = CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__REVIEW = CapellacorePackage.CAPELLA_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__OWNED_PROPERTY_VALUES = CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__APPLIED_PROPERTY_VALUES = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__STATUS = CapellacorePackage.CAPELLA_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__FEATURES = CapellacorePackage.CAPELLA_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__APPLIED_REQUIREMENTS = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deployed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__DEPLOYED_ELEMENT = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK__LOCATION = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Deployment Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_LINK_FEATURE_COUNT = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.AbstractPathInvolvedElementImpl <em>Abstract Path Involved Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.AbstractPathInvolvedElementImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getAbstractPathInvolvedElement()
	 * @generated
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT__OWNED_EXTENSIONS = CapellacorePackage.INVOLVED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT__ID = CapellacorePackage.INVOLVED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT__SID = CapellacorePackage.INVOLVED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT__OWNED_CONSTRAINTS = CapellacorePackage.INVOLVED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT__SUMMARY = CapellacorePackage.INVOLVED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT__DESCRIPTION = CapellacorePackage.INVOLVED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT__REVIEW = CapellacorePackage.INVOLVED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT__OWNED_PROPERTY_VALUES = CapellacorePackage.INVOLVED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.INVOLVED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT__APPLIED_PROPERTY_VALUES = CapellacorePackage.INVOLVED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.INVOLVED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.INVOLVED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT__STATUS = CapellacorePackage.INVOLVED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT__FEATURES = CapellacorePackage.INVOLVED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT__APPLIED_REQUIREMENTS = CapellacorePackage.INVOLVED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Abstract Path Involved Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PATH_INVOLVED_ELEMENT_FEATURE_COUNT = CapellacorePackage.INVOLVED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.AbstractPhysicalArtifactImpl <em>Abstract Physical Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.AbstractPhysicalArtifactImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getAbstractPhysicalArtifact()
	 * @generated
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT = 13;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT__OWNED_EXTENSIONS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT__ID = CapellacorePackage.CAPELLA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT__SID = CapellacorePackage.CAPELLA_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT__OWNED_CONSTRAINTS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT__SUMMARY = CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT__DESCRIPTION = CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT__REVIEW = CapellacorePackage.CAPELLA_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT__OWNED_PROPERTY_VALUES = CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT__APPLIED_PROPERTY_VALUES = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT__STATUS = CapellacorePackage.CAPELLA_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT__FEATURES = CapellacorePackage.CAPELLA_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT__APPLIED_REQUIREMENTS = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Abstract Physical Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_ARTIFACT_FEATURE_COUNT = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.AbstractPhysicalLinkEndImpl <em>Abstract Physical Link End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.AbstractPhysicalLinkEndImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getAbstractPhysicalLinkEnd()
	 * @generated
	 */
	int ABSTRACT_PHYSICAL_LINK_END = 14;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END__OWNED_EXTENSIONS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END__ID = CapellacorePackage.CAPELLA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END__SID = CapellacorePackage.CAPELLA_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END__OWNED_CONSTRAINTS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END__SUMMARY = CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END__DESCRIPTION = CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END__REVIEW = CapellacorePackage.CAPELLA_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END__OWNED_PROPERTY_VALUES = CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END__APPLIED_PROPERTY_VALUES = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END__STATUS = CapellacorePackage.CAPELLA_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END__FEATURES = CapellacorePackage.CAPELLA_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END__APPLIED_REQUIREMENTS = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Involved Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END__INVOLVED_LINKS = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Physical Link End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_LINK_END_FEATURE_COUNT = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkImpl <em>Physical Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getPhysicalLink()
	 * @generated
	 */
	int PHYSICAL_LINK = 15;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__OWNED_EXTENSIONS = ABSTRACT_PHYSICAL_ARTIFACT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__ID = ABSTRACT_PHYSICAL_ARTIFACT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__SID = ABSTRACT_PHYSICAL_ARTIFACT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__OWNED_CONSTRAINTS = ABSTRACT_PHYSICAL_ARTIFACT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__SUMMARY = ABSTRACT_PHYSICAL_ARTIFACT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__DESCRIPTION = ABSTRACT_PHYSICAL_ARTIFACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__REVIEW = ABSTRACT_PHYSICAL_ARTIFACT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__OWNED_PROPERTY_VALUES = ABSTRACT_PHYSICAL_ARTIFACT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__OWNED_ENUMERATION_PROPERTY_TYPES = ABSTRACT_PHYSICAL_ARTIFACT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__APPLIED_PROPERTY_VALUES = ABSTRACT_PHYSICAL_ARTIFACT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__OWNED_PROPERTY_VALUE_GROUPS = ABSTRACT_PHYSICAL_ARTIFACT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__APPLIED_PROPERTY_VALUE_GROUPS = ABSTRACT_PHYSICAL_ARTIFACT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__STATUS = ABSTRACT_PHYSICAL_ARTIFACT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__FEATURES = ABSTRACT_PHYSICAL_ARTIFACT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__APPLIED_REQUIREMENTS = ABSTRACT_PHYSICAL_ARTIFACT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__NAME = ABSTRACT_PHYSICAL_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocated Component Exchanges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__ALLOCATED_COMPONENT_EXCHANGES = ABSTRACT_PHYSICAL_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link Ends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__LINK_ENDS = ABSTRACT_PHYSICAL_ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Ends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__OWNED_PHYSICAL_LINK_ENDS = ABSTRACT_PHYSICAL_ARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__CATEGORIES = ABSTRACT_PHYSICAL_ARTIFACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Physical Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__SOURCE_PHYSICAL_PORT = ABSTRACT_PHYSICAL_ARTIFACT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Physical Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__TARGET_PHYSICAL_PORT = ABSTRACT_PHYSICAL_ARTIFACT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Realized Physical Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK__REALIZED_PHYSICAL_LINKS = ABSTRACT_PHYSICAL_ARTIFACT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Physical Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_FEATURE_COUNT = ABSTRACT_PHYSICAL_ARTIFACT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkCategoryImpl <em>Physical Link Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkCategoryImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getPhysicalLinkCategory()
	 * @generated
	 */
	int PHYSICAL_LINK_CATEGORY = 16;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Physical Link Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_CATEGORY_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkEndImpl <em>Physical Link End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkEndImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getPhysicalLinkEnd()
	 * @generated
	 */
	int PHYSICAL_LINK_END = 17;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__OWNED_EXTENSIONS = ABSTRACT_PHYSICAL_LINK_END__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__ID = ABSTRACT_PHYSICAL_LINK_END__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__SID = ABSTRACT_PHYSICAL_LINK_END__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__OWNED_CONSTRAINTS = ABSTRACT_PHYSICAL_LINK_END__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__SUMMARY = ABSTRACT_PHYSICAL_LINK_END__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__DESCRIPTION = ABSTRACT_PHYSICAL_LINK_END__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__REVIEW = ABSTRACT_PHYSICAL_LINK_END__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__OWNED_PROPERTY_VALUES = ABSTRACT_PHYSICAL_LINK_END__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__OWNED_ENUMERATION_PROPERTY_TYPES = ABSTRACT_PHYSICAL_LINK_END__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__APPLIED_PROPERTY_VALUES = ABSTRACT_PHYSICAL_LINK_END__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__OWNED_PROPERTY_VALUE_GROUPS = ABSTRACT_PHYSICAL_LINK_END__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__APPLIED_PROPERTY_VALUE_GROUPS = ABSTRACT_PHYSICAL_LINK_END__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__STATUS = ABSTRACT_PHYSICAL_LINK_END__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__FEATURES = ABSTRACT_PHYSICAL_LINK_END__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__APPLIED_REQUIREMENTS = ABSTRACT_PHYSICAL_LINK_END__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Involved Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__INVOLVED_LINKS = ABSTRACT_PHYSICAL_LINK_END__INVOLVED_LINKS;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__PORT = ABSTRACT_PHYSICAL_LINK_END_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END__PART = ABSTRACT_PHYSICAL_LINK_END_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Physical Link End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LINK_END_FEATURE_COUNT = ABSTRACT_PHYSICAL_LINK_END_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathImpl <em>Physical Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getPhysicalPath()
	 * @generated
	 */
	int PHYSICAL_PATH = 18;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Allocated Component Exchanges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Physical Path Involvements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Physical Path Involvements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__FIRST_PHYSICAL_PATH_INVOLVEMENTS = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Realized Physical Paths</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH__REALIZED_PHYSICAL_PATHS = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Physical Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl <em>Physical Path Involvement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getPhysicalPathInvolvement()
	 * @generated
	 */
	int PHYSICAL_PATH_INVOLVEMENT = 19;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__OWNED_EXTENSIONS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__ID = CapellacorePackage.CAPELLA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__SID = CapellacorePackage.CAPELLA_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__OWNED_CONSTRAINTS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__SUMMARY = CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__DESCRIPTION = CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__REVIEW = CapellacorePackage.CAPELLA_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__OWNED_PROPERTY_VALUES = CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__APPLIED_PROPERTY_VALUES = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__STATUS = CapellacorePackage.CAPELLA_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__FEATURES = CapellacorePackage.CAPELLA_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__APPLIED_REQUIREMENTS = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Next Involvements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Involved Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT__INVOLVED_ELEMENT = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Physical Path Involvement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_INVOLVEMENT_FEATURE_COUNT = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathReferenceImpl <em>Physical Path Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathReferenceImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getPhysicalPathReference()
	 * @generated
	 */
	int PHYSICAL_PATH_REFERENCE = 20;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__OWNED_EXTENSIONS = PHYSICAL_PATH_INVOLVEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__ID = PHYSICAL_PATH_INVOLVEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__SID = PHYSICAL_PATH_INVOLVEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__OWNED_CONSTRAINTS = PHYSICAL_PATH_INVOLVEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__SUMMARY = PHYSICAL_PATH_INVOLVEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__DESCRIPTION = PHYSICAL_PATH_INVOLVEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__REVIEW = PHYSICAL_PATH_INVOLVEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__OWNED_PROPERTY_VALUES = PHYSICAL_PATH_INVOLVEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__OWNED_ENUMERATION_PROPERTY_TYPES = PHYSICAL_PATH_INVOLVEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__APPLIED_PROPERTY_VALUES = PHYSICAL_PATH_INVOLVEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__OWNED_PROPERTY_VALUE_GROUPS = PHYSICAL_PATH_INVOLVEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__APPLIED_PROPERTY_VALUE_GROUPS = PHYSICAL_PATH_INVOLVEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__STATUS = PHYSICAL_PATH_INVOLVEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__FEATURES = PHYSICAL_PATH_INVOLVEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__APPLIED_REQUIREMENTS = PHYSICAL_PATH_INVOLVEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Next Involvements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__NEXT_INVOLVEMENTS = PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS;

	/**
	 * The feature id for the '<em><b>Involved Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__INVOLVED_ELEMENT = PHYSICAL_PATH_INVOLVEMENT__INVOLVED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Referenced Physical Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE__REFERENCED_PHYSICAL_PATH = PHYSICAL_PATH_INVOLVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Physical Path Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PATH_REFERENCE_FEATURE_COUNT = PHYSICAL_PATH_INVOLVEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPortImpl <em>Physical Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPortImpl
	 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getPhysicalPort()
	 * @generated
	 */
	int PHYSICAL_PORT = 21;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__OWNED_EXTENSIONS = InformationPackage.PARTITION__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__ID = InformationPackage.PARTITION__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__SID = InformationPackage.PARTITION__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__OWNED_CONSTRAINTS = InformationPackage.PARTITION__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__NAME = InformationPackage.PARTITION__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__SUMMARY = InformationPackage.PARTITION__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__DESCRIPTION = InformationPackage.PARTITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__REVIEW = InformationPackage.PARTITION__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__OWNED_PROPERTY_VALUES = InformationPackage.PARTITION__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__OWNED_ENUMERATION_PROPERTY_TYPES = InformationPackage.PARTITION__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__APPLIED_PROPERTY_VALUES = InformationPackage.PARTITION__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__OWNED_PROPERTY_VALUE_GROUPS = InformationPackage.PARTITION__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__APPLIED_PROPERTY_VALUE_GROUPS = InformationPackage.PARTITION__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__STATUS = InformationPackage.PARTITION__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__FEATURES = InformationPackage.PARTITION__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__APPLIED_REQUIREMENTS = InformationPackage.PARTITION__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__IS_ABSTRACT = InformationPackage.PARTITION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__IS_STATIC = InformationPackage.PARTITION__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__VISIBILITY = InformationPackage.PARTITION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__TYPE = InformationPackage.PARTITION__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__ORDERED = InformationPackage.PARTITION__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__UNIQUE = InformationPackage.PARTITION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__MIN_INCLUSIVE = InformationPackage.PARTITION__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__MAX_INCLUSIVE = InformationPackage.PARTITION__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__OWNED_DEFAULT_VALUE = InformationPackage.PARTITION__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__OWNED_MIN_VALUE = InformationPackage.PARTITION__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__OWNED_MAX_VALUE = InformationPackage.PARTITION__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__OWNED_NULL_VALUE = InformationPackage.PARTITION__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__OWNED_MIN_CARD = InformationPackage.PARTITION__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__OWNED_MIN_LENGTH = InformationPackage.PARTITION__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__OWNED_MAX_CARD = InformationPackage.PARTITION__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__OWNED_MAX_LENGTH = InformationPackage.PARTITION__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__AGGREGATION_KIND = InformationPackage.PARTITION__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__IS_DERIVED = InformationPackage.PARTITION__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__IS_READ_ONLY = InformationPackage.PARTITION__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__IS_PART_OF_KEY = InformationPackage.PARTITION__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Owned Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__OWNED_PROTOCOLS = InformationPackage.PARTITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__PROVIDED_INTERFACES = InformationPackage.PARTITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__REQUIRED_INTERFACES = InformationPackage.PARTITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Involved Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__INVOLVED_LINKS = InformationPackage.PARTITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allocated Component Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__ALLOCATED_COMPONENT_PORTS = InformationPackage.PARTITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Realized Physical Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT__REALIZED_PHYSICAL_PORTS = InformationPackage.PARTITION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Physical Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PORT_FEATURE_COUNT = InformationPackage.PARTITION_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.BlockArchitecture <em>Block Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Architecture</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.BlockArchitecture
	 * @generated
	 */
	EClass getBlockArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.cs.BlockArchitecture#getOwnedRequirementPkgs <em>Owned Requirement Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Requirement Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.BlockArchitecture#getOwnedRequirementPkgs()
	 * @see #getBlockArchitecture()
	 * @generated
	 */
	EReference getBlockArchitecture_OwnedRequirementPkgs();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.cs.BlockArchitecture#getOwnedInterfacePkg <em>Owned Interface Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Interface Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.BlockArchitecture#getOwnedInterfacePkg()
	 * @see #getBlockArchitecture()
	 * @generated
	 */
	EReference getBlockArchitecture_OwnedInterfacePkg();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.cs.BlockArchitecture#getOwnedDataPkg <em>Owned Data Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Data Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.BlockArchitecture#getOwnedDataPkg()
	 * @see #getBlockArchitecture()
	 * @generated
	 */
	EReference getBlockArchitecture_OwnedDataPkg();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.cs.Block#getOwnedAbstractCapabilityPkg <em>Owned Abstract Capability Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Abstract Capability Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Block#getOwnedAbstractCapabilityPkg()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_OwnedAbstractCapabilityPkg();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.cs.Block#getOwnedInterfacePkg <em>Owned Interface Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Interface Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Block#getOwnedInterfacePkg()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_OwnedInterfacePkg();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.cs.Block#getOwnedDataPkg <em>Owned Data Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Data Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Block#getOwnedDataPkg()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_OwnedDataPkg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.cs.Block#getOwnedStateMachines <em>Owned State Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned State Machines</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Block#getOwnedStateMachines()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_OwnedStateMachines();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.Component#getUsedInterfaces <em>Used Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Interfaces</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Component#getUsedInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_UsedInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.Component#getImplementedInterfaces <em>Implemented Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implemented Interfaces</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Component#getImplementedInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ImplementedInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.Component#getAllocatedComponents <em>Allocated Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Components</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Component#getAllocatedComponents()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_AllocatedComponents();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.Component#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Interfaces</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Component#getProvidedInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ProvidedInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.Component#getRequiredInterfaces <em>Required Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Interfaces</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Component#getRequiredInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_RequiredInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.cs.Component#getContainedComponentPorts <em>Contained Component Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Component Ports</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Component#getContainedComponentPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ContainedComponentPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.cs.Component#getContainedParts <em>Contained Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Parts</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Component#getContainedParts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ContainedParts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.cs.Component#getContainedPhysicalPorts <em>Contained Physical Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Physical Ports</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Component#getContainedPhysicalPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ContainedPhysicalPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.cs.Component#getOwnedPhysicalPath <em>Owned Physical Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Physical Path</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Component#getOwnedPhysicalPath()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_OwnedPhysicalPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.cs.Component#getOwnedPhysicalLinks <em>Owned Physical Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Physical Links</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Component#getOwnedPhysicalLinks()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_OwnedPhysicalLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.cs.Component#getOwnedPhysicalLinkCategories <em>Owned Physical Link Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Physical Link Categories</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Component#getOwnedPhysicalLinkCategories()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_OwnedPhysicalLinkCategories();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.AbstractActor <em>Abstract Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Actor</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.AbstractActor
	 * @generated
	 */
	EClass getAbstractActor();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.Part#getDeployedParts <em>Deployed Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployed Parts</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Part#getDeployedParts()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_DeployedParts();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.cs.Part#getOwnedAbstractType <em>Owned Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Abstract Type</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Part#getOwnedAbstractType()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_OwnedAbstractType();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.SystemComponent <em>System Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Component</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.SystemComponent
	 * @generated
	 */
	EClass getSystemComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.cs.SystemComponent#isDataComponent <em>Data Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Component</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.SystemComponent#isDataComponent()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EAttribute getSystemComponent_DataComponent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.InterfacePkg <em>Interface Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.InterfacePkg
	 * @generated
	 */
	EClass getInterfacePkg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.cs.InterfacePkg#getOwnedInterfaces <em>Owned Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Interfaces</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.InterfacePkg#getOwnedInterfaces()
	 * @see #getInterfacePkg()
	 * @generated
	 */
	EReference getInterfacePkg_OwnedInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.cs.InterfacePkg#getOwnedInterfacePkgs <em>Owned Interface Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Interface Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.InterfacePkg#getOwnedInterfacePkgs()
	 * @see #getInterfacePkg()
	 * @generated
	 */
	EReference getInterfacePkg_OwnedInterfacePkgs();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.cs.Interface#getMechanism <em>Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanism</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Interface#getMechanism()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Mechanism();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.cs.Interface#getOwnedExchangeItemAllocations <em>Owned Exchange Item Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Exchange Item Allocations</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Interface#getOwnedExchangeItemAllocations()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_OwnedExchangeItemAllocations();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.Interface#getRealizedContextInterfaces <em>Realized Context Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Context Interfaces</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Interface#getRealizedContextInterfaces()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_RealizedContextInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.Interface#getRealizedLogicalInterfaces <em>Realized Logical Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Logical Interfaces</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.Interface#getRealizedLogicalInterfaces()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_RealizedLogicalInterfaces();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation <em>Exchange Item Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Item Allocation</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation
	 * @generated
	 */
	EClass getExchangeItemAllocation();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation#getSendProtocol <em>Send Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send Protocol</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation#getSendProtocol()
	 * @see #getExchangeItemAllocation()
	 * @generated
	 */
	EAttribute getExchangeItemAllocation_SendProtocol();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation#getReceiveProtocol <em>Receive Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receive Protocol</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation#getReceiveProtocol()
	 * @see #getExchangeItemAllocation()
	 * @generated
	 */
	EAttribute getExchangeItemAllocation_ReceiveProtocol();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation#getAllocatedItem <em>Allocated Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocated Item</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation#getAllocatedItem()
	 * @see #getExchangeItemAllocation()
	 * @generated
	 */
	EReference getExchangeItemAllocation_AllocatedItem();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.DeployableElement <em>Deployable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployable Element</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.DeployableElement
	 * @generated
	 */
	EClass getDeployableElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.DeploymentTarget <em>Deployment Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Target</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.DeploymentTarget
	 * @generated
	 */
	EClass getDeploymentTarget();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.AbstractDeploymentLink <em>Abstract Deployment Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Deployment Link</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.AbstractDeploymentLink
	 * @generated
	 */
	EClass getAbstractDeploymentLink();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.cs.AbstractDeploymentLink#getDeployedElement <em>Deployed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployed Element</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.AbstractDeploymentLink#getDeployedElement()
	 * @see #getAbstractDeploymentLink()
	 * @generated
	 */
	EReference getAbstractDeploymentLink_DeployedElement();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.cs.AbstractDeploymentLink#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.AbstractDeploymentLink#getLocation()
	 * @see #getAbstractDeploymentLink()
	 * @generated
	 */
	EReference getAbstractDeploymentLink_Location();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.AbstractPathInvolvedElement <em>Abstract Path Involved Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Path Involved Element</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.AbstractPathInvolvedElement
	 * @generated
	 */
	EClass getAbstractPathInvolvedElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalArtifact <em>Abstract Physical Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Physical Artifact</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalArtifact
	 * @generated
	 */
	EClass getAbstractPhysicalArtifact();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalLinkEnd <em>Abstract Physical Link End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Physical Link End</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalLinkEnd
	 * @generated
	 */
	EClass getAbstractPhysicalLinkEnd();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalLinkEnd#getInvolvedLinks <em>Involved Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved Links</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalLinkEnd#getInvolvedLinks()
	 * @see #getAbstractPhysicalLinkEnd()
	 * @generated
	 */
	EReference getAbstractPhysicalLinkEnd_InvolvedLinks();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink <em>Physical Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Link</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalLink
	 * @generated
	 */
	EClass getPhysicalLink();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getLinkEnds <em>Link Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Link Ends</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getLinkEnds()
	 * @see #getPhysicalLink()
	 * @generated
	 */
	EReference getPhysicalLink_LinkEnds();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getOwnedPhysicalLinkEnds <em>Owned Physical Link Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Physical Link Ends</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getOwnedPhysicalLinkEnds()
	 * @see #getPhysicalLink()
	 * @generated
	 */
	EReference getPhysicalLink_OwnedPhysicalLinkEnds();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categories</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getCategories()
	 * @see #getPhysicalLink()
	 * @generated
	 */
	EReference getPhysicalLink_Categories();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getSourcePhysicalPort <em>Source Physical Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Physical Port</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getSourcePhysicalPort()
	 * @see #getPhysicalLink()
	 * @generated
	 */
	EReference getPhysicalLink_SourcePhysicalPort();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getTargetPhysicalPort <em>Target Physical Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Physical Port</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getTargetPhysicalPort()
	 * @see #getPhysicalLink()
	 * @generated
	 */
	EReference getPhysicalLink_TargetPhysicalPort();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getRealizedPhysicalLinks <em>Realized Physical Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Physical Links</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getRealizedPhysicalLinks()
	 * @see #getPhysicalLink()
	 * @generated
	 */
	EReference getPhysicalLink_RealizedPhysicalLinks();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLinkCategory <em>Physical Link Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Link Category</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalLinkCategory
	 * @generated
	 */
	EClass getPhysicalLinkCategory();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLinkEnd <em>Physical Link End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Link End</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalLinkEnd
	 * @generated
	 */
	EClass getPhysicalLinkEnd();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLinkEnd#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalLinkEnd#getPort()
	 * @see #getPhysicalLinkEnd()
	 * @generated
	 */
	EReference getPhysicalLinkEnd_Port();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLinkEnd#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Part</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalLinkEnd#getPart()
	 * @see #getPhysicalLinkEnd()
	 * @generated
	 */
	EReference getPhysicalLinkEnd_Part();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPath <em>Physical Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Path</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalPath
	 * @generated
	 */
	EClass getPhysicalPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPath#getOwnedPhysicalPathInvolvements <em>Owned Physical Path Involvements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Physical Path Involvements</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalPath#getOwnedPhysicalPathInvolvements()
	 * @see #getPhysicalPath()
	 * @generated
	 */
	EReference getPhysicalPath_OwnedPhysicalPathInvolvements();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPath#getFirstPhysicalPathInvolvements <em>First Physical Path Involvements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>First Physical Path Involvements</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalPath#getFirstPhysicalPathInvolvements()
	 * @see #getPhysicalPath()
	 * @generated
	 */
	EReference getPhysicalPath_FirstPhysicalPathInvolvements();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPath#getRealizedPhysicalPaths <em>Realized Physical Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Physical Paths</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalPath#getRealizedPhysicalPaths()
	 * @see #getPhysicalPath()
	 * @generated
	 */
	EReference getPhysicalPath_RealizedPhysicalPaths();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPathInvolvement <em>Physical Path Involvement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Path Involvement</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalPathInvolvement
	 * @generated
	 */
	EClass getPhysicalPathInvolvement();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPathInvolvement#getNextInvolvements <em>Next Involvements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next Involvements</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalPathInvolvement#getNextInvolvements()
	 * @see #getPhysicalPathInvolvement()
	 * @generated
	 */
	EReference getPhysicalPathInvolvement_NextInvolvements();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPathInvolvement#getInvolvedElement <em>Involved Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Involved Element</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalPathInvolvement#getInvolvedElement()
	 * @see #getPhysicalPathInvolvement()
	 * @generated
	 */
	EReference getPhysicalPathInvolvement_InvolvedElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPathReference <em>Physical Path Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Path Reference</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalPathReference
	 * @generated
	 */
	EClass getPhysicalPathReference();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPathReference#getReferencedPhysicalPath <em>Referenced Physical Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Physical Path</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalPathReference#getReferencedPhysicalPath()
	 * @see #getPhysicalPathReference()
	 * @generated
	 */
	EReference getPhysicalPathReference_ReferencedPhysicalPath();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPort <em>Physical Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Port</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalPort
	 * @generated
	 */
	EClass getPhysicalPort();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPort#getAllocatedComponentPorts <em>Allocated Component Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Component Ports</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalPort#getAllocatedComponentPorts()
	 * @see #getPhysicalPort()
	 * @generated
	 */
	EReference getPhysicalPort_AllocatedComponentPorts();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPort#getRealizedPhysicalPorts <em>Realized Physical Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Physical Ports</em>'.
	 * @see org.polarsys.capella.core.semantic.data.cs.PhysicalPort#getRealizedPhysicalPorts()
	 * @see #getPhysicalPort()
	 * @generated
	 */
	EReference getPhysicalPort_RealizedPhysicalPorts();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CsFactory getCsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.BlockArchitectureImpl <em>Block Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.BlockArchitectureImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getBlockArchitecture()
		 * @generated
		 */
		EClass BLOCK_ARCHITECTURE = eINSTANCE.getBlockArchitecture();

		/**
		 * The meta object literal for the '<em><b>Owned Requirement Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS = eINSTANCE.getBlockArchitecture_OwnedRequirementPkgs();

		/**
		 * The meta object literal for the '<em><b>Owned Interface Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG = eINSTANCE.getBlockArchitecture_OwnedInterfacePkg();

		/**
		 * The meta object literal for the '<em><b>Owned Data Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ARCHITECTURE__OWNED_DATA_PKG = eINSTANCE.getBlockArchitecture_OwnedDataPkg();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.BlockImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__OWNED_ABSTRACT_CAPABILITY_PKG = eINSTANCE.getBlock_OwnedAbstractCapabilityPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Interface Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__OWNED_INTERFACE_PKG = eINSTANCE.getBlock_OwnedInterfacePkg();

		/**
		 * The meta object literal for the '<em><b>Owned Data Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__OWNED_DATA_PKG = eINSTANCE.getBlock_OwnedDataPkg();

		/**
		 * The meta object literal for the '<em><b>Owned State Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__OWNED_STATE_MACHINES = eINSTANCE.getBlock_OwnedStateMachines();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Used Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__USED_INTERFACES = eINSTANCE.getComponent_UsedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Implemented Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__IMPLEMENTED_INTERFACES = eINSTANCE.getComponent_ImplementedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Allocated Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ALLOCATED_COMPONENTS = eINSTANCE.getComponent_AllocatedComponents();

		/**
		 * The meta object literal for the '<em><b>Provided Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROVIDED_INTERFACES = eINSTANCE.getComponent_ProvidedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Required Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REQUIRED_INTERFACES = eINSTANCE.getComponent_RequiredInterfaces();

		/**
		 * The meta object literal for the '<em><b>Contained Component Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONTAINED_COMPONENT_PORTS = eINSTANCE.getComponent_ContainedComponentPorts();

		/**
		 * The meta object literal for the '<em><b>Contained Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONTAINED_PARTS = eINSTANCE.getComponent_ContainedParts();

		/**
		 * The meta object literal for the '<em><b>Contained Physical Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONTAINED_PHYSICAL_PORTS = eINSTANCE.getComponent_ContainedPhysicalPorts();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Path</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OWNED_PHYSICAL_PATH = eINSTANCE.getComponent_OwnedPhysicalPath();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OWNED_PHYSICAL_LINKS = eINSTANCE.getComponent_OwnedPhysicalLinks();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES = eINSTANCE.getComponent_OwnedPhysicalLinkCategories();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.AbstractActorImpl <em>Abstract Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.AbstractActorImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getAbstractActor()
		 * @generated
		 */
		EClass ABSTRACT_ACTOR = eINSTANCE.getAbstractActor();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.PartImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '<em><b>Deployed Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__DEPLOYED_PARTS = eINSTANCE.getPart_DeployedParts();

		/**
		 * The meta object literal for the '<em><b>Owned Abstract Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__OWNED_ABSTRACT_TYPE = eINSTANCE.getPart_OwnedAbstractType();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.SystemComponentImpl <em>System Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.SystemComponentImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getSystemComponent()
		 * @generated
		 */
		EClass SYSTEM_COMPONENT = eINSTANCE.getSystemComponent();

		/**
		 * The meta object literal for the '<em><b>Data Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_COMPONENT__DATA_COMPONENT = eINSTANCE.getSystemComponent_DataComponent();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.InterfacePkgImpl <em>Interface Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.InterfacePkgImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getInterfacePkg()
		 * @generated
		 */
		EClass INTERFACE_PKG = eINSTANCE.getInterfacePkg();

		/**
		 * The meta object literal for the '<em><b>Owned Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_PKG__OWNED_INTERFACES = eINSTANCE.getInterfacePkg_OwnedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Owned Interface Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_PKG__OWNED_INTERFACE_PKGS = eINSTANCE.getInterfacePkg_OwnedInterfacePkgs();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.InterfaceImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Mechanism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__MECHANISM = eINSTANCE.getInterface_Mechanism();

		/**
		 * The meta object literal for the '<em><b>Owned Exchange Item Allocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS = eINSTANCE.getInterface_OwnedExchangeItemAllocations();

		/**
		 * The meta object literal for the '<em><b>Realized Context Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__REALIZED_CONTEXT_INTERFACES = eINSTANCE.getInterface_RealizedContextInterfaces();

		/**
		 * The meta object literal for the '<em><b>Realized Logical Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__REALIZED_LOGICAL_INTERFACES = eINSTANCE.getInterface_RealizedLogicalInterfaces();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.ExchangeItemAllocationImpl <em>Exchange Item Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.ExchangeItemAllocationImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getExchangeItemAllocation()
		 * @generated
		 */
		EClass EXCHANGE_ITEM_ALLOCATION = eINSTANCE.getExchangeItemAllocation();

		/**
		 * The meta object literal for the '<em><b>Send Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_ITEM_ALLOCATION__SEND_PROTOCOL = eINSTANCE.getExchangeItemAllocation_SendProtocol();

		/**
		 * The meta object literal for the '<em><b>Receive Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_ITEM_ALLOCATION__RECEIVE_PROTOCOL = eINSTANCE.getExchangeItemAllocation_ReceiveProtocol();

		/**
		 * The meta object literal for the '<em><b>Allocated Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE_ITEM_ALLOCATION__ALLOCATED_ITEM = eINSTANCE.getExchangeItemAllocation_AllocatedItem();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.DeployableElementImpl <em>Deployable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.DeployableElementImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getDeployableElement()
		 * @generated
		 */
		EClass DEPLOYABLE_ELEMENT = eINSTANCE.getDeployableElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.DeploymentTargetImpl <em>Deployment Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.DeploymentTargetImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getDeploymentTarget()
		 * @generated
		 */
		EClass DEPLOYMENT_TARGET = eINSTANCE.getDeploymentTarget();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.AbstractDeploymentLinkImpl <em>Abstract Deployment Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.AbstractDeploymentLinkImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getAbstractDeploymentLink()
		 * @generated
		 */
		EClass ABSTRACT_DEPLOYMENT_LINK = eINSTANCE.getAbstractDeploymentLink();

		/**
		 * The meta object literal for the '<em><b>Deployed Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DEPLOYMENT_LINK__DEPLOYED_ELEMENT = eINSTANCE.getAbstractDeploymentLink_DeployedElement();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DEPLOYMENT_LINK__LOCATION = eINSTANCE.getAbstractDeploymentLink_Location();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.AbstractPathInvolvedElementImpl <em>Abstract Path Involved Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.AbstractPathInvolvedElementImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getAbstractPathInvolvedElement()
		 * @generated
		 */
		EClass ABSTRACT_PATH_INVOLVED_ELEMENT = eINSTANCE.getAbstractPathInvolvedElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.AbstractPhysicalArtifactImpl <em>Abstract Physical Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.AbstractPhysicalArtifactImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getAbstractPhysicalArtifact()
		 * @generated
		 */
		EClass ABSTRACT_PHYSICAL_ARTIFACT = eINSTANCE.getAbstractPhysicalArtifact();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.AbstractPhysicalLinkEndImpl <em>Abstract Physical Link End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.AbstractPhysicalLinkEndImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getAbstractPhysicalLinkEnd()
		 * @generated
		 */
		EClass ABSTRACT_PHYSICAL_LINK_END = eINSTANCE.getAbstractPhysicalLinkEnd();

		/**
		 * The meta object literal for the '<em><b>Involved Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PHYSICAL_LINK_END__INVOLVED_LINKS = eINSTANCE.getAbstractPhysicalLinkEnd_InvolvedLinks();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkImpl <em>Physical Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getPhysicalLink()
		 * @generated
		 */
		EClass PHYSICAL_LINK = eINSTANCE.getPhysicalLink();

		/**
		 * The meta object literal for the '<em><b>Link Ends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_LINK__LINK_ENDS = eINSTANCE.getPhysicalLink_LinkEnds();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Link Ends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_LINK__OWNED_PHYSICAL_LINK_ENDS = eINSTANCE.getPhysicalLink_OwnedPhysicalLinkEnds();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_LINK__CATEGORIES = eINSTANCE.getPhysicalLink_Categories();

		/**
		 * The meta object literal for the '<em><b>Source Physical Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_LINK__SOURCE_PHYSICAL_PORT = eINSTANCE.getPhysicalLink_SourcePhysicalPort();

		/**
		 * The meta object literal for the '<em><b>Target Physical Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_LINK__TARGET_PHYSICAL_PORT = eINSTANCE.getPhysicalLink_TargetPhysicalPort();

		/**
		 * The meta object literal for the '<em><b>Realized Physical Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_LINK__REALIZED_PHYSICAL_LINKS = eINSTANCE.getPhysicalLink_RealizedPhysicalLinks();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkCategoryImpl <em>Physical Link Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkCategoryImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getPhysicalLinkCategory()
		 * @generated
		 */
		EClass PHYSICAL_LINK_CATEGORY = eINSTANCE.getPhysicalLinkCategory();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkEndImpl <em>Physical Link End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkEndImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getPhysicalLinkEnd()
		 * @generated
		 */
		EClass PHYSICAL_LINK_END = eINSTANCE.getPhysicalLinkEnd();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_LINK_END__PORT = eINSTANCE.getPhysicalLinkEnd_Port();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_LINK_END__PART = eINSTANCE.getPhysicalLinkEnd_Part();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathImpl <em>Physical Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getPhysicalPath()
		 * @generated
		 */
		EClass PHYSICAL_PATH = eINSTANCE.getPhysicalPath();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Path Involvements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS = eINSTANCE.getPhysicalPath_OwnedPhysicalPathInvolvements();

		/**
		 * The meta object literal for the '<em><b>First Physical Path Involvements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_PATH__FIRST_PHYSICAL_PATH_INVOLVEMENTS = eINSTANCE.getPhysicalPath_FirstPhysicalPathInvolvements();

		/**
		 * The meta object literal for the '<em><b>Realized Physical Paths</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_PATH__REALIZED_PHYSICAL_PATHS = eINSTANCE.getPhysicalPath_RealizedPhysicalPaths();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl <em>Physical Path Involvement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathInvolvementImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getPhysicalPathInvolvement()
		 * @generated
		 */
		EClass PHYSICAL_PATH_INVOLVEMENT = eINSTANCE.getPhysicalPathInvolvement();

		/**
		 * The meta object literal for the '<em><b>Next Involvements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS = eINSTANCE.getPhysicalPathInvolvement_NextInvolvements();

		/**
		 * The meta object literal for the '<em><b>Involved Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_PATH_INVOLVEMENT__INVOLVED_ELEMENT = eINSTANCE.getPhysicalPathInvolvement_InvolvedElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathReferenceImpl <em>Physical Path Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathReferenceImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getPhysicalPathReference()
		 * @generated
		 */
		EClass PHYSICAL_PATH_REFERENCE = eINSTANCE.getPhysicalPathReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Physical Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_PATH_REFERENCE__REFERENCED_PHYSICAL_PATH = eINSTANCE.getPhysicalPathReference_ReferencedPhysicalPath();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPortImpl <em>Physical Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPortImpl
		 * @see org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl#getPhysicalPort()
		 * @generated
		 */
		EClass PHYSICAL_PORT = eINSTANCE.getPhysicalPort();

		/**
		 * The meta object literal for the '<em><b>Allocated Component Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_PORT__ALLOCATED_COMPONENT_PORTS = eINSTANCE.getPhysicalPort_AllocatedComponentPorts();

		/**
		 * The meta object literal for the '<em><b>Realized Physical Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_PORT__REALIZED_PHYSICAL_PORTS = eINSTANCE.getPhysicalPort_RealizedPhysicalPorts();

	}

} //CsPackage
