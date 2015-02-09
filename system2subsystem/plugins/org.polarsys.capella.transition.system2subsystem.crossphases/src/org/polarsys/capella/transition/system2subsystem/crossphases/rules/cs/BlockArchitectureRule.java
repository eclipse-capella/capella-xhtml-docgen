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
package org.polarsys.capella.transition.system2subsystem.crossphases.rules.cs;

import org.eclipse.emf.ecore.EClass;
import org.polarsys.capella.core.data.cs.CsPackage;

/**
 *
 */
public class BlockArchitectureRule extends org.polarsys.capella.core.transition.system.rules.cs.BlockArchitectureRule {

  @Override
  protected EClass getSourceType() {
    return CsPackage.Literals.BLOCK_ARCHITECTURE;
  }

}
