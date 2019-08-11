package test.java.ie.murph.selenium.driver;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class ABrowserDriver{

	private static final Logger LOGGER = LogManager.getLogger(ABrowserDriver.class.getName());
	private WebDriver driver;

	public ABrowserDriver() {}
	
	public ABrowserDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getBrowserDriver() {
		return driver;
	}

	public void setBrowserToMaxSize() {
		LOGGER.info("++setBrowserToMaxSize()");
		driver.manage().window().maximize();
	}

	public void clearBrowserCookies() {
		LOGGER.info("++clearBrowserCookies()");
		driver.manage().deleteAllCookies();
	}

	public void setBrowserToTimeoutInSeconds(int seconds) {
		LOGGER.info("++setBrowserToTimeoutInSeconds(" + seconds + ")");
		driver.manage().timeouts().pageLoadTimeout(seconds, TimeUnit.SECONDS);
	}

	public void setBrowserImpliciteWaitInSeconds(int seconds) {
		LOGGER.info("++setBrowserImpliciteWaitInSeconds(" + seconds + ")");
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	public void closeBrowser() {
		LOGGER.info("++closeBrowser()");
		driver.close();
	}

}
