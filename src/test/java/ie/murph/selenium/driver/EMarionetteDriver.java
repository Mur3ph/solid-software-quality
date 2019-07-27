package test.java.ie.murph.selenium.driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum EMarionetteDriver {
	INSTANCE;
    private static final Logger LOGGER = LogManager.getLogger(EMarionetteDriver.class.getName());
    
    public static void initializeMarionetteDriver() {
    	LOGGER.info("++initializeMarionetteDriver()");
		// Now you can Initialize marionette driver to launch firefox
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
	}
}
