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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.diffmerge.api.scopes.IFeaturedModelScope;
import org.eclipse.emf.diffmerge.api.scopes.IModelScope;
import org.eclipse.emf.diffmerge.impl.policies.DefaultMatchPolicy;
import org.eclipse.emf.diffmerge.util.ModelImplUtil;
import org.eclipse.emf.diffmerge.util.structures.comparable.ComparableLinkedList;
import org.eclipse.emf.diffmerge.util.structures.comparable.IComparableStructure;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * A multi-criteria match policy that supports the computation of the match ID
 * of certain elements according to the match ID of other elements.
 */
public class MultiCriteriaMatchPolicy extends DefaultMatchPolicy {

  /**
   * A predefined set of criteria for matching.
   */
  public static enum MatchCriterionKind {
    SEMANTICS, STRUCTURE, NAME, INTRINSIC_ID, EXTRINSIC_ID
  }

  /** The set of match criteria to use */
  private final Set<MatchCriterionKind> _selectedCriteria;

  /**
   * Constructor
   */
  public MultiCriteriaMatchPolicy() {
    _selectedCriteria = new HashSet<MatchCriterionKind>(MatchCriterionKind.values().length);
    _selectedCriteria.addAll(getDefaultCriteria());
  }

  /**
   * Return the set of applicable match criteria in decreasing priority
   * @return a non-null collection
   */
  public Collection<MatchCriterionKind> getApplicableCriteria() {
    return Arrays.asList(MatchCriterionKind.STRUCTURE, MatchCriterionKind.NAME, MatchCriterionKind.INTRINSIC_ID, MatchCriterionKind.EXTRINSIC_ID);
  }

  /**
   * Return a match ID for the given element from the given scope
   * based on the ID of its container and the given match criterion
   * @param element_p a non-null element
   * @param scope_p a non-null scope that covers the element
   * @param inScopeOnly_p whether only the scope may be considered, or the underlying EMF model
   * @param criterion_p a match criterion which is NAME or STRUCTURE
   * @return a potentially null object
   */
  protected ComparableLinkedList<String> getContainerRelativeID(EObject element_p, IModelScope scope_p, boolean inScopeOnly_p, MatchCriterionKind criterion_p) {
    String lastIDPart;
    if (criterion_p == MatchCriterionKind.STRUCTURE) {
      lastIDPart = getStructureMatchIDPart(element_p, scope_p, inScopeOnly_p);
    } else {
      lastIDPart = getUniqueName(element_p, scope_p, inScopeOnly_p);
    }
    ComparableLinkedList<String> result = getContainerRelativeID(element_p, scope_p, inScopeOnly_p, lastIDPart);
    return result;
  }

  /**
   * Return a match ID for the given element form the given scope
   * based on the ID of its container and the given ID suffix
   * @param element_p a non-null element
   * @param scope_p a non-null scope that covers the element
   * @param inScopeOnly_p whether only the scope may be considered, or the underlying EMF model
   * @param idSuffix_p a potentially null suffix for the ID that identifies the element within its container
   * @return a potentially null object
   */
  @SuppressWarnings("unchecked")
  protected ComparableLinkedList<String> getContainerRelativeID(EObject element_p, IModelScope scope_p, boolean inScopeOnly_p, String idSuffix_p) {
    ComparableLinkedList<String> result = null;
    if (idSuffix_p != null) {
      EObject container = getContainer(element_p, scope_p, inScopeOnly_p);
      if (container != null) {
        Object containerID = getMatchID(container, scope_p);
        if (containerID instanceof ComparableLinkedList<?>) {
          result = (ComparableLinkedList<String>) containerID;
          result.add(idSuffix_p);
        } else if (containerID instanceof String) {
          result = new ComparableLinkedList<String>();
          result.add((String) containerID);
          result.add(idSuffix_p);
        }
      } else {
        // Root
        result = new ComparableLinkedList<String>();
        result.add(idSuffix_p);
      }
    }
    return result;
  }

  /**
   * Return the container of the given element within the given scope
   * @param element_p a non-null element
   * @param scope_p a non-null scope
   * @param inScopeOnly_p whether only the scope may be considered, or the underlying EMF model
   * @return a potentially null reference
   */
  protected EObject getContainer(EObject element_p, IModelScope scope_p, boolean inScopeOnly_p) {
    EObject result;
    if (inScopeOnly_p) {
      if (scope_p instanceof IFeaturedModelScope) {
        result = ((IFeaturedModelScope) scope_p).getContainer(element_p);
      } else {
        result = null;
      }
    } else {
      result = element_p.eContainer();
    }
    return result;
  }

  /**
   * Return the containment reference of the given element within the given scope
   * @param element_p a non-null element
   * @param scope_p a non-null scope
   * @param inScopeOnly_p whether only the scope may be considered, or the underlying EMF model
   * @return a potentially null reference
   */
  protected EReference getContainment(EObject element_p, IModelScope scope_p, boolean inScopeOnly_p) {
    EReference result;
    if (inScopeOnly_p) {
      if (scope_p instanceof IFeaturedModelScope) {
        result = ((IFeaturedModelScope) scope_p).getContainment(element_p);
      } else {
        result = null;
      }
    } else {
      result = element_p.eContainmentFeature();
    }
    return result;
  }

  /**
   * Return the set of default match criteria among the applicable ones
   * @return a non-null collection
   */
  public Collection<MatchCriterionKind> getDefaultCriteria() {
    return Arrays.asList(MatchCriterionKind.INTRINSIC_ID);
  }

  /**
   * Return the given object within a comparable structure, or null if the object is null
   * @param <T> the type of the given object
   * @param object_p a potentially null object
   * @return a potentially null comparable structure
   */
  protected <T extends Comparable<T>> ComparableLinkedList<T> getEncapsulateOrNull(T object_p) {
    ComparableLinkedList<T> result = null;
    if (object_p != null) {
      result = new ComparableLinkedList<T>();
      result.add(object_p);
    }
    return result;
  }

  /**
   * @see org.eclipse.emf.diffmerge.impl.policies.DefaultMatchPolicy#getExtrinsicID(org.eclipse.emf.ecore.EObject, org.eclipse.emf.diffmerge.api.scopes.IModelScope)
   */
  @Override
  protected String getExtrinsicID(EObject element_p, IModelScope scope_p) {
    return ModelImplUtil.getXMLID(element_p);
  }

  /**
   * @see org.eclipse.emf.diffmerge.impl.policies.DefaultMatchPolicy#getMatchID(org.eclipse.emf.ecore.EObject, org.eclipse.emf.diffmerge.api.scopes.IModelScope)
   */
  @Override
  public IComparableStructure<?> getMatchID(EObject element_p, IModelScope scope_p) {
    // Intended return types: IComparableStructure<String>,
    //  ComparableTreeMap<String, IComparableStructure<String>>
    IComparableStructure<?> result = null;
    Iterator<MatchCriterionKind> it = getApplicableCriteria().iterator();
    while ((result == null) && it.hasNext()) {
      MatchCriterionKind criterion = it.next();
      if (useMatchCriterion(criterion)) {
        result = getMatchID(element_p, scope_p, criterion);
      }
    }
    return result;
  }

  /**
   * Return a match ID for the given element from the given scope according
   * to the given criterion
   * @param element_p a non-null element
   * @param scope_p a non-null scope
   * @param criterion_p a non-null criterion
   * @return a potentially null object
   */
  public IComparableStructure<?> getMatchID(EObject element_p, IModelScope scope_p, MatchCriterionKind criterion_p) {
    IComparableStructure<?> result;
    switch (criterion_p) {
      case EXTRINSIC_ID:
        result = getEncapsulateOrNull(getExtrinsicID(element_p, scope_p));
      break;
      case INTRINSIC_ID:
        result = getEncapsulateOrNull(getIntrinsicID(element_p));
      break;
      case NAME:
      case STRUCTURE:
        result = getContainerRelativeID(element_p, scope_p, isScopeOnly(), criterion_p);
      break;
      default:
        result = getSemanticID(element_p, scope_p, isScopeOnly());
      break;
    }
    return result;
  }

  /**
   * Return the name of the given element, unique within the container if possible
   * @param element_p a non-null element
   * @param scope_p a non-null scope that covers the element
   * @param inScopeOnly_p whether only the scope should be considered or the underlying EMF model
   * @return a potentially null object
   */
  protected String getUniqueName(EObject element_p, IModelScope scope_p, boolean inScopeOnly_p) {
    String result = null;
    if (element_p instanceof ENamedElement) {
      result = ((ENamedElement) element_p).getName();
    }
    return result;
  }

  /**
   * Return a semantic-based match ID for the given element from the given scope
   * @param element_p a non-null element
   * @param scope_p a non-null scope that covers the element
   * @param inScopeOnly_p whether only the scope should be considered or the underlying EMF model
   * @return a potentially null object
   */
  protected IComparableStructure<?> getSemanticID(EObject element_p, IModelScope scope_p, boolean inScopeOnly_p) {
    return null;
  }

  /**
   * Return a match ID suffix for the given element which is relative to the match ID
   * of the container and made specific thanks to the structurally unique position of the
   * element in its container
   * Precondition: isStructurallyUniqueInContainer(element_p, scope_p, in)
   * @param element_p a non-null element
   * @param scope_p a non-null scope to which the element belongs
   * @param inScopeOnly_p whether only the scope should be considered or the underlying EMF model
   */
  protected String getStructureMatchIDPart(EObject element_p, IModelScope scope_p, boolean inScopeOnly_p) {
    String result = null;
    EReference containment = getContainment(element_p, scope_p, inScopeOnly_p);
    if ((containment != null) && isDiscriminatingContainment(element_p, containment)) {
      result = getStructureReferenceIDPart(element_p, containment);
    } else if (isUniqueRootOfItsType(element_p, scope_p, inScopeOnly_p)) {
      result = getStructureRootIDPart(element_p);
    }
    return result;
  }

  /**
   * Return a structural match ID suffix for the given element which is relative to
   * the given reference to the element
   * @param element_p a non-null element
   * @param containment_p a non-null reference
   */
  protected String getStructureReferenceIDPart(EObject element_p, EReference containment_p) {
    String result = "::" + containment_p.getName(); //$NON-NLS-1$
    return result;
  }

  /**
   * Return a structural match ID suffix for the given element as a root
   * @param element_p a non-null element
   */
  protected String getStructureRootIDPart(EObject element_p) {
    String result = "root::" + element_p.eClass().getName(); //$NON-NLS-1$
    return result;
  }

  /**
   * Return whether the given containment reference is discriminating enough to uniquely
   * identify the given element as a child
   * @param element_p a non-null element
   * @param containment_p a non-null containment reference
   */
  protected boolean isDiscriminatingContainment(EObject element_p, EReference containment_p) {
    return !containment_p.isMany();
  }

  /**
   * Return whether only the model scope should be considered for building match IDs,
   * or the whole underlying EMF model
   */
  protected boolean isScopeOnly() {
    return true;
  }

  /**
   * Return whether the given element is the only one of its type among those in the given collection
   * @param element_p a non-null element
   * @param collection_p a non-null, potentially empty collection
   */
  protected boolean isUniqueOfItsTypeAmong(EObject element_p, Collection<? extends EObject> collection_p) {
    Iterator<? extends EObject> it = collection_p.iterator();
    EClass type = element_p.eClass();
    boolean isPresent = false, sameType = false;
    while (it.hasNext() && !sameType) {
      EObject root = it.next();
      if (root == element_p) {
        isPresent = true;
      } else {
        if (root.eClass() == type) {
          sameType = true;
        }
      }
    }
    boolean result = isPresent && !sameType;
    return result;
  }

  /**
   * Return whether the given element from the given scope is the only root of its type
   * @param element_p a non-null element
   * @param scope_p a non-null scope to which the element belongs
   * @param inScopeOnly_p whether only the scope may be considered, or the underlying EMF model
   */
  protected boolean isUniqueRootOfItsType(EObject element_p, IModelScope scope_p, boolean inScopeOnly_p) {
    boolean result = false;
    EObject container = getContainer(element_p, scope_p, inScopeOnly_p);
    if (container == null) {
      Resource resource = element_p.eResource();
      Collection<? extends EObject> collection;
      if (inScopeOnly_p || (resource == null)) {
        collection = scope_p.getContents();
      } else {
        collection = resource.getContents();
      }
      result = isUniqueOfItsTypeAmong(element_p, collection);
    }
    return result;
  }

  /**
   * Set whether the given match criterion must be used
   * @param criterion_p a non-null criterion
   * @param use_p whether it must be used
   */
  public void setUseMatchCriterion(MatchCriterionKind criterion_p, boolean use_p) {
    if (use_p) {
      _selectedCriteria.add(criterion_p);
    } else {
      _selectedCriteria.remove(criterion_p);
    }
  }

  /**
   * Return whether the given match criterion is used by this match policy
   * @param criterion_p a non-null criterion
   */
  public boolean useMatchCriterion(MatchCriterionKind criterion_p) {
    return _selectedCriteria.contains(criterion_p);
  }

}
