package Rupesh1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Zoomin {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
    driver.get("https://www.bnt-soft.com");
    //driver.quit();
    driver.manage().window().maximize();
    System.out.println(driver.manage().window().getSize());

    System.out.println("Step: lets zoom the brower ");
    Thread.sleep(2000);
    Robot r= new Robot();
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_ADD);
    r.keyRelease(KeyEvent.VK_ADD);
    r.keyRelease(KeyEvent.VK_CONTROL);
    System.out.println("1");
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_ADD);
    r.keyRelease(KeyEvent.VK_ADD);
    r.keyRelease(KeyEvent.VK_CONTROL);
    System.out.println("2");
    System.out.println("Zoom in");
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_SUBTRACT);
    r.keyRelease(KeyEvent.VK_SUBTRACT);
    r.keyRelease(KeyEvent.VK_CONTROL);

    System.out.println("DOne");
    driver.quit();
}
}
