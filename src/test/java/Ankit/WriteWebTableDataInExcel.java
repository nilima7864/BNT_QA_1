package Ankit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteWebTableDataInExcel {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	System.out.println("Launch the app");
	driver.manage().window().maximize();
	System.out.println("Windows maximize");
	WebElement Element = driver.findElement(By.xpath("//legend[text()='Web Table Example']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", Element);

	File f = new File("C:\\Users\\ankit.dhakulkar\\Desktop\\EXCEL\\Collection1.xlsx");

	Workbook worrkbook = new XSSFWorkbook();
	Sheet sheet = worrkbook.createSheet("WebTableData");

	WebElement table = driver.findElement(By.xpath("(//table[@id='product']/tbody)[1]"));
	List<WebElement> totalrow = table.findElements(By.tagName("tr"));
	for (int i = 0; i < totalrow.size(); i++) {
		Row rowvalue = sheet.createRow(i);
		List<WebElement> totalcolumn = totalrow.get(i).findElements(By.tagName("td"));
		for (int j = 0; j < totalcolumn.size(); j++) {

			String cellvalue = totalcolumn.get(j).getText();
			System.out.print(cellvalue);
			rowvalue.createCell(j).setCellValue(cellvalue);
		}
		System.out.println();
	}

	FileOutputStream fout = new FileOutputStream(f);

	worrkbook.write(fout);

}
}
