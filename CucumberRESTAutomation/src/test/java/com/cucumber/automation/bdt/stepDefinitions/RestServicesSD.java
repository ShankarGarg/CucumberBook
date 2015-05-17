package com.cucumber.automation.bdt.stepDefinitions;

import java.io.IOException;

import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;

import com.cucumber.automation.REST.RESTFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RestServicesSD {

	RESTFactory rt = new RESTFactory();

	@When("^user sends a GET request with \"(.*?)\"$")
	public void user_sends_a_GET_request_with(String url)
			throws ClientProtocolException, IOException {
		rt.getRequest(url);
	}

	@Then("^status code should be (\\d+)$")
	public void status_code_should_be(int statuscode)
			throws ClientProtocolException, IOException {
		rt.verifyStatusCode(statuscode);
	}

	@Then("^response type should be \"(.*?)\"$")
	public void response_type_should_be(String type) {
		rt.verifyResponseType(type);
	}

	@Then("^response contains user name \"(.*?)\"$")
	public void response_contains_user_name(String userName)
			throws ParseException, IOException {
		rt.verifyResponseData(userName);
	}

	@When("^user sends a POST request to \"(.*?)\" with follwoing details$")
	public void user_sends_a_POST_request_to_with_follwoing_details(String url,
			DataTable payload) throws ClientProtocolException, IOException {
		rt.postRequest(url, payload);
	}

}
