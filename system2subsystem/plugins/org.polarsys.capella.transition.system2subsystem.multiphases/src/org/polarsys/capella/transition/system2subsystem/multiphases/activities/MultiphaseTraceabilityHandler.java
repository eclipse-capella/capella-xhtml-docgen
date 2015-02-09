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
package org.polarsys.capella.transition.system2subsystem.multiphases.activities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.data.modellingcore.AbstractType;
import org.polarsys.capella.common.helpers.EcoreUtil2;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.InterfacePkg;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.epbs.EpbsPackage;
import org.polarsys.capella.core.data.information.DataPkg;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalComponentNature;
import org.polarsys.capella.core.transition.common.handlers.traceability.CompoundTraceabilityHandler;
import org.polarsys.capella.core.transition.common.handlers.traceability.config.ITraceabilityConfiguration;
import org.polarsys.capella.transition.system2subsystem.multiphases.MultiphasesContext;
import org.polarsys.capella.transition.system2subsystem.multiphases.MultiphasesContext.Mapping;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 * A specialized traceability handler for multiphase transitions. 
 * 
 * The most notable property of this handler is that source elements may be traced
 * to different elements depending on the current target architecture phase. For example, 
 * during SA transition, root physical component is traced to the System, while during
 * the LA transition, it is traced to the root logical component.
 */
public class MultiphaseTraceabilityHandler extends CompoundTraceabilityHandler {
	
	public MultiphaseTraceabilityHandler(ITraceabilityConfiguration configuration_p) {
		super(configuration_p);
	}

	// TODO delegate this into the context..
	@Override
  public Collection<EObject> retrieveTracedElements(EObject source_p, IContext context_p) {

		MultiphasesContext context = (MultiphasesContext) context_p;
		
		if (source_p == null){
			return Collections.emptyList();
		}

		/*
		 * In the SA phase, all selected node PCs are mapped to the System 
		 */
		if (context.getMapping() == Mapping.SA && context.getSelectedPhysicalComponents().contains(source_p)){
		  return Collections.singleton(context.getTempRootComponent());
		}
		
		/*
		 * In the LA phase, node PCs that are in the selection or that have an ancestor in the selection are mapped to the root logical component.
		 */
		if (context.getMapping() == Mapping.LA && source_p instanceof PhysicalComponent && (((PhysicalComponent) source_p).getNature() == PhysicalComponentNature.NODE)){
		  EObject tmp = source_p;
      while (tmp instanceof PhysicalComponent){
        if (context.getSelectedPhysicalComponents().contains(tmp)){
          return Collections.singleton(context.getTempRootComponent());
        }
        tmp = tmp.eContainer();
      }
		}

		/*
		 * Root components are mapped to the root component of the currently active phase
		 */
		if (isRootComponent(source_p)){
			BlockArchitecture ba = ((MultiphasesContext) context_p).getTempBlockArchitecture();
			if (ba instanceof SystemAnalysis){
				return Collections.<EObject>singleton(((SystemAnalysis) ba).getOwnedSystem());
			} else if (ba instanceof LogicalArchitecture){
				return Collections.<EObject>singleton(((LogicalArchitecture) ba).getOwnedLogicalComponent());
			} else if (ba instanceof PhysicalArchitecture){
				return Collections.<EObject>singleton(((PhysicalArchitecture) ba).getOwnedPhysicalComponent());
			}
		}
		
		// data and interface package content is always traced into the SA
		EObject dpkg = EcoreUtil2.getFirstContainer(source_p, InformationPackage.Literals.DATA_PKG);
		EObject ipkg = EcoreUtil2.getFirstContainer(source_p, CsPackage.Literals.INTERFACE_PKG);
		if (ipkg != null || dpkg != null || source_p instanceof DataPkg || source_p instanceof InterfacePkg){
			return super.retrieveTracedElements(source_p, context_p);
		}

		// otherwise traced elements that are not in the current target block architecture are filtered out
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject e : super.retrieveTracedElements(source_p, context_p)){
			if (e instanceof BlockArchitecture && e == ((MultiphasesContext) context_p).getTempBlockArchitecture()){
				result.add(e);
			} else {
				BlockArchitecture be = (BlockArchitecture) EcoreUtil2.getFirstContainer(e, CsPackage.Literals.BLOCK_ARCHITECTURE);
				if (be == null || be.eClass() == ((MultiphasesContext) context_p).getMapping().getBlockArchitectureClass()){
					result.add(e);
				}
			}
		}
		return result;
	}

	@Override
	public void attachTraceability(EObject sourceElement_p,
			EObject targetElement_p, IContext context_p) {
		
		// FIXME this should be in the rules. don't attach traceability to skeleton elements.
		// We want to match them independently of their SID.
		if (targetElement_p instanceof BlockArchitecture){
			return;
		} 
		else if (targetElement_p instanceof Part){
			AbstractType type = ((Part) targetElement_p).getAbstractType();
			if (type != null && isRootComponent(type)){
				return;
			}
	}
		if (isRootComponent(targetElement_p)){
			return;
		}
		
		super.attachTraceability(sourceElement_p, targetElement_p, context_p);
	}

	private boolean isRootComponent(EObject element_p){
		EStructuralFeature feature = element_p.eContainingFeature();
		if (feature == CtxPackage.Literals.SYSTEM_ANALYSIS__OWNED_SYSTEM 
				|| feature == LaPackage.Literals.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT
				|| feature == PaPackage.Literals.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT
				|| feature == EpbsPackage.Literals.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM){
			return true;
		}
		return false;
	}
	
	
}
