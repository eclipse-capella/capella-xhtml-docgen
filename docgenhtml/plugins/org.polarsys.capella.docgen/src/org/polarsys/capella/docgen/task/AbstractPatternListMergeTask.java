/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
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
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.egf.model.fcore.NamedModelElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 *
 */
public abstract class AbstractPatternListMergeTask implements ITaskProduction {

	protected static final String BASE_CONTRACT = "base"; //$NON-NLS-1$
	protected static final String ADDITION_CONTRACT = "addition"; //$NON-NLS-1$
	protected static final String MERGED_CONTRACT = "merged"; //$NON-NLS-1$
	
	/**
	 * Method to be implemented by derived Classes
	 */
	public abstract void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException ;
	
	/**
	 * Merge two list of 
	 * @param base
	 * @param addition
	 * @return
	 */
	protected static <T extends NamedModelElement> EList<T> merge(EList<T> base, EList<T> addition, boolean useOriginal){
		EList<T> result = new UniqueEList<T>();
		
		if (useOriginal)
		{
			// Copy the initial Substitutions in the mergedSubstitution list
			if (base != null && !base.isEmpty())
			{
				for (T baseElement : base) 
				{
					T copy = EcoreUtil.copy(baseElement);
					result.add(copy);
				}
			}
			
			// Copy the additional Substitutions in the mergedSubstitution list
			if (addition != null && !addition.isEmpty())
			{
				for (T additionElement : addition) 
				{
					T copy = EcoreUtil.copy(additionElement);
					result.add(copy);
				}
			}
		}
		else
		{
			if (base != null && !base.isEmpty())
			{
				result.addAll(base);
			}
			
			if (addition != null && !addition.isEmpty())
			{
				result.addAll(addition);
			}
		}
		
		
		return result;
	}
	
	/**
	 * @param <R>
	 * @param productionContext the current production context
	 * @param clazz the type of the base parameter
	 * @return Return the base parameter value
	 * @throws InvocationException
	 */
	protected static <R> R getBase(ITaskProductionContext productionContext, Class<R> clazz) throws InvocationException{
		return productionContext.getInputValue(BASE_CONTRACT, clazz);
	}
	
	/**
	 * @param <R>
	 * @param productionContext the current production context
	 * @param clazz the type of the addition parameter
	 * @return Return the addition parameter value
	 * @throws InvocationException
	 */
	protected static <R> R getAddition(ITaskProductionContext productionContext, Class<R> clazz) throws InvocationException{
		return productionContext.getInputValue(ADDITION_CONTRACT, clazz);
	}

	/**
	 * Set the output of the merge action in the {@link #MERGED_CONTRACT} contract
	 * @param productionContext the current production context
	 * @param value the value of the output
	 * @throws InvocationException
	 */
	protected static void setMergeResult(ITaskProductionContext productionContext, Object value) throws InvocationException{
		productionContext.setOutputValue(MERGED_CONTRACT, value);
	}
	
	/************************* Unused methods **************************/
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

}
