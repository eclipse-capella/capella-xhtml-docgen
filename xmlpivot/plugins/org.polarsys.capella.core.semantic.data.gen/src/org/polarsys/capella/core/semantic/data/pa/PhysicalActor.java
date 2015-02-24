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

package org.polarsys.capella.core.semantic.data.pa;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.cs.AbstractActor;

import org.polarsys.capella.core.semantic.data.la.LogicalActor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalActor#getAllocatedPhysicalFunctions <em>Allocated Physical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalActor#getRealizedLogicalActors <em>Realized Logical Actors</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalActor#getDeployedPhysicalComponents <em>Deployed Physical Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalActor()
 * @model
 * @generated
 */
public interface PhysicalActor extends AbstractPhysicalComponent, AbstractActor {
	/**
	 * Returns the value of the '<em><b>Allocated Physical Functions</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.PhysicalFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Physical Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Physical Functions</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalActor_AllocatedPhysicalFunctions()
	 * @model
	 * @generated
	 */
	EList<PhysicalFunction> getAllocatedPhysicalFunctions();

	/**
	 * Returns the value of the '<em><b>Realized Logical Actors</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.LogicalActor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Logical Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Logical Actors</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalActor_RealizedLogicalActors()
	 * @model
	 * @generated
	 */
	EList<LogicalActor> getRealizedLogicalActors();

	/**
	 * Returns the value of the '<em><b>Deployed Physical Components</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Physical Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Physical Components</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalActor_DeployedPhysicalComponents()
	 * @model
	 * @generated
	 */
	EList<PhysicalComponent> getDeployedPhysicalComponents();

} // PhysicalActor
