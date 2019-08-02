package test.java.ie.murph.selenium.driver;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import test.java.ie.murph.selenium.util.Browser;
import test.java.ie.murph.selenium.util.EURLPathConstants;

public class BrowserDriver {

	private static final Logger LOGGER = LogManager.getLogger(BrowserDriver.class.getName());
	WebDriver driver;

	public BrowserDriver() {}
	
	public BrowserDriver(WebDriver driver, Browser browser) {
	    switch (browser) {
	        case GOOGLE_CHROME:
	        	instantiateChromeBrowserDriver(); 
	            break;
	        case MOZILLA_FIREFOX:
	        	instantiateFireFoxBrowserDriver();
	            break;
	        default:
	        	LOGGER.info("BROWSER NOT SUPPORTED");;
	            break;
	    }
	}

    public void instantiateChromeBrowserDriver() {
    	LOGGER.info("++instantiateChromeBrowserDriver()");
    	driver = new ChromeDriver();
	}
	
    public void instantiateFireFoxBrowserDriver() {
    	LOGGER.info("++instantiateFireFoxBrowserDriver()");
    	driver = new FirefoxDriver();
	}
	
	 public void setChromeDriverSystemVariableProperty() {
	    	LOGGER.info("++setChromeDriverSystemVariableProperty()");
			// if you didn't update the Path system variable to add the full directory path
			// to the executable as above mentioned then doing this directly through code
			// System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
			System.setProperty(EURLPathConstants.CHROME_WEB_DRIVER_PROPERTY.toString(), EURLPathConstants.CHROME_WEB_DRIVER_EXE_JAR_PATH.toString()); // look into setting up via .properties or .xml file
			LOGGER.info(System.getProperty(EURLPathConstants.CHROME_WEB_DRIVER_PROPERTY.toString()));
			LOGGER.info(System.getProperties());
		}
	 
	 public  void setFirefoxGeckoDriverSystemVariableProperty() {
	    	LOGGER.info("++setFirefoxGeckoDriverSystemVariableProperty()");
			// if you didn't update the Path system variable to add the full directory path
			// to the executable as above mentioned then doing this directly through code
			// System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
			System.setProperty(EURLPathConstants.GECKO_WEB_DRIVER_PROPERTY.toString(), EURLPathConstants.GECKO_FIREFOX_WEB_DRIVER_EXE_JAR_PATH.toString()); // look into setting up via .properties or .xml file
			LOGGER.info(System.getProperty(EURLPathConstants.GECKO_WEB_DRIVER_PROPERTY.toString()));
			LOGGER.info(System.getProperties());
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
		LOGGER.info("++setBrowserToTimeoutInSeconds()");
		driver.manage().timeouts().pageLoadTimeout(seconds, TimeUnit.SECONDS);
	}

	public void setBrowserImpliciteWaitInSeconds() {
		LOGGER.info("++setBrowserImpliciteWaitInSeconds()");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void closeBrowser() {
		LOGGER.info("++closeBrowser()");
		driver.close();
	}

}
