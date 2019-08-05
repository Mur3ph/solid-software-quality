package test.java.ie.murph.selenium.driver.singleton;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.firefox.FirefoxDriver;

public enum FirefoxDriverEnum {
	
	INSTANCE;
    private static final Logger LOGGER = LogManager.getLogger(FirefoxDriverEnum.class.getName());
    
    public static FirefoxDriver launchFireFoxBrowserDriver() {
    	LOGGER.info("++launchFireFoxBrowserDriver()");
		return new FirefoxDriver();
	}

}
