package test.java.ie.murph.selenium.driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import test.java.ie.murph.selenium.driver.singleton.Browser;

public enum BrowserDriverFactoryEnum {

	INSTANCE;
	private static final Logger LOGGER = LogManager.getLogger(BrowserDriverFactoryEnum.class.getName());

	public synchronized WebDriver createBrowserDriver(Browser browser) {

		LOGGER.info("++createBrowserDriver(" + browser + ")");
		switch (browser) {
		case GOOGLE_CHROME:
			// setDriverSystemPropertyVariable(Browser.GOOGLE_CHROME);
			// instantiateChromeBrowserDriver();
			break;
		case MOZILLA_FIREFOX:
			// setDriverSystemPropertyVariable(Browser.MOZILLA_FIREFOX);
			// instantiateFireFoxBrowserDriver();
			break;
		case INTERNET_EXPLORER:
			// setDriverSystemPropertyVariable(Browser.INTERNET_EXPLORER);
			// instantiateInternetExplorerBrowserDriver();
			break;
		default:
			LOGGER.info("BROWSER NOT SUPPORTED");
			break;
		}
		return null;
	}

}
