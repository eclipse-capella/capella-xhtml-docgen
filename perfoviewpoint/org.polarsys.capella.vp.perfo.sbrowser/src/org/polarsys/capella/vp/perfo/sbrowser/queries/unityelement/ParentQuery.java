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
package org.polarsys.capella.vp.perfo.sbrowser.queries.unityelement;

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
