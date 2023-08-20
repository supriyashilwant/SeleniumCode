package omayoblogs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Selenium143Page {

	WebDriver driver;

	public Selenium143Page(WebDriver driver) {

		this.driver = driver;
	}

	public String getWhatIsSeleniumLinkText() {

		// return
		// driver.findElement(By.xpath("//*[@id=\"HTML7\"]/div[1]/table/tbody/tr/td[1]/ol/li[1]/b/a")).getText();
		return driver.findElement(By.xpath("//a[text()='What is Selenium?']")).getText();

	}

}
