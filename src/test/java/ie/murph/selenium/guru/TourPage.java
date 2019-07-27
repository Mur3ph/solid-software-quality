package test.java.ie.murph.selenium.guru;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import test.java.ie.murph.selenium.util.ITextConstants;

public class TourPage {
	private static final Logger LOGGER = LogManager.getLogger(TourPage.class.getName());

	public void runGetTitleTest(WebDriver driver, String baseUrl, String expectedTitle, String actualTitle) {
		LOGGER.info("++runGetTitleTest()"); 
		keepBrowserOpenForNumberOfSeconds(driver);
		directToBaseURLOfToursPage(driver, baseUrl);
		actualTitle = getTitleValueOfTourPage(driver);
		assertTitleName(actualTitle, actualTitle);
		closeFirefoxBrowser(driver);
	}
	
	private void keepBrowserOpenForNumberOfSeconds(WebDriver driver) {
		LOGGER.info("++keepBrowserOpenForNumberOfSeconds()");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	private void directToBaseURLOfToursPage(WebDriver driver, String baseUrl) {
		LOGGER.info("++directToBaseURLOfToursPage()");
//		launch Firefox
		driver.get(baseUrl);
	}

	private String getTitleValueOfTourPage(WebDriver driver) {
		LOGGER.info("++getTitleValueOfTourPage()");
		return driver.getTitle();
	}

	private void assertTitleName(String actualTitle, String expectedTitle) {
		LOGGER.info("++assertTitleName()");
		if (actualTitle.contentEquals(expectedTitle)) {
			LOGGER.info(ITextConstants.GURU99_TOURS_TEST_PASSED);
		} else {
			LOGGER.info(ITextConstants.GURU99_TOURS_TEST_FAILED);
		}
	}
	
	private void closeFirefoxBrowser(WebDriver driver) {
		LOGGER.info("++closeFirefoxBrowser()");
		driver.close();
	}
	
}
