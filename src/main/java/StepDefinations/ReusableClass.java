package StepDefinations;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class ReusableClass extends BaseMethods {

	// this method accepts the x path and text used to send values in text box
	void SendKey(String path, String text) {
		driver.findElement(By.xpath(path)).sendKeys(text);
	}

	
	//gettext from webElement

	void clickonElement(String path) {
		driver.findElement(By.xpath(path)).click();
	}

	// gettext from webElement

	String GetTextOfWebLement(String path) {
		String text = driver.findElement(By.xpath(path)).getText();
		return text;

	}
	//accepts xpath and return webelement 
	WebElement element(String path) {
		return driver.findElement(By.xpath(path));
	}
	//  select value from provided dropdownxpath, select text as provided 
	void SelectValuedropdown(String path, String text) {
		WebElement w = element(path);
		Select s = new Select(w);
		s.selectByVisibleText(text);
	}
	
//	void AcceptAlert(WebDriver driver)
//	{
//		driver.switchTo().alert().accept();
//	}
	
	void Mouseover(WebElement element )
	{
		//WebElement w = element(path);
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	//MouseOver overloaded method which accept xpath as a string
	
	void Mouseover(String path )
	{
		WebElement element = element(path);
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
	}
	void isElementDisplayed(String path) {
		driver.findElement(By.xpath(path)).isDisplayed();
	} 
	
	
}
