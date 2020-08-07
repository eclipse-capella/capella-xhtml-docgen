package org.eclipse.capella.docgen.test.selenium.utils;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverUtils {

	protected static WebDriver foxDriver;
	
	public static void initDriver(String logPath) {
		System.setProperty("webdriver.gecko.driver", "C:\\vrac\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, 
				logPath + "geckodriver_" + LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE) + "_log.txt");
	}
	
	public static WebDriver getDriver() {
		if (foxDriver == null) {
			foxDriver = new FirefoxDriver(new FirefoxOptions());
		}
		return foxDriver;
	}
	
	public static String getCurrentFrameFullPath() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) foxDriver; 
		return (String) jsExecutor.executeScript("return self.location.toString()");
	}
	
	/**
	 * Checks element being a correct link  
	 * @param element A {@link WebElement} with href attribute
	 * @return true if the element has a href attribute and the link is to an existing page
	 */
	public static boolean hasValidHrefAttribute (WebElement element) {
		String linkURL = element.getAttribute("href");
        if(linkURL == null || linkURL.isEmpty()){
        	return false;
        } else {
        	try {
        		URLConnection connection = new URL(linkURL).openConnection();
        		connection.connect();
        		if (connection.getContentLength() == 0) {
        			return false;
                }
            } catch (IOException e) {
            	return false;
            }
        }
        return true;
	}
	
}
