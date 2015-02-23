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
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.xmlpivot.common.predicates.EMFPredicates;

import com.google.common.collect.Collections2;

/** <p>
* <strong>EXPERIMENTAL</strong>. This class or interface has been added as
* part of a work in progress. There is no guarantee that this API will
* work or that it will remain the same. Please do not use this API without
* consulting with the Capella team.
*/
public abstract class AbstractExporter {
	
	private final ExportEngine exportEngine;
	
	public AbstractExporter(ExportEngine engine){
		exportEngine = engine;
	}
	
	public ExportEngine getExportEngine(){
		return exportEngine;
	}
	
	/**
	 * Export a collection of objects, usually a selection in the workbench.
	 * 
	 * Which elements will actually be exported depends on the concrete
	 * exporter implementation. It may even be possible that none of the
	 * elements in the argument list are exported at all. The argument serves
	 * simply as a context for a concrete exporter.
	 * 
	 * The result model can be accessed through the Map view of the ExportEngine
	 * passed in the constructor, where the Map keys are original objects, and
	 * values are the pivot model.
	 * 
	 * The returned collection contains the root containers of the export result.
	 * Again, this result may not map 1:1 to the input collection.
	 * 
	 * @param sourceObjects the initial collection of source elements.
	 * @param monitor_p the progress monitor to use for reporting progress to the user. It is the caller's responsibility
        to call done() on the given monitor. Accepts null, indicating that no progress should be
        reported and that the operation cannot be cancelled.
	 * @return the root containers of the export result
	 */
	public Collection<EObject> export(Collection<? extends EObject> sourceObjects, IProgressMonitor monitor) {
	  SubMonitor subMonitor = SubMonitor.convert(monitor, 100);
	  doCopyObjects(sourceObjects, subMonitor.newChild(50));
	  getExportEngine().copyReferences();
	  subMonitor.worked(40);
	  Collection<EObject> result = Collections2.filter(getExportEngine().values(), EMFPredicates.isRootContainer());
	  subMonitor.worked(10);
	  return result;
	}
	  
	/**
	 * For the given input, copies desired objects via {@code getExportEngine().copy(EObject)}. Must not call
	 * {@code getExportEngine().copyReferences()}.
	 * @param context
	 * @param monitor
	 */
	protected abstract void doCopyObjects(Collection<? extends EObject> sourceObjects, IProgressMonitor monitor);

}
