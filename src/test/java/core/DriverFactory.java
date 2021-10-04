package core;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static WebDriver driver;

	public DriverFactory() {}

	public static WebDriver getDriver() {
		if (driver == null) {
			//chromedriver para Chrome version 94
			System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		return driver;
	}
	
	public static void KillDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
