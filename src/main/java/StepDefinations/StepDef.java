package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef extends ReusableClass {

	ReusableClass reusableClass = new ReusableClass();

	@Given("^user launch on the website$")
	public void user_launch_on_the_website() {
		reusableClass.lunchTheBrpwser();
	}

	@When("^android user launch the web browser$")
	public void android_user_launch_the_web_browser() throws Throwable {
		reusableClass.lunchTheBrpwser();
	}

	@When("^android user click on qa automation field$")
	public void android_user_click_on_qa_automation_field() throws Throwable {
		String Automationfield= drive.findElement(By.xpath("//span[@class='text-wrap']"));
		reusableClass.cliconElement(Automationfield);
	}

	@Then("^demo site alert and popup option should be displayed to android user$")
	public void demo_site_alert_and_popup_option_should_be_displayed_to_android_user() throws Throwable {
	}

	@When("^android user click on alert and popup otion$")
	public void android_user_click_on_alert_and_popup_otion() throws Throwable {
	}

	@Then("^android user should navigate to alert and popup screen$")
	public void android_user_should_navigate_to_alert_and_popup_screen() throws Throwable {
	}

}
