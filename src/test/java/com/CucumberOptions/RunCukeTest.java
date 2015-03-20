package com.CucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	
		features = "src/test/java/com/features",
		glue = "com.StepDefinitions",
		//tags = { "~@wip","~@notImplemented","@sanity" },
		dryRun = false,
		strict = true,
		monochrome=true,
		plugin = { "pretty",
				"junit:target_junit/cucumber.xml"
				},
		snippets=SnippetType.CAMELCASE
		)
public class RunCukeTest {
}
