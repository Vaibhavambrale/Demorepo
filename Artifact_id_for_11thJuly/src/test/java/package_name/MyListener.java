package package_name;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import package_another.ScreenShot_take;

public class MyListener extends ScreenShot_take implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		Reporter.log("Name of the test:"+result.getTestName());
	}


	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test status : "+result.getStatus());
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed - Screenshot Captured");
		try {
			ss();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	
	public void onTestSkipped(ITestResult result) {
	System.out.println("Test has been skipped send notification");
	}


	
	public void onStart(ITestContext context) {
	System.out.println("TEST HAS BEGUN");
	}

	
	public void onFinish(ITestContext context) {
	System.out.println("TES HAS ENDED");
	}
			
	
	
	
}
