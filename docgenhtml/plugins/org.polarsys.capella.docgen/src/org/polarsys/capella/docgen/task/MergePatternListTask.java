/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
		TypePatternList baseSubstitution = getBase(productionContext, TypePatternList.class);
		TypePatternList additionSubstitution = getAddition(productionContext, TypePatternList.class);
		
		if (additionSubstitution == null)
		{
			setMergeResult(productionContext, baseSubstitution);
			return;
		}
		
		// Merge initial and additional substitution 
		EList<PatternElement> mergedSubstitution = merge(baseSubstitution.getElements(), additionSubstitution.getElements(), false);
		
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
			setMergeResult(productionContext, baseSubstitution);
		}
	}
}
