package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Constent.locators;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDef extends ReusableClass {

	ReusableClass reusableClass = new ReusableClass();

	@Given("^user launch on the website$")
	public void user_launch_on_the_website() {

		reusableClass.lunchTheBrpwser();
	}

	@When("^User land on registration form$")
	public void user_land_on_registration_form() {

		Actions act = new Actions(driver);

		String path = Constent.locators.QA_AUTOMATION;
		// WebElement element = driver.findElement(By.xpath(path));
		WebElement element = reusableClass.element(path);
		// act.moveToElement(element).perform();
		Mouseover(element);

		String path1 = Constent.locators.Practice_Automation;
		// WebElement element1 = driver.findElement(By.xpath(path1));
		WebElement element1 = reusableClass.element(path1);
		act.moveToElement(element1).perform();

		String path2 = Constent.locators.Registration_Form;
		reusableClass.clickonElement(path2);

	}

	@When("^user enter the \"([^\"]*)\" in firstname$")
	public void user_enter_the_in_firstname(String firstname) {
		String FN = Constent.locators.FirstName;
		SendKey(FN, firstname);

	}

	@When("^user enter the \"([^\"]*)\" in lastname$")
	public void user_enter_the_in_lastname(String lastname) {
		String LN = Constent.locators.LastName;
		SendKey(LN, lastname);
	}

	@When("^user select the Gender$")
	public void user_select_the_Gender() throws Throwable {
		String Gender = Constent.locators.Gender;
		clickonElement(Gender);
	}

	@When("^user enter the \"([^\"]*)\" in address$")
	public void user_enter_the_in_address(String address) {
		String add = Constent.locators.Address;
		SendKey(add, address);
	}

	@When("^user enter the \"([^\"]*)\" in city$")
	public void user_enter_the_in_city(String city) {
		String cityNmae = Constent.locators.City;
		SendKey(cityNmae, city);
	}

	@When("^user enter the \"([^\"]*)\" in state$")
	public void user_enter_the_in_state(String state) {
		String StateNAme = Constent.locators.State;
		SendKey(StateNAme, state);
	}

	@When("^user enter the \"([^\"]*)\" in zipcode$")
	public void user_enter_the_in_zipcode(String zipcode) {
		String postcode = Constent.locators.ZipCode;
		SendKey(postcode, zipcode);
	}

	@When("^user select the country$")
	public void user_select_the_country() {
		String country = Constent.locators.Country;
		// WebElement countryname=reusableClass.element(country);
		// Select s = new Select(countryname);
		// s.selectByVisibleText("India");

		reusableClass.SelectValuedropdown(country, "India");

	}

	@When("^user enter the \"([^\"]*)\" in email$")
	public void user_enter_the_in_email(String email) {
		String emailid = Constent.locators.Email;
		SendKey(emailid, email);
	}

	@When("^user select the demo date$")
	public void user_select_the_demo_date() {
		// String demodate = Constent.locators.Date;

	}

	@When("^user select the time$")
	public void user_select_the_time() {
		String hrtime = Constent.locators.HourTime;
		SelectValuedropdown(hrtime, "02");

		String mintime = Constent.locators.MinuitTime;
		SelectValuedropdown(mintime, "35");

	}

	@When("^user enter the \"([^\"]*)\" in mobile number$")
	public void user_enter_the_in_mobile_number(String mobileNumber) {
		String mob = Constent.locators.MobileNumber;
		SendKey(mob, mobileNumber);
	}

	@When("^user select the course details$")
	public void user_select_the_course_details() {
		String selectcourse = Constent.locators.Course;
		reusableClass.clickonElement(selectcourse);
	}

	@When("^user enter the \"([^\"]*)\" in verification$")
	public void user_enter_the_in_verification(String verificationCode) {
		String verify = Constent.locators.VerificationCode;
		SendKey(verify, verificationCode);
	}

	@When("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
		String submit = Constent.locators.SubmitButton;
		reusableClass.clickonElement(submit);
	}

	@Then("^user redirect to the successfull registration page$")
	public void user_redirect_to_the_successfull_registration_page() {

		String expected = Constent.locators.text;
		String actual = Constent.locators.actualtext;
		// String
		// actualt=driver.findElement(By.xpath("(//div[@class='elementor-shortcode'])[1]")).getText();

		String actualtext = reusableClass.GetTextOfWebLement(actual);

		Assert.assertEquals(expected, actualtext);
		reusableClass.CLoseBrowser();

	}

	// Starting Sarika methods
	@Given("^user lands on alert$")
	public void user_lands_on_alert() throws Throwable {
		String path = Constent.locators.QA_AUTOMATION;
		reusableClass.Mouseover(path);
		String path1 = Constent.locators.Practice_Automation;
		reusableClass.Mouseover(path1);
		String AlertPopUp = Constent.locators.AlertPopUP;
		reusableClass.clickonElement(AlertPopUp);
		String AlertPopUpText = Constent.locators.ALERT_POPUPTEXT;
		reusableClass.isElementDisplayed(AlertPopUpText);
		System.out.println("User navigated to the alert popup screen");

	}

	@When("^user clicks on alert box$")
	public void user_clicks_on_alert_box() throws Throwable {
		String AlertBox = Constent.locators.ALERT_BOX;
		reusableClass.clickonElement(AlertBox);
		System.out.println("User click on alert box");

	}

	@Then("^alert box should be open$")
	public void alert_box_should_be_open() throws Throwable {
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		System.out.println("User click on ok button");
	}

	@When("^user click on ok then alert box should be close$")
	public void user_click_on_ok_then_alert_box_should_be_close() throws Throwable {
		String AlertPopUpText = Constent.locators.ALERT_POPUPTEXT;
		reusableClass.isElementDisplayed(AlertPopUpText);
		System.out.println("Alert pop up text displayed to user");
	}

	@When("^user click on confirm alert box$")
	public void user_click_on_confirm_alert_box() throws Throwable {
		String ConfirmAlertBox = Constent.locators.CONFIRM_ALERT_BOX;
		reusableClass.clickonElement(ConfirmAlertBox);
		System.out.println("User click on confirm alert box");

	}

	@Then("^confirm alert box should be displayed to user$")
	public void confirm_alert_box_should_be_displayed_to_user() throws Throwable {
		String ConfirmAlerttext = driver.switchTo().alert().getText();
		//reusableClass.isElementDisplayed(ConfirmAlerttext);
		System.out.println("Confirm alert box displayed to user");

	}

	@When("^user perform the action$")
	public void user_perform_the_action() throws Throwable {
		driver.switchTo().alert().dismiss();
		System.out.println("User cancle the confirmation pop up box");
	}

	@Then("^confirm alert box should be close$")
	public void confirm_alert_box_should_be_close() throws Throwable {
		String AlertPopUpText = Constent.locators.ALERT_POPUPTEXT;
		reusableClass.isElementDisplayed(AlertPopUpText);
		System.out.println("alert pop up text displayed to user");
	}

	@When("^user click on prompt alert box$")
	public void user_click_on_prompt_alert_box() throws Throwable {
		String PromptAlertBox = Constent.locators.PROMPT_ALERT_BOX;
		reusableClass.clickonElement(PromptAlertBox);
		System.out.println("User click on prompt alert box");
	}

	@Then("^prompt alert box should be displayed to user$")
	public void prompt_alert_box_should_be_displayed_to_user() throws Throwable {
		String ConfirmAlerttext = driver.switchTo().alert().getText();
		System.out.println(ConfirmAlerttext);

	}

	@Then("^prompt alert box should be close$")
	public void prompt_alert_box_should_be_close() throws Throwable {
		String AlertPopUpText = Constent.locators.ALERT_POPUPTEXT;
		reusableClass.isElementDisplayed(AlertPopUpText);
		System.out.println("alert pop up text displayed to user");
	}
	// Sarika ends
}
