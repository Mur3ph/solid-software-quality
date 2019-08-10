package test.java.ie.murph.selenium.driver;

import test.java.ie.murph.selenium.util.Browser;

public interface IDriver {
	
	void setDriverSystemPropertyVariable(Browser browser);
	void setChromeDriverGlobalSyetemProperty();
	void instantiateChromeBrowserDriver();

}
