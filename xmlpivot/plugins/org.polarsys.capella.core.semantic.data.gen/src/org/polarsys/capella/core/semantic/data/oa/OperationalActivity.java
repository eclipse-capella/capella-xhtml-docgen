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

import org.polarsys.capella.core.semantic.data.fa.AbstractFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.OperationalActivity#getOwnedOperationalActivityPkgs <em>Owned Operational Activity Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.OperationalActivity#getContainedOperationalActivities <em>Contained Operational Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getOperationalActivity()
 * @model
 * @generated
 */
public interface OperationalActivity extends AbstractFunction {
	/**
	 * Returns the value of the '<em><b>Owned Operational Activity Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.OperationalActivityPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operational Activity Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operational Activity Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getOperationalActivity_OwnedOperationalActivityPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationalActivityPkg> getOwnedOperationalActivityPkgs();

	/**
	 * Returns the value of the '<em><b>Contained Operational Activities</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.OperationalActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Operational Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Operational Activities</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getOperationalActivity_ContainedOperationalActivities()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationalActivity> getContainedOperationalActivities();

} // OperationalActivity
