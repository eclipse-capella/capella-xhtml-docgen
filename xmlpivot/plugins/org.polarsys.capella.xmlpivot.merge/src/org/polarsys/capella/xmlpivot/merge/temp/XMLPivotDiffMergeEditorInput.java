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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.diffmerge.diffdata.EComparison;
import org.eclipse.emf.diffmerge.ui.EMFDiffMergeUIPlugin;
import org.eclipse.emf.diffmerge.ui.setup.EMFDiffMergeEditorInput;
import org.eclipse.emf.diffmerge.ui.specification.IComparisonMethod;
import org.eclipse.emf.diffmerge.ui.viewers.EMFDiffNode;

/**
 * 
 */
public class XMLPivotDiffMergeEditorInput extends EMFDiffMergeEditorInput {

  /** Whether the comparison originally contained differences (initially true) */
  private boolean _foundDifferences;

  /**
   * 
   * @param specification_p
   */
  public XMLPivotDiffMergeEditorInput(IComparisonMethod specification_p) {
    super(specification_p);
  }

  /**
   * 
   */
  @Override
  protected Object prepareInput(IProgressMonitor monitor_p) throws InvocationTargetException, InterruptedException {
    if (monitor_p == null) {
      return null;
    }
    boolean scopesReady = _leftScope != null;
    SubMonitor monitor = SubMonitor.convert(monitor_p, EMFDiffMergeUIPlugin.LABEL, 2);
    EMFDiffNode result = null;
    try {
      if (!scopesReady) {
        loadScopes(monitor.newChild(1));
      }
      EComparison comparison = new XMLPivotComparison(_leftScope, _rightScope, _ancestorScope);
      comparison.compute(_comparisonMethod.getMatchPolicy(), _comparisonMethod.getDiffPolicy(), _comparisonMethod.getMergePolicy(),
          monitor.newChild(scopesReady ? 2 : 1));
      _foundDifferences = comparison.hasRemainingDifferences();
      if (_foundDifferences) {
        result = initializeDiffNode(comparison);
      } else {
        handleDispose();
      }
    } catch (OperationCanceledException e) {
      // No user feedback is needed
      handleDispose();
    } catch (Throwable t) {
      // Cannot load models
      handleExecutionProblem(t);
      handleDispose();
    }
    return result;
  }

  /**
   * Return whether the comparison originally contained differences
   * @return true by default before the comparison has actually been computed
   */
  @Override
  public boolean foundDifferences() {
    return _foundDifferences;
  }

}
