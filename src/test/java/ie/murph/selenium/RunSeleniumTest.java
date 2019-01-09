package test.java.ie.murph.selenium;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class RunSeleniumTest {
	private static final Logger LOGGER = LogManager.getLogger(RunSeleniumTest.class.getName());

	public static void main(String[] args) {

		setGeckoDriver();
		initializeMarionetteDriver();
		WebDriver driver = launchFireFoxBrowserDriver();

		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";

		runGetTitleTest(driver,baseUrl, expectedTitle, actualTitle);
		
	}

	private static void setGeckoDriver() {
		// if you didn't update the Path system variable to add the full directory path
		// to the executable as above mentioned then doing this directly through code
		// System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
//		System.setProperty("webdriver.gecko.driver", "\"C:\\\\dev\\\\test\\\\gecko-driver\\\\geckodriver.exe\"");
		System.setProperty("webdriver.gecko.driver", "C:\\dev\\test\\gecko-driver\\geckodriver.exe"); // look into setting up via .properties or .xml file
		LOGGER.info(System.getProperty("webdriver.gecko.driver"));
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

	public static void runGetTitleTest(WebDriver driver, String baseUrl, String expectedTitle, String actualTitle) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);

		// get the actual value of the title
		actualTitle = driver.getTitle();

		/*
		 * compare the actual title of the page with the expected one and print the
		 * result as "Passed" or "Failed"
		 */
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		// close Fire fox
		driver.close();
	}
}
