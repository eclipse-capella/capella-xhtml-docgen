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

package org.polarsys.capella.core.semantic.data.ctx;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.interaction.AbstractCapability;

import org.polarsys.capella.core.semantic.data.oa.OperationalCapability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.Capability#getParticipatingActors <em>Participating Actors</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.Capability#getParticipatingSystem <em>Participating System</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.Capability#getRealizedOperationalCapabilities <em>Realized Operational Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends AbstractCapability {
	/**
	 * Returns the value of the '<em><b>Participating Actors</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participating Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participating Actors</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getCapability_ParticipatingActors()
	 * @model
	 * @generated
	 */
	EList<Actor> getParticipatingActors();

	/**
	 * Returns the value of the '<em><b>Participating System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participating System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participating System</em>' reference.
	 * @see #setParticipatingSystem(org.polarsys.capella.core.semantic.data.ctx.System)
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getCapability_ParticipatingSystem()
	 * @model
	 * @generated
	 */
	org.polarsys.capella.core.semantic.data.ctx.System getParticipatingSystem();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.ctx.Capability#getParticipatingSystem <em>Participating System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participating System</em>' reference.
	 * @see #getParticipatingSystem()
	 * @generated
	 */
	void setParticipatingSystem(org.polarsys.capella.core.semantic.data.ctx.System value);

	/**
	 * Returns the value of the '<em><b>Realized Operational Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.OperationalCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Operational Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Operational Capabilities</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getCapability_RealizedOperationalCapabilities()
	 * @model
	 * @generated
	 */
	EList<OperationalCapability> getRealizedOperationalCapabilities();

} // Capability
