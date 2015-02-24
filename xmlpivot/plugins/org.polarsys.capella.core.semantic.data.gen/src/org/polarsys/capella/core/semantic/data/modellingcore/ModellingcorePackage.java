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

package org.polarsys.capella.core.semantic.data.modellingcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.core.semantic.data.emde.EmdePackage;

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
 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcoreFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/capella/xmlpivot sourceNsURI='http://www.polarsys.org/capella/common/core/0.8.0'"
 * @generated
 */
public interface ModellingcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modellingcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/capella/common/core/0.8.0/semantic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.polarsys.capella.common.data.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModellingcorePackage eINSTANCE = org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModelElementImpl
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__OWNED_EXTENSIONS = EmdePackage.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ID = EmdePackage.EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__SID = EmdePackage.EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__OWNED_CONSTRAINTS = EmdePackage.EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = EmdePackage.EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractNamedElementImpl <em>Abstract Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractNamedElementImpl
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getAbstractNamedElement()
	 * @generated
	 */
	int ABSTRACT_NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ELEMENT__OWNED_EXTENSIONS = MODEL_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ELEMENT__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ELEMENT__SID = MODEL_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ELEMENT__OWNED_CONSTRAINTS = MODEL_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ELEMENT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.impl.InformationsExchangerImpl <em>Informations Exchanger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.InformationsExchangerImpl
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getInformationsExchanger()
	 * @generated
	 */
	int INFORMATIONS_EXCHANGER = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONS_EXCHANGER__OWNED_EXTENSIONS = MODEL_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONS_EXCHANGER__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONS_EXCHANGER__SID = MODEL_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONS_EXCHANGER__OWNED_CONSTRAINTS = MODEL_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The number of structural features of the '<em>Informations Exchanger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATIONS_EXCHANGER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.TraceableElement <em>Traceable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.TraceableElement
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getTraceableElement()
	 * @generated
	 */
	int TRACEABLE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_ELEMENT__OWNED_EXTENSIONS = MODEL_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_ELEMENT__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_ELEMENT__SID = MODEL_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_ELEMENT__OWNED_CONSTRAINTS = MODEL_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The number of structural features of the '<em>Traceable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractTypeImpl
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getAbstractType()
	 * @generated
	 */
	int ABSTRACT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE__OWNED_EXTENSIONS = ABSTRACT_NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE__ID = ABSTRACT_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE__SID = ABSTRACT_NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE__OWNED_CONSTRAINTS = ABSTRACT_NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractConstraint <em>Abstract Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractConstraint
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getAbstractConstraint()
	 * @generated
	 */
	int ABSTRACT_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__OWNED_EXTENSIONS = MODEL_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__SID = MODEL_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__OWNED_CONSTRAINTS = MODEL_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Constrained Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__CONSTRAINED_ELEMENTS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__OWNED_SPECIFICATION = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.ValueSpecification <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ValueSpecification
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__OWNED_EXTENSIONS = ABSTRACT_NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__ID = ABSTRACT_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__SID = ABSTRACT_NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__OWNED_CONSTRAINTS = ABSTRACT_NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractParameterImpl <em>Abstract Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractParameterImpl
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getAbstractParameter()
	 * @generated
	 */
	int ABSTRACT_PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__OWNED_EXTENSIONS = ABSTRACT_NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__ID = ABSTRACT_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__SID = ABSTRACT_NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__OWNED_CONSTRAINTS = ABSTRACT_NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__IS_EXCEPTION = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__IS_STREAM = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__IS_OPTIONAL = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind Of Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__KIND_OF_RATE = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__EFFECT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__RATE = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__PROBABILITY = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Abstract Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractInformationFlowImpl <em>Abstract Information Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractInformationFlowImpl
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getAbstractInformationFlow()
	 * @generated
	 */
	int ABSTRACT_INFORMATION_FLOW = 8;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFORMATION_FLOW__OWNED_EXTENSIONS = ABSTRACT_NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFORMATION_FLOW__ID = ABSTRACT_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFORMATION_FLOW__SID = ABSTRACT_NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFORMATION_FLOW__OWNED_CONSTRAINTS = ABSTRACT_NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFORMATION_FLOW__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Convoyed Informations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFORMATION_FLOW__CONVOYED_INFORMATIONS = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Information Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFORMATION_FLOW_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractExchangeItemImpl <em>Abstract Exchange Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractExchangeItemImpl
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getAbstractExchangeItem()
	 * @generated
	 */
	int ABSTRACT_EXCHANGE_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXCHANGE_ITEM__OWNED_EXTENSIONS = ABSTRACT_TYPE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXCHANGE_ITEM__ID = ABSTRACT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXCHANGE_ITEM__SID = ABSTRACT_TYPE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXCHANGE_ITEM__OWNED_CONSTRAINTS = ABSTRACT_TYPE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXCHANGE_ITEM__NAME = ABSTRACT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Abstract Exchange Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXCHANGE_ITEM_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.IState <em>IState</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.IState
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getIState()
	 * @generated
	 */
	int ISTATE = 10;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATE__OWNED_EXTENSIONS = ABSTRACT_NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATE__ID = ABSTRACT_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATE__SID = ABSTRACT_NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATE__OWNED_CONSTRAINTS = ABSTRACT_NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATE__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Referenced States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATE__REFERENCED_STATES = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Available In States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATE__AVAILABLE_IN_STATES = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATE_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.ParameterEffectKind <em>Parameter Effect Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ParameterEffectKind
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getParameterEffectKind()
	 * @generated
	 */
	int PARAMETER_EFFECT_KIND = 11;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.RateKind <em>Rate Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.RateKind
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getRateKind()
	 * @generated
	 */
	int RATE_KIND = 12;


	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.modellingcore.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.modellingcore.ModelElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModelElement#getId()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.modellingcore.ModelElement#getSid <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModelElement#getSid()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Sid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.core.semantic.data.modellingcore.ModelElement#getOwnedConstraints <em>Owned Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Constraints</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModelElement#getOwnedConstraints()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_OwnedConstraints();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractNamedElement <em>Abstract Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Named Element</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractNamedElement
	 * @generated
	 */
	EClass getAbstractNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractNamedElement#getName()
	 * @see #getAbstractNamedElement()
	 * @generated
	 */
	EAttribute getAbstractNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.modellingcore.InformationsExchanger <em>Informations Exchanger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Informations Exchanger</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.InformationsExchanger
	 * @generated
	 */
	EClass getInformationsExchanger();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.modellingcore.TraceableElement <em>Traceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceable Element</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.TraceableElement
	 * @generated
	 */
	EClass getTraceableElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractType
	 * @generated
	 */
	EClass getAbstractType();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractConstraint <em>Abstract Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Constraint</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractConstraint
	 * @generated
	 */
	EClass getAbstractConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractConstraint#getConstrainedElements <em>Constrained Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained Elements</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractConstraint#getConstrainedElements()
	 * @see #getAbstractConstraint()
	 * @generated
	 */
	EReference getAbstractConstraint_ConstrainedElements();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractConstraint#getOwnedSpecification <em>Owned Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Specification</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractConstraint#getOwnedSpecification()
	 * @see #getAbstractConstraint()
	 * @generated
	 */
	EReference getAbstractConstraint_OwnedSpecification();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.modellingcore.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter <em>Abstract Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Parameter</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter
	 * @generated
	 */
	EClass getAbstractParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#isIsException <em>Is Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Exception</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#isIsException()
	 * @see #getAbstractParameter()
	 * @generated
	 */
	EAttribute getAbstractParameter_IsException();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#isIsStream <em>Is Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Stream</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#isIsStream()
	 * @see #getAbstractParameter()
	 * @generated
	 */
	EAttribute getAbstractParameter_IsStream();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#isIsOptional()
	 * @see #getAbstractParameter()
	 * @generated
	 */
	EAttribute getAbstractParameter_IsOptional();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#getKindOfRate <em>Kind Of Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Of Rate</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#getKindOfRate()
	 * @see #getAbstractParameter()
	 * @generated
	 */
	EAttribute getAbstractParameter_KindOfRate();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#getEffect()
	 * @see #getAbstractParameter()
	 * @generated
	 */
	EAttribute getAbstractParameter_Effect();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#getRate()
	 * @see #getAbstractParameter()
	 * @generated
	 */
	EReference getAbstractParameter_Rate();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Probability</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#getProbability()
	 * @see #getAbstractParameter()
	 * @generated
	 */
	EReference getAbstractParameter_Probability();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractInformationFlow <em>Abstract Information Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Information Flow</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractInformationFlow
	 * @generated
	 */
	EClass getAbstractInformationFlow();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractInformationFlow#getConvoyedInformations <em>Convoyed Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Convoyed Informations</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractInformationFlow#getConvoyedInformations()
	 * @see #getAbstractInformationFlow()
	 * @generated
	 */
	EReference getAbstractInformationFlow_ConvoyedInformations();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractExchangeItem <em>Abstract Exchange Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Exchange Item</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractExchangeItem
	 * @generated
	 */
	EClass getAbstractExchangeItem();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.modellingcore.IState <em>IState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IState</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.IState
	 * @generated
	 */
	EClass getIState();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.modellingcore.IState#getReferencedStates <em>Referenced States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced States</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.IState#getReferencedStates()
	 * @see #getIState()
	 * @generated
	 */
	EReference getIState_ReferencedStates();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.capella.core.semantic.data.modellingcore.IState#getAvailableInStates <em>Available In States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Available In States</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.IState#getAvailableInStates()
	 * @see #getIState()
	 * @generated
	 */
	EReference getIState_AvailableInStates();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.capella.core.semantic.data.modellingcore.ParameterEffectKind <em>Parameter Effect Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Effect Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ParameterEffectKind
	 * @generated
	 */
	EEnum getParameterEffectKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.capella.core.semantic.data.modellingcore.RateKind <em>Rate Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rate Kind</em>'.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.RateKind
	 * @generated
	 */
	EEnum getRateKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModellingcoreFactory getModellingcoreFactory();

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
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModelElementImpl
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__ID = eINSTANCE.getModelElement_Id();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__SID = eINSTANCE.getModelElement_Sid();

		/**
		 * The meta object literal for the '<em><b>Owned Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__OWNED_CONSTRAINTS = eINSTANCE.getModelElement_OwnedConstraints();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractNamedElementImpl <em>Abstract Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractNamedElementImpl
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getAbstractNamedElement()
		 * @generated
		 */
		EClass ABSTRACT_NAMED_ELEMENT = eINSTANCE.getAbstractNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAMED_ELEMENT__NAME = eINSTANCE.getAbstractNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.impl.InformationsExchangerImpl <em>Informations Exchanger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.InformationsExchangerImpl
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getInformationsExchanger()
		 * @generated
		 */
		EClass INFORMATIONS_EXCHANGER = eINSTANCE.getInformationsExchanger();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.TraceableElement <em>Traceable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.TraceableElement
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getTraceableElement()
		 * @generated
		 */
		EClass TRACEABLE_ELEMENT = eINSTANCE.getTraceableElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractTypeImpl
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getAbstractType()
		 * @generated
		 */
		EClass ABSTRACT_TYPE = eINSTANCE.getAbstractType();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractConstraint <em>Abstract Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.AbstractConstraint
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getAbstractConstraint()
		 * @generated
		 */
		EClass ABSTRACT_CONSTRAINT = eINSTANCE.getAbstractConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTRAINT__CONSTRAINED_ELEMENTS = eINSTANCE.getAbstractConstraint_ConstrainedElements();

		/**
		 * The meta object literal for the '<em><b>Owned Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTRAINT__OWNED_SPECIFICATION = eINSTANCE.getAbstractConstraint_OwnedSpecification();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.ValueSpecification <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.ValueSpecification
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractParameterImpl <em>Abstract Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractParameterImpl
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getAbstractParameter()
		 * @generated
		 */
		EClass ABSTRACT_PARAMETER = eINSTANCE.getAbstractParameter();

		/**
		 * The meta object literal for the '<em><b>Is Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PARAMETER__IS_EXCEPTION = eINSTANCE.getAbstractParameter_IsException();

		/**
		 * The meta object literal for the '<em><b>Is Stream</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PARAMETER__IS_STREAM = eINSTANCE.getAbstractParameter_IsStream();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PARAMETER__IS_OPTIONAL = eINSTANCE.getAbstractParameter_IsOptional();

		/**
		 * The meta object literal for the '<em><b>Kind Of Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PARAMETER__KIND_OF_RATE = eINSTANCE.getAbstractParameter_KindOfRate();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PARAMETER__EFFECT = eINSTANCE.getAbstractParameter_Effect();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PARAMETER__RATE = eINSTANCE.getAbstractParameter_Rate();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PARAMETER__PROBABILITY = eINSTANCE.getAbstractParameter_Probability();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractInformationFlowImpl <em>Abstract Information Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractInformationFlowImpl
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getAbstractInformationFlow()
		 * @generated
		 */
		EClass ABSTRACT_INFORMATION_FLOW = eINSTANCE.getAbstractInformationFlow();

		/**
		 * The meta object literal for the '<em><b>Convoyed Informations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_INFORMATION_FLOW__CONVOYED_INFORMATIONS = eINSTANCE.getAbstractInformationFlow_ConvoyedInformations();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractExchangeItemImpl <em>Abstract Exchange Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractExchangeItemImpl
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getAbstractExchangeItem()
		 * @generated
		 */
		EClass ABSTRACT_EXCHANGE_ITEM = eINSTANCE.getAbstractExchangeItem();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.IState <em>IState</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.IState
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getIState()
		 * @generated
		 */
		EClass ISTATE = eINSTANCE.getIState();

		/**
		 * The meta object literal for the '<em><b>Referenced States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTATE__REFERENCED_STATES = eINSTANCE.getIState_ReferencedStates();

		/**
		 * The meta object literal for the '<em><b>Available In States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTATE__AVAILABLE_IN_STATES = eINSTANCE.getIState_AvailableInStates();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.ParameterEffectKind <em>Parameter Effect Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.ParameterEffectKind
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getParameterEffectKind()
		 * @generated
		 */
		EEnum PARAMETER_EFFECT_KIND = eINSTANCE.getParameterEffectKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.modellingcore.RateKind <em>Rate Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.RateKind
		 * @see org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl#getRateKind()
		 * @generated
		 */
		EEnum RATE_KIND = eINSTANCE.getRateKind();

	}

} //ModellingcorePackage
