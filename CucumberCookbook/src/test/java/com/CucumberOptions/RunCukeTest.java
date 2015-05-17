package com.CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	
		features = "src/test/java/com/features",
		glue = "com.StepDefinitions",
		tags = { "@sanity" },
		dryRun = false,
		strict = true,
		monochrome=false,
		plugin = { "pretty",
				"html:target/cucumber_sanity.html"
				}
		)
public class RunCukeTest {
}
