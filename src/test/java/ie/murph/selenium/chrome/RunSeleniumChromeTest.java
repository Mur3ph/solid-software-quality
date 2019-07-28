package test.java.ie.murph.selenium.chrome;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import test.java.ie.murph.selenium.chrome.page.domain.EBay;
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
		
		EBay ebay = new EBay();
		ebay.findById(driver);
		findByName(driver);
		ebay.findByCSSSelector(driver);
		findByXPath(driver);
		
//		driver.close();
	}

	private static void findByName(WebDriver driver) throws InterruptedException {
		driver.get("https://www.myntra.com/");
		driver.findElement(By.name("email")).sendKeys("edureka@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("qwerty");
	}
	
	private static void findByXPath(WebDriver driver) {
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@placeholder='Your Email Address']")).sendKeys("edureka@yahoo.com");
	}
	
}
