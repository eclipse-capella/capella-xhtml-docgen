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
package org.polarsys.capella.xmlpivot.extraction.mapping;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.polarsys.capella.core.model.semantic.SimplifiedCapellaMetadata;
import org.polarsys.capella.xmlpivot.common.XMLPivotMetadata;

/**
 */
public class MMInvertibleRelationCopyMappingGenerator implements IMMCopyMappingGenerator {

  /**
   * Copy all the source packages
   */
  private Map<EObject, EObject> copy(Collection<EPackage> ePackages_p) {
    Copier copier = new Copier();
    copier.copyAll(ePackages_p);
    copier.copyReferences();
    return copier;
  }
  
  /**
   * @see org.polarsys.capella.xmlpivot.extraction.mapping.IMMCopyMappingGenerator#generateTotalCopyMapping()
   */
  @Override
  public HashIterableInvertibleBinaryRelation generateTotalCopyMapping(Collection<EPackage> sourcePackages_p) {
    HashIterableInvertibleBinaryRelation invertibleMapping = new HashIterableInvertibleBinaryRelation();
    for (Map.Entry<EObject, EObject> entry : copy(sourcePackages_p).entrySet()){
    	EObject source = entry.getKey();
    	EObject target = entry.getValue();
    	if (source instanceof EPackage || source instanceof EClassifier || source instanceof EStructuralFeature){
    		invertibleMapping.add(source, target);
    	}
    }
    return invertibleMapping;
  }

  /*
   * A specialized copier that provides the initial copy of a simplified metamodel during the transformation.
   * Simple operations beyond just copying are performed here:
   * 
   * - Setting the simplified namespace uri and package name for copied EPackages
   * - Setting the containment flag for 'navigable virtual (derived) containment references'
   * 
   */
  @SuppressWarnings("serial")
  static class Copier extends EcoreUtil.Copier {
    
    @Override
    protected void copyAttribute(EAttribute eAttribute, EObject eObject, EObject copyEObject){
      if (eAttribute == EcorePackage.Literals.EPACKAGE__NS_URI){ 
        ((EPackage) copyEObject).setNsURI(SimplifiedCapellaMetadata.INSTANCE.getSimplifiedNsURI((EPackage) eObject));
      } else if (eAttribute == EcorePackage.Literals.EPACKAGE__NS_PREFIX){
        ((EPackage) copyEObject).setNsPrefix(SimplifiedCapellaMetadata.INSTANCE.getSimplifiedNsPrefix((EPackage) eObject));
      } else if (eAttribute == EcorePackage.Literals.EREFERENCE__CONTAINMENT 
            && SimplifiedCapellaMetadata.INSTANCE.isContainment((EReference) eObject)){
            ((EReference) copyEObject).setContainment(true);
      } else if (eAttribute == EcorePackage.Literals.ENAMED_ELEMENT__NAME){
        ((ENamedElement) copyEObject).setName(SimplifiedCapellaMetadata.INSTANCE.getSimplifiedName((ENamedElement) eObject));
      } else if (eAttribute == EcorePackage.Literals.ESTRUCTURAL_FEATURE__CHANGEABLE){
        ((EStructuralFeature) copyEObject).setChangeable(true);
      } else if (eAttribute == EcorePackage.Literals.ESTRUCTURAL_FEATURE__DERIVED){
        ((EStructuralFeature) copyEObject).setDerived(false);
      } else if (eAttribute == EcorePackage.Literals.ESTRUCTURAL_FEATURE__TRANSIENT){
        ((EStructuralFeature) copyEObject).setTransient(false);
      } else if (eAttribute == EcorePackage.Literals.ESTRUCTURAL_FEATURE__VOLATILE){
        ((EStructuralFeature) copyEObject).setVolatile(false);
      } else {
        super.copyAttribute(eAttribute, eObject, copyEObject);
      }
    }
    

    @Override
    protected EObject createCopy(EObject eObject){
      EObject copy = super.createCopy(eObject);
      if (eObject instanceof EPackage){
        // for EPackages we want to remember where the simplified package came from.
        XMLPivotMetadata.INSTANCE.setSourceNsURI((EPackage) copy, ((EPackage) eObject).getNsURI());
      }
      return copy;
    }
  }

}
