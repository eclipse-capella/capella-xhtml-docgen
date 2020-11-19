/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.docgen.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.model.pattern.PatternElement;
import org.eclipse.egf.model.pattern.PatternFactory;
import org.eclipse.egf.model.pattern.TypePatternList;
import org.eclipse.emf.common.util.EList;

/**
 * 
 */
public class MergePatternListTask extends AbstractPatternListMergeTask {

	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		// Get original and additional substitution
		TypePatternList basePatternList =  getBase(productionContext, TypePatternList.class);
		TypePatternList additionPatternList = getAddition(productionContext, TypePatternList.class);
		
		if (additionPatternList == null && basePatternList != null)
		{
			setMergeResult(productionContext, basePatternList);
			return;
		}
		
		if (additionPatternList != null && basePatternList == null)
		{
			setMergeResult(productionContext, additionPatternList);
			return;
		}
		
		if (additionPatternList == null && basePatternList == null)
		{
			setMergeResult(productionContext, null);
			return;
		}
		
		// Merge initial and additional substitution 
		EList<PatternElement> mergedSubstitution = merge(basePatternList.getElements(), additionPatternList.getElements(), false);
		
		// If the merged list is not empty, so return it.
		if (! mergedSubstitution.isEmpty())
		{
			TypePatternList result = PatternFactory.eINSTANCE.createTypePatternList();
			result.getElements().addAll(mergedSubstitution);
			setMergeResult(productionContext, result);
		}
		// Return the initial substitution list if the result is empty
		else
		{
			setMergeResult(productionContext, basePatternList);
		}
	}
}
