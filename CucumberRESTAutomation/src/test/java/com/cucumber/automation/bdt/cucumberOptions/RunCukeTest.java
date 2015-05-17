package com.cucumber.automation.bdt.cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		features = "src/test/java/com/cucumber/automation/bdt/features",
		glue = "com.cucumber.automation.bdt.stepDefinitions",
		plugin = { 
					"pretty",
					"html:target/cucumber",
				} 
		
		)
public class RunCukeTest {
}