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

package org.polarsys.capella.core.semantic.data.capellamodeller;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage;

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
 * @see org.polarsys.capella.core.semantic.data.capellamodeller.CapellamodellerFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/capella/xmlpivot sourceNsURI='http://www.polarsys.org/capella/core/modeller/0.8.0'"
 * @generated
 */
public interface CapellamodellerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "capellamodeller";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/capella/core/modeller/0.8.0/semantic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.polarsys.capella.core.data.capellamodeller";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CapellamodellerPackage eINSTANCE = org.polarsys.capella.core.semantic.data.capellamodeller.impl.CapellamodellerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.impl.ProjectImpl
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.impl.CapellamodellerPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OWNED_EXTENSIONS = CapellacorePackage.STRUCTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID = CapellacorePackage.STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SID = CapellacorePackage.STRUCTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OWNED_CONSTRAINTS = CapellacorePackage.STRUCTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = CapellacorePackage.STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SUMMARY = CapellacorePackage.STRUCTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = CapellacorePackage.STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REVIEW = CapellacorePackage.STRUCTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OWNED_PROPERTY_VALUES = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.STRUCTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__APPLIED_PROPERTY_VALUES = CapellacorePackage.STRUCTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.STRUCTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__STATUS = CapellacorePackage.STRUCTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FEATURES = CapellacorePackage.STRUCTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__APPLIED_REQUIREMENTS = CapellacorePackage.STRUCTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONTAINED_GENERIC_TRACES = CapellacorePackage.STRUCTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONTAINED_REQUIREMENTS_TRACES = CapellacorePackage.STRUCTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OWNED_PROPERTY_VALUE_PKGS = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Key Value Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__KEY_VALUE_PAIRS = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Model Roots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OWNED_MODEL_ROOTS = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.capellamodeller.ModelRoot <em>Model Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.ModelRoot
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.impl.CapellamodellerPackageImpl#getModelRoot()
	 * @generated
	 */
	int MODEL_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__OWNED_EXTENSIONS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__ID = CapellacorePackage.CAPELLA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__SID = CapellacorePackage.CAPELLA_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__OWNED_CONSTRAINTS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__SUMMARY = CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__DESCRIPTION = CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__REVIEW = CapellacorePackage.CAPELLA_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__OWNED_PROPERTY_VALUES = CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__APPLIED_PROPERTY_VALUES = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__STATUS = CapellacorePackage.CAPELLA_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__FEATURES = CapellacorePackage.CAPELLA_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__APPLIED_REQUIREMENTS = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT_FEATURE_COUNT = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl <em>System Engineering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.impl.CapellamodellerPackageImpl#getSystemEngineering()
	 * @generated
	 */
	int SYSTEM_ENGINEERING = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__OWNED_EXTENSIONS = MODEL_ROOT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__ID = MODEL_ROOT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__SID = MODEL_ROOT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__OWNED_CONSTRAINTS = MODEL_ROOT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__SUMMARY = MODEL_ROOT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__DESCRIPTION = MODEL_ROOT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__REVIEW = MODEL_ROOT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUES = MODEL_ROOT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__OWNED_ENUMERATION_PROPERTY_TYPES = MODEL_ROOT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__APPLIED_PROPERTY_VALUES = MODEL_ROOT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUE_GROUPS = MODEL_ROOT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__APPLIED_PROPERTY_VALUE_GROUPS = MODEL_ROOT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__STATUS = MODEL_ROOT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__FEATURES = MODEL_ROOT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__APPLIED_REQUIREMENTS = MODEL_ROOT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__NAME = MODEL_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__CONTAINED_GENERIC_TRACES = MODEL_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__CONTAINED_REQUIREMENTS_TRACES = MODEL_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUE_PKGS = MODEL_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contained Operational Analysis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__CONTAINED_OPERATIONAL_ANALYSIS = MODEL_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contained System Analysis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__CONTAINED_SYSTEM_ANALYSIS = MODEL_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contained Logical Architectures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__CONTAINED_LOGICAL_ARCHITECTURES = MODEL_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contained Physical Architectures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__CONTAINED_PHYSICAL_ARCHITECTURES = MODEL_ROOT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Contained EPBS Architectures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__CONTAINED_EPBS_ARCHITECTURES = MODEL_ROOT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Contained Shared Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING__CONTAINED_SHARED_PKGS = MODEL_ROOT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>System Engineering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENGINEERING_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.impl.LibraryImpl
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.impl.CapellamodellerPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 3;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_EXTENSIONS = PROJECT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ID = PROJECT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__SID = PROJECT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_CONSTRAINTS = PROJECT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = PROJECT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__SUMMARY = PROJECT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DESCRIPTION = PROJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__REVIEW = PROJECT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_PROPERTY_VALUES = PROJECT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_ENUMERATION_PROPERTY_TYPES = PROJECT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__APPLIED_PROPERTY_VALUES = PROJECT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_PROPERTY_VALUE_GROUPS = PROJECT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__APPLIED_PROPERTY_VALUE_GROUPS = PROJECT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__STATUS = PROJECT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__FEATURES = PROJECT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__APPLIED_REQUIREMENTS = PROJECT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__CONTAINED_GENERIC_TRACES = PROJECT__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__CONTAINED_REQUIREMENTS_TRACES = PROJECT__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_PROPERTY_VALUE_PKGS = PROJECT__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Key Value Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__KEY_VALUE_PAIRS = PROJECT__KEY_VALUE_PAIRS;

	/**
	 * The feature id for the '<em><b>Owned Model Roots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_MODEL_ROOTS = PROJECT__OWNED_MODEL_ROOTS;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = PROJECT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.capellamodeller.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.capellamodeller.Project#getKeyValuePairs <em>Key Value Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Value Pairs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.Project#getKeyValuePairs()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_KeyValuePairs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.capellamodeller.Project#getOwnedModelRoots <em>Owned Model Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Model Roots</em>'.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.Project#getOwnedModelRoots()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_OwnedModelRoots();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.capellamodeller.ModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Root</em>'.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.ModelRoot
	 * @generated
	 */
	EClass getModelRoot();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering <em>System Engineering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Engineering</em>'.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering
	 * @generated
	 */
	EClass getSystemEngineering();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedOperationalAnalysis <em>Contained Operational Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Operational Analysis</em>'.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedOperationalAnalysis()
	 * @see #getSystemEngineering()
	 * @generated
	 */
	EReference getSystemEngineering_ContainedOperationalAnalysis();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedSystemAnalysis <em>Contained System Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained System Analysis</em>'.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedSystemAnalysis()
	 * @see #getSystemEngineering()
	 * @generated
	 */
	EReference getSystemEngineering_ContainedSystemAnalysis();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedLogicalArchitectures <em>Contained Logical Architectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Logical Architectures</em>'.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedLogicalArchitectures()
	 * @see #getSystemEngineering()
	 * @generated
	 */
	EReference getSystemEngineering_ContainedLogicalArchitectures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedPhysicalArchitectures <em>Contained Physical Architectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Physical Architectures</em>'.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedPhysicalArchitectures()
	 * @see #getSystemEngineering()
	 * @generated
	 */
	EReference getSystemEngineering_ContainedPhysicalArchitectures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedEPBSArchitectures <em>Contained EPBS Architectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained EPBS Architectures</em>'.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedEPBSArchitectures()
	 * @see #getSystemEngineering()
	 * @generated
	 */
	EReference getSystemEngineering_ContainedEPBSArchitectures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedSharedPkgs <em>Contained Shared Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Shared Pkgs</em>'.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedSharedPkgs()
	 * @see #getSystemEngineering()
	 * @generated
	 */
	EReference getSystemEngineering_ContainedSharedPkgs();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.capellamodeller.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CapellamodellerFactory getCapellamodellerFactory();

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
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.capellamodeller.impl.ProjectImpl
		 * @see org.polarsys.capella.core.semantic.data.capellamodeller.impl.CapellamodellerPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Key Value Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__KEY_VALUE_PAIRS = eINSTANCE.getProject_KeyValuePairs();

		/**
		 * The meta object literal for the '<em><b>Owned Model Roots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__OWNED_MODEL_ROOTS = eINSTANCE.getProject_OwnedModelRoots();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.capellamodeller.ModelRoot <em>Model Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.capellamodeller.ModelRoot
		 * @see org.polarsys.capella.core.semantic.data.capellamodeller.impl.CapellamodellerPackageImpl#getModelRoot()
		 * @generated
		 */
		EClass MODEL_ROOT = eINSTANCE.getModelRoot();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl <em>System Engineering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl
		 * @see org.polarsys.capella.core.semantic.data.capellamodeller.impl.CapellamodellerPackageImpl#getSystemEngineering()
		 * @generated
		 */
		EClass SYSTEM_ENGINEERING = eINSTANCE.getSystemEngineering();

		/**
		 * The meta object literal for the '<em><b>Contained Operational Analysis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ENGINEERING__CONTAINED_OPERATIONAL_ANALYSIS = eINSTANCE.getSystemEngineering_ContainedOperationalAnalysis();

		/**
		 * The meta object literal for the '<em><b>Contained System Analysis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ENGINEERING__CONTAINED_SYSTEM_ANALYSIS = eINSTANCE.getSystemEngineering_ContainedSystemAnalysis();

		/**
		 * The meta object literal for the '<em><b>Contained Logical Architectures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ENGINEERING__CONTAINED_LOGICAL_ARCHITECTURES = eINSTANCE.getSystemEngineering_ContainedLogicalArchitectures();

		/**
		 * The meta object literal for the '<em><b>Contained Physical Architectures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ENGINEERING__CONTAINED_PHYSICAL_ARCHITECTURES = eINSTANCE.getSystemEngineering_ContainedPhysicalArchitectures();

		/**
		 * The meta object literal for the '<em><b>Contained EPBS Architectures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ENGINEERING__CONTAINED_EPBS_ARCHITECTURES = eINSTANCE.getSystemEngineering_ContainedEPBSArchitectures();

		/**
		 * The meta object literal for the '<em><b>Contained Shared Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ENGINEERING__CONTAINED_SHARED_PKGS = eINSTANCE.getSystemEngineering_ContainedSharedPkgs();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.capellamodeller.impl.LibraryImpl
		 * @see org.polarsys.capella.core.semantic.data.capellamodeller.impl.CapellamodellerPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

	}

} //CapellamodellerPackage
