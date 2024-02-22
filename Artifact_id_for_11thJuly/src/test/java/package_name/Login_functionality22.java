package package_name;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Reporter;
public class Login_functionality22 extends BrowserChoice
{
	@Test(dataProvider="testing",dataProviderClass=Dataprovider.class,priority=1)
	public void Excel(String user,String pass)
	{
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.findElement(By.id("user-name")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
	}
	@Test(priority=2)
	public void test1() {
		Reporter.log("This is the test report generated");
	}
}
