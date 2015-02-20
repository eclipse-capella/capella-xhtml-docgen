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

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.xmlpivot.common.XMLPivotMetadata;
import org.polarsys.capella.xmlpivot.extraction.emftools.EMFToolBox;
import org.polarsys.capella.xmlpivot.extraction.mapping.HashIterableInvertibleBinaryRelation;


/**
 * The meta-model cleaning class that is used after the marking step to clean all elements that are not part of the semantic/pivot Capella meta-model
 */
public class MMCleaner implements IMMCleaner {
  
  /** Static tool box Class */
  protected static EMFToolBox _emf;
  /** Mapping produced by export operation, it is here taken in input as original mapping of identical source and target meta-models and reworked when cleaning is performed*/
  private HashIterableInvertibleBinaryRelation _invertibleRelationMapping;
 
  private MMExtractionSimplifiedMetadata _meta;
  
/**
 * Constructor
 * @param mapping_p a non-null HashIterableInvertibleBinaryRelation map of EObject couples
 * @param markingMessage_p the annotation message used by the marking algorithm
 * @param navigableAnnotation_p the annotation used by meta-modelers of Capella to annotate "semantic" reference elements 
 * @param semanticAnnotation_p the annotation used by meta-modelers of Capella to annotate "semantic" classes
 */
  public MMCleaner(HashIterableInvertibleBinaryRelation mapping_p, MMExtractionSimplifiedMetadata meta_p) {
    _emf = EMFToolBox.getInstance();
    _invertibleRelationMapping = mapping_p;
   
    _meta = meta_p;
  }

  /**
  * Suppress technical (not "isBusiness" annotated) elements
  */
  @Override
  public void cleanMModel() {
    
    // A first pass will clean all non-navigable references and attributes
    // and those that are not Navigable
    // !! WILL IMPACT THE INITIAL MAPPING
    initialCleanNonNavigableStructuralFeatures();

    // A second pass will clean the classes and packages
    // !! WILL IMPACT THE INITIAL MAPPING
    for (EClassifier classifier : _invertibleRelationMapping.getValues(EClassifier.class)) {
      if (!_meta.isConserved(classifier)){
        cleanClassifier(classifier);
      }
    }

    // Suppress all annotations except the xmlpivot annotation on EPackages
    // !! DOESN'T IMPACT THE INITIAL MAPPING
    for (EModelElement element : _invertibleRelationMapping.getValues(EModelElement.class)){
      for (Iterator<EAnnotation> it = element.getEAnnotations().iterator(); it.hasNext();){
        EAnnotation next = it.next();
        if (!XMLPivotMetadata.SOURCE_XMLPIVOT.equals(next.getSource())){
          it.remove();
        }
      }
      if (element instanceof EEnum){
        for (EEnumLiteral l : (((EEnum) element).getELiterals())){
          l.getEAnnotations().clear();
        }
      }
    }
    
  }

  /**
   * Cleans structural features in all resources
   */
  private void initialCleanNonNavigableStructuralFeatures() {
    for (EClass cls : _invertibleRelationMapping.getValues(EClass.class)){
      cleanClassStructuralFeaturesAndOperations(cls);
    }
  }

  /**
   * Cleans all structural features and operations inside a given class. All operations are systematically removed.
   * @param clazz_p a non-null EClass
   */
  protected void cleanClassStructuralFeaturesAndOperations(EClass clazz_p) {
    // Suppress all classes' operations
    clazz_p.getEOperations().clear();
    // Clean structural features
    for (Iterator<EStructuralFeature> it = clazz_p.getEStructuralFeatures().iterator(); it.hasNext();) {
      EStructuralFeature current = it.next();
      if (!_meta.isNavigable(current) || _meta.isExcluded(current)) {
        if (current instanceof EReference && ((EReference) current).getEOpposite() != null) {
          ((EReference) current).getEOpposite().setEOpposite(null);
            }
            _invertibleRelationMapping.removeMappingsToTarget(current);
            it.remove();
          }
        }
      }

  /**
   * Removes a classifier.
   * @param pack a non null EPackage
   */
  protected void cleanClassifier(EClassifier classifier_p) {
    if (classifier_p instanceof EClass) {
      // remove class structural features mappings before removing the class
      for (EStructuralFeature str : ((EClass) classifier_p).getEStructuralFeatures()) {
        if (str instanceof EReference && ((EReference) str).getEOpposite() != null){
          ((EReference) str).getEOpposite().setEOpposite(null);
        }
        _invertibleRelationMapping.removeMappingsToTarget(str);
      }
    }
    _invertibleRelationMapping.removeMappingsToTarget(classifier_p);
    classifier_p.getEPackage().getEClassifiers().remove(classifier_p);
  }
}
