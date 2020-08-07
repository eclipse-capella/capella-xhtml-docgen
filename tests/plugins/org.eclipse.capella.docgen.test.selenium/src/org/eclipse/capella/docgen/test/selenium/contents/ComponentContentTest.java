package org.eclipse.capella.docgen.test.selenium.contents;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.capella.docgen.test.selenium.common.AstractXHTMLDocgenTestCase;
import org.eclipse.capella.docgen.test.selenium.data.MAHTMLDOC184TestValues;
import org.eclipse.capella.docgen.test.selenium.utils.DocGenUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;

public abstract class ComponentContentTest extends AstractXHTMLDocgenTestCase implements IElementContentTest {
	
	public List<String> getMandatorySectionsNames() {
		List<String> res = new ArrayList<String>();
		res.add("Features");
		return res;
	}
	
	public String getElementName() {
		return getElement().getName();
	}
	
	public String getElementFileName() {
		return DocGenUtils.getValidFileName(getElement().getId());
	}
	
	public abstract NamedElement getElement();

	@Test
	public void elementPageTest() {
		driver.get(getElementPageFullPath(getElementFileName()));
		driver.switchTo().frame(FRAME_NAME__CONTENT);
		WebElement title = driver.findElement(By.xpath("/html/body/div/h1"));
		Assert.assertEquals(getElementName(), title.getText());
	}
	
	@Test
	public void mandatorySectionsTest() {
		driver.get(getElementPageFullPath(getElementFileName()));
		driver.switchTo().frame(FRAME_NAME__CONTENT);
		List<WebElement> h2Titles = driver.findElements(By.tagName("h2"));
		List<WebElement> streamH2Titles = h2Titles.stream().filter(title -> getMandatorySectionsNames().contains(title.getText())).collect(Collectors.toList());
		
		Assert.assertEquals(getMandatorySectionsNames().size(), streamH2Titles.size());
		
		List<String> missingMandatorySectionsTitles = getMandatorySectionsNames();
		for (WebElement h2Title: streamH2Titles) {
			missingMandatorySectionsTitles.remove(h2Title.getText());
		}
		if (!missingMandatorySectionsTitles.isEmpty()) {
			Assert.assertTrue("Mandatory sections [" + missingMandatorySectionsTitles.stream().collect(Collectors.joining(", ")) + "] are missing", false);			
		}
	}
	
	@Test
	public void mandatoryStructuralFeaturesRelationsTest() {
		driver.get(getElementPageFullPath(getElementFileName()));
		driver.switchTo().frame(FRAME_NAME__CONTENT);
		
		List<WebElement> liElement = driver.findElements(By.tagName("li"));
		List<EObject> strFeatContents = MAHTMLDOC184TestValues.getElement().getFeaturesContent();
		List<EObject> missedStrFeatContents = (List<EObject>) EcoreUtil.copyAll(strFeatContents);
		
		liElement.stream().forEach(li -> {
			WebElement a = li.findElement(By.tagName("a"));
			WebElement img = li.findElement(By.tagName("img"));
			strFeatContents.stream()
				.filter(element -> element instanceof NamedElement)
				.forEach(element -> {
					if (((NamedElement)element).getName().equals(a.getText())) {
						missedStrFeatContents.remove(element);
					}
				});			
		});
		
		if (!missedStrFeatContents.isEmpty()) {
			Assert.assertTrue("Mandatory StructuralFeatures [" + strFeatContents.stream().map(EObject::toString).collect(Collectors.joining(", ")) + "] are missing", false);
		}
	}

}
