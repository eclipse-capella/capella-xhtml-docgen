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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage;

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
 * @see org.polarsys.capella.core.semantic.data.la.LaFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/capella/xmlpivot sourceNsURI='http://www.polarsys.org/capella/core/la/0.8.0'"
 * @generated
 */
public interface LaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "la";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/capella/core/la/0.8.0/semantic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.polarsys.capella.core.data.la";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LaPackage eINSTANCE = org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalArchitectureImpl <em>Logical Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LogicalArchitectureImpl
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getLogicalArchitecture()
	 * @generated
	 */
	int LOGICAL_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__OWNED_EXTENSIONS = CsPackage.BLOCK_ARCHITECTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__ID = CsPackage.BLOCK_ARCHITECTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__SID = CsPackage.BLOCK_ARCHITECTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__OWNED_CONSTRAINTS = CsPackage.BLOCK_ARCHITECTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__NAME = CsPackage.BLOCK_ARCHITECTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__SUMMARY = CsPackage.BLOCK_ARCHITECTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__DESCRIPTION = CsPackage.BLOCK_ARCHITECTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__REVIEW = CsPackage.BLOCK_ARCHITECTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__OWNED_PROPERTY_VALUES = CsPackage.BLOCK_ARCHITECTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__OWNED_ENUMERATION_PROPERTY_TYPES = CsPackage.BLOCK_ARCHITECTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__APPLIED_PROPERTY_VALUES = CsPackage.BLOCK_ARCHITECTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_GROUPS = CsPackage.BLOCK_ARCHITECTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__APPLIED_PROPERTY_VALUE_GROUPS = CsPackage.BLOCK_ARCHITECTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__STATUS = CsPackage.BLOCK_ARCHITECTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__FEATURES = CsPackage.BLOCK_ARCHITECTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__APPLIED_REQUIREMENTS = CsPackage.BLOCK_ARCHITECTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__CONTAINED_GENERIC_TRACES = CsPackage.BLOCK_ARCHITECTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__CONTAINED_REQUIREMENTS_TRACES = CsPackage.BLOCK_ARCHITECTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS = CsPackage.BLOCK_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES = CsPackage.BLOCK_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CsPackage.BLOCK_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Requirement Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__OWNED_REQUIREMENT_PKGS = CsPackage.BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__OWNED_INTERFACE_PKG = CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__OWNED_DATA_PKG = CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned Logical Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Logical Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Logical Component Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Logical Actor Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contained Capability Realization Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contained Logical Function Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Allocated System Analyses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Logical Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE_FEATURE_COUNT = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalFunctionImpl <em>Logical Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LogicalFunctionImpl
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getLogicalFunction()
	 * @generated
	 */
	int LOGICAL_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OWNED_EXTENSIONS = FaPackage.ABSTRACT_FUNCTION__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__ID = FaPackage.ABSTRACT_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__SID = FaPackage.ABSTRACT_FUNCTION__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OWNED_CONSTRAINTS = FaPackage.ABSTRACT_FUNCTION__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__NAME = FaPackage.ABSTRACT_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__SUMMARY = FaPackage.ABSTRACT_FUNCTION__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__DESCRIPTION = FaPackage.ABSTRACT_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__REVIEW = FaPackage.ABSTRACT_FUNCTION__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OWNED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTION__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OWNED_ENUMERATION_PROPERTY_TYPES = FaPackage.ABSTRACT_FUNCTION__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__APPLIED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTION__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OWNED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTION__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__APPLIED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTION__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__STATUS = FaPackage.ABSTRACT_FUNCTION__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__FEATURES = FaPackage.ABSTRACT_FUNCTION__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__APPLIED_REQUIREMENTS = FaPackage.ABSTRACT_FUNCTION__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__CONTAINED_GENERIC_TRACES = FaPackage.ABSTRACT_FUNCTION__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__CONTAINED_REQUIREMENTS_TRACES = FaPackage.ABSTRACT_FUNCTION__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Functional Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OWNED_FUNCTIONAL_CHAINS = FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_CHAINS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__IS_ABSTRACT = FaPackage.ABSTRACT_FUNCTION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__IS_STATIC = FaPackage.ABSTRACT_FUNCTION__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__VISIBILITY = FaPackage.ABSTRACT_FUNCTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__TYPE = FaPackage.ABSTRACT_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__ORDERED = FaPackage.ABSTRACT_FUNCTION__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__UNIQUE = FaPackage.ABSTRACT_FUNCTION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__MIN_INCLUSIVE = FaPackage.ABSTRACT_FUNCTION__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__MAX_INCLUSIVE = FaPackage.ABSTRACT_FUNCTION__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OWNED_DEFAULT_VALUE = FaPackage.ABSTRACT_FUNCTION__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OWNED_MIN_VALUE = FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OWNED_MAX_VALUE = FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OWNED_NULL_VALUE = FaPackage.ABSTRACT_FUNCTION__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OWNED_MIN_CARD = FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OWNED_MIN_LENGTH = FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OWNED_MAX_CARD = FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OWNED_MAX_LENGTH = FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__AGGREGATION_KIND = FaPackage.ABSTRACT_FUNCTION__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__IS_DERIVED = FaPackage.ABSTRACT_FUNCTION__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__IS_READ_ONLY = FaPackage.ABSTRACT_FUNCTION__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__IS_PART_OF_KEY = FaPackage.ABSTRACT_FUNCTION__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OUTGOING = FaPackage.ABSTRACT_FUNCTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__INCOMING = FaPackage.ABSTRACT_FUNCTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__INPUTS = FaPackage.ABSTRACT_FUNCTION__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OUTPUTS = FaPackage.ABSTRACT_FUNCTION__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__KIND = FaPackage.ABSTRACT_FUNCTION__KIND;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__CONDITION = FaPackage.ABSTRACT_FUNCTION__CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Functional Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OWNED_FUNCTIONAL_EXCHANGES = FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Available In States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__AVAILABLE_IN_STATES = FaPackage.ABSTRACT_FUNCTION__AVAILABLE_IN_STATES;

	/**
	 * The feature id for the '<em><b>Linked State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__LINKED_STATE_MACHINE = FaPackage.ABSTRACT_FUNCTION__LINKED_STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>Owned Logical Function Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS = FaPackage.ABSTRACT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realized System Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS = FaPackage.ABSTRACT_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contained Logical Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION__CONTAINED_LOGICAL_FUNCTIONS = FaPackage.ABSTRACT_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Logical Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_FEATURE_COUNT = FaPackage.ABSTRACT_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalFunctionPkgImpl <em>Logical Function Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LogicalFunctionPkgImpl
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getLogicalFunctionPkg()
	 * @generated
	 */
	int LOGICAL_FUNCTION_PKG = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__OWNED_EXTENSIONS = FaPackage.FUNCTION_PKG__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__ID = FaPackage.FUNCTION_PKG__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__SID = FaPackage.FUNCTION_PKG__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__OWNED_CONSTRAINTS = FaPackage.FUNCTION_PKG__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__NAME = FaPackage.FUNCTION_PKG__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__SUMMARY = FaPackage.FUNCTION_PKG__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__DESCRIPTION = FaPackage.FUNCTION_PKG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__REVIEW = FaPackage.FUNCTION_PKG__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__OWNED_PROPERTY_VALUES = FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__OWNED_ENUMERATION_PROPERTY_TYPES = FaPackage.FUNCTION_PKG__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__APPLIED_PROPERTY_VALUES = FaPackage.FUNCTION_PKG__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__OWNED_PROPERTY_VALUE_GROUPS = FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__APPLIED_PROPERTY_VALUE_GROUPS = FaPackage.FUNCTION_PKG__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__STATUS = FaPackage.FUNCTION_PKG__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__FEATURES = FaPackage.FUNCTION_PKG__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__APPLIED_REQUIREMENTS = FaPackage.FUNCTION_PKG__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__CONTAINED_GENERIC_TRACES = FaPackage.FUNCTION_PKG__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES = FaPackage.FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS = FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__OWNED_CATEGORIES = FaPackage.FUNCTION_PKG__OWNED_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Logical Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__OWNED_LOGICAL_FUNCTIONS = FaPackage.FUNCTION_PKG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Logical Function Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG__OWNED_LOGICAL_FUNCTION_PKGS = FaPackage.FUNCTION_PKG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Function Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FUNCTION_PKG_FEATURE_COUNT = FaPackage.FUNCTION_PKG_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalComponentImpl <em>Logical Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LogicalComponentImpl
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getLogicalComponent()
	 * @generated
	 */
	int LOGICAL_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_EXTENSIONS = CsPackage.SYSTEM_COMPONENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__ID = CsPackage.SYSTEM_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__SID = CsPackage.SYSTEM_COMPONENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_CONSTRAINTS = CsPackage.SYSTEM_COMPONENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__NAME = CsPackage.SYSTEM_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__SUMMARY = CsPackage.SYSTEM_COMPONENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__DESCRIPTION = CsPackage.SYSTEM_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__REVIEW = CsPackage.SYSTEM_COMPONENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_PROPERTY_VALUES = CsPackage.SYSTEM_COMPONENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES = CsPackage.SYSTEM_COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__APPLIED_PROPERTY_VALUES = CsPackage.SYSTEM_COMPONENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_PROPERTY_VALUE_GROUPS = CsPackage.SYSTEM_COMPONENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS = CsPackage.SYSTEM_COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__STATUS = CsPackage.SYSTEM_COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__FEATURES = CsPackage.SYSTEM_COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__APPLIED_REQUIREMENTS = CsPackage.SYSTEM_COMPONENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__CONTAINED_GENERIC_TRACES = CsPackage.SYSTEM_COMPONENT__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__CONTAINED_REQUIREMENTS_TRACES = CsPackage.SYSTEM_COMPONENT__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_COMPONENT_EXCHANGES = CsPackage.SYSTEM_COMPONENT__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CsPackage.SYSTEM_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG = CsPackage.SYSTEM_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_INTERFACE_PKG = CsPackage.SYSTEM_COMPONENT__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_DATA_PKG = CsPackage.SYSTEM_COMPONENT__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_STATE_MACHINES = CsPackage.SYSTEM_COMPONENT__OWNED_STATE_MACHINES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__ABSTRACT = CsPackage.SYSTEM_COMPONENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__SUPER = CsPackage.SYSTEM_COMPONENT__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__SUB = CsPackage.SYSTEM_COMPONENT__SUB;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__CONTAINED_PROPERTIES = CsPackage.SYSTEM_COMPONENT__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_COMMUNICATION_LINKS = CsPackage.SYSTEM_COMPONENT__OWNED_COMMUNICATION_LINKS;

	/**
	 * The feature id for the '<em><b>Used Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__USED_INTERFACES = CsPackage.SYSTEM_COMPONENT__USED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__IMPLEMENTED_INTERFACES = CsPackage.SYSTEM_COMPONENT__IMPLEMENTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Allocated Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__ALLOCATED_COMPONENTS = CsPackage.SYSTEM_COMPONENT__ALLOCATED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__PROVIDED_INTERFACES = CsPackage.SYSTEM_COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__REQUIRED_INTERFACES = CsPackage.SYSTEM_COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__CONTAINED_COMPONENT_PORTS = CsPackage.SYSTEM_COMPONENT__CONTAINED_COMPONENT_PORTS;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__CONTAINED_PARTS = CsPackage.SYSTEM_COMPONENT__CONTAINED_PARTS;

	/**
	 * The feature id for the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__CONTAINED_PHYSICAL_PORTS = CsPackage.SYSTEM_COMPONENT__CONTAINED_PHYSICAL_PORTS;

	/**
	 * The feature id for the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_PHYSICAL_PATH = CsPackage.SYSTEM_COMPONENT__OWNED_PHYSICAL_PATH;

	/**
	 * The feature id for the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_PHYSICAL_LINKS = CsPackage.SYSTEM_COMPONENT__OWNED_PHYSICAL_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES = CsPackage.SYSTEM_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Data Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__DATA_COMPONENT = CsPackage.SYSTEM_COMPONENT__DATA_COMPONENT;

	/**
	 * The feature id for the '<em><b>Owned Logical Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENTS = CsPackage.SYSTEM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Logical Component Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_PKGS = CsPackage.SYSTEM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allocated Logical Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__ALLOCATED_LOGICAL_FUNCTIONS = CsPackage.SYSTEM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Realized Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__REALIZED_SYSTEMS = CsPackage.SYSTEM_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Logical Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_FEATURE_COUNT = CsPackage.SYSTEM_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalComponentPkgImpl <em>Logical Component Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LogicalComponentPkgImpl
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getLogicalComponentPkg()
	 * @generated
	 */
	int LOGICAL_COMPONENT_PKG = 4;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__OWNED_EXTENSIONS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__ID = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__SID = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__OWNED_CONSTRAINTS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__NAME = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__SUMMARY = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__DESCRIPTION = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__REVIEW = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__OWNED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__OWNED_ENUMERATION_PROPERTY_TYPES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__APPLIED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__OWNED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__APPLIED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__STATUS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__FEATURES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__APPLIED_REQUIREMENTS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__CONTAINED_GENERIC_TRACES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__CONTAINED_REQUIREMENTS_TRACES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__OWNED_PROPERTY_VALUE_PKGS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__OWNED_COMPONENT_EXCHANGES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__OWNED_COMPONENT_EXCHANGE_CATEGORIES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Logical Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__OWNED_LOGICAL_COMPONENTS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Logical Component Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG__OWNED_LOGICAL_COMPONENT_PKGS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Component Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_PKG_FEATURE_COUNT = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.la.impl.CapabilityRealizationImpl <em>Capability Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.la.impl.CapabilityRealizationImpl
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getCapabilityRealization()
	 * @generated
	 */
	int CAPABILITY_REALIZATION = 5;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__OWNED_EXTENSIONS = InteractionPackage.ABSTRACT_CAPABILITY__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__ID = InteractionPackage.ABSTRACT_CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__SID = InteractionPackage.ABSTRACT_CAPABILITY__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__OWNED_CONSTRAINTS = InteractionPackage.ABSTRACT_CAPABILITY__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__NAME = InteractionPackage.ABSTRACT_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__SUMMARY = InteractionPackage.ABSTRACT_CAPABILITY__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__DESCRIPTION = InteractionPackage.ABSTRACT_CAPABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__REVIEW = InteractionPackage.ABSTRACT_CAPABILITY__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__OWNED_PROPERTY_VALUES = InteractionPackage.ABSTRACT_CAPABILITY__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__OWNED_ENUMERATION_PROPERTY_TYPES = InteractionPackage.ABSTRACT_CAPABILITY__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__APPLIED_PROPERTY_VALUES = InteractionPackage.ABSTRACT_CAPABILITY__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__OWNED_PROPERTY_VALUE_GROUPS = InteractionPackage.ABSTRACT_CAPABILITY__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__APPLIED_PROPERTY_VALUE_GROUPS = InteractionPackage.ABSTRACT_CAPABILITY__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__STATUS = InteractionPackage.ABSTRACT_CAPABILITY__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__FEATURES = InteractionPackage.ABSTRACT_CAPABILITY__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__APPLIED_REQUIREMENTS = InteractionPackage.ABSTRACT_CAPABILITY__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__CONTAINED_GENERIC_TRACES = InteractionPackage.ABSTRACT_CAPABILITY__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__CONTAINED_REQUIREMENTS_TRACES = InteractionPackage.ABSTRACT_CAPABILITY__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__OWNED_PROPERTY_VALUE_PKGS = InteractionPackage.ABSTRACT_CAPABILITY__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Functional Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__OWNED_FUNCTIONAL_CHAINS = InteractionPackage.ABSTRACT_CAPABILITY__OWNED_FUNCTIONAL_CHAINS;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__PRE_CONDITION = InteractionPackage.ABSTRACT_CAPABILITY__PRE_CONDITION;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__POST_CONDITION = InteractionPackage.ABSTRACT_CAPABILITY__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__OWNED_SCENARIOS = InteractionPackage.ABSTRACT_CAPABILITY__OWNED_SCENARIOS;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__SUPER = InteractionPackage.ABSTRACT_CAPABILITY__SUPER;

	/**
	 * The feature id for the '<em><b>Included Abstract Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__INCLUDED_ABSTRACT_CAPABILITIES = InteractionPackage.ABSTRACT_CAPABILITY__INCLUDED_ABSTRACT_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Extended Abstract Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__EXTENDED_ABSTRACT_CAPABILITIES = InteractionPackage.ABSTRACT_CAPABILITY__EXTENDED_ABSTRACT_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Available In States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__AVAILABLE_IN_STATES = InteractionPackage.ABSTRACT_CAPABILITY__AVAILABLE_IN_STATES;

	/**
	 * The feature id for the '<em><b>Involved Abstract Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__INVOLVED_ABSTRACT_FUNCTIONS = InteractionPackage.ABSTRACT_CAPABILITY__INVOLVED_ABSTRACT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Involved Functional Chains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__INVOLVED_FUNCTIONAL_CHAINS = InteractionPackage.ABSTRACT_CAPABILITY__INVOLVED_FUNCTIONAL_CHAINS;

	/**
	 * The feature id for the '<em><b>Participating Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__PARTICIPATING_ACTORS = InteractionPackage.ABSTRACT_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participating System Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__PARTICIPATING_SYSTEM_COMPONENTS = InteractionPackage.ABSTRACT_CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realized Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__REALIZED_CAPABILITIES = InteractionPackage.ABSTRACT_CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Realized Capability Realizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS = InteractionPackage.ABSTRACT_CAPABILITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Capability Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_FEATURE_COUNT = InteractionPackage.ABSTRACT_CAPABILITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.la.impl.CapabilityRealizationPkgImpl <em>Capability Realization Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.la.impl.CapabilityRealizationPkgImpl
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getCapabilityRealizationPkg()
	 * @generated
	 */
	int CAPABILITY_REALIZATION_PKG = 6;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__OWNED_EXTENSIONS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__ID = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__SID = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__OWNED_CONSTRAINTS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__NAME = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__SUMMARY = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__DESCRIPTION = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__REVIEW = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__OWNED_PROPERTY_VALUES = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__APPLIED_PROPERTY_VALUES = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__OWNED_PROPERTY_VALUE_GROUPS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__APPLIED_PROPERTY_VALUE_GROUPS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__STATUS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__FEATURES = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__APPLIED_REQUIREMENTS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__CONTAINED_GENERIC_TRACES = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__CONTAINED_REQUIREMENTS_TRACES = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__OWNED_PROPERTY_VALUE_PKGS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Capability Realizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__OWNED_CAPABILITY_REALIZATIONS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Capability Realization Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG__OWNED_CAPABILITY_REALIZATION_PKGS = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Capability Realization Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_PKG_FEATURE_COUNT = CapellacommonPackage.ABSTRACT_CAPABILITY_PKG_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalActorPkgImpl <em>Logical Actor Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LogicalActorPkgImpl
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getLogicalActorPkg()
	 * @generated
	 */
	int LOGICAL_ACTOR_PKG = 7;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__OWNED_EXTENSIONS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__ID = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__SID = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__OWNED_CONSTRAINTS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__NAME = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__SUMMARY = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__DESCRIPTION = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__REVIEW = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__OWNED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__OWNED_ENUMERATION_PROPERTY_TYPES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__APPLIED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__OWNED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__APPLIED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__STATUS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__FEATURES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__APPLIED_REQUIREMENTS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__CONTAINED_GENERIC_TRACES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__CONTAINED_REQUIREMENTS_TRACES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__OWNED_PROPERTY_VALUE_PKGS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__OWNED_COMPONENT_EXCHANGES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__OWNED_COMPONENT_EXCHANGE_CATEGORIES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Logical Actor Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__OWNED_LOGICAL_ACTOR_PKGS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Logical Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG__OWNED_LOGICAL_ACTORS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Actor Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_PKG_FEATURE_COUNT = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalActorImpl <em>Logical Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LogicalActorImpl
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getLogicalActor()
	 * @generated
	 */
	int LOGICAL_ACTOR = 8;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__OWNED_EXTENSIONS = CsPackage.ABSTRACT_ACTOR__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__ID = CsPackage.ABSTRACT_ACTOR__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__SID = CsPackage.ABSTRACT_ACTOR__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__OWNED_CONSTRAINTS = CsPackage.ABSTRACT_ACTOR__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__NAME = CsPackage.ABSTRACT_ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__SUMMARY = CsPackage.ABSTRACT_ACTOR__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__DESCRIPTION = CsPackage.ABSTRACT_ACTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__REVIEW = CsPackage.ABSTRACT_ACTOR__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__OWNED_PROPERTY_VALUES = CsPackage.ABSTRACT_ACTOR__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__OWNED_ENUMERATION_PROPERTY_TYPES = CsPackage.ABSTRACT_ACTOR__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__APPLIED_PROPERTY_VALUES = CsPackage.ABSTRACT_ACTOR__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__OWNED_PROPERTY_VALUE_GROUPS = CsPackage.ABSTRACT_ACTOR__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__APPLIED_PROPERTY_VALUE_GROUPS = CsPackage.ABSTRACT_ACTOR__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__STATUS = CsPackage.ABSTRACT_ACTOR__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__FEATURES = CsPackage.ABSTRACT_ACTOR__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__APPLIED_REQUIREMENTS = CsPackage.ABSTRACT_ACTOR__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__CONTAINED_GENERIC_TRACES = CsPackage.ABSTRACT_ACTOR__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__CONTAINED_REQUIREMENTS_TRACES = CsPackage.ABSTRACT_ACTOR__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__OWNED_COMPONENT_EXCHANGES = CsPackage.ABSTRACT_ACTOR__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CsPackage.ABSTRACT_ACTOR__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__OWNED_ABSTRACT_CAPABILITY_PKG = CsPackage.ABSTRACT_ACTOR__OWNED_ABSTRACT_CAPABILITY_PKG;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__OWNED_INTERFACE_PKG = CsPackage.ABSTRACT_ACTOR__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__OWNED_DATA_PKG = CsPackage.ABSTRACT_ACTOR__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__OWNED_STATE_MACHINES = CsPackage.ABSTRACT_ACTOR__OWNED_STATE_MACHINES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__ABSTRACT = CsPackage.ABSTRACT_ACTOR__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__SUPER = CsPackage.ABSTRACT_ACTOR__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__SUB = CsPackage.ABSTRACT_ACTOR__SUB;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__CONTAINED_PROPERTIES = CsPackage.ABSTRACT_ACTOR__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__OWNED_COMMUNICATION_LINKS = CsPackage.ABSTRACT_ACTOR__OWNED_COMMUNICATION_LINKS;

	/**
	 * The feature id for the '<em><b>Used Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__USED_INTERFACES = CsPackage.ABSTRACT_ACTOR__USED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__IMPLEMENTED_INTERFACES = CsPackage.ABSTRACT_ACTOR__IMPLEMENTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Allocated Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__ALLOCATED_COMPONENTS = CsPackage.ABSTRACT_ACTOR__ALLOCATED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__PROVIDED_INTERFACES = CsPackage.ABSTRACT_ACTOR__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__REQUIRED_INTERFACES = CsPackage.ABSTRACT_ACTOR__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__CONTAINED_COMPONENT_PORTS = CsPackage.ABSTRACT_ACTOR__CONTAINED_COMPONENT_PORTS;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__CONTAINED_PARTS = CsPackage.ABSTRACT_ACTOR__CONTAINED_PARTS;

	/**
	 * The feature id for the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__CONTAINED_PHYSICAL_PORTS = CsPackage.ABSTRACT_ACTOR__CONTAINED_PHYSICAL_PORTS;

	/**
	 * The feature id for the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__OWNED_PHYSICAL_PATH = CsPackage.ABSTRACT_ACTOR__OWNED_PHYSICAL_PATH;

	/**
	 * The feature id for the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__OWNED_PHYSICAL_LINKS = CsPackage.ABSTRACT_ACTOR__OWNED_PHYSICAL_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__OWNED_PHYSICAL_LINK_CATEGORIES = CsPackage.ABSTRACT_ACTOR__OWNED_PHYSICAL_LINK_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Allocated Logical Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__ALLOCATED_LOGICAL_FUNCTIONS = CsPackage.ABSTRACT_ACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realized System Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR__REALIZED_SYSTEM_ACTORS = CsPackage.ABSTRACT_ACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTOR_FEATURE_COUNT = CsPackage.ABSTRACT_ACTOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalContextImpl <em>Logical Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LogicalContextImpl
	 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getLogicalContext()
	 * @generated
	 */
	int LOGICAL_CONTEXT = 9;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__OWNED_EXTENSIONS = CsPackage.COMPONENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__ID = CsPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__SID = CsPackage.COMPONENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__OWNED_CONSTRAINTS = CsPackage.COMPONENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__NAME = CsPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__SUMMARY = CsPackage.COMPONENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__DESCRIPTION = CsPackage.COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__REVIEW = CsPackage.COMPONENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__OWNED_PROPERTY_VALUES = CsPackage.COMPONENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__OWNED_ENUMERATION_PROPERTY_TYPES = CsPackage.COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__APPLIED_PROPERTY_VALUES = CsPackage.COMPONENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__OWNED_PROPERTY_VALUE_GROUPS = CsPackage.COMPONENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__APPLIED_PROPERTY_VALUE_GROUPS = CsPackage.COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__STATUS = CsPackage.COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__FEATURES = CsPackage.COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__APPLIED_REQUIREMENTS = CsPackage.COMPONENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__CONTAINED_GENERIC_TRACES = CsPackage.COMPONENT__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__CONTAINED_REQUIREMENTS_TRACES = CsPackage.COMPONENT__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__OWNED_COMPONENT_EXCHANGES = CsPackage.COMPONENT__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CsPackage.COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__OWNED_ABSTRACT_CAPABILITY_PKG = CsPackage.COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__OWNED_INTERFACE_PKG = CsPackage.COMPONENT__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__OWNED_DATA_PKG = CsPackage.COMPONENT__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__OWNED_STATE_MACHINES = CsPackage.COMPONENT__OWNED_STATE_MACHINES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__ABSTRACT = CsPackage.COMPONENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__SUPER = CsPackage.COMPONENT__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__SUB = CsPackage.COMPONENT__SUB;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__CONTAINED_PROPERTIES = CsPackage.COMPONENT__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__OWNED_COMMUNICATION_LINKS = CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS;

	/**
	 * The feature id for the '<em><b>Used Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__USED_INTERFACES = CsPackage.COMPONENT__USED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__IMPLEMENTED_INTERFACES = CsPackage.COMPONENT__IMPLEMENTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Allocated Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__ALLOCATED_COMPONENTS = CsPackage.COMPONENT__ALLOCATED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__PROVIDED_INTERFACES = CsPackage.COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__REQUIRED_INTERFACES = CsPackage.COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__CONTAINED_COMPONENT_PORTS = CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__CONTAINED_PARTS = CsPackage.COMPONENT__CONTAINED_PARTS;

	/**
	 * The feature id for the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__CONTAINED_PHYSICAL_PORTS = CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS;

	/**
	 * The feature id for the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__OWNED_PHYSICAL_PATH = CsPackage.COMPONENT__OWNED_PHYSICAL_PATH;

	/**
	 * The feature id for the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__OWNED_PHYSICAL_LINKS = CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT__OWNED_PHYSICAL_LINK_CATEGORIES = CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES;

	/**
	 * The number of structural features of the '<em>Logical Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONTEXT_FEATURE_COUNT = CsPackage.COMPONENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture <em>Logical Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Architecture</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalArchitecture
	 * @generated
	 */
	EClass getLogicalArchitecture();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getOwnedLogicalContext <em>Owned Logical Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Logical Context</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getOwnedLogicalContext()
	 * @see #getLogicalArchitecture()
	 * @generated
	 */
	EReference getLogicalArchitecture_OwnedLogicalContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getOwnedLogicalComponent <em>Owned Logical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Logical Component</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getOwnedLogicalComponent()
	 * @see #getLogicalArchitecture()
	 * @generated
	 */
	EReference getLogicalArchitecture_OwnedLogicalComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getOwnedLogicalComponentPkg <em>Owned Logical Component Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Logical Component Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getOwnedLogicalComponentPkg()
	 * @see #getLogicalArchitecture()
	 * @generated
	 */
	EReference getLogicalArchitecture_OwnedLogicalComponentPkg();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getOwnedLogicalActorPkg <em>Owned Logical Actor Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Logical Actor Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getOwnedLogicalActorPkg()
	 * @see #getLogicalArchitecture()
	 * @generated
	 */
	EReference getLogicalArchitecture_OwnedLogicalActorPkg();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Capability Realization Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getContainedCapabilityRealizationPkg()
	 * @see #getLogicalArchitecture()
	 * @generated
	 */
	EReference getLogicalArchitecture_ContainedCapabilityRealizationPkg();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getContainedLogicalFunctionPkg <em>Contained Logical Function Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Logical Function Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getContainedLogicalFunctionPkg()
	 * @see #getLogicalArchitecture()
	 * @generated
	 */
	EReference getLogicalArchitecture_ContainedLogicalFunctionPkg();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getAllocatedSystemAnalyses <em>Allocated System Analyses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated System Analyses</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getAllocatedSystemAnalyses()
	 * @see #getLogicalArchitecture()
	 * @generated
	 */
	EReference getLogicalArchitecture_AllocatedSystemAnalyses();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.la.LogicalFunction <em>Logical Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Function</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalFunction
	 * @generated
	 */
	EClass getLogicalFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.la.LogicalFunction#getOwnedLogicalFunctionPkgs <em>Owned Logical Function Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Logical Function Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalFunction#getOwnedLogicalFunctionPkgs()
	 * @see #getLogicalFunction()
	 * @generated
	 */
	EReference getLogicalFunction_OwnedLogicalFunctionPkgs();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.la.LogicalFunction#getRealizedSystemFunctions <em>Realized System Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized System Functions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalFunction#getRealizedSystemFunctions()
	 * @see #getLogicalFunction()
	 * @generated
	 */
	EReference getLogicalFunction_RealizedSystemFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.la.LogicalFunction#getContainedLogicalFunctions <em>Contained Logical Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Logical Functions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalFunction#getContainedLogicalFunctions()
	 * @see #getLogicalFunction()
	 * @generated
	 */
	EReference getLogicalFunction_ContainedLogicalFunctions();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.la.LogicalFunctionPkg <em>Logical Function Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Function Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalFunctionPkg
	 * @generated
	 */
	EClass getLogicalFunctionPkg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.la.LogicalFunctionPkg#getOwnedLogicalFunctions <em>Owned Logical Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Logical Functions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalFunctionPkg#getOwnedLogicalFunctions()
	 * @see #getLogicalFunctionPkg()
	 * @generated
	 */
	EReference getLogicalFunctionPkg_OwnedLogicalFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.la.LogicalFunctionPkg#getOwnedLogicalFunctionPkgs <em>Owned Logical Function Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Logical Function Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalFunctionPkg#getOwnedLogicalFunctionPkgs()
	 * @see #getLogicalFunctionPkg()
	 * @generated
	 */
	EReference getLogicalFunctionPkg_OwnedLogicalFunctionPkgs();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.la.LogicalComponent <em>Logical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Component</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalComponent
	 * @generated
	 */
	EClass getLogicalComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.la.LogicalComponent#getOwnedLogicalComponents <em>Owned Logical Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Logical Components</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalComponent#getOwnedLogicalComponents()
	 * @see #getLogicalComponent()
	 * @generated
	 */
	EReference getLogicalComponent_OwnedLogicalComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.la.LogicalComponent#getOwnedLogicalComponentPkgs <em>Owned Logical Component Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Logical Component Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalComponent#getOwnedLogicalComponentPkgs()
	 * @see #getLogicalComponent()
	 * @generated
	 */
	EReference getLogicalComponent_OwnedLogicalComponentPkgs();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.la.LogicalComponent#getAllocatedLogicalFunctions <em>Allocated Logical Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Logical Functions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalComponent#getAllocatedLogicalFunctions()
	 * @see #getLogicalComponent()
	 * @generated
	 */
	EReference getLogicalComponent_AllocatedLogicalFunctions();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.la.LogicalComponent#getRealizedSystems <em>Realized Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Systems</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalComponent#getRealizedSystems()
	 * @see #getLogicalComponent()
	 * @generated
	 */
	EReference getLogicalComponent_RealizedSystems();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.la.LogicalComponentPkg <em>Logical Component Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Component Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalComponentPkg
	 * @generated
	 */
	EClass getLogicalComponentPkg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.la.LogicalComponentPkg#getOwnedLogicalComponents <em>Owned Logical Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Logical Components</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalComponentPkg#getOwnedLogicalComponents()
	 * @see #getLogicalComponentPkg()
	 * @generated
	 */
	EReference getLogicalComponentPkg_OwnedLogicalComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.la.LogicalComponentPkg#getOwnedLogicalComponentPkgs <em>Owned Logical Component Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Logical Component Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalComponentPkg#getOwnedLogicalComponentPkgs()
	 * @see #getLogicalComponentPkg()
	 * @generated
	 */
	EReference getLogicalComponentPkg_OwnedLogicalComponentPkgs();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.la.CapabilityRealization <em>Capability Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Realization</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.CapabilityRealization
	 * @generated
	 */
	EClass getCapabilityRealization();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.la.CapabilityRealization#getParticipatingActors <em>Participating Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participating Actors</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.CapabilityRealization#getParticipatingActors()
	 * @see #getCapabilityRealization()
	 * @generated
	 */
	EReference getCapabilityRealization_ParticipatingActors();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.la.CapabilityRealization#getParticipatingSystemComponents <em>Participating System Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participating System Components</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.CapabilityRealization#getParticipatingSystemComponents()
	 * @see #getCapabilityRealization()
	 * @generated
	 */
	EReference getCapabilityRealization_ParticipatingSystemComponents();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.la.CapabilityRealization#getRealizedCapabilities <em>Realized Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Capabilities</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.CapabilityRealization#getRealizedCapabilities()
	 * @see #getCapabilityRealization()
	 * @generated
	 */
	EReference getCapabilityRealization_RealizedCapabilities();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.la.CapabilityRealization#getRealizedCapabilityRealizations <em>Realized Capability Realizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Capability Realizations</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.CapabilityRealization#getRealizedCapabilityRealizations()
	 * @see #getCapabilityRealization()
	 * @generated
	 */
	EReference getCapabilityRealization_RealizedCapabilityRealizations();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.la.CapabilityRealizationPkg <em>Capability Realization Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Realization Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.CapabilityRealizationPkg
	 * @generated
	 */
	EClass getCapabilityRealizationPkg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.la.CapabilityRealizationPkg#getOwnedCapabilityRealizations <em>Owned Capability Realizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Capability Realizations</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.CapabilityRealizationPkg#getOwnedCapabilityRealizations()
	 * @see #getCapabilityRealizationPkg()
	 * @generated
	 */
	EReference getCapabilityRealizationPkg_OwnedCapabilityRealizations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.la.CapabilityRealizationPkg#getOwnedCapabilityRealizationPkgs <em>Owned Capability Realization Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Capability Realization Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.CapabilityRealizationPkg#getOwnedCapabilityRealizationPkgs()
	 * @see #getCapabilityRealizationPkg()
	 * @generated
	 */
	EReference getCapabilityRealizationPkg_OwnedCapabilityRealizationPkgs();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.la.LogicalActorPkg <em>Logical Actor Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Actor Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalActorPkg
	 * @generated
	 */
	EClass getLogicalActorPkg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.la.LogicalActorPkg#getOwnedLogicalActorPkgs <em>Owned Logical Actor Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Logical Actor Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalActorPkg#getOwnedLogicalActorPkgs()
	 * @see #getLogicalActorPkg()
	 * @generated
	 */
	EReference getLogicalActorPkg_OwnedLogicalActorPkgs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.la.LogicalActorPkg#getOwnedLogicalActors <em>Owned Logical Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Logical Actors</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalActorPkg#getOwnedLogicalActors()
	 * @see #getLogicalActorPkg()
	 * @generated
	 */
	EReference getLogicalActorPkg_OwnedLogicalActors();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.la.LogicalActor <em>Logical Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Actor</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalActor
	 * @generated
	 */
	EClass getLogicalActor();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.la.LogicalActor#getAllocatedLogicalFunctions <em>Allocated Logical Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Logical Functions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalActor#getAllocatedLogicalFunctions()
	 * @see #getLogicalActor()
	 * @generated
	 */
	EReference getLogicalActor_AllocatedLogicalFunctions();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.la.LogicalActor#getRealizedSystemActors <em>Realized System Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized System Actors</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalActor#getRealizedSystemActors()
	 * @see #getLogicalActor()
	 * @generated
	 */
	EReference getLogicalActor_RealizedSystemActors();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.la.LogicalContext <em>Logical Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Context</em>'.
	 * @see org.polarsys.capella.core.semantic.data.la.LogicalContext
	 * @generated
	 */
	EClass getLogicalContext();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LaFactory getLaFactory();

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
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalArchitectureImpl <em>Logical Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LogicalArchitectureImpl
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getLogicalArchitecture()
		 * @generated
		 */
		EClass LOGICAL_ARCHITECTURE = eINSTANCE.getLogicalArchitecture();

		/**
		 * The meta object literal for the '<em><b>Owned Logical Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT = eINSTANCE.getLogicalArchitecture_OwnedLogicalContext();

		/**
		 * The meta object literal for the '<em><b>Owned Logical Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT = eINSTANCE.getLogicalArchitecture_OwnedLogicalComponent();

		/**
		 * The meta object literal for the '<em><b>Owned Logical Component Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG = eINSTANCE.getLogicalArchitecture_OwnedLogicalComponentPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Logical Actor Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG = eINSTANCE.getLogicalArchitecture_OwnedLogicalActorPkg();

		/**
		 * The meta object literal for the '<em><b>Contained Capability Realization Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG = eINSTANCE.getLogicalArchitecture_ContainedCapabilityRealizationPkg();

		/**
		 * The meta object literal for the '<em><b>Contained Logical Function Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG = eINSTANCE.getLogicalArchitecture_ContainedLogicalFunctionPkg();

		/**
		 * The meta object literal for the '<em><b>Allocated System Analyses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES = eINSTANCE.getLogicalArchitecture_AllocatedSystemAnalyses();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalFunctionImpl <em>Logical Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LogicalFunctionImpl
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getLogicalFunction()
		 * @generated
		 */
		EClass LOGICAL_FUNCTION = eINSTANCE.getLogicalFunction();

		/**
		 * The meta object literal for the '<em><b>Owned Logical Function Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS = eINSTANCE.getLogicalFunction_OwnedLogicalFunctionPkgs();

		/**
		 * The meta object literal for the '<em><b>Realized System Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS = eINSTANCE.getLogicalFunction_RealizedSystemFunctions();

		/**
		 * The meta object literal for the '<em><b>Contained Logical Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_FUNCTION__CONTAINED_LOGICAL_FUNCTIONS = eINSTANCE.getLogicalFunction_ContainedLogicalFunctions();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalFunctionPkgImpl <em>Logical Function Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LogicalFunctionPkgImpl
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getLogicalFunctionPkg()
		 * @generated
		 */
		EClass LOGICAL_FUNCTION_PKG = eINSTANCE.getLogicalFunctionPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Logical Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_FUNCTION_PKG__OWNED_LOGICAL_FUNCTIONS = eINSTANCE.getLogicalFunctionPkg_OwnedLogicalFunctions();

		/**
		 * The meta object literal for the '<em><b>Owned Logical Function Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_FUNCTION_PKG__OWNED_LOGICAL_FUNCTION_PKGS = eINSTANCE.getLogicalFunctionPkg_OwnedLogicalFunctionPkgs();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalComponentImpl <em>Logical Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LogicalComponentImpl
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getLogicalComponent()
		 * @generated
		 */
		EClass LOGICAL_COMPONENT = eINSTANCE.getLogicalComponent();

		/**
		 * The meta object literal for the '<em><b>Owned Logical Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENTS = eINSTANCE.getLogicalComponent_OwnedLogicalComponents();

		/**
		 * The meta object literal for the '<em><b>Owned Logical Component Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_PKGS = eINSTANCE.getLogicalComponent_OwnedLogicalComponentPkgs();

		/**
		 * The meta object literal for the '<em><b>Allocated Logical Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPONENT__ALLOCATED_LOGICAL_FUNCTIONS = eINSTANCE.getLogicalComponent_AllocatedLogicalFunctions();

		/**
		 * The meta object literal for the '<em><b>Realized Systems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPONENT__REALIZED_SYSTEMS = eINSTANCE.getLogicalComponent_RealizedSystems();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalComponentPkgImpl <em>Logical Component Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LogicalComponentPkgImpl
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getLogicalComponentPkg()
		 * @generated
		 */
		EClass LOGICAL_COMPONENT_PKG = eINSTANCE.getLogicalComponentPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Logical Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPONENT_PKG__OWNED_LOGICAL_COMPONENTS = eINSTANCE.getLogicalComponentPkg_OwnedLogicalComponents();

		/**
		 * The meta object literal for the '<em><b>Owned Logical Component Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMPONENT_PKG__OWNED_LOGICAL_COMPONENT_PKGS = eINSTANCE.getLogicalComponentPkg_OwnedLogicalComponentPkgs();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.la.impl.CapabilityRealizationImpl <em>Capability Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.la.impl.CapabilityRealizationImpl
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getCapabilityRealization()
		 * @generated
		 */
		EClass CAPABILITY_REALIZATION = eINSTANCE.getCapabilityRealization();

		/**
		 * The meta object literal for the '<em><b>Participating Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_REALIZATION__PARTICIPATING_ACTORS = eINSTANCE.getCapabilityRealization_ParticipatingActors();

		/**
		 * The meta object literal for the '<em><b>Participating System Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_REALIZATION__PARTICIPATING_SYSTEM_COMPONENTS = eINSTANCE.getCapabilityRealization_ParticipatingSystemComponents();

		/**
		 * The meta object literal for the '<em><b>Realized Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_REALIZATION__REALIZED_CAPABILITIES = eINSTANCE.getCapabilityRealization_RealizedCapabilities();

		/**
		 * The meta object literal for the '<em><b>Realized Capability Realizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS = eINSTANCE.getCapabilityRealization_RealizedCapabilityRealizations();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.la.impl.CapabilityRealizationPkgImpl <em>Capability Realization Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.la.impl.CapabilityRealizationPkgImpl
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getCapabilityRealizationPkg()
		 * @generated
		 */
		EClass CAPABILITY_REALIZATION_PKG = eINSTANCE.getCapabilityRealizationPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Capability Realizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_REALIZATION_PKG__OWNED_CAPABILITY_REALIZATIONS = eINSTANCE.getCapabilityRealizationPkg_OwnedCapabilityRealizations();

		/**
		 * The meta object literal for the '<em><b>Owned Capability Realization Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_REALIZATION_PKG__OWNED_CAPABILITY_REALIZATION_PKGS = eINSTANCE.getCapabilityRealizationPkg_OwnedCapabilityRealizationPkgs();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalActorPkgImpl <em>Logical Actor Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LogicalActorPkgImpl
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getLogicalActorPkg()
		 * @generated
		 */
		EClass LOGICAL_ACTOR_PKG = eINSTANCE.getLogicalActorPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Logical Actor Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ACTOR_PKG__OWNED_LOGICAL_ACTOR_PKGS = eINSTANCE.getLogicalActorPkg_OwnedLogicalActorPkgs();

		/**
		 * The meta object literal for the '<em><b>Owned Logical Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ACTOR_PKG__OWNED_LOGICAL_ACTORS = eINSTANCE.getLogicalActorPkg_OwnedLogicalActors();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalActorImpl <em>Logical Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LogicalActorImpl
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getLogicalActor()
		 * @generated
		 */
		EClass LOGICAL_ACTOR = eINSTANCE.getLogicalActor();

		/**
		 * The meta object literal for the '<em><b>Allocated Logical Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ACTOR__ALLOCATED_LOGICAL_FUNCTIONS = eINSTANCE.getLogicalActor_AllocatedLogicalFunctions();

		/**
		 * The meta object literal for the '<em><b>Realized System Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ACTOR__REALIZED_SYSTEM_ACTORS = eINSTANCE.getLogicalActor_RealizedSystemActors();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalContextImpl <em>Logical Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LogicalContextImpl
		 * @see org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl#getLogicalContext()
		 * @generated
		 */
		EClass LOGICAL_CONTEXT = eINSTANCE.getLogicalContext();

	}

} //LaPackage
