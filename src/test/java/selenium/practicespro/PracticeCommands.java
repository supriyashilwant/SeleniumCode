package selenium.practicespro;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCommands {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.crom.driver", "src/test/resources/chromedriver_win32");

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com");

		// To find webelements by using name
		WebElement element = driver.findElement(By.name("userid"));
		element.sendKeys("Example of sendkeys");
		Thread.sleep(2000);
		element.clear();
		// To find webelements by id locator strategy in find element it throw
		// nosuchexception
		WebElement element2 = driver.findElement(By.id("but1"));
		System.out.println(element2.getText());
		// To find element by class name it's not work now a days it gives exception as
		// org.openqa.selenium.InvalidSelectorException
		// System.out.println(driver.findElement(By.className("post-title
		// entry-title")).getText());
		// To find element by using link text usde for weblinks
		// driver.findElement(By.linkText("Posts (Atom)")).click();

		// To find element by using partial link text used for webelements
		driver.findElement(By.partialLinkText("Posts")).click();
		// It returns list of tags if no any tag present it shows empty list exception
		List<WebElement> list = driver.findElements(By.tagName("h2"));
		System.out.println(list.size());      
		//Xml path xpath absoulte xpath starting from root node to till respective element it is start with / slash
		//relative xpath starting from  till respective element it is start with // slash sytax://html tag[@attribute name = 'value of attr']
//		System.out.println(driver.findElement(By.xpath("(//button[@value='LogIn'])[1]")));
		System.out.println(driver.findElement(By.xpath("//button[@id='but2']")).getText());
//		System.out.println(driver.findElement(By.xpath("//button[contains(@value,'LogIn')]")));
//		System.out.println(driver.findElement(By.xpath("//button[starts-with(@value,'Log')]")));
//		System.out.println(driver.findElement(By.xpath("//button[normalize-space()='LogIn']")));
		
		File file = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("src/test/resources/screenshot/txtscrnshot.png"));
		System.out.println(element.getTagName());
		Dimension d = element.getSize();
		System.out.println(element.getSize());
		System.out.println("The height is:"+d.height);
		System.out.println("The width is:"+d.width);

		

	}
}
