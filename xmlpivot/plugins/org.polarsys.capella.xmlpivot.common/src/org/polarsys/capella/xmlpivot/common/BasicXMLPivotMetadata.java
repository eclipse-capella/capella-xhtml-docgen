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

import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;

import org.polarsys.capella.core.model.semantic.AbstractMetaData;

/**
 */
public class BasicXMLPivotMetadata extends AbstractMetaData implements XMLPivotMetadata {

  /**
   * @param source_p
   * @param mapping_p
   */
  public BasicXMLPivotMetadata(Map<EModelElement, EAnnotation> mapping_p) {
    super(XMLPivotMetadata.SOURCE_XMLPIVOT, mapping_p);
  }

  public BasicXMLPivotMetadata(){
    super(XMLPivotMetadata.SOURCE_XMLPIVOT, null);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public String getSourceNsURI(EPackage ePackage_p) {
    EAnnotation annotation = getAnnotation(ePackage_p, false);
    if (annotation != null){
      return annotation.getDetails().get(KEY_SOURCE_NS_URI);
    }
    return null;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setSourceNsURI(EPackage ePackage_p, String originNsURI_p) {
    if (originNsURI_p == null){
      super.deleteAnnotation(ePackage_p);
    }
    EAnnotation annotation = getAnnotation(ePackage_p, true);
    annotation.getDetails().put(KEY_SOURCE_NS_URI, originNsURI_p);
  }

}
