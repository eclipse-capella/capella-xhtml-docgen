/*******************************************************************************
 * Copyright (c) 2006, 2015 Thales Global Services
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/
// Generated on 20.08.2015 at 11:04:12 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.mass.design.service.nodes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the DoReMi JavaExtension '<em><b>[org.polarsys.capella.vp.mass.design.service.nodes.PC_Deployment_Mass_Container_Service]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated NOT
 */

public class PC_Deployment_Mass_Container_Service {
	/**
	 * @generated NOT
	 */
	private MassLevelHelper massLevelHelper = new MassLevelHelper();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eObject : the current semantic object
	 * @generated NOT
	 */
	public int computeMass(EObject eObject) {
		return massLevelHelper.computeMass(eObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eObject : the current semantic object
	 * @param view : the current view
	 * @param container : the semantic container of the current object
	 * @generated NOT
	 */
	public boolean isMassSaturated(EObject eObject, EObject view, EObject container) {
		return massLevelHelper.isMassSaturated(eObject, view, container);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eObject : the current semantic object
	 * @param view : the current view
	 * @param container : the semantic container of the current object
	 * @generated NOT
	 */
	public boolean isMassOverhead(EObject eObject, EObject view, EObject container) {
		return massLevelHelper.isMassOverhead(eObject, view, container);
	}
}