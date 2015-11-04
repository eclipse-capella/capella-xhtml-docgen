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
package org.polarsys.capella.xmlpivot.test;

import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.la.LogicalComponent;


/**
 * @generated
 */
public class InterfaceImplementationTest extends XMLPivotRoundTripTest {

  @Model (
      uri = XMLPivotRoundTripTest.DEFAULT_FIXTURES_LOCATION + "/InterfaceImplementationTest/InterfaceImplementationTest.melodymodeller"
  )
  public void testInterfaceImplementationRoundTrip(){
    
    
    Interface i1 = (Interface) util.getImportElementByName("Interface 1"); //$NON-NLS-1$
    Interface i2 = (Interface) util.getImportElementByName("Interface 2"); //$NON-NLS-1$
    
    LogicalComponent lc1 = util.getImportElementByName("LogicalComponent 1", LogicalComponent.class); //$NON-NLS-1$

    assertEquals(2, lc1.getImplementedInterfaces().size());
    assertSame(i1, lc1.getImplementedInterfaces().get(0));
    assertSame(i2, lc1.getImplementedInterfaces().get(1));
  
    assertEquals(2, lc1.getOwnedInterfaceImplementations().size());
    assertSame(lc1.getOwnedInterfaceImplementations().get(0).getImplementedInterface(), i1);
    assertSame(lc1.getOwnedInterfaceImplementations().get(1).getImplementedInterface(), i2);
    
  }

}
