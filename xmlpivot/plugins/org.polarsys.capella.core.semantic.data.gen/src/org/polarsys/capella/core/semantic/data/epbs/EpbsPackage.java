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

package org.polarsys.capella.core.semantic.data.epbs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage;

import org.polarsys.capella.core.semantic.data.cs.CsPackage;

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
 * @see org.polarsys.capella.core.semantic.data.epbs.EpbsFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/capella/xmlpivot sourceNsURI='http://www.polarsys.org/capella/core/epbs/0.8.0'"
 * @generated
 */
public interface EpbsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "epbs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/capella/core/epbs/0.8.0/semantic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.polarsys.capella.core.data.epbs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EpbsPackage eINSTANCE = org.polarsys.capella.core.semantic.data.epbs.impl.EpbsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.epbs.impl.EPBSArchitectureImpl <em>EPBS Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.epbs.impl.EPBSArchitectureImpl
	 * @see org.polarsys.capella.core.semantic.data.epbs.impl.EpbsPackageImpl#getEPBSArchitecture()
	 * @generated
	 */
	int EPBS_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__OWNED_EXTENSIONS = CsPackage.BLOCK_ARCHITECTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__ID = CsPackage.BLOCK_ARCHITECTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__SID = CsPackage.BLOCK_ARCHITECTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__OWNED_CONSTRAINTS = CsPackage.BLOCK_ARCHITECTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__NAME = CsPackage.BLOCK_ARCHITECTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__SUMMARY = CsPackage.BLOCK_ARCHITECTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__DESCRIPTION = CsPackage.BLOCK_ARCHITECTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__REVIEW = CsPackage.BLOCK_ARCHITECTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__OWNED_PROPERTY_VALUES = CsPackage.BLOCK_ARCHITECTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__OWNED_ENUMERATION_PROPERTY_TYPES = CsPackage.BLOCK_ARCHITECTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__APPLIED_PROPERTY_VALUES = CsPackage.BLOCK_ARCHITECTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__OWNED_PROPERTY_VALUE_GROUPS = CsPackage.BLOCK_ARCHITECTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__APPLIED_PROPERTY_VALUE_GROUPS = CsPackage.BLOCK_ARCHITECTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__STATUS = CsPackage.BLOCK_ARCHITECTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__FEATURES = CsPackage.BLOCK_ARCHITECTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__APPLIED_REQUIREMENTS = CsPackage.BLOCK_ARCHITECTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__CONTAINED_GENERIC_TRACES = CsPackage.BLOCK_ARCHITECTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__CONTAINED_REQUIREMENTS_TRACES = CsPackage.BLOCK_ARCHITECTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS = CsPackage.BLOCK_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES = CsPackage.BLOCK_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CsPackage.BLOCK_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Requirement Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__OWNED_REQUIREMENT_PKGS = CsPackage.BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__OWNED_INTERFACE_PKG = CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__OWNED_DATA_PKG = CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned EPBS Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Configuration Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Configuration Item Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contained Capability Realization Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allocated Physical Architectures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE__ALLOCATED_PHYSICAL_ARCHITECTURES = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EPBS Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_ARCHITECTURE_FEATURE_COUNT = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.epbs.impl.EPBSContextImpl <em>EPBS Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.epbs.impl.EPBSContextImpl
	 * @see org.polarsys.capella.core.semantic.data.epbs.impl.EpbsPackageImpl#getEPBSContext()
	 * @generated
	 */
	int EPBS_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__OWNED_EXTENSIONS = CsPackage.COMPONENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__ID = CsPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__SID = CsPackage.COMPONENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__OWNED_CONSTRAINTS = CsPackage.COMPONENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__NAME = CsPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__SUMMARY = CsPackage.COMPONENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__DESCRIPTION = CsPackage.COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__REVIEW = CsPackage.COMPONENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__OWNED_PROPERTY_VALUES = CsPackage.COMPONENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__OWNED_ENUMERATION_PROPERTY_TYPES = CsPackage.COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__APPLIED_PROPERTY_VALUES = CsPackage.COMPONENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__OWNED_PROPERTY_VALUE_GROUPS = CsPackage.COMPONENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__APPLIED_PROPERTY_VALUE_GROUPS = CsPackage.COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__STATUS = CsPackage.COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__FEATURES = CsPackage.COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__APPLIED_REQUIREMENTS = CsPackage.COMPONENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__CONTAINED_GENERIC_TRACES = CsPackage.COMPONENT__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__CONTAINED_REQUIREMENTS_TRACES = CsPackage.COMPONENT__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__OWNED_COMPONENT_EXCHANGES = CsPackage.COMPONENT__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CsPackage.COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__OWNED_ABSTRACT_CAPABILITY_PKG = CsPackage.COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__OWNED_INTERFACE_PKG = CsPackage.COMPONENT__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__OWNED_DATA_PKG = CsPackage.COMPONENT__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__OWNED_STATE_MACHINES = CsPackage.COMPONENT__OWNED_STATE_MACHINES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__ABSTRACT = CsPackage.COMPONENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__SUPER = CsPackage.COMPONENT__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__SUB = CsPackage.COMPONENT__SUB;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__CONTAINED_PROPERTIES = CsPackage.COMPONENT__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__OWNED_COMMUNICATION_LINKS = CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS;

	/**
	 * The feature id for the '<em><b>Used Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__USED_INTERFACES = CsPackage.COMPONENT__USED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__IMPLEMENTED_INTERFACES = CsPackage.COMPONENT__IMPLEMENTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Allocated Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__ALLOCATED_COMPONENTS = CsPackage.COMPONENT__ALLOCATED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__PROVIDED_INTERFACES = CsPackage.COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__REQUIRED_INTERFACES = CsPackage.COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__CONTAINED_COMPONENT_PORTS = CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__CONTAINED_PARTS = CsPackage.COMPONENT__CONTAINED_PARTS;

	/**
	 * The feature id for the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__CONTAINED_PHYSICAL_PORTS = CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS;

	/**
	 * The feature id for the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__OWNED_PHYSICAL_PATH = CsPackage.COMPONENT__OWNED_PHYSICAL_PATH;

	/**
	 * The feature id for the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__OWNED_PHYSICAL_LINKS = CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT__OWNED_PHYSICAL_LINK_CATEGORIES = CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES;

	/**
	 * The number of structural features of the '<em>EPBS Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPBS_CONTEXT_FEATURE_COUNT = CsPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.epbs.impl.ConfigurationItemPkgImpl <em>Configuration Item Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.epbs.impl.ConfigurationItemPkgImpl
	 * @see org.polarsys.capella.core.semantic.data.epbs.impl.EpbsPackageImpl#getConfigurationItemPkg()
	 * @generated
	 */
	int CONFIGURATION_ITEM_PKG = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__OWNED_EXTENSIONS = CapellacorePackage.STRUCTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__ID = CapellacorePackage.STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__SID = CapellacorePackage.STRUCTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__OWNED_CONSTRAINTS = CapellacorePackage.STRUCTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__NAME = CapellacorePackage.STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__SUMMARY = CapellacorePackage.STRUCTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__DESCRIPTION = CapellacorePackage.STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__REVIEW = CapellacorePackage.STRUCTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__OWNED_PROPERTY_VALUES = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.STRUCTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__APPLIED_PROPERTY_VALUES = CapellacorePackage.STRUCTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.STRUCTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__STATUS = CapellacorePackage.STRUCTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__FEATURES = CapellacorePackage.STRUCTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__APPLIED_REQUIREMENTS = CapellacorePackage.STRUCTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__CONTAINED_GENERIC_TRACES = CapellacorePackage.STRUCTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__CONTAINED_REQUIREMENTS_TRACES = CapellacorePackage.STRUCTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Configuration Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEMS = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Configuration Item Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEM_PKGS = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration Item Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_PKG_FEATURE_COUNT = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.epbs.impl.ConfigurationItemImpl <em>Configuration Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.epbs.impl.ConfigurationItemImpl
	 * @see org.polarsys.capella.core.semantic.data.epbs.impl.EpbsPackageImpl#getConfigurationItem()
	 * @generated
	 */
	int CONFIGURATION_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_EXTENSIONS = CsPackage.SYSTEM_COMPONENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__ID = CsPackage.SYSTEM_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__SID = CsPackage.SYSTEM_COMPONENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_CONSTRAINTS = CsPackage.SYSTEM_COMPONENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__NAME = CsPackage.SYSTEM_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__SUMMARY = CsPackage.SYSTEM_COMPONENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__DESCRIPTION = CsPackage.SYSTEM_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__REVIEW = CsPackage.SYSTEM_COMPONENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_PROPERTY_VALUES = CsPackage.SYSTEM_COMPONENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_ENUMERATION_PROPERTY_TYPES = CsPackage.SYSTEM_COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__APPLIED_PROPERTY_VALUES = CsPackage.SYSTEM_COMPONENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_PROPERTY_VALUE_GROUPS = CsPackage.SYSTEM_COMPONENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__APPLIED_PROPERTY_VALUE_GROUPS = CsPackage.SYSTEM_COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__STATUS = CsPackage.SYSTEM_COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__FEATURES = CsPackage.SYSTEM_COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__APPLIED_REQUIREMENTS = CsPackage.SYSTEM_COMPONENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__CONTAINED_GENERIC_TRACES = CsPackage.SYSTEM_COMPONENT__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__CONTAINED_REQUIREMENTS_TRACES = CsPackage.SYSTEM_COMPONENT__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_COMPONENT_EXCHANGES = CsPackage.SYSTEM_COMPONENT__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CsPackage.SYSTEM_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_ABSTRACT_CAPABILITY_PKG = CsPackage.SYSTEM_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_INTERFACE_PKG = CsPackage.SYSTEM_COMPONENT__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_DATA_PKG = CsPackage.SYSTEM_COMPONENT__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_STATE_MACHINES = CsPackage.SYSTEM_COMPONENT__OWNED_STATE_MACHINES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__ABSTRACT = CsPackage.SYSTEM_COMPONENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__SUPER = CsPackage.SYSTEM_COMPONENT__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__SUB = CsPackage.SYSTEM_COMPONENT__SUB;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__CONTAINED_PROPERTIES = CsPackage.SYSTEM_COMPONENT__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_COMMUNICATION_LINKS = CsPackage.SYSTEM_COMPONENT__OWNED_COMMUNICATION_LINKS;

	/**
	 * The feature id for the '<em><b>Used Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__USED_INTERFACES = CsPackage.SYSTEM_COMPONENT__USED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__IMPLEMENTED_INTERFACES = CsPackage.SYSTEM_COMPONENT__IMPLEMENTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Allocated Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__ALLOCATED_COMPONENTS = CsPackage.SYSTEM_COMPONENT__ALLOCATED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__PROVIDED_INTERFACES = CsPackage.SYSTEM_COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__REQUIRED_INTERFACES = CsPackage.SYSTEM_COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__CONTAINED_COMPONENT_PORTS = CsPackage.SYSTEM_COMPONENT__CONTAINED_COMPONENT_PORTS;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__CONTAINED_PARTS = CsPackage.SYSTEM_COMPONENT__CONTAINED_PARTS;

	/**
	 * The feature id for the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__CONTAINED_PHYSICAL_PORTS = CsPackage.SYSTEM_COMPONENT__CONTAINED_PHYSICAL_PORTS;

	/**
	 * The feature id for the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_PHYSICAL_PATH = CsPackage.SYSTEM_COMPONENT__OWNED_PHYSICAL_PATH;

	/**
	 * The feature id for the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_PHYSICAL_LINKS = CsPackage.SYSTEM_COMPONENT__OWNED_PHYSICAL_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_PHYSICAL_LINK_CATEGORIES = CsPackage.SYSTEM_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Data Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__DATA_COMPONENT = CsPackage.SYSTEM_COMPONENT__DATA_COMPONENT;

	/**
	 * The feature id for the '<em><b>Item Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__ITEM_IDENTIFIER = CsPackage.SYSTEM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__KIND = CsPackage.SYSTEM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Configuration Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEMS = CsPackage.SYSTEM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Configuration Item Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEM_PKGS = CsPackage.SYSTEM_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allocated Physical Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__ALLOCATED_PHYSICAL_ARTIFACTS = CsPackage.SYSTEM_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Configuration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_FEATURE_COUNT = CsPackage.SYSTEM_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemKind <em>Configuration Item Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemKind
	 * @see org.polarsys.capella.core.semantic.data.epbs.impl.EpbsPackageImpl#getConfigurationItemKind()
	 * @generated
	 */
	int CONFIGURATION_ITEM_KIND = 4;


	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture <em>EPBS Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPBS Architecture</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture
	 * @generated
	 */
	EClass getEPBSArchitecture();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getOwnedEPBSContext <em>Owned EPBS Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned EPBS Context</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getOwnedEPBSContext()
	 * @see #getEPBSArchitecture()
	 * @generated
	 */
	EReference getEPBSArchitecture_OwnedEPBSContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getOwnedConfigurationItem <em>Owned Configuration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Configuration Item</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getOwnedConfigurationItem()
	 * @see #getEPBSArchitecture()
	 * @generated
	 */
	EReference getEPBSArchitecture_OwnedConfigurationItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getOwnedConfigurationItemPkg <em>Owned Configuration Item Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Configuration Item Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getOwnedConfigurationItemPkg()
	 * @see #getEPBSArchitecture()
	 * @generated
	 */
	EReference getEPBSArchitecture_OwnedConfigurationItemPkg();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Capability Realization Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getContainedCapabilityRealizationPkg()
	 * @see #getEPBSArchitecture()
	 * @generated
	 */
	EReference getEPBSArchitecture_ContainedCapabilityRealizationPkg();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getAllocatedPhysicalArchitectures <em>Allocated Physical Architectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Physical Architectures</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getAllocatedPhysicalArchitectures()
	 * @see #getEPBSArchitecture()
	 * @generated
	 */
	EReference getEPBSArchitecture_AllocatedPhysicalArchitectures();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.epbs.EPBSContext <em>EPBS Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPBS Context</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.EPBSContext
	 * @generated
	 */
	EClass getEPBSContext();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemPkg <em>Configuration Item Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Item Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemPkg
	 * @generated
	 */
	EClass getConfigurationItemPkg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemPkg#getOwnedConfigurationItems <em>Owned Configuration Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Configuration Items</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemPkg#getOwnedConfigurationItems()
	 * @see #getConfigurationItemPkg()
	 * @generated
	 */
	EReference getConfigurationItemPkg_OwnedConfigurationItems();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemPkg#getOwnedConfigurationItemPkgs <em>Owned Configuration Item Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Configuration Item Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemPkg#getOwnedConfigurationItemPkgs()
	 * @see #getConfigurationItemPkg()
	 * @generated
	 */
	EReference getConfigurationItemPkg_OwnedConfigurationItemPkgs();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem <em>Configuration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Item</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem
	 * @generated
	 */
	EClass getConfigurationItem();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getItemIdentifier <em>Item Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Identifier</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getItemIdentifier()
	 * @see #getConfigurationItem()
	 * @generated
	 */
	EAttribute getConfigurationItem_ItemIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getKind()
	 * @see #getConfigurationItem()
	 * @generated
	 */
	EAttribute getConfigurationItem_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getOwnedConfigurationItems <em>Owned Configuration Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Configuration Items</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getOwnedConfigurationItems()
	 * @see #getConfigurationItem()
	 * @generated
	 */
	EReference getConfigurationItem_OwnedConfigurationItems();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getOwnedConfigurationItemPkgs <em>Owned Configuration Item Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Configuration Item Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getOwnedConfigurationItemPkgs()
	 * @see #getConfigurationItem()
	 * @generated
	 */
	EReference getConfigurationItem_OwnedConfigurationItemPkgs();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getAllocatedPhysicalArtifacts <em>Allocated Physical Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Physical Artifacts</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getAllocatedPhysicalArtifacts()
	 * @see #getConfigurationItem()
	 * @generated
	 */
	EReference getConfigurationItem_AllocatedPhysicalArtifacts();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemKind <em>Configuration Item Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Configuration Item Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemKind
	 * @generated
	 */
	EEnum getConfigurationItemKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EpbsFactory getEpbsFactory();

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
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.epbs.impl.EPBSArchitectureImpl <em>EPBS Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.epbs.impl.EPBSArchitectureImpl
		 * @see org.polarsys.capella.core.semantic.data.epbs.impl.EpbsPackageImpl#getEPBSArchitecture()
		 * @generated
		 */
		EClass EPBS_ARCHITECTURE = eINSTANCE.getEPBSArchitecture();

		/**
		 * The meta object literal for the '<em><b>Owned EPBS Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT = eINSTANCE.getEPBSArchitecture_OwnedEPBSContext();

		/**
		 * The meta object literal for the '<em><b>Owned Configuration Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM = eINSTANCE.getEPBSArchitecture_OwnedConfigurationItem();

		/**
		 * The meta object literal for the '<em><b>Owned Configuration Item Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG = eINSTANCE.getEPBSArchitecture_OwnedConfigurationItemPkg();

		/**
		 * The meta object literal for the '<em><b>Contained Capability Realization Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPBS_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG = eINSTANCE.getEPBSArchitecture_ContainedCapabilityRealizationPkg();

		/**
		 * The meta object literal for the '<em><b>Allocated Physical Architectures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPBS_ARCHITECTURE__ALLOCATED_PHYSICAL_ARCHITECTURES = eINSTANCE.getEPBSArchitecture_AllocatedPhysicalArchitectures();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.epbs.impl.EPBSContextImpl <em>EPBS Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.epbs.impl.EPBSContextImpl
		 * @see org.polarsys.capella.core.semantic.data.epbs.impl.EpbsPackageImpl#getEPBSContext()
		 * @generated
		 */
		EClass EPBS_CONTEXT = eINSTANCE.getEPBSContext();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.epbs.impl.ConfigurationItemPkgImpl <em>Configuration Item Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.epbs.impl.ConfigurationItemPkgImpl
		 * @see org.polarsys.capella.core.semantic.data.epbs.impl.EpbsPackageImpl#getConfigurationItemPkg()
		 * @generated
		 */
		EClass CONFIGURATION_ITEM_PKG = eINSTANCE.getConfigurationItemPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Configuration Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEMS = eINSTANCE.getConfigurationItemPkg_OwnedConfigurationItems();

		/**
		 * The meta object literal for the '<em><b>Owned Configuration Item Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEM_PKGS = eINSTANCE.getConfigurationItemPkg_OwnedConfigurationItemPkgs();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.epbs.impl.ConfigurationItemImpl <em>Configuration Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.epbs.impl.ConfigurationItemImpl
		 * @see org.polarsys.capella.core.semantic.data.epbs.impl.EpbsPackageImpl#getConfigurationItem()
		 * @generated
		 */
		EClass CONFIGURATION_ITEM = eINSTANCE.getConfigurationItem();

		/**
		 * The meta object literal for the '<em><b>Item Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_ITEM__ITEM_IDENTIFIER = eINSTANCE.getConfigurationItem_ItemIdentifier();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_ITEM__KIND = eINSTANCE.getConfigurationItem_Kind();

		/**
		 * The meta object literal for the '<em><b>Owned Configuration Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEMS = eINSTANCE.getConfigurationItem_OwnedConfigurationItems();

		/**
		 * The meta object literal for the '<em><b>Owned Configuration Item Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEM_PKGS = eINSTANCE.getConfigurationItem_OwnedConfigurationItemPkgs();

		/**
		 * The meta object literal for the '<em><b>Allocated Physical Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_ITEM__ALLOCATED_PHYSICAL_ARTIFACTS = eINSTANCE.getConfigurationItem_AllocatedPhysicalArtifacts();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemKind <em>Configuration Item Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemKind
		 * @see org.polarsys.capella.core.semantic.data.epbs.impl.EpbsPackageImpl#getConfigurationItemKind()
		 * @generated
		 */
		EEnum CONFIGURATION_ITEM_KIND = eINSTANCE.getConfigurationItemKind();

	}

} //EpbsPackage
