package test.java.ie.murph.selenium.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BrowserDriver {

	WebDriver driver;

	public BrowserDriver() {}

	public BrowserDriver(WebDriver driver) {

	}

	public void setBrowserToMaxSize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void clearBrowserCookies(WebDriver driver) {
		driver.manage().deleteAllCookies();
	}

	public void setBrowserToTimeoutInSeconds(WebDriver driver, int seconds) {
		driver.manage().timeouts().pageLoadTimeout(seconds, TimeUnit.SECONDS);
	}

	public void setBrowserImpliciteWaitInSeconds(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void closeBrowser(WebDriver driver) {
		driver.close();
	}

}
