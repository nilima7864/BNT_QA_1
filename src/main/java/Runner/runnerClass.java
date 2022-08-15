package Runner;

import org.junit.runner.RunWith;

//import StepDefinations.TestNGCucumberExecutable;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class runnerClass {

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "./src/main/java/Features", glue = "./src/main/java/StepDefinations", dryRun = false,

			monochrome = false, tags = "@Alert3", plugin = {
					"pretty", "html:target/site/cucumber-pretty",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports111/Extentreport.html"

			})
	public class testRunner  {

	}

}
