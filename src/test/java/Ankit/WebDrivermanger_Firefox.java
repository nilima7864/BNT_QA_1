package Ankit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrivermanger_Firefox {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			System.out.println("Launch the app");
			driver.manage().window().maximize();
			System.out.println("Windows maximize");

	}

}
