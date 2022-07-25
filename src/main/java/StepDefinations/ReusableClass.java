package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReusableClass extends BaseMethods {

	// this method accepts the x path and text used to send values in text box
	void SendKey(String path, String text) {
		drive.findElement(By.xpath(path)).sendKeys(text);
	}

	// elemnt click
	void cliconElement(String automationfield) {
		drive.findElement(By.xpath(automationfield)).click();
	}
	
	
	//gettext from webElement
	String GetTextOfWebLement(String path) {
		String text= drive.findElement(By.xpath(path)).getText();
		return text;
	}

}
