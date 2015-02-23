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

import org.eclipse.emf.ecore.EPackage;

/**
 *
 */
public interface XMLPivotMetadata {

  public final XMLPivotMetadata INSTANCE = new BasicXMLPivotMetadata();
  
  public static final String SOURCE_XMLPIVOT = "http://www.polarsys.org/capella/xmlpivot"; //$NON-NLS-1$
  
  public static final String KEY_SOURCE_NS_URI = "sourceNsURI"; //$NON-NLS-1$
  
  public String getSourceNsURI(EPackage ePackage);
  
  public void setSourceNsURI(EPackage ePackage, String originNsURI);
  
}
