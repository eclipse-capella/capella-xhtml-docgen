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
package org.polarsys.capella.xmlpivot.common;

import java.util.HashMap;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * 
 */
public interface CapellaDerivedFeatureMetadata {

  
  public static final CapellaDerivedFeatureMetadata INSTANCE = new BasicCapellaDerivedFeatureMetaData(new HashMap<EModelElement, EAnnotation>());
  
  /**
   * The annotation source that holds Capella derived feature metadata
   */
  public static final String SOURCE_DERIVED_FEATURE = "http://www.polarsys.org/capella/semantic/derivedFeature"; //$NON-NLS-1$
  
  /**
   * The annotation source that holds Capella association class metadata
   */
  public static final String SOURCE_ASSOCIATION_CLASS = "http://www.polarsys.org/capella/semantic/associationClass"; //$NON-NLS-1$
  
  /**
   * Get the association class class for a derived EReference.
   * 
   * @return The association class for the reference, or null if the reference is not a shortcut for an association class.
   * @throws IllegalArgumentException if the reference is not a derived reference
   */
  public EClass getAssociationClass(EReference reference);
  
  /**
   * Set the association class for a derived EReference. The classifier
   * that holds the reference is considered the 'left' side of the 
   * association. 
   * 
   * @throws IllegalArgumentException if the reference is not a derived reference
   * @param reference
   */
  public void setAssociationClass(EReference reference, EClass associationClass);
  
  /**
   * Get the holding feature of a derived feature, or null if there is no holding feature
   * @throws IllegalArgumentException if the feature is not derived
   */
  public EStructuralFeature getHoldingFeature(EStructuralFeature feature);
  
  /**
   * Set the holding feature of a derived feature.
   * @param feature
   * @param holdingReference
   * @throws IllegalArgumentException if 'feature' is not a derived reference
   * @throws IllegalArgumentException if 'holdingFeature' is a derived feature
   */
  public void setHoldingFeature(EStructuralFeature feature, EStructuralFeature holdingFeature);
  
  /**
   * Defines an association class from a pair of EReferences. Both references must be defined 
   * on the same classifier, and must not be derived.
   * @param left the left reference 
   * @param right the right reference
   */
  public void defineAssociationClass(EReference left, EReference right);
  
  /** 
   * Returns the reference that holds the left side of an indirect relationship
   * via the given association class.
   * 
   * @param associationClass
   * @return the left side of the association class
   * @throws illegalArgumentException if neither the argument nor any of its direct and indirect supertypes is an association class
   */
  public EReference getLeft(EClass associationClass);
  
  /** 
   * Returns the reference that holds the right side of an indirect relationship
   * via the given association class.
   * 
   * @param associationClass
   * @return the right side of the association class
   * @throws illegalArgumentException if neither the argument nor any of its direct and indirect supertypes is an association class
   */
  public EReference getRight(EClass associationClass);
  
}
