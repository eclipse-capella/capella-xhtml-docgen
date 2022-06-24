package org.polarsys.capella.docgen.test.ju.suite;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.capella.docgen.test.ju.cases.CommandLineTest;
import org.polarsys.capella.docgen.test.ju.cases.IFETestCase;
import org.polarsys.capella.test.framework.api.BasicTestArtefact;
import org.polarsys.capella.test.framework.api.BasicTestSuite;

import junit.framework.Test;

public class CommandLineTestSuite extends BasicTestSuite {

  @Override
  protected List<BasicTestArtefact> getTests() {
    List<BasicTestArtefact> tests = new ArrayList<>();
    tests.add(new CommandLineTest());
    return tests;
  }
  

  /**
   * Added in order to launch this test suite without the Capella test framework.
   * @return
   */
  public static Test suite() {
    return new CommandLineTestSuite();
  }

}
