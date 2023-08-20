package selenium.practicespro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.crom.driver", "src/test/resources/chromedriver_win32");

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com");

		driver.manage().window().maximize();
		
		WebElement wl = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		
		Select sl = new Select(wl);
		
		System.out.println(sl.isMultiple());
		
		List<WebElement> option = sl.getOptions();
		
		for(WebElement opt:option) {
			
			System.out.println(opt.getText());
			
		}
		
		sl.selectByIndex(0);
		sl.selectByValue("swiftx");
		sl.selectByVisibleText("Hyundai");
		sl.selectByValue("audix");
		
		List<WebElement> opt = sl.getAllSelectedOptions();
		
		for(WebElement selected :opt) {
			
			System.out.println("Selected dropdowns are:" +selected.getText());
			
		}
		
		System.out.println("First Selected option is:"+sl.getFirstSelectedOption().getText());
		
		//sl.deselectAll();
		
		sl.deselectByIndex(0);
		sl.deselectByVisibleText("Hyundai");
		
//		WebElement singledropdown = driver.findElement(By.xpath("//@id='drop1'"));
//		
//		Select slect = new Select(singledropdown);


	}

}
