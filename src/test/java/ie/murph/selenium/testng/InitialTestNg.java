package test.java.ie.murph.selenium.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class InitialTestNg {
	private static final Logger LOGGER = LogManager.getLogger(InitialTestNg.class.getName());
	private String BASE_URL_OF_SITE_TO_TEST = "http://demo.guru99.com/test/newtours/";
	private String PATH_TO_GECKO_DRIVER = "C:\\\\dev\\\\test\\\\gecko-driver\\\\geckodriver.exe";
	private String GECKO_DRIVER_NAME = "webdriver.gecko.driver";
	private WebDriver WEB_DRIVER;
	private String expected = "";
	private String actual = "";

	@BeforeTest
	public void launchBrowser() {
		LOGGER.info("launching firefox browser");
		setGeckoDriver();
		WEB_DRIVER = launchFireFoxBrowserDriver();
		getBrowserToWait();
		WEB_DRIVER.get(BASE_URL_OF_SITE_TO_TEST);
	}

	private void setGeckoDriver() {
		System.setProperty(GECKO_DRIVER_NAME, PATH_TO_GECKO_DRIVER);
	}

	private FirefoxDriver launchFireFoxBrowserDriver() {
		return new FirefoxDriver();
	}

	private void getBrowserToWait() {
		WEB_DRIVER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void verifyHomepageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = WEB_DRIVER.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 0)
	public void register() {
		WEB_DRIVER.findElement(By.linkText("REGISTER")).click();
		expected = "Register: Mercury Tours";
		actual = WEB_DRIVER.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 1)
	public void support() {
		WEB_DRIVER.findElement(By.linkText("SUPPORT")).click();
		expected = "Under Construction: Mercury Tours";
		actual = WEB_DRIVER.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@AfterMethod
	public void goBackToHomepage() {
		WEB_DRIVER.findElement(By.linkText("Home")).click();
	}

	@AfterTest
	public void terminateBrowser() {
		WEB_DRIVER.close();
	}

}
