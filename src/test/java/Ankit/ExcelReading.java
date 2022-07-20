package Ankit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws IOException {
		String filepath = "C:\\Users\\ankit.dhakulkar\\Desktop\\Collection1.xlsx";
		FileInputStream file = new FileInputStream(filepath);

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet2"); // by using sheet name
		// XSSFSheet sheet1 =wb.getSheetAt(0); // by using sheet index number 

		String data = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		workbook.close();

	}

}
