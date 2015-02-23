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
package org.polarsys.capella.xmlpivot.ui;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

/**
 * <p>
* <strong>EXPERIMENTAL</strong>. This class or interface has been added as
* part of a work in progress. There is no guarantee that this API will
* work or that it will remain the same. Please do not use this API without
* consulting with the Capella team.
* </p>
*/
public class XMLPivotUIActivator extends EMFPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.polarsys.capella.xmlpivot.ui"; //$NON-NLS-1$

	// The shared instance
	public static final XMLPivotUIActivator INSTANCE = new XMLPivotUIActivator();
	
	
	private static Implementation plugin;

	
	/**
	 * The constructor
	 */
	public XMLPivotUIActivator() {
		super(new ResourceLocator[] {
		});
	}

	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	public static Implementation getPlugin(){
		return plugin;
	}

	/**
	   * The actual implementation of the Eclipse <b>Plugin</b>.
	   * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	   * @generated
	 */
		public static class Implementation extends EclipseUIPlugin {
			/**
	     * Creates an instance.
	     * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
	     * @generated
	     */
			public Implementation() {
	      super();
	  
	      // Remember the static instance.
	      //
	      plugin = this;
	    }
	}

}
