package package_another;

import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;


public class Suits_testing {

	public WebDriver driver = null;

	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Sutie");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("CLOSING BROWSER");
		driver.close();
	}

}
