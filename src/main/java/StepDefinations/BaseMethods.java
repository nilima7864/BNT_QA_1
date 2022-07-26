package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constent.locators;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethods {

	public static WebDriver driver;

	// private static ChromeDriver driver;
	@Before
	void A1(){
		System.out.println("Iam m1");
	}
	
	@Before
	void lunchTheBrpwser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/");
		System.out.println("Launch the app");
		driver.manage().window().maximize();
		System.out.println("Windows maximize");

	}

	@After
	static void CLoseBrowser() {
		driver.quit();

	}

}
