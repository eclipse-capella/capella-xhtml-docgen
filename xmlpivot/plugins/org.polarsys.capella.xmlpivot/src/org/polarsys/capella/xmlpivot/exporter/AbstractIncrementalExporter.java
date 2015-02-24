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

import static com.google.common.base.Predicates.in;
import static com.google.common.base.Predicates.not;
import static com.google.common.base.Predicates.or;
import static com.google.common.collect.Iterators.filter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Function;

/**
 * <p>
 * <strong>EXPERIMENTAL</strong>. This class or interface has been added as
 * part of a work in progress. There is no guarantee that this API will
 * work or that it will remain the same. Please do not use this API without
 * consulting with the Capella team.
 * </p>
 */
public class AbstractIncrementalExporter extends DefaultExporter {
	
  private final Function<Collection<? extends EObject>, Iterator<? extends EObject>> incrementor;
  
	/**
	 * @param engine
	 */
	public AbstractIncrementalExporter(ExportEngine engine, Function<Collection<? extends EObject>, Iterator<? extends EObject>> incrementor) {
	  super(engine);
	  this.incrementor = incrementor;
	}

	@Override
	protected final void doCopyObjects(Collection<? extends EObject> context, IProgressMonitor monitor_p){
	  
	  Iterator<? extends EObject> toCopy = new ArrayList<EObject>(context).iterator();
	  while (toCopy.hasNext()){
	    Collection<EObject> lastIteration = new HashSet<EObject>();
	    while (toCopy.hasNext()){
	      EObject next = toCopy.next();
	      getExportEngine().copy(next);
	      lastIteration.add(next);
	    }
	    
	    Iterator<? extends EObject> more = incrementor.apply(lastIteration);
	    
	    // the incrementor may return the same object more than once.
      // => need to protect against infinite loops by postprocessing
      //    the incrementor result, skipping any such object
	    toCopy = filter(more, 
	        not(
	            or( 
	                in(getExportEngine().keySet()),
	                in(getExportEngine().getUnmappedObjects())
	            )
	        )
	    );
	    
	  }
	}
}
