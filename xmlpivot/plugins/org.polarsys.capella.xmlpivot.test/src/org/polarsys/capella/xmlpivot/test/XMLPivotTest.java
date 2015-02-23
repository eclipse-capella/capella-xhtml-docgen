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

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.xmlpivot.XMLPivotActivator;
import org.polarsys.capella.xmlpivot.common.predicates.EMFPredicates;
import org.polarsys.capella.xmlpivot.exporter.AbstractExporter;
import org.polarsys.capella.xmlpivot.exporter.AbstractIncrementalExporter;
import org.polarsys.capella.xmlpivot.exporter.DefaultIncrementor;
import org.polarsys.capella.xmlpivot.exporter.ExportEngine;
import org.polarsys.capella.xmlpivot.importer.ImportEngine;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;

import junit.framework.TestCase;

/**
 *
 */
public class XMLPivotTest extends TestCase {
   
  protected Collection<EObject> exporter(Collection<? extends EObject> technicalModel) throws Exception {
    ExportEngine engine = new ExportEngine(XMLPivotActivator.getDefault().getDynamicConceptualMapping());
    Function<Collection<? extends EObject>, Iterator<? extends EObject>> incrementor = new DefaultIncrementor(technicalModel);
    AbstractExporter exporter = new AbstractIncrementalExporter(engine, incrementor);
    return exporter.export(technicalModel, null);
  }
  
  protected Collection<EObject> importer(Collection<? extends EObject> simplifiedModel){
    ImportEngine engine = new ImportEngine(XMLPivotActivator.getDefault().getDynamicConceptualMapping());
    engine.copyAll(simplifiedModel);
    engine.copyReferences();
    engine.repair();
    return Collections2.filter(engine.values(), EMFPredicates.isRootContainer());
  }
  
  protected Collection<EObject> roundTrip(Collection<? extends EObject> technicalModel) throws Exception{
    return importer(exporter(technicalModel));
  }
  
  
}
