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
package org.polarsys.capella.xmlpivot.exporter;

/**
 */
public final class ExporterFactory {

	private ExporterFactory(){
		// prevent uncontrolled instantiation
	}
	
	public final static ExporterFactory INSTANCE = new ExporterFactory();
	
	/**
	 * Returns an exporter that copies all ancestor objects of all objects
	 * that have previously been copied by the wrapped exporter.
	 * 
	 * @param wrapped_p
	 * @return
	 */
	public AbstractExporter createCommonRootExporter(AbstractExporter wrapped_p){
		return new CommonRootExporter(wrapped_p);
	}
	
	/**
	 * Returns an exporter that additionally copies the key value pairs of all
	 * projects that have been copied previously by the wrapped exporter.
	 * 
	 * @param wrapped_p
	 * @return
	 */
	public AbstractExporter createProjectExporter(AbstractExporter wrapped_p){
		return new ProjectExporter(wrapped_p);
	}
	
}
