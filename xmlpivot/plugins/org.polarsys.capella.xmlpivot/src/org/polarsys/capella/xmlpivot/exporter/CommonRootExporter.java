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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.xmlpivot.XMLPivotStatus;


import static org.polarsys.capella.xmlpivot.XMLPivotStatus.EXPORT_COMMON_ROOT_DANGLING_SUBTREE;


/** 
 * A decorating exporter that makes sure that all ancestors of exported elements
 * are also exported.
 * <p>
* <strong>EXPERIMENTAL</strong>. This class or interface has been added as
* part of a work in progress. There is no guarantee that this API will
* work or that it will remain the same. Please do not use this API without
* consulting with the Capella team.
* </p>
*/
class CommonRootExporter extends WrappedExporter {

	/**
   * @param wrapped_p
   */
  CommonRootExporter(AbstractExporter wrapped_p) {
    super(wrapped_p);
  }
  
  @Override
  protected void doCopyObjects(Collection<? extends EObject> sourceObjects_p, IProgressMonitor monitor_p){
    super.doCopyObjects(sourceObjects_p, monitor_p);
    
    for (EObject copied : new ArrayList<EObject>(getExportEngine().keySet())){
      EObject container = copied.eContainer();
      while (container != null){
        if (getExportEngine().copy(container) == null){
          XMLPivotStatus.log(EXPORT_COMMON_ROOT_DANGLING_SUBTREE, copied, container);
          break;
        }
        container = container.eContainer();
      }
    }
    
  }
	
}
