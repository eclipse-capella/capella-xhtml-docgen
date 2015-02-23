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
package org.polarsys.capella.xmlpivot.merge;

import org.eclipse.compare.CompareEditorInput;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.diffmerge.ui.specification.IComparisonMethod;
import org.eclipse.emf.diffmerge.ui.specification.ext.ResourceScopeDefinition;
import org.eclipse.emf.diffmerge.ui.specification.ext.URIScopeDefinition;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.polarsys.capella.xmlpivot.ResourceLoader;
import org.polarsys.capella.xmlpivot.importer.ImportAsNewProjectRunner;
import org.polarsys.capella.xmlpivot.merge.specification.XMLPivotComparisonFactory;
import org.polarsys.capella.xmlpivot.merge.temp.XMLPivotDiffMergeEditorInput;


public class CompareEditorInputFactory {

  private final ImportAsNewProjectRunner importAsNewProjectRunner;
  private final ResourceLoader loader;
  private final EditingDomain editingDomain;

  public CompareEditorInputFactory(EditingDomain domain, ImportAsNewProjectRunner importAsNewProjectRunner_p, ResourceLoader loader_p) {
    importAsNewProjectRunner = importAsNewProjectRunner_p;
    loader = loader_p;
    editingDomain = domain;
  }

  public CompareEditorInput create(URI capellaModelURI, URI pivotModelURI, boolean dynamic, ResourceSet set_p, IProgressMonitor monitor_p) {
    SubMonitor monitor = SubMonitor.convert(monitor_p, 100);
    Resource xmlPivotResource = loader.load(set_p, pivotModelURI);
    importAsNewProjectRunner.run(xmlPivotResource.getContents(), "XML Pivot Import", dynamic, monitor.newChild(100));
    xmlPivotResource.unload();

    // we have to create a temp resource and add it to the MDE resource set for editing support
    final Resource imported = new ResourceImpl(URI.createURI("xmlPivotSource_" + pivotModelURI.lastSegment() + "_" + EcoreUtil.generateUUID(), true));
    imported.getContents().add(importAsNewProjectRunner.getProjectHunk());
    imported.getContents().addAll(importAsNewProjectRunner.getOtherHunks());
    editingDomain.getResourceSet().getResources().add(imported);

    IComparisonMethod spec =
        new XMLPivotComparisonFactory().createComparisonMethod(new URIScopeDefinition(capellaModelURI, null, true), new ResourceScopeDefinition(imported,
            "XML Pivot Import", false), null);
    return new XMLPivotDiffMergeEditorInput(spec) {
      @Override
      public void disposeResources() {
        super.disposeResources();
        editingDomain.getResourceSet().getResources().remove(imported);
      }
    };
  }
}
