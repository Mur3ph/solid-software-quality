package test.java.ie.murph.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import test.java.ie.murph.selenium.WebDriver;

public class InitialTestNg {

	private String baseUrl = "http://demo.guru99.com/test/newtours/";
	private String driverPath = "C:\\\\dev\\\\test\\\\gecko-driver\\\\geckodriver.exe";
	private WebDriver driver;
	private String expected = "";
	private String actual = "";

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching firefox browser");
		setGeckoDriver();
		driver = launchFireFoxBrowserDriver();
		getBrowserToWait();
		driver.get(baseUrl);
	}
	
	private void setGeckoDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\dev\\test\\gecko-driver\\geckodriver.exe");
	}

	private FirefoxDriver launchFireFoxBrowserDriver() {
		return new FirefoxDriver();
	}

	private void getBrowserToWait(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void verifyHomepageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 0)
	public void register() {
		driver.findElement(By.linkText("REGISTER")).click();
		expected = "Register: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 1)
	public void support() {
		driver.findElement(By.linkText("SUPPORT")).click();
		expected = "Under Construction: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@AfterMethod
	public void goBackToHomepage() {
		driver.findElement(By.linkText("Home")).click();
	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}

}
