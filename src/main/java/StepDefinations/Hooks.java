package StepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseMethods{

	@Before
	public void beforeScenario() {
		System.out.println("Run Before the Scenario");
	}

	@After
	public void afterScenario() {
		System.out.println("Run After the scenario");
		driver.quit();
	}
}
