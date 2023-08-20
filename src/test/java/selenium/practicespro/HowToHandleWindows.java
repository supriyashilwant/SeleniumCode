package selenium.practicespro;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.crom.driver", "src/test/resources/chromedriver_win32");

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@id='selenium143']")).click();
		
		String currentwindowhandle = driver.getWindowHandle();
		
		Set<String> allwindowhandles = driver.getWindowHandles();
		
		for(String handle :allwindowhandles) {
			
			//if(!(handle.equals(currentwindowhandle)))  //not equal statement or we can handle by using continue
			
			if(handle.equals(currentwindowhandle)) {
				continue;
			}
			else {
				driver.switchTo().window(handle);
				
			}
			
			
		}
		
		System.out.println(driver.findElement(By.xpath("//a[text()='What is Selenium?']")).getText());
		
		driver.switchTo().window(currentwindowhandle);
		
		driver.findElement(By.cssSelector("input#radio1")).click();

	}

}
