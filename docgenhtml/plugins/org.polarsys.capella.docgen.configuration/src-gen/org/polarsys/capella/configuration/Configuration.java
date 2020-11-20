/*******************************************************************************
 * Copyright (c) 2017, 2020 Obeo.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.configuration.Configuration#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.capella.configuration.Configuration#getConfigurationElements <em>Configuration Elements</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.configuration.ConfigurationPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.\r\n This program and the accompanying materials are made available under the\r\nterms of the Eclipse Public License 2.0 which is available at\r\nhttp://www.eclipse.org/legal/epl-2.0\r\n\r\nSPDX-License-Identifier: EPL-2.0\r\n\r\n Contributors:\r\n    Thales - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.polarsys.capella.configuration.ConfigurationPackage#getConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.configuration.Configuration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.configuration.ConfigurationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Elements</em>' containment reference list.
	 * @see org.polarsys.capella.configuration.ConfigurationPackage#getConfiguration_ConfigurationElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationElement> getConfigurationElements();

} // Configuration
