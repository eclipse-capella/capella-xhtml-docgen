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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.xmlpivot.extraction.emftools.EMFToolBox;


public class MMSimplificationStats extends MMAbstractStats {

  private final MMExtractionSimplifiedMetadata _meta;

  public MMSimplificationStats(Collection<EPackage> collection_p, MMExtractionSimplifiedMetadata meta_p) {
    super(collection_p);
    _meta = meta_p;
  }

  @Override
  public void getStatsOnMModelCleaning() {
    for (EPackage current : _ePackages) {
      statsOnPackage(current);
    }
    // stats console print out
    showStats();
  }

 

  /**
   * cleans an EPackage with all its contained classes and packages recursively
   * @param pack
   */
  private void statsOnPackage(EPackage pack) {

    if (!_meta.isMarked(pack)) {
      //System.out.println("PACKAGE SUPPRESSED: " + pack.getName()); //$NON-NLS-1$
      _stats_supp_packages++;

    } else {
      _stats_notsupp_packages++;
    }
    // stats on package's classifiers (classes/enums/datatypes)
    EList<EClassifier> objlist = pack.getEClassifiers();
    Iterator<EClassifier> it = objlist.iterator();
    while (it.hasNext()) {
      EClassifier current = it.next();
      if (current instanceof EClass) {
        EClass cls = (EClass) current;
        if (!_meta.isConserved(cls)) {
          _stats_supp_classes++;
          //System.out.println("CLASS SUPPRESSED: " + cls.getEPackage().getName() + "::" + cls.getName()); //$NON-NLS-1$ //$NON-NLS-2$
        } else {
          _stats_notsupp_classes++;
        }
        statsOnClass(cls);
      } else if (!_meta.isConserved(current)) {
        _stats_supp_enumORtypes++;
        System.out.println("ENUM or TYPE SUPPRESSED: " + current.getEPackage().getName() + "::" + current.getName()); //$NON-NLS-1$ //$NON-NLS-2$
      } else {
        _stats_notsupp_enumORtypes++;
      }
    }

    // recursive call to clean sub-packages
    EList<EPackage> subpcklist = pack.getESubpackages();
    Iterator<EPackage> it2 = subpcklist.iterator();
    while (it2.hasNext()) {
      EPackage currentPack = it2.next();
      statsOnPackage(currentPack);
    }
  }

  private void statsOnClass(EClass clazz) {
    Iterator<EStructuralFeature> it = clazz.getEStructuralFeatures().iterator();
    while (it.hasNext()) {
      EStructuralFeature current = it.next();
      if (current instanceof EAttribute) {
          if (_meta.isNavigable(current)) {
            _stats_notsupp_attributes++;
          } else {
            if (!EMFToolBox.getInstance().isPrimitiveEMFType(current.getEType())) {
              _stats_supp_attributes++;
              System.out.println("ATTRIBUTES SUPPRESSED as NOT ANNOTATED TO BE REMOVED and NOT NAVIGABLE: " //$NON-NLS-1$
                                 + current.getEContainingClass().getEPackage().getName() + "::" + current.getEContainingClass().getName() + "::" //$NON-NLS-1$ //$NON-NLS-2$
                                 + current.getName());
            } else {
              _stats_notsupp_attributes++;
            }
          }
        }
      if (current instanceof EReference) {
          if (_meta.isNavigable(current)) {
            _stats_notsupp_references++;
          } else {
            _stats_supp_references++;
        }
      }
    }
  }

}
