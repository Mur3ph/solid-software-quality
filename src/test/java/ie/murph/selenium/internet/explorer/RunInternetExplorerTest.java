package test.java.ie.murph.selenium.internet.explorer;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import test.java.ie.murph.selenium.driver.BrowserDriver;
import test.java.ie.murph.selenium.util.Browser;
import test.java.ie.murph.selenium.util.URLPathConstants;

public class RunInternetExplorerTest {
	private static final Logger LOGGER = LogManager.getLogger(RunInternetExplorerTest.class.getName());
	private static BrowserDriver browserDriver;

	public static void main(String[] args) {
		LOGGER.info("++main() thread" + args.length);
		browserDriver = new BrowserDriver(Browser.GOOGLE_CHROME);
		browserDriver.getBrowserDriver().get(URLPathConstants.GOOGLE.toString());
	}
}
