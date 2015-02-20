/*******************************************************************************
 *  Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
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
import org.polarsys.capella.core.data.interaction.AbstractCapability;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityExtend;
import org.polarsys.capella.core.data.la.CapabilityRealization;
import org.polarsys.capella.core.data.oa.OperationalCapability;

/**
 * @generated NOT
 */
@Model (uri = XMLPivotRoundTripTest.DEFAULT_FIXTURES_LOCATION + "/AbstractCapabilityExtendTest/AbstractCapabilityExtendTest.melodymodeller")
public class AbstractCapability__extendingTest extends XMLPivotRoundTripTest {

	/**
	 * @generated NOT
	 */
	public void testOperationalCapability() {
	  OperationalCapability oc1 = (OperationalCapability) util.getImportElementByName("OperationalCapability 1"); //$NON-NLS-1$
	  OperationalCapability oc2 = (OperationalCapability) util.getImportElementByName("OperationalCapability 2"); //$NON-NLS-1$
	  
	  assertEquals(1, oc1.getExtending().size());
	  AbstractCapabilityExtend e1 = oc1.getExtending().get(0);
	  
	  assertSame(oc2,  e1.eContainer());
	  assertSame(oc2,  e1.getExtension());
	  assertSame(oc1, e1.getExtended());
	}

	
	public void testOperationalCapability2(){  
	  OperationalCapability oc6 = (OperationalCapability) util.getImportElementByName("OperationalCapability 6"); //$NON-NLS-1$
    OperationalCapability oc7 = (OperationalCapability) util.getImportElementByName("OperationalCapability 7"); //$NON-NLS-1$
    OperationalCapability oc8 = (OperationalCapability) util.getImportElementByName("OperationalCapability 8"); //$NON-NLS-1$
    
    assertEquals(2, oc6.getExtending().size());
    AbstractCapabilityExtend e1 = oc6.getExtending().get(0);
    AbstractCapabilityExtend e2 = oc6.getExtending().get(1);
    
    assertTrue( e1.getExtension() == oc7 && e2.getExtension() == oc8 
        || e1.getExtension() == oc8 && e2.getExtension() == oc7);
    
	}
	
	/**
	 * @generated NOT
	 */
	public void testCapability() {
		
	  Capability c1 = (Capability) util.getImportElementByName("Capability 1"); //$NON-NLS-1$
	  Capability c2 = (Capability) util.getImportElementByName("Capability 2"); //$NON-NLS-1$
	  
	  assertEquals(1, c1.getExtending().size());
	  assertSame(c2, c1.getExtending().get(0).getExtension());
	}

	public void testCapability2(){
	  
	  Capability c3 = (Capability) util.getImportElementByName("Capability 3"); //$NON-NLS-1$
    Capability c4 = (Capability) util.getImportElementByName("Capability 4"); //$NON-NLS-1$
    Capability c5 = (Capability) util.getImportElementByName("Capability 5"); //$NON-NLS-1$
    
    assertEquals(2, c3.getExtending().size());
  
    // cannot reproduce correct ordering after removing inverse features from simplified M2:
    
    AbstractCapability first = c3.getExtending().get(0).getExtension();
    AbstractCapability second = c3.getExtending().get(1).getExtension();
    
    assertTrue ( first == c4 && second == c5 || first == c5 && second == c4);
	}
	
	
	/**
	 * @generated NOT
	 */
	public void testCapabilityRealization() {
		
	  CapabilityRealization cr1 = (CapabilityRealization) util.getImportElementByName("CapabilityRealization 1"); //$NON-NLS-1$
	  CapabilityRealization cr2 = (CapabilityRealization) util.getImportElementByName("CapabilityRealization 2"); //$NON-NLS-1$
	  
	  assertEquals(1, cr1.getExtending().size());
	  assertSame(cr2, cr1.getExtending().get(0).getExtension());
	}
	
	
	public void testCapabilityRealization2() {
    
    CapabilityRealization cr3 = (CapabilityRealization) util.getImportElementByName("CapabilityRealization 3"); //$NON-NLS-1$
    CapabilityRealization cr4 = (CapabilityRealization) util.getImportElementByName("CapabilityRealization 4"); //$NON-NLS-1$
    CapabilityRealization cr5 = (CapabilityRealization) util.getImportElementByName("CapabilityRealization 5"); //$NON-NLS-1$
    
    assertEquals(2, cr3.getExtending().size());
    
  
    AbstractCapability first = cr3.getExtending().get(0).getExtension();
    AbstractCapability second = cr3.getExtending().get(1).getExtension();
    
    // cannot reconstruct order after removing inverse features from simplified M2.
    assertTrue( first == cr4 && second == cr5 || first == cr5 && second == cr4);
	
	}
	
	
	
}
