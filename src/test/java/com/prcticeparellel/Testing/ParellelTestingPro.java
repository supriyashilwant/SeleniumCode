package com.prcticeparellel.Testing;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParellelTestingPro {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.crome.driver", "src/test/resources/chromedriver_win32");
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();

	}
	
	@Test
	public void verifyValidLoginWithDifferentUser() {
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("test1");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test");
		
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        
        WebElement Loginmsg = driver.findElement(By.xpath("//h3[text()= 'Login Successfully']"));
        
        assertEquals(Loginmsg.getText(),"Login Successfully","User not logged in ASuccessfully");
		
	}
	@Test
	public void verifyPageTitle() {
		
		assertEquals(driver.getTitle(),"Welcome: Mercury Tours");
		
	}
	@Test
	public void verifyPageUrl() {
		
		assertEquals(driver.getCurrentUrl(),"https://demo.guru99.com/test/newtours/");
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
}
