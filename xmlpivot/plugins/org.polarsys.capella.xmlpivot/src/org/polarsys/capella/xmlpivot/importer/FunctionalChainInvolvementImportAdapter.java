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

import org.polarsys.capella.core.data.fa.FunctionalChainInvolvement;
import org.polarsys.capella.core.data.capellacore.InvolverElement;

/**
 *
 */
public class FunctionalChainInvolvementImportAdapter extends AdapterImpl implements ImportAdapter {

  @Override
  public void doImport(EObject technical, EObject simplified, ImportEngine engine){
	FunctionalChainInvolvement involvment = (FunctionalChainInvolvement) technical;
	if (involvment.getInvolver() == null && involvment.eContainer() instanceof InvolverElement){
		involvment.setInvolver((InvolverElement) involvment.eContainer());
	}
  }

}
