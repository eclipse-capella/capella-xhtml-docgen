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

import org.polarsys.capella.core.semantic.data.capellacommon.AbstractCapabilityPkg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.CapabilityPkg#getOwnedCapabilities <em>Owned Capabilities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.CapabilityPkg#getOwnedCapabilityPkgs <em>Owned Capability Pkgs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getCapabilityPkg()
 * @model
 * @generated
 */
public interface CapabilityPkg extends AbstractCapabilityPkg {
	/**
	 * Returns the value of the '<em><b>Owned Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Capabilities</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getCapabilityPkg_OwnedCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capability> getOwnedCapabilities();

	/**
	 * Returns the value of the '<em><b>Owned Capability Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.CapabilityPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Capability Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Capability Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getCapabilityPkg_OwnedCapabilityPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityPkg> getOwnedCapabilityPkgs();

} // CapabilityPkg
