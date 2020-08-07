package org.eclipse.capella.docgen.test.selenium.testsuites;

import org.eclipse.capella.docgen.test.selenium.common.AbstractGenerateXHTMLDocgenTestSuite;
import org.eclipse.capella.docgen.test.selenium.testcases.EntityContentTest;
import org.eclipse.capella.docgen.test.selenium.testcases.HeaderTest;
import org.eclipse.capella.docgen.test.selenium.testcases.IndexTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses({
	HeaderTest.class,
	IndexTest.class,
	EntityContentTest.class
})

public class CommonTestSuite extends AbstractGenerateXHTMLDocgenTestSuite {
	
}
