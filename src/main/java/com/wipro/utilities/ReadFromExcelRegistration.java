package com.wipro.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcelRegistration {

	static XSSFWorkbook workbook;

	//Code For Getting Data from registerData Excel File
	public static String[][] getData() {
		String fileName = "src/test/resources/testdata/registerData.xlsx";
		try {
			FileInputStream fis = new FileInputStream(fileName);
			workbook = new XSSFWorkbook(fis);
		} catch (IOException io) {

		}
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		String[][] data = new String[1][5];
		int rowCount = sheet.getLastRowNum();
		
		for (int rowNo = 1; rowNo <= rowCount; rowNo++) {
			int cellCount = sheet.getRow(rowNo).getLastCellNum();
			
			for (int cellNo = 0; cellNo < cellCount; cellNo++) {
				data[rowNo-1][cellNo] = sheet.getRow(rowNo).getCell(cellNo).getStringCellValue();
			}
			
		}
		return data;
	}
}
