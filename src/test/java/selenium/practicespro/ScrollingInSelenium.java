package selenium.practicespro;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInSelenium {
	static WebDriver driver;

	public static <JavaScriptExecutor> void main(String[] args) throws InterruptedException {

		SelectOptionFrmNonSelectDropdown se = new SelectOptionFrmNonSelectDropdown();
		driver = se.getDriver();
		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		

		// scroll vertically down
		js.executeScript("window. scrollTo(0,1000)", "");

		Thread.sleep(2000);

		// scroll vertically up
		js.executeScript("window. scrollTo(0,-500)", "");
		Thread.sleep(2000);

		// scroll horizontally right
		js.executeScript("window. scrollTo(100,0)", "");
		Thread.sleep(2000);

		// scroll horizontally left
		js.executeScript("window. scrollTo(-100,0)", "");
		Thread.sleep(2000);
		
		//scroll into view
		WebElement link = driver.findElement(By.xpath("//a[text()='Blogger']"));
		js.executeScript("arguments[0].scrollIntoView(true);", link);
		Thread.sleep(2000);
		//click using js
		js.executeScript("arguments[0].click();", link);
		
		//scroll till end of the page
		js.executeScript("window. scrollTo(0, document. body. scrollHeight)");
		

	}

}
