package test.java.ie.murph.selenium.chrome.page.domain;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import test.java.ie.murph.selenium.chrome.RunSeleniumChromeTest;

public class Myntra {
	private static final Logger LOGGER = LogManager.getLogger(RunSeleniumChromeTest.class.getName());

	public void findByName(WebDriver driver) throws InterruptedException {
		driver.get("https://www.myntra.com/");
		driver.findElement(By.name("email")).sendKeys("edureka@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("qwerty");
	}
	
	public void findByXPath(WebDriver driver) {
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@placeholder='Your Email Address']")).sendKeys("edureka@yahoo.com");
	}
	
}
