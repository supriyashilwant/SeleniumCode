package selenium.practicespro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPro {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crom.driver", "src/test/resources/chromedriver_win32");

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com");

		driver.manage().window().maximize();
		WebElement fileuploader = driver.findElement(By.xpath("//input[@id='uploadfile']"));
		
		fileuploader.sendKeys("E:/C , CPP Notes (1).pdf");

	}

}
