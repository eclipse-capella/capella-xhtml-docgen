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
package org.polarsys.capella.xmlpivot.common.skeleton;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemContext;

/**
 *
 */
public class SystemContextWalker extends AbstractModelWalker {
  
  /**
   * @param parent_p
   */
  @Override
  public void accept(EObject parent_p, ModelWalkerHelper helper) {

    SystemContext sctx = (SystemContext) parent_p;
    if (sctx.eContainer() instanceof SystemAnalysis){
      if (sctx.getOwnedFeatures().isEmpty()){
        sctx.getOwnedFeatures().add(helper.getPart(sctx));
      }
    }
    
  }
  
}
