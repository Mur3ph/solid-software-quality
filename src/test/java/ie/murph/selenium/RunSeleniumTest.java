package test.java.ie.murph.selenium;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import test.java.ie.murph.selenium.domain.EURLPathConstants;
import test.java.ie.murph.selenium.domain.ITextConstants;
import test.java.ie.murph.selenium.driver.EGeckoDriver;
import test.java.ie.murph.selenium.driver.EMarionetteDriver;
import test.java.ie.murph.selenium.guru.TourPage;


public class RunSeleniumTest {
	private static final Logger LOGGER = LogManager.getLogger(RunSeleniumTest.class.getName());
	
	public RunSeleniumTest() {}
	
	public static void main(String[] args) {

		EGeckoDriver.setGeckoDriver();
		EMarionetteDriver.initializeMarionetteDriver();
		WebDriver driver = launchFireFoxBrowserDriver();

		String actualTitle = "";
		
		TourPage tourPage = new TourPage();
		tourPage.runGetTitleTest(driver, EURLPathConstants.GURU99_TOURS_BASE_URL.toString(), ITextConstants.GURU99_TOURS_EXPECTED_TITLE, actualTitle);
		
	}

	private static FirefoxDriver launchFireFoxBrowserDriver() {
		return new FirefoxDriver();
	}

}
