package org.eclipse.capella.docgen.test.selenium.common;

import org.eclipse.capella.docgen.test.selenium.utils.CapellaModelUtils;
import org.eclipse.capella.docgen.test.selenium.utils.WebDriverUtils;
import org.eclipse.capella.docgen.test.selenium.utils.XHTMLDocumentationGenerationLauncher;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public abstract class AbstractGenerateXHTMLDocgenTestSuite {
	
	protected static String FILE_PROTOCOL_PATH = "file:///";
	protected static String GIT_WS_PATH = "C:\\work\\git\\capella-xhtml-docgen_master\\tests\\plugins\\org.eclipse.capella.docgen.test.selenium\\workspace\\";
	protected static String PROJECT_NAME = "MAHTMLDOC-184";
	protected static String MODEL_NAME = "MAHTMLDOC-184";
	protected static String PROJECT_PATH = PROJECT_NAME + "\\";
	protected static String AIRD_FILE_NAME = "MAHTMLDOC-184.aird";
	protected static String OUTPUT_FOLDER_PATH = "doc\\";
	
	private static boolean generate_doc = false; // For debug purpose
	
	@BeforeClass
	public static void openBrowser(){
		if (generate_doc) {
			generateDocumentation();
		}
		CapellaModelUtils.setCapellaModelProject(GIT_WS_PATH + PROJECT_PATH + AIRD_FILE_NAME);
		WebDriverUtils.initDriver(GIT_WS_PATH + PROJECT_PATH + OUTPUT_FOLDER_PATH);
	}
	
	private static void generateDocumentation() {
		XHTMLDocumentationGenerationLauncher.generateDocumentation(GIT_WS_PATH, PROJECT_PATH, AIRD_FILE_NAME, OUTPUT_FOLDER_PATH, true, true);
	}

	@AfterClass
	public static void closeBrowser(){
		//foxDriver.quit();
		//System.out.println("Log file location: " + GIT_WS_PATH + PROJECT_PATH + OUTPUT_FOLDER_PATH);
	}
	
	public static String getProjectName() {
		return PROJECT_NAME;
	}
	
	public static String getModelName() {
		return MODEL_NAME;
	}
	
	public static String getFullOutputPath() {
		return FILE_PROTOCOL_PATH + GIT_WS_PATH + PROJECT_PATH + OUTPUT_FOLDER_PATH;
	}
	
}
