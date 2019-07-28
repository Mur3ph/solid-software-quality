package test.java.ie.murph.selenium.chrome;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import test.java.ie.murph.selenium.driver.singleton.EChromeDriver;

public class RunSeleniumChromeTest {

private static final Logger LOGGER = LogManager.getLogger(RunSeleniumChromeTest.class.getName());
	
	public RunSeleniumChromeTest() {}
	
	public static void main(String[] args) throws InterruptedException {
		LOGGER.info("++main() thread"); 
		EChromeDriver.setChromeDriver();
		WebDriver driver = EChromeDriver.launchChromeBrowserDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		findById(driver);
		findByName(driver);
		
		driver.close();
	}

	private static void findById(WebDriver driver) {
		driver.get("https://www.ebay.ie/");
		driver.findElement(By.id("gh-ac")).sendKeys("Mobiles");
		driver.findElement(By.id("gh-btn")).click();
	}

	private static void findByName(WebDriver driver) throws InterruptedException {
		driver.get("https://www.myntra.com/");
		driver.findElement(By.name("email")).sendKeys("edureka@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("qwerty");
	}
	
}
