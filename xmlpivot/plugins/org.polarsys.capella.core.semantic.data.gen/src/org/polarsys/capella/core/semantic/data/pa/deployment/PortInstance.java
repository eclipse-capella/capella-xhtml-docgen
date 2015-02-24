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

package org.polarsys.capella.core.semantic.data.pa.deployment;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.fa.ComponentPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.deployment.PortInstance#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.deployment.PortInstance#getComponent <em>Component</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.deployment.PortInstance#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentPackage#getPortInstance()
 * @model
 * @generated
 */
public interface PortInstance extends AbstractPhysicalInstance {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.deployment.ConnectionInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentPackage#getPortInstance_Connections()
	 * @model
	 * @generated
	 */
	EList<ConnectionInstance> getConnections();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(ComponentInstance)
	 * @see org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentPackage#getPortInstance_Component()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstance getComponent();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.pa.deployment.PortInstance#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComponentPort)
	 * @see org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentPackage#getPortInstance_Type()
	 * @model
	 * @generated
	 */
	ComponentPort getType();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.pa.deployment.PortInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentPort value);

} // PortInstance
