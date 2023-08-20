package selenium.practicespro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrom.driver", "src/test/resources/chromedriver_win32");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//To find web element we using find element by name
		
		WebElement element = driver.findElement(By.name("userid"));
		
		element.sendKeys("Example");
		
		Thread.sleep(2000);
		
		element.clear();
		
        WebElement element1 = driver.findElement(By.name("pswrd"));
		
		element1.sendKeys("Test");
		
         Thread.sleep(2000);
		
		 element1.clear();
		
		//To find web element we using find element by id
		
		WebElement element2= driver.findElement(By.id("but1"));
		
		System.out.println(element2.getText());
		
		// To find web element we using find element by class
//		
//				WebElement element3= driver.findElement(By.cssSelector(("post-title entry-title")).getText());
//				
//				System.out.println(element2.getText());
		
		//To find web element we using find element by linktext
		
				driver.findElement(By.linkText("Posts (Atom)")).click();
				
				//To find web element we using find element by partial linktext used to ancher tags
				
				driver.findElement(By.partialLinkText("(Atom)")).click();
				
				//by using tagname
				
				List<WebElement> link =driver.findElements(By.tagName("a"));
				
				System.out.println("Number of links on page = "+link.size());
				
				
				System.out.println("Test");


	}

}
