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
import org.polarsys.capella.common.data.modellingcore.AbstractTrace;
import org.polarsys.capella.core.data.capellacommon.AbstractStateRealization;
import org.polarsys.capella.core.data.capellacommon.StateTransitionRealization;
import org.polarsys.capella.core.data.capellacommon.TransfoLink;
import org.polarsys.capella.core.data.capellacore.Generalization;
import org.polarsys.capella.core.data.capellacore.Involvement;
import org.polarsys.capella.core.data.capellacore.ReuseLink;
import org.polarsys.capella.core.data.capellamodeller.Folder;
import org.polarsys.capella.core.data.capellamodeller.Library;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineeringPkg;
import org.polarsys.capella.core.data.cs.AbstractDeploymentLink;
import org.polarsys.capella.core.data.cs.ActorCapabilityRealizationInvolvement;
import org.polarsys.capella.core.data.cs.InterfaceImplementation;
import org.polarsys.capella.core.data.cs.InterfaceUse;
import org.polarsys.capella.core.data.cs.PhysicalLinkRealization;
import org.polarsys.capella.core.data.cs.PhysicalPathRealization;
import org.polarsys.capella.core.data.cs.PhysicalPortRealization;
import org.polarsys.capella.core.data.cs.SystemComponentCapabilityRealizationInvolvement;
import org.polarsys.capella.core.data.ctx.ActorCapabilityInvolvement;
import org.polarsys.capella.core.data.ctx.ActorMissionInvolvement;
import org.polarsys.capella.core.data.ctx.CapabilityExploitation;
import org.polarsys.capella.core.data.ctx.OperationalActorRealization;
import org.polarsys.capella.core.data.ctx.OperationalAnalysisRealization;
import org.polarsys.capella.core.data.ctx.OperationalEntityRealization;
import org.polarsys.capella.core.data.ctx.SystemCapabilityInvolvement;
import org.polarsys.capella.core.data.ctx.SystemCommunication;
import org.polarsys.capella.core.data.ctx.SystemCommunicationHook;
import org.polarsys.capella.core.data.ctx.SystemMissionInvolvement;
import org.polarsys.capella.core.data.epbs.EPBSArchitecturePkg;
import org.polarsys.capella.core.data.epbs.PhysicalArchitectureRealization;
import org.polarsys.capella.core.data.epbs.PhysicalArtifactRealization;
import org.polarsys.capella.core.data.fa.ComponentExchangeAllocation;
import org.polarsys.capella.core.data.fa.ComponentExchangeFunctionalExchangeAllocation;
import org.polarsys.capella.core.data.fa.ComponentExchangeRealization;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.data.fa.ComponentPortAllocation;
import org.polarsys.capella.core.data.fa.ComponentPortAllocationEnd;
import org.polarsys.capella.core.data.fa.ExchangeContainment;
import org.polarsys.capella.core.data.fa.ExchangeLink;
import org.polarsys.capella.core.data.fa.FunctionRealization;
import org.polarsys.capella.core.data.fa.FunctionSpecification;
import org.polarsys.capella.core.data.fa.FunctionalChainRealization;
import org.polarsys.capella.core.data.fa.FunctionalExchangeRealization;
import org.polarsys.capella.core.data.fa.FunctionalExchangeSpecification;
import org.polarsys.capella.core.data.information.DomainElement;
import org.polarsys.capella.core.data.information.ExchangeItemRealization;
import org.polarsys.capella.core.data.information.InformationRealization;
import org.polarsys.capella.core.data.information.OperationAllocation;
import org.polarsys.capella.core.data.information.PortAllocation;
import org.polarsys.capella.core.data.information.PortRealization;
import org.polarsys.capella.core.data.information.communication.MessageReference;
import org.polarsys.capella.core.data.information.communication.SignalInstance;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityExtend;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityExtensionPoint;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityGeneralization;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityInclude;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityRealization;
import org.polarsys.capella.core.data.interaction.AbstractFunctionAbstractCapabilityInvolvement;
import org.polarsys.capella.core.data.interaction.ArmTimerEvent;
import org.polarsys.capella.core.data.interaction.CancelTimerEvent;
import org.polarsys.capella.core.data.interaction.ConstraintDuration;
import org.polarsys.capella.core.data.interaction.CreationEvent;
import org.polarsys.capella.core.data.interaction.DestructionEvent;
import org.polarsys.capella.core.data.interaction.EventReceiptOperation;
import org.polarsys.capella.core.data.interaction.EventSentOperation;
import org.polarsys.capella.core.data.interaction.Execution;
import org.polarsys.capella.core.data.interaction.ExecutionEnd;
import org.polarsys.capella.core.data.interaction.ExecutionEvent;
import org.polarsys.capella.core.data.interaction.FragmentEnd;
import org.polarsys.capella.core.data.interaction.FunctionalChainAbstractCapabilityInvolvement;
import org.polarsys.capella.core.data.interaction.Gate;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.InteractionState;
import org.polarsys.capella.core.data.interaction.InteractionUse;
import org.polarsys.capella.core.data.interaction.MergeLink;
import org.polarsys.capella.core.data.interaction.MessageEnd;
import org.polarsys.capella.core.data.interaction.RefinementLink;
import org.polarsys.capella.core.data.interaction.ScenarioRealization;
import org.polarsys.capella.core.data.interaction.StateFragment;
import org.polarsys.capella.core.data.la.ContextInterfaceRealization;
import org.polarsys.capella.core.data.la.LogicalArchitecturePkg;
import org.polarsys.capella.core.data.la.SystemActorRealization;
import org.polarsys.capella.core.data.la.SystemAnalysisRealization;
import org.polarsys.capella.core.data.la.SystemRealization;
import org.polarsys.capella.core.data.oa.ActivityAllocation;
import org.polarsys.capella.core.data.oa.CapabilityConfiguration;
import org.polarsys.capella.core.data.oa.CommunityOfInterest;
import org.polarsys.capella.core.data.oa.CommunityOfInterestComposition;
import org.polarsys.capella.core.data.oa.Concept;
import org.polarsys.capella.core.data.oa.ConceptCompliance;
import org.polarsys.capella.core.data.oa.ConceptPkg;
import org.polarsys.capella.core.data.oa.EntityOperationalCapabilityInvolvement;
import org.polarsys.capella.core.data.oa.ItemInConcept;
import org.polarsys.capella.core.data.oa.OrganisationalUnit;
import org.polarsys.capella.core.data.oa.OrganisationalUnitComposition;
import org.polarsys.capella.core.data.oa.RoleAllocation;
import org.polarsys.capella.core.data.oa.RoleAssemblyUsage;
import org.polarsys.capella.core.data.oa.Swimlane;
import org.polarsys.capella.core.data.pa.LogicalActorRealization;
import org.polarsys.capella.core.data.pa.LogicalArchitectureRealization;
import org.polarsys.capella.core.data.pa.LogicalComponentRealization;
import org.polarsys.capella.core.data.pa.LogicalInterfaceRealization;
import org.polarsys.capella.core.data.pa.PhysicalArchitecturePkg;
import org.polarsys.capella.core.data.pa.deployment.ComponentInstance;
import org.polarsys.capella.core.data.pa.deployment.ConnectionInstance;
import org.polarsys.capella.core.data.pa.deployment.DeploymentAspect;
import org.polarsys.capella.core.data.pa.deployment.DeploymentConfiguration;
import org.polarsys.capella.core.data.pa.deployment.InstanceDeploymentLink;
import org.polarsys.capella.core.data.pa.deployment.PartDeploymentLink;
import org.polarsys.capella.core.data.pa.deployment.PortInstance;
import org.polarsys.capella.core.data.pa.deployment.TypeDeploymentLink;
import org.polarsys.capella.core.data.sharedmodel.GenericPkg;

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
		if(object_p instanceof MessageReference ||
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
