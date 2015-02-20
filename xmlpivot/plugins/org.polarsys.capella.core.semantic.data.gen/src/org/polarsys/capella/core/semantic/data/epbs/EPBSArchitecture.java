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

package org.polarsys.capella.core.semantic.data.epbs;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.cs.BlockArchitecture;

import org.polarsys.capella.core.semantic.data.la.CapabilityRealizationPkg;

import org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPBS Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getOwnedEPBSContext <em>Owned EPBS Context</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getOwnedConfigurationItem <em>Owned Configuration Item</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getOwnedConfigurationItemPkg <em>Owned Configuration Item Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getAllocatedPhysicalArchitectures <em>Allocated Physical Architectures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.epbs.EpbsPackage#getEPBSArchitecture()
 * @model
 * @generated
 */
public interface EPBSArchitecture extends BlockArchitecture {
	/**
	 * Returns the value of the '<em><b>Owned EPBS Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned EPBS Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned EPBS Context</em>' containment reference.
	 * @see #setOwnedEPBSContext(EPBSContext)
	 * @see org.polarsys.capella.core.semantic.data.epbs.EpbsPackage#getEPBSArchitecture_OwnedEPBSContext()
	 * @model containment="true"
	 * @generated
	 */
	EPBSContext getOwnedEPBSContext();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getOwnedEPBSContext <em>Owned EPBS Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned EPBS Context</em>' containment reference.
	 * @see #getOwnedEPBSContext()
	 * @generated
	 */
	void setOwnedEPBSContext(EPBSContext value);

	/**
	 * Returns the value of the '<em><b>Owned Configuration Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Configuration Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Configuration Item</em>' containment reference.
	 * @see #setOwnedConfigurationItem(ConfigurationItem)
	 * @see org.polarsys.capella.core.semantic.data.epbs.EpbsPackage#getEPBSArchitecture_OwnedConfigurationItem()
	 * @model containment="true"
	 * @generated
	 */
	ConfigurationItem getOwnedConfigurationItem();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getOwnedConfigurationItem <em>Owned Configuration Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Configuration Item</em>' containment reference.
	 * @see #getOwnedConfigurationItem()
	 * @generated
	 */
	void setOwnedConfigurationItem(ConfigurationItem value);

	/**
	 * Returns the value of the '<em><b>Owned Configuration Item Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Configuration Item Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Configuration Item Pkg</em>' containment reference.
	 * @see #setOwnedConfigurationItemPkg(ConfigurationItemPkg)
	 * @see org.polarsys.capella.core.semantic.data.epbs.EpbsPackage#getEPBSArchitecture_OwnedConfigurationItemPkg()
	 * @model containment="true"
	 * @generated
	 */
	ConfigurationItemPkg getOwnedConfigurationItemPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getOwnedConfigurationItemPkg <em>Owned Configuration Item Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Configuration Item Pkg</em>' containment reference.
	 * @see #getOwnedConfigurationItemPkg()
	 * @generated
	 */
	void setOwnedConfigurationItemPkg(ConfigurationItemPkg value);

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
	 * @see org.polarsys.capella.core.semantic.data.epbs.EpbsPackage#getEPBSArchitecture_ContainedCapabilityRealizationPkg()
	 * @model containment="true"
	 * @generated
	 */
	CapabilityRealizationPkg getContainedCapabilityRealizationPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Capability Realization Pkg</em>' containment reference.
	 * @see #getContainedCapabilityRealizationPkg()
	 * @generated
	 */
	void setContainedCapabilityRealizationPkg(CapabilityRealizationPkg value);

	/**
	 * Returns the value of the '<em><b>Allocated Physical Architectures</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Physical Architectures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Physical Architectures</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.epbs.EpbsPackage#getEPBSArchitecture_AllocatedPhysicalArchitectures()
	 * @model
	 * @generated
	 */
	EList<PhysicalArchitecture> getAllocatedPhysicalArchitectures();

} // EPBSArchitecture
