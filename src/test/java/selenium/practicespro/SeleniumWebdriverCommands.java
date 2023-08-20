package selenium.practicespro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebdriverCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/src/test/resources/chromedriver_win32");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
	}

}
