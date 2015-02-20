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
package org.polarsys.capella.xmlpivot.merge.specification;

import org.eclipse.emf.diffmerge.api.IDiffPolicy;
import org.eclipse.emf.diffmerge.api.IMatch;
import org.eclipse.emf.diffmerge.api.Role;
import org.eclipse.emf.diffmerge.diffdata.EMatch;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.core.data.capellacommon.TransfoLink;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.interaction.RefinementLink;
import org.polarsys.capella.core.model.semantic.SimplifiedCapellaMetadata;

/**
 *
 */
public class XMLPivotDiffPolicy implements IDiffPolicy {

  private final IDiffPolicy decorated;

  /**
   * Constructor
   * @param decorated_p
   */
  public XMLPivotDiffPolicy(IDiffPolicy decorated_p) {
    decorated = decorated_p;
  }

  /**
   * This always delegates to the nested instance.
   */
  @Override
  public boolean considerEqual(Object value1_p, Object value2_p, EAttribute attribute_p) {
    return decorated.considerEqual(value1_p, value2_p, attribute_p);
  }

  /**
   * The XML Pivot Diff Policy needs to consider some features as unordered
   * in order to hide (inevitable) ordering differences of an export/import roundtrip.
   */
  @Override
  public boolean considerOrdered(EStructuralFeature feature_p) {
    if (feature_p == CapellacorePackage.Literals.CLASSIFIER__OWNED_FEATURES) {
      return false;
    }
    return decorated.considerOrdered(feature_p);
  }

  /**
   * Attributes of technical elements are here ignored.
   */
  public boolean coverFeature(IMatch match_p, EStructuralFeature feature_p) {
    EMatch match = null;
    if (match_p instanceof EMatch) {
      match = (EMatch) match_p;
    }
    if (match != null) {
      //if(XMLPivotUtil.isTechnical(match.getReference())){
      if (!SimplifiedCapellaMetadata.INSTANCE.isSemantic(match.getReference().eClass())) {
        return false;
      }
    }
    return decorated.coverFeature(feature_p);
  }

  /**
   * This is called for EReferences
   */
  @Override
  public boolean coverFeature(EStructuralFeature feature_p) {
    return decorated.coverFeature(feature_p);
  }

  /**
   * @param match_p
   * @return
   * @see org.eclipse.emf.diffmerge.api.IDiffPolicy#coverMatch(org.eclipse.emf.diffmerge.api.IMatch)
   */
  @Override
  public boolean coverMatch(IMatch match_p) {
    boolean result = decorated.coverMatch(match_p);
    if (result) {
      EObject element = match_p.coversRole(Role.TARGET) ? match_p.get(Role.TARGET) : match_p.get(Role.REFERENCE);
      result = !((element instanceof RefinementLink) || (element instanceof TransfoLink) || (element.eContainer() instanceof TransfoLink));
    }
    return result;
  }

  /**
   * @param value_p
   * @param attribute_p
   * @return
   * @see org.eclipse.emf.diffmerge.api.IDiffPolicy#coverValue(java.lang.Object, org.eclipse.emf.ecore.EAttribute)
   */
  @Override
  public boolean coverValue(Object value_p, EAttribute attribute_p) {
    return decorated.coverValue(value_p, attribute_p);
  }

}
