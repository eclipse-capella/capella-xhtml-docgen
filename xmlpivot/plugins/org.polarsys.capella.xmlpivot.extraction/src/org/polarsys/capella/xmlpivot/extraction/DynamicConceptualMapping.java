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
package org.polarsys.capella.xmlpivot.extraction;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * A conceptual mapping that computes simplified EPackages dynamically.
 * 
 */
public class DynamicConceptualMapping extends BasicConceptualMapping {
  
  private static final URI DYNAMIC_BASE_URI = URI.createPlatformResourceURI("/Simplified Capella Metamodel", true); //$NON-NLS-1$
  private static final String ECORE_EXTENSION = "ecore"; //$NON-NLS-1$
  
  /*
   * This will hold all dynamically generated EPackages
   */
  private final ResourceSet resourceSet;
  
  /**
   * @param registry_p A package registry that will hold dynamically mapped conceptual packages.
   */
  protected DynamicConceptualMapping(EPackage.Registry registry_p) {
    super(registry_p);
    resourceSet = new ResourceSetImpl();
    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(ECORE_EXTENSION, new EcoreResourceFactoryImpl());
  }

  @Override
  protected EPackage delegateGetSimplifiedPackage(EPackage pack){
    return transformAndRegister(pack);
  }

  private Collection<EPackage> transformAndRegister(Collection<EPackage> packages_p){
    
    // create a snapshot of the currently available mappings
    ConceptualMapping context = new BasicConceptualMapping(registry);
    
    ExportActionLauncher launcher = new ExportActionLauncher();
    ExportActionLauncher.Result result = launcher.launch(packages_p, context, null);
    for (EPackage target : result.getTargetPackages()){
      if (target.getESuperPackage() == null){
        Resource targetResource = resourceSet.createResource(DYNAMIC_BASE_URI.appendSegment(target.getName() + "." + ECORE_EXTENSION)); //$NON-NLS-1$
        targetResource.getContents().add(target);
      }
      registry.put(target.getNsURI(), target);
    }
    return result.getTargetPackages();
  }

  private EPackage transformAndRegister(EPackage pack_p){
    Collection<EPackage> result = transformAndRegister(Collections.singleton(pack_p));
    for (EPackage p : result){
      if (p.getNsURI().equals(metadata.getSimplifiedNsURI(pack_p))){
        return p;
      }
    }
    throw new IllegalStateException();
  }
  
  public static ConceptualMapping create(EPackage.Registry registry, Collection<EPackage> sourcePackages){
    DynamicConceptualMapping cm = new DynamicConceptualMapping(registry);
    cm.transformAndRegister(sourcePackages);
    return new MemoizingConceptualMapping(cm);
  }
  
}
