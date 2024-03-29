package package_name;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry {

public class RetryAnalyzer implements IRetryAnalyzer {
	private int retrycount=0;
	public static final int maxretrycount = 4;

	public boolean retry(ITestResult result) {
		
		if(retrycount<maxretrycount)
		{
			retrycount++;
			return true;
		}
		return false;
	}
}
}