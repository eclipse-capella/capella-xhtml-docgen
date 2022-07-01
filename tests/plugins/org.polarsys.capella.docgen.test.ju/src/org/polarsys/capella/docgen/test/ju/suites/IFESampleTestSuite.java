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

import java.util.Collection;

import org.eclipse.core.runtime.Path;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.polarsys.capella.docgen.test.ju.cases.AbstractCapellaDocGenTest;
import org.polarsys.capella.docgen.test.ju.reporter.CapellaDocGenHtmlDomainElementReporter;
import org.polarsys.capella.docgen.test.ju.util.CapellaDocGenTestUtil;

@RunWith(Parameterized.class)
public class IFESampleTestSuite extends AbstractCapellaDocGenTest {

	private static String NAME = "In-Flight Entertainment System";

	@Override
	public String getProjectName() {
		return NAME;
	}

	@Override
	protected String getModelName() {
		return NAME;
	}

	@Parameters(name = "IFE - {0}")
	public static Collection<Object[]> data() {
		Path path = new Path(
				"/model/" + NAME + "/" + NAME + "." + CapellaDocGenHtmlDomainElementReporter.TEST_RESULTS_FILE_EXTENSION);
		Collection<Object[]> testParameters = getTestParameters(path, null);
		assertFalse("Test parameters shall not be empty", testParameters.isEmpty());
		return testParameters;
	}
	
	@Parameter
	public static String elementID;

	@Parameter(1)
	public static String expectedContent;

	@Override
	@Test
	public void test() throws Exception {
		String generatedContent = getReporter().getTestResults().get(elementID);
		
		// Generated content must not be null
		assertNotNull("Expected object " + elementID + " cannot be found", generatedContent);
		
		// Format generated content
		generatedContent = CapellaDocGenTestUtil.formatDocGenOutput(generatedContent);
		
		// Generated content must match
		assertEquals("Object " + elementID + " does not match", expectedContent, generatedContent);
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
