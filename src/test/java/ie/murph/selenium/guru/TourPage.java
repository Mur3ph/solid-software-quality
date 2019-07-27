package test.java.ie.murph.selenium.guru;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import test.java.ie.murph.selenium.util.ITextConstants;

public class TourPage {
	private static final Logger LOGGER = LogManager.getLogger(TourPage.class.getName());

	public void runGetTitleTest(WebDriver driver, String baseUrl, String expectedTitle, String actualTitle) {
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
			LOGGER.info(ITextConstants.GURU99_TOURS_TEST_PASSED);
			System.out.println(ITextConstants.GURU99_TOURS_TEST_PASSED);
		} else {
			LOGGER.info(ITextConstants.GURU99_TOURS_TEST_FAILED);
			System.out.println(ITextConstants.GURU99_TOURS_TEST_FAILED);
		}

		// close Fire fox
		driver.close();
	}
	
}
