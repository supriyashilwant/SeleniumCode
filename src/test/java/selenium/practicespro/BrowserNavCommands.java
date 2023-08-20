package selenium.practicespro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrom.driver", "src/test/resources/chromedriver_win32");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.WINDOW).get("https:/www.google.com");
		
		driver.switchTo().parentFrame().get("https://www.makemytrip.com/");
		//close only  current instance browser's window
		//driver.close();
		//close all instances of windows will close browser's window
		driver.quit();

	}

}
