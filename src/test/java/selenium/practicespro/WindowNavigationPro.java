package selenium.practicespro;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowNavigationPro {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crom.driver", "src/test/resources/chromedriver_win32");

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='selenium143']")).click();
		
//		String currentWindowHandle = driver.getWindowHandle();
//		
//		Set<String> allWindowHandles = driver.getWindowHandles();
//		
//		for(String handles:allWindowHandles) {
//			
//			if(!(handles.equals(currentWindowHandle))) {
//				
//				driver.switchTo().window(handles);
//				
//			}
//			
//			
//			
//		}
		
//		System.out.println(driver.findElement(By.xpath("//a[text()='What is Selenium?']")).getText());
//		
//		driver.switchTo().window(currentWindowHandle);
//		
//		driver.findElement(By.cssSelector("input#radio1")).click();

	}

}
