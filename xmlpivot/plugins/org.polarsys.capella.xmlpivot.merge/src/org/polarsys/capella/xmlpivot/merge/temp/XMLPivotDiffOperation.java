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
package org.polarsys.capella.xmlpivot.merge.temp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.diffmerge.api.IComparison;
import org.eclipse.emf.diffmerge.api.IDiffPolicy;
import org.eclipse.emf.diffmerge.api.IMatch;
import org.eclipse.emf.diffmerge.api.IMergePolicy;
import org.eclipse.emf.diffmerge.api.Role;
import org.eclipse.emf.diffmerge.api.diff.IAttributeValuePresence;
import org.eclipse.emf.diffmerge.api.diff.IDifference;
import org.eclipse.emf.diffmerge.api.diff.IElementPresence;
import org.eclipse.emf.diffmerge.api.scopes.IFeaturedModelScope;
import org.eclipse.emf.diffmerge.diffdata.EMatch;
import org.eclipse.emf.diffmerge.impl.helpers.DiffOperation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.helpers.EcoreUtil2;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.model.semantic.SimplifiedCapellaMetadata;
import org.polarsys.capella.xmlpivot.merge.specification.XMLPivotDiffPolicy;

/**
 * A diff operation for Capella re-import from XML Pivot format.
 */
public class XMLPivotDiffOperation extends DiffOperation {

  /**
   * Constructor based on a comparison with a predefined mapping
   * @param comparison_p a non-null comparison whose mapping is already built
   * @param diffPolicy_p a non-null diff policy
   * @param mergePolicy_p a non-null merge policy
   */
  public XMLPivotDiffOperation(IComparison.Editable comparison_p, IDiffPolicy diffPolicy_p, IMergePolicy mergePolicy_p) {
    // This is necessary but it adds nothing
    super(comparison_p, diffPolicy_p, mergePolicy_p);
  }

  /**
   * Create differences based on the mapping between the model scopes compared
   */
  @Override
  protected void createDifferences() {
    for (IMatch match : getMapping().getContents()) {
      checkProgress();
      if (getCastedDiffPolicy().coverMatch(match)) {
        createTechnicalDifferences(match);
      }
      getMonitor().worked(1);
    }
  }

  /**
   * @see org.eclipse.emf.diffmerge.impl.helpers.DiffOperation#getOrCreateElementPresence(org.eclipse.emf.diffmerge.api.IMatch)
   */
  @Override
  protected IElementPresence getOrCreateElementPresence(IMatch match_p) {
    IElementPresence result = null;
    if (getCastedDiffPolicy().coverMatch(match_p)) {
      assert (match_p != null) && match_p.isPartial();
      result = match_p.getElementPresenceDifference();
      if (result == null) {
        Role presenceRole = match_p.getUncoveredRole().opposite();
        IMatch ownerMatch = getComparison().getContainerOf(match_p, presenceRole);
        if (ownerMatch instanceof EMatch) {
          EObject immediateContainer = ((EMatch) ownerMatch).getReference();
          if (!(immediateContainer instanceof Scenario)) {
            // TODO: Improve performance here: Should check this only in some cases where object is instance of one of {Classes potentially contained in a scenario sub-tree}
            if (EcoreUtil2.getFirstContainer(immediateContainer, org.polarsys.capella.core.data.interaction.InteractionPackage.Literals.SCENARIO) == null) {
              result = getComparison().newElementPresence(match_p, ownerMatch);
              if (getComparison().isThreeWay() && !match_p.coversRole(Role.ANCESTOR)) {
                ((IDifference.Editable) result).markAsDifferentFromAncestor();
              }
              setElementPresenceDependencies(result);
            }
          }
        }
      }
    }
    return result;
  }

  /**
   * Return the diff policy
   * @return a potentially null diff policy
   */
  protected XMLPivotDiffPolicy getCastedDiffPolicy() {
    if (getDiffPolicy() instanceof XMLPivotDiffPolicy) {
      return (XMLPivotDiffPolicy) getDiffPolicy();
    }
    return null;
  }

  /**
   * Create the differences related to the attributes for the given match
   * @param match_p a non-null, non-partial match
   */
  @Override
  protected void createAllAttributeDifferences(IMatch match_p) {
    assert (match_p != null) && !match_p.isPartial();
    EClass eClass = match_p.get(Role.TARGET).eClass();
    for (EAttribute attribute : eClass.getEAllAttributes()) {
      if (getCastedDiffPolicy().coverFeature(match_p, attribute)) {
        createAttributeDifferences(match_p, attribute);
      }
    }
  }

  /**
   * @see org.eclipse.emf.diffmerge.impl.helpers.DiffOperation#createAttributeDifferences(org.eclipse.emf.diffmerge.api.IMatch, org.eclipse.emf.ecore.EAttribute)
   */
  @Override
  protected void createAttributeDifferences(IMatch match_p, EAttribute attribute_p) {
    assert (match_p != null) && !match_p.isPartial() && (attribute_p != null);
    IFeaturedModelScope targetScope = getComparison().getScope(Role.TARGET);
    IFeaturedModelScope referenceScope = getComparison().getScope(Role.REFERENCE);
    EObject target = match_p.get(Role.TARGET);
    EObject reference = match_p.get(Role.REFERENCE);
    List<Object> targetValues = targetScope.get(target, attribute_p);
    List<Object> referenceValues = referenceScope.get(reference, attribute_p);
    List<Object> remainingTargetValues = new ArrayList<Object>(targetValues);
    List<Object> remainingReferenceValues = new ArrayList<Object>(referenceValues);
    boolean checkOrder = attribute_p.isMany() && getCastedDiffPolicy().considerOrdered(attribute_p);
    int maxIndex = -1;
    for (Object targetValue : targetValues) {
      ObjectAndIndex matchingReferenceValue = findEqualAttributeValue(target, reference, //!!!!HERE
          attribute_p, targetValue, remainingReferenceValues);
      if (matchingReferenceValue.getObject() != null) {
        if (checkOrder) {
          if (matchingReferenceValue.getIndex() < maxIndex) {
            // Ordering difference
            createAttributeOrderDifference(match_p, attribute_p, targetValue, matchingReferenceValue.getObject());
            checkOrder = false;
          } else {
            maxIndex = matchingReferenceValue.getIndex();
          }
        }
        remainingTargetValues.remove(targetValue);
        remainingReferenceValues.remove(matchingReferenceValue.getObject());
      }
    }
    for (Object remainingTargetValue : remainingTargetValues) {
      if (getCastedDiffPolicy().coverValue(remainingTargetValue, attribute_p)) {
        createAttributeValueDifference(match_p, attribute_p, remainingTargetValue, Role.TARGET, false);
      }
    }
    for (Object remainingReferenceValue : remainingReferenceValues) {
      if (getCastedDiffPolicy().coverValue(remainingReferenceValue, attribute_p)) {
        createAttributeValueDifference(match_p, attribute_p, remainingReferenceValue, Role.REFERENCE, false);
      }
    }
  }

  /**
   * @see org.eclipse.emf.diffmerge.impl.helpers.DiffOperation#setThreeWayProperties(org.eclipse.emf.diffmerge.api.diff.IAttributeValuePresence)
   */
  @Override
  protected void setThreeWayProperties(IAttributeValuePresence presence_p) {
    EObject ancestorHolder = presence_p.getElementMatch().get(Role.ANCESTOR);
    if (ancestorHolder != null) {
      EAttribute attribute = presence_p.getFeature();
      IFeaturedModelScope ancestorScope = getComparison().getScope(Role.ANCESTOR);
      assert ancestorScope != null; // Thanks to call context
      List<Object> valuesInAncestor = ancestorScope.get(ancestorHolder, attribute);
      boolean aligned;
      if (presence_p.isOrder()) {
        Role presenceRole = presence_p.getPresenceRole();
        List<Object> values = getComparison().getScope(presenceRole).get(presence_p.getElementMatch().get(presenceRole), presence_p.getFeature());
        int maxIndex = -1;
        aligned = true;
        for (Object value : values) {
          ObjectAndIndex matchingAncestorValue = findEqualAttributeValue(presence_p.getElementMatch().get(presenceRole), ancestorHolder, //!!!!HERE
              attribute, value, valuesInAncestor);
          if (matchingAncestorValue.getObject() != null) {
            if (matchingAncestorValue.getIndex() < maxIndex) {
              // Ordering difference
              aligned = false;
              break;
            }
            maxIndex = matchingAncestorValue.getIndex();
          }
        }
      } else {
        ObjectAndIndex equalInAncestor = findEqualAttributeValue(presence_p.getElementMatch().get(presence_p.getPresenceRole()), ancestorHolder, //!!!!HERE
            attribute, presence_p.getValue(), valuesInAncestor);
        aligned = equalInAncestor.getObject() != null;
      }
      if (!aligned) {
        // Not aligned with ancestor
        IAttributeValuePresence symmetrical = presence_p.getSymmetrical();
        if ((symmetrical != null) && !symmetrical.isAlignedWithAncestor()) {
          // Symmetrical is not aligned either: mark both as conflicting
          ((IDifference.Editable) presence_p).markAsConflicting();
          ((IDifference.Editable) symmetrical).markAsConflicting();
        } else {
          // No symmetrical or symmetrical aligned: just mark diff as not aligned
          ((IDifference.Editable) presence_p).markAsDifferentFromAncestor();
        }
      }
    }
  }

  /**
   * @see org.eclipse.emf.diffmerge.impl.helpers.DiffOperation#findEqualAttributeValue(org.eclipse.emf.ecore.EAttribute, java.lang.Object, java.util.Collection)
   */
  protected ObjectAndIndex findEqualAttributeValue(EObject holder1_p, EObject holder2_p, EAttribute attribute_p, Object value_p,
      Collection<? extends Object> candidates_p) {
    int i = 0;
    for (Object candidate : candidates_p) {
      if (considerEqual(holder1_p, holder2_p, value_p, candidate, attribute_p)) {
        return new ObjectAndIndex(candidate, i);
      }
      i++;
    }
    return new ObjectAndIndex();
  }

  /**
   * Return whether the given attribute values must be considered equal
   * @param holder1_p the first non-null element holding the first value
   * @param holder2_p the second non-null element holding the second value
   * @param value1_p the first non-null attribute value
   * @param value2_p the second non-null attribute value
   * @param attribute_p the optional attribute concerned
   */
  protected boolean considerEqual(EObject holder1_p, EObject holder2_p, Object value1_p, Object value2_p, EAttribute attribute_p) {
    if (SimplifiedCapellaMetadata.INSTANCE.isSemantic(holder1_p.eClass()) && SimplifiedCapellaMetadata.INSTANCE.isSemantic((holder2_p).eClass())) {
      return getCastedDiffPolicy().considerEqual(value1_p, value2_p, attribute_p);
    }
    return true;
  }
}
