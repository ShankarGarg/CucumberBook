package com.CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	
		features = "src/test/java/com/features",
		glue = "com.StepDefinitions",
		tags = {"@regression" },
		dryRun = false,
		strict = true,
		monochrome=true,
		format = { "pretty",
				"html:target/cucumber-report/regression"
				}
		)
public class RunCuke2Test {
}