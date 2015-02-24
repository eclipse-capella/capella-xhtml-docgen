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
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EObject;

/** <p>
* <strong>EXPERIMENTAL</strong>. This class or interface has been added as
* part of a work in progress. There is no guarantee that this API will
* work or that it will remain the same. Please do not use this API without
* consulting with the Capella team.
* </p>
*/
class CommonRootCopier {
  
  
  
 /**
  * FIXME this is broken due changes in export engine.
  * @param monitor_p the progress monitor to use for reporting progress to the user. It is the caller's responsibility
  *        to call done() on the given monitor. Accepts null, indicating that no progress should be
  *        reported and that the operation cannot be cancelled.
  **/
	static void copyAllRequiredAncestors(EObject commonAncestorRoot_p, ExportEngine engine_p, IProgressMonitor monitor_p) {
	  
	  SubMonitor subMonitor = SubMonitor.convert(monitor_p, 100);
	  
		Collection<EObject> allRequiredAncestors = new HashSet<EObject>();
		Collection<EObject> copied = engine_p.keySet();
		for (EObject e : copied){
			allRequiredAncestors.addAll(getRequiredAncestors(e, copied, commonAncestorRoot_p));
		}
		engine_p.copyAll(allRequiredAncestors);
	}

	private static Collection<EObject> getRequiredAncestors(EObject e_p, Collection<EObject> copied_p, EObject commonAncestor){
		Set<EObject> requiredAncestors = new HashSet<EObject>();
		EObject parent = e_p.eContainer();
		while (parent != null){
			if (copied_p.contains(parent)){
				return requiredAncestors;
			}
			if (!requiredAncestors.add(parent)){
				throw new IllegalStateException("Containment hierarchy of " + e_p + " contains a cycle!");
			}
			if (parent == commonAncestor){
				break;
			}
			parent = parent.eContainer();
		}
		return requiredAncestors;
	}
	
	
}
 
