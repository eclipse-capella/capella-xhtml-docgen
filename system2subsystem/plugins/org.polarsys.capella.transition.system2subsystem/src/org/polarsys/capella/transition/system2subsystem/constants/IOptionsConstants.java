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
package org.polarsys.capella.transition.system2subsystem.constants;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;

/**
 * 
 */
public class IOptionsConstants {

  public static final String SYSTEM2SUBSYSTEM_PREFERENCES = "capella.core.transition.system2subsystem";

  public static final String DATA_EXPORT = "dataExport";
  public static final String DATA_EXPORT_DEFAULT_VALUE = Boolean.TRUE.toString();

  public static final String INTERFACE_EXPORT = "interfaceExport";
  public static final String INTERFACE_EXPORT_DEFAULT_VALUE = Boolean.TRUE.toString();

  public static final String SCENARIO_EXPORT = "scenarioExport";
  public static final boolean SCENARIO_EXPORT_DEFAULT_VALUE = false;

  public static final String FUNCTIONAL_CHAIN_EXPORT = "functionalChainExport";
  public static final String FUNCTIONAL_CHAIN_EXPORT_DEFAULT_VALUE = Boolean.TRUE.toString();

  public static final String DIAGRAM_EXPORT = "diagramExport";
  public static final String DIAGRAM_EXPORT_DEFAULT_VALUE = Boolean.FALSE.toString();

  public static final String HIERARCHICAL_EXPORT = "hierachicalExport";
  public static final String HIERARCHICAL_EXPORT_DEFAULT_VALUE = "leaf";
  public static final String HIERARCHICAL_EXPORT_LEAF_VALUE = "leaf";
  public static final String HIERARCHICAL_EXPORT_ALWAYS_VALUE = "all";
  public static final String HIERARCHICAL_EXPORT_RESTRICTED_VALUE = "restricted";

  public static final String STATE_MODES_EXPORT = "stateModesExport";
  public static final String STATE_MODES_DEFAULT_VALUE = "hierarchyReference";
  public static final String STATE_MODES_HIERARCHICAL_VALUE = "hierarchyReference";
  public static final String STATE_MODES_ONLY_REFERENCES_VALUE = "onlyReference";

  public static final String PROPERTY_VALUES_ELEMENTS = "propertyValuesExport";
  public static final Collection<EObject> PROPERTY_VALUES_ELEMENTS_DEFAULT_VALUE = Collections.emptyList();

}
