/*******************************************************************************
 * Copyright (c) 2022 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.docgen.test.ju.suites;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.capella.docgen.test.ju.cases.CommandLineConfigurationTest;
import org.polarsys.capella.docgen.test.ju.cases.CommandLineTest;
import org.polarsys.capella.docgen.test.ju.cases.IFESampleTest;
import org.polarsys.capella.test.framework.api.BasicTestArtefact;
import org.polarsys.capella.test.framework.api.BasicTestSuite;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;

public class IFESampleTestSuite extends BasicTestSuite {
  
  public IFESampleTestSuite() {
   addTest(new JUnit4TestAdapter(IFESampleTest.class));
  }

  @Override
  protected List<BasicTestArtefact> getTests() {
    List<BasicTestArtefact> tests = new ArrayList<>();   
    return tests;
  }
  

  /**
   * Added in order to launch this test suite without the Capella test framework.
   * @return
   */
  public static Test suite() {
    return new IFESampleTestSuite();
  }

}
