package Ankit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteInExcel {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ankit.dhakulkar\\Desktop\\Collection1.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook worrkbook = new XSSFWorkbook(input);
		Sheet sheet = worrkbook.getSheet("sheet2");
		sheet.getRow(0).createCell(3).setCellValue("Address2");
		sheet.getRow(1).createCell(3).setCellValue("Pune");

		FileOutputStream fout = new FileOutputStream(f);

		worrkbook.write(fout);

	}

}
