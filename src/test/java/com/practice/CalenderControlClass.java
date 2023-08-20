package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderControlClass {
	//WebDriver
    WebDriver driver;
	public static void main(String[] args) {
		CalenderControlClass conc = new CalenderControlClass();
		conc.selectDateFromDatePicker();

	}
	
	public void selectDateFromDatePicker() {
		System.setProperty("webdriver.crom.driver","src/test/resources/chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");	
		driver.manage().window().maximize();
		
	}
	

}
