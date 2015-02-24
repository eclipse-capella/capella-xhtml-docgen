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

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

/**
 *
 */
public class AbstractCapabilityImportAdapter extends AdapterImpl implements ImportAdapter {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void doImport(EObject technical_p, EObject simplified_p, ImportEngine engine_p) {
	  // do nothing
	}	
}
