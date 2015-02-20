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

package org.polarsys.capella.core.semantic.data.pa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.core.semantic.data.cs.CsPackage;

import org.polarsys.capella.core.semantic.data.fa.FaPackage;

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
 * @see org.polarsys.capella.core.semantic.data.pa.PaFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/capella/xmlpivot sourceNsURI='http://www.polarsys.org/capella/core/pa/0.8.0'"
 * @generated
 */
public interface PaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/capella/core/pa/0.8.0/semantic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.polarsys.capella.core.data.pa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PaPackage eINSTANCE = org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalArchitectureImpl <em>Physical Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalArchitectureImpl
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalArchitecture()
	 * @generated
	 */
	int PHYSICAL_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__OWNED_EXTENSIONS = CsPackage.BLOCK_ARCHITECTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__ID = CsPackage.BLOCK_ARCHITECTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__SID = CsPackage.BLOCK_ARCHITECTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__OWNED_CONSTRAINTS = CsPackage.BLOCK_ARCHITECTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__NAME = CsPackage.BLOCK_ARCHITECTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__SUMMARY = CsPackage.BLOCK_ARCHITECTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__DESCRIPTION = CsPackage.BLOCK_ARCHITECTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__REVIEW = CsPackage.BLOCK_ARCHITECTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__OWNED_PROPERTY_VALUES = CsPackage.BLOCK_ARCHITECTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__OWNED_ENUMERATION_PROPERTY_TYPES = CsPackage.BLOCK_ARCHITECTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__APPLIED_PROPERTY_VALUES = CsPackage.BLOCK_ARCHITECTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_GROUPS = CsPackage.BLOCK_ARCHITECTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__APPLIED_PROPERTY_VALUE_GROUPS = CsPackage.BLOCK_ARCHITECTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__STATUS = CsPackage.BLOCK_ARCHITECTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__FEATURES = CsPackage.BLOCK_ARCHITECTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__APPLIED_REQUIREMENTS = CsPackage.BLOCK_ARCHITECTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__CONTAINED_GENERIC_TRACES = CsPackage.BLOCK_ARCHITECTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__CONTAINED_REQUIREMENTS_TRACES = CsPackage.BLOCK_ARCHITECTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS = CsPackage.BLOCK_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES = CsPackage.BLOCK_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CsPackage.BLOCK_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Requirement Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__OWNED_REQUIREMENT_PKGS = CsPackage.BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__OWNED_INTERFACE_PKG = CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__OWNED_DATA_PKG = CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned Physical Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Physical Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Physical Component Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Physical Actor Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contained Capability Realization Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contained Physical Function Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Deployments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Allocated Logical Architectures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Physical Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ARCHITECTURE_FEATURE_COUNT = CsPackage.BLOCK_ARCHITECTURE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalFunctionImpl <em>Physical Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalFunctionImpl
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalFunction()
	 * @generated
	 */
	int PHYSICAL_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OWNED_EXTENSIONS = FaPackage.ABSTRACT_FUNCTION__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__ID = FaPackage.ABSTRACT_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__SID = FaPackage.ABSTRACT_FUNCTION__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OWNED_CONSTRAINTS = FaPackage.ABSTRACT_FUNCTION__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__NAME = FaPackage.ABSTRACT_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__SUMMARY = FaPackage.ABSTRACT_FUNCTION__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__DESCRIPTION = FaPackage.ABSTRACT_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__REVIEW = FaPackage.ABSTRACT_FUNCTION__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OWNED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTION__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OWNED_ENUMERATION_PROPERTY_TYPES = FaPackage.ABSTRACT_FUNCTION__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__APPLIED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTION__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OWNED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTION__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__APPLIED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTION__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__STATUS = FaPackage.ABSTRACT_FUNCTION__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__FEATURES = FaPackage.ABSTRACT_FUNCTION__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__APPLIED_REQUIREMENTS = FaPackage.ABSTRACT_FUNCTION__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__CONTAINED_GENERIC_TRACES = FaPackage.ABSTRACT_FUNCTION__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__CONTAINED_REQUIREMENTS_TRACES = FaPackage.ABSTRACT_FUNCTION__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Functional Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OWNED_FUNCTIONAL_CHAINS = FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_CHAINS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__IS_ABSTRACT = FaPackage.ABSTRACT_FUNCTION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__IS_STATIC = FaPackage.ABSTRACT_FUNCTION__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__VISIBILITY = FaPackage.ABSTRACT_FUNCTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__TYPE = FaPackage.ABSTRACT_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__ORDERED = FaPackage.ABSTRACT_FUNCTION__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__UNIQUE = FaPackage.ABSTRACT_FUNCTION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__MIN_INCLUSIVE = FaPackage.ABSTRACT_FUNCTION__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__MAX_INCLUSIVE = FaPackage.ABSTRACT_FUNCTION__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OWNED_DEFAULT_VALUE = FaPackage.ABSTRACT_FUNCTION__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OWNED_MIN_VALUE = FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OWNED_MAX_VALUE = FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OWNED_NULL_VALUE = FaPackage.ABSTRACT_FUNCTION__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OWNED_MIN_CARD = FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OWNED_MIN_LENGTH = FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OWNED_MAX_CARD = FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OWNED_MAX_LENGTH = FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__AGGREGATION_KIND = FaPackage.ABSTRACT_FUNCTION__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__IS_DERIVED = FaPackage.ABSTRACT_FUNCTION__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__IS_READ_ONLY = FaPackage.ABSTRACT_FUNCTION__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__IS_PART_OF_KEY = FaPackage.ABSTRACT_FUNCTION__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OUTGOING = FaPackage.ABSTRACT_FUNCTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__INCOMING = FaPackage.ABSTRACT_FUNCTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__INPUTS = FaPackage.ABSTRACT_FUNCTION__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OUTPUTS = FaPackage.ABSTRACT_FUNCTION__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__KIND = FaPackage.ABSTRACT_FUNCTION__KIND;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__CONDITION = FaPackage.ABSTRACT_FUNCTION__CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Functional Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OWNED_FUNCTIONAL_EXCHANGES = FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Available In States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__AVAILABLE_IN_STATES = FaPackage.ABSTRACT_FUNCTION__AVAILABLE_IN_STATES;

	/**
	 * The feature id for the '<em><b>Linked State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__LINKED_STATE_MACHINE = FaPackage.ABSTRACT_FUNCTION__LINKED_STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>Owned Physical Function Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS = FaPackage.ABSTRACT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realized Logical Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS = FaPackage.ABSTRACT_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contained Physical Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION__CONTAINED_PHYSICAL_FUNCTIONS = FaPackage.ABSTRACT_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Physical Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_FEATURE_COUNT = FaPackage.ABSTRACT_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalFunctionPkgImpl <em>Physical Function Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalFunctionPkgImpl
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalFunctionPkg()
	 * @generated
	 */
	int PHYSICAL_FUNCTION_PKG = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__OWNED_EXTENSIONS = FaPackage.FUNCTION_PKG__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__ID = FaPackage.FUNCTION_PKG__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__SID = FaPackage.FUNCTION_PKG__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__OWNED_CONSTRAINTS = FaPackage.FUNCTION_PKG__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__NAME = FaPackage.FUNCTION_PKG__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__SUMMARY = FaPackage.FUNCTION_PKG__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__DESCRIPTION = FaPackage.FUNCTION_PKG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__REVIEW = FaPackage.FUNCTION_PKG__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__OWNED_PROPERTY_VALUES = FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__OWNED_ENUMERATION_PROPERTY_TYPES = FaPackage.FUNCTION_PKG__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__APPLIED_PROPERTY_VALUES = FaPackage.FUNCTION_PKG__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__OWNED_PROPERTY_VALUE_GROUPS = FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__APPLIED_PROPERTY_VALUE_GROUPS = FaPackage.FUNCTION_PKG__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__STATUS = FaPackage.FUNCTION_PKG__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__FEATURES = FaPackage.FUNCTION_PKG__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__APPLIED_REQUIREMENTS = FaPackage.FUNCTION_PKG__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__CONTAINED_GENERIC_TRACES = FaPackage.FUNCTION_PKG__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES = FaPackage.FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS = FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__OWNED_CATEGORIES = FaPackage.FUNCTION_PKG__OWNED_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Physical Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTIONS = FaPackage.FUNCTION_PKG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Physical Function Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTION_PKGS = FaPackage.FUNCTION_PKG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Physical Function Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FUNCTION_PKG_FEATURE_COUNT = FaPackage.FUNCTION_PKG_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.AbstractPhysicalComponentImpl <em>Abstract Physical Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.AbstractPhysicalComponentImpl
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getAbstractPhysicalComponent()
	 * @generated
	 */
	int ABSTRACT_PHYSICAL_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_EXTENSIONS = CsPackage.SYSTEM_COMPONENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__ID = CsPackage.SYSTEM_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__SID = CsPackage.SYSTEM_COMPONENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_CONSTRAINTS = CsPackage.SYSTEM_COMPONENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__NAME = CsPackage.SYSTEM_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__SUMMARY = CsPackage.SYSTEM_COMPONENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__DESCRIPTION = CsPackage.SYSTEM_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__REVIEW = CsPackage.SYSTEM_COMPONENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_PROPERTY_VALUES = CsPackage.SYSTEM_COMPONENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES = CsPackage.SYSTEM_COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__APPLIED_PROPERTY_VALUES = CsPackage.SYSTEM_COMPONENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_PROPERTY_VALUE_GROUPS = CsPackage.SYSTEM_COMPONENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS = CsPackage.SYSTEM_COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__STATUS = CsPackage.SYSTEM_COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__FEATURES = CsPackage.SYSTEM_COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__APPLIED_REQUIREMENTS = CsPackage.SYSTEM_COMPONENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_GENERIC_TRACES = CsPackage.SYSTEM_COMPONENT__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_REQUIREMENTS_TRACES = CsPackage.SYSTEM_COMPONENT__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGES = CsPackage.SYSTEM_COMPONENT__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CsPackage.SYSTEM_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG = CsPackage.SYSTEM_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG = CsPackage.SYSTEM_COMPONENT__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_DATA_PKG = CsPackage.SYSTEM_COMPONENT__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_STATE_MACHINES = CsPackage.SYSTEM_COMPONENT__OWNED_STATE_MACHINES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__ABSTRACT = CsPackage.SYSTEM_COMPONENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__SUPER = CsPackage.SYSTEM_COMPONENT__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__SUB = CsPackage.SYSTEM_COMPONENT__SUB;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_PROPERTIES = CsPackage.SYSTEM_COMPONENT__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_COMMUNICATION_LINKS = CsPackage.SYSTEM_COMPONENT__OWNED_COMMUNICATION_LINKS;

	/**
	 * The feature id for the '<em><b>Used Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__USED_INTERFACES = CsPackage.SYSTEM_COMPONENT__USED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACES = CsPackage.SYSTEM_COMPONENT__IMPLEMENTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Allocated Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__ALLOCATED_COMPONENTS = CsPackage.SYSTEM_COMPONENT__ALLOCATED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__PROVIDED_INTERFACES = CsPackage.SYSTEM_COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__REQUIRED_INTERFACES = CsPackage.SYSTEM_COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_COMPONENT_PORTS = CsPackage.SYSTEM_COMPONENT__CONTAINED_COMPONENT_PORTS;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_PARTS = CsPackage.SYSTEM_COMPONENT__CONTAINED_PARTS;

	/**
	 * The feature id for the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_PHYSICAL_PORTS = CsPackage.SYSTEM_COMPONENT__CONTAINED_PHYSICAL_PORTS;

	/**
	 * The feature id for the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_PHYSICAL_PATH = CsPackage.SYSTEM_COMPONENT__OWNED_PHYSICAL_PATH;

	/**
	 * The feature id for the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINKS = CsPackage.SYSTEM_COMPONENT__OWNED_PHYSICAL_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES = CsPackage.SYSTEM_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Data Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__DATA_COMPONENT = CsPackage.SYSTEM_COMPONENT__DATA_COMPONENT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__KIND = CsPackage.SYSTEM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__NATURE = CsPackage.SYSTEM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Deployment Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS = CsPackage.SYSTEM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Deployment Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT = CsPackage.SYSTEM_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Physical Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_COMPONENT_FEATURE_COUNT = CsPackage.SYSTEM_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentImpl <em>Physical Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentImpl
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalComponent()
	 * @generated
	 */
	int PHYSICAL_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_EXTENSIONS = ABSTRACT_PHYSICAL_COMPONENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__ID = ABSTRACT_PHYSICAL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__SID = ABSTRACT_PHYSICAL_COMPONENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_CONSTRAINTS = ABSTRACT_PHYSICAL_COMPONENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__NAME = ABSTRACT_PHYSICAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__SUMMARY = ABSTRACT_PHYSICAL_COMPONENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__DESCRIPTION = ABSTRACT_PHYSICAL_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__REVIEW = ABSTRACT_PHYSICAL_COMPONENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_PROPERTY_VALUES = ABSTRACT_PHYSICAL_COMPONENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES = ABSTRACT_PHYSICAL_COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__APPLIED_PROPERTY_VALUES = ABSTRACT_PHYSICAL_COMPONENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_PROPERTY_VALUE_GROUPS = ABSTRACT_PHYSICAL_COMPONENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS = ABSTRACT_PHYSICAL_COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__STATUS = ABSTRACT_PHYSICAL_COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__FEATURES = ABSTRACT_PHYSICAL_COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__APPLIED_REQUIREMENTS = ABSTRACT_PHYSICAL_COMPONENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__CONTAINED_GENERIC_TRACES = ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__CONTAINED_REQUIREMENTS_TRACES = ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGES = ABSTRACT_PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES = ABSTRACT_PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG = ABSTRACT_PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG = ABSTRACT_PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_DATA_PKG = ABSTRACT_PHYSICAL_COMPONENT__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_STATE_MACHINES = ABSTRACT_PHYSICAL_COMPONENT__OWNED_STATE_MACHINES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__ABSTRACT = ABSTRACT_PHYSICAL_COMPONENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__SUPER = ABSTRACT_PHYSICAL_COMPONENT__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__SUB = ABSTRACT_PHYSICAL_COMPONENT__SUB;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__CONTAINED_PROPERTIES = ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_COMMUNICATION_LINKS = ABSTRACT_PHYSICAL_COMPONENT__OWNED_COMMUNICATION_LINKS;

	/**
	 * The feature id for the '<em><b>Used Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__USED_INTERFACES = ABSTRACT_PHYSICAL_COMPONENT__USED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACES = ABSTRACT_PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Allocated Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__ALLOCATED_COMPONENTS = ABSTRACT_PHYSICAL_COMPONENT__ALLOCATED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__PROVIDED_INTERFACES = ABSTRACT_PHYSICAL_COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__REQUIRED_INTERFACES = ABSTRACT_PHYSICAL_COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__CONTAINED_COMPONENT_PORTS = ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_COMPONENT_PORTS;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__CONTAINED_PARTS = ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_PARTS;

	/**
	 * The feature id for the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__CONTAINED_PHYSICAL_PORTS = ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_PHYSICAL_PORTS;

	/**
	 * The feature id for the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_PHYSICAL_PATH = ABSTRACT_PHYSICAL_COMPONENT__OWNED_PHYSICAL_PATH;

	/**
	 * The feature id for the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINKS = ABSTRACT_PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES = ABSTRACT_PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Data Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__DATA_COMPONENT = ABSTRACT_PHYSICAL_COMPONENT__DATA_COMPONENT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__KIND = ABSTRACT_PHYSICAL_COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__NATURE = ABSTRACT_PHYSICAL_COMPONENT__NATURE;

	/**
	 * The feature id for the '<em><b>Owned Deployment Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS = ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Deployment Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT = ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT;

	/**
	 * The feature id for the '<em><b>Owned Physical Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS = ABSTRACT_PHYSICAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Physical Component Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS = ABSTRACT_PHYSICAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realized Logical Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS = ABSTRACT_PHYSICAL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allocated Physical Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS = ABSTRACT_PHYSICAL_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Deployed Physical Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__DEPLOYED_PHYSICAL_COMPONENTS = ABSTRACT_PHYSICAL_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Physical Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_FEATURE_COUNT = ABSTRACT_PHYSICAL_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalActorPkgImpl <em>Physical Actor Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalActorPkgImpl
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalActorPkg()
	 * @generated
	 */
	int PHYSICAL_ACTOR_PKG = 5;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__OWNED_EXTENSIONS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__ID = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__SID = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__OWNED_CONSTRAINTS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__NAME = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__SUMMARY = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__DESCRIPTION = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__REVIEW = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__OWNED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__OWNED_ENUMERATION_PROPERTY_TYPES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__APPLIED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__OWNED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__APPLIED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__STATUS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__FEATURES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__APPLIED_REQUIREMENTS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__CONTAINED_GENERIC_TRACES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__CONTAINED_REQUIREMENTS_TRACES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__OWNED_PROPERTY_VALUE_PKGS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__OWNED_COMPONENT_EXCHANGES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__OWNED_COMPONENT_EXCHANGE_CATEGORIES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Physical Actor Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__OWNED_PHYSICAL_ACTOR_PKGS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Physical Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG__OWNED_PHYSICAL_ACTORS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Physical Actor Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_PKG_FEATURE_COUNT = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentPkgImpl <em>Physical Component Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentPkgImpl
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalComponentPkg()
	 * @generated
	 */
	int PHYSICAL_COMPONENT_PKG = 6;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__OWNED_EXTENSIONS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__ID = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__SID = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__OWNED_CONSTRAINTS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__NAME = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__SUMMARY = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__DESCRIPTION = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__REVIEW = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__OWNED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__OWNED_ENUMERATION_PROPERTY_TYPES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__APPLIED_PROPERTY_VALUES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__OWNED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__APPLIED_PROPERTY_VALUE_GROUPS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__STATUS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__FEATURES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__APPLIED_REQUIREMENTS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__CONTAINED_GENERIC_TRACES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__CONTAINED_REQUIREMENTS_TRACES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__OWNED_PROPERTY_VALUE_PKGS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__OWNED_COMPONENT_EXCHANGES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__OWNED_COMPONENT_EXCHANGE_CATEGORIES = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__VISIBILITY = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__OWNED_ASSOCIATIONS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__OWNED_COMPONENTS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Physical Component Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__OWNED_PHYSICAL_COMPONENT_PKGS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Key Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG__OWNED_KEY_PARTS = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Physical Component Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_PKG_FEATURE_COUNT = FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalActorImpl <em>Physical Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalActorImpl
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalActor()
	 * @generated
	 */
	int PHYSICAL_ACTOR = 7;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_EXTENSIONS = ABSTRACT_PHYSICAL_COMPONENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__ID = ABSTRACT_PHYSICAL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__SID = ABSTRACT_PHYSICAL_COMPONENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_CONSTRAINTS = ABSTRACT_PHYSICAL_COMPONENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__NAME = ABSTRACT_PHYSICAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__SUMMARY = ABSTRACT_PHYSICAL_COMPONENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__DESCRIPTION = ABSTRACT_PHYSICAL_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__REVIEW = ABSTRACT_PHYSICAL_COMPONENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_PROPERTY_VALUES = ABSTRACT_PHYSICAL_COMPONENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_ENUMERATION_PROPERTY_TYPES = ABSTRACT_PHYSICAL_COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__APPLIED_PROPERTY_VALUES = ABSTRACT_PHYSICAL_COMPONENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_PROPERTY_VALUE_GROUPS = ABSTRACT_PHYSICAL_COMPONENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__APPLIED_PROPERTY_VALUE_GROUPS = ABSTRACT_PHYSICAL_COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__STATUS = ABSTRACT_PHYSICAL_COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__FEATURES = ABSTRACT_PHYSICAL_COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__APPLIED_REQUIREMENTS = ABSTRACT_PHYSICAL_COMPONENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__CONTAINED_GENERIC_TRACES = ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__CONTAINED_REQUIREMENTS_TRACES = ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_COMPONENT_EXCHANGES = ABSTRACT_PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_COMPONENT_EXCHANGE_CATEGORIES = ABSTRACT_PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_ABSTRACT_CAPABILITY_PKG = ABSTRACT_PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_INTERFACE_PKG = ABSTRACT_PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_DATA_PKG = ABSTRACT_PHYSICAL_COMPONENT__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_STATE_MACHINES = ABSTRACT_PHYSICAL_COMPONENT__OWNED_STATE_MACHINES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__ABSTRACT = ABSTRACT_PHYSICAL_COMPONENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__SUPER = ABSTRACT_PHYSICAL_COMPONENT__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__SUB = ABSTRACT_PHYSICAL_COMPONENT__SUB;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__CONTAINED_PROPERTIES = ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_COMMUNICATION_LINKS = ABSTRACT_PHYSICAL_COMPONENT__OWNED_COMMUNICATION_LINKS;

	/**
	 * The feature id for the '<em><b>Used Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__USED_INTERFACES = ABSTRACT_PHYSICAL_COMPONENT__USED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__IMPLEMENTED_INTERFACES = ABSTRACT_PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Allocated Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__ALLOCATED_COMPONENTS = ABSTRACT_PHYSICAL_COMPONENT__ALLOCATED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__PROVIDED_INTERFACES = ABSTRACT_PHYSICAL_COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__REQUIRED_INTERFACES = ABSTRACT_PHYSICAL_COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__CONTAINED_COMPONENT_PORTS = ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_COMPONENT_PORTS;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__CONTAINED_PARTS = ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_PARTS;

	/**
	 * The feature id for the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__CONTAINED_PHYSICAL_PORTS = ABSTRACT_PHYSICAL_COMPONENT__CONTAINED_PHYSICAL_PORTS;

	/**
	 * The feature id for the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_PHYSICAL_PATH = ABSTRACT_PHYSICAL_COMPONENT__OWNED_PHYSICAL_PATH;

	/**
	 * The feature id for the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_PHYSICAL_LINKS = ABSTRACT_PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_PHYSICAL_LINK_CATEGORIES = ABSTRACT_PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Data Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__DATA_COMPONENT = ABSTRACT_PHYSICAL_COMPONENT__DATA_COMPONENT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__KIND = ABSTRACT_PHYSICAL_COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__NATURE = ABSTRACT_PHYSICAL_COMPONENT__NATURE;

	/**
	 * The feature id for the '<em><b>Owned Deployment Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_DEPLOYMENT_LINKS = ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Deployment Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__OWNED_DEPLOYMENT_ASPECT = ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT;

	/**
	 * The feature id for the '<em><b>Allocated Physical Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__ALLOCATED_PHYSICAL_FUNCTIONS = ABSTRACT_PHYSICAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realized Logical Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__REALIZED_LOGICAL_ACTORS = ABSTRACT_PHYSICAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deployed Physical Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR__DEPLOYED_PHYSICAL_COMPONENTS = ABSTRACT_PHYSICAL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Physical Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTOR_FEATURE_COUNT = ABSTRACT_PHYSICAL_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalNodeImpl <em>Physical Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalNodeImpl
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalNode()
	 * @generated
	 */
	int PHYSICAL_NODE = 8;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_EXTENSIONS = PHYSICAL_COMPONENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__ID = PHYSICAL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__SID = PHYSICAL_COMPONENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_CONSTRAINTS = PHYSICAL_COMPONENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__NAME = PHYSICAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__SUMMARY = PHYSICAL_COMPONENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__DESCRIPTION = PHYSICAL_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__REVIEW = PHYSICAL_COMPONENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_PROPERTY_VALUES = PHYSICAL_COMPONENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_ENUMERATION_PROPERTY_TYPES = PHYSICAL_COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__APPLIED_PROPERTY_VALUES = PHYSICAL_COMPONENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_PROPERTY_VALUE_GROUPS = PHYSICAL_COMPONENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__APPLIED_PROPERTY_VALUE_GROUPS = PHYSICAL_COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__STATUS = PHYSICAL_COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__FEATURES = PHYSICAL_COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__APPLIED_REQUIREMENTS = PHYSICAL_COMPONENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__CONTAINED_GENERIC_TRACES = PHYSICAL_COMPONENT__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__CONTAINED_REQUIREMENTS_TRACES = PHYSICAL_COMPONENT__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_COMPONENT_EXCHANGES = PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_COMPONENT_EXCHANGE_CATEGORIES = PHYSICAL_COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_ABSTRACT_CAPABILITY_PKG = PHYSICAL_COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_INTERFACE_PKG = PHYSICAL_COMPONENT__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_DATA_PKG = PHYSICAL_COMPONENT__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_STATE_MACHINES = PHYSICAL_COMPONENT__OWNED_STATE_MACHINES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__ABSTRACT = PHYSICAL_COMPONENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__SUPER = PHYSICAL_COMPONENT__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__SUB = PHYSICAL_COMPONENT__SUB;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__CONTAINED_PROPERTIES = PHYSICAL_COMPONENT__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_COMMUNICATION_LINKS = PHYSICAL_COMPONENT__OWNED_COMMUNICATION_LINKS;

	/**
	 * The feature id for the '<em><b>Used Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__USED_INTERFACES = PHYSICAL_COMPONENT__USED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__IMPLEMENTED_INTERFACES = PHYSICAL_COMPONENT__IMPLEMENTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Allocated Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__ALLOCATED_COMPONENTS = PHYSICAL_COMPONENT__ALLOCATED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__PROVIDED_INTERFACES = PHYSICAL_COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__REQUIRED_INTERFACES = PHYSICAL_COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__CONTAINED_COMPONENT_PORTS = PHYSICAL_COMPONENT__CONTAINED_COMPONENT_PORTS;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__CONTAINED_PARTS = PHYSICAL_COMPONENT__CONTAINED_PARTS;

	/**
	 * The feature id for the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__CONTAINED_PHYSICAL_PORTS = PHYSICAL_COMPONENT__CONTAINED_PHYSICAL_PORTS;

	/**
	 * The feature id for the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_PHYSICAL_PATH = PHYSICAL_COMPONENT__OWNED_PHYSICAL_PATH;

	/**
	 * The feature id for the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_PHYSICAL_LINKS = PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_PHYSICAL_LINK_CATEGORIES = PHYSICAL_COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Data Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__DATA_COMPONENT = PHYSICAL_COMPONENT__DATA_COMPONENT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__KIND = PHYSICAL_COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__NATURE = PHYSICAL_COMPONENT__NATURE;

	/**
	 * The feature id for the '<em><b>Owned Deployment Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_DEPLOYMENT_LINKS = PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Deployment Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_DEPLOYMENT_ASPECT = PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT;

	/**
	 * The feature id for the '<em><b>Owned Physical Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_PHYSICAL_COMPONENTS = PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Owned Physical Component Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OWNED_PHYSICAL_COMPONENT_PKGS = PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS;

	/**
	 * The feature id for the '<em><b>Realized Logical Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__REALIZED_LOGICAL_COMPONENTS = PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Allocated Physical Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__ALLOCATED_PHYSICAL_FUNCTIONS = PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Deployed Physical Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__DEPLOYED_PHYSICAL_COMPONENTS = PHYSICAL_COMPONENT__DEPLOYED_PHYSICAL_COMPONENTS;

	/**
	 * The number of structural features of the '<em>Physical Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE_FEATURE_COUNT = PHYSICAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalContextImpl <em>Physical Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalContextImpl
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalContext()
	 * @generated
	 */
	int PHYSICAL_CONTEXT = 9;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__OWNED_EXTENSIONS = CsPackage.COMPONENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__ID = CsPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__SID = CsPackage.COMPONENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__OWNED_CONSTRAINTS = CsPackage.COMPONENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__NAME = CsPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__SUMMARY = CsPackage.COMPONENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__DESCRIPTION = CsPackage.COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__REVIEW = CsPackage.COMPONENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__OWNED_PROPERTY_VALUES = CsPackage.COMPONENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__OWNED_ENUMERATION_PROPERTY_TYPES = CsPackage.COMPONENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__APPLIED_PROPERTY_VALUES = CsPackage.COMPONENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__OWNED_PROPERTY_VALUE_GROUPS = CsPackage.COMPONENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__APPLIED_PROPERTY_VALUE_GROUPS = CsPackage.COMPONENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__STATUS = CsPackage.COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__FEATURES = CsPackage.COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__APPLIED_REQUIREMENTS = CsPackage.COMPONENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__CONTAINED_GENERIC_TRACES = CsPackage.COMPONENT__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__CONTAINED_REQUIREMENTS_TRACES = CsPackage.COMPONENT__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__OWNED_COMPONENT_EXCHANGES = CsPackage.COMPONENT__OWNED_COMPONENT_EXCHANGES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CsPackage.COMPONENT__OWNED_COMPONENT_EXCHANGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__OWNED_ABSTRACT_CAPABILITY_PKG = CsPackage.COMPONENT__OWNED_ABSTRACT_CAPABILITY_PKG;

	/**
	 * The feature id for the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__OWNED_INTERFACE_PKG = CsPackage.COMPONENT__OWNED_INTERFACE_PKG;

	/**
	 * The feature id for the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__OWNED_DATA_PKG = CsPackage.COMPONENT__OWNED_DATA_PKG;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__OWNED_STATE_MACHINES = CsPackage.COMPONENT__OWNED_STATE_MACHINES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__ABSTRACT = CsPackage.COMPONENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__SUPER = CsPackage.COMPONENT__SUPER;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__SUB = CsPackage.COMPONENT__SUB;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__CONTAINED_PROPERTIES = CsPackage.COMPONENT__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__OWNED_COMMUNICATION_LINKS = CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS;

	/**
	 * The feature id for the '<em><b>Used Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__USED_INTERFACES = CsPackage.COMPONENT__USED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Implemented Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__IMPLEMENTED_INTERFACES = CsPackage.COMPONENT__IMPLEMENTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Allocated Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__ALLOCATED_COMPONENTS = CsPackage.COMPONENT__ALLOCATED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__PROVIDED_INTERFACES = CsPackage.COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__REQUIRED_INTERFACES = CsPackage.COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Contained Component Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__CONTAINED_COMPONENT_PORTS = CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__CONTAINED_PARTS = CsPackage.COMPONENT__CONTAINED_PARTS;

	/**
	 * The feature id for the '<em><b>Contained Physical Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__CONTAINED_PHYSICAL_PORTS = CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS;

	/**
	 * The feature id for the '<em><b>Owned Physical Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__OWNED_PHYSICAL_PATH = CsPackage.COMPONENT__OWNED_PHYSICAL_PATH;

	/**
	 * The feature id for the '<em><b>Owned Physical Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__OWNED_PHYSICAL_LINKS = CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS;

	/**
	 * The feature id for the '<em><b>Owned Physical Link Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__OWNED_PHYSICAL_LINK_CATEGORIES = CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES;

	/**
	 * The number of structural features of the '<em>Physical Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT_FEATURE_COUNT = CsPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponentKind <em>Physical Component Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalComponentKind
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalComponentKind()
	 * @generated
	 */
	int PHYSICAL_COMPONENT_KIND = 10;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponentNature <em>Physical Component Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalComponentNature
	 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalComponentNature()
	 * @generated
	 */
	int PHYSICAL_COMPONENT_NATURE = 11;


	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture <em>Physical Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Architecture</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture
	 * @generated
	 */
	EClass getPhysicalArchitecture();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedPhysicalContext <em>Owned Physical Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Physical Context</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedPhysicalContext()
	 * @see #getPhysicalArchitecture()
	 * @generated
	 */
	EReference getPhysicalArchitecture_OwnedPhysicalContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedPhysicalComponent <em>Owned Physical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Physical Component</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedPhysicalComponent()
	 * @see #getPhysicalArchitecture()
	 * @generated
	 */
	EReference getPhysicalArchitecture_OwnedPhysicalComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedPhysicalComponentPkg <em>Owned Physical Component Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Physical Component Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedPhysicalComponentPkg()
	 * @see #getPhysicalArchitecture()
	 * @generated
	 */
	EReference getPhysicalArchitecture_OwnedPhysicalComponentPkg();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedPhysicalActorPkg <em>Owned Physical Actor Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Physical Actor Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedPhysicalActorPkg()
	 * @see #getPhysicalArchitecture()
	 * @generated
	 */
	EReference getPhysicalArchitecture_OwnedPhysicalActorPkg();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Capability Realization Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getContainedCapabilityRealizationPkg()
	 * @see #getPhysicalArchitecture()
	 * @generated
	 */
	EReference getPhysicalArchitecture_ContainedCapabilityRealizationPkg();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getContainedPhysicalFunctionPkg <em>Contained Physical Function Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Physical Function Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getContainedPhysicalFunctionPkg()
	 * @see #getPhysicalArchitecture()
	 * @generated
	 */
	EReference getPhysicalArchitecture_ContainedPhysicalFunctionPkg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedDeployments <em>Owned Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Deployments</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedDeployments()
	 * @see #getPhysicalArchitecture()
	 * @generated
	 */
	EReference getPhysicalArchitecture_OwnedDeployments();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getAllocatedLogicalArchitectures <em>Allocated Logical Architectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Logical Architectures</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getAllocatedLogicalArchitectures()
	 * @see #getPhysicalArchitecture()
	 * @generated
	 */
	EReference getPhysicalArchitecture_AllocatedLogicalArchitectures();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalFunction <em>Physical Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Function</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalFunction
	 * @generated
	 */
	EClass getPhysicalFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalFunction#getOwnedPhysicalFunctionPkgs <em>Owned Physical Function Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Physical Function Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalFunction#getOwnedPhysicalFunctionPkgs()
	 * @see #getPhysicalFunction()
	 * @generated
	 */
	EReference getPhysicalFunction_OwnedPhysicalFunctionPkgs();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalFunction#getRealizedLogicalFunctions <em>Realized Logical Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Logical Functions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalFunction#getRealizedLogicalFunctions()
	 * @see #getPhysicalFunction()
	 * @generated
	 */
	EReference getPhysicalFunction_RealizedLogicalFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalFunction#getContainedPhysicalFunctions <em>Contained Physical Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Physical Functions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalFunction#getContainedPhysicalFunctions()
	 * @see #getPhysicalFunction()
	 * @generated
	 */
	EReference getPhysicalFunction_ContainedPhysicalFunctions();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalFunctionPkg <em>Physical Function Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Function Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalFunctionPkg
	 * @generated
	 */
	EClass getPhysicalFunctionPkg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalFunctionPkg#getOwnedPhysicalFunctions <em>Owned Physical Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Physical Functions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalFunctionPkg#getOwnedPhysicalFunctions()
	 * @see #getPhysicalFunctionPkg()
	 * @generated
	 */
	EReference getPhysicalFunctionPkg_OwnedPhysicalFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalFunctionPkg#getOwnedPhysicalFunctionPkgs <em>Owned Physical Function Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Physical Function Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalFunctionPkg#getOwnedPhysicalFunctionPkgs()
	 * @see #getPhysicalFunctionPkg()
	 * @generated
	 */
	EReference getPhysicalFunctionPkg_OwnedPhysicalFunctionPkgs();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.pa.AbstractPhysicalComponent <em>Abstract Physical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Physical Component</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.AbstractPhysicalComponent
	 * @generated
	 */
	EClass getAbstractPhysicalComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.pa.AbstractPhysicalComponent#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.AbstractPhysicalComponent#getKind()
	 * @see #getAbstractPhysicalComponent()
	 * @generated
	 */
	EAttribute getAbstractPhysicalComponent_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.pa.AbstractPhysicalComponent#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.AbstractPhysicalComponent#getNature()
	 * @see #getAbstractPhysicalComponent()
	 * @generated
	 */
	EAttribute getAbstractPhysicalComponent_Nature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.pa.AbstractPhysicalComponent#getOwnedDeploymentLinks <em>Owned Deployment Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Deployment Links</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.AbstractPhysicalComponent#getOwnedDeploymentLinks()
	 * @see #getAbstractPhysicalComponent()
	 * @generated
	 */
	EReference getAbstractPhysicalComponent_OwnedDeploymentLinks();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.pa.AbstractPhysicalComponent#getOwnedDeploymentAspect <em>Owned Deployment Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Deployment Aspect</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.AbstractPhysicalComponent#getOwnedDeploymentAspect()
	 * @see #getAbstractPhysicalComponent()
	 * @generated
	 */
	EReference getAbstractPhysicalComponent_OwnedDeploymentAspect();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponent <em>Physical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Component</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalComponent
	 * @generated
	 */
	EClass getPhysicalComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponent#getOwnedPhysicalComponents <em>Owned Physical Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Physical Components</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalComponent#getOwnedPhysicalComponents()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EReference getPhysicalComponent_OwnedPhysicalComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponent#getOwnedPhysicalComponentPkgs <em>Owned Physical Component Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Physical Component Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalComponent#getOwnedPhysicalComponentPkgs()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EReference getPhysicalComponent_OwnedPhysicalComponentPkgs();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponent#getRealizedLogicalComponents <em>Realized Logical Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Logical Components</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalComponent#getRealizedLogicalComponents()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EReference getPhysicalComponent_RealizedLogicalComponents();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponent#getAllocatedPhysicalFunctions <em>Allocated Physical Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Physical Functions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalComponent#getAllocatedPhysicalFunctions()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EReference getPhysicalComponent_AllocatedPhysicalFunctions();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponent#getDeployedPhysicalComponents <em>Deployed Physical Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployed Physical Components</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalComponent#getDeployedPhysicalComponents()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EReference getPhysicalComponent_DeployedPhysicalComponents();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalActorPkg <em>Physical Actor Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Actor Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalActorPkg
	 * @generated
	 */
	EClass getPhysicalActorPkg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalActorPkg#getOwnedPhysicalActorPkgs <em>Owned Physical Actor Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Physical Actor Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalActorPkg#getOwnedPhysicalActorPkgs()
	 * @see #getPhysicalActorPkg()
	 * @generated
	 */
	EReference getPhysicalActorPkg_OwnedPhysicalActorPkgs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalActorPkg#getOwnedPhysicalActors <em>Owned Physical Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Physical Actors</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalActorPkg#getOwnedPhysicalActors()
	 * @see #getPhysicalActorPkg()
	 * @generated
	 */
	EReference getPhysicalActorPkg_OwnedPhysicalActors();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg <em>Physical Component Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Component Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg
	 * @generated
	 */
	EClass getPhysicalComponentPkg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg#getOwnedComponents <em>Owned Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Components</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg#getOwnedComponents()
	 * @see #getPhysicalComponentPkg()
	 * @generated
	 */
	EReference getPhysicalComponentPkg_OwnedComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg#getOwnedPhysicalComponentPkgs <em>Owned Physical Component Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Physical Component Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg#getOwnedPhysicalComponentPkgs()
	 * @see #getPhysicalComponentPkg()
	 * @generated
	 */
	EReference getPhysicalComponentPkg_OwnedPhysicalComponentPkgs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg#getOwnedKeyParts <em>Owned Key Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Key Parts</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg#getOwnedKeyParts()
	 * @see #getPhysicalComponentPkg()
	 * @generated
	 */
	EReference getPhysicalComponentPkg_OwnedKeyParts();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalActor <em>Physical Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Actor</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalActor
	 * @generated
	 */
	EClass getPhysicalActor();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalActor#getAllocatedPhysicalFunctions <em>Allocated Physical Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Physical Functions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalActor#getAllocatedPhysicalFunctions()
	 * @see #getPhysicalActor()
	 * @generated
	 */
	EReference getPhysicalActor_AllocatedPhysicalFunctions();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalActor#getRealizedLogicalActors <em>Realized Logical Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Logical Actors</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalActor#getRealizedLogicalActors()
	 * @see #getPhysicalActor()
	 * @generated
	 */
	EReference getPhysicalActor_RealizedLogicalActors();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalActor#getDeployedPhysicalComponents <em>Deployed Physical Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployed Physical Components</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalActor#getDeployedPhysicalComponents()
	 * @see #getPhysicalActor()
	 * @generated
	 */
	EReference getPhysicalActor_DeployedPhysicalComponents();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalNode <em>Physical Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Node</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalNode
	 * @generated
	 */
	EClass getPhysicalNode();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalContext <em>Physical Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Context</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalContext
	 * @generated
	 */
	EClass getPhysicalContext();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponentKind <em>Physical Component Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Physical Component Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalComponentKind
	 * @generated
	 */
	EEnum getPhysicalComponentKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponentNature <em>Physical Component Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Physical Component Nature</em>'.
	 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalComponentNature
	 * @generated
	 */
	EEnum getPhysicalComponentNature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PaFactory getPaFactory();

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
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalArchitectureImpl <em>Physical Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalArchitectureImpl
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalArchitecture()
		 * @generated
		 */
		EClass PHYSICAL_ARCHITECTURE = eINSTANCE.getPhysicalArchitecture();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT = eINSTANCE.getPhysicalArchitecture_OwnedPhysicalContext();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT = eINSTANCE.getPhysicalArchitecture_OwnedPhysicalComponent();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Component Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG = eINSTANCE.getPhysicalArchitecture_OwnedPhysicalComponentPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Actor Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG = eINSTANCE.getPhysicalArchitecture_OwnedPhysicalActorPkg();

		/**
		 * The meta object literal for the '<em><b>Contained Capability Realization Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG = eINSTANCE.getPhysicalArchitecture_ContainedCapabilityRealizationPkg();

		/**
		 * The meta object literal for the '<em><b>Contained Physical Function Pkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG = eINSTANCE.getPhysicalArchitecture_ContainedPhysicalFunctionPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Deployments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS = eINSTANCE.getPhysicalArchitecture_OwnedDeployments();

		/**
		 * The meta object literal for the '<em><b>Allocated Logical Architectures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES = eINSTANCE.getPhysicalArchitecture_AllocatedLogicalArchitectures();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalFunctionImpl <em>Physical Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalFunctionImpl
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalFunction()
		 * @generated
		 */
		EClass PHYSICAL_FUNCTION = eINSTANCE.getPhysicalFunction();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Function Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS = eINSTANCE.getPhysicalFunction_OwnedPhysicalFunctionPkgs();

		/**
		 * The meta object literal for the '<em><b>Realized Logical Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS = eINSTANCE.getPhysicalFunction_RealizedLogicalFunctions();

		/**
		 * The meta object literal for the '<em><b>Contained Physical Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_FUNCTION__CONTAINED_PHYSICAL_FUNCTIONS = eINSTANCE.getPhysicalFunction_ContainedPhysicalFunctions();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalFunctionPkgImpl <em>Physical Function Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalFunctionPkgImpl
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalFunctionPkg()
		 * @generated
		 */
		EClass PHYSICAL_FUNCTION_PKG = eINSTANCE.getPhysicalFunctionPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTIONS = eINSTANCE.getPhysicalFunctionPkg_OwnedPhysicalFunctions();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Function Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTION_PKGS = eINSTANCE.getPhysicalFunctionPkg_OwnedPhysicalFunctionPkgs();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.AbstractPhysicalComponentImpl <em>Abstract Physical Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.AbstractPhysicalComponentImpl
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getAbstractPhysicalComponent()
		 * @generated
		 */
		EClass ABSTRACT_PHYSICAL_COMPONENT = eINSTANCE.getAbstractPhysicalComponent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PHYSICAL_COMPONENT__KIND = eINSTANCE.getAbstractPhysicalComponent_Kind();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PHYSICAL_COMPONENT__NATURE = eINSTANCE.getAbstractPhysicalComponent_Nature();

		/**
		 * The meta object literal for the '<em><b>Owned Deployment Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS = eINSTANCE.getAbstractPhysicalComponent_OwnedDeploymentLinks();

		/**
		 * The meta object literal for the '<em><b>Owned Deployment Aspect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT = eINSTANCE.getAbstractPhysicalComponent_OwnedDeploymentAspect();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentImpl <em>Physical Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentImpl
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalComponent()
		 * @generated
		 */
		EClass PHYSICAL_COMPONENT = eINSTANCE.getPhysicalComponent();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS = eINSTANCE.getPhysicalComponent_OwnedPhysicalComponents();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Component Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS = eINSTANCE.getPhysicalComponent_OwnedPhysicalComponentPkgs();

		/**
		 * The meta object literal for the '<em><b>Realized Logical Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS = eINSTANCE.getPhysicalComponent_RealizedLogicalComponents();

		/**
		 * The meta object literal for the '<em><b>Allocated Physical Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS = eINSTANCE.getPhysicalComponent_AllocatedPhysicalFunctions();

		/**
		 * The meta object literal for the '<em><b>Deployed Physical Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_COMPONENT__DEPLOYED_PHYSICAL_COMPONENTS = eINSTANCE.getPhysicalComponent_DeployedPhysicalComponents();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalActorPkgImpl <em>Physical Actor Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalActorPkgImpl
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalActorPkg()
		 * @generated
		 */
		EClass PHYSICAL_ACTOR_PKG = eINSTANCE.getPhysicalActorPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Actor Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ACTOR_PKG__OWNED_PHYSICAL_ACTOR_PKGS = eINSTANCE.getPhysicalActorPkg_OwnedPhysicalActorPkgs();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ACTOR_PKG__OWNED_PHYSICAL_ACTORS = eINSTANCE.getPhysicalActorPkg_OwnedPhysicalActors();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentPkgImpl <em>Physical Component Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentPkgImpl
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalComponentPkg()
		 * @generated
		 */
		EClass PHYSICAL_COMPONENT_PKG = eINSTANCE.getPhysicalComponentPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_COMPONENT_PKG__OWNED_COMPONENTS = eINSTANCE.getPhysicalComponentPkg_OwnedComponents();

		/**
		 * The meta object literal for the '<em><b>Owned Physical Component Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_COMPONENT_PKG__OWNED_PHYSICAL_COMPONENT_PKGS = eINSTANCE.getPhysicalComponentPkg_OwnedPhysicalComponentPkgs();

		/**
		 * The meta object literal for the '<em><b>Owned Key Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_COMPONENT_PKG__OWNED_KEY_PARTS = eINSTANCE.getPhysicalComponentPkg_OwnedKeyParts();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalActorImpl <em>Physical Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalActorImpl
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalActor()
		 * @generated
		 */
		EClass PHYSICAL_ACTOR = eINSTANCE.getPhysicalActor();

		/**
		 * The meta object literal for the '<em><b>Allocated Physical Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ACTOR__ALLOCATED_PHYSICAL_FUNCTIONS = eINSTANCE.getPhysicalActor_AllocatedPhysicalFunctions();

		/**
		 * The meta object literal for the '<em><b>Realized Logical Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ACTOR__REALIZED_LOGICAL_ACTORS = eINSTANCE.getPhysicalActor_RealizedLogicalActors();

		/**
		 * The meta object literal for the '<em><b>Deployed Physical Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ACTOR__DEPLOYED_PHYSICAL_COMPONENTS = eINSTANCE.getPhysicalActor_DeployedPhysicalComponents();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalNodeImpl <em>Physical Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalNodeImpl
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalNode()
		 * @generated
		 */
		EClass PHYSICAL_NODE = eINSTANCE.getPhysicalNode();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalContextImpl <em>Physical Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PhysicalContextImpl
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalContext()
		 * @generated
		 */
		EClass PHYSICAL_CONTEXT = eINSTANCE.getPhysicalContext();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponentKind <em>Physical Component Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalComponentKind
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalComponentKind()
		 * @generated
		 */
		EEnum PHYSICAL_COMPONENT_KIND = eINSTANCE.getPhysicalComponentKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponentNature <em>Physical Component Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.pa.PhysicalComponentNature
		 * @see org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl#getPhysicalComponentNature()
		 * @generated
		 */
		EEnum PHYSICAL_COMPONENT_NATURE = eINSTANCE.getPhysicalComponentNature();

	}

} //PaPackage
