package com.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaptureGroupsSteps {

	//#Chapter 2: Recipe 4
	@Then("^I( do not see| see) following dollars in my account$")
	public void I_see_or_do_not_see_following_dollars_in_my_account(
			String seeOrDoNotSee) {

		// print the value of capture group
		System.out.println(seeOrDoNotSee);
	}

	//#Chapter 2: Recipe 4
	@Given("^(?:I have|He has|User has) following dollars in my account$")
	public void have_following_dollars_in_my_account() {

		// Non Capture groups are not captured in Step
	}

}
