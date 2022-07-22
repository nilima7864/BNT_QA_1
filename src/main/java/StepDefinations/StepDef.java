package StepDefinations;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef extends ReusableClass{

	 
	ReusableClass reusableClass= new ReusableClass();
	@Given("^user launch on the website$")
	public void user_launch_on_the_website()    {
		reusableClass.lunchTheBrpwser();
	}
	
	
	
}
