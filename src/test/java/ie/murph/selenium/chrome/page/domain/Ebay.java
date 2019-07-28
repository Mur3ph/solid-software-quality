package test.java.ie.murph.selenium.chrome.page.domain;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import test.java.ie.murph.selenium.util.EURLPathConstants;
import test.java.ie.murph.selenium.util.ITextConstants;

public class Ebay {
	private static final Logger LOGGER = LogManager.getLogger(Ebay.class.getName());

	public void findById(WebDriver driver) {
		LOGGER.info("++findById()");
		driver.get(EURLPathConstants.EBAY_HOME_PAGE.toString()); // https://www.myntra.com/login?referer=https://www.myntra.com/
		driver.findElement(By.id(ITextConstants.TEXT_AREA_BY_ID)).sendKeys(ITextConstants.SEARCH_WORD_MOBILES);
		driver.findElement(By.id(ITextConstants.BUTTON_BY_ID)).click();
	}
	
	public void findByCSSSelector(WebDriver driver) {
		LOGGER.info("++findByCSSSelector()");
		driver.get(EURLPathConstants.EBAY_HOME_PAGE.toString());
		driver.findElement(By.cssSelector(ITextConstants.TEXT_AREA_BY_CSS_SELECTOR)).sendKeys(ITextConstants.SEARCH_WORD_HEADPHONES_FOR_METAL_DETECTOR);
		driver.findElement(By.cssSelector(ITextConstants.BUTTON_BY_CSS_SELECTOR)).click();
	}
	
}
