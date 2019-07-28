package test.java.ie.murph.selenium.util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import test.java.ie.murph.selenium.driver.singleton.EGeckoDriver;

public enum EURLPathConstants
{
	GECKO_WEB_DRIVER_PROPERTY("webdriver.gecko.driver"),
	CHROME_WEB_DRIVER_PROPERTY("webdriver.chrome.driver"),
	GECKO_FIREFOX_WEB_DRIVER_EXE_JAR_PATH("C:\\dev\\jars\\web-drivers\\firefox\\geckodriver.exe"),
	CHROME_WEB_DRIVER_EXE_JAR_PATH("C:\\dev\\jars\\web-drivers\\chrome\\chromedriver.exe"),
	GURU99_TOURS_BASE_URL("http://demo.guru99.com/test/newtours/"),
	MYNTRA_LOGIN_PAGE("https://www.myntra.com/login?referer=https://www.myntra.com/"),
	MYNTRA_HOME_PAGE("https://www.myntra.com/"),
	EBAY_HOME_PAGE("https://www.ebay.ie/");
	
	private static final Logger LOGGER = LogManager.getLogger(EGeckoDriver.class.getName());
	private final String text;

    private EURLPathConstants(final String text) 
    {
        this.text = text;
    }

    @Override
    public String toString() 
    {
    	LOGGER.info("++toString()");
        return this.text;
    }
}
