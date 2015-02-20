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

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.fa.ComponentPort;

import org.polarsys.capella.core.semantic.data.information.Partition;
import org.polarsys.capella.core.semantic.data.information.Port;

import org.polarsys.capella.core.semantic.data.modellingcore.InformationsExchanger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPort#getAllocatedComponentPorts <em>Allocated Component Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPort#getRealizedPhysicalPorts <em>Realized Physical Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalPort()
 * @model
 * @generated
 */
public interface PhysicalPort extends Partition, Port, AbstractPhysicalArtifact, InformationsExchanger, AbstractPhysicalLinkEnd {
	/**
	 * Returns the value of the '<em><b>Allocated Component Ports</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.ComponentPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Component Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Component Ports</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalPort_AllocatedComponentPorts()
	 * @model
	 * @generated
	 */
	EList<ComponentPort> getAllocatedComponentPorts();

	/**
	 * Returns the value of the '<em><b>Realized Physical Ports</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.PhysicalPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Physical Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Physical Ports</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalPort_RealizedPhysicalPorts()
	 * @model
	 * @generated
	 */
	EList<PhysicalPort> getRealizedPhysicalPorts();

} // PhysicalPort
