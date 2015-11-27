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
package org.polarsys.capella.vp.perfo.design.service.tools;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.vp.perfo.perfo.PerfoFactory;
import org.polarsys.capella.vp.perfo.perfo.timeCapacity;
import org.polarsys.capella.vp.perfo.perfo.timeConsumption;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the DoReMi JavaExtension '<em><b>[org.polarsys.capella.vp.perfo.design.service.tools.OpenActionService]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class OpenActionService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param element : the element
	 * @param newSemanticContainer : the element view
	 * @generated NOT
	 */
	public boolean CreateLABFunctionTimeConsumption(EObject element, EObject newSemanticContainer) {
		if (element instanceof AbstractFunction
				&& checktimeConsumptionUnicity(((AbstractFunction) element).getOwnedExtensions())) {
			AbstractFunction functionalExchange = (AbstractFunction) element;
			timeConsumption timeConsumption = PerfoFactory.eINSTANCE.createtimeConsumption();
			timeConsumption.setId(EcoreUtil.generateUUID());
			timeConsumption.setValue(0);
			functionalExchange.getOwnedExtensions().add(timeConsumption);
			return true;
		}

		if (element instanceof FunctionalExchange
				&& checktimeConsumptionUnicity(((FunctionalExchange) element).getOwnedExtensions())) {
			FunctionalExchange functionalExchange = (FunctionalExchange) element;
			timeConsumption timeConsumption = PerfoFactory.eINSTANCE.createtimeConsumption();
			timeConsumption.setId(EcoreUtil.generateUUID());
			timeConsumption.setValue(0);
			functionalExchange.getOwnedExtensions().add(timeConsumption);
			return true;
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param element : the element
	 * @param newSemanticContainer : the element view
	 * @generated NOT
	 */
	public boolean createFunctionalCapacity(EObject element, EObject newSemanticContainer) {
		if (element instanceof FunctionalChain
				&& checktimeCapacityUnicity(((FunctionalChain) element).getOwnedExtensions())) {
			FunctionalChain functionalChain = (FunctionalChain) element;
			timeCapacity timeCapacity = PerfoFactory.eINSTANCE.createtimeCapacity();
			timeCapacity.setId(EcoreUtil.generateUUID());
			timeCapacity.setValue(0);
			functionalChain.getOwnedExtensions().add(timeCapacity);
			return true;
		}
		return false;
	}

	private boolean checktimeConsumptionUnicity(EList<ElementExtension> extensions) {

		for (ElementExtension elementExtension : extensions) {
			if (elementExtension instanceof timeConsumption)
				return false;
		}
		return true;
	}

	private boolean checktimeCapacityUnicity(EList<ElementExtension> extensions) {

		for (ElementExtension elementExtension : extensions) {
			if (elementExtension instanceof timeCapacity)
				return false;
		}
		return true;
	}

}