package test.java.ie.murph.selenium.firefox;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import test.java.ie.murph.selenium.driver.BrowserDriver;
import test.java.ie.murph.selenium.page.domain.TourPage;
import test.java.ie.murph.selenium.util.Browser;


public class RunSeleniumFirefoxTest {
	private static final Logger LOGGER = LogManager.getLogger(RunSeleniumFirefoxTest.class.getName());
	private static BrowserDriver browserDriver;
	
	public RunSeleniumFirefoxTest() {}
	
	public static void main(String[] args) {
		LOGGER.info("++main() thread"); 
		browserDriver = new BrowserDriver(Browser.MOZILLA_FIREFOX);
		browserDriver.setBrowserImpliciteWaitInSeconds(10);

		TourPage tourPage = new TourPage();
		tourPage.directToBaseURLOfToursPage(browserDriver.getBrowserDriver());
		String actualTitle = tourPage.getTitleValueOfTourPage(browserDriver.getBrowserDriver());
		tourPage.assertTitleName(actualTitle);
		
		LOGGER.info("--main() thread"); 
	}

}
