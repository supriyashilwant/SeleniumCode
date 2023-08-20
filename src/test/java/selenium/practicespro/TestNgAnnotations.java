package selenium.practicespro;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before suite");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test Plans");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void Test() {
		System.out.println("Before Method");
	}

	@Test
	public void Testng() {
		System.out.println("Test");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("@AfterClass");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}

	@Test
	public void Testng1() {
		System.out.println("Test1");
	}

}
