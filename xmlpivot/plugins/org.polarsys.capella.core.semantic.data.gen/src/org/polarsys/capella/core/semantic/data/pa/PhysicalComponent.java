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

import org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalArtifact;

import org.polarsys.capella.core.semantic.data.la.LogicalComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponent#getOwnedPhysicalComponents <em>Owned Physical Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponent#getOwnedPhysicalComponentPkgs <em>Owned Physical Component Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponent#getRealizedLogicalComponents <em>Realized Logical Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponent#getAllocatedPhysicalFunctions <em>Allocated Physical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponent#getDeployedPhysicalComponents <em>Deployed Physical Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalComponent()
 * @model
 * @generated
 */
public interface PhysicalComponent extends AbstractPhysicalComponent, AbstractPhysicalArtifact {
	/**
	 * Returns the value of the '<em><b>Owned Physical Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Components</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalComponent_OwnedPhysicalComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalComponent> getOwnedPhysicalComponents();

	/**
	 * Returns the value of the '<em><b>Owned Physical Component Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Component Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Component Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalComponent_OwnedPhysicalComponentPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalComponentPkg> getOwnedPhysicalComponentPkgs();

	/**
	 * Returns the value of the '<em><b>Realized Logical Components</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.LogicalComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Logical Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Logical Components</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalComponent_RealizedLogicalComponents()
	 * @model ordered="false"
	 * @generated
	 */
	EList<LogicalComponent> getRealizedLogicalComponents();

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
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalComponent_AllocatedPhysicalFunctions()
	 * @model
	 * @generated
	 */
	EList<PhysicalFunction> getAllocatedPhysicalFunctions();

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
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalComponent_DeployedPhysicalComponents()
	 * @model
	 * @generated
	 */
	EList<PhysicalComponent> getDeployedPhysicalComponents();

} // PhysicalComponent
