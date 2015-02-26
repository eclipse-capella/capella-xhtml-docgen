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
package org.polarsys.capella.transition.system2subsystem.multiphases.handlers.traceability.config;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.core.data.capellacore.Structure;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.InterfacePkg;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionPkg;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.capella.core.transition.common.handlers.traceability.ITraceabilityHandler;
import org.polarsys.capella.transition.system2subsystem.multiphases.MultiphasesContext;
import org.polarsys.capella.transition.system2subsystem.multiphases.MultiphasesContext.Mapping;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;

public class RecTraceabilityHandler implements ITraceabilityHandler {

  private final Map<MultiphasesContext.Mapping, SetMultimap<EObject, EObject>> mappingToTraceability = new HashMap<Mapping, SetMultimap<EObject, EObject>>();

  @Override
  public IStatus init(IContext context_p) {
    return Status.OK_STATUS;
  }

  @Override
  public IStatus dispose(IContext context_p) {
    return Status.OK_STATUS;
  }

  @Override
  public void attachTraceability(EObject sourceElement_p, EObject targetElement_p, IContext context_p) {
    throw new UnsupportedOperationException("This handler is read only");
  }

  private SetMultimap<EObject, EObject> initTraceabilityMap(MultiphasesContext context_p) {
    SetMultimap<EObject, EObject> map = HashMultimap.create();

    BlockArchitecture targetBlockArchitecture = context_p.getTempBlockArchitecture();
    PhysicalArchitecture sourcePA = context_p.getSourcePhysicalArchitecture();

    map.put(sourcePA, targetBlockArchitecture);

    FunctionPkg sourceFunctionPkg = BlockArchitectureExt.getFunctionPkg(sourcePA, false);
    FunctionPkg targetFunctionPkg = BlockArchitectureExt.getFunctionPkg(targetBlockArchitecture, false);
    if ((sourceFunctionPkg != null) && (targetFunctionPkg != null)) {
      map.put(sourceFunctionPkg, targetFunctionPkg);
    }

    AbstractFunction sourceFunction = BlockArchitectureExt.getRootFunction(sourcePA, false);
    AbstractFunction targetFunction = BlockArchitectureExt.getRootFunction(targetBlockArchitecture, false);
    if ((sourceFunction != null) && (targetFunction != null)) {
      map.put(sourceFunction, targetFunction);
    }

    Structure sourceActorPkg = BlockArchitectureExt.getActorPkg(sourcePA, false);
    Structure targetActorPkg = BlockArchitectureExt.getActorPkg(targetBlockArchitecture, false);
    if ((sourceActorPkg != null) && (targetActorPkg != null)) {
      map.put(sourceActorPkg, targetActorPkg);
    }

    Component sourceContext = BlockArchitectureExt.getContext(sourcePA, false);
    Component targetContext = BlockArchitectureExt.getContext(targetBlockArchitecture, false);
    if ((sourceContext != null) && (targetContext != null)) {
      map.put(sourceContext, targetContext);
    }

    InterfacePkg sourceInterfacePkg = BlockArchitectureExt.getInterfacePkg(sourcePA, false);
    InterfacePkg targetInterfacePkg = BlockArchitectureExt.getInterfacePkg(targetBlockArchitecture, false);
    if ((sourceInterfacePkg != null) && (targetInterfacePkg != null)) {
      map.put(sourceInterfacePkg, targetInterfacePkg);
    }

    Structure sourceRequirementsPkg = BlockArchitectureExt.getRequirementsPkg(sourcePA, false);
    Structure targetRequirementsPkg = BlockArchitectureExt.getRequirementsPkg(targetBlockArchitecture, false);
    if ((sourceRequirementsPkg != null) && (targetRequirementsPkg != null)) {
      map.put(sourceRequirementsPkg, targetRequirementsPkg);
    }

    Structure sourceCapabilityPkg = BlockArchitectureExt.getAbstractCapabilityPkg(sourcePA, false);
    Structure targetCapabilityPkg = BlockArchitectureExt.getAbstractCapabilityPkg(targetBlockArchitecture, false);
    if ((sourceCapabilityPkg != null) && (targetCapabilityPkg != null)) {
      map.put(sourceCapabilityPkg, targetCapabilityPkg);
    }

    // all root data packages are mapped to the target system analysis data pkg
    map.put(context_p.getSourcePhysicalArchitecture().getOwnedDataPkg(), context_p.getTempSystemAnalysis().getOwnedDataPkg());
    map.put(context_p.getSourceSystemAnalysis().getOwnedDataPkg(), context_p.getTempSystemAnalysis().getOwnedDataPkg());
    map.put(context_p.getSourceLogicalArchitecture().getOwnedDataPkg(), context_p.getTempSystemAnalysis().getOwnedDataPkg());

    initializeDataTypes(context_p.getSourceSystemAnalysis().getOwnedDataPkg(), context_p.getTempSystemAnalysis().getOwnedDataPkg(), map);
    initializeDataTypes(context_p.getSourceLogicalArchitecture().getOwnedDataPkg(), context_p.getTempSystemAnalysis().getOwnedDataPkg(), map);
    initializeDataTypes(context_p.getSourcePhysicalArchitecture().getOwnedDataPkg(), context_p.getTempSystemAnalysis().getOwnedDataPkg(), map);

    return map;
  }

  protected void initializeDataTypes(EObject source_p, EObject target_p, SetMultimap<EObject, EObject> map_p) {
    if (source_p.eClass() == target_p.eClass()) {

      map_p.put(source_p, target_p);

      for (EReference reference : source_p.eClass().getEAllContainments()) {
        if (!reference.isMany()) {
          EObject sourceValue = (EObject) source_p.eGet(reference);
          EObject targetValue = (EObject) target_p.eGet(reference);
          if ((sourceValue != null) && (targetValue != null)) {
            if (sourceValue.eClass() == targetValue.eClass()) {
              initializeDataTypes(sourceValue, targetValue, map_p);
            }
          }
        } else {
          Object sourceValue = source_p.eGet(reference);
          Object targetValue = target_p.eGet(reference);
          if ((sourceValue instanceof EList) && (targetValue instanceof EList)) {
            EList<?> sourceList = (EList<?>) sourceValue;
            EList<?> targetList = (EList<?>) targetValue;
            for (int i = 0; i < sourceList.size(); i++) {
              sourceValue = sourceList.get(i);
              if ((sourceValue != null) && (sourceValue instanceof EObject)) {
                EObject sourceObject = (EObject) sourceValue;
                //We try to find a element with same type and same name if any 
                for (int j = 0; j < targetList.size(); j++) {
                  EObject targetObject = (EObject) targetList.get(j);
                  if ((targetObject instanceof AbstractNamedElement) && (sourceObject instanceof AbstractNamedElement)) {
                    AbstractNamedElement sourceNamed = (AbstractNamedElement) sourceObject;
                    AbstractNamedElement targetNamed = (AbstractNamedElement) targetObject;
                    if (((sourceNamed.getName() == null) && (targetNamed.getName() == null))
                        || ((sourceNamed.getName() != null) && sourceNamed.getName().equals(targetNamed.getName()))) {
                      initializeDataTypes(sourceObject, targetObject, map_p);
                      break;
                    }
                  } else {
                    initializeDataTypes(sourceObject, targetObject, map_p);
                    break;
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  @Override
  public Set<EObject> retrieveTracedElements(EObject source_p, IContext context_p) {
    MultiphasesContext mcontext = (MultiphasesContext) context_p;
    Mapping currentMapping = mcontext.getMapping();
    if (mappingToTraceability.get(currentMapping) == null) {
      mappingToTraceability.put(currentMapping, initTraceabilityMap(mcontext));
    }
    SetMultimap<EObject, EObject> traceability = mappingToTraceability.get(currentMapping);
    return traceability.get(source_p);
  }

  @Override
  public Collection<EObject> retrieveTracedElements(EObject source_p, IContext context_p, EClass clazz) {
    return Collections2.filter(retrieveTracedElements(source_p, context_p), Predicates.instanceOf(clazz.getInstanceClass()));
  }

  @Override
  public final boolean isTraced(EObject element_p, IContext context_p) {
    return retrieveTracedElements(element_p, context_p).size() > 0;
  }

  @Override
  public Collection<EObject> retrieveSourceElements(EObject source_p, IContext context_p) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getId(EObject element_p, IContext context_p) {
    throw new UnsupportedOperationException();
  }

}
