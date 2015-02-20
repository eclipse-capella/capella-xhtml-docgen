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

package org.polarsys.capella.core.semantic.data.capellacore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Naming Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.NamingRule#getTargetType <em>Target Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getNamingRule()
 * @model
 * @generated
 */
public interface NamingRule extends AbstractAnnotation {
	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' attribute.
	 * @see #setTargetType(String)
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getNamingRule_TargetType()
	 * @model
	 * @generated
	 */
	String getTargetType();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.capellacore.NamingRule#getTargetType <em>Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type</em>' attribute.
	 * @see #getTargetType()
	 * @generated
	 */
	void setTargetType(String value);

} // NamingRule
