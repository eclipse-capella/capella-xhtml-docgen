package org.eclipse.capella.docgen.test.selenium.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.capella.docgen.test.selenium.common.AstractXHTMLDocgenTestCase;
import org.eclipse.capella.docgen.test.selenium.common.SeleniumConstants;
import org.eclipse.capella.docgen.test.selenium.utils.WebDriverUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IndexTest extends AstractXHTMLDocgenTestCase {

	private static List<WebElement> indexP2Links = new ArrayList<WebElement>();
	
	@BeforeClass
	public static void goToModelElementPage() {
	}
	
	@Test
	public void test000_NavigateToMainModelPage() {
		driver.switchTo().frame(FRAME_NAME__MODEL_INDEX);
		WebElement testedElement = driver.findElement(By.linkText(getModelName()));
		Assert.assertNotNull(testedElement);
		
		testedElement.click();
	}
	
	@Test
	public void test001_RootContent_BackToIndexLink() {
		driver.switchTo().frame(FRAME_NAME__SIDEBAR);
		WebElement testedElement = driver.findElement(By.xpath("//html/body/div/div/div[2]/a[2]"));
		Assert.assertNotNull(testedElement);
		
		Assert.assertEquals("Back to Index", testedElement.getText());
		
		testedElement.click();
		
		List<WebElement> listElement = driver.findElements(By.xpath("//html/body/ul/li"));
		
		List<WebElement> projectElements = listElement.stream()
				.filter(elem -> elem.getText().equals(getModelName()))
				.collect(Collectors.toList());
		
		Assert.assertFalse("The input project is not in the model index", projectElements.isEmpty());
		
		projectElements.get(0).findElement(By.xpath("//div/a")).click();
	}
	
	@Test
	public void test002_RootContent_SearchIndexLink() {
		driver.switchTo().frame(FRAME_NAME__SIDEBAR);
		WebElement testedElement = driver.findElement(By.xpath("//html/body/div/div/div[2]/a[1]"));
		Assert.assertNotNull(testedElement);
		
		Assert.assertEquals("Search Index", testedElement.getText());
		
		testedElement.click();
	}
	
	@Test
	public void test003_SearchIndex_AllElementsHaveIcon() {
		driver.switchTo().frame(FRAME_NAME__SIDEBAR);
		WebElement indexP2Element = driver.findElement(By.xpath("//html/body/div[2]/p[2]"));
		
		List<WebElement> indexP2Images = indexP2Element.findElements(By.tagName("img"));
		indexP2Links = indexP2Element.findElements(By.tagName("a"));
		
		Assert.assertFalse("The search index contains no images", indexP2Images.isEmpty());
		Assert.assertFalse("The search index contains no links", indexP2Links.isEmpty());
		
		Assert.assertEquals("The number of images and links does not match", indexP2Images.size(), indexP2Links.size());
		
		List<WebElement> imagesWithoutImage = indexP2Images.stream()
				.filter(elem -> !(Boolean) ((JavascriptExecutor)driver).executeScript(SeleniumConstants.JS_IMAGE_IS_PRESENT, elem))
				.collect(Collectors.toList());
		Assert.assertTrue("Some elements in the SearchIndex have no icon:\n" + getElementsToStringList(imagesWithoutImage), imagesWithoutImage.isEmpty());

		List<String> errorMessages = new ArrayList<String>();
		indexP2Links.stream().forEach(link -> {
			if (!WebDriverUtils.hasValidHrefAttribute(link)) {
				String linkURL = link.getAttribute("href");
				errorMessages.add("Element <" + link.getText() + "> contains malformed hyperlink [" + linkURL + "]");
			}
		});
		Assert.assertTrue(errorMessages.stream().collect(Collectors.joining("\n")), errorMessages.isEmpty());
	}
	
//	@Test
	public void test004_SearchIndex_ElementsContent() {
		List<String> errorMessages = new ArrayList<String>();
		indexP2Links.stream().forEach(elem -> {
			driver.switchTo().frame(FRAME_NAME__SIDEBAR);
			elem.click();
			String elementText = elem.getText();
			
			driver.switchTo().parentFrame();
			driver.switchTo().frame(FRAME_NAME__CONTENT);
			
			
			// Check content title
			WebElement contentTitle = driver.findElement(By.xpath("/html/body/div/h1"));
			Assert.assertEquals(elementText, contentTitle.getText());
			
			// Check content lists
			List<WebElement> ulElements = driver.findElements(By.xpath("/html/body/div/ul"));
			ulElements.stream().forEach(ul -> {
				List<WebElement> liElements = ul.findElements(By.tagName("li"));
				liElements.stream().forEach(li -> {
					// Check images presence
					List<WebElement> contentImages = li.findElements(By.tagName("img"));
					List<WebElement> contentWithoutImage = contentImages.stream()
							.filter(cImgElem -> !(Boolean) ((JavascriptExecutor)driver).executeScript(SeleniumConstants.JS_IMAGE_IS_PRESENT, cImgElem))
							.collect(Collectors.toList());
					if (!contentWithoutImage.isEmpty()) {
						Stream<String> contentWithoutImageTexts = contentWithoutImage.stream().map(WebElement::getText);
						errorMessages.add("Element <" + elementText + "> is missing an icon in its content [" + contentWithoutImageTexts.collect(Collectors.joining(", ")) + "]");
						errorMessages.addAll(contentWithoutImageTexts.collect(Collectors.toList()));
					}
					
					// Check content links
					List<WebElement> contentLinks = li.findElements(By.tagName("a"));
					contentLinks.stream().forEach(link -> {
						if (!WebDriverUtils.hasValidHrefAttribute(link)) {
							String linkURL = link.getAttribute("href");
							errorMessages.add("Element <" + elementText + "> contains malformed hyperlink [" + linkURL + "]");
						}
					});
				});;
			});
			driver.switchTo().parentFrame();
		});
		Assert.assertTrue(errorMessages.stream().collect(Collectors.joining("\n")), errorMessages.isEmpty());
	}

	private String getElementsToStringList(List<WebElement> listElement) {
		return listElement.stream()
				.map(elem -> elem.getText())
				.collect(Collectors.joining("\n"));
	}
	
	@AfterClass
	public static void goBackToModelElementPage() {
		driver.switchTo().parentFrame();
		try {
			driver.switchTo().frame(FRAME_NAME__SIDEBAR);
		} catch (NoSuchFrameException e) {
			driver.switchTo().frame(FRAME_NAME__MODEL_INDEX);
		}
		WebElement testedElement = driver.findElement(By.linkText(LINK_NAME__BACK_TO_MODEL));
		testedElement.click();
	}
	
}
