package selenium.practicespro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crom.driver", "src/test/resources/chromedriver_win32");

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com");

		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='navbar-iframe']")));
//driver.findElement(By.xpath("//a[@id='b-getorpost']")).click();
		driver.findElement(By.xpath("//a[@id='b-getorpost']")).getText();
		driver.switchTo().defaultContent() ;
		driver.findElement(By.cssSelector("input#radio1")).click();
		System.out.println(driver.findElement(By.xpath("//textarea[@id='ta1']")).getText());
		
		
		

	}

}
