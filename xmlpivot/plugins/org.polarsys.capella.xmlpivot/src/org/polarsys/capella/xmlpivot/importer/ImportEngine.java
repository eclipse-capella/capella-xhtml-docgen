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
package org.polarsys.capella.xmlpivot.importer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import com.google.common.collect.Collections2;
import org.polarsys.capella.core.data.cs.AbstractDeploymentLink;
import org.polarsys.capella.core.data.cs.DeployableElement;
import org.polarsys.capella.core.data.cs.DeploymentTarget;
import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.cs.InterfaceImplementation;
import org.polarsys.capella.core.data.cs.InterfaceUse;
import org.polarsys.capella.core.data.ctx.Capability;
import org.polarsys.capella.core.data.ctx.CapabilityExploitation;
import org.polarsys.capella.core.data.ctx.Mission;
import org.polarsys.capella.core.data.interaction.AbstractCapability;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityExtend;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityGeneralization;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityInclude;
import org.polarsys.capella.core.data.capellacore.GeneralizableElement;
import org.polarsys.capella.core.data.capellacore.Generalization;
import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.Involvement;
import org.polarsys.capella.core.data.capellacore.InvolverElement;
import org.polarsys.capella.common.data.modellingcore.AbstractTrace;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;
import org.polarsys.capella.xmlpivot.common.CapellaDerivedFeatureMetadata;
import org.polarsys.capella.xmlpivot.common.predicates.EMFPredicates;
import org.polarsys.capella.xmlpivot.extraction.ConceptualMapping;

/**
 * <p>
 * <strong>EXPERIMENTAL</strong>. This class or interface has been added as
 * part of a work in progress. There is no guarantee that this API will
 * work or that it will remain the same. Please do not use this API without
 * consulting with the <Your Team Name> team.
 * </p>
 */
@SuppressWarnings("serial")
public class ImportEngine extends EcoreUtil.Copier {

  private final Collection<EObject> orphanedRecreatedAssociationLinks = new ArrayList<EObject>();
  
	 private final ConceptualMapping mapping;
  public ImportEngine(ConceptualMapping mapping_p) {
    mapping = mapping_p;
  }

  public ConceptualMapping getMapping(){
    return mapping;
  }
  
  /**
   * Returns the technical EClass that maps to the given simplified EClass
   */

  @Override
  protected EClass getTarget(EClass simplifiedEClass) {
    EClass targetClass = mapping.getTechnical(simplifiedEClass);
    if (targetClass == null){
      throw new IllegalStateException("No technical class found for: " + simplifiedEClass); //$NON-NLS-1$
    }
    return targetClass;
  }

  @Override
  protected EStructuralFeature getTarget(EStructuralFeature eStructuralFeature) {
    return mapping.getTechnical(eStructuralFeature);
  }
  
  /**
   * Called to handle the copying of a cross reference;
   * this adds values or sets a single value as appropriate for the multiplicity
   * while omitting any bidirectional reference that isn't in the copy map.
   * @param eReference the reference to copy.
   * @param eObject the object from which to copy.
   * @param copyEObject the object to copy to.
   */
  @Override
  protected void copyReference(EReference eReference, EObject eObject, EObject copyEObject)
  {

    try {
      EStructuralFeature targetFeature = getTarget(eReference);
      if (targetFeature.isDerived()){
        copyReferenceToHoldingFeature(eReference, eObject, copyEObject);
        recreateLinks(eReference, eObject, copyEObject);
      } else {
        super.copyReference(eReference, eObject, copyEObject);
      }
    } catch (Exception e){
      e.printStackTrace();
    }
  }
  
  @SuppressWarnings("unchecked")
  protected void recreateLinks(EReference eReference, EObject eObject, EObject copyEObject){
    EClass associationClass = CapellaDerivedFeatureMetadata.INSTANCE.getAssociationClass((EReference) getTarget(eReference));
    if (associationClass != null){
      if (eReference.isMany()){
        for (EObject referenced : (List<EObject>) eObject.eGet(eReference)){
          link(copyEObject, get(referenced), associationClass);
        }
      } else if (eObject.eGet(eReference) != null){
        link(copyEObject, get(eObject.eGet(eReference)), associationClass);
      }
    }
  }  
  
  @SuppressWarnings("unchecked")
  protected void copyReferenceToHoldingFeature(EReference eReference, EObject eObject, EObject copyEObject){
    EReference holdingReference = (EReference) CapellaDerivedFeatureMetadata.INSTANCE.getHoldingFeature(getTarget(eReference));
    if (holdingReference != null){
      if (holdingReference.isMany()){
        List<EObject> heldValues = (List<EObject>) copyEObject.eGet(holdingReference); 
        if (eReference.isMany()){
          for (EObject referencedObject : ((List<EObject>) eObject.eGet(eReference))){
            EObject copyReferencedObject = null;
            if (holdingReference.isContainment()){
              copyReferencedObject = copy(referencedObject);
            } else {
              copyReferencedObject = get(referencedObject);
            }
            if (copyReferencedObject != null){
              heldValues.add(copyReferencedObject);
            } 
          }
        } else { 
          EObject copyReferencedObject = null;
          if (holdingReference.isContainment()){
            copyReferencedObject = copy((EObject) eObject.eGet(eReference));
          } else {
            copyReferencedObject = get(eObject.eGet(eReference));
          }
          get(eObject.eGet(eReference));
          if (copyReferencedObject != null){
            heldValues.add(copyReferencedObject);
          }
        }
      } else {
          EObject copyReferencedObject = null;
          if (holdingReference.isContainment()){
            copyReferencedObject = copy((EObject) eObject.eGet(eReference));
          } else {
            copyReferencedObject = get(eObject.eGet(eReference));
          }
          if (copyReferencedObject != null){
            copyEObject.eSet(holdingReference, copyReferencedObject);
          }
      }
    } 
  }

  /**
   * @param link_p
   * @param eObject_p 
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  private void attachLink(EObject context, EObject link) {
    if (link.eContainer() == null){
      while (link.eContainer() == null && context != null){
        for (EReference ref : context.eClass().getEAllContainments()){
          if (ref.getEType().isInstance(link)){
            if (ref.isMany()){
              ((EList) context.eGet(ref)).add(link);
            } else {
              context.eSet(ref, link);
            }
            return;
          }
        }
        context = context.eContainer();
      }
      orphanedRecreatedAssociationLinks.add(link);
    }
  }

  
  
  private void link(EObject source, EObject target, EClass associationClass){
    
    EObject link = EcoreUtil.create(associationClass);
    if (link instanceof AbstractTrace){
      ((AbstractTrace) link).setSourceElement((TraceableElement) source);
      ((AbstractTrace) link).setTargetElement((TraceableElement) target);
    } else if (link instanceof Involvement){
      ((Involvement) link).setInvolver((InvolverElement) source);
      ((Involvement) link).setInvolved((InvolvedElement) target);
    } else if (link instanceof Generalization){
      ((Generalization) link).setSub((GeneralizableElement) source);
      ((Generalization) link).setSuper((GeneralizableElement) target);
    } else if (link instanceof CapabilityExploitation){
      ((CapabilityExploitation) link).setMission((Mission) source);
      ((CapabilityExploitation) link).setCapability((Capability) target);
    } else if (link instanceof AbstractDeploymentLink){
      ((AbstractDeploymentLink) link).setLocation((DeploymentTarget) source);
      ((AbstractDeploymentLink) link).setDeployedElement((DeployableElement) target);
    } else if (link instanceof AbstractCapabilityGeneralization){
    	((AbstractCapabilityGeneralization) link).setSuper((AbstractCapability) target);
    } else if (link instanceof AbstractCapabilityExtend){
    	((AbstractCapabilityExtend) link).setExtended((AbstractCapability) target);
    } else if (link instanceof AbstractCapabilityInclude){
    	((AbstractCapabilityInclude) link).setIncluded((AbstractCapability) target);
    } else if (link instanceof InterfaceUse){
    	((InterfaceUse) link).setUsedInterface((Interface) target);
    } else if (link instanceof InterfaceImplementation){
    	((InterfaceImplementation) link).setImplementedInterface((Interface) target);
    }

    if (link instanceof ModelElement){
      // generate an ID as a side effect...
      ((ModelElement) link).getId();
    }
    
    attachLink(source, link);
  }
  
  @Override
  protected void copyContainment(EReference eReference, EObject eObject, EObject copyEObject){ 
    if (getTarget(eReference).isDerived()){
      copyReferenceToHoldingFeature(eReference, eObject, copyEObject);
    } else {
      super.copyContainment(eReference, eObject, copyEObject);
    }
  }

  @Override
  protected void copyAttribute(EAttribute eAttribute_p, EObject eObject_p, EObject copyEObject_p) {
    if (!getTarget(eAttribute_p).isDerived()){
    if (eAttribute_p.getEType() instanceof EEnum){
      copyEnumAttributeValue(eAttribute_p, eObject_p, (EAttribute) getTarget(eAttribute_p), copyEObject_p);
    } else {
      super.copyAttribute(eAttribute_p, eObject_p, copyEObject_p);
    }
  }
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
  
  public Collection<EObject> getOrphanedRecreatedAssociationLinks(){
    return orphanedRecreatedAssociationLinks;
  }
  
  
  
  public void repair(){
  
    Collection<EObject> technicalRootContainers = Collections2.filter(values(), EMFPredicates.isRootContainer());
    Collection<EObject> simplifiedRootContainers = Collections2.filter(keySet(), EMFPredicates.isRootContainer());
    
    ComposedAdapterFactory factory = new ComposedAdapterFactory();
    factory.addAdapterFactory(new InteractionImportAdapterFactory());
    factory.addAdapterFactory(new FaImportAdapterFactory());
    factory.addAdapterFactory(new CsImportAdapterFactory());
    
    ChangeAdapter changeAdapter = new ChangeAdapter();
    for (EObject tr : technicalRootContainers){
      tr.eAdapters().add(changeAdapter);
    }
    while (changeAdapter.hasChanged()){
      changeAdapter.clear();
      for (Iterator<EObject> it = EcoreUtil.getAllContents(simplifiedRootContainers); it.hasNext();){
        EObject simplified = it.next();
        ImportAdapter adapter = (ImportAdapter) factory.adapt(get(simplified), ImportAdapter.class);
        if (adapter != null){
          adapter.doImport(get(simplified), simplified, this);
        }
      } 
    }
    for (EObject tr : technicalRootContainers){
      tr.eAdapters().remove(changeAdapter);
    }
  }

  
  protected class ChangeAdapter extends EContentAdapter {
      private boolean changed = true;
      public void clear(){
        changed = false;
      }
      public boolean hasChanged(){
        return changed;
      }
      @Override
      public void notifyChanged(Notification notification_p) {
        if (!notification_p.isTouch()){
          changed = true;
        }
      }
  }
  
  
}
