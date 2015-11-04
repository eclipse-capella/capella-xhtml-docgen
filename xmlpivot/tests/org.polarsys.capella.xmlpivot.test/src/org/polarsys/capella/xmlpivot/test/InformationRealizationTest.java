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

import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.InformationRealization;


/**
 * @generated
 */
public class InformationRealizationTest extends XMLPivotRoundTripTest {

  @Model(
      uri="platform:/plugin/org.polarsys.capella.xmlpivot.test/fixtures/testRoundtrip1/testRoundtrip1.melodymodeller"
  )
  public void testInformationRealizationRoundTrip(){
    util.assertAllLinksRecreated(InformationPackage.Literals.INFORMATION_REALIZATION);
  }

  
  @Model(
      uri= XMLPivotRoundTripTest.DEFAULT_FIXTURES_LOCATION + "/ExchangeItemRealizationTest/ExchangeItemRealizationTest.melodymodeller"
  )
  public void testExchangeItemRealizationRoundTrip(){
    ExchangeItem i1 = (ExchangeItem) util.getImportElementByName("ExchangeItem 1"); //$NON-NLS-1$
    ExchangeItem i2 = (ExchangeItem) util.getImportElementByName("ExchangeItem 2"); //$NON-NLS-1$
    ExchangeItem i3 = (ExchangeItem) util.getImportElementByName("ExchangeItem 3"); //$NON-NLS-1$
    ExchangeItem i4 = (ExchangeItem) util.getImportElementByName("ExchangeItem 4"); //$NON-NLS-1$
    ExchangeItem i5 = (ExchangeItem) util.getImportElementByName("ExchangeItem 5"); //$NON-NLS-1$
    
    assertEquals(1, i4.getOwnedInformationRealizations().size());
    
    InformationRealization realization1 = i4.getOwnedInformationRealizations().get(0);
    assertEquals(i1, realization1.getTargetElement());
    assertEquals(i4, realization1.getSourceElement());
  
    
    assertEquals(2, i5.getOwnedInformationRealizations().size());
    InformationRealization realization2 = i5.getOwnedInformationRealizations().get(0);
    InformationRealization realization3 = i5.getOwnedInformationRealizations().get(1);
    
    assertEquals(i5, realization2.getSourceElement());
    assertEquals(i2, realization2.getTargetElement());
    assertEquals(i5, realization3.getSourceElement());
    assertEquals(i3, realization3.getTargetElement());
  }
  
}
