package test.java.ie.murph.selenium.firefox;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import test.java.ie.murph.selenium.driver.BrowserDriver;
import test.java.ie.murph.selenium.page.domain.TourPage;
import test.java.ie.murph.selenium.util.Browser;
import test.java.ie.murph.selenium.util.EURLPathConstants;
import test.java.ie.murph.selenium.util.ITextConstants;


public class RunSeleniumFirefoxTest {
	private static final Logger LOGGER = LogManager.getLogger(RunSeleniumFirefoxTest.class.getName());
	private static BrowserDriver browserDriver;
	
	public RunSeleniumFirefoxTest() {}
	
	public static void main(String[] args) {
		LOGGER.info("++main() thread"); 
		browserDriver = new BrowserDriver(Browser.MOZILLA_FIREFOX);

		TourPage tourPage = new TourPage();
		tourPage.runGetTitleTest(browserDriver.getBrowserDriver(), EURLPathConstants.GURU99_TOURS_BASE_URL.toString(), ITextConstants.GURU99_TOURS_EXPECTED_TITLE);
		
		LOGGER.info("--main() thread"); 
	}

}
