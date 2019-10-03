package test.java.ie.murph.selenium.driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import test.java.ie.murph.selenium.driver.singleton.Browser;
import test.java.ie.murph.selenium.driver.singleton.ChromeBrowserDriver;
import test.java.ie.murph.selenium.driver.singleton.FirefoxBrowserDriver;

public enum BrowserDriverFactoryEnum {

	INSTANCE;
	private static final Logger LOGGER = LogManager.getLogger(BrowserDriverFactoryEnum.class.getName());

	public synchronized WebDriver createBrowserDriver(Browser browser) {
		IDriver iDriver;

		LOGGER.info("++createBrowserDriver(" + browser + ")");
		switch (browser) {
		case GOOGLE_CHROME:
			iDriver = new ChromeBrowserDriver();
			iDriver.setBrowserDriverGlobalSyetemProperty();
			iDriver.instantiateBrowserDriver();
			break;
		case MOZILLA_FIREFOX:
			iDriver = new FirefoxBrowserDriver();
			iDriver.setBrowserDriverGlobalSyetemProperty();
			iDriver.instantiateBrowserDriver();
			break;
		case INTERNET_EXPLORER:
//			iDriver.setBrowserDriverGlobalSyetemProperty();
//			iDriver.instantiateBrowserDriver();
			break;
		default:
			LOGGER.info("BROWSER NOT SUPPORTED");
			break;
		}
		return null;
	}

}
