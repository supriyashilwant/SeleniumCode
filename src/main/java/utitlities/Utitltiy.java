package utitlities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utitltiy {

	public static String getProperty(String key) {
		// File class to create file
		File file = new File("src/test/resources/master.properties");
		Properties properties = new Properties();
		try {
			// File Input Stream used to connect reading system
			FileInputStream fileInputStream = new FileInputStream(file);
			// Create Properties class's object then load the fileinputstram
			// After that send the key by using getProperty() method
			properties.load(fileInputStream);

		} catch (IOException e) {

			e.printStackTrace();
		}

		return properties.getProperty(key);
	}

	// for read the excel we use apache poi library and apache poi--ooxml library
	// for read the excel
	public static List<String> readExcel() {
		List<String> excelData = new ArrayList<String>();
		File file = new File("src/test/resources/RegisterData.xlsx");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			// It represents complete workbook
			XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
			// to access the sheet
			XSSFSheet xssfSheet = xssfWorkbook.getSheet("Sheet1");
			// to see no.of last rows
			int lastRow = xssfSheet.getLastRowNum();
			// use loop to iterate the last row
			for (int i = 1; i <= lastRow; i++) {

				XSSFRow row = xssfSheet.getRow(i);

				int lastCellNum = row.getLastCellNum();

				// to find last cell we iterate the loop

				for (int j = 0; j < lastCellNum; j++) {
					excelData.add(row.getCell(j).toString());

				}

			}
			xssfWorkbook.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return excelData;

	}

}
