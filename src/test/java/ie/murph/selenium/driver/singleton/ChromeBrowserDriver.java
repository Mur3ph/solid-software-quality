package test.java.ie.murph.selenium.driver.singleton;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import test.java.ie.murph.selenium.driver.IDriver;
import test.java.ie.murph.selenium.util.URLPathConstants;

public class ChromeBrowserDriver implements IDriver {
	private static final Logger LOGGER = LogManager.getLogger(ChromeBrowserDriver.class.getName());
	
	public ChromeBrowserDriver() {}

	@Override
	public void setBrowserDriverGlobalSyetemProperty() {
		LOGGER.info("++setBrowserDriverGlobalSyetemProperty()");
//		If you didn't update the Path system variable to add the full directory path
//		to the executable as above mentioned then doing this directly through code
		System.setProperty(URLPathConstants.CHROME_WEB_DRIVER_PROPERTY.toString(),
				URLPathConstants.CHROME_WEB_DRIVER_EXE_JAR_PATH.toString()); 	// look into setting up via .properties or
		LOGGER.info("setChromeDriverGlobalSyetemProperty() "
				+ System.getProperty(URLPathConstants.CHROME_WEB_DRIVER_PROPERTY.toString()));
		LOGGER.info("setChromeDriverGlobalSyetemProperty() " + System.getProperties());
	}

	@Override
	public WebDriver instantiateBrowserDriver() {
		LOGGER.info("++instantiateBrowserDriver()");
		return new ChromeDriver();
	}

}
