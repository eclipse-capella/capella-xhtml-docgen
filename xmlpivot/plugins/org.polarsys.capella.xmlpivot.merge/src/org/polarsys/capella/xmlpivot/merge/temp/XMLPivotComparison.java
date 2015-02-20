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

import org.eclipse.emf.diffmerge.api.IDiffPolicy;
import org.eclipse.emf.diffmerge.api.IMergePolicy;
import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.diffdata.impl.EComparisonImpl;
import org.eclipse.emf.diffmerge.util.IExpensiveOperation;

/**
 * A comparison for Capella re-import from XML Pivot format.
 */
public class XMLPivotComparison extends EComparisonImpl {

  /**
   * Constructor
   * @param targetScope_p the non-null model scope playing the TARGET comparison role
   * @param referenceScope_p the non-null model scope playing the REFERENCE comparison role
   * @param ancestorScope_p the optional model scope playing the ANCESTOR comparison role
   */
  public XMLPivotComparison(IEditableModelScope targetScope_p, IEditableModelScope referenceScope_p, IEditableModelScope ancestorScope_p) {
    super(targetScope_p, referenceScope_p, ancestorScope_p);
  }

  /**
   * Constructor
   * @param targetScope_p the non-null model scope playing the TARGET comparison role
   * @param referenceScope_p the non-null model scope playing the REFERENCE comparison role
   */
  public XMLPivotComparison(IEditableModelScope targetScope_p, IEditableModelScope referenceScope_p) {
    super(targetScope_p, referenceScope_p);
  }

  /**
   * @see org.eclipse.emf.diffmerge.diffdata.impl.EComparisonImpl#getDiffOperation(org.eclipse.emf.diffmerge.api.IDiffPolicy, org.eclipse.emf.diffmerge.api.IMergePolicy)
   */
  @Override
  protected IExpensiveOperation getDiffOperation(IDiffPolicy diffPolicy_p, IMergePolicy mergePolicy_p) {
    return new XMLPivotDiffOperation(this, diffPolicy_p, mergePolicy_p);
  }

}
