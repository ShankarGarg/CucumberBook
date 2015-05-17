package com.cucumber.automation.bdt.stepDefinitions;

import java.net.MalformedURLException;

import com.cucumber.automation.utils.AppiumFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	AppiumFactory df = new AppiumFactory();
	
	@Before
	public void beforeScenario() throws MalformedURLException, InterruptedException{
		df.createDriver();
	}
	
	@After
	public void afterScenario(){
		df.teardown();
	}
}
