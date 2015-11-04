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

import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeEnd;
import org.polarsys.capella.core.data.fa.ComponentPort;

/**
 *
 */
public class ComponentExchangeTest extends XMLPivotRoundTripTest {

  
  @Model (
    uri = XMLPivotRoundTripTest.DEFAULT_FIXTURES_LOCATION + "ComponentExchangeTest1/ComponentExchangeTest1.melodymodeller"    
  )
  public void testComponentExchange1(){
    ComponentExchange exchange = (ComponentExchange) util.getImportElementByName("C1"); //$NON-NLS-1$
    ComponentPort sourcePort = (ComponentPort) util.getImportElementByName("SourcePort"); //$NON-NLS-1$
    ComponentPort targetPort = (ComponentPort) util.getImportElementByName("TargetPort"); //$NON-NLS-1$
    assertSame(sourcePort, exchange.getSource());
    assertSame(targetPort, exchange.getTarget());
  }
  
  
  @Model (
      uri = XMLPivotRoundTripTest.DEFAULT_FIXTURES_LOCATION + "ComponentExchangeTest2/ComponentExchangeTest2.melodymodeller"    
    )
    public void testComponentExchange2(){
      ComponentExchange exchange = (ComponentExchange) util.getImportElementByName("C1"); //$NON-NLS-1$
      ComponentExchangeEnd sourceEnd = (ComponentExchangeEnd) util.getImportElementById("278cce72-53d6-4808-9fe4-30bc03a97845"); //$NON-NLS-1$
      ComponentExchangeEnd targetEnd = (ComponentExchangeEnd) util.getImportElementById("c938079c-4669-4355-86be-73976f47bafc"); //$NON-NLS-1$
      assertSame(sourceEnd, exchange.getSource());
      assertSame(targetEnd, exchange.getTarget());
    }
  
  
  @Model (
      uri = XMLPivotRoundTripTest.DEFAULT_FIXTURES_LOCATION + "ComponentExchangeTest3/ComponentExchangeTest3.melodymodeller"    
    )
    public void testComponentExchange3(){
      ComponentExchange exchange = (ComponentExchange) util.getImportElementByName("C1"); //$NON-NLS-1$
      Part sourcePart = util.getImportElementByName("Part 1", Part.class); //$NON-NLS-1$
      Part targetPart = util.getImportElementByName("Part 2", Part.class); //$NON-NLS-1$
      
      assertSame(sourcePart, exchange.getSource());
      assertSame(targetPart, exchange.getTarget());
    }
  
  
    @Model (
      uri = XMLPivotRoundTripTest.DEFAULT_FIXTURES_LOCATION + "ComponentExchangeTest4/ComponentExchangeTest4.melodymodeller"    
    )
    public void testComponentExchange4(){
      ComponentExchange exchange1_2 = (ComponentExchange) util.getImportElementByName("C1_C2"); //$NON-NLS-1$
      ComponentExchange exchange11_1 = (ComponentExchange) util.getImportElementByName("C1.1_C1");   //$NON-NLS-1$
      ComponentExchange exchange2_21 = (ComponentExchange) util.getImportElementByName("C2_C2.1");   //$NON-NLS-1$
      
      ComponentPort port1 = (ComponentPort) util.getImportElementByName("Port1"); //$NON-NLS-1$
      ComponentPort port1_1 = (ComponentPort) util.getImportElementByName("Port1.1");  //$NON-NLS-1$
      
      ComponentPort port2 = (ComponentPort) util.getImportElementByName("Port2"); //$NON-NLS-1$
      ComponentPort port2_1 = (ComponentPort) util.getImportElementByName("Port2.1");  //$NON-NLS-1$
      
      
      assertSame(port1, exchange11_1.getSource());
      assertSame(port1_1, exchange11_1.getTarget());
      assertSame(port1, exchange1_2.getSource());
      
      assertSame(port2, exchange1_2.getTarget());
      assertSame(port2, exchange2_21.getSource());
      assertSame(port2_1, exchange2_21.getTarget());
      
      
    }
  
}
