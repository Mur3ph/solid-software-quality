package test.java.ie.murph.selenium.chrome;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import test.java.ie.murph.selenium.chrome.page.domain.Ebay;
import test.java.ie.murph.selenium.chrome.page.domain.Myntra;
import test.java.ie.murph.selenium.driver.singleton.EChromeDriver;

public class RunSeleniumChromeTest {

	private static final Logger LOGGER = LogManager.getLogger(RunSeleniumChromeTest.class.getName());
	private static final Scanner SCANNER = new Scanner(System.in);

	public RunSeleniumChromeTest() {
	}

	public static void main(String[] args) throws InterruptedException {
		LOGGER.info("++main() thread");
		EChromeDriver.setChromeDriver();
		WebDriver driver = EChromeDriver.launchChromeBrowserDriver();

		setupBrowser(driver);

		Ebay ebay = new Ebay();
		Myntra myntra = new Myntra();
		ebay.findById(driver);
		myntra.findByName(driver);
		ebay.findByCSSSelector(driver);
		myntra.findByXPath(driver);

		// driver.close();
	}

	private static void setupBrowser(WebDriver driver) {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// Method to ask the user if they want to try again.
	public static void askToContinue() throws InterruptedException {
		System.out.println("Do you want to run test again: (y/n)");

		String s_continue = SCANNER.nextLine();
		if (s_continue.equalsIgnoreCase("y") || s_continue.equalsIgnoreCase("yes")) {
			// Reseting and Starting again..
			main(new String[0]);
		} else if (s_continue.equalsIgnoreCase("n") || s_continue.equalsIgnoreCase("no")) {
			System.out.println("Good bye!");
			System.exit(0);
		} else
			askToContinue();
	}

}
