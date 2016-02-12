/*******************************************************************************
 * Copyright (c) 2006, 2016 Thales Global Services
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/
// Generated on 20.08.2015 at 11:04:11 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.mass.design.service;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.vp.mass.helpers.MassHelper;

/**
 * <!-- begin-user-doc --> This class is an implementation of the DoReMi
 * JavaExtension '
 * <em><b>[org.polarsys.capella.vp.mass.design.service.MassOpenJavaService]</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */

public class MassOpenJavaService {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MassOpenJavaService() {
		// TODO Auto-generated method stub
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<EObject> getMassObjects(EObject eObject, DSemanticDiagram diagram) {
		EList<EObject> result = new BasicEList<EObject>();

		for (DSemanticDecorator node : diagram.getContainers()) {
			final EObject target = node.getTarget();
			if (target instanceof Part) {
				EList<EObject> massElement = getMassObjects(target);
				if (massElement != null && ! massElement.isEmpty()) {
					result.addAll(massElement);
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<EObject> getMassObjects(EObject eObject) {
		EList<EObject> resultat = new BasicEList<EObject>();
		MassHelper massHelper = new MassHelper();
		resultat.addAll(massHelper.getMassObjects(eObject));
		return resultat;
	}
}