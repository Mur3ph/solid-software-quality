package test.java.ie.murph.selenium.internet.explorer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import test.java.ie.murph.selenium.util.EURLPathConstants;

public class RunInternetExplorerTest {

	public static void main(String[] args) {
		System.setProperty(EURLPathConstants.INTERNET_EXPLORER_WEB_DRIVER_PROPERTY.toString(), EURLPathConstants.INTERNET_EXPLORER_WEB_DRIVER_EXE_JAR_PATH.toString());

		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
	}

}
