package test.java.ie.murph.selenium.driver;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import test.java.ie.murph.selenium.util.Browser;
import test.java.ie.murph.selenium.util.URLPathConstants;

public class BrowserDriver{

	private static final Logger LOGGER = LogManager.getLogger(BrowserDriver.class.getName());
	private static WebDriver driver;

	public BrowserDriver() {}

	public BrowserDriver(Browser browser) {
		LOGGER.info("++BrowserDriver(" + browser + ")");
		switch (browser) {
		case GOOGLE_CHROME:
			setDriverSystemPropertyVariable(Browser.GOOGLE_CHROME);
			instantiateChromeBrowserDriver();
			break;
		case MOZILLA_FIREFOX:
			setDriverSystemPropertyVariable(Browser.MOZILLA_FIREFOX);
			instantiateFireFoxBrowserDriver();
			break;
		case INTERNET_EXPLORER:
			setDriverSystemPropertyVariable(Browser.INTERNET_EXPLORER);
			instantiateInternetExplorerBrowserDriver();
			break;
		default:
			LOGGER.info("BROWSER NOT SUPPORTED");
			break;
		}
	}

	private void setDriverSystemPropertyVariable(Browser browser) {
		LOGGER.info("++setDriverSystemPropertyVariable(" + browser + ")");
		switch (browser) {
		case GOOGLE_CHROME:
			LOGGER.info("++Setting Chrome Driver System Variable Property");
			setChromeDriverGlobalSyetemProperty();
			break;
		case MOZILLA_FIREFOX:
			LOGGER.info("++Setting Firefox Driver System Variable Property");
			setFirefoxDriverGlobalSyetemProperty();
			break;
		case INTERNET_EXPLORER:
			LOGGER.info("++Setting Internet Explorer Driver System Variable Property");
			setInternetExplorerDriverGlobalSyetemProperty();
			break;
		default:
			LOGGER.info("NO DRIVER FOR THIS BROWSER");
			break;
		}
	}

	private void setChromeDriverGlobalSyetemProperty() {
		LOGGER.info("++setChromeDriverGlobalSyetemProperty()");
		// if you didn't update the Path system variable to add the full directory path
		// to the executable as above mentioned then doing this directly through code
		System.setProperty(URLPathConstants.CHROME_WEB_DRIVER_PROPERTY.toString(),
				URLPathConstants.CHROME_WEB_DRIVER_EXE_JAR_PATH.toString()); // look into setting up via
																				// .properties or
		LOGGER.info("setChromeDriverGlobalSyetemProperty() " + System.getProperty(URLPathConstants.CHROME_WEB_DRIVER_PROPERTY.toString()));
		LOGGER.info("setChromeDriverGlobalSyetemProperty() " + System.getProperties());
	}
	
	private void setFirefoxDriverGlobalSyetemProperty() {
		LOGGER.info("++setFirefoxDriverGlobalSyetemProperty()");
		System.setProperty(URLPathConstants.GECKO_WEB_DRIVER_PROPERTY.toString(),
				URLPathConstants.GECKO_FIREFOX_WEB_DRIVER_EXE_JAR_PATH.toString());
		LOGGER.info("setFirefoxDriverGlobalSyetemProperty() " + System.getProperty(URLPathConstants.GECKO_WEB_DRIVER_PROPERTY.toString()));
		LOGGER.info("setFirefoxDriverGlobalSyetemProperty() " + System.getProperties());
	}
	
	private void setInternetExplorerDriverGlobalSyetemProperty() {
		LOGGER.info("++setInternetExplorerDriverGlobalSyetemProperty()");
		System.setProperty(URLPathConstants.INTERNET_EXPLORER_WEB_DRIVER_PROPERTY.toString(), URLPathConstants.INTERNET_EXPLORER_WEB_DRIVER_EXE_JAR_PATH.toString());
		LOGGER.info("setInternetExplorerDriverGlobalSyetemProperty() " + System.getProperty(URLPathConstants.GECKO_WEB_DRIVER_PROPERTY.toString()));
		LOGGER.info("setInternetExplorerDriverGlobalSyetemProperty() " + System.getProperties());
	}

	private void instantiateChromeBrowserDriver() {
		LOGGER.info("++instantiateChromeBrowserDriver()");
		driver = new ChromeDriver();
	}

	private void instantiateFireFoxBrowserDriver() {
		LOGGER.info("++instantiateFireFoxBrowserDriver()");
		driver = new FirefoxDriver();
	}
	
	private void instantiateInternetExplorerBrowserDriver() {
		LOGGER.info("++instantiateFireFoxBrowserDriver()");
		driver = new InternetExplorerDriver();
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
