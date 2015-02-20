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

package org.polarsys.capella.core.semantic.data.behavior;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.polarsys.capella.core.semantic.data.behavior.BehaviorFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/capella/xmlpivot sourceNsURI='http://www.polarsys.org/capella/common/behavior/0.8.0'"
 * @generated
 */
public interface BehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/capella/common/behavior/0.8.0/semantic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.polarsys.capella.common.data.behavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorPackage eINSTANCE = org.polarsys.capella.core.semantic.data.behavior.impl.BehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.behavior.AbstractBehavior <em>Abstract Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.behavior.AbstractBehavior
	 * @see org.polarsys.capella.core.semantic.data.behavior.impl.BehaviorPackageImpl#getAbstractBehavior()
	 * @generated
	 */
	int ABSTRACT_BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BEHAVIOR__OWNED_EXTENSIONS = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BEHAVIOR__ID = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BEHAVIOR__SID = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BEHAVIOR__OWNED_CONSTRAINTS = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BEHAVIOR__NAME = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Control Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BEHAVIOR__IS_CONTROL_OPERATOR = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BEHAVIOR_FEATURE_COUNT = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.behavior.AbstractEvent <em>Abstract Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.behavior.AbstractEvent
	 * @see org.polarsys.capella.core.semantic.data.behavior.impl.BehaviorPackageImpl#getAbstractEvent()
	 * @generated
	 */
	int ABSTRACT_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__OWNED_EXTENSIONS = ModellingcorePackage.ABSTRACT_TYPE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__ID = ModellingcorePackage.ABSTRACT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__SID = ModellingcorePackage.ABSTRACT_TYPE__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__OWNED_CONSTRAINTS = ModellingcorePackage.ABSTRACT_TYPE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__NAME = ModellingcorePackage.ABSTRACT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Abstract Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_FEATURE_COUNT = ModellingcorePackage.ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.core.semantic.data.behavior.AbstractTimeEvent <em>Abstract Time Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.semantic.data.behavior.AbstractTimeEvent
	 * @see org.polarsys.capella.core.semantic.data.behavior.impl.BehaviorPackageImpl#getAbstractTimeEvent()
	 * @generated
	 */
	int ABSTRACT_TIME_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_EVENT__OWNED_EXTENSIONS = ABSTRACT_EVENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_EVENT__ID = ABSTRACT_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_EVENT__SID = ABSTRACT_EVENT__SID;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_EVENT__OWNED_CONSTRAINTS = ABSTRACT_EVENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_EVENT__NAME = ABSTRACT_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_EVENT__IS_RELATIVE = ABSTRACT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Time Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_EVENT_FEATURE_COUNT = ABSTRACT_EVENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.behavior.AbstractBehavior <em>Abstract Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Behavior</em>'.
	 * @see org.polarsys.capella.core.semantic.data.behavior.AbstractBehavior
	 * @generated
	 */
	EClass getAbstractBehavior();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.behavior.AbstractBehavior#isIsControlOperator <em>Is Control Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Control Operator</em>'.
	 * @see org.polarsys.capella.core.semantic.data.behavior.AbstractBehavior#isIsControlOperator()
	 * @see #getAbstractBehavior()
	 * @generated
	 */
	EAttribute getAbstractBehavior_IsControlOperator();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.behavior.AbstractEvent <em>Abstract Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Event</em>'.
	 * @see org.polarsys.capella.core.semantic.data.behavior.AbstractEvent
	 * @generated
	 */
	EClass getAbstractEvent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.core.semantic.data.behavior.AbstractTimeEvent <em>Abstract Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Time Event</em>'.
	 * @see org.polarsys.capella.core.semantic.data.behavior.AbstractTimeEvent
	 * @generated
	 */
	EClass getAbstractTimeEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.core.semantic.data.behavior.AbstractTimeEvent#isIsRelative <em>Is Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Relative</em>'.
	 * @see org.polarsys.capella.core.semantic.data.behavior.AbstractTimeEvent#isIsRelative()
	 * @see #getAbstractTimeEvent()
	 * @generated
	 */
	EAttribute getAbstractTimeEvent_IsRelative();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviorFactory getBehaviorFactory();

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
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.behavior.AbstractBehavior <em>Abstract Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.behavior.AbstractBehavior
		 * @see org.polarsys.capella.core.semantic.data.behavior.impl.BehaviorPackageImpl#getAbstractBehavior()
		 * @generated
		 */
		EClass ABSTRACT_BEHAVIOR = eINSTANCE.getAbstractBehavior();

		/**
		 * The meta object literal for the '<em><b>Is Control Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_BEHAVIOR__IS_CONTROL_OPERATOR = eINSTANCE.getAbstractBehavior_IsControlOperator();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.behavior.AbstractEvent <em>Abstract Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.behavior.AbstractEvent
		 * @see org.polarsys.capella.core.semantic.data.behavior.impl.BehaviorPackageImpl#getAbstractEvent()
		 * @generated
		 */
		EClass ABSTRACT_EVENT = eINSTANCE.getAbstractEvent();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.core.semantic.data.behavior.AbstractTimeEvent <em>Abstract Time Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.core.semantic.data.behavior.AbstractTimeEvent
		 * @see org.polarsys.capella.core.semantic.data.behavior.impl.BehaviorPackageImpl#getAbstractTimeEvent()
		 * @generated
		 */
		EClass ABSTRACT_TIME_EVENT = eINSTANCE.getAbstractTimeEvent();

		/**
		 * The meta object literal for the '<em><b>Is Relative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TIME_EVENT__IS_RELATIVE = eINSTANCE.getAbstractTimeEvent_IsRelative();

	}

} //BehaviorPackage
