package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constent.locators;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethods {
	
	public static WebDriver driver;
//	private static ChromeDriver driver;

	 void lunchTheBrpwser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/");
		System.out.println("Launch the app");
		driver.manage().window().maximize();
		System.out.println("Windows maximize");

	}

	static void CLoseBrowser() {
		driver.quit();

	}

	
	
}
