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
package org.polarsys.capella.xmlpivot.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;
import org.polarsys.capella.core.model.semantic.SimplifiedCapellaMetadata;
import org.polarsys.capella.xmlpivot.common.CapellaPackageRegistry;
import org.polarsys.kitalpha.emde.model.EmdePackage;

import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import junit.framework.TestCase;

/**
 */
public class SimplifiedM2ConsistencyTest extends TestCase {

  private final SimplifiedCapellaMetadata meta = SimplifiedCapellaMetadata.INSTANCE;

  /**
   * This checks whether there exist non-semantic EClasses, or EDataTypes that are
   * types of navigable references/attributes. Such elements should be semantic.
   */
  public void testNonSemanticTypesOfNavigableFeatures() {
    Collection<String> result = new HashSet<String>();
    for (Iterator<EObject> it = EcoreUtil.getAllContents(CapellaPackageRegistry.getAllCapellaPackages()); it.hasNext();) {
      EObject next = it.next();
      if (next instanceof EStructuralFeature) {
        EStructuralFeature feature = (EStructuralFeature) next;
        if (meta.isNavigable(feature)) {
          if (feature instanceof EReference) {
            if (!meta.isSemantic(feature.getEType())) {
              result.add(feature.getEType().getEPackage().getName() + "." + feature.getEType().getName());
            }
          } else if (!meta.isSemantic(((EAttribute) feature).getEAttributeType())) {
            result.add(feature.getEType().getEPackage().getName() + "." + feature.getEType().getName());
          }
        }
      }
    }
    assertEquals(Joiner.on(System.getProperty("line.separator")).join(result), 0, result.size()); //$NON-NLS-1$
  }

  /**
   * Finds classes that have no semantic annotation, but contain at least one navigable
   * feature or attribute. Those elements should be semantic.
   */
  public void testNonSemanticClassesWithNavigableFeatures() {
    Collection<String> abstrAct = getNonSemanticClassesWithNavigableFeatures(Predicates.<EClass> alwaysTrue());
    assertEquals(Joiner.on(System.getProperty("line.separator")).join(abstrAct), 0, abstrAct.size()); //$NON-NLS-1$
  }

  /**
   * This tests for each semantic classifier, if there is at least one navigable containment feature that can hold instances
   * of that classifier. The only known case should be "Project", because it is the root of all containment hierarchies in 
   * Capella. 
   * 
   */
  public void testOrphanedSemanticClassifiers() {

    Collection<EStructuralFeature> navigableFeatures = new HashSet<EStructuralFeature>();
    Collection<EClassifier> semanticClassifiers = new HashSet<EClassifier>();

    for (Iterator<EObject> it = EcoreUtil.getAllContents(CapellaPackageRegistry.getAllCapellaPackages()); it.hasNext();) {

      EObject next = it.next();
      if (next instanceof EClassifier) {
        if (meta.isSemantic((EClassifier) next)) {
          semanticClassifiers.add((EClassifier) next);
        }
      }

      if (next instanceof EStructuralFeature) {

        if (meta.isNavigable((EStructuralFeature) next)) {
          if (next instanceof EReference) {
            if (meta.isContainment((EReference) next)) {
              navigableFeatures.add((EReference) next);
            }
          } else {
            navigableFeatures.add((EStructuralFeature) next);
          }
        }
      }
    }

    Collection<String> orphaned = new ArrayList<String>();

    classifiers: for (EClassifier c : semanticClassifiers) {

      // we don't expect to find a suitable containment feature for any of these:
      if (c == CapellamodellerPackage.Literals.PROJECT) {
        continue;
      } else if (c == EmdePackage.Literals.EXTENSIBLE_ELEMENT) {
        continue;
      } else if (c == EmdePackage.Literals.ELEMENT) {
        continue;
      } else if (c == CapellamodellerPackage.Literals.LIBRARY) {
        continue;
      }

      for (EStructuralFeature f : navigableFeatures) {
        if (c instanceof EClass) {

          if (f instanceof EReference) {
            EClass type = ((EReference) f).getEReferenceType();
            if (type.isSuperTypeOf((EClass) c)) {
              continue classifiers;
            }
          }
        } else {
          if ((f instanceof EAttribute) && (((EAttribute) f).getEAttributeType() == c)) {
            continue classifiers;
          }
        }
      }

      orphaned.add(c.getEPackage().getName() + "." + c.getName());

    }

    assertEquals(Joiner.on(System.getProperty("line.separator")).join(orphaned), 0, orphaned.size()); //$NON-NLS-1$

  }

  /**
   * Not really related to simplified Metamodel: Tests that there are no bidirectional references that are not also derived
   */
  public void testNoOppositeEReferences() {
    Collection<EReference> withOpposite = new ArrayList<EReference>();
    for (Iterator<EObject> it = EcoreUtil.getAllContents(CapellaPackageRegistry.getAllCapellaPackages()); it.hasNext();) {
      EObject next = it.next();
      if (next instanceof EReference) {
        EReference nextRef = (EReference) next;
        if (nextRef.getEOpposite() != null) {
          if (!withOpposite.contains(nextRef.getEOpposite())) {
            if (!nextRef.isDerived() && !nextRef.getEOpposite().isDerived()) {
              System.err.println("Opposite references: " + nextRef.getEContainingClass().getName() + "." + nextRef.getName() + "<----->"
                                 + nextRef.getEOpposite().getEContainingClass().getName() + "." + nextRef.getEOpposite().getName());
            }
          }
        }
      }
    }
    assertTrue(withOpposite.isEmpty());
  }

  // find all names of classes that have a navigable feature, but which are not marked "semantic"
  private Collection<String> getNonSemanticClassesWithNavigableFeatures(Predicate<EClass> predicate) {
    Collection<String> result = new HashSet<String>();
    for (Iterator<EObject> it = EcoreUtil.getAllContents(CapellaPackageRegistry.getAllCapellaPackages()); it.hasNext();) {
      EObject next = it.next();
      if (next instanceof EStructuralFeature) {
        EStructuralFeature feature = (EStructuralFeature) next;
        if (meta.isNavigable(feature)) {
          if (predicate.apply(feature.getEContainingClass()) && !meta.isSemantic(feature.getEContainingClass())) {
            result.add(feature.getEContainingClass().getEPackage().getName() + "." + feature.getEContainingClass().getName());
          }
        }
      }
    }
    return result;
  }

}
