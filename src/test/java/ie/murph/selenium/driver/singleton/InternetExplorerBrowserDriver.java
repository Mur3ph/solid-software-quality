package test.java.ie.murph.selenium.driver.singleton;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import test.java.ie.murph.selenium.driver.IDriver;

public class InternetExplorerBrowserDriver implements IDriver{
	
	 private static final Logger LOGGER = LogManager.getLogger(InternetExplorerBrowserDriver.class.getName());

	@Override
	public void setBrowserDriverGlobalSyetemProperty() {
		LOGGER.info("++setBrowserDriverGlobalSyetemProperty()");
	}

	@Override
	public WebDriver instantiateBrowserDriver() {
		LOGGER.info("++instantiateBrowserDriver()");
		return null;
	}
	
	

}
