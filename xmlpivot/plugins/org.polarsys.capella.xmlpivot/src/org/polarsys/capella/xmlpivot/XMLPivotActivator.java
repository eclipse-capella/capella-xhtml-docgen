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

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.osgi.framework.BundleContext;
import org.polarsys.capella.core.model.helpers.registry.CapellaPackageRegistry;
import org.polarsys.capella.xmlpivot.extraction.ConceptualMapping;
import org.polarsys.capella.xmlpivot.extraction.DynamicConceptualMapping;


public class XMLPivotActivator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.polarsys.capella.xmlpivot"; //$NON-NLS-1$

	private static XMLPivotActivator plugin;
	
	private ConceptualMapping mapping;

  private Registry dynamicPackageRegistry;
	
  public static final String XMLPIVOT_EXTENSION = "xml"; //$NON-NLS-1$
  
	/**
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@Override
  public void start(BundleContext bundleContext) throws Exception {
	  super.start(bundleContext);
	  plugin = this;
	}

	/**
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
  public void stop(BundleContext bundleContext) throws Exception {
		plugin = null;
		super.stop(bundleContext);
	}

	/**
	 * Returns this plugins runtime object
	 * @return
	 */
	public static XMLPivotActivator getDefault(){
	  return plugin;
	}
	
	private void initializeDynamicMapping(){
	  dynamicPackageRegistry = new EPackageRegistryImpl();
	  dynamicPackageRegistry.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
	  mapping = DynamicConceptualMapping.create(dynamicPackageRegistry, CapellaPackageRegistry.getAllCapellaPackages());
	}
	
	/**
	 * Get the shared dynamic conceptual mapping. The mapping will always be initialized with
	 * the Capella packages to assure a consistent simplified metamodel.
	 * 
	 * This needs to be done because 
	 *    Mapping(aPackage, bPackage) != Mapping(aPackage) + Mapping(bPackage)
	 * 
	 * All EPackages that are dynamically generated through this mapping are
	 * automatically registered in this plugin's dynamic package registry 
	 * which can be obtained via getDynamicPackageRegistry().
	 * 
	 * @return
	 */
	public synchronized ConceptualMapping getDynamicConceptualMapping(){
	  if (mapping == null){
	    initializeDynamicMapping();
	  }
	  return mapping;
	}
	
	/** 
	 * Get the shared dynamic package registry. This registry will include the EcorePackage
	 * and all EPackages that were dynamically generated through the dynamic ConceptualMapping 
	 * provided by this plugin. The registry does not delegate to the global registry.
	 * You should treat this registry with similar caution as the global registry and avoid
	 * to manually register packages with it.
	 */
	public synchronized EPackage.Registry getDynamicPackageRegistry(){
	  if (dynamicPackageRegistry == null){
	    initializeDynamicMapping();
	  }
	  return dynamicPackageRegistry;
	}
	
	
}
