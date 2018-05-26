package stepDefination2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StartingSmoke {
	WebDriver driver1;
	@Given("^Open Chrome and start the application$")
	public void open_Chrome_and_start_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/sreejon/Desktop/develop/drivers/chromedriver");
		driver1 = new ChromeDriver();
			driver1.manage().window().maximize();
			driver1.get("http://www.facebook.com");
	}

	@When("^enter valid \"(.*?)\"$")
	public void enter_valid(String email) throws Throwable {
		driver1.findElement(By.id("email")).sendKeys(email);
	}

	@When("^again enter valid \"(.*?)\"$")
	public void again_enter_valid(String passw) throws Throwable {
		driver1.findElement(By.id("pass")).sendKeys(passw);
		driver1.findElement(By.id("loginbutton")).click();
	}

	@Then("^succesful login$")
	public void succesful_login() throws Throwable {
	   driver1.quit();
	}


}
