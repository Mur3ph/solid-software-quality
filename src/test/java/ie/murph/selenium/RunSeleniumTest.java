package test.java.ie.murph.selenium;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import test.java.ie.murph.selenium.domain.EURLPathConstants;
import test.java.ie.murph.selenium.domain.ITextConstants;
import test.java.ie.murph.selenium.guru.TourPage;


public class RunSeleniumTest {
	private static final Logger LOGGER = LogManager.getLogger(RunSeleniumTest.class.getName());
	
	public RunSeleniumTest() {}
	
	public static void main(String[] args) {

		setGeckoDriver();
		initializeMarionetteDriver();
		WebDriver driver = launchFireFoxBrowserDriver();

		String actualTitle = "";
		
		TourPage tourPage = new TourPage();
		tourPage.runGetTitleTest(driver, EURLPathConstants.GURU99_TOURS_BASE_URL.toString(), ITextConstants.GURU99_TOURS_EXPECTED_TITLE, actualTitle);
		
	}

	private static void setGeckoDriver() {
		// if you didn't update the Path system variable to add the full directory path
		// to the executable as above mentioned then doing this directly through code
		// System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
//		System.setProperty("webdriver.gecko.driver", "\"C:\\\\dev\\\\test\\\\gecko-driver\\\\geckodriver.exe\"");
//		C:\dev\jars
		System.setProperty(EURLPathConstants.GECKO_WEB_DRIVER_PROPERTY.toString(), EURLPathConstants.GECKO_WEB_DRIVER_EXE_JAR_PATH.toString()); // look into setting up via .properties or .xml file
		LOGGER.info(System.getProperty(EURLPathConstants.GECKO_WEB_DRIVER_PROPERTY.toString()));
		LOGGER.info(System.getProperties());
	}

	private static void initializeMarionetteDriver() {
		// Now you can Initialize marionette driver to launch firefox
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
	}

	private static FirefoxDriver launchFireFoxBrowserDriver() {
		return new FirefoxDriver();
	}

}
