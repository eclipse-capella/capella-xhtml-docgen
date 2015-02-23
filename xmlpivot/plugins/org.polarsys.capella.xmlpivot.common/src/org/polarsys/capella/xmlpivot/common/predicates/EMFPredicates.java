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
package org.polarsys.capella.xmlpivot.common.predicates;

import java.util.Collection;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Predicate;


/** <p>
* <strong>EXPERIMENTAL</strong>. This class or interface has been added as
* part of a work in progress. There is no guarantee that this API will
* work or that it will remain the same. Please do not use this API without
* consulting with the Capella team.
* </p>
*/
public class EMFPredicates {

	private static Predicate<EObject> isRootContainer;
	private static Predicate<EStructuralFeature> isDerived;
	private static Predicate<EReference> hasAbstractType;
	
	public static Predicate<EObject> isRootContainer(){
		if (isRootContainer == null){
			isRootContainer = new Predicate<EObject>(){
				@Override
				public boolean apply(EObject input) {
					return input != null && input.eContainer() == null;
				}
			};
		}
		return isRootContainer;
	}
	
	/**
	 * A wrapper predicate for EcoreUtil.isAncestor(), binding the possible ancestor objects.
	 * 
	 * @param ancestorObjects
	 * @return
	 */
	public static Predicate<EObject> isAncestor(final Collection<? extends EObject> ancestorObjects){
	  return new Predicate<EObject>(){
      @Override
      public boolean apply(EObject input_p) {
        return EcoreUtil.isAncestor(ancestorObjects, input_p);
      }
	  };
	}
	
	

	
	public static <T extends EObject> Predicate<T> isEBooleanAttributeSet(final EAttribute attribute_p, Class<T> clazz){
    return new Predicate<T>(){
      @SuppressWarnings("boxing")
      @Override
      public boolean apply(T input_p) {
        return (Boolean) input_p.eGet(attribute_p);
      }
    };
	}
	
	public static Predicate<EStructuralFeature> isDerived(){
	  if (isDerived == null){
	    isDerived = isEBooleanAttributeSet(EcorePackage.Literals.ESTRUCTURAL_FEATURE__DERIVED, EStructuralFeature.class);
	  }
	  return isDerived;
	}
	
	
	public static Predicate<EReference> hasAbstractType(){ 
	  if (hasAbstractType == null){
	    hasAbstractType = new Predicate<EReference>(){
	      @Override
	      public boolean apply(EReference input_p) {
	        return input_p.getEReferenceType().isAbstract();
	      }
	    };
	  }
	  return hasAbstractType;
	}
	
	public static Predicate<EObject> isInstance(final EClass clazz){
	  return new Predicate<EObject>(){
      @Override
      public boolean apply(EObject input_p) {
        return clazz.isInstance(input_p);
      }
	  };
	}
	
	public static Predicate<EObject> hasEClass(final EClass clazz){
	  return new Predicate<EObject>(){
      @Override
      public boolean apply(EObject input_p) {
        return input_p.eClass() == clazz;
      }
    };
	}
	
}
