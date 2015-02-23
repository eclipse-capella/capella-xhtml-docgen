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

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacommon.AbstractCapabilityPkg;
import org.polarsys.capella.core.data.capellacommon.Region;
import org.polarsys.capella.core.data.capellacommon.StateMachine;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.ctx.ActorPkg;
import org.polarsys.capella.core.data.ctx.CapabilityPkg;
import org.polarsys.capella.core.data.ctx.MissionPkg;
import org.polarsys.capella.core.data.ctx.System;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemContext;
import org.polarsys.capella.core.data.ctx.SystemFunction;
import org.polarsys.capella.core.data.ctx.SystemFunctionPkg;
import org.polarsys.capella.core.data.epbs.ConfigurationItem;
import org.polarsys.capella.core.data.epbs.EPBSArchitecture;
import org.polarsys.capella.core.data.epbs.EPBSContext;
import org.polarsys.capella.core.data.fa.AbstractFunctionalArchitecture;
import org.polarsys.capella.core.data.fa.FunctionPkg;
import org.polarsys.capella.core.data.la.LogicalActorPkg;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.data.la.LogicalContext;
import org.polarsys.capella.core.data.la.LogicalFunction;
import org.polarsys.capella.core.data.la.LogicalFunctionPkg;
import org.polarsys.capella.core.data.oa.EntityPkg;
import org.polarsys.capella.core.data.oa.OperationalActivity;
import org.polarsys.capella.core.data.oa.OperationalActivityPkg;
import org.polarsys.capella.core.data.oa.OperationalAnalysis;
import org.polarsys.capella.core.data.oa.OperationalCapabilityPkg;
import org.polarsys.capella.core.data.oa.OperationalContext;
import org.polarsys.capella.core.data.oa.RolePkg;
import org.polarsys.capella.core.data.pa.PhysicalActorPkg;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalContext;
import org.polarsys.capella.core.data.pa.PhysicalFunction;
import org.polarsys.capella.core.data.pa.PhysicalFunctionPkg;

/**
 * A ModelWalkerHelper that takes requested elements from a list of provided EObject 
 * before delegating the request to another provider.
 * 
 */
public class PatchingModelWalkerHelper extends ModelWalkerHelperWrapper {

  private final Collection<? extends EObject> provided;
  
  /**
   * @param delegate_p
   */
  public PatchingModelWalkerHelper(ModelWalkerHelper delegate_p, Collection<? extends EObject> provided_p) {
    super(delegate_p);
    provided = provided_p;
  }

  protected <T> T popFirstProvidedInstance(Class<T> clazz){
    for (Iterator<? extends EObject> it = provided.iterator(); it.hasNext();){
      EObject next = it.next();
      if (clazz.isInstance(next)){
        it.remove();
        return clazz.cast(next);
      }
    }
    return null;
  }

  @Override
  public ConfigurationItem getConfigurationItem() {
    ConfigurationItem item = popFirstProvidedInstance(ConfigurationItem.class);
    if (item == null){
      item = super.getConfigurationItem();
    }
    return item;
  }

  @Override
  public EPBSContext getEPBSContext() {
    EPBSContext context = popFirstProvidedInstance(EPBSContext.class);
    if (context == null){
      context = super.getEPBSContext();
    }
    return context;
  }

  @Override
  public LogicalComponent getLogicalComponent() {
    LogicalComponent lc = popFirstProvidedInstance(LogicalComponent.class);
    if (lc == null){
      lc = super.getLogicalComponent();
    }
    return lc;
  }

  @Override
  public LogicalContext getLogicalContext() {
    LogicalContext lc = popFirstProvidedInstance(LogicalContext.class);
    if (lc == null){
      lc = super.getLogicalContext();
    }
    return lc;
  }

  @Override
  public LogicalActorPkg getLogicalActorPkg() {
    LogicalActorPkg actorPkg = popFirstProvidedInstance(LogicalActorPkg.class);
    if (actorPkg == null){
      actorPkg = super.getLogicalActorPkg();
    }
    return actorPkg;
  }

  @Override
  public LogicalFunction getLogicalFunction() {
    LogicalFunction lf = popFirstProvidedInstance(LogicalFunction.class);
    if (lf == null){
      lf = super.getLogicalFunction();
    }
    return lf;
  }

  @Override
  public OperationalActivity getOperationalActivity() {
     OperationalActivity activity = popFirstProvidedInstance(OperationalActivity.class);
     if (activity == null){
       activity = super.getOperationalActivity();
     } 
     return activity;
  }

  @Override
  public RolePkg getRolePkg() {
    RolePkg pkg = popFirstProvidedInstance(RolePkg.class);
    if (pkg == null){
      pkg = super.getRolePkg();
    }
    return pkg;
  }

  @Override
  public EntityPkg getEntityPkg() {
    EntityPkg pkg = popFirstProvidedInstance(EntityPkg.class);
    if (pkg == null){
      pkg = super.getEntityPkg();
    }
    return pkg;
  }

  @Override
  public OperationalContext getOperationalContext() {
    OperationalContext context = popFirstProvidedInstance(OperationalContext.class);
    if (context == null){
      context = super.getOperationalContext();
    }
    return context;
  }

  @Override
  public AbstractCapabilityPkg getAbstractCapabilityPkg(BlockArchitecture arch_p) {
 
    AbstractCapabilityPkg pkg = null;
    if (arch_p instanceof OperationalAnalysis){
      pkg = popFirstProvidedInstance(OperationalCapabilityPkg.class);
    } else if (arch_p instanceof SystemAnalysis){
      pkg = popFirstProvidedInstance(CapabilityPkg.class);
    }
    
    // For LA/PA/EPBS, it's always CapabilityRealizationPkg,
    // so it's ambigous. We don't handle that case and let
    // our delegate do its job.
    
    if (pkg == null){
      pkg = super.getAbstractCapabilityPkg(arch_p);
    }
    return pkg;
  }

  @Override
  public FunctionPkg getFunctionPkg(AbstractFunctionalArchitecture arch_p) {
    FunctionPkg pkg = null;
    if (arch_p instanceof OperationalAnalysis){
      pkg = popFirstProvidedInstance(OperationalActivityPkg.class);
    } else if (arch_p instanceof SystemAnalysis){
      pkg = popFirstProvidedInstance(SystemFunctionPkg.class);
    } else if (arch_p instanceof LogicalArchitecture){
      pkg = popFirstProvidedInstance(LogicalFunctionPkg.class);
    } else if (arch_p instanceof PhysicalArchitecture){
      pkg = popFirstProvidedInstance(PhysicalFunctionPkg.class);
    }
    if (pkg == null){
      pkg = super.getFunctionPkg(arch_p);
    }
    return pkg;
  }

  @Override
  public MissionPkg getMissionPkg() {
    MissionPkg missionPkg = popFirstProvidedInstance(MissionPkg.class);
    if (missionPkg == null){
      missionPkg = super.getMissionPkg();
    }
    return missionPkg;
  }

  @Override
  public ActorPkg getActorPkg() {
    ActorPkg actorPkg = popFirstProvidedInstance(ActorPkg.class);
    if (actorPkg == null){
      actorPkg = super.getActorPkg();
    }
    return actorPkg;
  }

  @Override
  public SystemContext getSystemContext() {
    SystemContext context = popFirstProvidedInstance(SystemContext.class);
    if (context == null){
      context = super.getSystemContext();
    }
    return context;
  }

  @Override
  public System getSystem() {
    System system = popFirstProvidedInstance(System.class);
    if (system == null){
      system = super.getSystem();
    }
    return system;
  }

  @Override
  public PhysicalActorPkg getPhysicalActorPkg() {
    PhysicalActorPkg actorPkg = popFirstProvidedInstance(PhysicalActorPkg.class);
    if (actorPkg == null){
      actorPkg = super.getPhysicalActorPkg();
    }
    return actorPkg;
  }

  @Override
  public PhysicalComponent getPhysicalComponent() {
    PhysicalComponent component = popFirstProvidedInstance(PhysicalComponent.class);
    if (component == null){
      component = super.getPhysicalComponent();
    }
    return component;
  }

  @Override
  public PhysicalContext getPhysicalContext() {
    PhysicalContext context = popFirstProvidedInstance(PhysicalContext.class);
    if (context == null){
      context = super.getPhysicalContext();
    }
    return context;
  }

  @Override
  public PhysicalFunction getPhysicalFunction() {
    PhysicalFunction pf = popFirstProvidedInstance(PhysicalFunction.class);
    if (pf == null){
      pf = super.getPhysicalFunction();
    }
    return pf;
  }

  @Override
  public SystemEngineering getSystemEngineering() {
    SystemEngineering se = popFirstProvidedInstance(SystemEngineering.class);
    if (se == null){
      se = super.getSystemEngineering();
    }
    return se;
  }

  @Override
  public Region getRegion() {
    Region region = popFirstProvidedInstance(Region.class);
    if (region == null){
      region = super.getRegion();
    }
    return region;
  }

  @Override
  public OperationalAnalysis getOperationalAnalysis() {
    OperationalAnalysis oa = popFirstProvidedInstance(OperationalAnalysis.class);
    if (oa == null){
      oa = super.getOperationalAnalysis();
    }
    return oa;
  }

  @Override
  public SystemAnalysis getSystemAnalysis() {
    SystemAnalysis sa = popFirstProvidedInstance(SystemAnalysis.class);
    if (sa == null){
      sa = super.getSystemAnalysis();
    }
    return sa;
  }

  @Override
  public LogicalArchitecture getLogicalArchitecture() {
    LogicalArchitecture archi = popFirstProvidedInstance(LogicalArchitecture.class);
    if (archi == null){
      archi = super.getLogicalArchitecture();
    }
    return archi;
  }

  @Override
  public PhysicalArchitecture getPhysicalArchitecture() {
    PhysicalArchitecture archi = popFirstProvidedInstance(PhysicalArchitecture.class);
    if (archi == null){
      archi = super.getPhysicalArchitecture();
    }
    return archi;
  }

  @Override
  public EPBSArchitecture getEPBSArchitecture() {
    EPBSArchitecture archi = popFirstProvidedInstance(EPBSArchitecture.class);
    if (archi == null){
      archi = super.getEPBSArchitecture();
    }
    return archi;
  }

  
  @Override
  public SystemFunction getSystemFunction() {
    SystemFunction sf = popFirstProvidedInstance(SystemFunction.class);
    if (sf == null){
      sf = super.getSystemFunction();
    }
    return sf;
  }
  

  @Override
  public StateMachine getStateMachine() {
    StateMachine sm = popFirstProvidedInstance(StateMachine.class);
    if (sm == null){
      sm = super.getStateMachine();
    }
    return sm;
  }


  public static class Factory {
    
    private final ModelWalkerHelper delegateProvider;
    
    public Factory(ModelWalkerHelper delegateProvider_p){
      delegateProvider = delegateProvider_p;
    }
    
    public PatchingModelWalkerHelper create(Collection<? extends EObject> provided_p){
      return new PatchingModelWalkerHelper(delegateProvider, provided_p);
    }
  } 
}
