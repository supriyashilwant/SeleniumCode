package selenium.practicespro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrom.driver", "src/test/resources/chromedriver_win32");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement searchTextBox = driver.findElement(By.xpath("//input[@title='search' and @ name = 'q']"));

		// sendkeys is used to send text on text field
		searchTextBox.sendKeys("mobile");

		// It will clear the text
		Thread.sleep(5000);

		searchTextBox.clear();

		// it will get the value of specified attribute

		System.out.println(searchTextBox.getAttribute("class"));

		// it is used to verify specified webelement is diplayed on webpage it return
		// true otherwise false

		System.out.println(searchTextBox.isDisplayed());

		System.out.println(driver.findElement(By.cssSelector("div#BlogSearch1_form")).isDisplayed());

		System.out.println(searchTextBox.getAriaRole());

		System.out.println(searchTextBox.getAccessibleName());

		System.out.println(driver.findElement(By.cssSelector("button.dropbtn")).getCssValue("background-color"));

		System.out.println(driver.findElement(By.cssSelector("button.dropbtn")).getCssValue("border"));
        //to find location on webpage
		Point p = searchTextBox.getLocation();

		System.out.println(p.getX());
		
		System.out.println(p.getY());
//		
//		File file = searchTextBox.getScreenshotAs(OutputType.FILE);
//		System.out.println("####"+file.canRead());
//		FileUtils.copyFile(file, new File("/src/test/resources/screenshot/textboxscreenshot.png"));
//		
//		System.out.println(searchTextBox.getTagName());
//		
//		System.out.println(driver.findElement(By.xpath("//button[@id='but2']")).getText());
		
		File file = searchTextBox.getScreenshotAs(OutputType.FILE);
		
	    FileUtils.copyFile(file, new File("/src/test/resources/screenshot/textboxscreenshot.png"));
	}

}
