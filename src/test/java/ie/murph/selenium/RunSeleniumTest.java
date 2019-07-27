package test.java.ie.murph.selenium;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import test.java.ie.murph.selenium.driver.singleton.EFirefoxDriver;
import test.java.ie.murph.selenium.driver.singleton.EGeckoDriver;
import test.java.ie.murph.selenium.driver.singleton.EMarionetteDriver;
import test.java.ie.murph.selenium.guru.TourPage;
import test.java.ie.murph.selenium.util.EURLPathConstants;
import test.java.ie.murph.selenium.util.ITextConstants;


public class RunSeleniumTest {
	private static final Logger LOGGER = LogManager.getLogger(RunSeleniumTest.class.getName());
	
	public RunSeleniumTest() {}
	
	public static void main(String[] args) {
		LOGGER.info("++main() thread"); 
		EGeckoDriver.setGeckoDriver();
		EMarionetteDriver.initializeMarionetteDriver();
		WebDriver driver = EFirefoxDriver.launchFireFoxBrowserDriver();

		String actualTitle = "";
		
		TourPage tourPage = new TourPage();
		tourPage.runGetTitleTest(driver, EURLPathConstants.GURU99_TOURS_BASE_URL.toString(), ITextConstants.GURU99_TOURS_EXPECTED_TITLE, actualTitle);
		LOGGER.info("--main() thread"); 
	}

}
