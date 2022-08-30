package com.stableint.peacocktv.outputmanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelSheetManager {

	public void writeDataMethod(String email, String password, String profileId, String globalAcess, String accType) {
		String path = System.getProperty("user.dir") + "/outputdatasheet/";
		String filepath = path + "AccountCreds.xlsx";

		try {
			FileInputStream inputStream = new FileInputStream(new File(filepath));
			Workbook workbook = WorkbookFactory.create(inputStream);

			Sheet sheet = workbook.getSheetAt(0);

			Object[][] bookData = { { email, password, profileId, globalAcess, accType }, };

			int rowCount = sheet.getLastRowNum();

			for (Object[] aBook : bookData) {
				Row row = sheet.createRow(++rowCount);

				int columnCount = 0;

				Cell cell = row.createCell(columnCount);
				// cell.setCellValue(rowCount);

				for (Object field : aBook) {
					cell = row.createCell(columnCount++);
					if (field instanceof String) {
						cell.setCellValue((String) field);
					} else if (field instanceof Integer) {
						cell.setCellValue((Integer) field);
					}
				}

			}

			inputStream.close();

			FileOutputStream outputStream = new FileOutputStream(filepath);
			workbook.write(outputStream);
			System.out.println("Credentials Written on ExcelSheet Successfully");
			workbook.close();
			outputStream.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
