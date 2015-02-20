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
package org.polarsys.capella.xmlpivot.importer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.data.interaction.SequenceMessage;
import org.polarsys.capella.xmlpivot.XMLPivotActivator;
import org.polarsys.capella.xmlpivot.extraction.BasicConceptualMapping;
import org.polarsys.capella.xmlpivot.extraction.ConceptualMapping;
import org.polarsys.capella.xmlpivot.extraction.MemoizingConceptualMapping;


/**
 */
public class ImportRunner {
  
  /**
  * @param monitor_p the progress monitor to use for reporting progress to the user. It is the caller's responsibility
    to call done() on the given monitor. Accepts null, indicating that no progress should be
    reported and that the operation cannot be cancelled.
  */
  public Collection<EObject> run(Collection<? extends EObject> xmlPivotObjects, boolean dynamic_p, IProgressMonitor monitor_p){
    
    SubMonitor progress = SubMonitor.convert(monitor_p, "XML Pivot Import", 100);
    ConceptualMapping mapping = null;
    if (dynamic_p){
      mapping = XMLPivotActivator.getDefault().getDynamicConceptualMapping();
    } else {
      mapping = new MemoizingConceptualMapping(new BasicConceptualMapping(EPackage.Registry.INSTANCE));
    }
    ImportEngine engine = new ImportEngine(mapping);
      
    engine.copyAll(xmlPivotObjects);
    progress.worked(25);
    engine.copyReferences();
    progress.worked(25);
    engine.repair();
    progress.worked(25);
    Collection<EObject> result = new ArrayList<EObject>(); 
    for (EObject e : engine.values()){
      if (e.eContainer() == null){
        result.add(e);
      }
    }
    for (EObject e : engine.getOrphanedRecreatedAssociationLinks()){
      if (e.eContainer() == null){
        result.add(e);
      }
    }

    /* after everything has been imported, we remove unwanted scenario contents */
    cleanScenarios(result);
    
    monitor_p.worked(25);
    return result;
  }

  
  /*
   * Removes all Sequence messages and their direct and indirect contents.
   * Care must be taken to also clean any crossreferences to the removed
   * elements.
   */
  private void cleanScenarios(Collection<EObject> result){
    ECrossReferenceAdapter adapter = new ECrossReferenceAdapter();
    for (EObject e : result){
      e.eAdapters().add(adapter);
    }
    for (TreeIterator<EObject> it = EcoreUtil.getAllContents(result); it.hasNext();){
      EObject next = it.next();
      if (next instanceof Scenario){
        it.prune();
        for (SequenceMessage child : ((Scenario)next).getOwnedMessages()){
          for (Iterator<EObject> smIt = EcoreUtil.getAllContents(Collections.singleton(child)); smIt.hasNext();){
            EObject smContent = smIt.next();
            // need to copy the settings to avoid concurrent modification exceptions
            for (EStructuralFeature.Setting setting : new ArrayList<EStructuralFeature.Setting>(adapter.getInverseReferences(smContent))){
              EObject holder = setting.getEObject();
              EReference feature = (EReference) setting.getEStructuralFeature();
              if (!feature.isContainer() && !feature.isContainment()){
                if (feature.isMany()){
                  ((List<?>) holder.eGet(feature)).remove(smContent);
                } else {
                  holder.eUnset(feature);
                }
              }
            }
          }
        }
        ((Scenario) next).getOwnedMessages().clear();
      }
    }
    for (EObject e : result){
      e.eAdapters().remove(adapter);
    }
  }
}
