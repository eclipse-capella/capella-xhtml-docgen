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

package org.polarsys.capella.core.semantic.data.information;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacommon.StateEvent;

import org.polarsys.capella.core.semantic.data.capellacore.AbstractExchangeItemPkg;
import org.polarsys.capella.core.semantic.data.capellacore.Structure;

import org.polarsys.capella.core.semantic.data.information.communication.Message;
import org.polarsys.capella.core.semantic.data.information.communication.MessageReferencePkg;
import org.polarsys.capella.core.semantic.data.information.communication.Signal;

import org.polarsys.capella.core.semantic.data.information.datatype.DataType;

import org.polarsys.capella.core.semantic.data.information.datavalue.DataValueContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.DataPkg#getOwnedDataPkgs <em>Owned Data Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.DataPkg#getOwnedClasses <em>Owned Classes</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.DataPkg#getOwnedKeyParts <em>Owned Key Parts</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.DataPkg#getOwnedCollections <em>Owned Collections</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.DataPkg#getOwnedUnits <em>Owned Units</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.DataPkg#getOwnedDataTypes <em>Owned Data Types</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.DataPkg#getOwnedSignals <em>Owned Signals</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.DataPkg#getOwnedMessages <em>Owned Messages</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.DataPkg#getOwnedExceptions <em>Owned Exceptions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.DataPkg#getOwnedStateEvents <em>Owned State Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getDataPkg()
 * @model
 * @generated
 */
public interface DataPkg extends AbstractExchangeItemPkg, AssociationPkg, DataValueContainer, MessageReferencePkg, Structure {
	/**
	 * Returns the value of the '<em><b>Owned Data Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.DataPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Data Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Data Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getDataPkg_OwnedDataPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataPkg> getOwnedDataPkgs();

	/**
	 * Returns the value of the '<em><b>Owned Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Classes</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getDataPkg_OwnedClasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.polarsys.capella.core.semantic.data.information.Class> getOwnedClasses();

	/**
	 * Returns the value of the '<em><b>Owned Key Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.KeyPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Key Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Key Parts</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getDataPkg_OwnedKeyParts()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyPart> getOwnedKeyParts();

	/**
	 * Returns the value of the '<em><b>Owned Collections</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.Collection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Collections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Collections</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getDataPkg_OwnedCollections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Collection> getOwnedCollections();

	/**
	 * Returns the value of the '<em><b>Owned Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.Unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Units</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getDataPkg_OwnedUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Unit> getOwnedUnits();

	/**
	 * Returns the value of the '<em><b>Owned Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.datatype.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Data Types</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getDataPkg_OwnedDataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getOwnedDataTypes();

	/**
	 * Returns the value of the '<em><b>Owned Signals</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.communication.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Signals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Signals</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getDataPkg_OwnedSignals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signal> getOwnedSignals();

	/**
	 * Returns the value of the '<em><b>Owned Messages</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.communication.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Messages</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getDataPkg_OwnedMessages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getOwnedMessages();

	/**
	 * Returns the value of the '<em><b>Owned Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.communication.Exception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Exceptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Exceptions</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getDataPkg_OwnedExceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.polarsys.capella.core.semantic.data.information.communication.Exception> getOwnedExceptions();

	/**
	 * Returns the value of the '<em><b>Owned State Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacommon.StateEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State Events</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getDataPkg_OwnedStateEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateEvent> getOwnedStateEvents();

} // DataPkg
