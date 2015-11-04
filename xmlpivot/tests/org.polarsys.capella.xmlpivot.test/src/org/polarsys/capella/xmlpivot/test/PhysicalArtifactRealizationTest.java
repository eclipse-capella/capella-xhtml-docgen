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

import org.polarsys.capella.core.data.epbs.EpbsPackage;


/**
 * @generated
 */
public class PhysicalArtifactRealizationTest extends XMLPivotRoundTripTest {

  @Model(
      uri="platform:/plugin/org.polarsys.capella.xmlpivot.test/fixtures/testRoundtrip1/testRoundtrip1.melodymodeller"
  )
  public void testPhysicalArtifactRealizationRoundTrip(){
    util.assertAllLinksRecreated(EpbsPackage.Literals.PHYSICAL_ARTIFACT_REALIZATION);
  }

}
