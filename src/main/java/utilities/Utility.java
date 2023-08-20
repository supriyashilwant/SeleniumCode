package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrom.driver", "src/test/resources/chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.get(getProperty("url"));
		driver.manage().window().maximize();

		return driver;

	}

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
	public static void main(String args[]) {
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
			for (int i = 0; i <= lastRow; i++) {

				XSSFRow row = xssfSheet.getRow(i);

				int lastCellNum = row.getLastCellNum();

				// to find last cell we iterate the loop

				for (int j = 0; j < lastCellNum; j++) {
					System.out.print(row.getCell(j).getStringCellValue() + " ");
				}
				System.out.println();
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
//for multi select option
	public static ArrayList<String> selectOptionFromDropDown(WebElement dropdown, String[] options) {
		// for select multiple options from dropdown.
		Select select = new Select(dropdown);
		// to see how many elements are selected
		ArrayList<String> selectedOptions = new ArrayList<>();
		for (String option : options) {
			select.selectByVisibleText(option);
		}
		List<WebElement> selectOptionByLogic = select.getAllSelectedOptions();

		for (WebElement element : selectOptionByLogic) {
			selectedOptions.add(element.getText());

		}

		return selectedOptions;

	}
   //for switching one window to another window
	public static String switchToNewWindow(WebDriver driver) {

		String currentWindowHandle = driver.getWindowHandle();

		Set<String> allWindowHandle = driver.getWindowHandles();

		for (String handle : allWindowHandle) {

			if (!(handle.equals(currentWindowHandle))) {
				driver.switchTo().window(handle);
			}
		}

		return currentWindowHandle;

	}
	
	public static void switchToWindow(WebDriver driver,String windowHandle) {
		
		driver.switchTo().window(windowHandle);
		
	}
	//for display display table
	public static ArrayList<String> getAllTableData(WebDriver driver,String table) {
		List<WebElement> tableOptions = driver.findElements(By.xpath(table));
		ArrayList<String> allTableData = new ArrayList<>();
		for(WebElement td:tableOptions) {
			allTableData.add(td.getText());
		}
		
		return allTableData;
	}
	
	public static ArrayList<String> singledropdown(WebElement dropdown, String[] options) {
		// for select single options from dropdown.
		Select select = new Select(dropdown);
		// to see how many elements are selected
		ArrayList<String> selectedOptions = new ArrayList<>();
		for (String option : options) {
			select.selectByVisibleText(option);
		}
		List<WebElement> selectOptionByLogic = select.getOptions();

		for (WebElement element : selectOptionByLogic) {
			selectedOptions.add(element.getText());

		}

		return selectedOptions;

	}

}


