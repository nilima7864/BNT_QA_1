package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReusableClass extends BaseMethods {

	// this method accepts the x path and text used to send values in text box
	void SendKey(String path, String text) {
		driver.findElement(By.xpath(path)).sendKeys(text);
	}

	// elemnt click
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
}
