package test.java.ie.murph.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import test.java.ie.murph.selenium.WebDriver;

public class InitialTestNg {

	private static String baseUrl = "http://demo.guru99.com/test/newtours/";
	private static String driverPath = "C:\\\\dev\\\\test\\\\gecko-driver\\\\geckodriver.exe";
	private static WebDriver driver;

	@Test
	public void verifyHomepageTitle() {
		System.out.println("launching firefox browser");
		
//		System.setProperty("webdriver.firefox.marionette", driverPath);
		setGeckoDriver();
		driver = launchFireFoxBrowserDriver();
		getBrowserToWait();
		
		driver.get(baseUrl);
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
	}

	private static void setGeckoDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\dev\\test\\gecko-driver\\geckodriver.exe");
	}

	private static FirefoxDriver launchFireFoxBrowserDriver() {
		return new FirefoxDriver();
	}

	private static void getBrowserToWait()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
