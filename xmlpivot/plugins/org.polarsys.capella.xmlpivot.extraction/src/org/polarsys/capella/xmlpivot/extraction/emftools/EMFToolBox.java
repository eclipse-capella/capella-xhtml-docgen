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
package org.polarsys.capella.xmlpivot.extraction.emftools;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.polarsys.capella.xmlpivot.extraction.Messages;


/**
 * Singleton Class that contains EMF tools
 */
public final class EMFToolBox {

  private static EMFToolBox instance = null;

  /**
   * Empty private constructor used to hide default one
   */
  private EMFToolBox() {
    // Nothing
  }

  /**
   * Returns an instance of this static class
   * @return Instance of this static class
   */
  public static EMFToolBox getInstance() {
    if (instance == null) {
      instance = new EMFToolBox();
    }
    return (instance);
  }

  /**
   * Loads an ecore model from the sourcepath to the returned resource
   * @param sourcePath path to the model to load
   * @return a Resource with loaded model from sourcepath
   */
  public Resource loadEcore(String sourcePath) {

    ResourceSet resourceSet = new ResourceSetImpl();
    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Messages._ECORE_EXTENSION, new EcoreResourceFactoryImpl());

    URI fileURI = URI.createFileURI(new File(sourcePath).getAbsolutePath());

    Resource resource = resourceSet.getResource(fileURI, true);

    return (resource);
  }

  /**
   * Loads a resource form the registry
   * @param pathName
   * @return
   */
  public Resource loadEcorefromRegistry(String pathName) {

    ResourceSet rs = new ResourceSetImpl();

    URI uri = URI.createPlatformPluginURI(pathName, false);

    Resource r = rs.getResource(uri, true);

    return r;
  }

  /**
   * Looks for the corresponding genmodel by prefix
   * @param obj_p
   * @param prefix_p
   * @return
   */
  public GenPackage getCorrespondantOriginalPackage(GenModel genModel_p, String prefix_p) {
    // Look inside genPackages
    for (GenPackage current : genModel_p.getGenPackages()) {
      if (prefix_p.equals(current.getPrefix())) {
        return current;
      }
      for (GenPackage subcurrent : current.getSubGenPackages()) {
        if (prefix_p.equals(subcurrent.getPrefix())) {
          return subcurrent;
        }
      }
    }
    // Look in usedGenPackages
    for (GenPackage current : genModel_p.getUsedGenPackages()) {
      if (prefix_p.equals(current.getPrefix())) {
        return current;
      }
      for (GenPackage subcurrent : current.getSubGenPackages()) {
        if (prefix_p.equals(subcurrent.getPrefix())) {
          return subcurrent;
        }
      }
    }
    return null;
  }

  /**
   * Saves a collection of resources to disk
   * @param ecoreResources collection of resources to save
   * @throws IOException
   */
  public void saveEcore(Collection<Resource> ecoreResources) throws IOException {

    for (Resource ecoreResource : ecoreResources) {
      if (ecoreResource.getContents().isEmpty()) {
        // System.out.println(ecoreResource.getContents().get(0) + "is empty");
      }
      ecoreResource.save(null);
    }

  }

  /**
   * Returns a qualified name of the EObject
   * @param nmd a potentially null EObject
   * @return a String
   */
  public String getQualifiedENamedElementName(EObject nmd) {
    String name = ""; //$NON-NLS-1$
    if (nmd != null) {
      if (nmd instanceof EClassifier) {
        EClassifier clsf = (EClassifier) nmd;
        if (clsf.getEPackage() != null) {
          name += getQualifiedENamedElementName(clsf.getEPackage());
        }
        name += clsf.getName();
      } else if (nmd instanceof EPackage) {
        EPackage pkg = (EPackage) nmd;
        if (pkg.getESuperPackage() != null) {
          name += pkg.getESuperPackage().getName() + "/"; //$NON-NLS-1$
        }
        name += pkg.getName() + "/"; //$NON-NLS-1$
      } else if (nmd instanceof EStructuralFeature) {
        EStructuralFeature strf = (EStructuralFeature) nmd;
        if (strf.getEContainingClass().getEPackage() != null) {
          name += getQualifiedENamedElementName(strf.getEContainingClass().getEPackage());
        }
        name += strf.getEContainingClass().getName() + "/" + strf.getName(); //$NON-NLS-1$
      } else {
        name = nmd.toString();
      }
      return name;
    }
    return ""; //$NON-NLS-1$
  }

  /**
   * Annotates the ENamedElement obj with the annotation message annMessage
   * @param obj : Object to annotate
   * @param annMessage : message to use in annotating obj
   * @param changeAnn : informs us if a change has been made to obj, i.e: if an annotation has been created for it
   * @param trace : keeps the information that the trace EObject was at the origin of the annotation action
   */
  public void annotate(ENamedElement obj, String annMessage, EAnnotation changeAnn, EObject trace) {
    if (obj != null) {
      if (!isAnnotated(obj, annMessage)) {
        EcoreFactory factory = EcoreFactory.eINSTANCE;
        EAnnotation ann = factory.createEAnnotation();
        ann.setSource(annMessage);
        // Tracing annotation
        EAnnotation traceAnn = factory.createEAnnotation();
        if (trace != null) {
          traceAnn.setSource(getQualifiedENamedElementName(trace));
        }
        traceAnn.setEModelElement(ann);
        ann.setEModelElement(obj);
        if (changeAnn != null) {
          changeAnn.setSource("true"); //$NON-NLS-1$
        }
      }
    }
  }

  /**
   * annotates all the packages hierarchy of cls (class/datatype/enum) with the annMessage
   * @param cls
   * @param annMessage
   */
  public void annotateClassifierPackageHierarchy(EClassifier cls, String annMessage, EAnnotation changeAnn, EObject trace) {
    if (cls != null) {
      EPackage pack = cls.getEPackage();
      if (!isAnnotated(pack, annMessage)) {
        annotate(pack, annMessage, changeAnn, trace);
        annotatePackageHierarchy(pack, annMessage, changeAnn, trace);

      }
    }

  }

  /**
   * Suppresses all annotations in a EModelElement (package/class/enum/datatype/package)
   * @param elem
   */
  public void SuppressModelElementAnnotations(EModelElement elem) {
    // suppress annotations directly contained by the model element
    EList<EAnnotation> lst = elem.getEAnnotations();
    Iterator<EAnnotation> it = lst.iterator();
    while (it.hasNext()) {
      it.next();
      it.remove();
    }

    // if the element is a class, suppress the annotations in its hierarchical subtree
    if (elem instanceof EClass) {
      // suppress the annotations in structural features (attributes/references)
      EList<EStructuralFeature> attlist = ((EClass) elem).getEAllStructuralFeatures();
      for (EStructuralFeature cur : attlist) {
        SuppressModelElementAnnotations(cur);
      }

    }

    // if this is a package a recursive parsing is done
    if (elem instanceof EPackage) {
      // suppress all contained classifiers annotations
      EList<EClassifier> clsist = ((EPackage) elem).getEClassifiers();
      for (EClassifier current : clsist) {
        SuppressModelElementAnnotations(current);
      }
      // suppress all contained packages annotations recursively
      EList<EPackage> pcklist = ((EPackage) elem).getESubpackages();
      for (EPackage current : pcklist) {
        SuppressModelElementAnnotations(current);
      }
    }

  }

  /**
   * annotates all the inheritance hierarchy of cls with the annMessage
   * @param cls
   * @param annMessage
   */
  public void annotateClassInheritanceHierarchy(EClassifier cls, String annMessage, EAnnotation changeAnn, Collection<Resource> _resources, EObject trace) {
    if (cls != null) {
      if (cls instanceof EClass) {
        // propagate to super-classes
        List<EClass> superList = ((EClass) cls).getESuperTypes();
        for (EClass current : superList) {
          if (!isAnnotated(current, annMessage)) {
            annotate(current, annMessage, changeAnn, trace);
          }
          annotateClassInheritanceHierarchy(current, annMessage, changeAnn, _resources, trace);
        }
      }

    }

  }

  /**
   * annotates recursively all the packages hierarchy of a poackage with the annMessage
   * @param pack
   * @param annMessage
   */
  public void annotatePackageHierarchy(EPackage pack, String annMessage, EAnnotation changeAnn, EObject trace) {
    if (pack != null) {
      EPackage ancestor = pack.getESuperPackage();
      if (ancestor != null) {
        if (!isAnnotated(ancestor, annMessage)) {
          annotate(ancestor, annMessage, changeAnn, trace);
        }
        annotatePackageHierarchy(ancestor, annMessage, changeAnn, trace);
      }
    }
  }

  /**
   * Checks whether a modelElemlent has the annMessage annotation
   * @param obj
   * @param annMessage
   * @return
   */
  public boolean isAnnotated(EModelElement obj, String annMessage) {
    if (obj != null) {
      EAnnotation ann = obj.getEAnnotation(annMessage);
      if (ann != null) {

        return true;

      }
    }
    return false;
  }

  /**
   * gets the annMessage annotation if it exists
   * @param obj a potentially null EModelElement
   * @param annMessage the annotation message to check
   * @return a potentially null EAnnotation
   */
  public EAnnotation getAnnotation(EModelElement obj, String annMessage) {
    if (obj != null) {
      EAnnotation ann = obj.getEAnnotation(annMessage);
      if (ann != null) {

        return ann;

      }
    }
    return null;
  }

  /**
   * gets the value of the detail from the annotation if it exists
   * @param ann a potentially null EAnnotation
   * @param detailKey the key to check for
   * @return a potentially null String
   */
  public String getAnnotationDetail(EAnnotation ann, String detailKey) {
    if (ann != null) {
      return (ann.getDetails().get(detailKey));
    }
    return null;
  }

  /**
   * @param reg
   * @param path
   * @param key
   */
  public void loadEcoretoRegistry(Registry reg, String path, String key) {

    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(Messages._ECORE_EXTENSION, new EcoreResourceFactoryImpl());

    ResourceSet rs = new ResourceSetImpl();

    URI uri = URI.createFileURI(path);

    Resource r = rs.getResource(uri, true);

    EObject eObject = r.getContents().get(0);
    EcoreFactory factory = EcoreFactory.eINSTANCE;

    if (eObject instanceof EPackage) {
      EPackage p = (EPackage) eObject;
      EAnnotation ann = factory.createEAnnotation();
      ann.setSource("PATH=" + key); //$NON-NLS-1$
      ann.setEModelElement(p);
      reg.put(key, p);
    }
  }

  /**
   * @param reftype
   * @param businessAnnotation
   * @return
   */
  public boolean isSuperAnnotated(EClass reftype, String businessAnnotation) {
    // verifies if the annotation is present in one of the class's supertypes
    for (EClass superCls : reftype.getEAllSuperTypes()) {
      if (isAnnotated(superCls, businessAnnotation)) {
        return (true);
      }
    }
    return false;
  }

  public boolean isPrimitiveEMFType(EClassifier type) {
    boolean res = false;
    if (type.eClass() == EcorePackage.Literals.EDATA_TYPE) {
      res = true;
    }
    return res;
  }

  /**
   * @param clazz_p
   * @return
   */
  public boolean isFiltered(EClass clazz_p) {
    if ("".equals(clazz_p.getName()) || "".equals(clazz_p.getName()) || "".equals(clazz_p.getName()) || "".equals(clazz_p.getName()) //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        || "".equals(clazz_p.getName()) || "".equals(clazz_p.getName())) { //$NON-NLS-1$ //$NON-NLS-2$

    }
    return false;
  }

}
