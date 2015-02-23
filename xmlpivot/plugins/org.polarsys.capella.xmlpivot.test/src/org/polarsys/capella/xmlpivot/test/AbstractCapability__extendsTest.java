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

import org.polarsys.capella.core.data.ctx.Capability;
import org.polarsys.capella.core.data.la.CapabilityRealization;
import org.polarsys.capella.core.data.oa.OperationalCapability;

/**
 * @generated NOT
 */
@Model (uri = XMLPivotRoundTripTest.DEFAULT_FIXTURES_LOCATION + "/AbstractCapabilityExtendTest/AbstractCapabilityExtendTest.melodymodeller")
public class AbstractCapability__extendsTest extends XMLPivotRoundTripTest {

	/**
	 * @generated NOT
	 */
	public void testOperationalCapability() {
		
	  OperationalCapability oc1 = (OperationalCapability) util.getImportElementByName("OperationalCapability 1"); //$NON-NLS-1$
	  OperationalCapability oc2 = (OperationalCapability) util.getImportElementByName("OperationalCapability 2"); //$NON-NLS-1$
	  
	  assertEquals(1, oc2.getExtends().size());
	  assertSame(oc1, oc2.getExtends().get(0).getExtended());
	}
	
	public void testOperationalCapability2(){
	  OperationalCapability oc9 = (OperationalCapability) util.getImportElementByName("OperationalCapability 9"); //$NON-NLS-1$
	  OperationalCapability oc10 = (OperationalCapability) util.getImportElementByName("OperationalCapability 10"); //$NON-NLS-1$
	  OperationalCapability oc11 = (OperationalCapability) util.getImportElementByName("OperationalCapability 11"); //$NON-NLS-1$
	  OperationalCapability oc12 = (OperationalCapability) util.getImportElementByName("OperationalCapability 12"); //$NON-NLS-1$
	  OperationalCapability oc13 = (OperationalCapability) util.getImportElementByName("OperationalCapability 13"); //$NON-NLS-1$
	  OperationalCapability oc14 = (OperationalCapability) util.getImportElementByName("OperationalCapability 14"); //$NON-NLS-1$
	  
	  
	  assertEquals(5, oc14.getExtends().size());
	  assertSame(oc9, oc14.getExtends().get(0).getExtended());
	  assertSame(oc10, oc14.getExtends().get(1).getExtended());
	  assertSame(oc11, oc14.getExtends().get(2).getExtended());
	  assertSame(oc12, oc14.getExtends().get(3).getExtended());
	  assertSame(oc13, oc14.getExtends().get(4).getExtended());
	}
	

	/**
	 * @generated NOT
	 */
	public void testCapability() {
		Capability c1 = (Capability) util.getImportElementByName("Capability 1"); //$NON-NLS-1$
		Capability c2 = (Capability) util.getImportElementByName("Capability 2"); //$NON-NLS-1$
		
		assertEquals(1, c2.getExtends().size());
		assertSame(c1, c2.getExtends().get(0).getExtended());
	}
	
	public void testCapability2(){
	  
	  Capability c6 = (Capability) util.getImportElementByName("Capability 6"); //$NON-NLS-1$
    Capability c7 = (Capability) util.getImportElementByName("Capability 7"); //$NON-NLS-1$
    Capability c8 = (Capability) util.getImportElementByName("Capability 8"); //$NON-NLS-1$
    Capability c9 = (Capability) util.getImportElementByName("Capability 9"); //$NON-NLS-1$
    Capability c10 = (Capability) util.getImportElementByName("Capability 10"); //$NON-NLS-1$
    
    
    assertEquals(4, c10.getExtends().size());
    assertSame(c6, c10.getExtends().get(0).getExtended());
    assertSame(c7, c10.getExtends().get(1).getExtended());
    assertSame(c8, c10.getExtends().get(2).getExtended());
    assertSame(c9, c10.getExtends().get(3).getExtended());
	  
	}
	

	/**
	 * @generated NOT
	 */
	public void testCapabilityRealization() {
		CapabilityRealization cr1 = (CapabilityRealization) util.getImportElementByName("CapabilityRealization 1"); //$NON-NLS-1$
		CapabilityRealization cr2 = (CapabilityRealization) util.getImportElementByName("CapabilityRealization 2"); //$NON-NLS-1$
		
		assertEquals(1, cr2.getExtends().size());
		assertSame(cr1, cr2.getExtends().get(0).getExtended());
		
	}
	
	public void testCapabilityRealization2() {
	  CapabilityRealization c6 = (CapabilityRealization) util.getImportElementByName("CapabilityRealization 6"); //$NON-NLS-1$
    CapabilityRealization c7 = (CapabilityRealization) util.getImportElementByName("CapabilityRealization 7"); //$NON-NLS-1$
    CapabilityRealization c8 = (CapabilityRealization) util.getImportElementByName("CapabilityRealization 8"); //$NON-NLS-1$
    CapabilityRealization c9 = (CapabilityRealization) util.getImportElementByName("CapabilityRealization 9"); //$NON-NLS-1$
    CapabilityRealization c10 = (CapabilityRealization) util.getImportElementByName("CapabilityRealization 10"); //$NON-NLS-1$
    
    assertEquals(4, c10.getExtends().size());
    assertSame(c6, c10.getExtends().get(0).getExtended());
    assertSame(c7, c10.getExtends().get(1).getExtended());
    assertSame(c8, c10.getExtends().get(2).getExtended());
    assertSame(c9, c10.getExtends().get(3).getExtended());
    
  }
	
}
