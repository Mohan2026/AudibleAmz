package org.stepDefinitions;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitions extends BaseClass {
	public WebDriver driver;

	@Given("User already has login details")
	public void user_already_has_login_details() {
		loadBrowser();
		launchUrl("https://www.audible.in/");
		maximize();	
		WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign In']"));
		signIn.click();	   
	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
		WebElement user = driver.findElement(By.id("ap_email"));
		user.sendKeys("netajimohan@gmail.com");
		WebElement pwd = driver.findElement(By.id("ap_password"));
		pwd.sendKeys("aero2014");
	
	}

	@And("User should click login button")
	public void user_should_click_login_button() {
		WebElement login = driver.findElement(By.id("signInSubmit"));
		login.click();
	   
	}

	@Then("User should see the main menu")
	public void user_should_see_the_main_menu() {
		WebElement verifyName = driver.findElement(By.xpath("//*[@id=\"top-1\"]/div/div/div/header/div[1]/span/nav/span/ul/li[1]/div/div[1]/a/span"));
	    String endUser = verifyName.getText();
	    Assert.assertEquals("Success", "Hi, Mohan!", endUser);
	    if(!(endUser=="Hi,Mohan!")) {
	    	System.out.println("failed");
	    }else {
	    	System.out.println("Passed");
	    }
	}



}
