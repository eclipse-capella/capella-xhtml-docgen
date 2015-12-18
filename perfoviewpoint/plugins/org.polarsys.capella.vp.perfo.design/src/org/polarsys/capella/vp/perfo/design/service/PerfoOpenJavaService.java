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

// Generated on 21.08.2015 at 01:30:29 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.perfo.design.service;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.vp.perfo.perfo.TimeCapacity;
import org.polarsys.capella.vp.perfo.perfo.TimeConsumption;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the DoReMi JavaExtension '<em><b>[org.polarsys.capella.vp.perfo.design.service.PerfoOpenJavaService]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class PerfoOpenJavaService {
	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public PerfoOpenJavaService() {
		// TODO Auto-generated method stub
	}

	public EList<EObject> getTimeConsumptionObject(EObject eObject, DSemanticDiagram diagram) {
		EList<EObject> result = new BasicEList<EObject>();

		for (DNode node : diagram.getNodes()) {
			final EObject target = node.getTarget();
			if (target instanceof AbstractFunction) {
				EObject timeConsumption = getTimeConsumptionObject(target);
				if (timeConsumption != null) {
					result.add(timeConsumption);
				}
			}
		}

		for (DEdge edge : diagram.getEdges()) {
			if (edge.getTarget() instanceof FunctionalExchange) {
				EObject timeConsumption = getTimeConsumptionObject(edge.getTarget());
				if (timeConsumption != null) {
					result.add(timeConsumption);
				}
			}
		}

		return result;
	}

	public EObject getTimeConsumptionObject(EObject eO) {
		if (eO == null)
			return null;

		if (eO instanceof ExtensibleElement) {
			ExtensibleElement logicalFunction = (ExtensibleElement) eO;
			EList<ElementExtension> extensions = logicalFunction.getOwnedExtensions();
			for (ElementExtension elementExtension : extensions) {
				if (elementExtension instanceof TimeConsumption) {
					return elementExtension;
				}

			}
		}
		return eO;
	}

	public EList<EObject> retrieveMaTimeCapacity(EObject eObject, DSemanticDiagram diagram) {

		EList<EObject> result = new BasicEList<EObject>();

		for (DNode node : diagram.getNodes()) {
			final EObject target = node.getTarget();
			if (target instanceof FunctionalChain) {
				EObject capacity = retrieveMaTimeCapacity_(target);
				if (capacity != null) {
					result.add(capacity);
				}
			}
		}

		for (DEdge edge : diagram.getEdges()) {
			if (edge.getTarget() instanceof FunctionalChain) {
				EObject capacity = retrieveMaTimeCapacity_(edge.getTarget());
				if (capacity != null) {
					result.add(capacity);
				}
			}
		}

		return result;

	}

	public EObject retrieveMaTimeCapacity_(EObject eObject) {
		if (eObject == null)
			return null;

		if (eObject instanceof ExtensibleElement) {
			ExtensibleElement functionalChain = (ExtensibleElement) eObject;
			EList<ElementExtension> extensions = functionalChain.getOwnedExtensions();
			for (ElementExtension elementExtension : extensions) {
				if (elementExtension instanceof TimeCapacity) {
					return elementExtension;
				}

			}
		}
		return eObject;
	}

}