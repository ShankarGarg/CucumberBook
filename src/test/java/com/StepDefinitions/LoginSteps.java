package com.StepDefinitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import cucumber.api.DataTable;
import cucumber.api.Format;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	@Given("^user is displayed login screen$")
	public void user_is_displayed_login_screen() {
		System.out.println("here");
	}

	@When("^user enters \"(.*?)\" in username field$")
	public void user_enters_in_username_field(String username) {
		System.out.println(username);
	}

	@When("^user enters \"(.*?)\" in password field$")
	public void user_enters_in_password_field(String password) {
		System.out.println(password);
	}

	@When("^user clicks Sign in button$")
	public void user_clicks_Sign_in_button() {
	}

	@Given("I have (\\d+) Dollars in my account")
	public void I_have_dollar_acnt(int dollar) {
		// Do something with the dollars
	}

	@Given("^I am available on \"(.+)\"$")
	public void i_am_available_on(List<String> days) {
		System.out.println(days.size());
	}

	/*
	 * @Then("^we verify following user exists$") public void
	 * we_verify_following_user_exists(DataTable userDetails)  {
	 * 
	 * List<List<String>> details = userDetails.raw();
	 * 
	 * for (int i = 0; i < details.size(); i++) { for (int j = 0; j <
	 * details.get(i).size(); j++) { System.out.println(details.get(i).get(j));
	 * } } }
	 */

	/*
	 * @Then("^we verify following user exists$") public void
	 * we_verify_following_user_exists(List<User> userList)  {
	 * for (User u : userList) { System.out.println(u.name); } }
	 */

	/*@Then("^we verify following user exists$")
	public void we_verify_following_user_exists(List<Map<String, String>> userList) {
		for (Map<String, String> u : userList) {
			System.out.println(u);
		}
	}*/
	
	/*@Then("^we verify following user exists$")
	public void we_verify_following_user_exists(List<List<String>> userList) {
		for (List<String> u : userList) {
			System.out.println(u);
		}
	}*/
	

	public class User {
		public String name;
		public String email;
	}
	
	
	@Given("^My Birthday is on \"(.*?)\"$")
	public void my_Birthday_is_on(@Format("dd-MM-yyyy") Date bday)  {
		//prints the text converted to Java.util.Date
	    System.out.println(bday);
	    
	    //prints the class of bday to confirm it's a Date
	    System.out.println(bday.getClass());
	}
	
	@Given("^a book named \"(.*?)\" with following body$")
	public void a_book_named_with_following_body(String arg1, String arg2)  {
		//prints the regular expression
		System.out.println(arg1);

		//prints the Doc String
		System.out.println(arg2);
	}
	
	@Given("^user send a get request to \"(.*?)\"$")
	public void user_send_a_get_request_to(String arg1)  {
		// lets assume user sends a get request
	}

	@Then("^user gets following response$")
	public void user_gets_following_response(DataTable expectedUsers) {
		
		//lets create a table for system response ( actualUsers)
		List<List<String>> actualUsers = new ArrayList<List<String>>();
		actualUsers.add( Arrays.asList("username", "age"));
		actualUsers.add( Arrays.asList("sham", "25"));
		actualUsers.add( Arrays.asList("ram", "26"));
		
		//Use the diff method to differniate two data tables
		expectedUsers.diff(actualUsers);
	}

	
	@Given("^I have a user account with (.*?) rights$")
	public void i_have_a_user_account_with_Manager_rights(String role)  {
		//prints the role
		System.out.println(role);

	}

	@Then("^I should receive an email with the body:$")
	public void i_should_receive_an_email_with_the_body(String docString)  {
		
		//prints the content of Doc String with Scenario outline Substitution 
		System.out.println(docString);

	}
	
	@Then("^I( do not see| see) following dollars in my account$")
    public void I_see_or_do_not_see_following_dollars_in_my_account(String seeOrDoNotSee) {
		
		//print the value of capture group
		System.out.println(seeOrDoNotSee);
    }
	
	@Given("^(?:I have|He has|User has) following dollars in my account$")
	public void have_following_dollars_in_my_account() {
		
		// Non Capture groups are not captured in Step
	}
	
	@Given("^user is on Application home page$")
	public void user_is_on_Application_home_page()  {
	    
	 // System.out.println("1");
	}

	@Then("^user gets a github bootcamp section$")
	public void user_gets_a_github_bootcamp_section()  {
	  
	}

	@When("^user focuses on GitHub Bootcamp Section$")
	public void user_focuses_on_GitHub_Bootcamp_Section()  {

	}

	@Then("^user gets an option to setup git$")
	public void user_gets_an_option_to_setup_git()  {
	    
	  
	}

	@When("^user focuses on Top Banner$")
	public void user_focuses_on_Top_Banner() {
	  
	}

	@Then("^user gets an option of home page$")
	public void user_gets_an_option_of_home_page()  {
	    
	  
	}
	
	@Then("^user gets an option of home page1$")
	public void user_gets_an_option_of_home_page2()  {
	    
	  
	}
	
	@When("^user sends a GET request$")
	public void user_sends_a_GET_request() {
	}
	
	@When("^user enters username$")
	public void user_enters_username() {
	}

	@When("^user enters password$")
	public void user_enters_password() {;
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() {
	}

	@Given("^user is on Application landing page$")
	public void user_is_on_Application_landing_page()  {
	    
	    
	}

	@Given("^Sign in button is present on screen$")
	public void sign_in_button_is_present_on_screen()  {
	    
	    
	}

	@When("^user clicks on Sign in button$")
	public void user_clicks_on_Sign_in_button()  {
	    
	    
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
	    
	    
	}

	@Then("^title of home page is \"(.*?)\"$")
	public void title_of_home_page_is(String arg1)  {
	    
	    
	}

	@Then("^user gets login failed error message$")
	public void user_gets_login_failed_error_message()  {
	    
	    
	}

	@Then("^we verify following user exists$")
	public void we_verify_following_user_exists(DataTable arg1)  {
	    
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	@When("^user enters \"(.*?)\" in password filed$")
	public void user_enters_in_password_filed(String arg1)  {
	    
	    
	}

	@When("^user clicks on Signup for Github button$")
	public void user_clicks_on_Signup_for_Github_button()  {
	    
	    
	}

	@Then("^user is successfully registered$")
	public void user_is_successfully_registered()  {
	    
	    
	}
	
}
