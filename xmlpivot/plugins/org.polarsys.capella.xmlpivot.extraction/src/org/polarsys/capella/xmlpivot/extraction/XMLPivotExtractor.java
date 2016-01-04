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

import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenRuntimeVersion;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.importer.ecore.EcoreImporter;
import org.polarsys.capella.core.model.helpers.registry.CapellaPackageRegistry;
import org.polarsys.capella.xmlpivot.report.RClass;
import org.polarsys.capella.xmlpivot.report.RStructuralFeature;
import org.polarsys.capella.xmlpivot.report.Report;
import org.polarsys.capella.xmlpivot.report.ReportFactory;

/**
 *
 */
public class XMLPivotExtractor {

	public final static class Builder {
		public String projectName = "XMLPivotExtractor";
		public String genmodelName = "simplified.genmodel";
		public String reportModelName = "unmapped.report";
		public String genmodelBasePackage = "org.polarsys.capella.semantic.data";
		public String modelPluginClass = "org.polarsys.capella.semantic.data.capellamodeller.CapellaModellerPlugin";
		public String editPluginClass = "org.polarsys.capella.semantic.data.capellamodeller.provider.CapellamodellerEditPlugin";
		public String editorPluginClass = "org.polarsys.capella.semantic.data.capellamodeller.presentation.CapellamodellerEditorPlugin";
		public String pluginVersion = "1.0.0"; // TODO maybe derive this from source package version or the plugin that is providing it..
		public Collection<EPackage> sourcePackages = CapellaPackageRegistry.getAllCapellaPackages();
		public boolean bootstrap = false;
		public XMLPivotExtractor build(){
			return new XMLPivotExtractor(this);
		}
	}

	private XMLPivotExtractor(Builder builder){
		projectName = builder.projectName;
		genmodelName = builder.genmodelName;
		reportModelName = builder.reportModelName;
		genmodelBasePackage = builder.genmodelBasePackage;
		modelPluginClass = builder.modelPluginClass;
		editPluginClass = builder.editPluginClass;
		editorPluginClass = builder.editorPluginClass;
		sourcePackages = builder.sourcePackages;
		pluginVersion = builder.pluginVersion;
		if (builder.bootstrap){
			registry = new EPackageRegistryImpl();
			registry.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		} else {
			registry = EPackage.Registry.INSTANCE;
		}
	}
	
	private final String projectName;
	private final String genmodelName;
	private final String reportModelName;
	private final String genmodelBasePackage;
	private final String modelPluginClass;
	private final String editPluginClass;
	private final String editorPluginClass;
	private final Collection<EPackage> sourcePackages;
	private final String pluginVersion;
	private final EPackage.Registry registry;
	
	public void extract() throws Exception {
		  
		  if (ResourcesPlugin.getWorkspace().getRoot().getProject(projectName).exists()){
			  throw new CoreException(new Status(IStatus.ERROR, "org.polarsys.capella.xmlpivot.cli", "Project '" + projectName + "' already exists"));
		  }

		  createEMFProject(projectName);
		  ConceptualMapping mapping = DynamicConceptualMapping.create(registry, sourcePackages);
	  
		  ResourceSetImpl set = new ResourceSetImpl();
	  
		  URI destination = URI.createPlatformResourceURI("/" + projectName + "/model", true);
	              
		  StringBuilder genModelBuilder = new StringBuilder();
		  for (String nsURI : registry.keySet()){
			  EPackage pack = registry.getEPackage(nsURI);
			  if (pack != EcorePackage.eINSTANCE){
				  if (pack.getESuperPackage() == null){
					  Resource resource = set.createResource(destination.appendSegment(pack.getName() + ".ecore"));
					  resource.getContents().add(pack);
					  genModelBuilder.append(resource.getURI().toString() + "\n");
				  }
			  }
		  }
	  
		  Report report = fromConceptualMapping(sourcePackages, mapping);
		  Resource reportResource = set.createResource(destination.appendSegment(reportModelName));
		  reportResource.getContents().add(report);
	 
		  for (Resource res : set.getResources()){
			  res.save(Collections.EMPTY_MAP);
		  }
	  
		  EcoreImporter importer = new EcoreImporter() {      
			  @Override
			  protected void presetEPackagesToGenerate(){
				  for (EPackage p : getEPackages()){
					  getEPackageImportInfo(p).setConvert(true);
					  getEPackageImportInfo(p).setBasePackage(genmodelBasePackage);
				  }
			  }
		  };
	  
		  Monitor m = new BasicMonitor();
		  importer.setModelLocation(genModelBuilder.toString());
		  importer.setGenModelFileName(genmodelName);
		  importer.setGenModelProjectLocation(new Path(destination.segment(1)));
		  importer.setGenModelContainerPath(new Path(destination.toPlatformString(true) + "/"));
		  try {
			  importer.computeEPackages(m);
		  } catch (Exception exception_p) {
			  throw new InvocationTargetException(exception_p);
		  }
	  
		  importer.adjustEPackages(m);
		  importer.prepareGenModelAndEPackages(m);
		  
		  importer.getGenModel().setComplianceLevel(GenJDKLevel.JDK50_LITERAL);
		  importer.getGenModel().setRuntimeVersion(GenRuntimeVersion.EMF26);
		  importer.getGenModel().setModelPluginClass(modelPluginClass);
		  importer.getGenModel().setEditPluginClass(editPluginClass);
		  importer.getGenModel().setEditorPluginClass(editorPluginClass);
		  
		  customizeImporter(importer);
		  importer.saveGenModelAndEPackages(m);  
	  }

	/**
	 * A hook to allow subclasses to further customize the importer before the genmodel/ecore models
	 * are saved on disk.
	 */
	protected void customizeImporter(EcoreImporter importer){
		
	}
	
	/**
	 * @param destination_p
	 * @throws CoreException 
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 */
	private void createEMFProject(String name) throws CoreException, UnsupportedEncodingException, IOException {
		
		Path genmodelContainerPath = new Path("/" + name + "/src");
		
		Generator.createEMFProject(
				genmodelContainerPath,
				null,
				Collections.<IProject>emptyList(),
				new NullProgressMonitor(),
				Generator.EMF_MODEL_PROJECT_STYLE | Generator.EMF_PLUGIN_PROJECT_STYLE);

	            CodeGenUtil.EclipseUtil.findOrCreateContainer
	              (new Path("/" + name + "/model"), true, (IPath)null, new NullProgressMonitor());

	            PrintStream manifest = 
	              new PrintStream
	                (URIConverter.INSTANCE.createOutputStream
	                   (URI.createPlatformResourceURI("/" + name + "/META-INF/MANIFEST.MF", true), null),
	                 false, "UTF-8");
	            manifest.println("Manifest-Version: 1.0");
	            manifest.println("Bundle-ManifestVersion: 2");
	            manifest.print("Bundle-Name: ");
	            manifest.println(name);
	            manifest.print("Bundle-SymbolicName: ");
	            manifest.println(CodeGenUtil.validPluginID(name));
	            manifest.println("Bundle-Version: "+ pluginVersion);
	            manifest.println("Require-Bundle: org.eclipse.emf.ecore");
	            manifest.close();
		
	}
	
	public static Report fromConceptualMapping(Collection<EPackage> sourcePackages, ConceptualMapping mapping){
		
		Report report = ReportFactory.eINSTANCE.createReport();
		for (EPackage eCorePackage : sourcePackages){
			if (eCorePackage.getESuperPackage() == null){
				for (TreeIterator<EObject> it = eCorePackage.eAllContents(); it.hasNext();){
				  EObject next = it.next();
		          if (next instanceof EModelElement){
		            if (mapping.getSimplified((EModelElement)next) == null){  
		              if (next instanceof EClass){
		                RClass element = ReportFactory.eINSTANCE.createRClass();
		                element.setModelElement((EModelElement) next);
		                report.getRClasses().add(element);
		                it.prune(); // all features of a suppressed EClass are also suppressed so we do not need to list them explicitly in the report
		              } else if (next instanceof EStructuralFeature){
		                RStructuralFeature element = ReportFactory.eINSTANCE.createRStructuralFeature(); 
		                element.setModelElement((EModelElement) next);
		                report.getRStructuralFeatures().add(element);
		              }
		            }
		          }
		        }
		      }
		    }
		    
		    ECollections.sort(report.getRClasses(), new Comparator<RClass>(){
		      @Override
		      public int compare(RClass o1_p, RClass o2_p) {
		        EClass m1 = (EClass) o1_p.getModelElement();
		        EClass m2 = (EClass) o2_p.getModelElement();
		        return m1.getName().compareTo(m2.getName());
		      }
		    });
		  
		    ECollections.sort(report.getRStructuralFeatures(), new Comparator<RStructuralFeature>(){
		      @Override
		      public int compare(RStructuralFeature o1_p, RStructuralFeature o2_p) {
		        EStructuralFeature m1 = (EStructuralFeature) o1_p.getModelElement();
		        EStructuralFeature m2 = (EStructuralFeature) o2_p.getModelElement();
		        return m1.getName().compareTo(m2.getName());
		      }
		    });
		  
		    return report;
		  }
	
}
