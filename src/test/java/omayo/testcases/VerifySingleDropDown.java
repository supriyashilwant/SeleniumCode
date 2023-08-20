package omayo.testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.annotations.Test;

import omayoblogs.pages.HomePage;
import utilities.Utility;

public class VerifySingleDropDown extends BaseTest {

	HomePage page;
	@Test
	public void VerifySingleSelectFunctionalityfDropDown() {
		
		page = new HomePage(driver);
		
		String expectedOptions[] = {"Older Newsletters","doc 1","doc 2","doc 3","doc 4"}; 
		
		ArrayList<String> selectedOptions = Utility.selectOptionFromDropDown(page.singledropdown(), expectedOptions);
		
		assertEquals(expectedOptions,selectedOptions);
		
		
	}

}  
