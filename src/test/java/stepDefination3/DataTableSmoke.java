package stepDefination3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
			driver2.get("http://www.freecrm.com");
	}
	@When("^ent username again ent password$")
	public void ent_username_again_ent_password(DataTable credentials) throws Throwable {
		List<List<String>> data = credentials.raw();
		   driver2.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(data.get(0).get(0));
		   driver2.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(data.get(0).get(1));
	}
	@Then("^go to deal$")
	public void go_to_deal() throws Throwable {
		driver2.switchTo().frame("mainpanel");
		Actions action = new Actions(driver2);
		action.moveToElement(driver2.findElement(By.xpath("//a[contains(text(),'Deals']"))).build().perform();
		driver2.findElement(By.xpath("//a[contains(text(),'New Deals']")).click();    
	}
	@Then("^user enters deals details$")
	public void user_enters_deals_details(DataTable dealData) throws Throwable {
		List<List<String>> dealValues = dealData.raw();
	   driver2.findElement(By.xpath("//input[@name=\"title\"]")).sendKeys(dealValues.get(0).get(0));
	   driver2.findElement(By.xpath("//input[@name=\"probability\"]")).sendKeys(dealValues.get(0).get(1));
	   driver2.findElement(By.xpath("//input[@name=\"commission\"]")).sendKeys(dealValues.get(0).get(2));
	   driver2.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys(dealValues.get(0).get(3));
	}
}
