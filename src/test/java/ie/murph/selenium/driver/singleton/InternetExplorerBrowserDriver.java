package test.java.ie.murph.selenium.driver.singleton;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import test.java.ie.murph.selenium.driver.IDriver;
import test.java.ie.murph.selenium.util.URLPathConstants;

public class InternetExplorerBrowserDriver implements IDriver{
	
	 private static final Logger LOGGER = LogManager.getLogger(InternetExplorerBrowserDriver.class.getName());

	@Override
	public void setBrowserDriverGlobalSyetemProperty() {
		LOGGER.info("++setBrowserDriverGlobalSyetemProperty()");
		System.setProperty(URLPathConstants.INTERNET_EXPLORER_WEB_DRIVER_PROPERTY.toString(), URLPathConstants.INTERNET_EXPLORER_WEB_DRIVER_EXE_JAR_PATH.toString());
		LOGGER.info("setBrowserDriverGlobalSyetemProperty() " + System.getProperty(URLPathConstants.INTERNET_EXPLORER_WEB_DRIVER_EXE_JAR_PATH.toString()));
		LOGGER.info("setBrowserDriverGlobalSyetemProperty() " + System.getProperties());
	}

	@Override
	public WebDriver instantiateBrowserDriver() {
		LOGGER.info("++instantiateBrowserDriver()");
		return new InternetExplorerDriver();
	}
	
	

}
