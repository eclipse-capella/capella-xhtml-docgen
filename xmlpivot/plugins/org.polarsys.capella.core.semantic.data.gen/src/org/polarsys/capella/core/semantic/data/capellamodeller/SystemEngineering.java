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

package org.polarsys.capella.core.semantic.data.capellamodeller;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacore.Structure;

import org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis;

import org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture;

import org.polarsys.capella.core.semantic.data.la.LogicalArchitecture;

import org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis;

import org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture;

import org.polarsys.capella.core.semantic.data.sharedmodel.SharedPkg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Engineering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedOperationalAnalysis <em>Contained Operational Analysis</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedSystemAnalysis <em>Contained System Analysis</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedLogicalArchitectures <em>Contained Logical Architectures</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedPhysicalArchitectures <em>Contained Physical Architectures</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedEPBSArchitectures <em>Contained EPBS Architectures</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering#getContainedSharedPkgs <em>Contained Shared Pkgs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.capellamodeller.CapellamodellerPackage#getSystemEngineering()
 * @model
 * @generated
 */
public interface SystemEngineering extends ModelRoot, Structure {
	/**
	 * Returns the value of the '<em><b>Contained Operational Analysis</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Operational Analysis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Operational Analysis</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.CapellamodellerPackage#getSystemEngineering_ContainedOperationalAnalysis()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationalAnalysis> getContainedOperationalAnalysis();

	/**
	 * Returns the value of the '<em><b>Contained System Analysis</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained System Analysis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained System Analysis</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.CapellamodellerPackage#getSystemEngineering_ContainedSystemAnalysis()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemAnalysis> getContainedSystemAnalysis();

	/**
	 * Returns the value of the '<em><b>Contained Logical Architectures</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Logical Architectures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Logical Architectures</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.CapellamodellerPackage#getSystemEngineering_ContainedLogicalArchitectures()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalArchitecture> getContainedLogicalArchitectures();

	/**
	 * Returns the value of the '<em><b>Contained Physical Architectures</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Physical Architectures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Physical Architectures</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.CapellamodellerPackage#getSystemEngineering_ContainedPhysicalArchitectures()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalArchitecture> getContainedPhysicalArchitectures();

	/**
	 * Returns the value of the '<em><b>Contained EPBS Architectures</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained EPBS Architectures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained EPBS Architectures</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.CapellamodellerPackage#getSystemEngineering_ContainedEPBSArchitectures()
	 * @model containment="true"
	 * @generated
	 */
	EList<EPBSArchitecture> getContainedEPBSArchitectures();

	/**
	 * Returns the value of the '<em><b>Contained Shared Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.sharedmodel.SharedPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Shared Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Shared Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.CapellamodellerPackage#getSystemEngineering_ContainedSharedPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SharedPkg> getContainedSharedPkgs();

} // SystemEngineering
