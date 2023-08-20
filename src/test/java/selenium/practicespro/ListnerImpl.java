package selenium.practicespro;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImpl implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Testcase started" +result.getName());

	}

	public void onTestSuccess(ITestResult result) {

	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("Testcase failed" +result.getName());

	}

	public void onTestSkipped(ITestResult result) {

	}

}
