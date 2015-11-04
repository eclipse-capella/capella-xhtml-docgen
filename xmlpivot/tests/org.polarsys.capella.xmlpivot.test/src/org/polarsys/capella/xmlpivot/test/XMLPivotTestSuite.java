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
package org.polarsys.capella.xmlpivot.test;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @generated
 */
public class XMLPivotTestSuite extends TestSuite {

  /**
   * @generated
   */
	public XMLPivotTestSuite(){
      addTestSuite(AbstractCapabilityExtendTest.class);
      addTestSuite(AbstractCapabilityGeneralizationTest.class);
      addTestSuite(AbstractCapabilityIncludeTest.class);
      addTestSuite(AbstractCapabilityRealizationTest.class);
      addTestSuite(AbstractFunctionAbstractCapabilityInvolvementTest.class);
      addTestSuite(AbstractStateRealizationTest.class);
      addTestSuite(ActivityAllocationTest.class);
      addTestSuite(ActorCapabilityInvolvementTest.class);
      addTestSuite(ActorCapabilityRealizationInvolvementTest.class);
      addTestSuite(ActorMissionInvolvementTest.class);
      addTestSuite(CapabilityExploitationTest.class);
      addTestSuite(CommunicationLinkAllocationTest.class);
      addTestSuite(CommunityOfInterestCompositionTest.class);
      addTestSuite(CommunityOfInterestTest.class);
      addTestSuite(ComponentExchangeAllocationTest.class);
      addTestSuite(ComponentExchangeFunctionalExchangeAllocationTest.class);
      addTestSuite(ComponentExchangeRealizationTest.class);
      addTestSuite(ComponentFunctionalAllocationTest.class);
      addTestSuite(ComponentPortAllocationEndTest.class);
      addTestSuite(ComponentPortAllocationTest.class);
      addTestSuite(ContextInterfaceRealizationTest.class);
      addTestSuite(EntityOperationalCapabilityInvolvementTest.class);
      addTestSuite(FunctionRealizationTest.class);
      addTestSuite(FunctionalChainAbstractCapabilityInvolvementTest.class);
      addTestSuite(FunctionalChainRealizationTest.class);
      addTestSuite(FunctionalExchangeRealizationTest.class);
      addTestSuite(GeneralizationTest.class);
      addTestSuite(InformationRealizationTest.class);
      addTestSuite(InterfaceImplementationTest.class);
      addTestSuite(InterfaceUseTest.class);
      addTestSuite(LogicalActorRealizationTest.class);
      addTestSuite(LogicalArchitectureRealizationTest.class);
      addTestSuite(LogicalComponentRealizationTest.class);
      addTestSuite(LogicalInterfaceRealizationTest.class);
      addTestSuite(OperationAllocationTest.class);
      addTestSuite(OperationalActorRealizationTest.class);
      addTestSuite(OperationalAnalysisRealizationTest.class);
      addTestSuite(OperationalEntityRealizationTest.class);
      addTestSuite(OrganisationalUnitCompositionTest.class);
      addTestSuite(OrganisationalUnitTest.class);
      addTestSuite(PhysicalArchitectureRealizationTest.class);
      addTestSuite(PhysicalArtifactRealizationTest.class);
      addTestSuite(PhysicalLinkRealizationTest.class);
      addTestSuite(PhysicalPathRealizationTest.class);
      addTestSuite(PhysicalPortRealizationTest.class);
      addTestSuite(PortAllocationTest.class);
      addTestSuite(PortRealizationTest.class);
      addTestSuite(RoleAllocationTest.class);
      addTestSuite(ScenarioRealizationTest.class);
      addTestSuite(StateTransitionRealizationTest.class);
      addTestSuite(SystemActorRealizationTest.class);
      addTestSuite(SystemAnalysisRealizationTest.class);
      addTestSuite(SystemCapabilityInvolvementTest.class);
      addTestSuite(SystemCommunicationHookTest.class);
      addTestSuite(SystemComponentCapabilityRealizationInvolvementTest.class);
      addTestSuite(SystemMissionInvolvementTest.class);
      addTestSuite(SystemRealizationTest.class);
      
      addTestSuite(AbstractCapability__extendingTest.class);
      addTestSuite(AbstractCapability__extendsTest.class);
   
     addAdditionalTests();	
  }
	
	
   protected void addAdditionalTests(){
     addTestSuite(DataTypeTest.class);
     addTestSuite(ComponentExchangeTest.class);
   }

  public static Test suite(){
		return new XMLPivotTestSuite();
	}
	
}
