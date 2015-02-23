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

import org.eclipse.emf.ecore.EPackage;

import org.polarsys.capella.core.model.semantic.SimplifiedCapellaMetadata;
import org.polarsys.capella.xmlpivot.extraction.mapping.HashIterableInvertibleBinaryRelation;

/**
 * Simplification Algorithm:
 * 0- change the model URI and NamespaceURI
 * 1- mark all models
 * 
 * 9- suppress the package if it's not marked
 * 10- else suppress each contained class which is not marked
 * 11- Suppress all EEnum which are not marked
 * 12- Suppress all dataTypes which are not marked
 * 13- Redo all steps from 9 to 13 (recursively) on all packages contained by the root.
 * 
 * 14- Suppress all annotations in the model
 * 15- Suppress all unused datatypes and enum
 */
public final class MMSimplifier {

  private static MMSimplifier __instance = null;
 
  /**
   * Forbids instantiation
   */
  private MMSimplifier() {
    // Nothing
  }

  public static MMSimplifier getInstance() {
    if (__instance == null) {
      __instance = new MMSimplifier();
    }
    return (__instance);
  }

  /**
   * Launches simplification (conceptual meta-model extraction): 1- Launches marking step, which marks all the elements that are not conceptual. 2- Then,
   * Statistics step 3- Finally, Cleaning step which suppresses all the elements that the marking has identified as not part of the conceptual meta-model.
   * @param mapping_p
   * @param guard
   * @param method
   * @param showStats
   * @param clean
   * @param sortEStructuralFeatures if structualFeatures should be sorted alphabetically
   */
  public void simplifyAllModels(HashIterableInvertibleBinaryRelation mapping_p,
      boolean showStats_p, boolean clean_p) {
      // mark all models
	  
	  MMExtractionSimplifiedMetadata meta = MMExtractionSimplifiedMetadata.createInstance(SimplifiedCapellaMetadata.INSTANCE, mapping_p);
      IMMMarker semMarker = new MMMarker(mapping_p, meta);
      semMarker.markMModel();

      // get stats on all models
      if (showStats_p) {
        IMMStats stats = new MMSimplificationStats(mapping_p.getValues(EPackage.class), meta);
        stats.getStatsOnMModelCleaning();
      }
      // Clean all models
      if (clean_p) {
        IMMCleaner cleaner = new MMCleaner(mapping_p, meta);
        cleaner.cleanMModel();
      }
  }

}
