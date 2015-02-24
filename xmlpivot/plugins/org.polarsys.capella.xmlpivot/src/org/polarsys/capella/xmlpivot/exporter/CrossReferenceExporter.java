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
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.capella.core.model.semantic.SimplifiedCapellaMetadata;

/** <p>
* <strong>EXPERIMENTAL</strong>. This class or interface has been added as
* part of a work in progress. There is no guarantee that this API will
* work or that it will remain the same. Please do not use this API without
* consulting with the Capella team.
* </p>
*/
public class CrossReferenceExporter extends AbstractIncrementalExporter {
  
	/**
	 * @param engine
	 */
	public CrossReferenceExporter(ExportEngine engine) {
		super(engine, null);
	}

	
  protected Collection<? extends EObject> getMoreObjectsToCopy(Collection<EObject> context,  Map<EObject, EObject> copied) {
	  Collection<EObject> result = new HashSet<EObject>();
		for (EObject alreadyCopied : copied.keySet()){
			for (EReference ref : alreadyCopied.eClass().getEAllReferences()){
				if (accept(alreadyCopied, ref)){
					Object value = alreadyCopied.eGet(ref);
					if (ref.isMany()){
					  //result.addAll((List<EObject>) value);
						for (EObject referenced : (List<EObject>) value){
						  result.add(referenced);
						}
					} else if (value != null) {
					  result.add((EObject) value);
					}
				}
			}
		}
		return result;
	}
	
	protected boolean accept(EObject eObject, EReference reference){
	  if (!SimplifiedCapellaMetadata.INSTANCE.isNavigable(reference) || reference.isContainer()){
	    return false;
	  }
	  return doAccept(eObject, reference);
	}
	
	protected boolean doAccept(EObject referent, EReference reference){
	  return true;
	}
	
}
