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

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;

import org.polarsys.capella.core.semantic.data.modellingcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Deployment Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.AbstractDeploymentLink#getDeployedElement <em>Deployed Element</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.AbstractDeploymentLink#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getAbstractDeploymentLink()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDeploymentLink extends CapellaElement, ModelElement {
	/**
	 * Returns the value of the '<em><b>Deployed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Element</em>' reference.
	 * @see #setDeployedElement(DeployableElement)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getAbstractDeploymentLink_DeployedElement()
	 * @model required="true"
	 * @generated
	 */
	DeployableElement getDeployedElement();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.AbstractDeploymentLink#getDeployedElement <em>Deployed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployed Element</em>' reference.
	 * @see #getDeployedElement()
	 * @generated
	 */
	void setDeployedElement(DeployableElement value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(DeploymentTarget)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getAbstractDeploymentLink_Location()
	 * @model required="true"
	 * @generated
	 */
	DeploymentTarget getLocation();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.AbstractDeploymentLink#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(DeploymentTarget value);

} // AbstractDeploymentLink
