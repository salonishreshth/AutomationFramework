package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public String getCellValue(int rowNo, int cellNo) throws IOException {

		// Open the file

		File objfile = new File("D:\\QA\\TestData.xlsx");

		// Read The excel

		FileInputStream objfis = new FileInputStream(objfile);

		// Read the Sheet and Row and Cell

		Workbook objbook = new XSSFWorkbook(objfis);

		return objbook.getSheet("Sheet1").getRow(rowNo).getCell(cellNo).toString();

	}


}
