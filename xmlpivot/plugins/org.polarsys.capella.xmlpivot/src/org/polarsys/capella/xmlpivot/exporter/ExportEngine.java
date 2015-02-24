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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.capella.xmlpivot.extraction.ConceptualMapping;



/**
 * <p>
 * <strong>EXPERIMENTAL</strong>. This class or interface has been added as
 * part of a work in progress. There is no guarantee that this API will
 * work or that it will remain the same. Please do not use this API without
 * consulting with the Capella team.
 * </p>
 * <p>The export engine is responsible to copying model elements from the
 * technical domain to model elements in the conceptual domain and
 * to reestablish the object graph between conceptual objects.
 * <p>
 * This API is inspired by EcoreUtil.Copier, with some notable differences
 * mentioned below.
 * <p>
 * To copy an object the <code>copy</code> methods are used. Copy methods 
 * may be called more than once, however, an object is copied at most once, 
 * so multiple calls to copy for the same object have no effect. Objects for 
 * which no corresponding type exists in the conceptual domain are never copied.
 * <p>
 * Note that - other than in EcoreUtil.Copier - 
 * the containment children must be copied with a separate call to copy()
 * <p>
 * To complete the export, <code>copyReferences</code> must be called. This will 
 * recreate object references between copied objects and build the containment
 * tree of copied objects. <strong>The result of calling <code>copyReferences</code>
 * multiple times is undefined.</strong>
 * <p>
 * Note that this class is also a Map. Modifying the map directly via the Collections 
 * API is not recommended. The map keys are objects that have been copied, 
 * the values are the corresponding objects in the conceptual domain. Note that
 * calling copy for a technical object may lead to 'null' values. 
 * 
 */
public final class ExportEngine extends HashMap<EObject, EObject>  {

	private static final long serialVersionUID = 1L;
  private final ConceptualMapping mapping;
	
  /* Objects for which copy was called, but no semantic target class exists */
  private final Set<EObject> unmappedObjects = new HashSet<EObject>();
  
  public ExportEngine(ConceptualMapping mapping_p){
	  this.mapping = mapping_p;
  }

  /**
   * Returns a collection of elements from the combined content trees of
   * the technical domain context for which no corresponding element in the
   * semantic/conceptual domain exists.
   * 
   * @param context
   * @return a collection of skipped objects
   */
  public Collection<EObject> getSkippedElements(Collection<? extends EObject> context){
	  Collection<EObject> skipped = new ArrayList<EObject>();
	  for (Iterator<EObject> it = EcoreUtil.getAllContents(context); it.hasNext();){
		  EObject next = it.next();
		  if (get(next) == null){
			  skipped.add(next);
		  }
	  }
	  return skipped;
  }
  
  /**
   * Produces a conceptual copy of the given eObject. It is allowed to call
   * this method more than once, but a given object will be copied at most once.
   * <p>
   * This does <b>NOT</b> automatically copy the content tree of the argument.
   * <p>
   * After all copies have been created, you should call copyReferences()
   * complete the copy operation.
   * 
   * @return the conceptual copy, or null if no corresponding conceptual metaclass exists.
   */
  public EObject copy(EObject eObject) {
	  
    if (eObject == null){
      throw new IllegalArgumentException();
    }
    
    if (unmappedObjects.contains(eObject)){
      return null;
    }
    
    EObject copyEObject = get(eObject);
    if (copyEObject == null){
      copyEObject = createCopy(eObject);
      if (copyEObject != null){
        for (EAttribute copyEAttribute : copyEObject.eClass().getEAllAttributes()){
          copyAttribute(copyEAttribute, copyEObject, eObject);
        }
        put(eObject, copyEObject);
      } else {
        unmappedObjects.add(eObject);
      }
    }
    return copyEObject;
  }

  /**
   * Consumes the iterator and calls copy for each provided object.
   * @param iterator
 	*/
  public void copy(Iterator<EObject> iterator){
	  while (iterator.hasNext()){
		  copy(iterator.next());
	  }
  }

  /**
   * Produces a conceptual copy of the given elements.
   * @param eObjects the collection of objects to copy.
   * @return the collection of copies.
   */
  public Collection<EObject> copyAll(Collection<? extends EObject> eObjects) {
    Collection<EObject> result = new ArrayList<EObject>(eObjects.size());
    for (Object object : eObjects) {
      EObject copy = copy((EObject)object);
      if (copy != null){
    	  result.add(copy);
      }
    }
    return result;
  }
  
  /**
   * @param copyEAttribute an EAttribute from the target domain
   * @param copyEObject an EObject from the target domain
   * @param eObject the corresponding "original" object from the source domain
   */
  protected void copyAttribute(EAttribute copyEAttribute, EObject copyEObject, EObject eObject) {
	  if (copyEAttribute.isChangeable() && !copyEAttribute.isDerived()){
		  EAttribute eAttribute = mapping.getTechnical(copyEAttribute);		  
		  if (eObject.eIsSet(eAttribute)){
			  if (eAttribute.getEType() instanceof EEnum){
				  copyEnumAttributeValue(eAttribute, eObject, copyEAttribute, copyEObject);
			  } else {
				  copyAttributeValue(eAttribute, eObject, copyEAttribute, copyEObject);
			  }
		  }
	  }
    }
  
  	
  	 /**
     * Returns a new instance of the object's target class.
     * @param eObject the object to copy.
     * @return a new instance of the target class.
     * @see #getSimplifiedEClass(EClass)
     * @see EcoreUtil#create(EClass)
     */
    protected EObject createCopy(EObject eObject) {
      EClass copyEClass = mapping.getSimplified(eObject.eClass());
      if (copyEClass != null){
    	  return EcoreUtil.create(copyEClass);
      }
      return null;
    }

		
  /** 
   * Copies cross references between copied objects. Note that other than in EcoreUtil.Copier,
   * this will also handle containment references, so the copy content tree structure will not
   * be completed until this method is called. Also note that the results of calling this
   * method twice for a single instance are undefined.
   */
  public void copyReferences(){
		for (Map.Entry<EObject, EObject> entry : entrySet()) {
			EObject eObject = entry.getKey();
			EObject copyEObject = entry.getValue();
			if (copyEObject != null){
				for (EReference copyEReference : copyEObject.eClass().getEAllReferences()) {
				    if (!copyEReference.isContainer()){
						copyCrossReference(copyEReference, copyEObject, eObject);
					}
				}
			}
        }
	}


	protected void copyCrossReference(EReference copyEReference, EObject copyEObject, EObject eObject){
	  
		EReference eReference = mapping.getTechnical(copyEReference);
		
		if (eObject.eIsSet(eReference)){
			Object value = eObject.eGet(eReference);
			if (eReference.isMany()) {
				@SuppressWarnings("unchecked") InternalEList<EObject> source = (InternalEList<EObject>) value;
				@SuppressWarnings("unchecked") InternalEList<EObject> target = (InternalEList<EObject>) copyEObject.eGet(copyEReference);
				boolean isBidirectional= copyEReference.getEOpposite() != null;
				int index = 0;
				for (EObject referencedEObject : source) {
					EObject copyReferencedEObject = get(referencedEObject);
					if (copyReferencedEObject != null) {
						if (isBidirectional){
							int position = target.indexOf(copyReferencedEObject);
							if (position == -1){
								target.addUnique(index, copyReferencedEObject);
							} else if (index != position){
								target.move(index, copyReferencedEObject);
							}
						} else if (eReference.isDerived()){
						  // Some derived references in MA will contain a single element more than once (which IMO is a bug)
						  //  => For these cases we cannot use the much faster addUnique, sice loading
						  // a reference with duplicates will trigger exceptions
							target.add(copyReferencedEObject);
						} else {
							target.addUnique(copyReferencedEObject);
						}
						index++;
					}
				}
			} else {
				EObject targetValue = get(value);
				if (targetValue != null) {
					copyEObject.eSet(copyEReference, targetValue);
				}
			}
		}
	}
	
  protected void copyAttributeValue(EAttribute sourceAttribute, EObject sourceElement, EAttribute targetAttribute, EObject targetElement){
    targetElement.eSet(targetAttribute, sourceElement.eGet(sourceAttribute));
  }

  protected void copyEnumAttributeValue(EAttribute sourceAttribute, EObject sourceElement, EAttribute targetAttribute, EObject targetElement) {
	  Object targetValue = null;
	  if (sourceAttribute.isMany()){
		  EList<Object> newListValue = new BasicEList<Object>();
		  for (Object o : (EList<?>) sourceElement.eGet(sourceAttribute)){
			  newListValue.add(EcoreUtil.createFromString((EDataType) targetAttribute.getEType(), ((Enumerator) o).getLiteral()));
		  }
		  targetValue = newListValue;
	  } else {
		  targetValue = EcoreUtil.createFromString((EDataType) targetAttribute.getEType(), ((Enumerator) sourceElement.eGet(sourceAttribute)).getLiteral());
	  }
	  targetElement.eSet(targetAttribute, targetValue);
  }

  /**
   * Returns an unmodifiable collection of objects for which copy() was called, but
   * no copy was produced, because the object class has no corresponding
   * conceptual metaclass, or simply put: because the object metaclass is 
   * not "semantic"
   */
  public Collection<? extends Object> getUnmappedObjects() {
    return Collections.unmodifiableCollection(unmappedObjects);
  }

  

}
