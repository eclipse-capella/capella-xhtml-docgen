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
package org.polarsys.capella.xmlpivot.extraction.extraction;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.model.semantic.SimplifiedCapellaMetadata;
import org.polarsys.capella.xmlpivot.extraction.mapping.HashIterableInvertibleBinaryRelation;

/**
 * Allows to read annotations for already copied elements by
 * calling through to a SimplifiedCapellaMetadata instance, but with the 
 * argument replaced by the original Capella meta model element.
 * 
 */
public class MMExtractionSimplifiedMetadata {
	
  private final static String XMLPIVOT_PROCESSOR = "xmlpivot"; //$NON-NLS-1$

	private final Set<EModelElement> _marked = new HashSet<EModelElement>();	
	
	private final HashIterableInvertibleBinaryRelation _mapping;
	private final SimplifiedCapellaMetadata _delegate;
	
	
	protected MMExtractionSimplifiedMetadata(SimplifiedCapellaMetadata delegate_p, HashIterableInvertibleBinaryRelation mapping_p){
		_mapping = mapping_p;
		_delegate = delegate_p;
	}
	
	/**
	 * Get the marker status for an element.
	 */
	public boolean isMarked(EModelElement element_p){
		return _marked.contains(element_p);
	}
	
	/** 
	 * A classifier is conserved if it is marked, or semantic.
	 */
	public boolean isConserved(EClassifier classifier_p){
	  return isMarked(classifier_p) || isSemantic(classifier_p);
	}
	
	/**
	 * Set the marker status for an element to true. Once set, it cannot be unset.
	 */
	public boolean setMarked(EModelElement element_p){
		return _marked.add(element_p);
	}
	

	/**
	 * A feature is navigable if its source feature is navigable.
	 * @param feature_p
	 * @return
	 */
	public boolean isNavigable(EStructuralFeature feature_p) {
		return _delegate.isNavigable((EStructuralFeature) _mapping.getInverse(feature_p).get(0));
	}

	/**
	 * A classifier is semantic if its source classifier is semantic
	 * @param classifier_p
	 * @return
	 */
	public boolean isSemantic(EClassifier classifier_p) {
		
		EClassifier origin = (EClassifier) _mapping.getInverse(classifier_p).get(0);
		if (origin == CapellacorePackage.Literals.NAMED_ELEMENT){
			return true;
		}
		
		return _delegate.isSemantic(origin);
	}
	
	/**
	 * Should the given structural feature be excluded?
	 * This is controlled by an annotation on the ecore model. See
	 * SimplifiedCapellaMetadata.isExcludeFrom.
	 */
	public boolean isExcluded(EStructuralFeature feature_p){
	  return _delegate.isExcludeFrom((EStructuralFeature) _mapping.getInverse(feature_p).get(0), XMLPIVOT_PROCESSOR);
	}
	
	/**
	 * 
	 * @param delegate
	 * @param mapping
	 * @return
	 */
	public static MMExtractionSimplifiedMetadata createInstance(SimplifiedCapellaMetadata delegate, HashIterableInvertibleBinaryRelation mapping){
		return new MMExtractionSimplifiedMetadata(delegate, mapping);
	}
	
	
	
}
