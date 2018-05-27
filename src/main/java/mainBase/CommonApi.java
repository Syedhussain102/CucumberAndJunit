package mainBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonApi {
	WebDriver driver;
	public void startUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/sreejon/Desktop/develop/drivers/chromedriver");
		driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.freecrm.com");
		
	}

}
