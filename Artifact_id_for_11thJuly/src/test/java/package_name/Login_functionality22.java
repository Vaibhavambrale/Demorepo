package package_name;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Login_functionality22 extends BrowserChoice
{
	@Test(dataProvider="testing",dataProviderClass=Dataprovider.class)
	public void Excel(String user,String pass)
	{
		SoftAssert soft=new SoftAssert();
		driver.get("https://www.saucedemo.com/v1/index.html");
		WebElement email=driver.findElement(By.id("user-name"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement logbtn=driver.findElement(By.id("login-button"));
		email.sendKeys(user);
		password.sendKeys(pass);
		logbtn.click();     
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String acurl=driver.getCurrentUrl();
		String exurl="https://www.saucedemo.com/v1/inventory.html";
		soft.assertEquals(acurl, exurl, "Not matching");
		soft.assertAll();
	}
	
}
