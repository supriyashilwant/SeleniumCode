package selenium.practicespro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utitlities.Utitltiy;

public class ExcelDrivenTest {

	public static void main(String[] args) {
		
		List<String> dataFromExcel = Utitltiy.readExcel();
		System.setProperty("webdriver.chrom.driver", "src/test/resources/chromedriver_win32");

		WebDriver driver = new ChromeDriver();

		driver.get(Utitltiy.getProperty("demoURL"));

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name ='firstName']")).sendKeys(dataFromExcel.get(0));
		driver.findElement(By.xpath("//input[@name ='lastName']")).sendKeys(dataFromExcel.get(1));
		driver.findElement(By.xpath("//input[@name ='phone']")).sendKeys(dataFromExcel.get(2));
		driver.findElement(By.xpath("//input[@name ='userName']")).sendKeys(dataFromExcel.get(3)); 

	}

}
