
public  class Reusable_class  extends BaseClass{
	
	//this method   accepts the x path and text used to send values in text box 
	static  SendKey(String path, String text) {
		driver.findElemnt(By.xpath(path)).sendKeys(text);
	}
	
}
