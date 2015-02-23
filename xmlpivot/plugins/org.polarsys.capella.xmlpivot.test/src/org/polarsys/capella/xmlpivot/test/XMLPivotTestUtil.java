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
package org.polarsys.capella.xmlpivot.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.collect.Iterators;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;
import org.polarsys.capella.xmlpivot.common.CapellaDerivedFeatureMetadata;
import org.polarsys.capella.xmlpivot.common.predicates.EMFPredicates;

/**
 */
public class XMLPivotTestUtil {

  private final URI inputResourceURI;
  private final Collection<? extends EObject> inputElements;
  private final Collection<? extends EObject> importResult;

  public XMLPivotTestUtil(URI inputResourceURI, Collection<? extends EObject> inputElements, Collection<? extends EObject> importResult){
     this.inputElements = inputElements;
     this.importResult = importResult;
     this.inputResourceURI = inputResourceURI;
  }

   public void assertAllLinksRecreated(EClass associationClass){
    
    CapellaDerivedFeatureMetadata metaData = CapellaDerivedFeatureMetadata.INSTANCE;
    EReference left = metaData.getLeft(associationClass);
    EReference right = metaData.getRight(associationClass);
    
    Collection<Object> missing = new ArrayList<Object>();
    Iterator<EObject> allFixtureContents = EcoreUtil.getAllContents(inputElements);
    Iterator<? extends EObject> originFrs = Iterators.filter(allFixtureContents, EMFPredicates.hasEClass(associationClass));
    
    int tests = 0;
    origins:
    while (originFrs.hasNext()){
      tests++;
      EObject original = originFrs.next();
      Iterator<? extends EObject> importedFrs = Iterators.filter(EcoreUtil.getAllContents(importResult), original.getClass());
      while (importedFrs.hasNext()){
        if (new AbstractLinkEqualityHelper(associationClass, left, right).equals(original, importedFrs.next())){
          continue origins;
        }
      }
      missing.add(original);
    }
    assertEquals(0, missing.size());
    if (tests == 0){
      fail("Found no links of type "  + associationClass.getName() + " in test fixture" + inputResourceURI);       //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

   /**
    * Returns the first element in the combined content trees of the input elements with a given name.
    * @param name
    * @throws IllegalArgumentException if no element with the given name was found in the test input
    */
   public EObject getSourceElementByName(String name){
     return getElementByName(name, inputElements);
   }
   
   /**
    * Returns the first element in the combined content trees of the import result with a given name and
    * that is also an instance of a given type.
    * @param name
    * @return
    * @throws IllegalArgumentException if no element with the given name was found in the import result
    */
   public <T extends EObject> T getSourceElementByName(String name, Class<T> type){
     return getElementByName(name, inputElements, type);
   }
   
   /**
    * Returns the first element in the combined content trees of the import result with a given id.
    * @param id
    * @return
    * @throws NoSuchElementException if no element with the given id was found
    */
   public EObject getImportElementById(String id){
     return getElementById(id, importResult);
   }
   
   /**
    * Returns the first element in the combined content trees of the input elements with a given id.
    * @param id
    * @return
    * @throws NoSuchElementException if no element with the given id was found
    */
   public EObject getSourceElementById(String id){
     return getElementById(id, inputElements);
   }
   
   /**
    * Returns the first element in the combined content trees of the import result with a given name
    * @param name
    * @return
    * @throws NoSuchElementException if no element with the given name was found in the import result
    */
   public EObject getImportElementByName(String name){
     return getElementByName(name, importResult);
   }
   
   /**
    * Returns the first element in the combined content trees of the import result with a given name and
    * that is also an instance of a given type
    * @param name
    * @return
    * @throws NoSuchElementException if no element with the given name was found in the import result
    */
   public <T extends EObject> T getImportElementByName(String name, Class<T> type){
     return getElementByName(name, importResult, type);
   }
   
   private EObject getElementByName(String name, Collection<? extends EObject> scope){
     return getElementByName(name, scope, EObject.class);
   }
   
   private EObject getElementById(String id, Collection<? extends EObject> scope){
     // test objects may or may not be stored in a resource, so this is slow but always works:
     for (Iterator<EObject> it = EcoreUtil.getAllContents(scope); it.hasNext();){
       EObject next = it.next();
       if (id.equals(EcoreUtil.getID(next))){
         return next;
       }
     }
     throw new NoSuchElementException("No element with id " + id + " found");
   }
   
   @SuppressWarnings("unchecked")
   private <T extends EObject> T getElementByName(String name, Collection<? extends EObject> scope, Class<T> type){
     for (Iterator<EObject> it = EcoreUtil.getAllContents(scope); it.hasNext();){
       EObject next = it.next();
       if (next instanceof NamedElement && name.equals(((NamedElement) next).getName()) && type.isInstance(next)){
        return (T) next;
       }
     }
     throw new NoSuchElementException("No NamedElement with name: " + name + " was found");
   }
   
   @SuppressWarnings("serial")
   static class AbstractLinkEqualityHelper extends EcoreUtil.EqualityHelper {
     
     private final EClass linkClass;
     private final EReference source;
     private final EReference target;
     
     public AbstractLinkEqualityHelper(EClass linkClass_p, EReference sourceRef_p, EReference targetRef_p){
       linkClass = linkClass_p;
       source = sourceRef_p;
       target = targetRef_p;
     }
     
     @Override
     protected boolean haveEqualAttribute(EObject eObject1_p, EObject eObject2_p, EAttribute attribute_p) {
       if (linkClass.isInstance(eObject1_p)){
         return true;
       } else if (attribute_p.isID()){
         return super.haveEqualAttribute(eObject1_p, eObject2_p, attribute_p);
       } else {
         return true;
       }
     }
     
     @Override
     protected boolean haveEqualFeature(EObject eObject1, EObject eObject2, EStructuralFeature feature){
       if (feature == source || feature == target || feature == ModellingcorePackage.Literals.MODEL_ELEMENT__ID){
         return super.haveEqualFeature(eObject1, eObject2, feature);
       }
       return true;
     }
   }
}
