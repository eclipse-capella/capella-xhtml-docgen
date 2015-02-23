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

package org.polarsys.capella.core.semantic.data.ctx;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage;

import org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage;

import org.polarsys.capella.core.semantic.data.cs.CsPackage;

import org.polarsys.capella.core.semantic.data.fa.FaPackage;

import org.polarsys.capella.core.semantic.data.interaction.InteractionPackage;

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
 * @see org.polarsys.capella.core.semantic.data.ctx.CtxFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/capella/xmlpivot sourceNsURI='http://www.polarsys.org/capella/core/ctx/0.8.0'"
 * @generated
 */
public interface CtxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ctx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/capella/core/ctx/0.8.0/semantic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.polarsys.capella.core.data.ctx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CtxPackage eINSTANCE = org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemAnalysisImpl <em>System Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.SystemAnalysisImpl
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getSystemAnalysis()
	 * @generated
	 */
	int SYSTEM_ANALYSIS = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__OWNED_EXTENSIONS = CsPackage.BLOCK_ARCHITECTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__ID = CsPackage.BLOCK_ARCHITECTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__SID = CsPackage.BLOCK_ARCHITECTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__OWNED_CONSTRAINTS = CsPackage.BLOCK_ARCHITECTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__NAME = CsPackage.BLOCK_ARCHITECTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__SUMMARY = CsPackage.BLOCK_ARCHITECTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__DESCRIPTION = CsPackage.BLOCK_ARCHITECTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__REVIEW = CsPackage.BLOCK_ARCHITECTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__OWNED_PROPERTY_VALUES = CsPackage.BLOCK_ARCHITECTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__OWNED_ENUMERATION_PROPERTY_TYPES = CsPackage.BLOCK_ARCHITECTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__APPLIED_PROPERTY_VALUES = CsPackage.BLOCK_ARCHITECTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__OWNED_PROPERTY_VALUE_GROUPS = CsPackage.BLOCK_ARCHITECTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__APPLIED_PROPERTY_VALUE_GROUPS = CsPackage.BLOCK_ARCHITECTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__STATUS = CsPackage.BLOCK_ARCHITECTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__FEATURES = CsPackage.BLOCK_ARCHITECTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__APPLIED_REQUIREMENTS = CsPackage.BLOCK_ARCHITECTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__CONTAINED_GENERIC_TRACES = CsPackage.BLOCK_ARCHITECTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__CONTAINED_REQUIREMENTS_TRACES = CsPackage.BLOCK_ARCHITECTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__OWNED_PROPERTY_VALUE_PKGS = CsPackage.BLOCK_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__OWNED_COMPONENT_EXCHANGES = CsPackage.BLOCK_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CsPackage.BLOCK_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Requirement Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__OWNED_REQUIREMENT_PKGS = CsPackage.BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__OWNED_INTERFACE_PKG = CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__OWNED_DATA_PKG = CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned System Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__OWNED_SYSTEM = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Actor Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__OWNED_ACTOR_PKG = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Mission Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__OWNED_MISSION_PKG = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contained Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contained System Function Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Allocated Operational Analyses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSES = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>System Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ANALYSIS_FEATURE_COUNT = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.SystemImpl
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_EXTENSIONS = CsPackage.COMPONENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ID = CsPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SID = CsPackage.COMPONENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_CONSTRAINTS = CsPackage.COMPONENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = CsPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUMMARY = CsPackage.COMPONENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DESCRIPTION = CsPackage.COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REVIEW = CsPackage.COMPONENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_PROPERTY_VALUES = CsPackage.COMPONENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_ENUMERATION_PROPERTY_TYPES = CsPackage.COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__APPLIED_PROPERTY_VALUES = CsPackage.COMPONENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_PROPERTY_VALUE_GROUPS = CsPackage.COMPONENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__APPLIED_PROPERTY_VALUE_GROUPS = CsPackage.COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__STATUS = CsPackage.COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__FEATURES = CsPackage.COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__APPLIED_REQUIREMENTS = CsPackage.COMPONENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTAINED_GENERIC_TRACES = CsPackage.COMPONENT__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTAINED_REQUIREMENTS_TRACES = CsPackage.COMPONENT__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_COMPONENT_EXCHANGES = CsPackage.COMPONENT__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CsPackage.COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_ABSTRACT_CAPABILITY_PKG = CsPackage.COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_INTERFACE_PKG = CsPackage.COMPONENT__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_DATA_PKG = CsPackage.COMPONENT__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_STATE_MACHINES = CsPackage.COMPONENT__OWNED_STATE_MACHINES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ABSTRACT = CsPackage.COMPONENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUPER = CsPackage.COMPONENT__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUB = CsPackage.COMPONENT__SUB;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTAINED_PROPERTIES = CsPackage.COMPONENT__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_COMMUNICATION_LINKS = CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS;

	/**
	 * The feature id for the '<em><b>Used Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__USED_INTERFACES = CsPackage.COMPONENT__USED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__IMPLEMENTED_INTERFACES = CsPackage.COMPONENT__IMPLEMENTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Allocated Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ALLOCATED_COMPONENTS = CsPackage.COMPONENT__ALLOCATED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROVIDED_INTERFACES = CsPackage.COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REQUIRED_INTERFACES = CsPackage.COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTAINED_COMPONENT_PORTS = CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTAINED_PARTS = CsPackage.COMPONENT__CONTAINED_PARTS;

	/**
	 * The feature id for the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTAINED_PHYSICAL_PORTS = CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS;

	/**
	 * The feature id for the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_PHYSICAL_PATH = CsPackage.COMPONENT__OWNED_PHYSICAL_PATH;

	/**
	 * The feature id for the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_PHYSICAL_LINKS = CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_PHYSICAL_LINK_CATEGORIES = CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Allocated System Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ALLOCATED_SYSTEM_FUNCTIONS = CsPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realized Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REALIZED_ENTITIES = CsPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = CsPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemFunctionImpl <em>System Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.SystemFunctionImpl
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getSystemFunction()
	 * @generated
	 */
	int SYSTEM_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OWNED_EXTENSIONS = FaPackage.ABSTRACT_FUNCTION__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__ID = FaPackage.ABSTRACT_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__SID = FaPackage.ABSTRACT_FUNCTION__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OWNED_CONSTRAINTS = FaPackage.ABSTRACT_FUNCTION__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__NAME = FaPackage.ABSTRACT_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__SUMMARY = FaPackage.ABSTRACT_FUNCTION__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__DESCRIPTION = FaPackage.ABSTRACT_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__REVIEW = FaPackage.ABSTRACT_FUNCTION__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OWNED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTION__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OWNED_ENUMERATION_PROPERTY_TYPES = FaPackage.ABSTRACT_FUNCTION__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__APPLIED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTION__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OWNED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTION__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__APPLIED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTION__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__STATUS = FaPackage.ABSTRACT_FUNCTION__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__FEATURES = FaPackage.ABSTRACT_FUNCTION__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__APPLIED_REQUIREMENTS = FaPackage.ABSTRACT_FUNCTION__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__CONTAINED_GENERIC_TRACES = FaPackage.ABSTRACT_FUNCTION__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__CONTAINED_REQUIREMENTS_TRACES = FaPackage.ABSTRACT_FUNCTION__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Functional Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OWNED_FUNCTIONAL_CHAINS = FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_CHAINS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__IS_ABSTRACT = FaPackage.ABSTRACT_FUNCTION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__IS_STATIC = FaPackage.ABSTRACT_FUNCTION__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__VISIBILITY = FaPackage.ABSTRACT_FUNCTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__TYPE = FaPackage.ABSTRACT_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__ORDERED = FaPackage.ABSTRACT_FUNCTION__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__UNIQUE = FaPackage.ABSTRACT_FUNCTION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__MIN_INCLUSIVE = FaPackage.ABSTRACT_FUNCTION__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__MAX_INCLUSIVE = FaPackage.ABSTRACT_FUNCTION__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OWNED_DEFAULT_VALUE = FaPackage.ABSTRACT_FUNCTION__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OWNED_MIN_VALUE = FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OWNED_MAX_VALUE = FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OWNED_NULL_VALUE = FaPackage.ABSTRACT_FUNCTION__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OWNED_MIN_CARD = FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OWNED_MIN_LENGTH = FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OWNED_MAX_CARD = FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OWNED_MAX_LENGTH = FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__AGGREGATION_KIND = FaPackage.ABSTRACT_FUNCTION__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__IS_DERIVED = FaPackage.ABSTRACT_FUNCTION__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__IS_READ_ONLY = FaPackage.ABSTRACT_FUNCTION__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__IS_PART_OF_KEY = FaPackage.ABSTRACT_FUNCTION__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OUTGOING = FaPackage.ABSTRACT_FUNCTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__INCOMING = FaPackage.ABSTRACT_FUNCTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__INPUTS = FaPackage.ABSTRACT_FUNCTION__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OUTPUTS = FaPackage.ABSTRACT_FUNCTION__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__KIND = FaPackage.ABSTRACT_FUNCTION__KIND;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__CONDITION = FaPackage.ABSTRACT_FUNCTION__CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Functional Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OWNED_FUNCTIONAL_EXCHANGES = FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Available In States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__AVAILABLE_IN_STATES = FaPackage.ABSTRACT_FUNCTION__AVAILABLE_IN_STATES;

	/**
	 * The feature id for the '<em><b>Linked State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__LINKED_STATE_MACHINE = FaPackage.ABSTRACT_FUNCTION__LINKED_STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>Owned System Function Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS = FaPackage.ABSTRACT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realized Operational Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES = FaPackage.ABSTRACT_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contained System Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__CONTAINED_SYSTEM_FUNCTIONS = FaPackage.ABSTRACT_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_FEATURE_COUNT = FaPackage.ABSTRACT_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemFunctionPkgImpl <em>System Function Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.SystemFunctionPkgImpl
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getSystemFunctionPkg()
	 * @generated
	 */
	int SYSTEM_FUNCTION_PKG = 3;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__OWNED_EXTENSIONS = FaPackage.FUNCTION_PKG__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__ID = FaPackage.FUNCTION_PKG__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__SID = FaPackage.FUNCTION_PKG__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__OWNED_CONSTRAINTS = FaPackage.FUNCTION_PKG__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__NAME = FaPackage.FUNCTION_PKG__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__SUMMARY = FaPackage.FUNCTION_PKG__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__DESCRIPTION = FaPackage.FUNCTION_PKG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__REVIEW = FaPackage.FUNCTION_PKG__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__OWNED_PROPERTY_VALUES = FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__OWNED_ENUMERATION_PROPERTY_TYPES = FaPackage.FUNCTION_PKG__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__APPLIED_PROPERTY_VALUES = FaPackage.FUNCTION_PKG__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__OWNED_PROPERTY_VALUE_GROUPS = FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__APPLIED_PROPERTY_VALUE_GROUPS = FaPackage.FUNCTION_PKG__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__STATUS = FaPackage.FUNCTION_PKG__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__FEATURES = FaPackage.FUNCTION_PKG__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__APPLIED_REQUIREMENTS = FaPackage.FUNCTION_PKG__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__CONTAINED_GENERIC_TRACES = FaPackage.FUNCTION_PKG__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES = FaPackage.FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS = FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__OWNED_CATEGORIES = FaPackage.FUNCTION_PKG__OWNED_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned System Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTIONS = FaPackage.FUNCTION_PKG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned System Function Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTION_PKGS = FaPackage.FUNCTION_PKG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Function Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_PKG_FEATURE_COUNT = FaPackage.FUNCTION_PKG_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.ActorImpl
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 4;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_EXTENSIONS = CsPackage.ABSTRACT_ACTOR__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ID = CsPackage.ABSTRACT_ACTOR__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SID = CsPackage.ABSTRACT_ACTOR__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_CONSTRAINTS = CsPackage.ABSTRACT_ACTOR__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = CsPackage.ABSTRACT_ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SUMMARY = CsPackage.ABSTRACT_ACTOR__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESCRIPTION = CsPackage.ABSTRACT_ACTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__REVIEW = CsPackage.ABSTRACT_ACTOR__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_PROPERTY_VALUES = CsPackage.ABSTRACT_ACTOR__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_ENUMERATION_PROPERTY_TYPES = CsPackage.ABSTRACT_ACTOR__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__APPLIED_PROPERTY_VALUES = CsPackage.ABSTRACT_ACTOR__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_PROPERTY_VALUE_GROUPS = CsPackage.ABSTRACT_ACTOR__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__APPLIED_PROPERTY_VALUE_GROUPS = CsPackage.ABSTRACT_ACTOR__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__STATUS = CsPackage.ABSTRACT_ACTOR__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__FEATURES = CsPackage.ABSTRACT_ACTOR__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__APPLIED_REQUIREMENTS = CsPackage.ABSTRACT_ACTOR__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTAINED_GENERIC_TRACES = CsPackage.ABSTRACT_ACTOR__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTAINED_REQUIREMENTS_TRACES = CsPackage.ABSTRACT_ACTOR__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_COMPONENT_EXCHANGES = CsPackage.ABSTRACT_ACTOR__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CsPackage.ABSTRACT_ACTOR__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_ABSTRACT_CAPABILITY_PKG = CsPackage.ABSTRACT_ACTOR__OWNED_ABSTRACT_CAPABILITY_PKG;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_INTERFACE_PKG = CsPackage.ABSTRACT_ACTOR__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_DATA_PKG = CsPackage.ABSTRACT_ACTOR__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_STATE_MACHINES = CsPackage.ABSTRACT_ACTOR__OWNED_STATE_MACHINES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ABSTRACT = CsPackage.ABSTRACT_ACTOR__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SUPER = CsPackage.ABSTRACT_ACTOR__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SUB = CsPackage.ABSTRACT_ACTOR__SUB;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTAINED_PROPERTIES = CsPackage.ABSTRACT_ACTOR__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_COMMUNICATION_LINKS = CsPackage.ABSTRACT_ACTOR__OWNED_COMMUNICATION_LINKS;

	/**
	 * The feature id for the '<em><b>Used Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__USED_INTERFACES = CsPackage.ABSTRACT_ACTOR__USED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IMPLEMENTED_INTERFACES = CsPackage.ABSTRACT_ACTOR__IMPLEMENTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Allocated Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ALLOCATED_COMPONENTS = CsPackage.ABSTRACT_ACTOR__ALLOCATED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PROVIDED_INTERFACES = CsPackage.ABSTRACT_ACTOR__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__REQUIRED_INTERFACES = CsPackage.ABSTRACT_ACTOR__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTAINED_COMPONENT_PORTS = CsPackage.ABSTRACT_ACTOR__CONTAINED_COMPONENT_PORTS;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTAINED_PARTS = CsPackage.ABSTRACT_ACTOR__CONTAINED_PARTS;

	/**
	 * The feature id for the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTAINED_PHYSICAL_PORTS = CsPackage.ABSTRACT_ACTOR__CONTAINED_PHYSICAL_PORTS;

	/**
	 * The feature id for the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_PHYSICAL_PATH = CsPackage.ABSTRACT_ACTOR__OWNED_PHYSICAL_PATH;

	/**
	 * The feature id for the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_PHYSICAL_LINKS = CsPackage.ABSTRACT_ACTOR__OWNED_PHYSICAL_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_PHYSICAL_LINK_CATEGORIES = CsPackage.ABSTRACT_ACTOR__OWNED_PHYSICAL_LINK_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Allocated System Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ALLOCATED_SYSTEM_FUNCTIONS = CsPackage.ABSTRACT_ACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realized Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__REALIZED_ENTITIES = CsPackage.ABSTRACT_ACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realized Operational Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__REALIZED_OPERATIONAL_ACTORS = CsPackage.ABSTRACT_ACTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = CsPackage.ABSTRACT_ACTOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.ActorPkgImpl <em>Actor Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.ActorPkgImpl
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getActorPkg()
	 * @generated
	 */
	int ACTOR_PKG = 5;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__OWNED_EXTENSIONS = CapellacorePackage.STRUCTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__ID = CapellacorePackage.STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__SID = CapellacorePackage.STRUCTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__OWNED_CONSTRAINTS = CapellacorePackage.STRUCTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__NAME = CapellacorePackage.STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__SUMMARY = CapellacorePackage.STRUCTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__DESCRIPTION = CapellacorePackage.STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__REVIEW = CapellacorePackage.STRUCTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__OWNED_PROPERTY_VALUES = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.STRUCTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__APPLIED_PROPERTY_VALUES = CapellacorePackage.STRUCTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.STRUCTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__STATUS = CapellacorePackage.STRUCTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__FEATURES = CapellacorePackage.STRUCTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__APPLIED_REQUIREMENTS = CapellacorePackage.STRUCTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__CONTAINED_GENERIC_TRACES = CapellacorePackage.STRUCTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__CONTAINED_REQUIREMENTS_TRACES = CapellacorePackage.STRUCTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__OWNED_PROPERTY_VALUE_PKGS = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__OWNED_ACTORS = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Actor Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG__OWNED_ACTOR_PKGS = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actor Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_PKG_FEATURE_COUNT = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.MissionImpl
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 6;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Participating Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__PARTICIPATING_ACTORS = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participating System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__PARTICIPATING_SYSTEM = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exploited Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__EXPLOITED_CAPABILITIES = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.MissionPkgImpl <em>Mission Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.MissionPkgImpl
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getMissionPkg()
	 * @generated
	 */
	int MISSION_PKG = 7;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__OWNED_EXTENSIONS = CapellacorePackage.STRUCTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__ID = CapellacorePackage.STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__SID = CapellacorePackage.STRUCTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__OWNED_CONSTRAINTS = CapellacorePackage.STRUCTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__NAME = CapellacorePackage.STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__SUMMARY = CapellacorePackage.STRUCTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__DESCRIPTION = CapellacorePackage.STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__REVIEW = CapellacorePackage.STRUCTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__OWNED_PROPERTY_VALUES = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.STRUCTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__APPLIED_PROPERTY_VALUES = CapellacorePackage.STRUCTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.STRUCTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__STATUS = CapellacorePackage.STRUCTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__FEATURES = CapellacorePackage.STRUCTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__APPLIED_REQUIREMENTS = CapellacorePackage.STRUCTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__CONTAINED_GENERIC_TRACES = CapellacorePackage.STRUCTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__CONTAINED_REQUIREMENTS_TRACES = CapellacorePackage.STRUCTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__OWNED_PROPERTY_VALUE_PKGS = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Mission Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__OWNED_MISSION_PKGS = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Missions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG__OWNED_MISSIONS = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mission Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_PKG_FEATURE_COUNT = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CapabilityImpl
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 8;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__OWNED_EXTENSIONS = InteractionPackage.ABSTRACT_CAPABILITY__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ID = InteractionPackage.ABSTRACT_CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SID = InteractionPackage.ABSTRACT_CAPABILITY__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__OWNED_CONSTRAINTS = InteractionPackage.ABSTRACT_CAPABILITY__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = InteractionPackage.ABSTRACT_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SUMMARY = InteractionPackage.ABSTRACT_CAPABILITY__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DESCRIPTION = InteractionPackage.ABSTRACT_CAPABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__REVIEW = InteractionPackage.ABSTRACT_CAPABILITY__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__OWNED_PROPERTY_VALUES = InteractionPackage.ABSTRACT_CAPABILITY__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__OWNED_ENUMERATION_PROPERTY_TYPES = InteractionPackage.ABSTRACT_CAPABILITY__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__APPLIED_PROPERTY_VALUES = InteractionPackage.ABSTRACT_CAPABILITY__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__OWNED_PROPERTY_VALUE_GROUPS = InteractionPackage.ABSTRACT_CAPABILITY__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__APPLIED_PROPERTY_VALUE_GROUPS = InteractionPackage.ABSTRACT_CAPABILITY__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__STATUS = InteractionPackage.ABSTRACT_CAPABILITY__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__FEATURES = InteractionPackage.ABSTRACT_CAPABILITY__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__APPLIED_REQUIREMENTS = InteractionPackage.ABSTRACT_CAPABILITY__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CONTAINED_GENERIC_TRACES = InteractionPackage.ABSTRACT_CAPABILITY__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CONTAINED_REQUIREMENTS_TRACES = InteractionPackage.ABSTRACT_CAPABILITY__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__OWNED_PROPERTY_VALUE_PKGS = InteractionPackage.ABSTRACT_CAPABILITY__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Functional Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__OWNED_FUNCTIONAL_CHAINS = InteractionPackage.ABSTRACT_CAPABILITY__OWNED_FUNCTIONAL_CHAINS;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__PRE_CONDITION = InteractionPackage.ABSTRACT_CAPABILITY__PRE_CONDITION;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__POST_CONDITION = InteractionPackage.ABSTRACT_CAPABILITY__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__OWNED_SCENARIOS = InteractionPackage.ABSTRACT_CAPABILITY__OWNED_SCENARIOS;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SUPER = InteractionPackage.ABSTRACT_CAPABILITY__SUPER;

	/**
	 * The feature id for the '<em><b>Included Abstract Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__INCLUDED_ABSTRACT_CAPABILITIES = InteractionPackage.ABSTRACT_CAPABILITY__INCLUDED_ABSTRACT_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Extended Abstract Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__EXTENDED_ABSTRACT_CAPABILITIES = InteractionPackage.ABSTRACT_CAPABILITY__EXTENDED_ABSTRACT_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Available In States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__AVAILABLE_IN_STATES = InteractionPackage.ABSTRACT_CAPABILITY__AVAILABLE_IN_STATES;

	/**
	 * The feature id for the '<em><b>Involved Abstract Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__INVOLVED_ABSTRACT_FUNCTIONS = InteractionPackage.ABSTRACT_CAPABILITY__INVOLVED_ABSTRACT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Involved Functional Chains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__INVOLVED_FUNCTIONAL_CHAINS = InteractionPackage.ABSTRACT_CAPABILITY__INVOLVED_FUNCTIONAL_CHAINS;

	/**
	 * The feature id for the '<em><b>Participating Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__PARTICIPATING_ACTORS = InteractionPackage.ABSTRACT_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participating System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__PARTICIPATING_SYSTEM = InteractionPackage.ABSTRACT_CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realized Operational Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES = InteractionPackage.ABSTRACT_CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = InteractionPackage.ABSTRACT_CAPABILITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.CapabilityPkgImpl <em>Capability Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CapabilityPkgImpl
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getCapabilityPkg()
	 * @generated
	 */
	int CAPABILITY_PKG = 9;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__OWNED_EXTENSIONS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__ID = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__SID = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__OWNED_CONSTRAINTS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__NAME = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__SUMMARY = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__DESCRIPTION = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__REVIEW = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__OWNED_PROPERTY_VALUES = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__APPLIED_PROPERTY_VALUES = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__OWNED_PROPERTY_VALUE_GROUPS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__APPLIED_PROPERTY_VALUE_GROUPS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__STATUS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__FEATURES = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__APPLIED_REQUIREMENTS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__CONTAINED_GENERIC_TRACES = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__CONTAINED_REQUIREMENTS_TRACES = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__OWNED_PROPERTY_VALUE_PKGS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__OWNED_CAPABILITIES = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Capability Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG__OWNED_CAPABILITY_PKGS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Capability Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PKG_FEATURE_COUNT = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemContextImpl <em>System Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.SystemContextImpl
	 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getSystemContext()
	 * @generated
	 */
	int SYSTEM_CONTEXT = 10;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_EXTENSIONS = CsPackage.COMPONENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__ID = CsPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__SID = CsPackage.COMPONENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_CONSTRAINTS = CsPackage.COMPONENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__NAME = CsPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__SUMMARY = CsPackage.COMPONENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__DESCRIPTION = CsPackage.COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__REVIEW = CsPackage.COMPONENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_PROPERTY_VALUES = CsPackage.COMPONENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_ENUMERATION_PROPERTY_TYPES = CsPackage.COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__APPLIED_PROPERTY_VALUES = CsPackage.COMPONENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_PROPERTY_VALUE_GROUPS = CsPackage.COMPONENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__APPLIED_PROPERTY_VALUE_GROUPS = CsPackage.COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__STATUS = CsPackage.COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__FEATURES = CsPackage.COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__APPLIED_REQUIREMENTS = CsPackage.COMPONENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__CONTAINED_GENERIC_TRACES = CsPackage.COMPONENT__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__CONTAINED_REQUIREMENTS_TRACES = CsPackage.COMPONENT__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_COMPONENT_EXCHANGES = CsPackage.COMPONENT__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CsPackage.COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_ABSTRACT_CAPABILITY_PKG = CsPackage.COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_INTERFACE_PKG = CsPackage.COMPONENT__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_DATA_PKG = CsPackage.COMPONENT__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_STATE_MACHINES = CsPackage.COMPONENT__OWNED_STATE_MACHINES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__ABSTRACT = CsPackage.COMPONENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__SUPER = CsPackage.COMPONENT__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__SUB = CsPackage.COMPONENT__SUB;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__CONTAINED_PROPERTIES = CsPackage.COMPONENT__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_COMMUNICATION_LINKS = CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS;

	/**
	 * The feature id for the '<em><b>Used Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__USED_INTERFACES = CsPackage.COMPONENT__USED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__IMPLEMENTED_INTERFACES = CsPackage.COMPONENT__IMPLEMENTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Allocated Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__ALLOCATED_COMPONENTS = CsPackage.COMPONENT__ALLOCATED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__PROVIDED_INTERFACES = CsPackage.COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__REQUIRED_INTERFACES = CsPackage.COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__CONTAINED_COMPONENT_PORTS = CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__CONTAINED_PARTS = CsPackage.COMPONENT__CONTAINED_PARTS;

	/**
	 * The feature id for the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__CONTAINED_PHYSICAL_PORTS = CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS;

	/**
	 * The feature id for the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_PHYSICAL_PATH = CsPackage.COMPONENT__OWNED_PHYSICAL_PATH;

	/**
	 * The feature id for the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_PHYSICAL_LINKS = CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_PHYSICAL_LINK_CATEGORIES = CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES;

	/**
	 * The number of structural features of the '<em>System Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_FEATURE_COUNT = CsPackage.COMPONENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis <em>System Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Analysis</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis
	 * @generated
	 */
	EClass getSystemAnalysis();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getOwnedSystemContext <em>Owned System Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned System Context</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getOwnedSystemContext()
	 * @see #getSystemAnalysis()
	 * @generated
	 */
	EReference getSystemAnalysis_OwnedSystemContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getOwnedSystem <em>Owned System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned System</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getOwnedSystem()
	 * @see #getSystemAnalysis()
	 * @generated
	 */
	EReference getSystemAnalysis_OwnedSystem();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getOwnedActorPkg <em>Owned Actor Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Actor Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getOwnedActorPkg()
	 * @see #getSystemAnalysis()
	 * @generated
	 */
	EReference getSystemAnalysis_OwnedActorPkg();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getOwnedMissionPkg <em>Owned Mission Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Mission Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getOwnedMissionPkg()
	 * @see #getSystemAnalysis()
	 * @generated
	 */
	EReference getSystemAnalysis_OwnedMissionPkg();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getContainedCapabilityPkg <em>Contained Capability Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Capability Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getContainedCapabilityPkg()
	 * @see #getSystemAnalysis()
	 * @generated
	 */
	EReference getSystemAnalysis_ContainedCapabilityPkg();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getContainedSystemFunctionPkg <em>Contained System Function Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained System Function Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getContainedSystemFunctionPkg()
	 * @see #getSystemAnalysis()
	 * @generated
	 */
	EReference getSystemAnalysis_ContainedSystemFunctionPkg();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getAllocatedOperationalAnalyses <em>Allocated Operational Analyses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Operational Analyses</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getAllocatedOperationalAnalyses()
	 * @see #getSystemAnalysis()
	 * @generated
	 */
	EReference getSystemAnalysis_AllocatedOperationalAnalyses();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.ctx.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.ctx.System#getAllocatedSystemFunctions <em>Allocated System Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated System Functions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.System#getAllocatedSystemFunctions()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_AllocatedSystemFunctions();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.ctx.System#getRealizedEntities <em>Realized Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Entities</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.System#getRealizedEntities()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_RealizedEntities();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.ctx.SystemFunction <em>System Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Function</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.SystemFunction
	 * @generated
	 */
	EClass getSystemFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.ctx.SystemFunction#getOwnedSystemFunctionPkgs <em>Owned System Function Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned System Function Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.SystemFunction#getOwnedSystemFunctionPkgs()
	 * @see #getSystemFunction()
	 * @generated
	 */
	EReference getSystemFunction_OwnedSystemFunctionPkgs();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.ctx.SystemFunction#getRealizedOperationalActivities <em>Realized Operational Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Operational Activities</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.SystemFunction#getRealizedOperationalActivities()
	 * @see #getSystemFunction()
	 * @generated
	 */
	EReference getSystemFunction_RealizedOperationalActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.ctx.SystemFunction#getContainedSystemFunctions <em>Contained System Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained System Functions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.SystemFunction#getContainedSystemFunctions()
	 * @see #getSystemFunction()
	 * @generated
	 */
	EReference getSystemFunction_ContainedSystemFunctions();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.ctx.SystemFunctionPkg <em>System Function Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Function Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.SystemFunctionPkg
	 * @generated
	 */
	EClass getSystemFunctionPkg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.ctx.SystemFunctionPkg#getOwnedSystemFunctions <em>Owned System Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned System Functions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.SystemFunctionPkg#getOwnedSystemFunctions()
	 * @see #getSystemFunctionPkg()
	 * @generated
	 */
	EReference getSystemFunctionPkg_OwnedSystemFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.ctx.SystemFunctionPkg#getOwnedSystemFunctionPkgs <em>Owned System Function Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned System Function Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.SystemFunctionPkg#getOwnedSystemFunctionPkgs()
	 * @see #getSystemFunctionPkg()
	 * @generated
	 */
	EReference getSystemFunctionPkg_OwnedSystemFunctionPkgs();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.ctx.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.ctx.Actor#getAllocatedSystemFunctions <em>Allocated System Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated System Functions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.Actor#getAllocatedSystemFunctions()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_AllocatedSystemFunctions();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.ctx.Actor#getRealizedEntities <em>Realized Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Entities</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.Actor#getRealizedEntities()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_RealizedEntities();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.ctx.Actor#getRealizedOperationalActors <em>Realized Operational Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Operational Actors</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.Actor#getRealizedOperationalActors()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_RealizedOperationalActors();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.ctx.ActorPkg <em>Actor Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.ActorPkg
	 * @generated
	 */
	EClass getActorPkg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.ctx.ActorPkg#getOwnedActors <em>Owned Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Actors</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.ActorPkg#getOwnedActors()
	 * @see #getActorPkg()
	 * @generated
	 */
	EReference getActorPkg_OwnedActors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.ctx.ActorPkg#getOwnedActorPkgs <em>Owned Actor Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Actor Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.ActorPkg#getOwnedActorPkgs()
	 * @see #getActorPkg()
	 * @generated
	 */
	EReference getActorPkg_OwnedActorPkgs();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.ctx.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.Mission
	 * @generated
	 */
	EClass getMission();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.ctx.Mission#getParticipatingActors <em>Participating Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participating Actors</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.Mission#getParticipatingActors()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_ParticipatingActors();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.ctx.Mission#getParticipatingSystem <em>Participating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Participating System</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.Mission#getParticipatingSystem()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_ParticipatingSystem();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.ctx.Mission#getExploitedCapabilities <em>Exploited Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exploited Capabilities</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.Mission#getExploitedCapabilities()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_ExploitedCapabilities();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.ctx.MissionPkg <em>Mission Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.MissionPkg
	 * @generated
	 */
	EClass getMissionPkg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.ctx.MissionPkg#getOwnedMissionPkgs <em>Owned Mission Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Mission Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.MissionPkg#getOwnedMissionPkgs()
	 * @see #getMissionPkg()
	 * @generated
	 */
	EReference getMissionPkg_OwnedMissionPkgs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.ctx.MissionPkg#getOwnedMissions <em>Owned Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Missions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.MissionPkg#getOwnedMissions()
	 * @see #getMissionPkg()
	 * @generated
	 */
	EReference getMissionPkg_OwnedMissions();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.ctx.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.ctx.Capability#getParticipatingActors <em>Participating Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participating Actors</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.Capability#getParticipatingActors()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_ParticipatingActors();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.ctx.Capability#getParticipatingSystem <em>Participating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Participating System</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.Capability#getParticipatingSystem()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_ParticipatingSystem();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.ctx.Capability#getRealizedOperationalCapabilities <em>Realized Operational Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Operational Capabilities</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.Capability#getRealizedOperationalCapabilities()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_RealizedOperationalCapabilities();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.ctx.CapabilityPkg <em>Capability Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CapabilityPkg
	 * @generated
	 */
	EClass getCapabilityPkg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.ctx.CapabilityPkg#getOwnedCapabilities <em>Owned Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Capabilities</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CapabilityPkg#getOwnedCapabilities()
	 * @see #getCapabilityPkg()
	 * @generated
	 */
	EReference getCapabilityPkg_OwnedCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.ctx.CapabilityPkg#getOwnedCapabilityPkgs <em>Owned Capability Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Capability Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CapabilityPkg#getOwnedCapabilityPkgs()
	 * @see #getCapabilityPkg()
	 * @generated
	 */
	EReference getCapabilityPkg_OwnedCapabilityPkgs();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.ctx.SystemContext <em>System Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Context</em>'.
	 * @see org.polarsys.capella.core.semantic.data.ctx.SystemContext
	 * @generated
	 */
	EClass getSystemContext();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CtxFactory getCtxFactory();

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
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemAnalysisImpl <em>System Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.SystemAnalysisImpl
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getSystemAnalysis()
		 * @generated
		 */
		EClass SYSTEM_ANALYSIS = eINSTANCE.getSystemAnalysis();

		/**
		 * The meta object literal for the '<em><b>Owned System Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT = eINSTANCE.getSystemAnalysis_OwnedSystemContext();

		/**
		 * The meta object literal for the '<em><b>Owned System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ANALYSIS__OWNED_SYSTEM = eINSTANCE.getSystemAnalysis_OwnedSystem();

		/**
		 * The meta object literal for the '<em><b>Owned Actor Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ANALYSIS__OWNED_ACTOR_PKG = eINSTANCE.getSystemAnalysis_OwnedActorPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Mission Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ANALYSIS__OWNED_MISSION_PKG = eINSTANCE.getSystemAnalysis_OwnedMissionPkg();

		/**
		 * The meta object literal for the '<em><b>Contained Capability Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG = eINSTANCE.getSystemAnalysis_ContainedCapabilityPkg();

		/**
		 * The meta object literal for the '<em><b>Contained System Function Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG = eINSTANCE.getSystemAnalysis_ContainedSystemFunctionPkg();

		/**
		 * The meta object literal for the '<em><b>Allocated Operational Analyses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSES = eINSTANCE.getSystemAnalysis_AllocatedOperationalAnalyses();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.SystemImpl
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Allocated System Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ALLOCATED_SYSTEM_FUNCTIONS = eINSTANCE.getSystem_AllocatedSystemFunctions();

		/**
		 * The meta object literal for the '<em><b>Realized Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__REALIZED_ENTITIES = eINSTANCE.getSystem_RealizedEntities();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemFunctionImpl <em>System Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.SystemFunctionImpl
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getSystemFunction()
		 * @generated
		 */
		EClass SYSTEM_FUNCTION = eINSTANCE.getSystemFunction();

		/**
		 * The meta object literal for the '<em><b>Owned System Function Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS = eINSTANCE.getSystemFunction_OwnedSystemFunctionPkgs();

		/**
		 * The meta object literal for the '<em><b>Realized Operational Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES = eINSTANCE.getSystemFunction_RealizedOperationalActivities();

		/**
		 * The meta object literal for the '<em><b>Contained System Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_FUNCTION__CONTAINED_SYSTEM_FUNCTIONS = eINSTANCE.getSystemFunction_ContainedSystemFunctions();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemFunctionPkgImpl <em>System Function Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.SystemFunctionPkgImpl
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getSystemFunctionPkg()
		 * @generated
		 */
		EClass SYSTEM_FUNCTION_PKG = eINSTANCE.getSystemFunctionPkg();

		/**
		 * The meta object literal for the '<em><b>Owned System Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTIONS = eINSTANCE.getSystemFunctionPkg_OwnedSystemFunctions();

		/**
		 * The meta object literal for the '<em><b>Owned System Function Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTION_PKGS = eINSTANCE.getSystemFunctionPkg_OwnedSystemFunctionPkgs();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.ActorImpl
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Allocated System Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ALLOCATED_SYSTEM_FUNCTIONS = eINSTANCE.getActor_AllocatedSystemFunctions();

		/**
		 * The meta object literal for the '<em><b>Realized Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__REALIZED_ENTITIES = eINSTANCE.getActor_RealizedEntities();

		/**
		 * The meta object literal for the '<em><b>Realized Operational Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__REALIZED_OPERATIONAL_ACTORS = eINSTANCE.getActor_RealizedOperationalActors();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.ActorPkgImpl <em>Actor Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.ActorPkgImpl
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getActorPkg()
		 * @generated
		 */
		EClass ACTOR_PKG = eINSTANCE.getActorPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_PKG__OWNED_ACTORS = eINSTANCE.getActorPkg_OwnedActors();

		/**
		 * The meta object literal for the '<em><b>Owned Actor Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_PKG__OWNED_ACTOR_PKGS = eINSTANCE.getActorPkg_OwnedActorPkgs();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.MissionImpl <em>Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.MissionImpl
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getMission()
		 * @generated
		 */
		EClass MISSION = eINSTANCE.getMission();

		/**
		 * The meta object literal for the '<em><b>Participating Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__PARTICIPATING_ACTORS = eINSTANCE.getMission_ParticipatingActors();

		/**
		 * The meta object literal for the '<em><b>Participating System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__PARTICIPATING_SYSTEM = eINSTANCE.getMission_ParticipatingSystem();

		/**
		 * The meta object literal for the '<em><b>Exploited Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__EXPLOITED_CAPABILITIES = eINSTANCE.getMission_ExploitedCapabilities();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.MissionPkgImpl <em>Mission Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.MissionPkgImpl
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getMissionPkg()
		 * @generated
		 */
		EClass MISSION_PKG = eINSTANCE.getMissionPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Mission Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION_PKG__OWNED_MISSION_PKGS = eINSTANCE.getMissionPkg_OwnedMissionPkgs();

		/**
		 * The meta object literal for the '<em><b>Owned Missions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION_PKG__OWNED_MISSIONS = eINSTANCE.getMissionPkg_OwnedMissions();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CapabilityImpl
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Participating Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__PARTICIPATING_ACTORS = eINSTANCE.getCapability_ParticipatingActors();

		/**
		 * The meta object literal for the '<em><b>Participating System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__PARTICIPATING_SYSTEM = eINSTANCE.getCapability_ParticipatingSystem();

		/**
		 * The meta object literal for the '<em><b>Realized Operational Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES = eINSTANCE.getCapability_RealizedOperationalCapabilities();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.CapabilityPkgImpl <em>Capability Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CapabilityPkgImpl
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getCapabilityPkg()
		 * @generated
		 */
		EClass CAPABILITY_PKG = eINSTANCE.getCapabilityPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_PKG__OWNED_CAPABILITIES = eINSTANCE.getCapabilityPkg_OwnedCapabilities();

		/**
		 * The meta object literal for the '<em><b>Owned Capability Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_PKG__OWNED_CAPABILITY_PKGS = eINSTANCE.getCapabilityPkg_OwnedCapabilityPkgs();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemContextImpl <em>System Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.SystemContextImpl
		 * @see org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl#getSystemContext()
		 * @generated
		 */
		EClass SYSTEM_CONTEXT = eINSTANCE.getSystemContext();

	}

} //CtxPackage
