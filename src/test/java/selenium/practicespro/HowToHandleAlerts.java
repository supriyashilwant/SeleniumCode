package selenium.practicespro;

import java.io.IOException;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utitlities.Utitltiy;

public class HowToHandleAlerts {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.crom.driver", "src/test/resources/chromedriver_win32");

		WebDriver driver = new ChromeDriver();

		driver.get(Utitltiy.getProperty("url"));

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='prompt']")).click();
		
		Alert al = driver.switchTo().alert();
		//sendkeys not applicable
		al.sendKeys("Thanks for alert");
		System.out.println(al.getText());
		Thread.sleep(2000);
		//al.accept();
		al.dismiss();

	}

}
