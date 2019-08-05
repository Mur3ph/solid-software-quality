package test.java.ie.murph.selenium.page.domain;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import test.java.ie.murph.selenium.util.URLPathConstants;
import test.java.ie.murph.selenium.util.ITextConstants;

public class TourPage {
	private static final Logger LOGGER = LogManager.getLogger(TourPage.class.getName());
	private String expectedTitle = ITextConstants.GURU99_TOURS_EXPECTED_TITLE;

	public void directToBaseURLOfToursPage(WebDriver driver) {
		LOGGER.info("++directToBaseURLOfToursPage()");
		driver.get(URLPathConstants.GURU99_TOURS_BASE_URL.toString());
	}

	public String getTitleValueOfTourPage(WebDriver driver) {
		LOGGER.info("++getTitleValueOfTourPage()");
		return driver.getTitle();
	}

	public void assertTitleName(String actualTitle) {
		LOGGER.info("++assertTitleName(actualTitle: " + actualTitle + " expectedTitle: " + expectedTitle + ")");
		if (actualTitle.contentEquals(expectedTitle)) {
			LOGGER.info(ITextConstants.GURU99_TOURS_TEST_PASSED);
		} else {
			LOGGER.info(ITextConstants.GURU99_TOURS_TEST_FAILED);
		}
	}
}
