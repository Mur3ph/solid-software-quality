package test.java.ie.murph.selenium.chrome.page.domain;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Myntra {
	private static final Logger LOGGER = LogManager.getLogger(Myntra.class.getName());

	public void findByName(WebDriver driver) throws InterruptedException {
		LOGGER.info("++findByName()");
		driver.get("https://www.myntra.com/");
		driver.findElement(By.name("email")).sendKeys("edureka@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("qwerty");
	}
	
	public void findByXPath(WebDriver driver) {
		LOGGER.info("++findByXPath()");
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@placeholder='Your Email Address']")).sendKeys("edureka@yahoo.com");
	}
	
}
