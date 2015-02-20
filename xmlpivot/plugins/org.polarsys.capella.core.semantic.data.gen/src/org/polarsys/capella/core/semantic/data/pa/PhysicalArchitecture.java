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

import org.polarsys.capella.core.semantic.data.cs.AbstractDeploymentLink;
import org.polarsys.capella.core.semantic.data.cs.BlockArchitecture;

import org.polarsys.capella.core.semantic.data.la.CapabilityRealizationPkg;
import org.polarsys.capella.core.semantic.data.la.LogicalArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedPhysicalContext <em>Owned Physical Context</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedPhysicalComponent <em>Owned Physical Component</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedPhysicalComponentPkg <em>Owned Physical Component Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedPhysicalActorPkg <em>Owned Physical Actor Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getContainedPhysicalFunctionPkg <em>Contained Physical Function Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedDeployments <em>Owned Deployments</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getAllocatedLogicalArchitectures <em>Allocated Logical Architectures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalArchitecture()
 * @model
 * @generated
 */
public interface PhysicalArchitecture extends BlockArchitecture {
	/**
	 * Returns the value of the '<em><b>Owned Physical Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Context</em>' containment reference.
	 * @see #setOwnedPhysicalContext(PhysicalContext)
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalArchitecture_OwnedPhysicalContext()
	 * @model containment="true"
	 * @generated
	 */
	PhysicalContext getOwnedPhysicalContext();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedPhysicalContext <em>Owned Physical Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Physical Context</em>' containment reference.
	 * @see #getOwnedPhysicalContext()
	 * @generated
	 */
	void setOwnedPhysicalContext(PhysicalContext value);

	/**
	 * Returns the value of the '<em><b>Owned Physical Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Component</em>' containment reference.
	 * @see #setOwnedPhysicalComponent(PhysicalComponent)
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalArchitecture_OwnedPhysicalComponent()
	 * @model containment="true"
	 * @generated
	 */
	PhysicalComponent getOwnedPhysicalComponent();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedPhysicalComponent <em>Owned Physical Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Physical Component</em>' containment reference.
	 * @see #getOwnedPhysicalComponent()
	 * @generated
	 */
	void setOwnedPhysicalComponent(PhysicalComponent value);

	/**
	 * Returns the value of the '<em><b>Owned Physical Component Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Component Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Component Pkg</em>' containment reference.
	 * @see #setOwnedPhysicalComponentPkg(PhysicalComponentPkg)
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalArchitecture_OwnedPhysicalComponentPkg()
	 * @model containment="true"
	 * @generated
	 */
	PhysicalComponentPkg getOwnedPhysicalComponentPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedPhysicalComponentPkg <em>Owned Physical Component Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Physical Component Pkg</em>' containment reference.
	 * @see #getOwnedPhysicalComponentPkg()
	 * @generated
	 */
	void setOwnedPhysicalComponentPkg(PhysicalComponentPkg value);

	/**
	 * Returns the value of the '<em><b>Owned Physical Actor Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Actor Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Actor Pkg</em>' containment reference.
	 * @see #setOwnedPhysicalActorPkg(PhysicalActorPkg)
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalArchitecture_OwnedPhysicalActorPkg()
	 * @model containment="true"
	 * @generated
	 */
	PhysicalActorPkg getOwnedPhysicalActorPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getOwnedPhysicalActorPkg <em>Owned Physical Actor Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Physical Actor Pkg</em>' containment reference.
	 * @see #getOwnedPhysicalActorPkg()
	 * @generated
	 */
	void setOwnedPhysicalActorPkg(PhysicalActorPkg value);

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
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalArchitecture_ContainedCapabilityRealizationPkg()
	 * @model containment="true"
	 * @generated
	 */
	CapabilityRealizationPkg getContainedCapabilityRealizationPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Capability Realization Pkg</em>' containment reference.
	 * @see #getContainedCapabilityRealizationPkg()
	 * @generated
	 */
	void setContainedCapabilityRealizationPkg(CapabilityRealizationPkg value);

	/**
	 * Returns the value of the '<em><b>Contained Physical Function Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Physical Function Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Physical Function Pkg</em>' containment reference.
	 * @see #setContainedPhysicalFunctionPkg(PhysicalFunctionPkg)
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalArchitecture_ContainedPhysicalFunctionPkg()
	 * @model containment="true"
	 * @generated
	 */
	PhysicalFunctionPkg getContainedPhysicalFunctionPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture#getContainedPhysicalFunctionPkg <em>Contained Physical Function Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Physical Function Pkg</em>' containment reference.
	 * @see #getContainedPhysicalFunctionPkg()
	 * @generated
	 */
	void setContainedPhysicalFunctionPkg(PhysicalFunctionPkg value);

	/**
	 * Returns the value of the '<em><b>Owned Deployments</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.AbstractDeploymentLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Deployments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Deployments</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalArchitecture_OwnedDeployments()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractDeploymentLink> getOwnedDeployments();

	/**
	 * Returns the value of the '<em><b>Allocated Logical Architectures</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.LogicalArchitecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Logical Architectures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Logical Architectures</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalArchitecture_AllocatedLogicalArchitectures()
	 * @model
	 * @generated
	 */
	EList<LogicalArchitecture> getAllocatedLogicalArchitectures();

} // PhysicalArchitecture
