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

package org.polarsys.capella.core.semantic.data.interaction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/capella/xmlpivot sourceNsURI='http://www.polarsys.org/capella/core/interaction/0.8.0'"
 * @generated
 */
public interface InteractionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interaction";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/capella/core/interaction/0.8.0/semantic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.polarsys.capella.core.data.interaction";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionPackage eINSTANCE = org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.interaction.impl.SequenceMessageImpl <em>Sequence Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.interaction.impl.SequenceMessageImpl
	 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getSequenceMessage()
	 * @generated
	 */
	int SEQUENCE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__KIND = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exchange Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__EXCHANGE_CONTEXT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invoked Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__INVOKED_OPERATION = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exchanged Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__EXCHANGED_ITEMS = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sending Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__SENDING_PART = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Receiving Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__RECEIVING_PART = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sending Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__SENDING_FUNCTION = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Receiving Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__RECEIVING_FUNCTION = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Sequence Message Valuations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE__OWNED_SEQUENCE_MESSAGE_VALUATIONS = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Sequence Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.interaction.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.interaction.impl.ScenarioImpl
	 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__OWNED_EXTENSIONS = CapellacorePackage.NAMESPACE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ID = CapellacorePackage.NAMESPACE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SID = CapellacorePackage.NAMESPACE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__OWNED_CONSTRAINTS = CapellacorePackage.NAMESPACE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = CapellacorePackage.NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SUMMARY = CapellacorePackage.NAMESPACE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__DESCRIPTION = CapellacorePackage.NAMESPACE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__REVIEW = CapellacorePackage.NAMESPACE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMESPACE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMESPACE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMESPACE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMESPACE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMESPACE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__STATUS = CapellacorePackage.NAMESPACE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__FEATURES = CapellacorePackage.NAMESPACE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__APPLIED_REQUIREMENTS = CapellacorePackage.NAMESPACE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CONTAINED_GENERIC_TRACES = CapellacorePackage.NAMESPACE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CONTAINED_REQUIREMENTS_TRACES = CapellacorePackage.NAMESPACE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Is Control Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__IS_CONTROL_OPERATOR = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__KIND = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__MERGED = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PRE_CONDITION = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__POST_CONDITION = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__OWNED_MESSAGES = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contained Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CONTAINED_FUNCTIONS = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CONTAINED_PARTS = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Referenced Scenarios</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__REFERENCED_SCENARIOS = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Realized Scenarios</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__REALIZED_SCENARIOS = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = CapellacorePackage.NAMESPACE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.interaction.impl.AbstractCapabilityImpl <em>Abstract Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.interaction.impl.AbstractCapabilityImpl
	 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getAbstractCapability()
	 * @generated
	 */
	int ABSTRACT_CAPABILITY = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__OWNED_EXTENSIONS = CapellacorePackage.STRUCTURE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__ID = CapellacorePackage.STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__SID = CapellacorePackage.STRUCTURE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__OWNED_CONSTRAINTS = CapellacorePackage.STRUCTURE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__NAME = CapellacorePackage.STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__SUMMARY = CapellacorePackage.STRUCTURE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__DESCRIPTION = CapellacorePackage.STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__REVIEW = CapellacorePackage.STRUCTURE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__OWNED_PROPERTY_VALUES = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.STRUCTURE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__APPLIED_PROPERTY_VALUES = CapellacorePackage.STRUCTURE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.STRUCTURE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__STATUS = CapellacorePackage.STRUCTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__FEATURES = CapellacorePackage.STRUCTURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__APPLIED_REQUIREMENTS = CapellacorePackage.STRUCTURE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__CONTAINED_GENERIC_TRACES = CapellacorePackage.STRUCTURE__CONTAINED_GENERIC_TRACES;

	/**
	 * The feature id for the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__CONTAINED_REQUIREMENTS_TRACES = CapellacorePackage.STRUCTURE__CONTAINED_REQUIREMENTS_TRACES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__OWNED_PROPERTY_VALUE_PKGS = CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;

	/**
	 * The feature id for the '<em><b>Owned Functional Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__OWNED_FUNCTIONAL_CHAINS = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__PRE_CONDITION = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__POST_CONDITION = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__OWNED_SCENARIOS = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__SUPER = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Included Abstract Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__INCLUDED_ABSTRACT_CAPABILITIES = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Extended Abstract Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__EXTENDED_ABSTRACT_CAPABILITIES = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Available In States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__AVAILABLE_IN_STATES = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Involved Abstract Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__INVOLVED_ABSTRACT_FUNCTIONS = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Involved Functional Chains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__INVOLVED_FUNCTIONAL_CHAINS = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Abstract Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY_FEATURE_COUNT = CapellacorePackage.STRUCTURE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.interaction.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.interaction.impl.CombinedFragmentImpl
	 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getCombinedFragment()
	 * @generated
	 */
	int COMBINED_FRAGMENT = 3;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__OPERATOR = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.interaction.impl.InteractionOperandImpl <em>Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionOperandImpl
	 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getInteractionOperand()
	 * @generated
	 */
	int INTERACTION_OPERAND = 4;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__GUARD = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.interaction.impl.SequenceMessageValuationImpl <em>Sequence Message Valuation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.interaction.impl.SequenceMessageValuationImpl
	 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getSequenceMessageValuation()
	 * @generated
	 */
	int SEQUENCE_MESSAGE_VALUATION = 5;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__OWNED_EXTENSIONS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__ID = CapellacorePackage.CAPELLA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__SID = CapellacorePackage.CAPELLA_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__OWNED_CONSTRAINTS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__SUMMARY = CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__DESCRIPTION = CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__REVIEW = CapellacorePackage.CAPELLA_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__OWNED_PROPERTY_VALUES = CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__APPLIED_PROPERTY_VALUES = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__STATUS = CapellacorePackage.CAPELLA_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__FEATURES = CapellacorePackage.CAPELLA_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__APPLIED_REQUIREMENTS = CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Exchange Item Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__EXCHANGE_ITEM_ELEMENT = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION__VALUE = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence Message Valuation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MESSAGE_VALUATION_FEATURE_COUNT = CapellacorePackage.CAPELLA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.interaction.MessageKind <em>Message Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.interaction.MessageKind
	 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getMessageKind()
	 * @generated
	 */
	int MESSAGE_KIND = 6;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.interaction.ScenarioKind <em>Scenario Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.interaction.ScenarioKind
	 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getScenarioKind()
	 * @generated
	 */
	int SCENARIO_KIND = 7;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.interaction.InteractionOperatorKind <em>Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionOperatorKind
	 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getInteractionOperatorKind()
	 * @generated
	 */
	int INTERACTION_OPERATOR_KIND = 8;


	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage <em>Sequence Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Message</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.SequenceMessage
	 * @generated
	 */
	EClass getSequenceMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getKind()
	 * @see #getSequenceMessage()
	 * @generated
	 */
	EAttribute getSequenceMessage_Kind();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getExchangeContext <em>Exchange Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exchange Context</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getExchangeContext()
	 * @see #getSequenceMessage()
	 * @generated
	 */
	EReference getSequenceMessage_ExchangeContext();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getInvokedOperation <em>Invoked Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoked Operation</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getInvokedOperation()
	 * @see #getSequenceMessage()
	 * @generated
	 */
	EReference getSequenceMessage_InvokedOperation();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getExchangedItems <em>Exchanged Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exchanged Items</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getExchangedItems()
	 * @see #getSequenceMessage()
	 * @generated
	 */
	EReference getSequenceMessage_ExchangedItems();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getSendingPart <em>Sending Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sending Part</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getSendingPart()
	 * @see #getSequenceMessage()
	 * @generated
	 */
	EReference getSequenceMessage_SendingPart();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getReceivingPart <em>Receiving Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiving Part</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getReceivingPart()
	 * @see #getSequenceMessage()
	 * @generated
	 */
	EReference getSequenceMessage_ReceivingPart();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getSendingFunction <em>Sending Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sending Function</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getSendingFunction()
	 * @see #getSequenceMessage()
	 * @generated
	 */
	EReference getSequenceMessage_SendingFunction();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getReceivingFunction <em>Receiving Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiving Function</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getReceivingFunction()
	 * @see #getSequenceMessage()
	 * @generated
	 */
	EReference getSequenceMessage_ReceivingFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getOwnedSequenceMessageValuations <em>Owned Sequence Message Valuations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Sequence Message Valuations</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getOwnedSequenceMessageValuations()
	 * @see #getSequenceMessage()
	 * @generated
	 */
	EReference getSequenceMessage_OwnedSequenceMessageValuations();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.interaction.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.Scenario#getKind()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#isMerged <em>Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merged</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.Scenario#isMerged()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Merged();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getPreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre Condition</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.Scenario#getPreCondition()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_PreCondition();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post Condition</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.Scenario#getPostCondition()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_PostCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getOwnedMessages <em>Owned Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Messages</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.Scenario#getOwnedMessages()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_OwnedMessages();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getContainedFunctions <em>Contained Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Functions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.Scenario#getContainedFunctions()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ContainedFunctions();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getContainedParts <em>Contained Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Parts</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.Scenario#getContainedParts()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ContainedParts();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getReferencedScenarios <em>Referenced Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Scenarios</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.Scenario#getReferencedScenarios()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ReferencedScenarios();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getRealizedScenarios <em>Realized Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Scenarios</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.Scenario#getRealizedScenarios()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_RealizedScenarios();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability <em>Abstract Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Capability</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.AbstractCapability
	 * @generated
	 */
	EClass getAbstractCapability();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getPreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre Condition</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getPreCondition()
	 * @see #getAbstractCapability()
	 * @generated
	 */
	EReference getAbstractCapability_PreCondition();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post Condition</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getPostCondition()
	 * @see #getAbstractCapability()
	 * @generated
	 */
	EReference getAbstractCapability_PostCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getOwnedScenarios <em>Owned Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Scenarios</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getOwnedScenarios()
	 * @see #getAbstractCapability()
	 * @generated
	 */
	EReference getAbstractCapability_OwnedScenarios();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getSuper()
	 * @see #getAbstractCapability()
	 * @generated
	 */
	EReference getAbstractCapability_Super();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getIncludedAbstractCapabilities <em>Included Abstract Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Abstract Capabilities</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getIncludedAbstractCapabilities()
	 * @see #getAbstractCapability()
	 * @generated
	 */
	EReference getAbstractCapability_IncludedAbstractCapabilities();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getExtendedAbstractCapabilities <em>Extended Abstract Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extended Abstract Capabilities</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getExtendedAbstractCapabilities()
	 * @see #getAbstractCapability()
	 * @generated
	 */
	EReference getAbstractCapability_ExtendedAbstractCapabilities();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getAvailableInStates <em>Available In States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Available In States</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getAvailableInStates()
	 * @see #getAbstractCapability()
	 * @generated
	 */
	EReference getAbstractCapability_AvailableInStates();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getInvolvedAbstractFunctions <em>Involved Abstract Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved Abstract Functions</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getInvolvedAbstractFunctions()
	 * @see #getAbstractCapability()
	 * @generated
	 */
	EReference getAbstractCapability_InvolvedAbstractFunctions();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getInvolvedFunctionalChains <em>Involved Functional Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved Functional Chains</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getInvolvedFunctionalChains()
	 * @see #getAbstractCapability()
	 * @generated
	 */
	EReference getAbstractCapability_InvolvedFunctionalChains();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.interaction.CombinedFragment <em>Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Fragment</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.CombinedFragment
	 * @generated
	 */
	EClass getCombinedFragment();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.interaction.CombinedFragment#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.CombinedFragment#getOperator()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EAttribute getCombinedFragment_Operator();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.interaction.InteractionOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionOperand
	 * @generated
	 */
	EClass getInteractionOperand();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.interaction.InteractionOperand#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionOperand#getGuard()
	 * @see #getInteractionOperand()
	 * @generated
	 */
	EReference getInteractionOperand_Guard();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessageValuation <em>Sequence Message Valuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Message Valuation</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.SequenceMessageValuation
	 * @generated
	 */
	EClass getSequenceMessageValuation();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessageValuation#getExchangeItemElement <em>Exchange Item Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exchange Item Element</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.SequenceMessageValuation#getExchangeItemElement()
	 * @see #getSequenceMessageValuation()
	 * @generated
	 */
	EReference getSequenceMessageValuation_ExchangeItemElement();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessageValuation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.SequenceMessageValuation#getValue()
	 * @see #getSequenceMessageValuation()
	 * @generated
	 */
	EReference getSequenceMessageValuation_Value();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.capella.core.semantic.data.interaction.MessageKind <em>Message Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.MessageKind
	 * @generated
	 */
	EEnum getMessageKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.capella.core.semantic.data.interaction.ScenarioKind <em>Scenario Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scenario Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.ScenarioKind
	 * @generated
	 */
	EEnum getScenarioKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.capella.core.semantic.data.interaction.InteractionOperatorKind <em>Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionOperatorKind
	 * @generated
	 */
	EEnum getInteractionOperatorKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InteractionFactory getInteractionFactory();

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
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.interaction.impl.SequenceMessageImpl <em>Sequence Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.interaction.impl.SequenceMessageImpl
		 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getSequenceMessage()
		 * @generated
		 */
		EClass SEQUENCE_MESSAGE = eINSTANCE.getSequenceMessage();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_MESSAGE__KIND = eINSTANCE.getSequenceMessage_Kind();

		/**
		 * The meta object literal for the '<em><b>Exchange Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_MESSAGE__EXCHANGE_CONTEXT = eINSTANCE.getSequenceMessage_ExchangeContext();

		/**
		 * The meta object literal for the '<em><b>Invoked Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_MESSAGE__INVOKED_OPERATION = eINSTANCE.getSequenceMessage_InvokedOperation();

		/**
		 * The meta object literal for the '<em><b>Exchanged Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_MESSAGE__EXCHANGED_ITEMS = eINSTANCE.getSequenceMessage_ExchangedItems();

		/**
		 * The meta object literal for the '<em><b>Sending Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_MESSAGE__SENDING_PART = eINSTANCE.getSequenceMessage_SendingPart();

		/**
		 * The meta object literal for the '<em><b>Receiving Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_MESSAGE__RECEIVING_PART = eINSTANCE.getSequenceMessage_ReceivingPart();

		/**
		 * The meta object literal for the '<em><b>Sending Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_MESSAGE__SENDING_FUNCTION = eINSTANCE.getSequenceMessage_SendingFunction();

		/**
		 * The meta object literal for the '<em><b>Receiving Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_MESSAGE__RECEIVING_FUNCTION = eINSTANCE.getSequenceMessage_ReceivingFunction();

		/**
		 * The meta object literal for the '<em><b>Owned Sequence Message Valuations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_MESSAGE__OWNED_SEQUENCE_MESSAGE_VALUATIONS = eINSTANCE.getSequenceMessage_OwnedSequenceMessageValuations();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.interaction.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.interaction.impl.ScenarioImpl
		 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__KIND = eINSTANCE.getScenario_Kind();

		/**
		 * The meta object literal for the '<em><b>Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__MERGED = eINSTANCE.getScenario_Merged();

		/**
		 * The meta object literal for the '<em><b>Pre Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__PRE_CONDITION = eINSTANCE.getScenario_PreCondition();

		/**
		 * The meta object literal for the '<em><b>Post Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__POST_CONDITION = eINSTANCE.getScenario_PostCondition();

		/**
		 * The meta object literal for the '<em><b>Owned Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__OWNED_MESSAGES = eINSTANCE.getScenario_OwnedMessages();

		/**
		 * The meta object literal for the '<em><b>Contained Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__CONTAINED_FUNCTIONS = eINSTANCE.getScenario_ContainedFunctions();

		/**
		 * The meta object literal for the '<em><b>Contained Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__CONTAINED_PARTS = eINSTANCE.getScenario_ContainedParts();

		/**
		 * The meta object literal for the '<em><b>Referenced Scenarios</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__REFERENCED_SCENARIOS = eINSTANCE.getScenario_ReferencedScenarios();

		/**
		 * The meta object literal for the '<em><b>Realized Scenarios</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__REALIZED_SCENARIOS = eINSTANCE.getScenario_RealizedScenarios();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.interaction.impl.AbstractCapabilityImpl <em>Abstract Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.interaction.impl.AbstractCapabilityImpl
		 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getAbstractCapability()
		 * @generated
		 */
		EClass ABSTRACT_CAPABILITY = eINSTANCE.getAbstractCapability();

		/**
		 * The meta object literal for the '<em><b>Pre Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CAPABILITY__PRE_CONDITION = eINSTANCE.getAbstractCapability_PreCondition();

		/**
		 * The meta object literal for the '<em><b>Post Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CAPABILITY__POST_CONDITION = eINSTANCE.getAbstractCapability_PostCondition();

		/**
		 * The meta object literal for the '<em><b>Owned Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CAPABILITY__OWNED_SCENARIOS = eINSTANCE.getAbstractCapability_OwnedScenarios();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CAPABILITY__SUPER = eINSTANCE.getAbstractCapability_Super();

		/**
		 * The meta object literal for the '<em><b>Included Abstract Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CAPABILITY__INCLUDED_ABSTRACT_CAPABILITIES = eINSTANCE.getAbstractCapability_IncludedAbstractCapabilities();

		/**
		 * The meta object literal for the '<em><b>Extended Abstract Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CAPABILITY__EXTENDED_ABSTRACT_CAPABILITIES = eINSTANCE.getAbstractCapability_ExtendedAbstractCapabilities();

		/**
		 * The meta object literal for the '<em><b>Available In States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CAPABILITY__AVAILABLE_IN_STATES = eINSTANCE.getAbstractCapability_AvailableInStates();

		/**
		 * The meta object literal for the '<em><b>Involved Abstract Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CAPABILITY__INVOLVED_ABSTRACT_FUNCTIONS = eINSTANCE.getAbstractCapability_InvolvedAbstractFunctions();

		/**
		 * The meta object literal for the '<em><b>Involved Functional Chains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CAPABILITY__INVOLVED_FUNCTIONAL_CHAINS = eINSTANCE.getAbstractCapability_InvolvedFunctionalChains();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.interaction.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.interaction.impl.CombinedFragmentImpl
		 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getCombinedFragment()
		 * @generated
		 */
		EClass COMBINED_FRAGMENT = eINSTANCE.getCombinedFragment();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINED_FRAGMENT__OPERATOR = eINSTANCE.getCombinedFragment_Operator();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.interaction.impl.InteractionOperandImpl <em>Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionOperandImpl
		 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getInteractionOperand()
		 * @generated
		 */
		EClass INTERACTION_OPERAND = eINSTANCE.getInteractionOperand();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OPERAND__GUARD = eINSTANCE.getInteractionOperand_Guard();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.interaction.impl.SequenceMessageValuationImpl <em>Sequence Message Valuation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.interaction.impl.SequenceMessageValuationImpl
		 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getSequenceMessageValuation()
		 * @generated
		 */
		EClass SEQUENCE_MESSAGE_VALUATION = eINSTANCE.getSequenceMessageValuation();

		/**
		 * The meta object literal for the '<em><b>Exchange Item Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_MESSAGE_VALUATION__EXCHANGE_ITEM_ELEMENT = eINSTANCE.getSequenceMessageValuation_ExchangeItemElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_MESSAGE_VALUATION__VALUE = eINSTANCE.getSequenceMessageValuation_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.interaction.MessageKind <em>Message Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.interaction.MessageKind
		 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getMessageKind()
		 * @generated
		 */
		EEnum MESSAGE_KIND = eINSTANCE.getMessageKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.interaction.ScenarioKind <em>Scenario Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.interaction.ScenarioKind
		 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getScenarioKind()
		 * @generated
		 */
		EEnum SCENARIO_KIND = eINSTANCE.getScenarioKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.interaction.InteractionOperatorKind <em>Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionOperatorKind
		 * @see org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl#getInteractionOperatorKind()
		 * @generated
		 */
		EEnum INTERACTION_OPERATOR_KIND = eINSTANCE.getInteractionOperatorKind();

	}

} //InteractionPackage
