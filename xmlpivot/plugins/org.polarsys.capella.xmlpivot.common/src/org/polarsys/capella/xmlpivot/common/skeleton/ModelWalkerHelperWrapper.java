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
package org.polarsys.capella.xmlpivot.common.skeleton;

import org.polarsys.capella.core.data.capellacommon.AbstractCapabilityPkg;
import org.polarsys.capella.core.data.capellacommon.Region;
import org.polarsys.capella.core.data.capellacommon.StateMachine;
import org.polarsys.capella.core.data.capellacore.Classifier;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.cs.InterfacePkg;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.ctx.ActorPkg;
import org.polarsys.capella.core.data.ctx.MissionPkg;
import org.polarsys.capella.core.data.ctx.System;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemContext;
import org.polarsys.capella.core.data.ctx.SystemFunction;
import org.polarsys.capella.core.data.epbs.ConfigurationItem;
import org.polarsys.capella.core.data.epbs.EPBSArchitecture;
import org.polarsys.capella.core.data.epbs.EPBSContext;
import org.polarsys.capella.core.data.fa.AbstractFunctionalArchitecture;
import org.polarsys.capella.core.data.fa.FunctionPkg;
import org.polarsys.capella.core.data.information.DataPkg;
import org.polarsys.capella.core.data.la.LogicalActorPkg;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.data.la.LogicalContext;
import org.polarsys.capella.core.data.la.LogicalFunction;
import org.polarsys.capella.core.data.oa.EntityPkg;
import org.polarsys.capella.core.data.oa.OperationalActivity;
import org.polarsys.capella.core.data.oa.OperationalAnalysis;
import org.polarsys.capella.core.data.oa.OperationalContext;
import org.polarsys.capella.core.data.oa.RolePkg;
import org.polarsys.capella.core.data.pa.PhysicalActorPkg;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalContext;
import org.polarsys.capella.core.data.pa.PhysicalFunction;

/**
 *
 */
public class ModelWalkerHelperWrapper implements ModelWalkerHelper {
  
  private final ModelWalkerHelper delegate;
  
  public ModelWalkerHelperWrapper(ModelWalkerHelper delegate_p){
    delegate = delegate_p;
  }

  @Override
  public Part getPart(Classifier classifier_p) {
    return delegate.getPart(classifier_p);
  }

  @Override
  public ConfigurationItem getConfigurationItem() {
    return delegate.getConfigurationItem();
  }

  @Override
  public EPBSContext getEPBSContext() {
    return delegate.getEPBSContext();
  }

  @Override
  public InterfacePkg getInterfacePkg() {
    return delegate.getInterfacePkg();
  }

  @Override
  public DataPkg getDataPkg() {
    return delegate.getDataPkg();
  }

  @Override
  public LogicalComponent getLogicalComponent() {
    return delegate.getLogicalComponent();
  }

  @Override
  public LogicalContext getLogicalContext() {
    return delegate.getLogicalContext();
  }

  @Override
  public LogicalActorPkg getLogicalActorPkg() {
    return delegate.getLogicalActorPkg();
  }

  @Override
  public LogicalFunction getLogicalFunction() {
    return delegate.getLogicalFunction();
  }

  @Override
  public OperationalActivity getOperationalActivity() {
    return delegate.getOperationalActivity();
  }

  @Override
  public RolePkg getRolePkg() {
    return delegate.getRolePkg();
  }

  @Override
  public EntityPkg getEntityPkg() {
    return delegate.getEntityPkg();
  }

  @Override
  public OperationalContext getOperationalContext() {
    return delegate.getOperationalContext();
  }

  @Override
  public AbstractCapabilityPkg getAbstractCapabilityPkg(BlockArchitecture arch_p) {
    return delegate.getAbstractCapabilityPkg(arch_p);
  }

  @Override
  public FunctionPkg getFunctionPkg(AbstractFunctionalArchitecture arch_p) {
    return delegate.getFunctionPkg(arch_p);
  }

  @Override
  public MissionPkg getMissionPkg() {
    return delegate.getMissionPkg();
  }

  @Override
  public ActorPkg getActorPkg() {
    return delegate.getActorPkg();
  }

  @Override
  public SystemContext getSystemContext() {
    return delegate.getSystemContext();
  }

  @Override
  public System getSystem() {
    return delegate.getSystem();
  }

  @Override
  public PhysicalActorPkg getPhysicalActorPkg() {
    return delegate.getPhysicalActorPkg();
  }

  @Override
  public PhysicalComponent getPhysicalComponent() {
    return delegate.getPhysicalComponent();
  }

  @Override
  public PhysicalContext getPhysicalContext() {
    return delegate.getPhysicalContext();
  }

  @Override
  public PhysicalFunction getPhysicalFunction() {
    return delegate.getPhysicalFunction();
  }

  @Override
  public SystemEngineering getSystemEngineering() {
    return delegate.getSystemEngineering();
  }

  @Override
  public Region getRegion() {
    return delegate.getRegion();
  }

  @Override
  public OperationalAnalysis getOperationalAnalysis() {
    return delegate.getOperationalAnalysis();
  }

  @Override
  public SystemAnalysis getSystemAnalysis() {
    return delegate.getSystemAnalysis();
  }

  @Override
  public LogicalArchitecture getLogicalArchitecture() {
    return delegate.getLogicalArchitecture();
  }

  @Override
  public PhysicalArchitecture getPhysicalArchitecture() {
    return delegate.getPhysicalArchitecture();
  }

  @Override
  public EPBSArchitecture getEPBSArchitecture() {
    return delegate.getEPBSArchitecture();
  }

  @Override
  public SystemFunction getSystemFunction() {
    return delegate.getSystemFunction();
  }

  @Override
  public StateMachine getStateMachine() {
    return delegate.getStateMachine();
  }
}
