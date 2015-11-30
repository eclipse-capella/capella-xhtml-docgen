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
// Generated on 20.08.2015 at 11:04:01 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.mass.sbrowser.queries.partmass;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.common.helpers.query.IQuery;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParentQuery implements IQuery {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Default constructor
	 * @generated
	 */
	public ParentQuery() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param object_p: The model element for which the semantic browser extension is generated
	 * @return List of object to display in the parent category
	 * @generated
	 */
	public List<Object> compute(Object object_p) {
		List<Object> result = new ArrayList<Object>();
		EObject eObject = (EObject) object_p;
		result.add(eObject.eContainer());
		return result;
	}

}
