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

package org.polarsys.capella.core.semantic.data.oa;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacommon.AbstractCapabilityPkg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Capability Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.OperationalCapabilityPkg#getOwnedOperationalCapabilities <em>Owned Operational Capabilities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.OperationalCapabilityPkg#getOwnedOperationalCapabilityPkgs <em>Owned Operational Capability Pkgs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getOperationalCapabilityPkg()
 * @model
 * @generated
 */
public interface OperationalCapabilityPkg extends AbstractCapabilityPkg {
	/**
	 * Returns the value of the '<em><b>Owned Operational Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.OperationalCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operational Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operational Capabilities</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getOperationalCapabilityPkg_OwnedOperationalCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationalCapability> getOwnedOperationalCapabilities();

	/**
	 * Returns the value of the '<em><b>Owned Operational Capability Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.OperationalCapabilityPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operational Capability Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operational Capability Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getOperationalCapabilityPkg_OwnedOperationalCapabilityPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationalCapabilityPkg> getOwnedOperationalCapabilityPkgs();

} // OperationalCapabilityPkg
