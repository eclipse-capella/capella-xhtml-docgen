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
package org.polarsys.capella.xmlpivot.extraction;

import org.eclipse.osgi.util.NLS;

/**
 * Strings management class
 */
public class Messages extends NLS {

  /** Bundle name */
  public static final String _BUNDLE_NAME = "org.polarsys.capella.xmlpivot.extraction.messages"; //$NON-NLS-1$

  public static String _ECORE_EXTENSION;

  static {
    // initialize resource bundle
    NLS.initializeMessages(_BUNDLE_NAME, Messages.class);
  }

  /**
   * Constructor
   */
  private Messages() {
    // Nothing
  }

}
