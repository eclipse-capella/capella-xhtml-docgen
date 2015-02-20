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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A helper that loads resources into a resource set, 
 * transforming exceptions, errors and warnings into a Diagnostic.
 * 
 */
public class ResourceLoader {

  private final Map<Resource, Diagnostic> resourceToDiagnosticMap = new HashMap<Resource, Diagnostic>();
  
  /**
   * Build a resource loader for the given resource set.
   * @param set
   */
  public Diagnostic getDiagostic(Resource resource){
    return resourceToDiagnosticMap.get(resource) == null ? Diagnostic.OK_INSTANCE : resourceToDiagnosticMap.get(resource);
  }

  /**
   * Load the resource identified by the argument into this loaders resource set.
   * Exceptions that occur during loading are caught, so this method always
   * returns a resource, possibly a partially loaded one. Just like the
   * generated EMF Editors do it.
   * 
   * Diagnostics for a resource can be obtained via <code>getDiagnostic()</code>
   * 
   * @param uri
   * @return
   */
  public Resource load(ResourceSet set, URI uri){
    Exception exception = null;
    Resource resource = null;
    try {
      resource = set.getResource(uri, true);
    } catch (RuntimeException e){
      resource = set.getResource(uri, false);
    }
    Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
    if (diagnostic.getSeverity() != Diagnostic.OK){
      resourceToDiagnosticMap.put(resource, diagnostic);      
    }
    return resource;
  }

  /**
   * Returns a diagnostic describing the errors and warnings listed in the loaded resource
   * and the specified exception (if any).
   * @generated
   */
  private Diagnostic analyzeResourceProblems(Resource resource, Exception exception) {
    if (!resource.getErrors().isEmpty() || !resource.getWarnings().isEmpty()) {
      BasicDiagnostic basicDiagnostic =
          new BasicDiagnostic
          (Diagnostic.ERROR,
              "",
              0,
              "Error while loading: " + resource.getURI(),
              new Object [] { exception == null ? (Object)resource : exception });
      basicDiagnostic.merge(EcoreUtil.computeDiagnostic(resource, true));
      return basicDiagnostic;
    } else if (exception != null) {
      return
          new BasicDiagnostic
          (Diagnostic.ERROR,
              "xmlpivotresourceloader",
              0,
              "Error while loading: " + resource.getURI(),
              new Object[] { exception });
    } else {
      return Diagnostic.OK_INSTANCE;
    }
  }
  
}
