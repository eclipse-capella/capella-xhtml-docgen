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

import org.polarsys.capella.core.semantic.data.cs.DeployableElement;
import org.polarsys.capella.core.semantic.data.cs.DeploymentTarget;

import org.polarsys.capella.core.semantic.data.pa.AbstractPhysicalComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.deployment.ComponentInstance#getPortInstances <em>Port Instances</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.deployment.ComponentInstance#getOwnedAbstractPhysicalInstances <em>Owned Abstract Physical Instances</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.deployment.ComponentInstance#getOwnedInstanceDeploymentLinks <em>Owned Instance Deployment Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.deployment.ComponentInstance#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentPackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends AbstractPhysicalInstance, DeployableElement, DeploymentTarget {
	/**
	 * Returns the value of the '<em><b>Port Instances</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.deployment.PortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Instances</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentPackage#getComponentInstance_PortInstances()
	 * @model
	 * @generated
	 */
	EList<PortInstance> getPortInstances();

	/**
	 * Returns the value of the '<em><b>Owned Abstract Physical Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.deployment.AbstractPhysicalInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Abstract Physical Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Abstract Physical Instances</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentPackage#getComponentInstance_OwnedAbstractPhysicalInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractPhysicalInstance> getOwnedAbstractPhysicalInstances();

	/**
	 * Returns the value of the '<em><b>Owned Instance Deployment Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.deployment.InstanceDeploymentLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Instance Deployment Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Instance Deployment Links</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentPackage#getComponentInstance_OwnedInstanceDeploymentLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstanceDeploymentLink> getOwnedInstanceDeploymentLinks();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(AbstractPhysicalComponent)
	 * @see org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentPackage#getComponentInstance_Type()
	 * @model
	 * @generated
	 */
	AbstractPhysicalComponent getType();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.pa.deployment.ComponentInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AbstractPhysicalComponent value);

} // ComponentInstance
