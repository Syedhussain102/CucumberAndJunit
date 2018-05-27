package stepDefination4;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mainBase.CommonApi;

public class bhalSmoke extends CommonApi{
	WebDriver driver;
	@Given("^url$")
	public void url() throws Throwable { startUp(); }

	@When("^i put username as well as password$")
	public void i_put_username_as_well_as_password(DataTable credential) throws Throwable {
		for (Map<String,String> dataMap :credential.asMaps(String.class, String.class)) {
			driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(dataMap.get("username"));
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(dataMap.get("password"));
		driver.findElement(By.id("loginbutton")).click();  
		}
	}
	@Then("^i see user homepage$")
	public void i_see_user_homepage() throws Throwable {
	    driver.quit();
	}
}
