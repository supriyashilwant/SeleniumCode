package selenium.practicespro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationImp {

	public static void main(String[] args) {
		System.setProperty("webdriver.crom.driver", "src/test/resources/chromedriver_win32");

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com");

		driver.manage().window().maximize();
		//is selected
		WebElement maleRadio = driver.findElement(By.xpath("//input[@id='radio1' and @value='male']"));
		WebElement femaleRadio = driver.findElement(By.xpath("//input[@id='radio2' and @value='female']"));
		femaleRadio.click();
		System.out.println("male radio button is selected ="+maleRadio.isSelected());
		System.out.println("female radio button is selected ="+femaleRadio.isSelected());
		System.out.println("male radio button is displayed ="+maleRadio.isDisplayed());
		System.out.println("female radio button is displayed ="+femaleRadio.isDisplayed());
		WebElement checkboxorng = driver.findElement(By.xpath("//input[@id='checkbox1' and @value='orange']"));
		WebElement checkboxblue = driver.findElement(By.xpath("//input[@id='checkbox2' and @value='blue']"));
		//checkboxblue.click();
		System.out.println("orange checkbox is selected ="+checkboxorng.isSelected());
		System.out.println("blue checkbox is selected ="+checkboxblue.isSelected());
		System.out.println("orange checkbox is displayed="+checkboxorng.isDisplayed());
		System.out.println("blue checkbox is displayed ="+checkboxblue.isDisplayed());

	}

}
