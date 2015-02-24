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

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.capellamodeller.CapellamodellerFactory;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.xmlpivot.common.skeleton.CsModelWalkerFactory;
import org.polarsys.capella.xmlpivot.common.skeleton.CtxModelWalkerFactory;
import org.polarsys.capella.xmlpivot.common.skeleton.DataPkgWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.DefaultModelWalkerHelper;
import org.polarsys.capella.xmlpivot.common.skeleton.EPBSArchitectureWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.EPBSContextWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.EpbsModelWalkerFactory;
import org.polarsys.capella.xmlpivot.common.skeleton.InformationModelWalkerFactory;
import org.polarsys.capella.xmlpivot.common.skeleton.LaModelWalkerFactory;
import org.polarsys.capella.xmlpivot.common.skeleton.LogicalArchitectureWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.LogicalContextWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.LogicalFunctionPkgWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.CapellacommonModelWalkerFactory;
import org.polarsys.capella.xmlpivot.common.skeleton.CapellamodellerModelWalkerFactory;
import org.polarsys.capella.xmlpivot.common.skeleton.OaModelWalkerFactory;
import org.polarsys.capella.xmlpivot.common.skeleton.OperationalActivityPkgWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.OperationalAnalysisWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.PaModelWalkerFactory;
import org.polarsys.capella.xmlpivot.common.skeleton.PartWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.PatchingModelWalkerHelper;
import org.polarsys.capella.xmlpivot.common.skeleton.PhysicalArchitectureWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.PhysicalContextWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.PhysicalFunctionPkgWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.ProjectRepairUtil;
import org.polarsys.capella.xmlpivot.common.skeleton.ProjectWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.StateMachineWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.SystemAnalysisWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.SystemContextWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.SystemEngineeringWalker;
import org.polarsys.capella.xmlpivot.common.skeleton.SystemWalker;

/**
 */
public class ImportAsNewProjectRunner {

  private final PatchingModelWalkerHelper.Factory helperFactory;
  private final ProjectRepairUtil util;
  private final ImportRunner runner;
  
  private Project project;
  private Collection<EObject> hunks;
  
  public ImportAsNewProjectRunner(){
	  CapellacommonModelWalkerFactory capellaCommonWalkerFactory = new CapellacommonModelWalkerFactory(new StateMachineWalker());
	  CapellamodellerModelWalkerFactory capellaModellerModelWalkerFactory = new CapellamodellerModelWalkerFactory(new ProjectWalker(), new SystemEngineeringWalker());
	  OaModelWalkerFactory oaModelWalkerFactory = new OaModelWalkerFactory(new OperationalAnalysisWalker(), new OperationalActivityPkgWalker());
	  LaModelWalkerFactory laModelWalkerFactory = new LaModelWalkerFactory(new LogicalArchitectureWalker(), new LogicalContextWalker(), new LogicalFunctionPkgWalker());
	  PaModelWalkerFactory paModelWalkerFactory = new PaModelWalkerFactory(new PhysicalArchitectureWalker(), new PhysicalContextWalker(), new PhysicalFunctionPkgWalker());
	  CtxModelWalkerFactory ctxModelWalkerFactory = new CtxModelWalkerFactory(new SystemAnalysisWalker(), new SystemWalker(), new SystemContextWalker());
	  InformationModelWalkerFactory informationFactory = new InformationModelWalkerFactory(new DataPkgWalker());
	  EpbsModelWalkerFactory epbsModelWalkerFactory = new EpbsModelWalkerFactory(new EPBSArchitectureWalker(), new EPBSContextWalker());
	  CsModelWalkerFactory csModelWalkerFactory = new CsModelWalkerFactory(new PartWalker());
	  util = new ProjectRepairUtil(capellaCommonWalkerFactory, 
			  capellaModellerModelWalkerFactory, 
			  oaModelWalkerFactory, 
			  laModelWalkerFactory, 
			  paModelWalkerFactory, 
			  ctxModelWalkerFactory, 
			  informationFactory, 
			  epbsModelWalkerFactory, 
			  csModelWalkerFactory);
	  
	  helperFactory = new PatchingModelWalkerHelper.Factory(new DefaultModelWalkerHelper());
	  runner = new ImportRunner();
  }
  
  
  public ImportAsNewProjectRunner(ProjectRepairUtil util_p, PatchingModelWalkerHelper.Factory helperFactory_p, ImportRunner runner_p){
    runner = runner_p;
    helperFactory = helperFactory_p;
    util = util_p;
  }

  /**
   * @param uri_p
   * @param projectName
   * @param dynamic_p
   * @param monitor_p
   * @throws WrappedException exceptions that are thrown while loading the Resource that this uri points to
   */
  public void run(Collection<? extends EObject> input_p, String projectName, boolean dynamic_p, IProgressMonitor monitor_p){
    hunks = runner.run(input_p, dynamic_p, monitor_p);
    for (Iterator<EObject> it = hunks.iterator(); it.hasNext();){
      EObject next = it.next();
      if (next instanceof Project){
        it.remove();
        project = (Project) next;
      }
    }    
    if (project == null){
      project = CapellamodellerFactory.eINSTANCE.createProject(projectName);
    }
    util.repair(project, helperFactory.create(hunks));  
  }

  /**
   * Return the imported project.
   * @return
   */
  public Project getProjectHunk(){
    return project;
  }

  /**
   * Return other hunks produced by the importer.
   * 
   * Any object directly contained in the input that is not a project 
   * will be transformed to a hunk, unless the object is a Capella project.
   */
  public Collection<EObject> getOtherHunks(){
    return Collections.unmodifiableCollection(hunks);
  }

}
