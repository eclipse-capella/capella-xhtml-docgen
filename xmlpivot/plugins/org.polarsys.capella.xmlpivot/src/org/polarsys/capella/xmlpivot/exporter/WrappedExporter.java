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

/**
 * An AbstractExporter that wraps another AbstractExporter.
 * 
 * This can be used to decorate the behavior of an existing exporter like this:
 * <pre> 
 * {@code
 *   MyWrappedExporter extends AbstractExporter {
 *   
 *    protected void doCopyObjects(Collection<? extends EObject> context, IProgressMonitor monitor){
 *      super.doCopyObjects(context, monitor) // this calls out to the decorated exporter
 *      copySomeMoreObjects() // 
 *    }
 *   
 *   }
 * }
 * </pre>
 * It could also be used to alter the context for the decorated exporter
 * 
 */
public class WrappedExporter extends AbstractExporter {

  private final AbstractExporter wrapped;
  
  /**
   * @param engine_p
   */
  public WrappedExporter(AbstractExporter wrapped_p) {
    super(wrapped_p.getExportEngine());
    wrapped = wrapped_p;
  }

  /**
   * Delegates to doCopyObjects of the wrapped exporter. 
   * {@inheritDoc}
   */
  @Override
  protected void doCopyObjects(Collection<? extends EObject> sourceObjects_p, IProgressMonitor monitor_p) {
    wrapped.doCopyObjects(sourceObjects_p, monitor_p);
  }

}
