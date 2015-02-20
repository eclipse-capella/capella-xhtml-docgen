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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.capella.core.data.fa.FaPackage;

/** <p>
* <strong>EXPERIMENTAL</strong>. This class or interface has been added as
* part of a work in progress. There is no guarantee that this API will
* work or that it will remain the same. Please do not use this API without
* consulting with the Capella team.
* </p>
*/
public class FunctionAllocations extends CrossReferenceExporter {

	/**
	 * @param engine
	 */
	public FunctionAllocations(ExportEngine engine) {
		super(engine);
	}

	private static final Set<EReference> acceptedCrossReferences;
	static { 
		EReference[] accepted = {
				FaPackage.Literals.ABSTRACT_FUNCTION__ALLOCATION_BLOCKS,
				FaPackage.Literals.ABSTRACT_FUNCTIONAL_BLOCK__ALLOCATED_FUNCTIONS
				
		};
		acceptedCrossReferences = new HashSet<EReference>(Arrays.asList(accepted));
	}

	@Override
	protected boolean doAccept(EObject referent, EReference reference){
		return acceptedCrossReferences.contains(reference);
	}
	

}
