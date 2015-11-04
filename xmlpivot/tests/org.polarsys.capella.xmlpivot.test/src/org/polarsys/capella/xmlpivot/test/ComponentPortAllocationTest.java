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

import org.polarsys.capella.core.data.cs.PhysicalPort;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.fa.ComponentPortAllocation;


/**
 * @generated
 */
public class ComponentPortAllocationTest extends XMLPivotRoundTripTest {

  @Model(
      uri=XMLPivotRoundTripTest.DEFAULT_FIXTURES_LOCATION + "ComponentPortAllocationTest1/ComponentPortAllocationTest1.melodymodeller" 
  )
  public void testComponentPortAllocationRoundTrip(){
    
    ComponentPort cp1 = (ComponentPort) util.getImportElementByName("CP 1"); //$NON-NLS-1$
    ComponentPort cp2 = (ComponentPort) util.getImportElementByName("CP 2"); //$NON-NLS-1$
    PhysicalPort pp1 = (PhysicalPort) util.getImportElementByName("PP 1"); //$NON-NLS-1$
    
    assertEquals(2, pp1.getOwnedComponentPortAllocations().size());
    
    ComponentPortAllocation a1 = pp1.getOwnedComponentPortAllocations().get(0);
    ComponentPortAllocation a2 = pp1.getOwnedComponentPortAllocations().get(1);
    
    assertSame(pp1, a1.getSourceElement());
    assertSame(pp1, a2.getSourceElement());
    
    assertSame(cp1, a1.getTargetElement());
    assertSame(cp2, a2.getTargetElement());
  }

}
