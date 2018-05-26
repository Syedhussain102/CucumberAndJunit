package stepDefination3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableSmoke {
	WebDriver driver2;
	@Given("^Open Chrome$")
	public void open_Chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/sreejon/Desktop/develop/drivers/chromedriver");
		driver2 = new ChromeDriver();
			driver2.manage().window().maximize();
			driver2.get("http://www.facebook.com");
	}

	@When("^ent \"(.*?)\" again ent \"(.*?)\"$")
	public void ent_again_ent( DataTable credentials) throws Throwable {
	    List<List<String>> data = credentials.raw();
	   driver2.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	   driver2.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}

	@Then("^login successfully$")
	public void login_successfully() throws Throwable {
		driver2.quit();
	}

	
}
