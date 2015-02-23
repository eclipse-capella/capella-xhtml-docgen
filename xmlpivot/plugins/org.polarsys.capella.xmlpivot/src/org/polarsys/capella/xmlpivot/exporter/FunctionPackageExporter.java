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
package org.polarsys.capella.xmlpivot.exporter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.fa.FunctionInputPort;
import org.polarsys.capella.core.data.fa.FunctionOutputPort;
import org.polarsys.capella.core.data.fa.FunctionalExchange;

/**
 * <p>
 * <strong>EXPERIMENTAL</strong>. This class or interface has been added as
 * part of a work in progress. There is no guarantee that this API will
 * work or that it will remain the same. Please do not use this API without
 * consulting with the <Your Team Name> team.
 * </p>
 */
public class FunctionPackageExporter extends AbstractIncrementalExporter {

	/**
	 * @param engine
	 */
	public FunctionPackageExporter(ExportEngine engine) {
		super(engine, null);
	}

	/**
	 * @see org.polarsys.capella.xmlpivot.exporter.AbstractIncrementalExporter#getMoreObjectsToCopy(java.util.Collection, java.util.Map)
	 */
	protected Collection<? extends EObject> getMoreObjectsToCopy(Collection<EObject> context, Map<EObject, EObject> copied) {
		
		Collection<EObject> result = new ArrayList<EObject>();
		
		for (EObject e : copied.keySet()){
			
			if (e instanceof FunctionOutputPort){
				result.addAll(((FunctionOutputPort)e).getOutgoingExchangeItems());
			}
			
			if (e instanceof FunctionInputPort){
				result.addAll(((FunctionInputPort)e).getIncomingExchangeItems());
			}
			
			if (e instanceof FunctionalExchange){
				result.addAll(((FunctionalExchange) e).getCategories());
				result.addAll(((FunctionalExchange) e).getExchangedItems());
			}
			
			
		}
		
		return result;
	}
	
	

}
