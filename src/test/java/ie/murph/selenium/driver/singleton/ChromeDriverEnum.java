package test.java.ie.murph.selenium.driver.singleton;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

import test.java.ie.murph.selenium.util.URLPathConstants;

public enum ChromeDriverEnum {
	INSTANCE;
    private static final Logger LOGGER = LogManager.getLogger(ChromeDriverEnum.class.getName());
    
    public static void setChromeDriver() {
    	LOGGER.info("++setChromeDriver()");
		// if you didn't update the Path system variable to add the full directory path
		// to the executable as above mentioned then doing this directly through code
		// System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
		System.setProperty(URLPathConstants.CHROME_WEB_DRIVER_PROPERTY.toString(), URLPathConstants.CHROME_WEB_DRIVER_EXE_JAR_PATH.toString()); // look into setting up via .properties or .xml file
		LOGGER.info(System.getProperty(URLPathConstants.CHROME_WEB_DRIVER_PROPERTY.toString()));
		LOGGER.info(System.getProperties());
	}
    
    public static ChromeDriver launchChromeBrowserDriver() {
    	LOGGER.info("++launchChromeBrowserDriver()");
		return new ChromeDriver();
	}

}
