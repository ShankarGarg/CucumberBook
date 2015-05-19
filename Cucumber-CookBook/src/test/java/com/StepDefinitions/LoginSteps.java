package com.StepDefinitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.Format;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Date;

public class LoginSteps {

	// Chapter 1, Recipe 3 Starts
	@Given("^Sign in button is present on screen$")
	public void sign_in_button_is_present_on_screen() {

	}

	@When("^user clicks on Sign in button$")
	public void user_clicks_on_Sign_in_button() {

	}

	@Then("^user is displayed login screen$")
	public void user_is_displayed_login_screen() {

	}

	// # Chapter 2: Recipe 3 Starts
	@When("^user enters \"(.*?)\" in username field$")
	public void user_enters_in_username_field(String arg1) {

		System.out.println(arg1);
	}

	@When("^user enters \"(.*?)\" in password field$")
	public void user_enters_in_password_field(String arg1) {

		System.out.println(arg1);
	}

	// # Chapter 2: Recipe 3 Ends

	@Then("^user is on home page$")
	public void user_is_on_home_page() {

	}

	@Then("^title of home page is \"(.*?)\"$")
	public void title_of_home_page_is(String arg1) {

	}

	@Then("^Sign in button is not present$")
	public void sign_in_button_is_not_present() {

	}

	// Chapter 1, Recipe 3 Ends

	// Chapter 1, Recipe 6 Starts
	@When("^user clicks on Signup for GitHub button$")
	public void user_clicks_on_Signup_for_GitHub_button() {
	}

	@Then("^user is successfully registered$")
	public void user_is_successfully_registered() {
	}

	// Chapter 1, Recipe 6 Ends

	// Chapter 1, Recipe 7 Starts
	// Chapter 2, Recipe 5 Starts
	@Then("^we verify following user exists$")
	public void we_verify_following_user_exists(DataTable arg1) {

	}

	// Chapter 1, Recipe 7 ends
	// Chapter 2, Recipe 5 ends

	// Chapter 1, Recipe 8 starts
	@Then("^user gets login failed error message$")
	public void user_gets_login_failed_error_message() {

	}

	// Chapter 1, Recipe 8 ends

	// Chapter 2, Recipe 6 Starts
	@Given("^user send a get request to \"(.*?)\"$")
	public void user_send_a_get_request_to(String arg1) {
		// lets assume user sends a get request
	}

	@Then("^user gets following response$")
	public void user_gets_following_response(DataTable expectedUsers) {

		// lets create a table for system response (actualUsers)
		List<List<String>> actualUsers = new ArrayList<List<String>>();
		actualUsers.add(Arrays.asList("username", "age"));
		actualUsers.add(Arrays.asList("sham", "25"));
		actualUsers.add(Arrays.asList("ram", "26"));

		// Use the diff method to differentiate two data tables
		expectedUsers.diff(actualUsers);
	}

	// Chapter 2, Recipe 6 Ends

	// Chapter 2, Recipe 7 Starts
	@Given("^a book named \"(.*?)\" with following body$")
	public void a_book_named_with_following_body(String arg1, String arg2) {
		// prints the regular expression
		System.out.println(arg1);

		// prints the Doc String
		System.out.println(arg2);
	}

	// Chapter 2, Recipe 7 Ends

	// Chapter 2, Recipe 8 Starts
	@Given("^I have a user account with (.*?) rights$")
	public void i_have_a_user_account_with_Manager_rights(String role) {

		// prints the role
		System.out.println(role);

	}

	@Then("^I should receive an email with the body:$")
	public void i_should_receive_an_email_with_the_body(String docString) {

		// prints the content of Doc String with Scenario outlineSubstitution
		System.out.println(docString);

	}
	// Chapter 2, Recipe 8 Ends
	
	// Chapter 2, Recipe 9 Starts
	@Given("^My Birthday is on \"(.*?)\"$")
	public void my_Birthday_is_on(@Format("dd-MM-yyyy") Date bday)  {
		//prints the text converted to Java.util.Date
	    System.out.println(bday);
	    
	    //prints the class of bday to confirm it's a Date
	    System.out.println(bday.getClass());
	}
	// Chapter 2, Recipe 9 ends

}
