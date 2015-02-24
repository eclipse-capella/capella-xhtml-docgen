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
package org.polarsys.capella.xmlpivot.common;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.epbs.EpbsPackage;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.datatype.DatatypePackage;
import org.polarsys.capella.core.data.information.datavalue.DatavaluePackage;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.pa.deployment.DeploymentPackage;
import org.polarsys.capella.core.data.requirement.RequirementPackage;
import org.polarsys.capella.core.model.semantic.AbstractMetaData;
import org.polarsys.capella.core.model.semantic.SimplifiedCapellaMetadata;
import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;

/**
 *
 */
public class BasicCapellaDerivedFeatureMetaData implements CapellaDerivedFeatureMetadata {

  
  private final AbstractMetaData derivedMetaData;
  private final AbstractMetaData associationClassMetaData;
  
  
  /**
   * @param source_p
   * @param mapping_p
   */
  public BasicCapellaDerivedFeatureMetaData(Map<EModelElement, EAnnotation> mapping_p) {
    derivedMetaData = new AbstractMetaData(SOURCE_DERIVED_FEATURE, mapping_p);
    associationClassMetaData = new AbstractMetaData(SOURCE_ASSOCIATION_CLASS, mapping_p);
    
    setHoldingFeature(CapellacorePackage.Literals.TYPED_ELEMENT__TYPE, ModellingcorePackage.Literals.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE);
    
    setHoldingFeature(DatavaluePackage.Literals.ABSTRACT_ENUMERATION_VALUE__ENUMERATION_TYPE, ModellingcorePackage.Literals.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE);
    setHoldingFeature(DatavaluePackage.Literals.NUMERIC_VALUE__NUMERIC_TYPE, ModellingcorePackage.Literals.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE);

    setHoldingFeature(DatavaluePackage.Literals.ABSTRACT_BOOLEAN_VALUE__BOOLEAN_TYPE, ModellingcorePackage.Literals.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE);
    setHoldingFeature(DatavaluePackage.Literals.ABSTRACT_STRING_VALUE__STRING_TYPE, ModellingcorePackage.Literals.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE);
    
    setAssociationClass(OaPackage.Literals.ENTITY__ALLOCATED_OPERATIONAL_ACTIVITIES, FaPackage.Literals.COMPONENT_FUNCTIONAL_ALLOCATION);
    setAssociationClass(OaPackage.Literals.ENTITY__ALLOCATED_ROLES, OaPackage.Literals.ROLE_ALLOCATION);
    setAssociationClass(OaPackage.Literals.ROLE__ALLOCATED_OPERATIONAL_ACTIVITIES, OaPackage.Literals.ACTIVITY_ALLOCATION);
    setAssociationClass(OaPackage.Literals.OPERATIONAL_CAPABILITY__INVOLVED_ENTITIES, OaPackage.Literals.ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENT);
    setHoldingFeature(OaPackage.Literals.COMMUNICATION_MEAN__SOURCE_ENTITY, ModellingcorePackage.Literals.ABSTRACT_INFORMATION_FLOW__SOURCE);
    setHoldingFeature(OaPackage.Literals.COMMUNICATION_MEAN__TARGET_ENTITY, ModellingcorePackage.Literals.ABSTRACT_INFORMATION_FLOW__TARGET);
    
    setHoldingFeature(RequirementPackage.Literals.REQUIREMENTS_TRACE__SOURCE, ModellingcorePackage.Literals.ABSTRACT_TRACE__SOURCE_ELEMENT);
    setHoldingFeature(RequirementPackage.Literals.REQUIREMENTS_TRACE__TARGET, ModellingcorePackage.Literals.ABSTRACT_TRACE__TARGET_ELEMENT);
    
    defineAssociationClass(ModellingcorePackage.Literals.ABSTRACT_TRACE__SOURCE_ELEMENT, ModellingcorePackage.Literals.ABSTRACT_TRACE__TARGET_ELEMENT);
    defineAssociationClass(CapellacorePackage.Literals.INVOLVEMENT__INVOLVER, CapellacorePackage.Literals.INVOLVEMENT__INVOLVED);
    defineAssociationClass(CapellacorePackage.Literals.GENERALIZATION__SUB, CapellacorePackage.Literals.GENERALIZATION__SUPER);
    defineAssociationClass(CtxPackage.Literals.CAPABILITY_EXPLOITATION__MISSION, CtxPackage.Literals.CAPABILITY_EXPLOITATION__CAPABILITY);    
    defineAssociationClass(CsPackage.Literals.ABSTRACT_DEPLOYMENT_LINK__LOCATION, CsPackage.Literals.ABSTRACT_DEPLOYMENT_LINK__DEPLOYED_ELEMENT);

    setAssociationClass(FaPackage.Literals.FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES, FaPackage.Literals.FUNCTIONAL_EXCHANGE_REALIZATION);
    setAssociationClass(FaPackage.Literals.COMPONENT_PORT__ALLOCATED_FUNCTION_PORTS,InformationPackage.Literals.PORT_ALLOCATION);
    setAssociationClass(FaPackage.Literals.COMPONENT_PORT__REALIZED_COMPONENT_PORTS, InformationPackage.Literals.PORT_REALIZATION);
    setAssociationClass(FaPackage.Literals.FUNCTION_PORT__REALIZED_FUNCTION_PORTS, InformationPackage.Literals.PORT_REALIZATION);
    setAssociationClass(CsPackage.Literals.PHYSICAL_PORT__REALIZED_PHYSICAL_PORTS, InformationPackage.Literals.PORT_REALIZATION);
    setAssociationClass(CsPackage.Literals.COMPONENT__USED_INTERFACES, CsPackage.Literals.INTERFACE_USE);
    setAssociationClass(CsPackage.Literals.COMPONENT__IMPLEMENTED_INTERFACES, CsPackage.Literals.INTERFACE_IMPLEMENTATION);
    setAssociationClass(CsPackage.Literals.PHYSICAL_PATH__REALIZED_PHYSICAL_PATHS, CsPackage.Literals.PHYSICAL_PATH_REALIZATION);
    setAssociationClass(CsPackage.Literals.PHYSICAL_LINK__REALIZED_PHYSICAL_LINKS, CsPackage.Literals.PHYSICAL_LINK_REALIZATION);
    setAssociationClass(CsPackage.Literals.INTERFACE__REALIZED_LOGICAL_INTERFACES, PaPackage.Literals.LOGICAL_INTERFACE_REALIZATION);
    setAssociationClass(CsPackage.Literals.INTERFACE__REALIZED_CONTEXT_INTERFACES, LaPackage.Literals.CONTEXT_INTERFACE_REALIZATION);
    
    //setAssociationClass(CsPackage.Literals.INTERFACE__EXCHANGE_ITEMS, CsPackage.Literals.EXCHANGE_ITEM_ALLOCATION);
    setAssociationClass(FaPackage.Literals.FUNCTIONAL_CHAIN__REALIZED_FUNCTIONAL_CHAINS, FaPackage.Literals.FUNCTIONAL_CHAIN_REALIZATION);
    setHoldingFeature(FaPackage.Literals.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED_ELEMENT, CapellacorePackage.Literals.INVOLVEMENT__INVOLVED);
    
    setAssociationClass(FaPackage.Literals.COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES, FaPackage.Literals.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION);
    setAssociationClass(FaPackage.Literals.COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES, FaPackage.Literals.COMPONENT_EXCHANGE_REALIZATION);
    setAssociationClass(FaPackage.Literals.COMPONENT_EXCHANGE_ALLOCATOR__ALLOCATED_COMPONENT_EXCHANGES, FaPackage.Literals.COMPONENT_EXCHANGE_ALLOCATION);
    
    setAssociationClass(CapellacorePackage.Literals.GENERALIZABLE_ELEMENT__SUPER, CapellacorePackage.Literals.GENERALIZATION);
    
    setAssociationClass(InformationPackage.Literals.CLASS__REALIZED_CLASSES, InformationPackage.Literals.INFORMATION_REALIZATION);
    setAssociationClass(InformationPackage.Literals.EXCHANGE_ITEM__REALIZED_EXCHANGE_ITEMS, InformationPackage.Literals.INFORMATION_REALIZATION);
    setAssociationClass(DatatypePackage.Literals.DATA_TYPE__REALIZED_DATA_TYPES, InformationPackage.Literals.INFORMATION_REALIZATION);
    
    setAssociationClass(InteractionPackage.Literals.ABSTRACT_CAPABILITY__INVOLVED_ABSTRACT_FUNCTIONS, InteractionPackage.Literals.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT);
    setAssociationClass(InteractionPackage.Literals.ABSTRACT_CAPABILITY__INVOLVED_FUNCTIONAL_CHAINS, InteractionPackage.Literals.FUNCTIONAL_CHAIN_ABSTRACT_CAPABILITY_INVOLVEMENT);
    setAssociationClass(InteractionPackage.Literals.ABSTRACT_CAPABILITY__SUPER, InteractionPackage.Literals.ABSTRACT_CAPABILITY_GENERALIZATION);
    setAssociationClass(InteractionPackage.Literals.ABSTRACT_CAPABILITY__INCLUDED_ABSTRACT_CAPABILITIES, InteractionPackage.Literals.ABSTRACT_CAPABILITY_INCLUDE);
    setAssociationClass(InteractionPackage.Literals.ABSTRACT_CAPABILITY__EXTENDED_ABSTRACT_CAPABILITIES, InteractionPackage.Literals.ABSTRACT_CAPABILITY_EXTEND);
    setAssociationClass(InteractionPackage.Literals.SCENARIO__REALIZED_SCENARIOS, InteractionPackage.Literals.SCENARIO_REALIZATION);
    
    
    setAssociationClass(CtxPackage.Literals.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSES, CtxPackage.Literals.OPERATIONAL_ANALYSIS_REALIZATION);
    setAssociationClass(CtxPackage.Literals.SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES, FaPackage.Literals.FUNCTION_REALIZATION);
    setAssociationClass(CtxPackage.Literals.SYSTEM__ALLOCATED_SYSTEM_FUNCTIONS, FaPackage.Literals.COMPONENT_FUNCTIONAL_ALLOCATION);
    setAssociationClass(CtxPackage.Literals.ACTOR__ALLOCATED_SYSTEM_FUNCTIONS, FaPackage.Literals.COMPONENT_FUNCTIONAL_ALLOCATION);
    setAssociationClass(CtxPackage.Literals.SYSTEM__REALIZED_ENTITIES, CtxPackage.Literals.OPERATIONAL_ENTITY_REALIZATION);
    
    // FIXME these two get in the way of each other, see also EGF-231
    setAssociationClass(CtxPackage.Literals.ACTOR__REALIZED_OPERATIONAL_ACTORS, CtxPackage.Literals.OPERATIONAL_ACTOR_REALIZATION);
    setAssociationClass(CtxPackage.Literals.ACTOR__REALIZED_ENTITIES, CtxPackage.Literals.OPERATIONAL_ENTITY_REALIZATION);
    //
    
    setAssociationClass(CtxPackage.Literals.MISSION__EXPLOITED_CAPABILITIES, CtxPackage.Literals.CAPABILITY_EXPLOITATION);
    setAssociationClass(CtxPackage.Literals.MISSION__PARTICIPATING_ACTORS, CtxPackage.Literals.ACTOR_MISSION_INVOLVEMENT);
    setAssociationClass(CtxPackage.Literals.MISSION__PARTICIPATING_SYSTEM, CtxPackage.Literals.SYSTEM_MISSION_INVOLVEMENT);
    setAssociationClass(CtxPackage.Literals.CAPABILITY__PARTICIPATING_ACTORS, CtxPackage.Literals.ACTOR_CAPABILITY_INVOLVEMENT);
    setAssociationClass(CtxPackage.Literals.CAPABILITY__PARTICIPATING_SYSTEM, CtxPackage.Literals.SYSTEM_CAPABILITY_INVOLVEMENT);
    setAssociationClass(CtxPackage.Literals.CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES, InteractionPackage.Literals.ABSTRACT_CAPABILITY_REALIZATION);
    
    setAssociationClass(CsPackage.Literals.PART__DEPLOYED_PARTS, DeploymentPackage.Literals.PART_DEPLOYMENT_LINK);
    setAssociationClass(CsPackage.Literals.PHYSICAL_PORT__ALLOCATED_COMPONENT_PORTS, FaPackage.Literals.COMPONENT_PORT_ALLOCATION);
    setAssociationClass(CsPackage.Literals.PHYSICAL_PORT__REALIZED_PHYSICAL_PORTS, CsPackage.Literals.PHYSICAL_PORT_REALIZATION);
    
    setAssociationClass(LaPackage.Literals.LOGICAL_COMPONENT__ALLOCATED_LOGICAL_FUNCTIONS, FaPackage.Literals.COMPONENT_FUNCTIONAL_ALLOCATION);
    
    
    setAssociationClass(LaPackage.Literals.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES, LaPackage.Literals.SYSTEM_ANALYSIS_REALIZATION);
    setAssociationClass(LaPackage.Literals.CAPABILITY_REALIZATION__PARTICIPATING_SYSTEM_COMPONENTS, CsPackage.Literals.SYSTEM_COMPONENT_CAPABILITY_REALIZATION_INVOLVEMENT);
    setAssociationClass(LaPackage.Literals.CAPABILITY_REALIZATION__PARTICIPATING_ACTORS, CsPackage.Literals.ACTOR_CAPABILITY_REALIZATION_INVOLVEMENT);
    setAssociationClass(LaPackage.Literals.LOGICAL_ACTOR__REALIZED_SYSTEM_ACTORS, LaPackage.Literals.SYSTEM_ACTOR_REALIZATION);
    setAssociationClass(LaPackage.Literals.LOGICAL_ACTOR__ALLOCATED_LOGICAL_FUNCTIONS, FaPackage.Literals.COMPONENT_FUNCTIONAL_ALLOCATION);
    
    setAssociationClass(LaPackage.Literals.LOGICAL_COMPONENT__REALIZED_SYSTEMS, LaPackage.Literals.SYSTEM_REALIZATION);
    setAssociationClass(LaPackage.Literals.LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS, FaPackage.Literals.FUNCTION_REALIZATION);
    setAssociationClass(LaPackage.Literals.CAPABILITY_REALIZATION__REALIZED_CAPABILITIES, InteractionPackage.Literals.ABSTRACT_CAPABILITY_REALIZATION);
    setAssociationClass(LaPackage.Literals.CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS, InteractionPackage.Literals.ABSTRACT_CAPABILITY_REALIZATION);
    
    
//    setHoldingFeature(PaPackage.Literals.PHYSICAL_LINK__SOURCE_PHYSICAL_PORT, PaPackage.Literals.PHYSICAL_LINK__LINK_ENDS);
//    setHoldingFeature(PaPackage.Literals.PHYSICAL_LINK__TARGET_PHYSICAL_PORT, PaPackage.Literals.PHYSICAL_LINK__LINK_ENDS);
    setAssociationClass(PaPackage.Literals.PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS, PaPackage.Literals.LOGICAL_COMPONENT_REALIZATION);
    setAssociationClass(PaPackage.Literals.PHYSICAL_ACTOR__REALIZED_LOGICAL_ACTORS, PaPackage.Literals.LOGICAL_ACTOR_REALIZATION);
    setAssociationClass(PaPackage.Literals.PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS, FaPackage.Literals.COMPONENT_FUNCTIONAL_ALLOCATION);
    setAssociationClass(PaPackage.Literals.PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS, FaPackage.Literals.FUNCTION_REALIZATION);
    setAssociationClass(PaPackage.Literals.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES, PaPackage.Literals.LOGICAL_ARCHITECTURE_REALIZATION);
    setAssociationClass(PaPackage.Literals.PHYSICAL_ACTOR__ALLOCATED_PHYSICAL_FUNCTIONS, FaPackage.Literals.COMPONENT_FUNCTIONAL_ALLOCATION);
    
    setAssociationClass(EpbsPackage.Literals.EPBS_ARCHITECTURE__ALLOCATED_PHYSICAL_ARCHITECTURES, EpbsPackage.Literals.PHYSICAL_ARCHITECTURE_REALIZATION);
    setAssociationClass(EpbsPackage.Literals.CONFIGURATION_ITEM__ALLOCATED_PHYSICAL_ARTIFACTS, EpbsPackage.Literals.PHYSICAL_ARTIFACT_REALIZATION);
  
    setAssociationClass(CapellacommonPackage.Literals.STATE_TRANSITION__REALIZED_STATE_TRANSITIONS, CapellacommonPackage.Literals.STATE_TRANSITION_REALIZATION);
    setAssociationClass(CapellacommonPackage.Literals.ABSTRACT_STATE__REALIZED_ABSTRACT_STATES, CapellacommonPackage.Literals.ABSTRACT_STATE_REALIZATION);
  }

  /**
   * @param abstractTraceSourceElement_p
   * @param abstractTraceTargetElement_p
   */
  @Override
  public void defineAssociationClass(EReference left, EReference right) {
    EClass c1 = left.getEContainingClass();
    EClass c2 = right.getEContainingClass();
    if (c1 != c2){
      throw new IllegalArgumentException("Both features must be defined on the same class");
    }
    EAnnotation annotation = associationClassMetaData.getAnnotation(c1, true);
    annotation.getReferences().add(left);
    annotation.getReferences().add(right);
  }

  @Override
  public EReference getLeft(EClass associationClass){
    return getReference(associationClass, 0);
  }
  
  @Override
  public EReference getRight(EClass associationClass){
    return getReference(associationClass, 1);
  }
  
  private EReference getReference(EClass associationClass, int index){
    Deque<EClass> deque = new ArrayDeque<EClass>(Collections.singleton(associationClass)); 
    while (!deque.isEmpty()){
      EClass top = deque.removeFirst();
      EAnnotation annotation = associationClassMetaData.getAnnotation(top, false);
      if (annotation != null){
        return (EReference) annotation.getReferences().get(index);
      }
      deque.addAll(top.getEAllSuperTypes());
    }
    throw new IllegalArgumentException("Not an association class: " + associationClass.getName());
  }
  
  /**
   * 
   */
  public BasicCapellaDerivedFeatureMetaData() {
    this(null);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public EClass getAssociationClass(EReference reference_p) {
    EAnnotation ann = derivedMetaData.getAnnotation(reference_p, false);  
    if (ann != null && ann.getReferences().size() == 1 && ann.getReferences().get(0) instanceof EClass){
      return (EClass) ann.getReferences().get(0);
    }
    return null;
  }
  
  @Override
  public void setAssociationClass(EReference reference_p, EClass associationClass_p){
    EAnnotation ann = derivedMetaData.getAnnotation(reference_p, true);
    ann.getReferences().clear();
    ann.getReferences().add(associationClass_p);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public EStructuralFeature getHoldingFeature(EStructuralFeature feature_p) {
    
    EAnnotation ann = derivedMetaData.getAnnotation(feature_p, false);
    if (ann != null && ann.getReferences().size() == 1 && ann.getReferences().get(0) instanceof EStructuralFeature){
      return (EStructuralFeature) ann.getReferences().get(0);
    }
    
    // the simplified metamodel annotations also store information on derived elements,
    // but in a different annotation. TODO move this over
    ann = feature_p.getEAnnotation(SimplifiedCapellaMetadata.SOURCE_SEMANTIC);
    if (ann != null){
      String containmentValue =ann.getDetails().get(SimplifiedCapellaMetadata.KEY_DETAILS_FEATURE);
      if (containmentValue != null){
        return feature_p.getEContainingClass().getEStructuralFeature(containmentValue);
      }
    }
    return null;
  }

  @Override
  public void setHoldingFeature(EStructuralFeature feature_p, EStructuralFeature holdingFeature_p){
    EAnnotation ann = derivedMetaData.getAnnotation(feature_p, true);
    ann.getReferences().clear();
    ann.getReferences().add(holdingFeature_p);
  }


}
 
