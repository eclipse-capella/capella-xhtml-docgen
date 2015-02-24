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

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.xmlpivot.extraction.mapping.HashIterableInvertibleBinaryRelation;


/**
 * Marking class
 */
public class MMMarker implements IMMMarker {

  /** technical to pivot mapping */
  private final HashIterableInvertibleBinaryRelation _invertibleRelationMapping;

  private final MMExtractionSimplifiedMetadata _meta;
  
  /**
   * Constructor
   * @param invertibleRelationMapping_p
   * @param markingMessage_p
   * @param navigableAnnotation_p
   * @param semanticAnnotation_p
   */
  public MMMarker(HashIterableInvertibleBinaryRelation invertibleRelationMapping_p, MMExtractionSimplifiedMetadata meta_p){ 
    _invertibleRelationMapping = invertibleRelationMapping_p;
    _meta = meta_p;
  }

/**
 * Marks the Capella meta-model
 */
  @Override
  public void markMModel() {

    markAllClassesTypesOfNavigableAttributesAndReferences();
    
    
    // Redirect semantic classes inheritances to the closest upper level semantic hierarchy
    // That means if a semantic class inherits from a non-semantic one that inherits from another semantic class
    // as the non-semantic class will be suppressed later, we need to keep the inheritance information
    // between the first and second semantic classes
    rebuildTypeHierarchy(_invertibleRelationMapping.getValues(EClass.class));
    // /////////////////////////////////
    removeAllDuplicatesInInheritancesIterative();

    // Navigable Attributes and references propagated to subclasses of a non conceptual
    // class are duplicated in all the subtree, here we need to only keep those that are
    // present in the classes that are at the highest level. This means that if they can be inherited
    // from a conceptual superclass, they should not be duplicated.
    // !! WILL IMPACT THE INITIAL MAPPING
    //factorizeAllPropagatedAttributesAndReferencesIterative();

  }


  /**
   * Mark all classifiers that are types of "navigable" references.
   */
  private void markAllClassesTypesOfNavigableAttributesAndReferences() {
    for (EStructuralFeature feature : _invertibleRelationMapping.getValues(EStructuralFeature.class)) {
      if (_meta.isNavigable(feature)) {
        _meta.setMarked(feature.getEType());
       _meta.setMarked(feature.getEContainingClass());
      }
    }
  }


  /**
  * Fix point iteration to remove duplicates in inheritances of all classes in all resources
  */
  private void removeAllDuplicatesInInheritancesIterative() {
    boolean moreToRemove = true;
    while (moreToRemove) {
      moreToRemove = false;
      for (EClass cls : _invertibleRelationMapping.getValues(EClass.class)){
        if (_meta.isConserved(cls)){
          moreToRemove |= removeClassDuplicatesInInheritances(cls);
        }
      }
    }
  }

/**
 * FIXME this is broken, superclasses should be compared by identity not by name
 * Removes duplicates in inheritances of a class
 * @param cls_p a non-null EClass
 */
  private boolean removeClassDuplicatesInInheritances(EClass cls_p) {
    boolean moreToRemove = false;
      Iterator<EClass> superclsit = cls_p.getESuperTypes().iterator();
      while (superclsit.hasNext()) {
        EClass supercls = superclsit.next();
        int duplicates = 0;
        for (EClass currentSupercls : cls_p.getESuperTypes()) {
          if (currentSupercls.getName().equals(supercls.getName())) {
            duplicates++;
          }
        }
        if (duplicates > 1) {
          superclsit.remove();
          duplicates--;
          moreToRemove = true;
        }
      }
    return moreToRemove;
  }

  private void rebuildTypeHierarchy(Collection<EClass> classes) {
    for (EClass cls : classes){
      if (_meta.isConserved(cls)){
        rebuildTypeHierarchy(cls, classes);
      }
    }
  }

  /*
   * Rebuilds inheritance links of a class
   * @param cls_p a non null EClass
   * @param scope all classes in scope. superclasses outside this scope are left alone.
   */
  private void rebuildTypeHierarchy(EClass cls_p, Collection<EClass> scope) {
    boolean change = true;
    while (change) {
      change = false;
      for (Iterator<EClass> superit = cls_p.getESuperTypes().iterator(); superit.hasNext();) {
        EClass supercls = superit.next();
        if (scope.contains(supercls) && !_meta.isConserved(supercls)){
          superit.remove();
          cls_p.getESuperTypes().addAll(supercls.getESuperTypes());
          change = true;
          break;
        }
      }
    }
 }

}
