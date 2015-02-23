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

import org.polarsys.capella.core.semantic.data.cs.BlockArchitecture;

import org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getOwnedLogicalContext <em>Owned Logical Context</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getOwnedLogicalComponent <em>Owned Logical Component</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getOwnedLogicalComponentPkg <em>Owned Logical Component Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getOwnedLogicalActorPkg <em>Owned Logical Actor Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getContainedLogicalFunctionPkg <em>Contained Logical Function Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getAllocatedSystemAnalyses <em>Allocated System Analyses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalArchitecture()
 * @model
 * @generated
 */
public interface LogicalArchitecture extends BlockArchitecture {
	/**
	 * Returns the value of the '<em><b>Owned Logical Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Context</em>' containment reference.
	 * @see #setOwnedLogicalContext(LogicalContext)
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalArchitecture_OwnedLogicalContext()
	 * @model containment="true"
	 * @generated
	 */
	LogicalContext getOwnedLogicalContext();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getOwnedLogicalContext <em>Owned Logical Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Logical Context</em>' containment reference.
	 * @see #getOwnedLogicalContext()
	 * @generated
	 */
	void setOwnedLogicalContext(LogicalContext value);

	/**
	 * Returns the value of the '<em><b>Owned Logical Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Component</em>' containment reference.
	 * @see #setOwnedLogicalComponent(LogicalComponent)
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalArchitecture_OwnedLogicalComponent()
	 * @model containment="true"
	 * @generated
	 */
	LogicalComponent getOwnedLogicalComponent();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getOwnedLogicalComponent <em>Owned Logical Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Logical Component</em>' containment reference.
	 * @see #getOwnedLogicalComponent()
	 * @generated
	 */
	void setOwnedLogicalComponent(LogicalComponent value);

	/**
	 * Returns the value of the '<em><b>Owned Logical Component Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Component Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Component Pkg</em>' containment reference.
	 * @see #setOwnedLogicalComponentPkg(LogicalComponentPkg)
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalArchitecture_OwnedLogicalComponentPkg()
	 * @model containment="true"
	 * @generated
	 */
	LogicalComponentPkg getOwnedLogicalComponentPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getOwnedLogicalComponentPkg <em>Owned Logical Component Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Logical Component Pkg</em>' containment reference.
	 * @see #getOwnedLogicalComponentPkg()
	 * @generated
	 */
	void setOwnedLogicalComponentPkg(LogicalComponentPkg value);

	/**
	 * Returns the value of the '<em><b>Owned Logical Actor Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Actor Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Actor Pkg</em>' containment reference.
	 * @see #setOwnedLogicalActorPkg(LogicalActorPkg)
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalArchitecture_OwnedLogicalActorPkg()
	 * @model containment="true"
	 * @generated
	 */
	LogicalActorPkg getOwnedLogicalActorPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getOwnedLogicalActorPkg <em>Owned Logical Actor Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Logical Actor Pkg</em>' containment reference.
	 * @see #getOwnedLogicalActorPkg()
	 * @generated
	 */
	void setOwnedLogicalActorPkg(LogicalActorPkg value);

	/**
	 * Returns the value of the '<em><b>Contained Capability Realization Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Capability Realization Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Capability Realization Pkg</em>' containment reference.
	 * @see #setContainedCapabilityRealizationPkg(CapabilityRealizationPkg)
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalArchitecture_ContainedCapabilityRealizationPkg()
	 * @model containment="true"
	 * @generated
	 */
	CapabilityRealizationPkg getContainedCapabilityRealizationPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Capability Realization Pkg</em>' containment reference.
	 * @see #getContainedCapabilityRealizationPkg()
	 * @generated
	 */
	void setContainedCapabilityRealizationPkg(CapabilityRealizationPkg value);

	/**
	 * Returns the value of the '<em><b>Contained Logical Function Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Logical Function Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Logical Function Pkg</em>' containment reference.
	 * @see #setContainedLogicalFunctionPkg(LogicalFunctionPkg)
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalArchitecture_ContainedLogicalFunctionPkg()
	 * @model containment="true"
	 * @generated
	 */
	LogicalFunctionPkg getContainedLogicalFunctionPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture#getContainedLogicalFunctionPkg <em>Contained Logical Function Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Logical Function Pkg</em>' containment reference.
	 * @see #getContainedLogicalFunctionPkg()
	 * @generated
	 */
	void setContainedLogicalFunctionPkg(LogicalFunctionPkg value);

	/**
	 * Returns the value of the '<em><b>Allocated System Analyses</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated System Analyses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated System Analyses</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalArchitecture_AllocatedSystemAnalyses()
	 * @model
	 * @generated
	 */
	EList<SystemAnalysis> getAllocatedSystemAnalyses();

} // LogicalArchitecture
