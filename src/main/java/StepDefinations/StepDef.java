package StepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
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
		act.moveToElement(element).perform();

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

	}

	@Given("^user is land on dashbord page move on Automation practice tab$")
	public void user_click_on_Automation_practice_page() {
		// WebElement
		// Autolink=driver.findElement(By.xpath("//header/div[@id='site-header-inner']/div[@id='site-navigation-wrap']/nav[@id='site-navigation']/ul[@id='menu-main']/li[@id='menu-item-4131']/a[1]/span[1]"));
		String path = Constent.locators.QA_AUTOMATION;
		reusableClass.clickonElement(path);
	}

	@When("^user is land on dropdown click on Practice Page$")
	public void click_on_Practice_Page() {
		//WebElement Autoplink = driver.findElement(By.xpath(
				//"//header/div[@id='site-header-inner']/div[@id='site-navigation-wrap']/nav[@id='site-navigation']/ul[@id='menu-main']/li[@id='menu-item-4131']/ul[1]/li[3]/a[1]"));
		String autolink = Constent.locators.Practice_Automation;
		reusableClass.clickonElement(autolink);
	}

	@When("^user is land move on dropdown Select Mulitiple windows$")
	public void select_Mulitiple_windows() {
		//WebElement Autoplinkwin = driver
				//.findElement(By.xpath("//span[contains(text(),'Demo Site – Multiple Windows')]"));
		String multiwindow = Constent.locators.Window_tab;
		reusableClass.clickonElement(multiwindow);
	}

	@When("^user is land on Select on multiwindows browser$")
	public void click_on_multiwindows() {

		//WebElement Autoplinkwmulin = driver.findElement(By.xpath("//button[contains(text(),'New Browser Window')]"));
		String Automultiwindow = Constent.locators.Multiple_windows;
		reusableClass.clickonElement(Automultiwindow);

	}

	@Then("^user land on multi beowser window and come again on main page$")
	public void get_window_handels() throws InterruptedException {

		driver.findElement(By.xpath("//button[contains(text(),'New Browser Window')]")).click();

		Set<String> windowsid = driver.getWindowHandles();

		Iterator<String> itr = windowsid.iterator();

		String parintid = itr.next();
		String childid = itr.next();

		driver.switchTo().window(childid);

		driver.close();

		driver.switchTo().window(parintid);

		driver.findElement(By.xpath("//h1[contains(text(),'Multiple Windows')]")).click();

	}
}
