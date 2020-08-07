package org.eclipse.capella.docgen.test.selenium.testcases;

import org.eclipse.capella.docgen.test.selenium.common.AstractXHTMLDocgenTestCase;
import org.eclipse.capella.docgen.test.selenium.common.SeleniumConstants;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HeaderTest extends AstractXHTMLDocgenTestCase {
	
	@Test
	public void test001_IndexTitle(){
	    Assert.assertEquals("Index", driver.getTitle());
	}
	
	@Test
	public void test002_NavigateToMainModelPage() {
		driver.switchTo().frame(FRAME_NAME__MODEL_INDEX);
		WebElement testedElement = driver.findElement(By.linkText(getModelName()));
		Assert.assertNotNull(testedElement);
		
		testedElement.click();
	}
	
	@Test
	public void test003_CheckHeader() {
		driver.switchTo().frame(FRAME_NAME__HEADER);
		WebElement testedElement = driver.findElement(By.xpath("//html/body/h1"));
		Assert.assertNotNull(testedElement);
		
		Assert.assertEquals(getModelName(), testedElement.getText());
	}
	
	@Test
	public void test004_CheckLogo() {
		driver.switchTo().frame(FRAME_NAME__HEADER);
		WebElement testedElement = driver.findElement(By.xpath("//html/body/div/img"));
		Assert.assertNotNull(testedElement);
		
		Assert.assertTrue("Logo image is not displayed on main header", (Boolean) ((JavascriptExecutor)driver).executeScript(SeleniumConstants.JS_IMAGE_IS_PRESENT, testedElement));
	}
}
