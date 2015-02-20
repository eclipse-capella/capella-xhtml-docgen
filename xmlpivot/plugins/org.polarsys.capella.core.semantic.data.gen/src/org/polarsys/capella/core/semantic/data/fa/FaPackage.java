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

package org.polarsys.capella.core.semantic.data.fa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.core.semantic.data.behavior.BehaviorPackage;

import org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage;

import org.polarsys.capella.core.semantic.data.information.InformationPackage;

import org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage;

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
 * @see org.polarsys.capella.core.semantic.data.fa.FaFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/capella/xmlpivot sourceNsURI='http://www.polarsys.org/capella/core/fa/0.8.0'"
 * @generated
 */
public interface FaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/capella/core/fa/0.8.0/semantic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.polarsys.capella.core.data.fa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FaPackage eINSTANCE = org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalArchitectureImpl <em>Abstract Functional Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalArchitectureImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getAbstractFunctionalArchitecture()
	 * @generated
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_EXTENSIONS = CapellacorePackage.STRUCTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__ID = CapellacorePackage.STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__SID = CapellacorePackage.STRUCTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_CONSTRAINTS = CapellacorePackage.STRUCTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__NAME = CapellacorePackage.STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__SUMMARY = CapellacorePackage.STRUCTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__DESCRIPTION = CapellacorePackage.STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__REVIEW = CapellacorePackage.STRUCTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_PROPERTY_VALUES = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.STRUCTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__APPLIED_PROPERTY_VALUES = CapellacorePackage.STRUCTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.STRUCTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__STATUS = CapellacorePackage.STRUCTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__FEATURES = CapellacorePackage.STRUCTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__APPLIED_REQUIREMENTS = CapellacorePackage.STRUCTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__CONTAINED_GENERIC_TRACES = CapellacorePackage.STRUCTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__CONTAINED_REQUIREMENTS_TRACES = CapellacorePackage.STRUCTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Functional Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_ARCHITECTURE_FEATURE_COUNT = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalStructureImpl <em>Abstract Functional Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalStructureImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getAbstractFunctionalStructure()
	 * @generated
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_EXTENSIONS = CapellacorePackage.STRUCTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__ID = CapellacorePackage.STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__SID = CapellacorePackage.STRUCTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_CONSTRAINTS = CapellacorePackage.STRUCTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__NAME = CapellacorePackage.STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__SUMMARY = CapellacorePackage.STRUCTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__DESCRIPTION = CapellacorePackage.STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__REVIEW = CapellacorePackage.STRUCTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_PROPERTY_VALUES = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.STRUCTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__APPLIED_PROPERTY_VALUES = CapellacorePackage.STRUCTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.STRUCTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__STATUS = CapellacorePackage.STRUCTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__FEATURES = CapellacorePackage.STRUCTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__APPLIED_REQUIREMENTS = CapellacorePackage.STRUCTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__CONTAINED_GENERIC_TRACES = CapellacorePackage.STRUCTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__CONTAINED_REQUIREMENTS_TRACES = CapellacorePackage.STRUCTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_PROPERTY_VALUE_PKGS = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGES = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Functional Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_STRUCTURE_FEATURE_COUNT = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalBlockImpl <em>Abstract Functional Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalBlockImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getAbstractFunctionalBlock()
	 * @generated
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__OWNED_EXTENSIONS = CapellacorePackage.TYPE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__ID = CapellacorePackage.TYPE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__SID = CapellacorePackage.TYPE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__OWNED_CONSTRAINTS = CapellacorePackage.TYPE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__NAME = CapellacorePackage.TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__SUMMARY = CapellacorePackage.TYPE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__DESCRIPTION = CapellacorePackage.TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__REVIEW = CapellacorePackage.TYPE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__OWNED_PROPERTY_VALUES = CapellacorePackage.TYPE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.TYPE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__APPLIED_PROPERTY_VALUES = CapellacorePackage.TYPE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.TYPE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.TYPE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__STATUS = CapellacorePackage.TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__FEATURES = CapellacorePackage.TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__APPLIED_REQUIREMENTS = CapellacorePackage.TYPE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__CONTAINED_GENERIC_TRACES = CapellacorePackage.TYPE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__CONTAINED_REQUIREMENTS_TRACES = CapellacorePackage.TYPE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGES = CapellacorePackage.TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES = CapellacorePackage.TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Functional Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_BLOCK_FEATURE_COUNT = CapellacorePackage.TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionPkgImpl <em>Function Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FunctionPkgImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionPkg()
	 * @generated
	 */
	int FUNCTION_PKG = 3;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__OWNED_EXTENSIONS = CapellacorePackage.STRUCTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__ID = CapellacorePackage.STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__SID = CapellacorePackage.STRUCTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__OWNED_CONSTRAINTS = CapellacorePackage.STRUCTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__NAME = CapellacorePackage.STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__SUMMARY = CapellacorePackage.STRUCTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__DESCRIPTION = CapellacorePackage.STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__REVIEW = CapellacorePackage.STRUCTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__OWNED_PROPERTY_VALUES = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.STRUCTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__APPLIED_PROPERTY_VALUES = CapellacorePackage.STRUCTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.STRUCTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__STATUS = CapellacorePackage.STRUCTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__FEATURES = CapellacorePackage.STRUCTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__APPLIED_REQUIREMENTS = CapellacorePackage.STRUCTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__CONTAINED_GENERIC_TRACES = CapellacorePackage.STRUCTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES = CapellacorePackage.STRUCTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG__OWNED_CATEGORIES = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PKG_FEATURE_COUNT = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.ExchangeCategoryImpl <em>Exchange Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.ExchangeCategoryImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getExchangeCategory()
	 * @generated
	 */
	int EXCHANGE_CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Exchange Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CATEGORY_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalChainImpl <em>Functional Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FunctionalChainImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionalChain()
	 * @generated
	 */
	int FUNCTIONAL_CHAIN = 5;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__KIND = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Functional Chain Involvements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_INVOLVEMENTS = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Available In States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__AVAILABLE_IN_STATES = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>First Functional Chain Involvements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__FIRST_FUNCTIONAL_CHAIN_INVOLVEMENTS = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Realized Functional Chains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__REALIZED_FUNCTIONAL_CHAINS = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Functional Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalChainContainerImpl <em>Abstract Functional Chain Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalChainContainerImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getAbstractFunctionalChainContainer()
	 * @generated
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__OWNED_EXTENSIONS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__ID = CapellacorePackage.CAPELLA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__SID = CapellacorePackage.CAPELLA_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__OWNED_CONSTRAINTS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__SUMMARY = CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__DESCRIPTION = CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__REVIEW = CapellacorePackage.CAPELLA_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__OWNED_PROPERTY_VALUES = CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__APPLIED_PROPERTY_VALUES = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__STATUS = CapellacorePackage.CAPELLA_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__FEATURES = CapellacorePackage.CAPELLA_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__APPLIED_REQUIREMENTS = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Owned Functional Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__OWNED_FUNCTIONAL_CHAINS = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Functional Chain Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER_FEATURE_COUNT = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalChainInvolvementImpl <em>Functional Chain Involvement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FunctionalChainInvolvementImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionalChainInvolvement()
	 * @generated
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT = 7;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__OWNED_EXTENSIONS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__ID = CapellacorePackage.CAPELLA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__SID = CapellacorePackage.CAPELLA_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__OWNED_CONSTRAINTS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__SUMMARY = CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__DESCRIPTION = CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__REVIEW = CapellacorePackage.CAPELLA_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__OWNED_PROPERTY_VALUES = CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__APPLIED_PROPERTY_VALUES = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__STATUS = CapellacorePackage.CAPELLA_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__FEATURES = CapellacorePackage.CAPELLA_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__APPLIED_REQUIREMENTS = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Next Functional Chain Involvements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__NEXT_FUNCTIONAL_CHAIN_INVOLVEMENTS = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Involved Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED_ELEMENT = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Functional Chain Involvement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_INVOLVEMENT_FEATURE_COUNT = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalChainReferenceImpl <em>Functional Chain Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FunctionalChainReferenceImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionalChainReference()
	 * @generated
	 */
	int FUNCTIONAL_CHAIN_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__OWNED_EXTENSIONS = FUNCTIONAL_CHAIN_INVOLVEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__ID = FUNCTIONAL_CHAIN_INVOLVEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__SID = FUNCTIONAL_CHAIN_INVOLVEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__OWNED_CONSTRAINTS = FUNCTIONAL_CHAIN_INVOLVEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__SUMMARY = FUNCTIONAL_CHAIN_INVOLVEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__DESCRIPTION = FUNCTIONAL_CHAIN_INVOLVEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__REVIEW = FUNCTIONAL_CHAIN_INVOLVEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__OWNED_PROPERTY_VALUES = FUNCTIONAL_CHAIN_INVOLVEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__OWNED_ENUMERATION_PROPERTY_TYPES = FUNCTIONAL_CHAIN_INVOLVEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__APPLIED_PROPERTY_VALUES = FUNCTIONAL_CHAIN_INVOLVEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__OWNED_PROPERTY_VALUE_GROUPS = FUNCTIONAL_CHAIN_INVOLVEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__APPLIED_PROPERTY_VALUE_GROUPS = FUNCTIONAL_CHAIN_INVOLVEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__STATUS = FUNCTIONAL_CHAIN_INVOLVEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__FEATURES = FUNCTIONAL_CHAIN_INVOLVEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__APPLIED_REQUIREMENTS = FUNCTIONAL_CHAIN_INVOLVEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Next Functional Chain Involvements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__NEXT_FUNCTIONAL_CHAIN_INVOLVEMENTS = FUNCTIONAL_CHAIN_INVOLVEMENT__NEXT_FUNCTIONAL_CHAIN_INVOLVEMENTS;

	/**
	 * The feature id for the '<em><b>Involved Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__INVOLVED_ELEMENT = FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Referenced Functional Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE__REFERENCED_FUNCTIONAL_CHAIN = FUNCTIONAL_CHAIN_INVOLVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Functional Chain Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_REFERENCE_FEATURE_COUNT = FUNCTIONAL_CHAIN_INVOLVEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionPortImpl <em>Function Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FunctionPortImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionPort()
	 * @generated
	 */
	int FUNCTION_PORT = 13;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__OWNED_EXTENSIONS = InformationPackage.PORT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__ID = InformationPackage.PORT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__SID = InformationPackage.PORT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__OWNED_CONSTRAINTS = InformationPackage.PORT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__NAME = InformationPackage.PORT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__SUMMARY = InformationPackage.PORT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__DESCRIPTION = InformationPackage.PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__REVIEW = InformationPackage.PORT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__OWNED_PROPERTY_VALUES = InformationPackage.PORT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__OWNED_ENUMERATION_PROPERTY_TYPES = InformationPackage.PORT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__APPLIED_PROPERTY_VALUES = InformationPackage.PORT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__OWNED_PROPERTY_VALUE_GROUPS = InformationPackage.PORT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__APPLIED_PROPERTY_VALUE_GROUPS = InformationPackage.PORT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__STATUS = InformationPackage.PORT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__FEATURES = InformationPackage.PORT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__APPLIED_REQUIREMENTS = InformationPackage.PORT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Owned Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__OWNED_PROTOCOLS = InformationPackage.PORT__OWNED_PROTOCOLS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__PROVIDED_INTERFACES = InformationPackage.PORT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__REQUIRED_INTERFACES = InformationPackage.PORT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__TYPE = InformationPackage.PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realized Function Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__REALIZED_FUNCTION_PORTS = InformationPackage.PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT_FEATURE_COUNT = InformationPackage.PORT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionInputPortImpl <em>Function Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FunctionInputPortImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionInputPort()
	 * @generated
	 */
	int FUNCTION_INPUT_PORT = 9;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__OWNED_EXTENSIONS = FUNCTION_PORT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__ID = FUNCTION_PORT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__SID = FUNCTION_PORT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__OWNED_CONSTRAINTS = FUNCTION_PORT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__NAME = FUNCTION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__SUMMARY = FUNCTION_PORT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__DESCRIPTION = FUNCTION_PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__REVIEW = FUNCTION_PORT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__OWNED_PROPERTY_VALUES = FUNCTION_PORT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__OWNED_ENUMERATION_PROPERTY_TYPES = FUNCTION_PORT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__APPLIED_PROPERTY_VALUES = FUNCTION_PORT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__OWNED_PROPERTY_VALUE_GROUPS = FUNCTION_PORT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__APPLIED_PROPERTY_VALUE_GROUPS = FUNCTION_PORT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__STATUS = FUNCTION_PORT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__FEATURES = FUNCTION_PORT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__APPLIED_REQUIREMENTS = FUNCTION_PORT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Owned Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__OWNED_PROTOCOLS = FUNCTION_PORT__OWNED_PROTOCOLS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__PROVIDED_INTERFACES = FUNCTION_PORT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__REQUIRED_INTERFACES = FUNCTION_PORT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__TYPE = FUNCTION_PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Realized Function Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__REALIZED_FUNCTION_PORTS = FUNCTION_PORT__REALIZED_FUNCTION_PORTS;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__OUTGOING = FUNCTION_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__INCOMING = FUNCTION_PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__IS_CONTROL_TYPE = FUNCTION_PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind Of Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__KIND_OF_NODE = FUNCTION_PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__ORDERING = FUNCTION_PORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__UPPER_BOUND = FUNCTION_PORT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__IN_STATE = FUNCTION_PORT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__SELECTION = FUNCTION_PORT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__IS_CONTROL = FUNCTION_PORT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Incoming Exchange Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__INCOMING_EXCHANGE_ITEMS = FUNCTION_PORT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Function Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT_FEATURE_COUNT = FUNCTION_PORT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionOutputPortImpl <em>Function Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FunctionOutputPortImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionOutputPort()
	 * @generated
	 */
	int FUNCTION_OUTPUT_PORT = 10;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__OWNED_EXTENSIONS = FUNCTION_PORT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__ID = FUNCTION_PORT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__SID = FUNCTION_PORT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__OWNED_CONSTRAINTS = FUNCTION_PORT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__NAME = FUNCTION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__SUMMARY = FUNCTION_PORT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__DESCRIPTION = FUNCTION_PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__REVIEW = FUNCTION_PORT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__OWNED_PROPERTY_VALUES = FUNCTION_PORT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__OWNED_ENUMERATION_PROPERTY_TYPES = FUNCTION_PORT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__APPLIED_PROPERTY_VALUES = FUNCTION_PORT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__OWNED_PROPERTY_VALUE_GROUPS = FUNCTION_PORT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__APPLIED_PROPERTY_VALUE_GROUPS = FUNCTION_PORT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__STATUS = FUNCTION_PORT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__FEATURES = FUNCTION_PORT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__APPLIED_REQUIREMENTS = FUNCTION_PORT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Owned Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__OWNED_PROTOCOLS = FUNCTION_PORT__OWNED_PROTOCOLS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__PROVIDED_INTERFACES = FUNCTION_PORT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__REQUIRED_INTERFACES = FUNCTION_PORT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__TYPE = FUNCTION_PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Realized Function Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__REALIZED_FUNCTION_PORTS = FUNCTION_PORT__REALIZED_FUNCTION_PORTS;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__OUTGOING = FUNCTION_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__INCOMING = FUNCTION_PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__IS_CONTROL_TYPE = FUNCTION_PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind Of Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__KIND_OF_NODE = FUNCTION_PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__ORDERING = FUNCTION_PORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__UPPER_BOUND = FUNCTION_PORT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__IN_STATE = FUNCTION_PORT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__SELECTION = FUNCTION_PORT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__IS_CONTROL = FUNCTION_PORT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Outgoing Exchange Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__OUTGOING_EXCHANGE_ITEMS = FUNCTION_PORT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Function Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT_FEATURE_COUNT = FUNCTION_PORT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl <em>Functional Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionalExchange()
	 * @generated
	 */
	int FUNCTIONAL_EXCHANGE = 11;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Kind Of Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__KIND_OF_RATE = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__RATE = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__PROBABILITY = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__TARGET = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__SOURCE = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__GUARD = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__WEIGHT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Multicast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__IS_MULTICAST = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Multireceive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Exchanged Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__CATEGORIES = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Source Function Output Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Target Function Input Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Realized Functional Exchanges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Functional Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EXCHANGE_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionImpl <em>Abstract Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getAbstractFunction()
	 * @generated
	 */
	int ABSTRACT_FUNCTION = 12;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OWNED_EXTENSIONS = CapellacorePackage.NAMESPACE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__ID = CapellacorePackage.NAMESPACE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__SID = CapellacorePackage.NAMESPACE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OWNED_CONSTRAINTS = CapellacorePackage.NAMESPACE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__NAME = CapellacorePackage.NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__SUMMARY = CapellacorePackage.NAMESPACE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__DESCRIPTION = CapellacorePackage.NAMESPACE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__REVIEW = CapellacorePackage.NAMESPACE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMESPACE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMESPACE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMESPACE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMESPACE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMESPACE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__STATUS = CapellacorePackage.NAMESPACE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__FEATURES = CapellacorePackage.NAMESPACE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__APPLIED_REQUIREMENTS = CapellacorePackage.NAMESPACE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__CONTAINED_GENERIC_TRACES = CapellacorePackage.NAMESPACE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__CONTAINED_REQUIREMENTS_TRACES = CapellacorePackage.NAMESPACE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Functional Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_CHAINS = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__IS_ABSTRACT = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__IS_STATIC = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__VISIBILITY = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__TYPE = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__ORDERED = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__UNIQUE = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__MIN_INCLUSIVE = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__MAX_INCLUSIVE = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OWNED_DEFAULT_VALUE = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OWNED_MIN_VALUE = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OWNED_MAX_VALUE = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OWNED_NULL_VALUE = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OWNED_MIN_CARD = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OWNED_MIN_LENGTH = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OWNED_MAX_CARD = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OWNED_MAX_LENGTH = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__AGGREGATION_KIND = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__IS_DERIVED = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__IS_READ_ONLY = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__IS_PART_OF_KEY = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OUTGOING = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__INCOMING = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__INPUTS = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OUTPUTS = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__KIND = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__CONDITION = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Owned Functional Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_EXCHANGES = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Available In States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__AVAILABLE_IN_STATES = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Linked State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION__LINKED_STATE_MACHINE = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 29;

	/**
	 * The number of structural features of the '<em>Abstract Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION_FEATURE_COUNT = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 30;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.ComponentExchangeImpl <em>Component Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.ComponentExchangeImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getComponentExchange()
	 * @generated
	 */
	int COMPONENT_EXCHANGE = 14;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__OWNED_EXTENSIONS = BehaviorPackage.ABSTRACT_EVENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__ID = BehaviorPackage.ABSTRACT_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__SID = BehaviorPackage.ABSTRACT_EVENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__OWNED_CONSTRAINTS = BehaviorPackage.ABSTRACT_EVENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__NAME = BehaviorPackage.ABSTRACT_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__SUMMARY = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__DESCRIPTION = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__REVIEW = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__STATUS = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__FEATURES = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__APPLIED_REQUIREMENTS = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Convoyed Informations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__CONVOYED_INFORMATIONS = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__KIND = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Oriented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__ORIENTED = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Allocated Functional Exchanges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Owned Component Exchange Ends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__SOURCE_PORT = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Source Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__SOURCE_PART = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__TARGET_PORT = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Target Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__TARGET_PART = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__CATEGORIES = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Realized Component Exchanges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Component Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_FEATURE_COUNT = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.ComponentExchangeAllocatorImpl <em>Component Exchange Allocator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.ComponentExchangeAllocatorImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getComponentExchangeAllocator()
	 * @generated
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR = 15;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Allocated Component Exchanges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR__ALLOCATED_COMPONENT_EXCHANGES = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Exchange Allocator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_ALLOCATOR_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.ComponentExchangeCategoryImpl <em>Component Exchange Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.ComponentExchangeCategoryImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getComponentExchangeCategory()
	 * @generated
	 */
	int COMPONENT_EXCHANGE_CATEGORY = 16;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Component Exchange Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_CATEGORY_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.ComponentExchangeEndImpl <em>Component Exchange End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.ComponentExchangeEndImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getComponentExchangeEnd()
	 * @generated
	 */
	int COMPONENT_EXCHANGE_END = 17;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__OWNED_EXTENSIONS = ModellingcorePackage.INFORMATIONS_EXCHANGER__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__ID = ModellingcorePackage.INFORMATIONS_EXCHANGER__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__SID = ModellingcorePackage.INFORMATIONS_EXCHANGER__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__OWNED_CONSTRAINTS = ModellingcorePackage.INFORMATIONS_EXCHANGER__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__SUMMARY = ModellingcorePackage.INFORMATIONS_EXCHANGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__DESCRIPTION = ModellingcorePackage.INFORMATIONS_EXCHANGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__REVIEW = ModellingcorePackage.INFORMATIONS_EXCHANGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__OWNED_PROPERTY_VALUES = ModellingcorePackage.INFORMATIONS_EXCHANGER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__OWNED_ENUMERATION_PROPERTY_TYPES = ModellingcorePackage.INFORMATIONS_EXCHANGER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__APPLIED_PROPERTY_VALUES = ModellingcorePackage.INFORMATIONS_EXCHANGER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__OWNED_PROPERTY_VALUE_GROUPS = ModellingcorePackage.INFORMATIONS_EXCHANGER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__APPLIED_PROPERTY_VALUE_GROUPS = ModellingcorePackage.INFORMATIONS_EXCHANGER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__STATUS = ModellingcorePackage.INFORMATIONS_EXCHANGER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__FEATURES = ModellingcorePackage.INFORMATIONS_EXCHANGER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__APPLIED_REQUIREMENTS = ModellingcorePackage.INFORMATIONS_EXCHANGER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__PORT = ModellingcorePackage.INFORMATIONS_EXCHANGER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END__PART = ModellingcorePackage.INFORMATIONS_EXCHANGER_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Component Exchange End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXCHANGE_END_FEATURE_COUNT = ModellingcorePackage.INFORMATIONS_EXCHANGER_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.ComponentPortImpl <em>Component Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.ComponentPortImpl
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getComponentPort()
	 * @generated
	 */
	int COMPONENT_PORT = 18;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__OWNED_EXTENSIONS = InformationPackage.PORT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__ID = InformationPackage.PORT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__SID = InformationPackage.PORT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__OWNED_CONSTRAINTS = InformationPackage.PORT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__NAME = InformationPackage.PORT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__SUMMARY = InformationPackage.PORT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__DESCRIPTION = InformationPackage.PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__REVIEW = InformationPackage.PORT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__OWNED_PROPERTY_VALUES = InformationPackage.PORT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__OWNED_ENUMERATION_PROPERTY_TYPES = InformationPackage.PORT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__APPLIED_PROPERTY_VALUES = InformationPackage.PORT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__OWNED_PROPERTY_VALUE_GROUPS = InformationPackage.PORT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__APPLIED_PROPERTY_VALUE_GROUPS = InformationPackage.PORT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__STATUS = InformationPackage.PORT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__FEATURES = InformationPackage.PORT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__APPLIED_REQUIREMENTS = InformationPackage.PORT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Owned Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__OWNED_PROTOCOLS = InformationPackage.PORT__OWNED_PROTOCOLS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__PROVIDED_INTERFACES = InformationPackage.PORT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__REQUIRED_INTERFACES = InformationPackage.PORT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__IS_ABSTRACT = InformationPackage.PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__IS_STATIC = InformationPackage.PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__VISIBILITY = InformationPackage.PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__TYPE = InformationPackage.PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__ORDERED = InformationPackage.PORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__UNIQUE = InformationPackage.PORT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__MIN_INCLUSIVE = InformationPackage.PORT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__MAX_INCLUSIVE = InformationPackage.PORT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__OWNED_DEFAULT_VALUE = InformationPackage.PORT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__OWNED_MIN_VALUE = InformationPackage.PORT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__OWNED_MAX_VALUE = InformationPackage.PORT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__OWNED_NULL_VALUE = InformationPackage.PORT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__OWNED_MIN_CARD = InformationPackage.PORT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__OWNED_MIN_LENGTH = InformationPackage.PORT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__OWNED_MAX_CARD = InformationPackage.PORT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__OWNED_MAX_LENGTH = InformationPackage.PORT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__AGGREGATION_KIND = InformationPackage.PORT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__IS_DERIVED = InformationPackage.PORT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__IS_READ_ONLY = InformationPackage.PORT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__IS_PART_OF_KEY = InformationPackage.PORT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__ORIENTATION = InformationPackage.PORT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__KIND = InformationPackage.PORT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Component Exchanges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__COMPONENT_EXCHANGES = InformationPackage.PORT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Allocated Function Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__ALLOCATED_FUNCTION_PORTS = InformationPackage.PORT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Delegated Component Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__DELEGATED_COMPONENT_PORTS = InformationPackage.PORT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Realized Component Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__REALIZED_COMPONENT_PORTS = InformationPackage.PORT_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Component Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT_FEATURE_COUNT = InformationPackage.PORT_FEATURE_COUNT + 26;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainKind <em>Functional Chain Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalChainKind
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionalChainKind()
	 * @generated
	 */
	int FUNCTIONAL_CHAIN_KIND = 19;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.FunctionKind <em>Function Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionKind
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionKind()
	 * @generated
	 */
	int FUNCTION_KIND = 20;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeKind <em>Component Exchange Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchangeKind
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getComponentExchangeKind()
	 * @generated
	 */
	int COMPONENT_EXCHANGE_KIND = 21;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.ComponentPortKind <em>Component Port Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentPortKind
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getComponentPortKind()
	 * @generated
	 */
	int COMPONENT_PORT_KIND = 22;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.fa.OrientationPortKind <em>Orientation Port Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.fa.OrientationPortKind
	 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getOrientationPortKind()
	 * @generated
	 */
	int ORIENTATION_PORT_KIND = 23;


	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalArchitecture <em>Abstract Functional Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Functional Architecture</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalArchitecture
	 * @generated
	 */
	EClass getAbstractFunctionalArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalArchitecture#getOwnedComponentExchanges <em>Owned Component Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Component Exchanges</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalArchitecture#getOwnedComponentExchanges()
	 * @see #getAbstractFunctionalArchitecture()
	 * @generated
	 */
	EReference getAbstractFunctionalArchitecture_OwnedComponentExchanges();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalArchitecture#getOwnedComponentExchangeCategories <em>Owned Component Exchange Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Component Exchange Categories</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalArchitecture#getOwnedComponentExchangeCategories()
	 * @see #getAbstractFunctionalArchitecture()
	 * @generated
	 */
	EReference getAbstractFunctionalArchitecture_OwnedComponentExchangeCategories();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalStructure <em>Abstract Functional Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Functional Structure</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalStructure
	 * @generated
	 */
	EClass getAbstractFunctionalStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalStructure#getOwnedComponentExchanges <em>Owned Component Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Component Exchanges</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalStructure#getOwnedComponentExchanges()
	 * @see #getAbstractFunctionalStructure()
	 * @generated
	 */
	EReference getAbstractFunctionalStructure_OwnedComponentExchanges();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalStructure#getOwnedComponentExchangeCategories <em>Owned Component Exchange Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Component Exchange Categories</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalStructure#getOwnedComponentExchangeCategories()
	 * @see #getAbstractFunctionalStructure()
	 * @generated
	 */
	EReference getAbstractFunctionalStructure_OwnedComponentExchangeCategories();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalBlock <em>Abstract Functional Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Functional Block</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalBlock
	 * @generated
	 */
	EClass getAbstractFunctionalBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalBlock#getOwnedComponentExchanges <em>Owned Component Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Component Exchanges</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalBlock#getOwnedComponentExchanges()
	 * @see #getAbstractFunctionalBlock()
	 * @generated
	 */
	EReference getAbstractFunctionalBlock_OwnedComponentExchanges();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalBlock#getOwnedComponentExchangeCategories <em>Owned Component Exchange Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Component Exchange Categories</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalBlock#getOwnedComponentExchangeCategories()
	 * @see #getAbstractFunctionalBlock()
	 * @generated
	 */
	EReference getAbstractFunctionalBlock_OwnedComponentExchangeCategories();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.FunctionPkg <em>Function Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Pkg</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionPkg
	 * @generated
	 */
	EClass getFunctionPkg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.fa.FunctionPkg#getOwnedCategories <em>Owned Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Categories</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionPkg#getOwnedCategories()
	 * @see #getFunctionPkg()
	 * @generated
	 */
	EReference getFunctionPkg_OwnedCategories();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.ExchangeCategory <em>Exchange Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Category</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ExchangeCategory
	 * @generated
	 */
	EClass getExchangeCategory();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChain <em>Functional Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Chain</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalChain
	 * @generated
	 */
	EClass getFunctionalChain();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChain#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalChain#getKind()
	 * @see #getFunctionalChain()
	 * @generated
	 */
	EAttribute getFunctionalChain_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChain#getOwnedFunctionalChainInvolvements <em>Owned Functional Chain Involvements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Functional Chain Involvements</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalChain#getOwnedFunctionalChainInvolvements()
	 * @see #getFunctionalChain()
	 * @generated
	 */
	EReference getFunctionalChain_OwnedFunctionalChainInvolvements();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChain#getAvailableInStates <em>Available In States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Available In States</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalChain#getAvailableInStates()
	 * @see #getFunctionalChain()
	 * @generated
	 */
	EReference getFunctionalChain_AvailableInStates();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChain#getFirstFunctionalChainInvolvements <em>First Functional Chain Involvements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>First Functional Chain Involvements</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalChain#getFirstFunctionalChainInvolvements()
	 * @see #getFunctionalChain()
	 * @generated
	 */
	EReference getFunctionalChain_FirstFunctionalChainInvolvements();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChain#getRealizedFunctionalChains <em>Realized Functional Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Functional Chains</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalChain#getRealizedFunctionalChains()
	 * @see #getFunctionalChain()
	 * @generated
	 */
	EReference getFunctionalChain_RealizedFunctionalChains();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalChainContainer <em>Abstract Functional Chain Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Functional Chain Container</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalChainContainer
	 * @generated
	 */
	EClass getAbstractFunctionalChainContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalChainContainer#getOwnedFunctionalChains <em>Owned Functional Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Functional Chains</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalChainContainer#getOwnedFunctionalChains()
	 * @see #getAbstractFunctionalChainContainer()
	 * @generated
	 */
	EReference getAbstractFunctionalChainContainer_OwnedFunctionalChains();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainInvolvement <em>Functional Chain Involvement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Chain Involvement</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalChainInvolvement
	 * @generated
	 */
	EClass getFunctionalChainInvolvement();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainInvolvement#getNextFunctionalChainInvolvements <em>Next Functional Chain Involvements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next Functional Chain Involvements</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalChainInvolvement#getNextFunctionalChainInvolvements()
	 * @see #getFunctionalChainInvolvement()
	 * @generated
	 */
	EReference getFunctionalChainInvolvement_NextFunctionalChainInvolvements();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainInvolvement#getInvolvedElement <em>Involved Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Involved Element</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalChainInvolvement#getInvolvedElement()
	 * @see #getFunctionalChainInvolvement()
	 * @generated
	 */
	EReference getFunctionalChainInvolvement_InvolvedElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainReference <em>Functional Chain Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Chain Reference</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalChainReference
	 * @generated
	 */
	EClass getFunctionalChainReference();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainReference#getReferencedFunctionalChain <em>Referenced Functional Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Functional Chain</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalChainReference#getReferencedFunctionalChain()
	 * @see #getFunctionalChainReference()
	 * @generated
	 */
	EReference getFunctionalChainReference_ReferencedFunctionalChain();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.FunctionInputPort <em>Function Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Input Port</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionInputPort
	 * @generated
	 */
	EClass getFunctionInputPort();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.FunctionInputPort#getIncomingExchangeItems <em>Incoming Exchange Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Exchange Items</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionInputPort#getIncomingExchangeItems()
	 * @see #getFunctionInputPort()
	 * @generated
	 */
	EReference getFunctionInputPort_IncomingExchangeItems();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.FunctionOutputPort <em>Function Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Output Port</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionOutputPort
	 * @generated
	 */
	EClass getFunctionOutputPort();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.FunctionOutputPort#getOutgoingExchangeItems <em>Outgoing Exchange Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Exchange Items</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionOutputPort#getOutgoingExchangeItems()
	 * @see #getFunctionOutputPort()
	 * @generated
	 */
	EReference getFunctionOutputPort_OutgoingExchangeItems();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalExchange <em>Functional Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Exchange</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalExchange
	 * @generated
	 */
	EClass getFunctionalExchange();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getExchangedItems <em>Exchanged Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exchanged Items</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getExchangedItems()
	 * @see #getFunctionalExchange()
	 * @generated
	 */
	EReference getFunctionalExchange_ExchangedItems();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categories</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getCategories()
	 * @see #getFunctionalExchange()
	 * @generated
	 */
	EReference getFunctionalExchange_Categories();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getSourceFunctionOutputPort <em>Source Function Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Function Output Port</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getSourceFunctionOutputPort()
	 * @see #getFunctionalExchange()
	 * @generated
	 */
	EReference getFunctionalExchange_SourceFunctionOutputPort();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getTargetFunctionInputPort <em>Target Function Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Function Input Port</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getTargetFunctionInputPort()
	 * @see #getFunctionalExchange()
	 * @generated
	 */
	EReference getFunctionalExchange_TargetFunctionInputPort();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getRealizedFunctionalExchanges <em>Realized Functional Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Functional Exchanges</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getRealizedFunctionalExchanges()
	 * @see #getFunctionalExchange()
	 * @generated
	 */
	EReference getFunctionalExchange_RealizedFunctionalExchanges();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction <em>Abstract Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Function</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunction
	 * @generated
	 */
	EClass getAbstractFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getKind()
	 * @see #getAbstractFunction()
	 * @generated
	 */
	EAttribute getAbstractFunction_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getCondition()
	 * @see #getAbstractFunction()
	 * @generated
	 */
	EAttribute getAbstractFunction_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getOwnedFunctionalExchanges <em>Owned Functional Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Functional Exchanges</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getOwnedFunctionalExchanges()
	 * @see #getAbstractFunction()
	 * @generated
	 */
	EReference getAbstractFunction_OwnedFunctionalExchanges();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getAvailableInStates <em>Available In States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Available In States</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getAvailableInStates()
	 * @see #getAbstractFunction()
	 * @generated
	 */
	EReference getAbstractFunction_AvailableInStates();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getLinkedStateMachine <em>Linked State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked State Machine</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getLinkedStateMachine()
	 * @see #getAbstractFunction()
	 * @generated
	 */
	EReference getAbstractFunction_LinkedStateMachine();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.FunctionPort <em>Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Port</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionPort
	 * @generated
	 */
	EClass getFunctionPort();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.FunctionPort#getRealizedFunctionPorts <em>Realized Function Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Function Ports</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionPort#getRealizedFunctionPorts()
	 * @see #getFunctionPort()
	 * @generated
	 */
	EReference getFunctionPort_RealizedFunctionPorts();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange <em>Component Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Exchange</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchange
	 * @generated
	 */
	EClass getComponentExchange();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getKind()
	 * @see #getComponentExchange()
	 * @generated
	 */
	EAttribute getComponentExchange_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#isOriented <em>Oriented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oriented</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchange#isOriented()
	 * @see #getComponentExchange()
	 * @generated
	 */
	EAttribute getComponentExchange_Oriented();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getAllocatedFunctionalExchanges <em>Allocated Functional Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Functional Exchanges</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getAllocatedFunctionalExchanges()
	 * @see #getComponentExchange()
	 * @generated
	 */
	EReference getComponentExchange_AllocatedFunctionalExchanges();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getOwnedComponentExchangeEnds <em>Owned Component Exchange Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Component Exchange Ends</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getOwnedComponentExchangeEnds()
	 * @see #getComponentExchange()
	 * @generated
	 */
	EReference getComponentExchange_OwnedComponentExchangeEnds();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getSourcePort <em>Source Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Port</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getSourcePort()
	 * @see #getComponentExchange()
	 * @generated
	 */
	EReference getComponentExchange_SourcePort();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getSourcePart <em>Source Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Part</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getSourcePart()
	 * @see #getComponentExchange()
	 * @generated
	 */
	EReference getComponentExchange_SourcePart();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getTargetPort <em>Target Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Port</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getTargetPort()
	 * @see #getComponentExchange()
	 * @generated
	 */
	EReference getComponentExchange_TargetPort();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getTargetPart <em>Target Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Part</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getTargetPart()
	 * @see #getComponentExchange()
	 * @generated
	 */
	EReference getComponentExchange_TargetPart();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categories</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getCategories()
	 * @see #getComponentExchange()
	 * @generated
	 */
	EReference getComponentExchange_Categories();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getRealizedComponentExchanges <em>Realized Component Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Component Exchanges</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getRealizedComponentExchanges()
	 * @see #getComponentExchange()
	 * @generated
	 */
	EReference getComponentExchange_RealizedComponentExchanges();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeAllocator <em>Component Exchange Allocator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Exchange Allocator</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchangeAllocator
	 * @generated
	 */
	EClass getComponentExchangeAllocator();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeAllocator#getAllocatedComponentExchanges <em>Allocated Component Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Component Exchanges</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchangeAllocator#getAllocatedComponentExchanges()
	 * @see #getComponentExchangeAllocator()
	 * @generated
	 */
	EReference getComponentExchangeAllocator_AllocatedComponentExchanges();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeCategory <em>Component Exchange Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Exchange Category</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchangeCategory
	 * @generated
	 */
	EClass getComponentExchangeCategory();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeEnd <em>Component Exchange End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Exchange End</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchangeEnd
	 * @generated
	 */
	EClass getComponentExchangeEnd();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeEnd#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchangeEnd#getPort()
	 * @see #getComponentExchangeEnd()
	 * @generated
	 */
	EReference getComponentExchangeEnd_Port();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeEnd#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Part</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchangeEnd#getPart()
	 * @see #getComponentExchangeEnd()
	 * @generated
	 */
	EReference getComponentExchangeEnd_Part();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.fa.ComponentPort <em>Component Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Port</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentPort
	 * @generated
	 */
	EClass getComponentPort();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.fa.ComponentPort#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentPort#getOrientation()
	 * @see #getComponentPort()
	 * @generated
	 */
	EAttribute getComponentPort_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.fa.ComponentPort#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentPort#getKind()
	 * @see #getComponentPort()
	 * @generated
	 */
	EAttribute getComponentPort_Kind();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.ComponentPort#getComponentExchanges <em>Component Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component Exchanges</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentPort#getComponentExchanges()
	 * @see #getComponentPort()
	 * @generated
	 */
	EReference getComponentPort_ComponentExchanges();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.ComponentPort#getAllocatedFunctionPorts <em>Allocated Function Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Function Ports</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentPort#getAllocatedFunctionPorts()
	 * @see #getComponentPort()
	 * @generated
	 */
	EReference getComponentPort_AllocatedFunctionPorts();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.ComponentPort#getDelegatedComponentPorts <em>Delegated Component Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegated Component Ports</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentPort#getDelegatedComponentPorts()
	 * @see #getComponentPort()
	 * @generated
	 */
	EReference getComponentPort_DelegatedComponentPorts();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.fa.ComponentPort#getRealizedComponentPorts <em>Realized Component Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Component Ports</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentPort#getRealizedComponentPorts()
	 * @see #getComponentPort()
	 * @generated
	 */
	EReference getComponentPort_RealizedComponentPorts();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainKind <em>Functional Chain Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Functional Chain Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalChainKind
	 * @generated
	 */
	EEnum getFunctionalChainKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.capella.core.semantic.data.fa.FunctionKind <em>Function Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionKind
	 * @generated
	 */
	EEnum getFunctionKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeKind <em>Component Exchange Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Exchange Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchangeKind
	 * @generated
	 */
	EEnum getComponentExchangeKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.capella.core.semantic.data.fa.ComponentPortKind <em>Component Port Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Port Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentPortKind
	 * @generated
	 */
	EEnum getComponentPortKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.capella.core.semantic.data.fa.OrientationPortKind <em>Orientation Port Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation Port Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.fa.OrientationPortKind
	 * @generated
	 */
	EEnum getOrientationPortKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FaFactory getFaFactory();

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
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalArchitectureImpl <em>Abstract Functional Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalArchitectureImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getAbstractFunctionalArchitecture()
		 * @generated
		 */
		EClass ABSTRACT_FUNCTIONAL_ARCHITECTURE = eINSTANCE.getAbstractFunctionalArchitecture();

		/**
		 * The meta object literal for the '<em><b>Owned Component Exchanges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES = eINSTANCE.getAbstractFunctionalArchitecture_OwnedComponentExchanges();

		/**
		 * The meta object literal for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES = eINSTANCE.getAbstractFunctionalArchitecture_OwnedComponentExchangeCategories();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalStructureImpl <em>Abstract Functional Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalStructureImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getAbstractFunctionalStructure()
		 * @generated
		 */
		EClass ABSTRACT_FUNCTIONAL_STRUCTURE = eINSTANCE.getAbstractFunctionalStructure();

		/**
		 * The meta object literal for the '<em><b>Owned Component Exchanges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGES = eINSTANCE.getAbstractFunctionalStructure_OwnedComponentExchanges();

		/**
		 * The meta object literal for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES = eINSTANCE.getAbstractFunctionalStructure_OwnedComponentExchangeCategories();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalBlockImpl <em>Abstract Functional Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalBlockImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getAbstractFunctionalBlock()
		 * @generated
		 */
		EClass ABSTRACT_FUNCTIONAL_BLOCK = eINSTANCE.getAbstractFunctionalBlock();

		/**
		 * The meta object literal for the '<em><b>Owned Component Exchanges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGES = eINSTANCE.getAbstractFunctionalBlock_OwnedComponentExchanges();

		/**
		 * The meta object literal for the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES = eINSTANCE.getAbstractFunctionalBlock_OwnedComponentExchangeCategories();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionPkgImpl <em>Function Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FunctionPkgImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionPkg()
		 * @generated
		 */
		EClass FUNCTION_PKG = eINSTANCE.getFunctionPkg();

		/**
		 * The meta object literal for the '<em><b>Owned Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_PKG__OWNED_CATEGORIES = eINSTANCE.getFunctionPkg_OwnedCategories();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.ExchangeCategoryImpl <em>Exchange Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.ExchangeCategoryImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getExchangeCategory()
		 * @generated
		 */
		EClass EXCHANGE_CATEGORY = eINSTANCE.getExchangeCategory();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalChainImpl <em>Functional Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FunctionalChainImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionalChain()
		 * @generated
		 */
		EClass FUNCTIONAL_CHAIN = eINSTANCE.getFunctionalChain();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_CHAIN__KIND = eINSTANCE.getFunctionalChain_Kind();

		/**
		 * The meta object literal for the '<em><b>Owned Functional Chain Involvements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_INVOLVEMENTS = eINSTANCE.getFunctionalChain_OwnedFunctionalChainInvolvements();

		/**
		 * The meta object literal for the '<em><b>Available In States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_CHAIN__AVAILABLE_IN_STATES = eINSTANCE.getFunctionalChain_AvailableInStates();

		/**
		 * The meta object literal for the '<em><b>First Functional Chain Involvements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_CHAIN__FIRST_FUNCTIONAL_CHAIN_INVOLVEMENTS = eINSTANCE.getFunctionalChain_FirstFunctionalChainInvolvements();

		/**
		 * The meta object literal for the '<em><b>Realized Functional Chains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_CHAIN__REALIZED_FUNCTIONAL_CHAINS = eINSTANCE.getFunctionalChain_RealizedFunctionalChains();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalChainContainerImpl <em>Abstract Functional Chain Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalChainContainerImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getAbstractFunctionalChainContainer()
		 * @generated
		 */
		EClass ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER = eINSTANCE.getAbstractFunctionalChainContainer();

		/**
		 * The meta object literal for the '<em><b>Owned Functional Chains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__OWNED_FUNCTIONAL_CHAINS = eINSTANCE.getAbstractFunctionalChainContainer_OwnedFunctionalChains();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalChainInvolvementImpl <em>Functional Chain Involvement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FunctionalChainInvolvementImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionalChainInvolvement()
		 * @generated
		 */
		EClass FUNCTIONAL_CHAIN_INVOLVEMENT = eINSTANCE.getFunctionalChainInvolvement();

		/**
		 * The meta object literal for the '<em><b>Next Functional Chain Involvements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_CHAIN_INVOLVEMENT__NEXT_FUNCTIONAL_CHAIN_INVOLVEMENTS = eINSTANCE.getFunctionalChainInvolvement_NextFunctionalChainInvolvements();

		/**
		 * The meta object literal for the '<em><b>Involved Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED_ELEMENT = eINSTANCE.getFunctionalChainInvolvement_InvolvedElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalChainReferenceImpl <em>Functional Chain Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FunctionalChainReferenceImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionalChainReference()
		 * @generated
		 */
		EClass FUNCTIONAL_CHAIN_REFERENCE = eINSTANCE.getFunctionalChainReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Functional Chain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_CHAIN_REFERENCE__REFERENCED_FUNCTIONAL_CHAIN = eINSTANCE.getFunctionalChainReference_ReferencedFunctionalChain();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionInputPortImpl <em>Function Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FunctionInputPortImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionInputPort()
		 * @generated
		 */
		EClass FUNCTION_INPUT_PORT = eINSTANCE.getFunctionInputPort();

		/**
		 * The meta object literal for the '<em><b>Incoming Exchange Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INPUT_PORT__INCOMING_EXCHANGE_ITEMS = eINSTANCE.getFunctionInputPort_IncomingExchangeItems();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionOutputPortImpl <em>Function Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FunctionOutputPortImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionOutputPort()
		 * @generated
		 */
		EClass FUNCTION_OUTPUT_PORT = eINSTANCE.getFunctionOutputPort();

		/**
		 * The meta object literal for the '<em><b>Outgoing Exchange Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_OUTPUT_PORT__OUTGOING_EXCHANGE_ITEMS = eINSTANCE.getFunctionOutputPort_OutgoingExchangeItems();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl <em>Functional Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionalExchange()
		 * @generated
		 */
		EClass FUNCTIONAL_EXCHANGE = eINSTANCE.getFunctionalExchange();

		/**
		 * The meta object literal for the '<em><b>Exchanged Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS = eINSTANCE.getFunctionalExchange_ExchangedItems();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_EXCHANGE__CATEGORIES = eINSTANCE.getFunctionalExchange_Categories();

		/**
		 * The meta object literal for the '<em><b>Source Function Output Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT = eINSTANCE.getFunctionalExchange_SourceFunctionOutputPort();

		/**
		 * The meta object literal for the '<em><b>Target Function Input Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT = eINSTANCE.getFunctionalExchange_TargetFunctionInputPort();

		/**
		 * The meta object literal for the '<em><b>Realized Functional Exchanges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES = eINSTANCE.getFunctionalExchange_RealizedFunctionalExchanges();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionImpl <em>Abstract Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getAbstractFunction()
		 * @generated
		 */
		EClass ABSTRACT_FUNCTION = eINSTANCE.getAbstractFunction();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_FUNCTION__KIND = eINSTANCE.getAbstractFunction_Kind();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_FUNCTION__CONDITION = eINSTANCE.getAbstractFunction_Condition();

		/**
		 * The meta object literal for the '<em><b>Owned Functional Exchanges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_EXCHANGES = eINSTANCE.getAbstractFunction_OwnedFunctionalExchanges();

		/**
		 * The meta object literal for the '<em><b>Available In States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FUNCTION__AVAILABLE_IN_STATES = eINSTANCE.getAbstractFunction_AvailableInStates();

		/**
		 * The meta object literal for the '<em><b>Linked State Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FUNCTION__LINKED_STATE_MACHINE = eINSTANCE.getAbstractFunction_LinkedStateMachine();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionPortImpl <em>Function Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FunctionPortImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionPort()
		 * @generated
		 */
		EClass FUNCTION_PORT = eINSTANCE.getFunctionPort();

		/**
		 * The meta object literal for the '<em><b>Realized Function Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_PORT__REALIZED_FUNCTION_PORTS = eINSTANCE.getFunctionPort_RealizedFunctionPorts();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.ComponentExchangeImpl <em>Component Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.ComponentExchangeImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getComponentExchange()
		 * @generated
		 */
		EClass COMPONENT_EXCHANGE = eINSTANCE.getComponentExchange();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_EXCHANGE__KIND = eINSTANCE.getComponentExchange_Kind();

		/**
		 * The meta object literal for the '<em><b>Oriented</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_EXCHANGE__ORIENTED = eINSTANCE.getComponentExchange_Oriented();

		/**
		 * The meta object literal for the '<em><b>Allocated Functional Exchanges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES = eINSTANCE.getComponentExchange_AllocatedFunctionalExchanges();

		/**
		 * The meta object literal for the '<em><b>Owned Component Exchange Ends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS = eINSTANCE.getComponentExchange_OwnedComponentExchangeEnds();

		/**
		 * The meta object literal for the '<em><b>Source Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_EXCHANGE__SOURCE_PORT = eINSTANCE.getComponentExchange_SourcePort();

		/**
		 * The meta object literal for the '<em><b>Source Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_EXCHANGE__SOURCE_PART = eINSTANCE.getComponentExchange_SourcePart();

		/**
		 * The meta object literal for the '<em><b>Target Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_EXCHANGE__TARGET_PORT = eINSTANCE.getComponentExchange_TargetPort();

		/**
		 * The meta object literal for the '<em><b>Target Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_EXCHANGE__TARGET_PART = eINSTANCE.getComponentExchange_TargetPart();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_EXCHANGE__CATEGORIES = eINSTANCE.getComponentExchange_Categories();

		/**
		 * The meta object literal for the '<em><b>Realized Component Exchanges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES = eINSTANCE.getComponentExchange_RealizedComponentExchanges();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.ComponentExchangeAllocatorImpl <em>Component Exchange Allocator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.ComponentExchangeAllocatorImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getComponentExchangeAllocator()
		 * @generated
		 */
		EClass COMPONENT_EXCHANGE_ALLOCATOR = eINSTANCE.getComponentExchangeAllocator();

		/**
		 * The meta object literal for the '<em><b>Allocated Component Exchanges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_EXCHANGE_ALLOCATOR__ALLOCATED_COMPONENT_EXCHANGES = eINSTANCE.getComponentExchangeAllocator_AllocatedComponentExchanges();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.ComponentExchangeCategoryImpl <em>Component Exchange Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.ComponentExchangeCategoryImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getComponentExchangeCategory()
		 * @generated
		 */
		EClass COMPONENT_EXCHANGE_CATEGORY = eINSTANCE.getComponentExchangeCategory();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.ComponentExchangeEndImpl <em>Component Exchange End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.ComponentExchangeEndImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getComponentExchangeEnd()
		 * @generated
		 */
		EClass COMPONENT_EXCHANGE_END = eINSTANCE.getComponentExchangeEnd();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_EXCHANGE_END__PORT = eINSTANCE.getComponentExchangeEnd_Port();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_EXCHANGE_END__PART = eINSTANCE.getComponentExchangeEnd_Part();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.impl.ComponentPortImpl <em>Component Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.ComponentPortImpl
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getComponentPort()
		 * @generated
		 */
		EClass COMPONENT_PORT = eINSTANCE.getComponentPort();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PORT__ORIENTATION = eINSTANCE.getComponentPort_Orientation();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PORT__KIND = eINSTANCE.getComponentPort_Kind();

		/**
		 * The meta object literal for the '<em><b>Component Exchanges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PORT__COMPONENT_EXCHANGES = eINSTANCE.getComponentPort_ComponentExchanges();

		/**
		 * The meta object literal for the '<em><b>Allocated Function Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PORT__ALLOCATED_FUNCTION_PORTS = eINSTANCE.getComponentPort_AllocatedFunctionPorts();

		/**
		 * The meta object literal for the '<em><b>Delegated Component Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PORT__DELEGATED_COMPONENT_PORTS = eINSTANCE.getComponentPort_DelegatedComponentPorts();

		/**
		 * The meta object literal for the '<em><b>Realized Component Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PORT__REALIZED_COMPONENT_PORTS = eINSTANCE.getComponentPort_RealizedComponentPorts();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainKind <em>Functional Chain Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalChainKind
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionalChainKind()
		 * @generated
		 */
		EEnum FUNCTIONAL_CHAIN_KIND = eINSTANCE.getFunctionalChainKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.FunctionKind <em>Function Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.FunctionKind
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getFunctionKind()
		 * @generated
		 */
		EEnum FUNCTION_KIND = eINSTANCE.getFunctionKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeKind <em>Component Exchange Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchangeKind
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getComponentExchangeKind()
		 * @generated
		 */
		EEnum COMPONENT_EXCHANGE_KIND = eINSTANCE.getComponentExchangeKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.ComponentPortKind <em>Component Port Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.ComponentPortKind
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getComponentPortKind()
		 * @generated
		 */
		EEnum COMPONENT_PORT_KIND = eINSTANCE.getComponentPortKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.fa.OrientationPortKind <em>Orientation Port Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.fa.OrientationPortKind
		 * @see org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl#getOrientationPortKind()
		 * @generated
		 */
		EEnum ORIENTATION_PORT_KIND = eINSTANCE.getOrientationPortKind();

	}

} //FaPackage
