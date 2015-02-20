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
package org.polarsys.capella.xmlpivot.extraction;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.polarsys.capella.core.model.semantic.SimplifiedCapellaMetadata;
import org.polarsys.capella.xmlpivot.common.XMLPivotMetadata;


/**
 * A conceptual mapping that uses a package registry and simplified metadata
 * to look up mappings between technical and simplified metamodel elements.
 */
public class BasicConceptualMapping implements ConceptualMapping {

  /* metadata we use to find simplified model element names and namespaces */
  protected final SimplifiedCapellaMetadata metadata;
  
  /* this is where we look for simplified model elements */
  protected final EPackage.Registry registry;
  
  protected final EcoreSwitch<EModelElement> technicalToSimplified = new EcoreSwitch<EModelElement>(){
    @Override
    public EModelElement caseEStructuralFeature(EStructuralFeature object_p) {
      EClass simplified = getSimplified(object_p.getEContainingClass());
      if (simplified != null){
        for (EStructuralFeature f : simplified.getEAllStructuralFeatures()){
          if (metadata.getSimplifiedName(object_p).equals(f.getName())){
            return f;
          }
        }
      }
      return null;
    }
    @Override
    public EModelElement caseEClassifier(EClassifier object_p) {
      EPackage simplifiedPackage = getSimplified(object_p.getEPackage());
      return simplifiedPackage == null ? null : simplifiedPackage.getEClassifier(metadata.getSimplifiedName(object_p));
    }
    
    @Override
    public EModelElement caseEPackage(EPackage object_p) {
      EModelElement simplifiedPackage = registry.getEPackage(metadata.getSimplifiedNsURI(object_p));
      if (simplifiedPackage == null){
        simplifiedPackage = delegateGetSimplifiedPackage(object_p);
      }
      return simplifiedPackage;
    }
  };
  
  private final EcoreSwitch<EModelElement> simplifiedToTechnical = new EcoreSwitch<EModelElement>(){
    
    @Override
    public EModelElement caseEClassifier(EClassifier simplified_p){
      EModelElement result = getTechnicalFromRegistry(simplified_p, registry);
      if (result == null){
        result = getTechnicalFromRegistry(simplified_p, EPackage.Registry.INSTANCE);
      }
      return result;
    }
    
    @Override
    public EModelElement caseEStructuralFeature(EStructuralFeature simplified_p){
      EClass technicalClass = getTechnical(simplified_p.getEContainingClass());    
      if (technicalClass != null){
        for (EStructuralFeature feature : technicalClass.getEAllStructuralFeatures()){
          if (metadata.getSimplifiedName(feature).equals(simplified_p.getName())){
            return feature;
          }
        }
      }
      return null;
    }
    
    /* perform a slow reverse lookup by scanning through the source packages eclassifiers, finding one with a matching name*/
    private EClassifier getTechnicalFromRegistry(EClassifier simplified, EPackage.Registry registry){      
      EPackage simplifiedPackage = simplified.getEPackage();
      String sourceNsURI = XMLPivotMetadata.INSTANCE.getSourceNsURI(simplifiedPackage);
      if (sourceNsURI != null){
       EPackage source = registry.getEPackage(sourceNsURI);
       if (source != null){
         for (EClassifier c : source.getEClassifiers()){
           if (metadata.getSimplifiedName(c).equals(simplified.getName())){
             return c;
           }
         }
       }
      }
      return null;
    }
  };
  
  public BasicConceptualMapping(EPackage.Registry registry_p){
    registry = registry_p;
    metadata = SimplifiedCapellaMetadata.INSTANCE;
  }

  protected EPackage delegateGetSimplifiedPackage(EPackage package_p){
    return null;
  }
  
  /**
   * {@inheritDoc}
   */
  @SuppressWarnings("unchecked")
  @Override
  public <T extends EModelElement> T getSimplified(T technical_p) {
    T t = (T) technicalToSimplified.doSwitch(technical_p);
    return t;
  }
  
  @SuppressWarnings("unchecked")
  @Override
  public <T extends EModelElement> T getTechnical(T simplified_p){
    return (T) simplifiedToTechnical.doSwitch(simplified_p);
  }
  
}
