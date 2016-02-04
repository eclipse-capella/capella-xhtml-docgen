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
// Generated on 20.08.2015 at 04:49:15 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.price.design.service;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.vp.price.helpers.PriceHelper;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the DoReMi JavaExtension '<em><b>[org.polarsys.capella.vp.price.design.service.PriceOpenJavaService]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class PriceOpenJavaService {
	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public PriceOpenJavaService() {
		// TODO Auto-generated method stub
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EObject> getPriceObjects(EObject eObject, DSemanticDiagram diagram) {
		EList<EObject> result = new BasicEList<EObject>();

        for (DNode node : diagram.getNodes()) {
               final EObject target = node.getTarget();
               if (target instanceof AbstractFunction) {
                     EList<EObject> priceElement = getPriceObjects(target);
                     if (priceElement != null && !! priceElement.isEmpty() ) {
                            result.addAll(priceElement);
                     }
               }
        }

        return result;
	}

	/**
	 * return the Price object of a given eObject
	 * @param eObject
	 * @return
	 * @generated NOT
	 */
	public EList<EObject> getPriceObjects(EObject eObject) {
		EList<EObject> resultat = new BasicEList<EObject>();
		PriceHelper priceHelper = new PriceHelper();
		resultat.addAll(priceHelper.getPriceObject(eObject));
		return resultat;
	}
}