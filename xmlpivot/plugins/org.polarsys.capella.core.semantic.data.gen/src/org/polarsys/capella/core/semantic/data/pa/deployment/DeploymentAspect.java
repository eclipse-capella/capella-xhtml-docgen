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

import org.polarsys.capella.core.semantic.data.capellacore.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentAspect#getOwnedConfigurations <em>Owned Configurations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentAspect#getOwnedDeploymentAspects <em>Owned Deployment Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentPackage#getDeploymentAspect()
 * @model
 * @generated
 */
public interface DeploymentAspect extends Structure {
	/**
	 * Returns the value of the '<em><b>Owned Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Configurations</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentPackage#getDeploymentAspect_OwnedConfigurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentConfiguration> getOwnedConfigurations();

	/**
	 * Returns the value of the '<em><b>Owned Deployment Aspects</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentAspect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Deployment Aspects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Deployment Aspects</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentPackage#getDeploymentAspect_OwnedDeploymentAspects()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentAspect> getOwnedDeploymentAspects();

} // DeploymentAspect
