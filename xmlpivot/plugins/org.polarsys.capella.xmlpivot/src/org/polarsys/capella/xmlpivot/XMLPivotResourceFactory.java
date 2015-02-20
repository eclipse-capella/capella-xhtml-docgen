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
package org.polarsys.capella.xmlpivot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLParserPool;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;

/**
 *
 */
public class XMLPivotResourceFactory extends ResourceFactoryImpl {

  private List<Object> lookupTable = new ArrayList<Object>();
  private XMLParserPool parserPool = new XMLParserPoolImpl();
  private Map<Object, Object> nameToFeatureMap = new HashMap<Object, Object>();
  
  @Override
  public Resource createResource(URI uri_p) {
    XMIResourceImpl resource = new XMIResourceImpl(uri_p);
    
    Map<Object, Object> saveOptions = resource.getDefaultSaveOptions();
    saveOptions.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
    saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
    saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
    saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, lookupTable);
    
    Map<Object, Object> loadOptions = resource.getDefaultLoadOptions();
    loadOptions.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
    loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
    loadOptions.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
    loadOptions.put(XMLResource.OPTION_USE_PARSER_POOL, parserPool);
    loadOptions.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, nameToFeatureMap);    

    resource.setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
    
    return resource;
  }
  

}
