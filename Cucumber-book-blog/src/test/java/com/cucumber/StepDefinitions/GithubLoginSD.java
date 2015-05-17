package com.cucumber.StepDefinitions;

import java.net.MalformedURLException;

import com.cucumber.Selenium.SeleniumFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubLoginSD {

	SeleniumFunctions sf = new SeleniumFunctions();

	@Given("^user is on github homepage$")
	public void user_is_on_github_homepage() throws MalformedURLException,
			InterruptedException {
		sf.createDriver();
		sf.ishomepageDisplayed();
	}

	@When("^user clicks on Sign in button$")
	public void user_clicks_on_Sign_in_button() {
		sf.clickSigninLink();
	}

	@Then("^user is displayed login screen$")
	public void user_is_displayed_login_screen() {
		sf.isloginsectionDisplayed();
		sf.teardown();
	}


}
