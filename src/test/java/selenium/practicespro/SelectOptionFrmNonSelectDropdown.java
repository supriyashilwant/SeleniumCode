package selenium.practicespro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectOptionFrmNonSelectDropdown {

	public static void main(String[] args) {
		
		SelectOptionFrmNonSelectDropdown sel = new SelectOptionFrmNonSelectDropdown();
		sel.selectOptionFromDropDown("Saudi Arabia");

//		driver.findElement(By.xpath("//img[contains(@src,'dropdown')]")).click();
//		List<WebElement> countries =driver.findElements(By.xpath("//ul[@id = 'country-scroll']//li/span"));
//		
//		for(WebElement country :countries) {
//			
//			if(country.getText().equalsIgnoreCase("Sri Lanka")) {
//				country.click();
//			}
//		}
	}

	public void selectOptionFromDropDown(String country) {

		WebDriver driver = getDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");
		driver.findElement(By.xpath("//img[contains(@src,'dropdown')]")).click();

		List<WebElement> countries = driver.findElements(By.xpath("//ul[@id = 'country-scroll']//li/span"));

		for (WebElement con : countries) {

			if (con.getText().equalsIgnoreCase(country)) {
				con.click();
			}
		}

	}

	public WebDriver getDriver() {

		System.setProperty("webdriver.crom.driver", "src/test/resources/chromedriver_win32");

		WebDriver driver = new ChromeDriver();

		return driver;

	}

}
