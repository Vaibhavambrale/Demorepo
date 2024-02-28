package com.Collabera.datadriven;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.Collabera.datadriven.Utitlityclass;

public class MyListeners implements ITestListener {

	public void onTestFailure(ITestResult result) {
		Utitlityclass u=new Utitlityclass();
		try {
		u.ss(result.getName());
		}
		catch(Exception e) {
			System.out.println("Exception found");
			e.printStackTrace();
		}
		Reporter.log("Screenshot captured");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped");
	}

	
	public void onTestStart(ITestResult result) {
	System.out.println("Starting the test");
	}
	

	public void onTestSuccess(ITestResult result) {
	System.out.println("Test status: "+result.getStatus());
	}

}
