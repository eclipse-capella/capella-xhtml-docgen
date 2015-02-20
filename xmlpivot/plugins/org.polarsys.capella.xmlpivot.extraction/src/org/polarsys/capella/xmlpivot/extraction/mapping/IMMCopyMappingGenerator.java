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
package org.polarsys.capella.xmlpivot.extraction.mapping;

import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;

public interface IMMCopyMappingGenerator {

  /**
   * @param sourcePackages_p
   * @return
   */
  HashIterableInvertibleBinaryRelation generateTotalCopyMapping(Collection<EPackage> sourcePackages_p);

}
