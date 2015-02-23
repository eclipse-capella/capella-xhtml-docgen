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
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.pa.PaPackage;

/** <p>
* <strong>EXPERIMENTAL</strong>. This class or interface has been added as
* part of a work in progress. There is no guarantee that this API will
* work or that it will remain the same. Please do not use this API without
* consulting with the Capella team.
* </p>
*/
public class FunctionRealisations extends CrossReferenceExporter {

	/**
	 * @param engine
	 */
	public FunctionRealisations(ExportEngine engine) {
		super(engine);
	}

	private static final Set<EReference> acceptedCrossReferences;
	static { 
		EReference[] accepted = {
				PaPackage.Literals.PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS,
				LaPackage.Literals.LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS,
				LaPackage.Literals.LOGICAL_FUNCTION__REALIZING_PHYSICAL_FUNCTIONS,
				CtxPackage.Literals.SYSTEM_FUNCTION__REALIZING_LOGICAL_FUNCTIONS,
				CtxPackage.Literals.SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES,
				OaPackage.Literals.OPERATIONAL_ACTIVITY__REALIZING_SYSTEM_FUNCTIONS,
		};
		acceptedCrossReferences = new HashSet<EReference>(Arrays.asList(accepted));
	}

		protected Collection<EReference> getAcceptedCrossReferences(){
		return acceptedCrossReferences;
	}


}
;
