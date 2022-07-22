package StepDefinations;

import org.openqa.selenium.By;

public class ReusableClass extends BaseMethods {

	// this method accepts the x path and text used to send values in text box
	void SendKey(String path, String text) {
		drive.findElement(By.xpath(path)).sendKeys(text);
	}

	// elemnt click
	void cliconElement(String path) {
		drive.findElement(By.xpath(path)).click();
	}
	
	//gettext from webElement
	String GetTextOfWebLement(String path) {
		String text= drive.findElement(By.xpath(path)).getText();
		return text;
	}

}
