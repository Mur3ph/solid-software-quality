package test.java.ie.murph.selenium.driver.singleton;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import test.java.ie.murph.selenium.util.EURLPathConstants;

public enum EGeckoDriver {
	INSTANCE;
    private static final Logger LOGGER = LogManager.getLogger(EGeckoDriver.class.getName());
    
    public static void setGeckoDriver() {
    	LOGGER.info("++setGeckoDriver()");
		// if you didn't update the Path system variable to add the full directory path
		// to the executable as above mentioned then doing this directly through code
		// System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
		System.setProperty(EURLPathConstants.GECKO_WEB_DRIVER_PROPERTY.toString(), EURLPathConstants.GECKO_WEB_DRIVER_EXE_JAR_PATH.toString()); // look into setting up via .properties or .xml file
		LOGGER.info(System.getProperty(EURLPathConstants.GECKO_WEB_DRIVER_PROPERTY.toString()));
		LOGGER.info(System.getProperties());
	}

}
