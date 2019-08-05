package test.java.ie.murph.selenium.page.domain;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import test.java.ie.murph.selenium.util.URLPathConstants;
import test.java.ie.murph.selenium.util.XPath;
import test.java.ie.murph.selenium.util.ITextConstants;

public class Myntra {
	private static final Logger LOGGER = LogManager.getLogger(Myntra.class.getName());

	public void findByName(WebDriver driver) throws InterruptedException {
		LOGGER.info("++findByName()");
		driver.get(URLPathConstants.MYNTRA_HOME_PAGE.toString());
		driver.findElement(By.name(ITextConstants.EMAIL_BY_NAME)).sendKeys(ITextConstants.EDUREKA_TEST_EMAIL_ADDRESS);
		Thread.sleep(3000);
		driver.findElement(By.name(ITextConstants.PASSWORD_BY_NAME)).sendKeys(ITextConstants.QWERTY);
	}
	
	public void findByXPath(WebDriver driver) {
		LOGGER.info("++findByXPath()");
		driver.get(URLPathConstants.MYNTRA_LOGIN_PAGE.toString());
		driver.findElement(By.xpath(XPath.INPUT_PLACEHOLDER_EMAIL_ADDRESS_MESSAGE.toString())).sendKeys(ITextConstants.EDUREKA_TEST_EMAIL_ADDRESS);
	}
	
}
