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

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;
import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.Mission#getParticipatingActors <em>Participating Actors</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.Mission#getParticipatingSystem <em>Participating System</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.Mission#getExploitedCapabilities <em>Exploited Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends NamedElement, CapellaElement {
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
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getMission_ParticipatingActors()
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
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getMission_ParticipatingSystem()
	 * @model
	 * @generated
	 */
	org.polarsys.capella.core.semantic.data.ctx.System getParticipatingSystem();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.ctx.Mission#getParticipatingSystem <em>Participating System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participating System</em>' reference.
	 * @see #getParticipatingSystem()
	 * @generated
	 */
	void setParticipatingSystem(org.polarsys.capella.core.semantic.data.ctx.System value);

	/**
	 * Returns the value of the '<em><b>Exploited Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exploited Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exploited Capabilities</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getMission_ExploitedCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getExploitedCapabilities();

} // Mission
