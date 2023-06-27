package TestNGPrograms;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenToClass implements ITestListener{

	public void onStart(ITestContext c) {
		System.out.println("on the start of the test class");
	}
	
	public void onFinish(ITestContext c) {
		System.out.println("at the end of the test class");
	}
	
	public void onTestStart(ITestResult r) {
		System.out.println("the test case started");
	}
	
	public void onTestSuccess(ITestResult r) {
		System.out.println("the test case passed");
	}
	
	public void onTestFailure(ITestResult r) {
		System.out.println("the test case failed");
	}
	
	public void onTestSkipped(ITestResult r) {
		System.out.println("the test case skipped");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult r) {
		System.out.println("the test case passed 50%");
	}
	
	
}
