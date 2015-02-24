/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *    
 *  Contributors:
 *     Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.xmlpivot.importer;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeEnd;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.common.data.modellingcore.InformationsExchanger;

/**
 *
 */
public class ComponentExchangeImportAdapter extends AdapterImpl implements ImportAdapter {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void doImport(EObject technical_p, EObject simplified_p, ImportEngine engine_p) {
		ComponentExchange exchange = (ComponentExchange) technical_p;
		EReference simplifiedOutputPortRef = engine_p.getMapping().getSimplified(FaPackage.Literals.COMPONENT_EXCHANGE__SOURCE_PORT);
		EReference simplifiedInputPortRef = engine_p.getMapping().getSimplified(FaPackage.Literals.COMPONENT_EXCHANGE__TARGET_PORT);
		
		EReference simplifiedSourcePartRef = engine_p.getMapping().getSimplified(FaPackage.Literals.COMPONENT_EXCHANGE__SOURCE_PART);
		EReference simplifiedTargetPartRef = engine_p.getMapping().getSimplified(FaPackage.Literals.COMPONENT_EXCHANGE__TARGET_PART);
		
		if (exchange.getSource() == null){
			for (ComponentExchangeEnd end : exchange.getOwnedComponentExchangeEnds()){
				if (end.getPort() != null && end.getPort() == engine_p.get(simplified_p.eGet(simplifiedOutputPortRef))){
						exchange.setSource(end);
					}
				}
			}
		
		if (exchange.getSource() == null){
			EObject simplifiedOutputPort = (EObject) simplified_p.eGet(simplifiedOutputPortRef);
			if (engine_p.get(simplifiedOutputPort) instanceof InformationsExchanger){
				exchange.setSource((InformationsExchanger) engine_p.get(simplifiedOutputPort));
			}
		}
		
		if (exchange.getSource() == null){
		  EObject simplifiedSourcePart = (EObject) simplified_p.eGet(simplifiedSourcePartRef);
		  if (engine_p.get(simplifiedSourcePart) instanceof InformationsExchanger){
		    exchange.setSource((InformationsExchanger) engine_p.get(simplifiedSourcePart));
		  }
		}
		
		
		
		if (exchange.getTarget() == null){
			for (ComponentExchangeEnd end : exchange.getOwnedComponentExchangeEnds()){
				if (end.getPort() != null && end.getPort() == engine_p.get(simplified_p.eGet(simplifiedInputPortRef))){
						exchange.setTarget(end);
					}
				}
			}
		
		if (exchange.getTarget() == null){
			EObject simplifiedInputPort = (EObject) simplified_p.eGet(simplifiedInputPortRef);
			if (engine_p.get(simplifiedInputPort) instanceof InformationsExchanger){
				exchange.setTarget((InformationsExchanger) engine_p.get(simplifiedInputPort));
			}
		}
		
		if (exchange.getTarget() == null){
      EObject simplifiedTargetPart = (EObject) simplified_p.eGet(simplifiedTargetPartRef);
      if (engine_p.get(simplifiedTargetPart) instanceof InformationsExchanger){
        exchange.setTarget((InformationsExchanger) engine_p.get(simplifiedTargetPart));
      }
    }
		
		
	}

}
