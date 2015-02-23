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

import org.polarsys.capella.core.semantic.data.capellacommon.AbstractCapabilityPkg;
import org.polarsys.capella.core.semantic.data.capellacommon.StateMachine;

import org.polarsys.capella.core.semantic.data.capellacore.Type;

import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalBlock;

import org.polarsys.capella.core.semantic.data.information.DataPkg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Block#getOwnedAbstractCapabilityPkg <em>Owned Abstract Capability Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Block#getOwnedInterfacePkg <em>Owned Interface Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Block#getOwnedDataPkg <em>Owned Data Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Block#getOwnedStateMachines <em>Owned State Machines</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getBlock()
 * @model abstract="true"
 * @generated
 */
public interface Block extends AbstractFunctionalBlock, Type {
	/**
	 * Returns the value of the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Abstract Capability Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Abstract Capability Pkg</em>' containment reference.
	 * @see #setOwnedAbstractCapabilityPkg(AbstractCapabilityPkg)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getBlock_OwnedAbstractCapabilityPkg()
	 * @model containment="true"
	 * @generated
	 */
	AbstractCapabilityPkg getOwnedAbstractCapabilityPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.Block#getOwnedAbstractCapabilityPkg <em>Owned Abstract Capability Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Abstract Capability Pkg</em>' containment reference.
	 * @see #getOwnedAbstractCapabilityPkg()
	 * @generated
	 */
	void setOwnedAbstractCapabilityPkg(AbstractCapabilityPkg value);

	/**
	 * Returns the value of the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Interface Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Interface Pkg</em>' containment reference.
	 * @see #setOwnedInterfacePkg(InterfacePkg)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getBlock_OwnedInterfacePkg()
	 * @model containment="true"
	 * @generated
	 */
	InterfacePkg getOwnedInterfacePkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.Block#getOwnedInterfacePkg <em>Owned Interface Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Interface Pkg</em>' containment reference.
	 * @see #getOwnedInterfacePkg()
	 * @generated
	 */
	void setOwnedInterfacePkg(InterfacePkg value);

	/**
	 * Returns the value of the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Data Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Data Pkg</em>' containment reference.
	 * @see #setOwnedDataPkg(DataPkg)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getBlock_OwnedDataPkg()
	 * @model containment="true"
	 * @generated
	 */
	DataPkg getOwnedDataPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.Block#getOwnedDataPkg <em>Owned Data Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Data Pkg</em>' containment reference.
	 * @see #getOwnedDataPkg()
	 * @generated
	 */
	void setOwnedDataPkg(DataPkg value);

	/**
	 * Returns the value of the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacommon.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State Machines</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getBlock_OwnedStateMachines()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateMachine> getOwnedStateMachines();

} // Block
