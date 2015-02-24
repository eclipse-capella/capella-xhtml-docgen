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
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EContentsEList;

import com.google.common.base.Function;
import org.polarsys.capella.core.model.semantic.SimplifiedCapellaMetadata;

/**
 * An function which returns an elements navigable crossreferenced elements, excluding those that have 'simplified' containment
 * semantics or whose runtime type is a non-semantic eClass.
 *
 */
public class CrossReferenceIncrementor implements Function<Collection<? extends EObject>, Iterator<? extends EObject>>{

  @Override
  public Iterator<? extends EObject> apply(Collection<? extends EObject> input_p) {
    
    Collection<EObject> allCrossRefs = new HashSet<EObject>();    
    for (EObject elem : input_p){
      for (EContentsEList.FeatureIterator<EObject> featureIterator = (EContentsEList.FeatureIterator<EObject>)elem.eCrossReferences().iterator(); featureIterator.hasNext(); ) {
        EObject referenced = featureIterator.next();
        EReference eReference = (EReference)featureIterator.feature();
        if (SimplifiedCapellaMetadata.INSTANCE.isNavigable(eReference) && SimplifiedCapellaMetadata.INSTANCE.isSemantic(referenced.eClass())
            && !SimplifiedCapellaMetadata.INSTANCE.isContainment(eReference) 
            && !SimplifiedCapellaMetadata.INSTANCE.isExcludeFrom(eReference, "xmlpivot")){ //$NON-NLS-1$
          allCrossRefs.add(referenced);
        }
      }
    }
    return allCrossRefs.iterator();
  }

}
