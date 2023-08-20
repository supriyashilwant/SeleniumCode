package selenium.practicespro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UseOfActionClassInSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrom.driver", "src/test/resources/chromedriver_win32");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement blog =driver.findElement(By.xpath("//span[@id='blogsmenu']"));
		WebElement blogs =driver.findElement(By.xpath("//span[@id='home']"));
		//for mouse hover
		//actions.moveToElement(blog).build().perform();    //home
		
		//actions.moveToElement(blogs).build().perform(); 
		
		WebElement textarea =driver.findElement(By.xpath("//textarea[@id='ta1']"));
		actions.keyDown(textarea, "a").keyUp("a").build().perform();
		
		actions.contextClick(textarea).build().perform();

	}

}
