package AcademyBugs;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LIstners extends Tests implements ITestListener {

	public void onTestStart(ITestResult result) {
	System.out.println("test case pass");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("case pass");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	 System.out.println("test case failed");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
