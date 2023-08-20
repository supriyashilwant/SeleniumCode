package selenium.practicespro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdownHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crom.driver", "src/test/resources/chromedriver_win32");

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com");

		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id = 'drop1']"));
		
		Select singleSelectDropDown = new Select(dropdown);
		
		System.out.println(singleSelectDropDown.isMultiple());
		
		singleSelectDropDown.selectByIndex(1);
		singleSelectDropDown.selectByValue("ghi");
		singleSelectDropDown.selectByVisibleText("doc 4");
		
		System.out.println(singleSelectDropDown.getFirstSelectedOption().getText());
		
		List<WebElement> ele = singleSelectDropDown.getOptions();
		
		for(WebElement opt:ele) {
			System.out.println(opt.getText());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       List<WebElement> elements = singleSelectDropDown.getAllSelectedOptions();
		
		for(WebElement optn:elements) {
			System.out.println(optn.getText());
		}
		
		//java.lang.UnsupportedOperationException: exception throws when we use deselect method
		
		

	}

}
