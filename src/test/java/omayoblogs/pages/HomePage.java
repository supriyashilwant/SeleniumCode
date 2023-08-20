package omayoblogs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	WebElement multiSelectDropDown;
	WebElement singledropdown;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getMultiSelectDropDownLocator() {
		
		multiSelectDropDown = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		return multiSelectDropDown;
		
	}
	
	public void clickOnThisBlogIsCreatedForLink() {
		
		driver.findElement(By.xpath("//a[@id='selenium143']")).click();
		
	}
	
	public WebElement singledropdown() {
		
		WebElement dropdown  =	singledropdown.findElement(By.id("drop1"));
		
		return singledropdown;
		
	}

}
