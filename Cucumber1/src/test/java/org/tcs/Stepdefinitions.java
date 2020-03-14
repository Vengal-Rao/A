package org.tcs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinitions {
WebDriver driver;
@Given("Facebook login page")
public void facebook_login_page() {
 System.setProperty("webdriver.chrome.driver", "E:\\Vengal Files\\Maven\\Cucumber1\\driver\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
 
}

@When("The user needs to enter Username and Password.")
public void the_user_needs_to_enter_Username_and_Password() {
	driver.findElement(By.id("email")).sendKeys("ftyfghfghfgf");
	driver.findElement(By.id("pass")).sendKeys("115234673");
}

@Then("The user needs to click the Login button.")
public void the_user_needs_to_click_the_Login_button() {
	driver.findElement(By.id("loginbutton")).click();

	Assert.assertTrue("verify url",driver.getCurrentUrl().contains("login_attempt"));
	System.out.println("Invalid Login Details");

}


}
