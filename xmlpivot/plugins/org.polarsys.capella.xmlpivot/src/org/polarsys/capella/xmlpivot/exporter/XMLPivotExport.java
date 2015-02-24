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
package org.polarsys.capella.xmlpivot.exporter;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.polarsys.capella.xmlpivot.XMLPivotActivator;
import org.polarsys.capella.xmlpivot.XMLPivotPreferences;
import org.polarsys.capella.xmlpivot.XMLPivotResourceFactory;
import org.polarsys.capella.xmlpivot.extraction.BasicConceptualMapping;
import org.polarsys.capella.xmlpivot.extraction.ConceptualMapping;
import org.polarsys.capella.xmlpivot.extraction.MemoizingConceptualMapping;

import com.google.common.base.Function;

/**
 *
 */
public final class XMLPivotExport {

  public static final String DEFAULT_EXPORT_COMMAND = "org.polarsys.capella.xmlpivot.ui.commands.DefaultExport";
  
  //private static final String SIMPLIFIED_CAPELLA_M2_PROJECT_NAME = "Simplified Capella Metamodel"; //$NON-NLS-1$
  
  private final boolean dynamic;
  private final Collection<? extends EObject> selection;
  private final URI destination;
  private final ResourceSet resourceSet;
  private final AbstractExporter exporter;
  
  public XMLPivotExport(Collection<? extends EObject> selection_p, URI destination_p){
    this(selection_p, destination_p, DEFAULT_EXPORT_COMMAND, true);
  }
  
  public XMLPivotExport(Collection<? extends EObject> selection_p, URI destination_p, String commandId_p, boolean dynamic_p){
    dynamic = dynamic_p;
    selection = selection_p;
    resourceSet = new ResourceSetImpl();
    destination = destination_p;
    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(XMLPivotActivator.XMLPIVOT_EXTENSION, new XMLPivotResourceFactory());
    ConceptualMapping mapping = null;
    if (dynamic){
      mapping = XMLPivotActivator.getDefault().getDynamicConceptualMapping();
    } else {
      mapping = new MemoizingConceptualMapping(new BasicConceptualMapping(EPackage.Registry.INSTANCE));
    }
    ExportEngine engine = new ExportEngine(mapping);
    exporter = createExporter(engine, commandId_p);
  }
  

  /**
   * Runs the export operation. This should only be called once per instance.
   * 
   * @param monitor_p
   * @throws IOException
   * @throws CoreException
   */
  public void run(IProgressMonitor monitor_p) throws IOException, CoreException {
    
    try {
      
      SubMonitor progress = SubMonitor.convert(monitor_p, "Pivot XML Export", 120);

      Collection<EObject> exporterResult = exporter.export(selection, progress.newChild(100));
      
      // Add the result to the destination resource
      Resource modelResource = resourceSet.createResource(destination);
      modelResource.getContents().addAll(exporterResult);
      

      // If the Schema Location Preference is active, we export the Capella Simplified M2 and use EMF SchemaLocation option
      // This makes it trivial to load the export result into an EMF runtime without the need to preregister simplified M2 packages.
      // TODO provide an example of how to load export results in both cases
      // TODO theoretically we could also export the m2 and use schema location in the non-dynamic case too..
      if (dynamic){
        SubMonitor dynamicProgress = progress.newChild(10);
        Set<String> dynamicPackages = XMLPivotActivator.getDefault().getDynamicPackageRegistry().keySet(); 
        
        dynamicProgress.setWorkRemaining(20 * dynamicPackages.size());
        NullProgressMonitor nullm = new NullProgressMonitor();
        for (String nsURI : dynamicPackages){
          EPackage dynamicPackage = XMLPivotActivator.getDefault().getDynamicPackageRegistry().getEPackage(nsURI);
          if (dynamicPackage != EcorePackage.eINSTANCE){
            IPath path = new Path(dynamicPackage.eResource().getURI().toPlatformString(true));
            IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(path.segment(0));
              
            if (!project.exists()){
              project.create(nullm);
            }
            if (!project.isOpen()){
              project.open(nullm);
            }
            dynamicPackage.eResource().save(Collections.EMPTY_MAP);
          }
          dynamicProgress.worked(10);
        }
      } else {
        progress.setWorkRemaining(10);
      }
     
      modelResource.save(Collections.singletonMap(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE));
      progress.worked(10);
      
    } finally {
      if (monitor_p != null){
        monitor_p.done();
      }
    }
  }
    
  /**
   * Returns the collection of elements of the content tree of the selection which are ignored by the exporter.
   * For the XMLPivot exporter, this is simply the list of "technical" elements in the selection's content tree.
   * Should only be called after "run" has been completed.
   */
  public Collection<? extends EObject> getSkippedElements(){
    return exporter.getExportEngine().getSkippedElements(selection);
  }
  
  private AbstractExporter createExporter(ExportEngine engine, String commandId) {
      AbstractExporter result = null;   
      if (commandId.equals(DEFAULT_EXPORT_COMMAND)){
        Function<Collection<? extends EObject>, Iterator<? extends EObject>> incrementor = new DefaultIncrementor(selection);
        result = new AbstractIncrementalExporter(engine, incrementor);
      }
      if (result == null){
        throw new IllegalArgumentException("Unknown command: " + commandId); //$NON-NLS-1$
      }
      
      if (Platform.getPreferencesService().getBoolean(XMLPivotActivator.PLUGIN_ID, XMLPivotPreferences.EXPORT_ALL_ANCESTORS, false, null)){
        ExporterFactory f = ExporterFactory.INSTANCE;
        result = f.createCommonRootExporter(result);
        result = f.createProjectExporter(result);
      }
      return result;
  }
  
}
