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

package org.polarsys.capella.core.semantic.data.information;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacommon.StateMachine;

import org.polarsys.capella.core.semantic.data.capellacore.GeneralClass;

import org.polarsys.capella.core.semantic.data.information.datavalue.DataValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Class#isIsPrimitive <em>Is Primitive</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Class#getKeyParts <em>Key Parts</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Class#getOwnedStateMachines <em>Owned State Machines</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Class#getOwnedDataValues <em>Owned Data Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Class#getRealizedClasses <em>Realized Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends GeneralClass {
	/**
	 * Returns the value of the '<em><b>Is Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Primitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primitive</em>' attribute.
	 * @see #setIsPrimitive(boolean)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getClass_IsPrimitive()
	 * @model
	 * @generated
	 */
	boolean isIsPrimitive();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.Class#isIsPrimitive <em>Is Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primitive</em>' attribute.
	 * @see #isIsPrimitive()
	 * @generated
	 */
	void setIsPrimitive(boolean value);

	/**
	 * Returns the value of the '<em><b>Key Parts</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.KeyPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Parts</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getClass_KeyParts()
	 * @model
	 * @generated
	 */
	EList<KeyPart> getKeyParts();

	/**
	 * Returns the value of the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacommon.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State Machines</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getClass_OwnedStateMachines()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateMachine> getOwnedStateMachines();

	/**
	 * Returns the value of the '<em><b>Owned Data Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.datavalue.DataValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Data Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Data Values</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getClass_OwnedDataValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataValue> getOwnedDataValues();

	/**
	 * Returns the value of the '<em><b>Realized Classes</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Classes</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getClass_RealizedClasses()
	 * @model
	 * @generated
	 */
	EList<Class> getRealizedClasses();

} // Class
