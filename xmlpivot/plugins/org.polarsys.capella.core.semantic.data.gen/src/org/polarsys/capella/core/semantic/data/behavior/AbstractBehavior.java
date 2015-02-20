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

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.behavior.AbstractBehavior#isIsControlOperator <em>Is Control Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.behavior.BehaviorPackage#getAbstractBehavior()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractBehavior extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Is Control Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Control Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Control Operator</em>' attribute.
	 * @see #setIsControlOperator(boolean)
	 * @see org.polarsys.capella.core.semantic.data.behavior.BehaviorPackage#getAbstractBehavior_IsControlOperator()
	 * @model
	 * @generated
	 */
	boolean isIsControlOperator();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.behavior.AbstractBehavior#isIsControlOperator <em>Is Control Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Control Operator</em>' attribute.
	 * @see #isIsControlOperator()
	 * @generated
	 */
	void setIsControlOperator(boolean value);

} // AbstractBehavior
