/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.transition.system2subsystem.multiphases.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.polarsys.capella.common.data.modellingcore.AbstractTrace;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;
import org.polarsys.capella.core.data.capellacommon.JustificationLink;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.ctx.SystemFunction;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.data.la.LogicalFunction;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalComponentNature;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;

public class PreallocationConstraints extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		if (ctx.getTarget() instanceof LogicalFunction){
			return validateLogicalFunctionAllocations(ctx);
		} else if (ctx.getTarget() instanceof PhysicalComponent){
			return validatePhysicalComponentDeployments(ctx);
		} else if (ctx.getTarget() instanceof FunctionalExchange){
			return validateFunctionalExchangeAllocations(ctx);
		} else if (ctx.getTarget() instanceof ComponentExchange){
			return validateComponentExchangeAllocations(ctx);
		}
		throw new IllegalArgumentException();
	}
	
	private final LogicalFunction getParentFunction(LogicalFunction lf) {
		EObject parent = lf;
		LogicalFunction rootLogicalFunction = (LogicalFunction) BlockArchitectureExt.getRootFunction(BlockArchitectureExt.getRootBlockArchitecture(parent));
		if (parent != rootLogicalFunction) {
			do {
				parent = parent.eContainer();
			} while (!(parent instanceof LogicalFunction));
		}
		return (LogicalFunction) parent;
	}

	private final boolean isAllocatedToOrToAChild(LogicalFunction target, LogicalComponent shouldBeAllocatedOn) {
		boolean result = false;

		if (target.getAllocatorLogicalComponents().contains(shouldBeAllocatedOn)) {
			result = true;
		} else {
			for (LogicalComponent lc : shouldBeAllocatedOn.getOwnedLogicalComponents()) {
				result = isAllocatedToOrToAChild(target, lc);
				if (result == true) {
					break;
				}
			}
		}
		return result;
	}

	// The transition shall contain a validation rule that warns the end user if 
	// allocations of leaf Logical Functions in Logical Components are different 
	// than the associated pre-allocation links between parent Logical Functions 
	// realizing System Functions and parent Logical Components.

	private final IStatus validateLogicalFunctionAllocations( IValidationContext ctx) {
		EList<SystemFunction> realisedFunctions;
		LogicalFunction parentFunction;
		LogicalFunction target = (LogicalFunction) ctx.getTarget();
		LogicalFunction rootLogicalFunction = (LogicalFunction) BlockArchitectureExt.getRootFunction(BlockArchitectureExt.getRootBlockArchitecture(target));

	
		// Only deal with leaf functions
		if (target.getOwnedFunctions().size() == 0) {
			// find the first parent function realizing a System function
			parentFunction = target;
			realisedFunctions = parentFunction.getRealizedSystemFunctions();
			while ((realisedFunctions == null || realisedFunctions.size() == 0)	&& parentFunction != rootLogicalFunction) {
				parentFunction = getParentFunction(parentFunction);
				realisedFunctions = parentFunction.getRealizedSystemFunctions();
			}
			
			for (SystemFunction sf : realisedFunctions) {
				for (AbstractTrace t : sf.getIncomingTraces()) {
					if (t instanceof JustificationLink) {
						LogicalComponent shouldBeAllocatedOn = (LogicalComponent) t.getSourceElement();

						// Find if target is allocated to shouldBeAllocatedOn or one of its child
						if (isAllocatedToOrToAChild(target, shouldBeAllocatedOn)) {
							continue;
						}
						return ctx.createFailureStatus(target,	shouldBeAllocatedOn);
					}
				}
			}
		}
		return ctx.createSuccessStatus();
	}
	
	private final PhysicalComponent getParentPhysicalComponent(PhysicalComponent lf) {
		EObject parent = lf;
		PhysicalComponent rootPhysicalComponent = (PhysicalComponent) BlockArchitectureExt.getFirstComponent(BlockArchitectureExt.getRootBlockArchitecture(parent));
		if (parent != rootPhysicalComponent) {
			do {
				parent = parent.eContainer();
			} while (!(parent instanceof PhysicalComponent));
		}
		return (PhysicalComponent) parent;
	}
	
	private final boolean hasJustificationLink (TraceableElement te) {
		boolean hasJustificationLink=false;
		for (AbstractTrace t : te.getIncomingTraces()){
			if (t instanceof JustificationLink){
				hasJustificationLink=true;
				break;
			}
		}
		return hasJustificationLink;
	}
	
	private final boolean isParentOfPhysicalComponent(PhysicalComponent parentCandidate, PhysicalComponent child) {
		boolean isParentOfPhysicalComponent = false;
		PhysicalComponent rootPhysicalComponent = (PhysicalComponent) BlockArchitectureExt.getFirstComponent(BlockArchitectureExt.getRootBlockArchitecture(child));
		PhysicalComponent parent = child;
		
		while (parent!= parentCandidate && parent !=rootPhysicalComponent) {
			parent = getParentPhysicalComponent(parent);
		}
		
		if (parent == parentCandidate) {
			isParentOfPhysicalComponent = true;
		}
		return isParentOfPhysicalComponent;
	}
	
	private final LogicalComponent getParentLogicalComponent(LogicalComponent lf) {
		EObject parent = lf;
		LogicalComponent rootLogicalComponent = (LogicalComponent) BlockArchitectureExt.getFirstComponent(BlockArchitectureExt.getRootBlockArchitecture(parent));
		if (parent != rootLogicalComponent) {
			do {
				parent = parent.eContainer();
			} while (!(parent instanceof LogicalComponent));
		}
		return (LogicalComponent) parent;
	}
	
	
	//	The transition shall contain a validation rule that warns the end user if
	//	deployments of leaf Behavioural Components in Physical Node Components are
	//	different than the associated pre-allocation links between parent Behavioural
	//	Components realizing Logical Components and parent Physical Node Components.
	
	private IStatus validatePhysicalComponentDeployments(IValidationContext ctx) {
		PhysicalComponent target = (PhysicalComponent) ctx.getTarget();
		PhysicalComponent parentComponent;
		EList<LogicalComponent>  realisedLogicalComponents;
		PhysicalComponent rootPhysicalComponent = (PhysicalComponent) BlockArchitectureExt.getFirstComponent(BlockArchitectureExt.getRootBlockArchitecture(target));

		
		if (target.getNature() == PhysicalComponentNature.BEHAVIOR){
			
			// find the first parent BC realizing a Logical Component
			parentComponent = target;
			realisedLogicalComponents = parentComponent.getRealizedLogicalComponents();
			while ((realisedLogicalComponents == null || realisedLogicalComponents.size() == 0)	&& parentComponent != rootPhysicalComponent) {
				parentComponent = getParentPhysicalComponent(parentComponent);
				realisedLogicalComponents = parentComponent.getRealizedLogicalComponents();
			}
			
			// Get LC parent with JustificationLink link
			for (LogicalComponent realized : realisedLogicalComponents){
				LogicalComponent realizedParent = realized;
				LogicalComponent rootLogicalComponent = (LogicalComponent) BlockArchitectureExt.getFirstComponent(BlockArchitectureExt.getRootBlockArchitecture(realized));
				while (!hasJustificationLink(realizedParent) && realizedParent!=rootLogicalComponent) {
					realizedParent = getParentLogicalComponent(realizedParent);
				}
				for (AbstractTrace t : realizedParent.getIncomingTraces()){
					if (t instanceof JustificationLink){
						PhysicalComponent shouldBeDeployedOn = (PhysicalComponent) t.getSourceElement();
						if (target.getDeployingPhysicalComponents()!=null && target.getDeployingPhysicalComponents().size()>0) {
							for (PhysicalComponent deployingPhysicalComponent:target.getDeployingPhysicalComponents()) {
								// Check if the BC is deployed on shouldBeDeployedOn or one of its child
								if (isParentOfPhysicalComponent(shouldBeDeployedOn,deployingPhysicalComponent)){
									continue;
								}
								return ctx.createFailureStatus(target, shouldBeDeployedOn);
							}
						} else {
							return ctx.createFailureStatus(target, shouldBeDeployedOn);
						}
					}
				}
			}
		}
    	return ctx.createSuccessStatus();
	}
	
	
	
	
	//	The transition shall contain a validation rule that warns the end user if allocation 
	//	of Logical Functional Exchanges, realizing System Functional Exchanges, 
	//	in Logical Component Exchanges are different than the associated pre-allocation links.
	private IStatus validateFunctionalExchangeAllocations(IValidationContext ctx) {
		FunctionalExchange target = (FunctionalExchange) ctx.getTarget();
		for (FunctionalExchange realizedFe : target.getRealizedFunctionalExchanges()){
			for (AbstractTrace t : realizedFe.getIncomingTraces()){
				if (t instanceof JustificationLink){
					ComponentExchange shouldBeAllocatedOn = (ComponentExchange) t.getSourceElement();
					if (target.getAllocatingComponentExchanges().contains(shouldBeAllocatedOn)){
						continue;
					}
					return ctx.createFailureStatus(target, shouldBeAllocatedOn);
				}
			}
		}
		return ctx.createSuccessStatus();
	}

	//	The transition shall contain a validation rule that warns the end user
	//	if allocation of Component Exchanges, realizing Logical Component Exchanges, 
	//	in Physical Links in the Physical Architecture phase are different 
	//	than the associated pre-allocation links
    private IStatus validateComponentExchangeAllocations(IValidationContext ctx) {
		ComponentExchange target = (ComponentExchange) ctx.getTarget();
		for (ComponentExchange realizedCe : target.getRealizedComponentExchanges()){
			for (AbstractTrace at : realizedCe.getIncomingTraces()){
				if (at instanceof JustificationLink){
					PhysicalLink shouldBeAllocatedOn = (PhysicalLink) at.getSourceElement();
					if (target.getAllocatorPhysicalLinks().contains(shouldBeAllocatedOn)){
						continue;
					}
					return ctx.createFailureStatus(target, shouldBeAllocatedOn);
				}
			}
		}
		return ctx.createSuccessStatus();
	}

}
