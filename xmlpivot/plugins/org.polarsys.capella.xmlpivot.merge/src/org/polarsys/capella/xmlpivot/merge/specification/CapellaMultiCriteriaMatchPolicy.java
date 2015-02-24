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
package org.polarsys.capella.xmlpivot.merge.specification;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.diffmerge.api.scopes.IModelScope;
import org.eclipse.emf.diffmerge.util.structures.comparable.ComparableLinkedList;
import org.eclipse.emf.diffmerge.util.structures.comparable.ComparableTreeMap;
import org.eclipse.emf.diffmerge.util.structures.comparable.IComparableStructure;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.common.data.modellingcore.AbstractTrace;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyLiteral;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyType;
import org.polarsys.capella.core.data.capellacore.Generalization;
import org.polarsys.capella.core.data.capellacore.Involvement;
import org.polarsys.capella.core.data.capellacore.KeyValue;
import org.polarsys.capella.core.data.capellacore.ModellingArchitecture;
import org.polarsys.capella.core.data.capellacore.Type;
import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.cs.AbstractDeploymentLink;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.ComponentContext;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.InterfaceImplementation;
import org.polarsys.capella.core.data.cs.InterfaceUse;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.cs.PhysicalPathInvolvement;
import org.polarsys.capella.core.data.ctx.CapabilityExploitation;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.epbs.EpbsPackage;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.FunctionalChainInvolvement;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.information.Property;
import org.polarsys.capella.core.data.information.datavalue.ValuePart;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityExtend;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityGeneralization;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityInclude;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.pa.PaPackage;

/**
 * A multi-criteria match policy for Capella.
 */
public class CapellaMultiCriteriaMatchPolicy extends MultiCriteriaMatchPolicy {

  /** The set of Capella types which may normally have no more than one instance per model */
  protected static Collection<EClass> __UNIQUELY_OCCURRING_TYPES = null;
  
  /**
   * @see org.polarsys.capella.xmlpivot.merge.specification.MultiCriteriaMatchPolicy#getApplicableCriteria()
   */
  @Override
  public Collection<MatchCriterionKind> getApplicableCriteria() {
    return Arrays.asList(MatchCriterionKind.values());
  }

  /**
   * Return a unique name for the given named element which has no naming requirement
   * @param element_p a non-null element
   * @param scope_p a non-null scope that covers element_p
   * @param inScopeOnly_p whether only the scope should be considered or the underlying EMF model
   * @return a potentially null string
   */
  protected String getFreelyNamedElementUniqueName(AbstractNamedElement element_p, IModelScope scope_p, boolean inScopeOnly_p) {
    String result = null;
    if (element_p instanceof FunctionalExchange) {
      // Functional Exchange
      FunctionalExchange casted = (FunctionalExchange) element_p;
      result = getTwoEndedElementUniqueName(casted, casted.getSourceFunctionOutputPort(), casted.getTargetFunctionInputPort(), scope_p, inScopeOnly_p);
    } else if (element_p instanceof ComponentExchange) {
      // Component Exchange
      ComponentExchange casted = (ComponentExchange) element_p;
      result = getTwoEndedElementUniqueName(casted, casted.getSourcePort(), casted.getTargetPort(), scope_p, inScopeOnly_p);
    } else if (element_p instanceof PhysicalLink) {
      // Physical Link
      PhysicalLink casted = (PhysicalLink) element_p;
      result = getTwoEndedElementUniqueName(casted, casted.getSourcePhysicalPort(), casted.getTargetPhysicalPort(), scope_p, inScopeOnly_p);
    }
    return result;
  }

  /**
   * Return an ID based on the semantics of the given element as part of the
   * Capella Project structure, if applicable
   * @param element_p a non-null element
   * @param scope_p a non-null scope that covers element_p
   * @param inScopeOnly_p whether only the scope should be considered or the underlying EMF model
   * @return a potentially null object
   */
  protected IComparableStructure<?> getCapellaProjectStructureSemanticID(EObject element_p, IModelScope scope_p, boolean inScopeOnly_p) {
    IComparableStructure<?> result = null;
    EClass type = element_p.eClass();
    final String PROJECT_STRUCTURE_ID_PREFIX = "capella"; //$NON-NLS-1$
    final ComparableLinkedList<String> list = getEncapsulateOrNull(PROJECT_STRUCTURE_ID_PREFIX);
    if (getUniquelyOccurringTypes().contains(type)) {
      // Unique instance of its structure-related type in the model
      list.add(type.getName());
      result = list;
    } else {
      EObject container = getContainer(element_p, scope_p, inScopeOnly_p);
      if (container instanceof ModellingArchitecture) {
        // Child of Architecture
        EReference containment = getContainment(element_p, scope_p, inScopeOnly_p);
        if ((containment != null) && isDiscriminatingContainment(element_p, containment)) {
          list.add(container.eClass().getName());
          list.add("::" + containment.getName()); //$NON-NLS-1$
          result = list;
        }
      } else if ((container instanceof ComponentContext) && (element_p instanceof Part) && isSystemComponent(((Part) element_p).getType())) {
        // Part of System in ComponentContext
        result = getContainerRelativeID(element_p, scope_p, inScopeOnly_p, "::systemPart"); //$NON-NLS-1$
      }
    }
    return result;
  }

  /**
   * Return whether the given Capella type represents the system
   * @param capellaType_p a non-null element
   */
  protected boolean isSystemComponent(Type capellaType_p) {
    return (capellaType_p instanceof Component) && (capellaType_p.eContainer() instanceof ModellingArchitecture);
  }

  /**
   * Return whether the given element is required to have a unique name, and if so
   * whether it is within its container or solely among its containment siblings
   * @param element_p a non-null element
   * @return a non-null object
   */
  protected UniqueNameRequirementKind getNamingRequirement(AbstractNamedElement element_p) {
    UniqueNameRequirementKind result;
    if ((element_p instanceof FunctionalExchange) || (element_p instanceof ComponentExchange) || (element_p instanceof PhysicalLink) || isTechnical(element_p)) {
      result = UniqueNameRequirementKind.NONE;
    } else if (element_p instanceof Part) {
      result = UniqueNameRequirementKind.IN_CONTAINMENT;
    } else {
      result = UniqueNameRequirementKind.IN_CONTAINER;
    }
    return result;
  }

  protected static enum UniqueNameRequirementKind {
    NONE, IN_CONTAINER, IN_CONTAINMENT
  }

  /**
   * Return a semantic ID for the given element according to the additional two
   * given elements
   * @param element_p a non-null element
   * @param end1_p a potentially null element
   * @param end2_p a potentially null element
   * @param scope_p a non-null scope that covers element_p
   * @param inScopeOnly_p whether only the scope should be considered or the underlying EMF model
   * @return a potentially null string
   */
  @SuppressWarnings("unchecked")
  protected ComparableTreeMap<String, IComparableStructure<String>> getTwoEndedElementSemanticID(EObject element_p, EObject end1_p, EObject end2_p,
      IModelScope scope_p, boolean inScopeOnly_p) {
    ComparableTreeMap<String, IComparableStructure<String>> result = null;
    if ((end1_p != null) && (end2_p != null)) {
      IComparableStructure<?> id1 = getMatchID(end1_p, scope_p);
      if (id1 != null) {
        IComparableStructure<?> id2 = getMatchID(end2_p, scope_p);
        if (id2 != null) {
          // We assume that id1 and id2 are IComparableStructure<String>, i.e.,
          // they do not have a semantic ID
          IComparableStructure<String> typeID = getEncapsulateOrNull(element_p.getClass().getName());
          result = new ComparableTreeMap<String, IComparableStructure<String>>();
          result.put("SEMANTIC_ID_TYPE", typeID); //$NON-NLS-1$
          result.put("SEMANTIC_ID_END1", (IComparableStructure<String>) id1); //$NON-NLS-1$
          result.put("SEMANTIC_ID_END2", (IComparableStructure<String>) id2); //$NON-NLS-1$
        }
      }
    }
    return result;
  }

  /**
   * Return a name for the given element which is characterized by the additional two
   * given elements
   * @param element_p a non-null element
   * @param end1_p a potentially null element
   * @param end2_p a potentially null element
   * @param scope_p a non-null scope that covers element_p
   * @param inScopeOnly_p whether only the scope should be considered or the underlying EMF model
   * @return a potentially null string
   */
  protected String getTwoEndedElementUniqueName(AbstractNamedElement element_p, EObject end1_p, EObject end2_p, IModelScope scope_p, boolean inScopeOnly_p) {
    String result = null;
    if ((end1_p != null) && (end2_p != null)) {
      ComparableLinkedList<String> qname1 = getContainerRelativeID(end1_p, scope_p, inScopeOnly_p, MatchCriterionKind.NAME);
      if (qname1 != null) {
        ComparableLinkedList<String> qname2 = getContainerRelativeID(end2_p, scope_p, inScopeOnly_p, MatchCriterionKind.NAME);
        if (qname2 != null) {
          StringBuilder builder = new StringBuilder();
          String mainName = element_p.getName();
          builder.append(mainName);
          builder.append(" ("); //$NON-NLS-1$
          builder.append(qname1);
          builder.append("->"); //$NON-NLS-1$
          builder.append(qname2);
          builder.append(')');
          result = builder.toString();
        }
      }
    }
    return result;
  }

  /**
   * @see org.polarsys.capella.xmlpivot.merge.specification.MultiCriteriaMatchPolicy#getSemanticID(org.eclipse.emf.ecore.EObject, org.eclipse.emf.diffmerge.api.scopes.IModelScope, boolean)
   */
  @Override
  protected IComparableStructure<?> getSemanticID(EObject element_p, IModelScope scope_p, boolean inScopeOnly_p) {
    // Intended return types: ComparableLinkedList<String>,
    //  ComparableTreeMap<String, ComparableLinkedList<String>>
    IComparableStructure<?> result = null;
    if (isTechnical(element_p)) {
      result = getTechnicalElementSemanticID(element_p, scope_p, inScopeOnly_p);
    } else {
      // Key Value
      result = getCapellaProjectStructureSemanticID(element_p, scope_p, inScopeOnly_p);
    }
    return result;
  }

  /**
   * Return an ID based on the semantics of the given technical element
   * Precondition: isTechnical(element_p)
   * @param element_p a non-null element
   * @param scope_p a non-null scope that covers element_p
   * @param inScopeOnly_p whether only the scope should be considered or the underlying EMF model
   * @return a potentially null object
   */
  protected IComparableStructure<?> getTechnicalElementSemanticID(EObject element_p, IModelScope scope_p, boolean inScopeOnly_p) {
    IComparableStructure<?> result = null;
    if (element_p instanceof AbstractCapabilityGeneralization) {
      AbstractCapabilityGeneralization casted = (AbstractCapabilityGeneralization) element_p;
      result = getTwoEndedElementSemanticID(casted, casted.eContainer(), casted.getSuper(), scope_p, inScopeOnly_p);
    } else if (element_p instanceof AbstractTrace) {
      // Abstract Trace
      AbstractTrace casted = (AbstractTrace) element_p;
      result = getTwoEndedElementSemanticID(casted, casted.getSourceElement(), casted.getTargetElement(), scope_p, inScopeOnly_p);
    } else if (element_p instanceof AbstractDeploymentLink) {
      // Abstract Deployment Link
      AbstractDeploymentLink casted = (AbstractDeploymentLink) element_p;
      result = getTwoEndedElementSemanticID(casted, casted.getDeployedElement(), casted.getLocation(), scope_p, inScopeOnly_p);
    } else if (element_p instanceof Generalization) {
      // Generalization
      Generalization casted = (Generalization) element_p;
      result = getTwoEndedElementSemanticID(casted, casted.getSub(), casted.getSuper(), scope_p, inScopeOnly_p);
    } else if ((element_p instanceof Involvement) && !(element_p instanceof FunctionalChainInvolvement)) {
      // Involvement
      Involvement casted = (Involvement) element_p;
      result = getTwoEndedElementSemanticID(casted, casted.getInvolver(), casted.getInvolved(), scope_p, inScopeOnly_p);
    } else if (element_p instanceof CapabilityExploitation) {
      // Capability Exploitation
      CapabilityExploitation casted = (CapabilityExploitation) element_p;
      result = getTwoEndedElementSemanticID(casted, casted.getCapability(), casted.getMission(), scope_p, inScopeOnly_p);
    } else if (element_p instanceof ValuePart) {
      // Value Part
      Property property = ((ValuePart) element_p).getReferencedProperty();
      if (property != null) {
        result = getContainerRelativeID(element_p, scope_p, inScopeOnly_p, property.getName());
      }
    } else if (element_p instanceof KeyValue) {
      // Key Value
      result = getContainerRelativeID(element_p, scope_p, inScopeOnly_p, ((KeyValue) element_p).getKey());
    } else if (element_p instanceof EnumerationPropertyLiteral) {
      // Enumeration Property Literal
      result = getContainerRelativeID(element_p, scope_p, inScopeOnly_p, ((EnumerationPropertyLiteral) element_p).getName());
    } else if ((element_p instanceof EnumerationPropertyType) && (element_p.eContainer() instanceof Project)) {
      // Enumeration Property Type in Project
      result = getContainerRelativeID(element_p, scope_p, inScopeOnly_p, ((EnumerationPropertyType) element_p).getName());
    } else if (element_p instanceof InterfaceUse) {
      InterfaceUse casted = (InterfaceUse) element_p;
      result = getTwoEndedElementSemanticID(casted, casted.getInterfaceUser(), casted.getUsedInterface(), scope_p, inScopeOnly_p);
    } else if (element_p instanceof InterfaceImplementation) {
      InterfaceImplementation casted = (InterfaceImplementation) element_p;
      result = getTwoEndedElementSemanticID(casted, casted.getInterfaceImplementor(), casted.getImplementedInterface(), scope_p, inScopeOnly_p);
    } else if (element_p instanceof AbstractCapabilityExtend) {
      AbstractCapabilityExtend casted = (AbstractCapabilityExtend) element_p;
      result = getTwoEndedElementSemanticID(casted, casted.getExtension(), casted.getExtended(), scope_p, inScopeOnly_p);
    } else if (element_p instanceof AbstractCapabilityInclude) {
      AbstractCapabilityInclude casted = (AbstractCapabilityInclude) element_p;
      result = getTwoEndedElementSemanticID(casted, casted.getInclusion(), casted.getIncluded(), scope_p, inScopeOnly_p);
    }
    return result;
  }

  /**
   * @see org.polarsys.capella.xmlpivot.merge.specification.MultiCriteriaMatchPolicy#getUniqueName(org.eclipse.emf.ecore.EObject, org.eclipse.emf.diffmerge.api.scopes.IModelScope, boolean)
   */
  @Override
  protected String getUniqueName(EObject element_p, IModelScope scope_p, boolean inScopeOnly_p) {
    String result = null;
    if (element_p instanceof AbstractNamedElement) {
      AbstractNamedElement namedElement = (AbstractNamedElement) element_p;
      String rawName = namedElement.getName();
      UniqueNameRequirementKind req = getNamingRequirement(namedElement);
      if (req == UniqueNameRequirementKind.IN_CONTAINER) {
        // Name is unique: use it
        result = rawName;
      } else if (req == UniqueNameRequirementKind.IN_CONTAINMENT) {
        // Name is unique for its containment: use it and the containment
        EReference containment = getContainment(element_p, scope_p, inScopeOnly_p);
        if (containment != null) {
          result = containment.getName() + ":" + rawName; //$NON-NLS-1$
        }
      } else {
        // No name uniqueness requirement
        result = getFreelyNamedElementUniqueName(namedElement, scope_p, inScopeOnly_p);
      }
    }
    if (result == null) {
      result = super.getUniqueName(element_p, scope_p, inScopeOnly_p);
    }
    return result;
  }

  /**
   * Return the set of Capella types which may normally have no more than one instance per model
   * @return a non-null collection
   */
  protected Collection<EClass> getUniquelyOccurringTypes() {
    if (__UNIQUELY_OCCURRING_TYPES == null) {
      __UNIQUELY_OCCURRING_TYPES =
          Arrays.asList(
              // Project roots
              CapellamodellerPackage.eINSTANCE.getProject(),
              CapellamodellerPackage.eINSTANCE.getSystemEngineering(),
              // Architectures
              OaPackage.eINSTANCE.getOperationalAnalysis(), CtxPackage.eINSTANCE.getSystemAnalysis(), LaPackage.eINSTANCE.getLogicalArchitecture(),
              PaPackage.eINSTANCE.getPhysicalArchitecture(), EpbsPackage.eINSTANCE.getEPBSArchitecture(),
              // Contexts
              OaPackage.eINSTANCE.getOperationalContext(), CtxPackage.eINSTANCE.getSystemContext(), LaPackage.eINSTANCE.getLogicalContext(),
              PaPackage.eINSTANCE.getPhysicalContext(), EpbsPackage.eINSTANCE.getEPBSContext());
    }
    return __UNIQUELY_OCCURRING_TYPES;
  }

  /**
   * @see org.polarsys.capella.xmlpivot.merge.specification.MultiCriteriaMatchPolicy#isDiscriminatingContainment(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference)
   */
  @Override
  protected boolean isDiscriminatingContainment(EObject element_p, EReference containment_p) {
    return ((element_p instanceof SystemEngineering) && (CapellamodellerPackage.eINSTANCE.getProject_OwnedModelRoots() == containment_p))
           || ((containment_p == CsPackage.eINSTANCE.getBlockArchitecture_OwnedRequirementPkgs()) && (((BlockArchitecture) element_p.eContainer())
               .getOwnedRequirementPkgs().size() == 1)) || super.isDiscriminatingContainment(element_p, containment_p);
  }

  /**
   * Return whether the given element is considered technical
   * @param element_p a non-null element
   */
  protected boolean isTechnical(EObject element_p) {
    return (element_p instanceof AbstractCapabilityGeneralization) || (element_p instanceof AbstractTrace) || (element_p instanceof AbstractDeploymentLink)
           || (element_p instanceof Generalization)
           || ((element_p instanceof Involvement) && !(element_p instanceof FunctionalChainInvolvement) && !(element_p instanceof PhysicalPathInvolvement))
           || (element_p instanceof CapabilityExploitation) || (element_p instanceof ValuePart) || (element_p instanceof KeyValue)
           || (element_p instanceof EnumerationPropertyLiteral)
           || ((element_p instanceof EnumerationPropertyType) && (element_p.eContainer() instanceof Project)) || (element_p instanceof InterfaceUse)
           || (element_p instanceof InterfaceImplementation) || (element_p instanceof AbstractCapabilityExtend)
           || (element_p instanceof AbstractCapabilityInclude);
  }

}
