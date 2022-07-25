package Ankit_Automation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitBrokenLink {

	WebDriver driver;

	//@BeforeMethod
	void LaunchBrowser() throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Launch the app");
		driver.manage().window().maximize();
		System.out.println("Windows maximize");

		// WebElement e=
		// driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[2]/ul/li"));
		// System.out.println(e);
		// System.out.println("+++++++++++++++");
		WebElement link = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[2]/ul/li[]/a"));

		String url = link.getAttribute("href");
		System.out.println(url);
		if (url == null) {
			System.out.println("href attribute is missing");
		} else if (url.isEmpty()) {
			System.out.println("href value is missing");
		} else {

			URL url1 = new URL(url);
			URLConnection utlConnection = url1.openConnection();
			HttpURLConnection connection = (HttpURLConnection) utlConnection;
			connection.connect();
			if (connection.getResponseCode() >= 400) {
				System.out.println("Link is not working" + link.getText());

			}
		}
	}
}
