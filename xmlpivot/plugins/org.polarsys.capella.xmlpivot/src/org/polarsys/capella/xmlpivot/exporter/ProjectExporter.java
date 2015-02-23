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

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.capellamodeller.Project;

/**
 *
 */
class ProjectExporter extends WrappedExporter {

	/**
	 * @param wrapped_p
	 */
	ProjectExporter(AbstractExporter wrapped_p) {
		super(wrapped_p);
	}
	
	
	@Override
  protected void doCopyObjects(Collection<? extends EObject> context, IProgressMonitor monitor){
		super.doCopyObjects(context, monitor);
		for (EObject e : getExportEngine().keySet()){
			if (e instanceof Project){
				getExportEngine().copyAll(((Project) e).getKeyValuePairs());
				return;
			}
		}
	}

}
