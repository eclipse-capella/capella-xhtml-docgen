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
import org.eclipse.egf.model.pattern.PatternFactory;
import org.eclipse.egf.model.pattern.Substitution;
import org.eclipse.egf.model.pattern.TypePatternSubstitution;
import org.eclipse.emf.common.util.EList;

/**
 * 
 */
public class MergePatternSubstitutionTask extends AbstractPatternListMergeTask {

	/**
	 * @see org.polarsys.kitalpha.doc.gen.business.capella.task.AbstractPatternListMergeTask#doExecute(org.eclipse.egf.ftask.producer.context.ITaskProductionContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		// Get original and additional substitution
		TypePatternSubstitution baseSubstitution = getBase(productionContext, TypePatternSubstitution.class);
		TypePatternSubstitution additionSubstitution = getAddition(productionContext, TypePatternSubstitution.class);
		
		if (additionSubstitution == null && baseSubstitution != null)
		{
			setMergeResult(productionContext, baseSubstitution);
			return;
		}
		
		if (additionSubstitution != null && baseSubstitution == null)
		{
			setMergeResult(productionContext, additionSubstitution);
			return;
		}
		
		if (additionSubstitution == null && baseSubstitution == null)
		{
			setMergeResult(productionContext, null);
			return;
		}
		
		// Merge initial and additional substitution 
		EList<Substitution> merged = merge(baseSubstitution.getSubstitutions(), additionSubstitution.getSubstitutions() ,true);
		
		// If the merged list is not empty, so return it.
		if (! merged.isEmpty())
		{
			TypePatternSubstitution result = PatternFactory.eINSTANCE.createTypePatternSubstitution();
			result.getSubstitutions().addAll(merged);
			setMergeResult(productionContext, result);
		}
		// Return the initial substitution list if the result is empty
		else
		{
			setMergeResult(productionContext, baseSubstitution);
		}
	}
}
