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

import org.polarsys.capella.core.semantic.data.capellacore.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.MissionPkg#getOwnedMissionPkgs <em>Owned Mission Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.MissionPkg#getOwnedMissions <em>Owned Missions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getMissionPkg()
 * @model
 * @generated
 */
public interface MissionPkg extends Structure {
	/**
	 * Returns the value of the '<em><b>Owned Mission Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.MissionPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Mission Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Mission Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getMissionPkg_OwnedMissionPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<MissionPkg> getOwnedMissionPkgs();

	/**
	 * Returns the value of the '<em><b>Owned Missions</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.Mission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Missions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Missions</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getMissionPkg_OwnedMissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mission> getOwnedMissions();

} // MissionPkg
