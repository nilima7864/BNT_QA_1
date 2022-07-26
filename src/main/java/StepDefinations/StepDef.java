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
		reusableClass.A1();
	}

	@When("^User land on registration form$")
	public void user_land_on_registration_form() {

		String path = Constent.locators.QA_AUTOMATION;
		// WebElement element = driver.findElement(By.xpath(path));
		WebElement element = reusableClass.element(path);
		// act.moveToElement(element).perform();
		Mouseover(element);

		String path1 = Constent.locators.PRACTICE_AUTOMATION;
		// WebElement element1 = driver.findElement(By.xpath(path1));
		WebElement element1 = reusableClass.element(path1);
		// act.moveToElement(element1).perform();
		Mouseover(element1);

		String path2 = Constent.locators.REGISTRATION_FORM;
		reusableClass.clickonElement(path2);

	}

	@When("^user enter the \"([^\"]*)\" in firstname$")
	public void user_enter_the_in_firstname(String firstname) {
		String FN = Constent.locators.FIRSTNAME;
		SendKey(FN, firstname);

	}

	@When("^user enter the \"([^\"]*)\" in lastname$")
	public void user_enter_the_in_lastname(String lastname) {
		String LN = Constent.locators.LASTNAME;
		SendKey(LN, lastname);
	}

	@When("^user select the Gender$")
	public void user_select_the_Gender() throws Throwable {
		String Gender = Constent.locators.GENDER;
		clickonElement(Gender);
	}

	@When("^user enter the \"([^\"]*)\" in address$")
	public void user_enter_the_in_address(String address) {
		String add = Constent.locators.ADDRESS;
		SendKey(add, address);
	}

	@When("^user enter the \"([^\"]*)\" in city$")
	public void user_enter_the_in_city(String city) {
		String cityNmae = Constent.locators.CITY;
		SendKey(cityNmae, city);
	}

	@When("^user enter the \"([^\"]*)\" in state$")
	public void user_enter_the_in_state(String state) {
		String StateNAme = Constent.locators.STATE;
		SendKey(StateNAme, state);
	}

	@When("^user enter the \"([^\"]*)\" in zipcode$")
	public void user_enter_the_in_zipcode(String zipcode) {
		String postcode = Constent.locators.ZIPCODE;
		SendKey(postcode, zipcode);
	}

	@When("^user select the country$")
	public void user_select_the_country() {
		String country = Constent.locators.COUNTRY;
		// WebElement countryname=reusableClass.element(country);
		// Select s = new Select(countryname);
		// s.selectByVisibleText("India");

		reusableClass.SelectValuedropdown(country, "India");

	}

	@When("^user enter the \"([^\"]*)\" in email$")
	public void user_enter_the_in_email(String email) {
		String emailid = Constent.locators.EMAIL;
		SendKey(emailid, email);
	}

	@When("^user select the demo date$")
	public void user_select_the_demo_date() {
		// String demodate = Constent.locators.Date;

	}

	@When("^user select the time$")
	public void user_select_the_time() {
		String hrtime = Constent.locators.HOURTIME;
		SelectValuedropdown(hrtime, "02");

		String mintime = Constent.locators.MINUITTIME;
		SelectValuedropdown(mintime, "35");

	}

	@When("^user enter the \"([^\"]*)\" in mobile number$")
	public void user_enter_the_in_mobile_number(String mobileNumber) {
		String mob = Constent.locators.MOBILENUMBER;
		SendKey(mob, mobileNumber);
	}

	@When("^user select the course details$")
	public void user_select_the_course_details() {
		String selectcourse = Constent.locators.COURSE;
		reusableClass.clickonElement(selectcourse);
	}

	@When("^user enter the \"([^\"]*)\" in verification$")
	public void user_enter_the_in_verification(String verificationCode) {
		String verify = Constent.locators.VERIFICATIONCODE;
		SendKey(verify, verificationCode);
	}

	@When("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
		String submit = Constent.locators.SUBMITBUTTON;
		reusableClass.clickonElement(submit);
	}

	@Then("^user redirect to the successfull registration page$")
	public void user_redirect_to_the_successfull_registration_page() {

		String expected = Constent.locators.SUCCESSFULL_PAGE_TEXT;
		String actual = Constent.locators.ACTUALTEXT;
		// String
		// actualt=driver.findElement(By.xpath("(//div[@class='elementor-shortcode'])[1]")).getText();

		String actualtext = reusableClass.GetTextOfWebLement(actual);

		Assert.assertEquals(expected, actualtext);
		// reusableClass.CLoseBrowser();
	}

}
