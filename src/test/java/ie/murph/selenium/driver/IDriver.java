package test.java.ie.murph.selenium.driver;

import org.openqa.selenium.chrome.ChromeDriver;

public interface IDriver{
	
	void setChromeDriverGlobalSyetemProperty();
	ChromeDriver instantiateChromeBrowserDriver();

}
