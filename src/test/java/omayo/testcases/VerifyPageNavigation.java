package omayo.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import omayoblogs.pages.HomePage;
import omayoblogs.pages.Selenium143Page;
import utilities.Utility;

public class VerifyPageNavigation extends BaseTest{
	
	HomePage page;
	Selenium143Page selenium143page;
	
	@Test
	
	public void verifyNavigation() {
		
		page = new HomePage(driver);
		selenium143page = new Selenium143Page(driver);
		page.clickOnThisBlogIsCreatedForLink();
		String parentWindowHandle = Utility.switchToNewWindow(driver);
		
		assertEquals(selenium143page.getWhatIsSeleniumLinkText(),"What is Selenium?");
		
		driver.close();
		
		Utility.switchToWindow(driver, parentWindowHandle);
		
		assertEquals(driver.getTitle(),"omayo (QAFox.com)");
				
			
		
	}
	

}
