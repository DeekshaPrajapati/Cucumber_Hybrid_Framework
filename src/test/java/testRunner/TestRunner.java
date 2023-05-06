package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "src/test/resource/features/Registration.feature",
		"src/test/resource/features/login.feature", "src/test/resource/features/Search.feature" },

		glue = { "stepDefinations" },

		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },

		//tags = "@Regression,@Smoke,@Integration,@Sanity,@Functional,@End2End,@Negative,@SmokeTest",
		dryRun = false,
		monochrome = true

)
public class TestRunner {

}
