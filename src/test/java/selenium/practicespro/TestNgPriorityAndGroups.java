package selenium.practicespro;

import org.testng.annotations.Test;

public class TestNgPriorityAndGroups {
	
	@Test(groups = {"Smoke"})
	public void test1() {
		
		System.out.println("Smoke");
		
	}
	
	@Test(groups = {"Sanity"})
	public void ab() {
		System.out.println("Sanity");
		
	}
	
	@Test(groups = {"Smoke","Regression"})
	public void cd() {
		System.out.println("Smoke&Regression");
		
	}
	
	@Test(groups = {"Sanity","System"})
	public void ef() {
		System.out.println("Sanity&System");
		
	}
	
	@Test(groups = {"Smoke","Sanity"})
	public void gh() {
		System.out.println("Smoke&Sanity");
		
	}


}
