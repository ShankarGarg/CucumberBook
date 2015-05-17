package com.cucumber.automation.bdt.stepDefinitions;

import com.cucumber.automation.web.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubLoginSD {
	
	LoginPage lp = new LoginPage();
	
	@Given("^user is on github homepage$")
	public void user_is_on_github_homepage()  {  
	    lp.ishomepageDisplayed();
	}

	@When("^user clicks on Sign in button$")
	public void user_clicks_on_Sign_in_button()  {  
	    lp.clickSigninLink();
	}

	@Then("^user is displayed login screen$")
	public void user_is_displayed_login_screen()  {
	      lp.isloginsectionDisplayed();
	}

	@When("^user clicks Sign in button$")
	public void user_clicks_Sign_in_button()  {  
	    lp.clickSigninButton();
	}

	@Then("^user gets an error message \"(.*?)\"$")
	public void user_gets_an_error_message(String arg1)  {
	    lp.verifyErrorMessage(arg1);
	}

}
