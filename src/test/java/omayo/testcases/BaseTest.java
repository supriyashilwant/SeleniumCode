package omayo.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Utility;

public class BaseTest {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		Utility utility = new Utility();
		driver = utility.getDriver();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
