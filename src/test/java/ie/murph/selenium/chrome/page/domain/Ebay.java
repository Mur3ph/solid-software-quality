package test.java.ie.murph.selenium.chrome.page.domain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ebay {

	public void findById(WebDriver driver) {
		driver.get("https://www.ebay.ie/"); // https://www.myntra.com/login?referer=https://www.myntra.com/
		driver.findElement(By.id("gh-ac")).sendKeys("Mobiles");
		driver.findElement(By.id("gh-btn")).click();
	}
	
	public void findByCSSSelector(WebDriver driver) {
		driver.get("https://www.ebay.ie/");
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Metal Detector Headphones");
		driver.findElement(By.cssSelector("#gh-btn")).click();
	}
	
}
