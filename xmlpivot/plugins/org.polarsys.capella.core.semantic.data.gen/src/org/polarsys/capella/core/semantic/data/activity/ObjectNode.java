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

package org.polarsys.capella.core.semantic.data.activity;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.behavior.AbstractBehavior;

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.core.semantic.data.modellingcore.IState;
import org.polarsys.capella.core.semantic.data.modellingcore.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.ObjectNode#isIsControlType <em>Is Control Type</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.ObjectNode#getKindOfNode <em>Kind Of Node</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.ObjectNode#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.ObjectNode#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.ObjectNode#getInState <em>In State</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.ObjectNode#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getObjectNode()
 * @model abstract="true"
 * @generated
 */
public interface ObjectNode extends ActivityNode, AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Control Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Control Type</em>' attribute.
	 * @see #setIsControlType(boolean)
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getObjectNode_IsControlType()
	 * @model
	 * @generated
	 */
	boolean isIsControlType();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.activity.ObjectNode#isIsControlType <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Control Type</em>' attribute.
	 * @see #isIsControlType()
	 * @generated
	 */
	void setIsControlType(boolean value);

	/**
	 * Returns the value of the '<em><b>Kind Of Node</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.activity.ObjectNodeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind Of Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Of Node</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.activity.ObjectNodeKind
	 * @see #setKindOfNode(ObjectNodeKind)
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getObjectNode_KindOfNode()
	 * @model
	 * @generated
	 */
	ObjectNodeKind getKindOfNode();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.activity.ObjectNode#getKindOfNode <em>Kind Of Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Of Node</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.activity.ObjectNodeKind
	 * @see #getKindOfNode()
	 * @generated
	 */
	void setKindOfNode(ObjectNodeKind value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.activity.ObjectNodeOrderingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.activity.ObjectNodeOrderingKind
	 * @see #setOrdering(ObjectNodeOrderingKind)
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getObjectNode_Ordering()
	 * @model
	 * @generated
	 */
	ObjectNodeOrderingKind getOrdering();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.activity.ObjectNode#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.activity.ObjectNodeOrderingKind
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(ObjectNodeOrderingKind value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(ValueSpecification)
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getObjectNode_UpperBound()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getUpperBound();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.activity.ObjectNode#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>In State</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.modellingcore.IState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In State</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getObjectNode_InState()
	 * @model
	 * @generated
	 */
	EList<IState> getInState();

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(AbstractBehavior)
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getObjectNode_Selection()
	 * @model
	 * @generated
	 */
	AbstractBehavior getSelection();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.activity.ObjectNode#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(AbstractBehavior value);

} // ObjectNode
