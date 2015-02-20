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
package org.polarsys.capella.xmlpivot.util;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.cs.*;
import org.polarsys.capella.core.data.ctx.*;
import org.polarsys.capella.core.data.epbs.*;
import org.polarsys.capella.core.data.fa.*;
import org.polarsys.capella.core.data.information.*;
import org.polarsys.capella.core.data.information.communication.*;
import org.polarsys.capella.core.data.interaction.*;
import org.polarsys.capella.core.data.la.*;
import org.polarsys.capella.core.data.capellacommon.*;
import org.polarsys.capella.core.data.capellacore.*;
import org.polarsys.capella.core.data.capellamodeller.*;
import org.polarsys.capella.core.data.oa.*;
import org.polarsys.capella.core.data.pa.*;
import org.polarsys.capella.core.data.pa.deployment.*;
import org.polarsys.capella.core.data.sharedmodel.GenericPkg;
import org.polarsys.capella.common.data.modellingcore.*;

/**
 * Utility class for the XMLPivot export/import functionality
 */
public class XMLPivotUtil {

	/**
	 * Returns whether the object is technical, not semantic
	 * @param object_p non-null EObject
	 * @return boolean
	 */
	public static boolean isTechnicalOLD(EObject object_p){
		if (object_p instanceof AbstractTrace
		     || object_p instanceof Involvement
		     || object_p instanceof Generalization
		     || object_p instanceof CapabilityExploitation
		     || object_p instanceof AbstractDeploymentLink
		     || object_p instanceof AbstractCapabilityGeneralization
		     || object_p instanceof AbstractCapabilityExtend
		     || object_p instanceof AbstractCapabilityInclude
		     || object_p instanceof InterfaceUse
		     || object_p instanceof InterfaceImplementation
		     || object_p instanceof FunctionRealization){
			// Allocations
			// ctx/SystemCommunication, info/communication/MessageReference, capellacore/ReuseLink
			// inter/AbstractCapabilityExtensionPoint, fa/FunctionalExchangeSpecification
			// information/ExchangeItemInstance, information/communication/SignalInstance
			
			// oa/RoleAssemblyUsage, capellacore/ExtensionPoint, pa/ComponentPortAllocationEnd
			
			// oa/OperationalProcess, pa/PhysicalLinkEnd, fa/ComponentExchangeEnd, oa/Concept
			// oa/Swimlane, oa/ItemInConcept, oa/CommunityOfInterest, oa/CommunityOfInterestComposition,
			// oa/OrganisationalUnit, oa/OrganisationalUnitComposition, ctx/SystemCommunicationHook
			
			// interaction/InstanceRole, interaction/ConstraintDuration, 
			// interaction/CreationEvent, interaction/DestructionEvent, interaction/ExecutionEvent
			// interaction/EventReceiptOperation, interaction/EventSentOperation, interaction/ArmTimerEvent, interaction/CancelTimerEvent
			// interaction/Gate, interaction/InteractionState, interaction/FragmentEnd, interaction/MessageEnd, interaction/ExecutionEnd
			// interaction/Execution, interaction/StateFragment, interaction/InteractionUse

			return true;
		}
		return false;
	}
	
	/**
	 * Returns whether the object is technical, not semantic
	 * @param object_p non-null EObject
	 * @return boolean
	 */
	public static boolean isTechnical(EObject object_p){
		//communication package
		if(object_p instanceof CommunicationLinkAllocation ||
			object_p instanceof MessageReference ||
			object_p instanceof SignalInstance ||
		//cs package
			object_p instanceof ActorCapabilityRealizationInvolvement ||
			object_p instanceof InterfaceImplementation ||
			object_p instanceof InterfaceUse ||
			object_p instanceof PhysicalLinkRealization ||
			object_p instanceof PhysicalPathRealization ||
			object_p instanceof PhysicalPortRealization ||
			object_p instanceof SystemComponentCapabilityRealizationInvolvement ||
		//ctx package
			object_p instanceof ActorCapabilityInvolvement ||
			object_p instanceof ActorMissionInvolvement ||
			object_p instanceof CapabilityExploitation ||
			object_p instanceof OperationalActorRealization ||
			object_p instanceof OperationalAnalysisRealization ||
			object_p instanceof OperationalEntityRealization ||
			object_p instanceof SystemCapabilityInvolvement ||
			object_p instanceof SystemCommunication ||
			object_p instanceof SystemCommunicationHook ||
			object_p instanceof SystemMissionInvolvement ||
		//deployment package
			object_p instanceof ComponentInstance ||
			object_p instanceof ConnectionInstance ||
			object_p instanceof DeploymentAspect ||
			object_p instanceof DeploymentConfiguration ||
			object_p instanceof InstanceDeploymentLink ||
			object_p instanceof PartDeploymentLink ||
			object_p instanceof PortInstance ||
			object_p instanceof TypeDeploymentLink ||
		//epbs package
			object_p instanceof EPBSArchitecturePkg ||
			object_p instanceof PhysicalArchitectureRealization ||
			object_p instanceof PhysicalArtifactRealization ||
		//fa package
			object_p instanceof ComponentExchangeAllocation ||
			object_p instanceof ComponentExchangeFunctionalExchangeAllocation ||
			object_p instanceof ComponentExchangeRealization ||
			object_p instanceof ComponentFunctionalAllocation ||
			object_p instanceof ComponentPortAllocation ||
			object_p instanceof ComponentPortAllocationEnd ||
			object_p instanceof ExchangeContainment ||
			object_p instanceof ExchangeLink ||
			object_p instanceof FunctionalChainRealization ||
			object_p instanceof FunctionalExchangeRealization ||
			object_p instanceof FunctionalExchangeSpecification ||
			object_p instanceof FunctionRealization ||
			object_p instanceof FunctionSpecification ||
		//information package
			object_p instanceof DomainElement ||
			object_p instanceof ExchangeItemRealization ||
			object_p instanceof InformationRealization ||
			object_p instanceof OperationAllocation ||
			object_p instanceof PortAllocation ||
			object_p instanceof PortRealization ||
		//interaction package
			object_p instanceof AbstractCapabilityExtend ||
			object_p instanceof AbstractCapabilityExtensionPoint ||
			object_p instanceof AbstractCapabilityGeneralization ||
			object_p instanceof AbstractCapabilityInclude ||
			object_p instanceof AbstractCapabilityRealization ||
			object_p instanceof AbstractFunctionAbstractCapabilityInvolvement ||
			object_p instanceof ArmTimerEvent ||
			object_p instanceof CancelTimerEvent ||
			object_p instanceof ConstraintDuration ||
			object_p instanceof CreationEvent ||
			object_p instanceof DestructionEvent ||
			object_p instanceof EventReceiptOperation ||
			object_p instanceof EventSentOperation ||
			object_p instanceof Execution ||
			object_p instanceof ExecutionEnd ||
			object_p instanceof ExecutionEvent ||
			object_p instanceof FragmentEnd ||
			object_p instanceof FunctionalChainAbstractCapabilityInvolvement ||
			object_p instanceof Gate ||
			object_p instanceof InstanceRole ||
			object_p instanceof InteractionState ||
			object_p instanceof InteractionUse ||
			object_p instanceof MergeLink ||
			object_p instanceof MessageEnd ||
			object_p instanceof RefinementLink ||
			object_p instanceof ScenarioRealization ||
			object_p instanceof StateFragment ||
		//la package
			object_p instanceof ContextInterfaceRealization ||
			object_p instanceof LogicalArchitecturePkg ||
			object_p instanceof SystemActorRealization ||
			object_p instanceof SystemAnalysisRealization ||
			object_p instanceof SystemRealization ||
		//capellacommon package
			object_p instanceof AbstractStateRealization ||
			object_p instanceof StateTransitionRealization ||
			object_p instanceof TransfoLink ||
		//capellacore
			object_p instanceof Generalization ||
			object_p instanceof ReuseLink ||
		//capellamodeller package
			object_p instanceof Folder ||
			object_p instanceof Library ||
			object_p instanceof SystemEngineeringPkg ||
		//oa package
			object_p instanceof ActivityAllocation ||
			object_p instanceof CapabilityConfiguration ||
			object_p instanceof CommunityOfInterest ||
			object_p instanceof CommunityOfInterestComposition ||
			object_p instanceof Concept ||
			object_p instanceof ConceptCompliance ||
			object_p instanceof ConceptPkg ||
			object_p instanceof EntityOperationalCapabilityInvolvement ||
			object_p instanceof ItemInConcept ||
			object_p instanceof OrganisationalUnit ||
			object_p instanceof OrganisationalUnitComposition ||
			object_p instanceof RoleAllocation ||
			object_p instanceof RoleAssemblyUsage ||
			object_p instanceof Swimlane ||
		//pa package
			object_p instanceof LogicalActorRealization ||
			object_p instanceof LogicalArchitectureRealization ||
			object_p instanceof LogicalComponentRealization ||
			object_p instanceof LogicalInterfaceRealization ||
			object_p instanceof PhysicalArchitecturePkg ||
		//sharedmodel package
			object_p instanceof GenericPkg){
				return true;
			}
			return false;
	}
}
