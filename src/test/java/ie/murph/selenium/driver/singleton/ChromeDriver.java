package test.java.ie.murph.selenium.driver.singleton;


import java.util.List;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test.java.ie.murph.selenium.driver.ABrowserDriver;
import test.java.ie.murph.selenium.driver.IDriver;
import test.java.ie.murph.selenium.util.URLPathConstants;

public class ChromeDriver implements IDriver {
	private static final Logger LOGGER = LogManager.getLogger(ChromeDriver.class.getName());
	private ABrowserDriver aBrowserDriver;
	
	public ChromeDriver() {
		this.aBrowserDriver = new ABrowserDriver();
	}

	@Override
	public void setChromeDriverGlobalSyetemProperty() {
		LOGGER.info("++setChromeDriverGlobalSyetemProperty()");
		// if you didn't update the Path system variable to add the full directory path
		// to the executable as above mentioned then doing this directly through code
		System.setProperty(URLPathConstants.CHROME_WEB_DRIVER_PROPERTY.toString(),
				URLPathConstants.CHROME_WEB_DRIVER_EXE_JAR_PATH.toString()); // look into setting up via
																				// .properties or
		LOGGER.info("setChromeDriverGlobalSyetemProperty() "
				+ System.getProperty(URLPathConstants.CHROME_WEB_DRIVER_PROPERTY.toString()));
		LOGGER.info("setChromeDriverGlobalSyetemProperty() " + System.getProperties());
	}

	@Override
	public void instantiateChromeBrowserDriver() {
		LOGGER.info("++instantiateChromeBrowserDriver()");
		aBrowserDriver = new ChromeDriver();
	}

}
