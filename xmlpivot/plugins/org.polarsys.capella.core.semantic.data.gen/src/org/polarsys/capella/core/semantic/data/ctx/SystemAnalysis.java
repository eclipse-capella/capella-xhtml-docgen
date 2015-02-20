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

import org.polarsys.capella.core.semantic.data.cs.BlockArchitecture;

import org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getOwnedSystemContext <em>Owned System Context</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getOwnedSystem <em>Owned System</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getOwnedActorPkg <em>Owned Actor Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getOwnedMissionPkg <em>Owned Mission Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getContainedCapabilityPkg <em>Contained Capability Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getContainedSystemFunctionPkg <em>Contained System Function Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getAllocatedOperationalAnalyses <em>Allocated Operational Analyses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getSystemAnalysis()
 * @model
 * @generated
 */
public interface SystemAnalysis extends BlockArchitecture {
	/**
	 * Returns the value of the '<em><b>Owned System Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned System Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned System Context</em>' containment reference.
	 * @see #setOwnedSystemContext(SystemContext)
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getSystemAnalysis_OwnedSystemContext()
	 * @model containment="true"
	 * @generated
	 */
	SystemContext getOwnedSystemContext();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getOwnedSystemContext <em>Owned System Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned System Context</em>' containment reference.
	 * @see #getOwnedSystemContext()
	 * @generated
	 */
	void setOwnedSystemContext(SystemContext value);

	/**
	 * Returns the value of the '<em><b>Owned System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned System</em>' containment reference.
	 * @see #setOwnedSystem(org.polarsys.capella.core.semantic.data.ctx.System)
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getSystemAnalysis_OwnedSystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.polarsys.capella.core.semantic.data.ctx.System getOwnedSystem();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getOwnedSystem <em>Owned System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned System</em>' containment reference.
	 * @see #getOwnedSystem()
	 * @generated
	 */
	void setOwnedSystem(org.polarsys.capella.core.semantic.data.ctx.System value);

	/**
	 * Returns the value of the '<em><b>Owned Actor Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Actor Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Actor Pkg</em>' containment reference.
	 * @see #setOwnedActorPkg(ActorPkg)
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getSystemAnalysis_OwnedActorPkg()
	 * @model containment="true"
	 * @generated
	 */
	ActorPkg getOwnedActorPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getOwnedActorPkg <em>Owned Actor Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Actor Pkg</em>' containment reference.
	 * @see #getOwnedActorPkg()
	 * @generated
	 */
	void setOwnedActorPkg(ActorPkg value);

	/**
	 * Returns the value of the '<em><b>Owned Mission Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Mission Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Mission Pkg</em>' containment reference.
	 * @see #setOwnedMissionPkg(MissionPkg)
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getSystemAnalysis_OwnedMissionPkg()
	 * @model containment="true"
	 * @generated
	 */
	MissionPkg getOwnedMissionPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getOwnedMissionPkg <em>Owned Mission Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Mission Pkg</em>' containment reference.
	 * @see #getOwnedMissionPkg()
	 * @generated
	 */
	void setOwnedMissionPkg(MissionPkg value);

	/**
	 * Returns the value of the '<em><b>Contained Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Capability Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Capability Pkg</em>' containment reference.
	 * @see #setContainedCapabilityPkg(CapabilityPkg)
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getSystemAnalysis_ContainedCapabilityPkg()
	 * @model containment="true"
	 * @generated
	 */
	CapabilityPkg getContainedCapabilityPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getContainedCapabilityPkg <em>Contained Capability Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Capability Pkg</em>' containment reference.
	 * @see #getContainedCapabilityPkg()
	 * @generated
	 */
	void setContainedCapabilityPkg(CapabilityPkg value);

	/**
	 * Returns the value of the '<em><b>Contained System Function Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained System Function Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained System Function Pkg</em>' containment reference.
	 * @see #setContainedSystemFunctionPkg(SystemFunctionPkg)
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getSystemAnalysis_ContainedSystemFunctionPkg()
	 * @model containment="true"
	 * @generated
	 */
	SystemFunctionPkg getContainedSystemFunctionPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis#getContainedSystemFunctionPkg <em>Contained System Function Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained System Function Pkg</em>' containment reference.
	 * @see #getContainedSystemFunctionPkg()
	 * @generated
	 */
	void setContainedSystemFunctionPkg(SystemFunctionPkg value);

	/**
	 * Returns the value of the '<em><b>Allocated Operational Analyses</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Operational Analyses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Operational Analyses</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getSystemAnalysis_AllocatedOperationalAnalyses()
	 * @model
	 * @generated
	 */
	EList<OperationalAnalysis> getAllocatedOperationalAnalyses();

} // SystemAnalysis
