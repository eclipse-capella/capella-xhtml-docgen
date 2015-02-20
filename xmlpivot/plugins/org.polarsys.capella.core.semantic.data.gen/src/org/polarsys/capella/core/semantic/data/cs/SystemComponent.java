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

package org.polarsys.capella.core.semantic.data.cs;

import org.polarsys.capella.core.semantic.data.capellacore.InvolvedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.SystemComponent#isDataComponent <em>Data Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getSystemComponent()
 * @model abstract="true"
 * @generated
 */
public interface SystemComponent extends Component, InvolvedElement {
	/**
	 * Returns the value of the '<em><b>Data Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Component</em>' attribute.
	 * @see #setDataComponent(boolean)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getSystemComponent_DataComponent()
	 * @model
	 * @generated
	 */
	boolean isDataComponent();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.SystemComponent#isDataComponent <em>Data Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Component</em>' attribute.
	 * @see #isDataComponent()
	 * @generated
	 */
	void setDataComponent(boolean value);

} // SystemComponent
