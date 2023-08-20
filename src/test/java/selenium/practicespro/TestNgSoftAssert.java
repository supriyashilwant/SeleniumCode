package selenium.practicespro;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestNgSoftAssert {
	
	@Test
	public void verifyPageTitle() {
		
		System.setProperty("webdriver.crom.driver", "src/test/resources/chromedriver_win32");

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com");

		driver.manage().window().maximize();
		
		//Example of Soft Assert
		
//		SoftAssert verify = new SoftAssert();
//		
//		verify.assertEquals(driver.getTitle(), "omayo (QAFox.com)","Title is equal");
//		
//		//verify.assertTrue(driver.getTitle().equals("omayo (QAFox.com)"));
//		verify.assertTrue(driver.getTitle().equals("omayo (QAFox.com)"),"Title 1");
//		
//		//verify.assertFalse(driver.getTitle().equals("omayo (QAFox.com)"));
//		
//		verify.assertFalse(driver.getTitle().equals("omayo (QAFox.com)"),"Title 2");
//		
//		System.out.println("After failure");
//		
//		verify.assertNotEquals(driver.getTitle(), "omayo (QAFox.com)","Title is equal");
//		
//		System.out.println("After failure");
//		//Always call assertall method after all assertion
//		verify.assertAll();
		//Hard assert when chang application state we can use hard assert.
	    assertEquals(driver.getTitle(), "omayo (QAFox.com)","Title is equal");
	    
	    assertNotEquals(driver.getTitle(), "omayo (QAFox.com)","Title is equal");
	    System.out.println("After failure");
	    assertTrue(driver.getTitle().equals("omayo (QAFox.com)"),"Title 1");
	    
	    assertFalse(driver.getTitle().equals("omayo (QAFox.com)"),"Title 2");
	    System.out.println("After failure");
	    
	   
	}

}
