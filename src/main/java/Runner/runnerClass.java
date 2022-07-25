package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class runnerClass {

	@RunWith(Cucumber.class)

	@CucumberOptions(features = "./src/main/java/Features", 
	glue = "./src/main/java/StepDefinations",
	dryRun = true, 
	monochrome = false, 
	tags = " @Tc1"


	)

	public class testRunner {

	}

}
