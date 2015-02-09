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
package org.polarsys.capella.transition.system2subsystem.crossphases.handlers.traceability.config;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.epbs.EPBSArchitecture;
import org.polarsys.capella.core.data.information.DataPkg;
import org.polarsys.capella.core.data.information.Partition;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.capella.core.model.helpers.SystemEngineeringExt;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.traceability.ITraceabilityHandler;
import org.polarsys.capella.core.transition.system.handlers.traceability.ReconciliationTraceabilityHandler;
import org.polarsys.capella.core.transition.system.handlers.traceability.SIDTraceabilityHandler;
import org.polarsys.capella.core.transition.system.handlers.traceability.config.MergeTargetConfiguration;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 *
 */
public class TargetConfiguration extends MergeTargetConfiguration {

  protected class CrossPhasesTargetReconciliationTraceabilityHandler extends ReconciliationTraceabilityHandler {
    /**
       * @param identifier_p
       */
    public CrossPhasesTargetReconciliationTraceabilityHandler(String identifier_p) {
      super(identifier_p);
    }

    @Override
    protected void initializeSystemEngineering(SystemEngineering source_p, SystemEngineering target_p, IContext context_p, LevelMappingTraceability map_p) {
      addMapping(map_p, getSourceArchitecture(source_p, context_p), SystemEngineeringExt.getOwnedSystemAnalysis(target_p), context_p);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void initializeBlockArchitecture(BlockArchitecture source_p, BlockArchitecture target_p, IContext context_p, LevelMappingTraceability map_p) {
      super.initializeBlockArchitecture(source_p, target_p, context_p, map_p);

      //Add mapping between both predefined data pkg
      DataPkg sourceDataType = getSourcePredefinedDataPkg(source_p);
      DataPkg targetDataType = getTargetPredefinedDataPkg(target_p);
      if ((sourceDataType != null) && (targetDataType != null)) {
        initializeDataType(sourceDataType, targetDataType, context_p, map_p);
      }

      Component sourceComponent = getSourceComponent(source_p, context_p);
      Component targetComponent = BlockArchitectureExt.getFirstComponent(target_p);
      if ((sourceComponent != null) && (targetComponent != null)) {
        if ((!map_p.contains(sourceComponent)) && (!map_p.contains(targetComponent))) {
          addMapping(map_p, sourceComponent, targetComponent, context_p);
        }
      }

      if ((sourceComponent != null) && (sourceComponent.getRepresentingPartitions().size() == 1)) {
        if ((targetComponent != null) && (targetComponent.getRepresentingPartitions().size() == 1)) {
          Partition sourcePartition = sourceComponent.getRepresentingPartitions().get(0);
          Partition targetPartition = targetComponent.getRepresentingPartitions().get(0);
          addMapping(map_p, sourcePartition, targetPartition, context_p);
        }
      }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void initializeRootMappings(IContext context_p) {
      super.initializeRootMappings(context_p);
      EObject source = (EObject) context_p.get(ITransitionConstants.TRANSITION_SOURCE_ROOT);
      EObject target = (EObject) context_p.get(ITransitionConstants.TRANSITION_TARGET_ROOT);
      addMappings(source, target, context_p);
    }
  }

  protected class CrossPhasesTargetSIDTraceabilityHandler extends TargetSIDTraceabilityHandler {

    /**
     * @param identifier_p
     */
    public CrossPhasesTargetSIDTraceabilityHandler(String identifier_p) {
      super(identifier_p);
    }

    @Override
    protected boolean initTraceabilityMapping(EObject source_p, EObject target_p, IContext context_p) {
      boolean result = super.initTraceabilityMapping(source_p, target_p, context_p);

      if (result) {
        //Any mapping from others phases than SystemAnalysis is useless
        BlockArchitecture architectureTarget = BlockArchitectureExt.getRootBlockArchitecture(target_p);
        result = (architectureTarget == null) || CtxPackage.Literals.SYSTEM_ANALYSIS.isInstance(architectureTarget);
      }

      return result;
    }
  }

  protected BlockArchitecture getSourceArchitecture(SystemEngineering source_p, IContext context_p) {
    BlockArchitecture architecture = SystemEngineeringExt.getOwnedPhysicalArchitecture(source_p);
    Collection<EObject> selection = (Collection<EObject>) context_p.get(ITransitionConstants.TRANSITION_SOURCES);
    if (selection.size() > 0) {
      // Initialize source of transition
      EObject source = (EObject) selection.toArray()[0];
      architecture = BlockArchitectureExt.getRootBlockArchitecture(source);
      if (architecture instanceof EPBSArchitecture) {
        architecture = SystemEngineeringExt.getOwnedPhysicalArchitecture(source_p);
      }
    }
    return architecture;
  }

  protected Component getSourceComponent(BlockArchitecture architecture, IContext context_p) {
    Component component = BlockArchitectureExt.getFirstComponent(architecture);

    Collection<EObject> selection = (Collection<EObject>) context_p.get(ITransitionConstants.TRANSITION_SOURCES);
    if (selection.size() > 0) {
      // Initialize source of transition
      EObject source = (EObject) selection.toArray()[0];

      if ((source instanceof Component)) {
        component = (Component) source;
      }
    }
    return component;
  }

  protected DataPkg getTargetPredefinedDataPkg(BlockArchitecture source_p) {
    DataPkg dataPkg = BlockArchitectureExt.getDataPkg(source_p);
    for (DataPkg child : dataPkg.getOwnedDataPkgs()) {
      if (child.getName().equals("Predefined Types")) {
        return child;
      }
    }
    return null;
  }

  protected DataPkg getSourcePredefinedDataPkg(BlockArchitecture target_p) {
    DataPkg dataPkg = BlockArchitectureExt.getDataPkg(SystemEngineeringExt.getOwnedSystemAnalysis(SystemEngineeringExt.getSystemEngineering(target_p)));
    for (DataPkg child : dataPkg.getOwnedDataPkgs()) {
      if (child.getName().equals("Predefined Types")) {
        return child;
      }
    }
    return null;
  }

  @Override
  protected void initHandlers(IContext fContext_p) {
    addHandler(fContext_p, new CrossPhasesTargetReconciliationTraceabilityHandler(getIdentifier(fContext_p)));
    addHandler(fContext_p, new CrossPhasesTargetSIDTraceabilityHandler(getIdentifier(fContext_p)));
  }

  @Override
  public boolean useHandlerForSourceElements(EObject source_p, ITraceabilityHandler handler_p, IContext context_p) {
    boolean result = super.useHandlerForSourceElements(source_p, handler_p, context_p);

    if (result) {
      if (handler_p instanceof SIDTraceabilityHandler) {
        //Any mapping from others phases than SystemAnalysis is useless
        BlockArchitecture architectureTarget = BlockArchitectureExt.getRootBlockArchitecture(source_p);
        result = (architectureTarget == null) || CtxPackage.Literals.SYSTEM_ANALYSIS.isInstance(architectureTarget);
      }
    }

    return result;
  }

}
