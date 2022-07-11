package Ankit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","./TestData/chromedriver.exe" );
     WebDriver driver= new ChromeDriver();
     driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
     driver.manage().window().maximize();
}

}
