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

package org.polarsys.capella.core.semantic.data.oa;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacore.InvolvedElement;

import org.polarsys.capella.core.semantic.data.cs.Component;

import org.polarsys.capella.core.semantic.data.modellingcore.InformationsExchanger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.Entity#getOwnedEntities <em>Owned Entities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.Entity#getOwnedCommunicationMeans <em>Owned Communication Means</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.Entity#getAllocatedOperationalActivities <em>Allocated Operational Activities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.Entity#getAllocatedRoles <em>Allocated Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends InformationsExchanger, InvolvedElement, Component {
	/**
	 * Returns the value of the '<em><b>Owned Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Entities</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getEntity_OwnedEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getOwnedEntities();

	/**
	 * Returns the value of the '<em><b>Owned Communication Means</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.CommunicationMean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Communication Means</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Communication Means</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getEntity_OwnedCommunicationMeans()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationMean> getOwnedCommunicationMeans();

	/**
	 * Returns the value of the '<em><b>Allocated Operational Activities</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.OperationalActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Operational Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Operational Activities</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getEntity_AllocatedOperationalActivities()
	 * @model
	 * @generated
	 */
	EList<OperationalActivity> getAllocatedOperationalActivities();

	/**
	 * Returns the value of the '<em><b>Allocated Roles</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Roles</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getEntity_AllocatedRoles()
	 * @model
	 * @generated
	 */
	EList<Role> getAllocatedRoles();

} // Entity
