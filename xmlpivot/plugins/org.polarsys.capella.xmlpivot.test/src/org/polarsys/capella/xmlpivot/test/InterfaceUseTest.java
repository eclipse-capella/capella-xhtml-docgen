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
public class InterfaceUseTest extends XMLPivotRoundTripTest {

  
  @Model (
      uri = XMLPivotRoundTripTest.DEFAULT_FIXTURES_LOCATION + "/InterfaceUseTest/InterfaceUseTest.melodymodeller"
  )
  public void testInterfaceUseRoundTrip(){
    
    Interface i1 = (Interface) util.getImportElementByName("Interface 1"); //$NON-NLS-1$
    Interface i2 = (Interface) util.getImportElementByName("Interface 2"); //$NON-NLS-1$
    
    LogicalComponent lc1 = util.getImportElementByName("LogicalComponent 1", LogicalComponent.class); //$NON-NLS-1$

    assertEquals(2, lc1.getUsedInterfaces().size());
    assertSame(i1, lc1.getUsedInterfaces().get(0));
    assertSame(i2, lc1.getUsedInterfaces().get(1));
  
    assertEquals(2, lc1.getOwnedInterfaceUses().size());
    assertSame(lc1.getOwnedInterfaceUses().get(0).getUsedInterface(), i1);
    assertSame(lc1.getOwnedInterfaceUses().get(1).getUsedInterface(), i2);
    
  
  }

}
