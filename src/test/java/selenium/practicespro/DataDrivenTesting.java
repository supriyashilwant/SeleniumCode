package selenium.practicespro;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.crom.driver", "src/test/resources/chromedriver_win32");

		 driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");

		driver.manage().window().maximize();
		
		
	}
	
	@Test(dataProvider = "userData")
	public void verifyValidLoginWithDifferentUser(String uname,String pawd) {
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pawd);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		WebElement Loginmsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		
		assertEquals(Loginmsg.getText(), "Login Successfully","User not logged in ASuccessfully");
		
	
		
	}
	
	@DataProvider(name="userData") //we bind data with the test
	public String[][] userDataProvider() {
		
		String users[][] = {{"user1","password1"},{"user2","password2"},{"user3","password3"}};
		
		return users;
		
	}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

}
