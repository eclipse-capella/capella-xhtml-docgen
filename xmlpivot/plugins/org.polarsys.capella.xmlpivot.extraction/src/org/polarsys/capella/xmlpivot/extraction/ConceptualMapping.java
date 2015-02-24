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


import org.eclipse.emf.ecore.EModelElement;


/** <p>
 * 
 * Maps Capella simplified domain objects to Capella technical domain objects.
 * 
* <strong>EXPERIMENTAL</strong>. This class or interface has been added as
* part of a work in progress. There is no guarantee that this API will
* work or that it will remain the same. Please do not use this API without
* consulting with the Capella team.
* </p>
*/
public interface ConceptualMapping {

  public <T extends EModelElement> T getSimplified(T t);
  public <T extends EModelElement> T getTechnical(T t);
  
}
