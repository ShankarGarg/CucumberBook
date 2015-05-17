package com.cucumber.automation.bdt.stepDefinitions;

import com.cucumber.automation.mobile.pages.android.AgendaPage;
import com.cucumber.automation.mobile.pages.android.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AgileNCRSD {

	HomePage hp = new HomePage();
	AgendaPage ap = new AgendaPage();

	@Given("^user is on AgileNCR Home Page$")
	public void user_is_on_AgileNCR_Home_Page() {
		hp.verifyHomePage();
	}

	@Then("^user gets an option Agenda$")
	public void user_gets_an_option_Agenda() {
		hp.verifyHomePageOptions();
	}

	@When("^user selects Agenda$")
	public void user_selects_Agenda() {
		hp.clickAgenda();
	}

	@Then("^user is on Agenda Screen$")
	public void user_is_on_Agenda_Screen() {
		ap.verifyAgendaPage();
	}

	@When("^user chooses to go back$")
	public void user_chooses_to_go_back() {
		ap.clickBack();
	}

}
