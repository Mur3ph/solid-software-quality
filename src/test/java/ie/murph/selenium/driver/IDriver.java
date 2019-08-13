package test.java.ie.murph.selenium.driver;

import org.openqa.selenium.WebDriver;

public interface IDriver{
	
	void setChromeDriverGlobalSyetemProperty();
	WebDriver instantiateChromeBrowserDriver();

}
