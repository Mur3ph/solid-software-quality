package test.java.ie.murph.selenium.chrome;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import test.java.ie.murph.selenium.driver.singleton.EChromeDriver;

public class RunSeleniumChromeTest {

private static final Logger LOGGER = LogManager.getLogger(RunSeleniumChromeTest.class.getName());
	
	public RunSeleniumChromeTest() {}
	
	public static void main(String[] args) {
		LOGGER.info("++main() thread"); 
		EChromeDriver.setChromeDriver();
		WebDriver driver = EChromeDriver.launchChromeBrowserDriver();
		
		driver.get("https://www.ebay.ie/");
		driver.findElement(By.id("gh-ac")).sendKeys("Mobiles");
		driver.findElement(By.id("gh-btn")).click();
	}
	
}
