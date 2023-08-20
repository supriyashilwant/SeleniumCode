package omayo.testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

import omayoblogs.pages.HomePage;
import utilities.Utility;

public class VerufyMultiSelectFunctionalityOfDropDown extends BaseTest{
	
	HomePage page;
	
	@Test

	public void VerufyMultiSelectFunctionalityfDropDown() {
		page = new HomePage(driver);
		String[] options = {"Audi","Volvo"};
		ArrayList<String> selectedOptions = Utility.selectOptionFromDropDown(page.getMultiSelectDropDownLocator(), options);
		
		assertEquals(selectedOptions,Arrays.asList("Volvo","Audi"));

	}

	

}
