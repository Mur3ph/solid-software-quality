package test.java.ie.murph.selenium.driver.singleton;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.firefox.FirefoxDriver;

import test.java.ie.murph.selenium.driver.IDriver;
import test.java.ie.murph.selenium.util.URLPathConstants;

public class FirefoxBrowserDriver implements IDriver{
	
    private static final Logger LOGGER = LogManager.getLogger(FirefoxBrowserDriver.class.getName());
    
    @Override
    public void setBrowserDriverGlobalSyetemProperty() {
    	LOGGER.info("++setGeckoDriver()");
		// if you didn't update the Path system variable to add the full directory path
		// to the executable as above mentioned then doing this directly through code
		// System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
		System.setProperty(URLPathConstants.GECKO_WEB_DRIVER_PROPERTY.toString(), URLPathConstants.GECKO_FIREFOX_WEB_DRIVER_EXE_JAR_PATH.toString()); // look into setting up via .properties or .xml file
		LOGGER.info(System.getProperty(URLPathConstants.GECKO_WEB_DRIVER_PROPERTY.toString()));
		LOGGER.info(System.getProperties());
	}
    
    @Override
    public FirefoxDriver instantiateBrowserDriver() {
    	LOGGER.info("++launchFireFoxBrowserDriver()");
		return new FirefoxDriver();
	}

}
