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

import org.polarsys.capella.core.semantic.data.behavior.AbstractBehavior;

import org.polarsys.capella.core.semantic.data.modellingcore.TraceableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.AbstractActivity#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.AbstractActivity#isIsSingleExecution <em>Is Single Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getAbstractActivity()
 * @model abstract="true"
 * @generated
 */
public interface AbstractActivity extends AbstractBehavior, TraceableElement {
	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getAbstractActivity_IsReadOnly()
	 * @model
	 * @generated
	 */
	boolean isIsReadOnly();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.activity.AbstractActivity#isIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Single Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Single Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Single Execution</em>' attribute.
	 * @see #setIsSingleExecution(boolean)
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getAbstractActivity_IsSingleExecution()
	 * @model
	 * @generated
	 */
	boolean isIsSingleExecution();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.activity.AbstractActivity#isIsSingleExecution <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Single Execution</em>' attribute.
	 * @see #isIsSingleExecution()
	 * @generated
	 */
	void setIsSingleExecution(boolean value);

} // AbstractActivity
