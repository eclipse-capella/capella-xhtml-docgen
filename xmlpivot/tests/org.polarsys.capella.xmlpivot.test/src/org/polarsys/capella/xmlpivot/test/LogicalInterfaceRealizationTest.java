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
import org.polarsys.capella.core.data.pa.LogicalInterfaceRealization;


/**
 * @generated NOT
 */
@Model (
   uri = XMLPivotRoundTripTest.DEFAULT_FIXTURES_LOCATION + "/LogicalInterfaceRealizationTest/LogicalInterfaceRealizationTest.melodymodeller"    
)
public class LogicalInterfaceRealizationTest extends XMLPivotRoundTripTest {
  
  public void testLogicalInterfaceRealizationRoundTrip(){
    Interface i1 = (Interface) util.getImportElementByName("Interface 1"); //$NON-NLS-1$
    Interface i2 = (Interface) util.getImportElementByName("Interface 2"); //$NON-NLS-1$
    Interface i3 = (Interface) util.getImportElementByName("Interface 3"); //$NON-NLS-1$
    
    assertEquals(2, i3.getOwnedInterfaceAllocations().size());
    
    assertTrue(i3.getOwnedInterfaceAllocations().get(0) instanceof LogicalInterfaceRealization);
    assertTrue(i3.getOwnedInterfaceAllocations().get(1) instanceof LogicalInterfaceRealization);
    
    assertSame(i1, ((LogicalInterfaceRealization) i3.getOwnedInterfaceAllocations().get(0)).getTargetElement());
    assertSame(i2, ((LogicalInterfaceRealization) i3.getOwnedInterfaceAllocations().get(1)).getTargetElement());
    
    assertSame(i3, ((LogicalInterfaceRealization) i3.getOwnedInterfaceAllocations().get(0)).getSourceElement());
    assertSame(i3, ((LogicalInterfaceRealization) i3.getOwnedInterfaceAllocations().get(1)).getSourceElement());

  }

}
