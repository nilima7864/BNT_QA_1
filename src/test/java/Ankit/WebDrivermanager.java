package Ankit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDrivermanager {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			System.out.println("Launch the app");
			driver.manage().window().maximize();
			System.out.println("Windows maximize");
		
	}

}
