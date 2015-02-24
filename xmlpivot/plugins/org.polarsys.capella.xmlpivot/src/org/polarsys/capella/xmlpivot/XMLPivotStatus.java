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
package org.polarsys.capella.xmlpivot;

import java.util.Arrays;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.xmlpivot.common.predicates.EMFFunctions;


import static com.google.common.collect.Collections2.transform;

/**
 * Lists all status codes used in XMLPivot status objects
 */
public enum XMLPivotStatus {

  /**
   * During export, a part of the export tree cannot be attached to the common root because 
   * a required ancestor cannot be exported (Probably because the ancestor has no representing
   * object in the simplified metamodel)
   */
  EXPORT_COMMON_ROOT_DANGLING_SUBTREE(IStatus.WARNING, "Cannot attach '{0}' because its parent '{1}' has no simplified representation");
  
  private int severity;
  private String message;
  
  private XMLPivotStatus(int severity_p, String message_p){
    message = message_p;
    severity = severity_p;
  }
  
  /**
   * Creates an IStatus for the argument. 
   * @param status
   * @param args arguments for the status message binding. You can pass raw Objects, labels are provided automatically.
   * @return
   */
  public static IStatus toStatus(XMLPivotStatus status, Object... args){
    Object[] bindings = transform(Arrays.asList(args), EMFFunctions.LABEL_HELPER_FUNCTION).toArray();
    return new Status(status.severity, XMLPivotActivator.PLUGIN_ID, status.ordinal(), NLS.bind(status.message, bindings), null);
  }
  
  public static void log(XMLPivotStatus status, Object... args){
    XMLPivotActivator.getDefault().getLog().log(toStatus(status, args));
  }
  
  
  
}
