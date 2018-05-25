package com.freecrm.stepdefinition;

import org.junit.Assert;

import com.freecrm.pages.HomePage;
import com.freecrm.pages.loginPage;
import com.freecrm.utilities.BaseProject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends BaseProject {
	
	loginPage loginPageTest;
	HomePage homePage ;
	
@Given("^I open a browser$")
public void i_open_a_browser()  {
	BaseProject.initialize();
}

@When("^I go to free crm link$")
public void i_go_to_free_crm_link() {
	driver.get(prop.getProperty("url"));
}

@When("^I see crm logo$")
public void i_see_crm_logo()  {
	loginPageTest = new loginPage();
	loginPageTest.validateCRMLogo();
	
}

@When("^I see forgot password link$")
public void i_see_forgot_password_link()  {
	boolean fgtLink = loginPageTest.validateForgotPasswordLink();
    Assert.assertTrue(fgtLink);
}

@When("^I see features link$")
public void i_see_features_link()  {
    
}

@When("^I see Signup link$")
public void i_see_Signup_link()  {
    
}

@When("^I see Pricing link$")
public void i_see_Pricing_link() {
    
}

@When("^I see Customers link$")
public void i_see_Customers_link() {
    
}

@When("^I see Contact link$")
public void i_see_Contact_link()  {
    
}

@When("^I enter username and password$")
public void i_enter_username_and_password() throws InterruptedException {
	 
	loginPageTest.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(3000);
}

@When("^I click Login button$")
public void i_click_Login_button() {
	loginPageTest.clickLink();
    
}

@Then("^I should see logout link$")
public void i_should_see_logout_link()  {
    
}

}