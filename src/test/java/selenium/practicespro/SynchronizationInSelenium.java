package selenium.practicespro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.crom.driver", "src/test/resources/chromedriver_win32");

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com");

		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement checkthisButton = driver.findElement(By.xpath("//button[text()='Check this']"));

		js.executeScript("arguments[0].scrollIntoView(true);", checkthisButton);

		checkthisButton.click();

		WebElement mrOption = driver.findElement(By.xpath("//input[@id='dte']"));

		// Explicit wait using polling(polling period is 500miliseconds) mechanism if we
		// take 5 second it throws timeout exception
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));	
//		wait.until(ExpectedConditions.elementToBeClickable(mrOption));

		// fluent wait
//		FluentWait wait = new FluentWait<WebDriver>(driver);
//		wait.pollingEvery(Duration.ofMillis(100));
//		wait.ignoring(org.openqa.selenium.TimeoutException.class);
//		wait.withTimeout(Duration.ofSeconds(11));
//		wait.until(ExpectedConditions.elementToBeClickable(mrOption));
//		mrOption.click();

		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
//		WebElement gmailLink = driver.findElement(By.xpath("//a[text()='Gmail']"));
////		wait.until(ExpectedConditions.invisibilityOf(gmailLink));
////		gmailLink.click();
//		js.executeScript("arguments[0].click();", gmailLink);
//		gmailLink.click();

	}

}
