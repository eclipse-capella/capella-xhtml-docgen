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

package org.polarsys.capella.core.semantic.data.la;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.cs.AbstractActor;
import org.polarsys.capella.core.semantic.data.cs.SystemComponent;

import org.polarsys.capella.core.semantic.data.ctx.Capability;

import org.polarsys.capella.core.semantic.data.interaction.AbstractCapability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.CapabilityRealization#getParticipatingActors <em>Participating Actors</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.CapabilityRealization#getParticipatingSystemComponents <em>Participating System Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.CapabilityRealization#getRealizedCapabilities <em>Realized Capabilities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.CapabilityRealization#getRealizedCapabilityRealizations <em>Realized Capability Realizations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getCapabilityRealization()
 * @model
 * @generated
 */
public interface CapabilityRealization extends AbstractCapability {
	/**
	 * Returns the value of the '<em><b>Participating Actors</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.AbstractActor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participating Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participating Actors</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getCapabilityRealization_ParticipatingActors()
	 * @model
	 * @generated
	 */
	EList<AbstractActor> getParticipatingActors();

	/**
	 * Returns the value of the '<em><b>Participating System Components</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.SystemComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participating System Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participating System Components</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getCapabilityRealization_ParticipatingSystemComponents()
	 * @model
	 * @generated
	 */
	EList<SystemComponent> getParticipatingSystemComponents();

	/**
	 * Returns the value of the '<em><b>Realized Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Capabilities</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getCapabilityRealization_RealizedCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getRealizedCapabilities();

	/**
	 * Returns the value of the '<em><b>Realized Capability Realizations</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.CapabilityRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Capability Realizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Capability Realizations</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getCapabilityRealization_RealizedCapabilityRealizations()
	 * @model
	 * @generated
	 */
	EList<CapabilityRealization> getRealizedCapabilityRealizations();

} // CapabilityRealization
