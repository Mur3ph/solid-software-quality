package test.java.ie.murph.selenium.internet.explorer;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import test.java.ie.murph.selenium.util.URLPathConstants;

public class RunInternetExplorerTest {
	private static final Logger LOGGER = LogManager.getLogger(RunInternetExplorerTest.class.getName());

	public static void main(String[] args) {
		LOGGER.info("++main() thread" + args.length);
		System.setProperty(URLPathConstants.INTERNET_EXPLORER_WEB_DRIVER_PROPERTY.toString(), URLPathConstants.INTERNET_EXPLORER_WEB_DRIVER_EXE_JAR_PATH.toString());

		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
	}

}
