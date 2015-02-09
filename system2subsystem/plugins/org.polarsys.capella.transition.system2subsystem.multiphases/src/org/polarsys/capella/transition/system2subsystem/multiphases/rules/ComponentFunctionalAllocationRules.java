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
package org.polarsys.capella.transition.system2subsystem.multiphases.rules;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.attachment.AttachmentHelper;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.crossphases.rules.fa.ComponentFunctionalAllocationRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;



public class ComponentFunctionalAllocationRules {
	
	
	public static class ToSA extends ComponentFunctionalAllocationRule {
		
	}
	
	public static class ToLA extends ComponentFunctionalAllocationRule {

		@Override
		protected EObject getSourceContainer(EObject element_p, EObject result_p, IContext context_p) {
			if (ContextScopeHandlerHelper.getInstance(context_p).contains(ITransitionConstants.SOURCE_SCOPE, element_p, context_p)){
				return element_p.eContainer();
			} else {
				return super.getSourceContainer(element_p, result_p, context_p);
			}
		}
		
		@Override
		protected void attachAllocationRelated(EObject element_p, EObject result_p, IContext context_p) {
			AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, ModellingcorePackage.Literals.ABSTRACT_TRACE__SOURCE_ELEMENT, context_p);
			AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, ModellingcorePackage.Literals.ABSTRACT_TRACE__TARGET_ELEMENT, context_p);
		
			// If the attachment helper couldn't set the source element we just assume the parent is the source element
			// Needed for LogicalActor+LogicalComponent+LogicalFunction ===> LogicalActor+LogicalFunction
			if (((ComponentFunctionalAllocation)result_p).getSourceElement() == null && result_p.eContainer() instanceof TraceableElement){
				((ComponentFunctionalAllocation)result_p).setSourceElement((TraceableElement) result_p.eContainer());
			}
		}

	}
	
	public static class ToPA extends ComponentFunctionalAllocationRule {
		
	}

}
