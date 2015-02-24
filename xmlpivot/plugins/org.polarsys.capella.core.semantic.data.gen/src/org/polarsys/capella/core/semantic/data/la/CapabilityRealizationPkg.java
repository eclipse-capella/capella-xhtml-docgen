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

import org.polarsys.capella.core.semantic.data.capellacommon.AbstractCapabilityPkg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Realization Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.CapabilityRealizationPkg#getOwnedCapabilityRealizations <em>Owned Capability Realizations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.CapabilityRealizationPkg#getOwnedCapabilityRealizationPkgs <em>Owned Capability Realization Pkgs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getCapabilityRealizationPkg()
 * @model
 * @generated
 */
public interface CapabilityRealizationPkg extends AbstractCapabilityPkg {
	/**
	 * Returns the value of the '<em><b>Owned Capability Realizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.CapabilityRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Capability Realizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Capability Realizations</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getCapabilityRealizationPkg_OwnedCapabilityRealizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityRealization> getOwnedCapabilityRealizations();

	/**
	 * Returns the value of the '<em><b>Owned Capability Realization Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.CapabilityRealizationPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Capability Realization Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Capability Realization Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getCapabilityRealizationPkg_OwnedCapabilityRealizationPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityRealizationPkg> getOwnedCapabilityRealizationPkgs();

} // CapabilityRealizationPkg
