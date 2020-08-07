package org.eclipse.capella.docgen.test.selenium.common;

import java.util.concurrent.TimeUnit;

import org.eclipse.capella.docgen.test.selenium.utils.WebDriverUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class AstractXHTMLDocgenTestCase {

	protected static WebDriver driver;
	
	private static String INDEX_FILE_PATH = "output\\index.html";
	protected static String TESTED_PAGE_URI = AbstractGenerateXHTMLDocgenTestSuite.getFullOutputPath() + INDEX_FILE_PATH;
	
	// DocGen constants
	protected static String FRAME_NAME__MODEL_INDEX = "modelsIndex";
	protected static String FRAME_NAME__CONTENT = "content";
	protected static String FRAME_NAME__HEADER = "header";
	protected static String FRAME_NAME__FOOTER = "footer";
	protected static String FRAME_NAME__SIDEBAR = "sideBar";
	
	protected static String LINK_NAME__BACK_TO_MODEL = "Back to Model";
	
	@BeforeClass
	public static void prepareTests() {
		driver = WebDriverUtils.getDriver();
		driver.get(TESTED_PAGE_URI);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Before
	public void prepareTestContext() {
		driver.switchTo().defaultContent();
	}
	
	public String getModelName() {
		return AbstractGenerateXHTMLDocgenTestSuite.getModelName();
	}
	
	public String getElementPageFullPath(String pageName) {
		return AbstractGenerateXHTMLDocgenTestSuite.getFullOutputPath() + "output\\" + getModelName() + "\\" + pageName;
	}
	
	@AfterClass
	public static void endTests() {
		
	}
}
