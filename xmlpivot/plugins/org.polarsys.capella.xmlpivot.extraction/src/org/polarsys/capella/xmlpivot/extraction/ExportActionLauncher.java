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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.mapping.ecore2ecore.Ecore2EcoreFactory;
import org.eclipse.emf.mapping.ecore2ecore.Ecore2EcoreMappingRoot;
import org.polarsys.capella.xmlpivot.common.functions.EMFFunctions;
import org.polarsys.capella.xmlpivot.extraction.extraction.MMSimplifier;
import org.polarsys.capella.xmlpivot.extraction.mapping.HashIterableInvertibleBinaryRelation;
import org.polarsys.capella.xmlpivot.extraction.mapping.MMInvertibleRelationCopyMappingGenerator;

import com.google.common.collect.Ordering;

/**
 * Launches export process
 */
public class ExportActionLauncher {
 
  ExportActionLauncher(){

  }
  
  /**
   * Launches all the export operations: 
   *  1- Initializes a new project where files will be exported 
   *  2- Loads all EPackages referenced in the Capella genmodel
   *  3- Creates a copy of these meta-model packages; These copies are the initial output conceptual/simplified meta-model packages 
   *  4- Launches The simplification algorithm on these copies and mapping generation. 
   *  5- Generates the GenModel for conceptual meta-model
   *  6- Export the XSD files
   *  @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility
        to call done() on the given monitor. Accepts null, indicating that no progress should be
        reported and that the operation cannot be cancelled.
   * @throws IOException 
   * @throws Exception 
   */
  public Result launch(Collection<EPackage> sourcePackages_p, ConceptualMapping context, IProgressMonitor monitor) {
    SubMonitor progress = SubMonitor.convert(monitor, 100);
    HashIterableInvertibleBinaryRelation invertibleMapping  = new MMInvertibleRelationCopyMappingGenerator().generateTotalCopyMapping(findAllNeededPackages(sourcePackages_p, context));
    progress.worked(50);
    MMSimplifier.getInstance().simplifyAllModels(invertibleMapping, false, true);
    
    Result result = new Result(invertibleMapping.getContents());
    replaceExternalReferences(result.getTargetPackages(), context);
    progress.worked(50);
    return result;
  }

  
  private void replace(EObject referent, EReference reference, EObject oldRef, EObject newRef){
    if (reference.isMany()){
      List<EObject> list = (List<EObject>) referent.eGet(reference);
      int index = list.indexOf(oldRef);
      list.remove(index);
      list.add(index, newRef);
    } else {
      referent.eSet(reference, newRef);
    }
  }

  protected Collection<EStructuralFeature.Setting> replaceExternalReferences(Collection<EPackage> packages_p, ConceptualMapping context){
    Collection<EStructuralFeature.Setting> missingSimplified = new ArrayList<EStructuralFeature.Setting>();
    Map<EObject, Collection<EStructuralFeature.Setting>> externalReferences = CrossReferencer.find(packages_p);
    for (EObject e : externalReferences.keySet()){
        for (EStructuralFeature.Setting setting : externalReferences.get(e)){
           if (e instanceof EModelElement && setting.getEStructuralFeature() instanceof EReference){
             EModelElement simplified = context.getSimplified((EModelElement)e);
             if (simplified != null){
               replace(setting.getEObject(), (EReference) setting.getEStructuralFeature(), e, simplified);
             } else {
               missingSimplified.add(setting);
             }
           }
        }
    }
    return missingSimplified;
  }
  
  /**
   * Transitively compute packages that need to be transformed atomically by:
   * - Replacing any subpackage by its root super package (We always transform root packages and all their children, never a subpackage alone)
   * - Including all crossreferenced packages 
   * - Excluding all those packages for which the context already provides a simplified version
   */
  private Collection<EPackage> findAllNeededPackages(Collection<EPackage> sourcePackages_p, ConceptualMapping context){  
    Set<EPackage> allRequiredPackages = new HashSet<EPackage>();
    Set<EPackage> skippedPackages = new HashSet<EPackage>();
    Deque<EPackage> pkgs = new ArrayDeque<EPackage>(new HashSet<EPackage>(sourcePackages_p));
    while (!pkgs.isEmpty()){
      EPackage ePackage = pkgs.pop();
      if (ePackage.getESuperPackage() != null){
        pkgs.push(ePackage.getESuperPackage());
        continue;
      }
      if (context.getSimplified(ePackage) != null){
        skippedPackages.add(ePackage);
        continue;
      }
      if (allRequiredPackages.add(ePackage)){
        for (Iterator<EObject> it = ePackage.eAllContents(); it.hasNext();){
          EObject next = it.next();
          for (EObject ref : next.eCrossReferences()){
            if(ref instanceof EClassifier){
              pkgs.add(((EClassifier) ref).getEPackage());
            }
          }
        }
      }
    }
    return allRequiredPackages;
  }
  
  public class Result {

    private final EMap<EObject, List<EObject>> _mapping;

    Result(EMap<EObject, List<EObject>> mapping_p) {
      _mapping = mapping_p;
    }

    public EMap<EObject, List<EObject>> getRawMapping() {
      return _mapping;
    }
    
    public Ecore2EcoreMappingRoot getEcore2EcoreMapping(){
      Ecore2EcoreFactory factory = Ecore2EcoreFactory.eINSTANCE;
      org.eclipse.emf.mapping.MappingFactory mapfactory = org.eclipse.emf.mapping.MappingFactory.eINSTANCE;
      Ecore2EcoreMappingRoot mappingmodel = factory.createEcore2EcoreMappingRoot();
      Ordering<EObject> byURI = Ordering.natural().onResultOf(EMFFunctions.eObjectToUriString());
      for (EObject sortedKey : byURI.sortedCopy(_mapping.keySet())){ 
        List<EObject> sortedValues = byURI.sortedCopy(_mapping.get(sortedKey));
        if (!sortedValues.isEmpty()){
          org.eclipse.emf.mapping.Mapping mapping = mapfactory.createMapping();
          mapping.getInputs().add(sortedKey);
          mapping.getOutputs().addAll(sortedValues);
          mappingmodel.getNested().add(mapping);
        }
      }
      return mappingmodel;
    }

    public Collection<EPackage> getTargetPackages(){
      Set<EPackage> result = new TreeSet<EPackage>(new Comparator<EPackage>(){
        @Override
        public int compare(EPackage o1_p, EPackage o2_p) {
          return o1_p.getNsPrefix().compareTo(o2_p.getNsPrefix());
        }
      });
      for (Map.Entry<EObject, List<EObject>> entry : _mapping.entrySet()){
        if (entry.getKey() instanceof EPackage){
          result.add((EPackage) entry.getValue().get(0));
        }
      }
      return new ArrayList<EPackage>(result);
    }
    
    
    public ResourceSet save(URI destinationDir, boolean saveXMLSchema) throws Exception {
      
      if (destinationDir.lastSegment().equals("")){
        destinationDir = destinationDir.trimSegments(1);
      }
      
      ResourceSet rs = new ResourceSetImpl();
      Resource.Factory ecoreResourceFactory = new EcoreResourceFactoryImpl();
      rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", ecoreResourceFactory);
      rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("genmodel", ecoreResourceFactory);
      StringBuilder genModelBuilder = new StringBuilder();
      for (EPackage p : getTargetPackages()){
        if (p.getESuperPackage() == null){
          URI targetURI = destinationDir.appendSegment(p.getName() + ".ecore");
          Resource resource = rs.getResource(targetURI, false);
          if (resource != null){
            throw new IllegalStateException("Colliding destination URIs for EPackages: " + p + ", " + ((EPackage) resource.getContents().get(0)));
          }
          resource = rs.createResource(targetURI);
          resource.getContents().add(p);
          genModelBuilder.append(targetURI.toString() + "\n");
        }
      }
      
      Resource mappingResource = rs.createResource(destinationDir.appendSegment("mapping.ecore2ecore"));
      mappingResource.getContents().add(getEcore2EcoreMapping());
      
      for (Resource res : rs.getResources()){
        
     
        res.save(Collections.emptyMap());
      }
      
     
    
      return rs;
      
    }
    
    
    
  }

 
  @SuppressWarnings("serial")
  /**
   * Find Crossreferences from simplified packages to technical EPackages. Those crossreferences are
   * remainders of the simplified package source and must be replaced with their simplified 
   * counterparts. If no counterpart exists then something is wrong, such as extending a Capella
   * metaclass for which no simplified concept exists, such as "TransfoLink".
   * 
   */
  static class CrossReferencer extends EcoreUtil.ExternalCrossReferencer {
    /**
     * @param emfObjects_p
     */
    protected CrossReferencer(Collection<?> emfObjects_p) {
      super(emfObjects_p);
    }

    @Override
    protected boolean crossReference(EObject eObject_p, EReference eReference_p, EObject crossReferencedEObject_p) {
      if (super.crossReference(eObject_p, eReference_p, crossReferencedEObject_p)){
        if (eReference_p.isDerived()){
          return false;
        }
        if (crossReferencedEObject_p instanceof EClassifier && ((EClassifier) crossReferencedEObject_p).getEPackage() == EcorePackage.eINSTANCE){
          return false;
        }
        if (eReference_p == EcorePackage.Literals.EPACKAGE__EFACTORY_INSTANCE){
          return false;
        }
        return true;
      }
      return false;
    }

    /**
     * Returns a map of all external cross references from the combined content trees of the specified collection of objects.
     * @param emfObjectsToSearch a collection of objects whose combined content trees should be considered.
     * @return a map of cross references.
     */
    public static Map<EObject, Collection<EStructuralFeature.Setting>> find(Collection<?> emfObjectsToSearch){
      return new CrossReferencer(emfObjectsToSearch).findExternalCrossReferences();
    }
  }
  
}
