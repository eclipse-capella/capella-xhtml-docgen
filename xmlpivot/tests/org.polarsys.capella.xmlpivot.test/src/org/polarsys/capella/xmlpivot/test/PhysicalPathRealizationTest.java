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

import org.polarsys.capella.core.data.cs.PhysicalPath;


/**
 * @generated NOT
 */
@Model (
  uri = XMLPivotRoundTripTest.DEFAULT_FIXTURES_LOCATION + "/PhysicalPathRealizationTest/PhysicalPathRealizationTest.melodymodeller"    
)
public class PhysicalPathRealizationTest extends XMLPivotRoundTripTest {

  /**
  * @generated NOT
  */
  public void testPhysicalPathRealizationRoundTrip(){
    
    PhysicalPath p1 = (PhysicalPath) util.getImportElementByName("PhysicalPath 1");
    PhysicalPath p2 = (PhysicalPath) util.getImportElementByName("PhysicalPath 2");
    PhysicalPath p3 = (PhysicalPath) util.getImportElementByName("PhysicalPath 3");
    
    
    assertEquals(2, p3.getOwnedPhysicalPathRealizations().size());
    
    assertSame(p1, p3.getOwnedPhysicalPathRealizations().get(0).getTargetElement());
    assertSame(p2, p3.getOwnedPhysicalPathRealizations().get(1).getTargetElement());

    assertSame(p3, p3.getOwnedPhysicalPathRealizations().get(0).getSourceElement());
    assertSame(p3, p3.getOwnedPhysicalPathRealizations().get(1).getSourceElement());
    
    
  }

}
