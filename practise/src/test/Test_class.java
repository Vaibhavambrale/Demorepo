package test;

import pages.Login_page;
import pages.Registration_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_class {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/login");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,350)");
		Login_page login = new Login_page(driver);
		login.logo_pic();
		login.login_username();
		login.login_password();
		login.login_button();
		Thread.sleep(5000);
		driver.close();
		
	}

}
