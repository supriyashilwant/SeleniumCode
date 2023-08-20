package selenium.practicespro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderControl {
	

	public static void main(String[] args) throws InterruptedException {
		CalenderControl con = new CalenderControl();
		con.selectDateFromDatePicker("1", "20");

	}

	public void selectDateFromDatePicker(String month, String date) throws InterruptedException {

		System.setProperty("webdriver.chrom.driver", "src/test/resources/chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='departure']/../span"));
		Thread.sleep(3000);

		/*
		 * driver.findElement(
		 * By.xpath("//div[@class='DayPicker']//div[@class='DayPicker-Month'][" + month
		 * + "]//div[@class='DayPicker-Day']//p[text()='" + date + "']")) .click();
		 */
		
		System.out.println(driver.findElement(By.xpath("//div[@class='DayPicker']")));
	}

}
