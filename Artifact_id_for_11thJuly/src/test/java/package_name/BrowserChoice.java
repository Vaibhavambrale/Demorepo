package package_name;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserChoice{
	
	public static WebDriver driver=null;

	@Parameters({"browser"})
	@Test
	public void StartBrowser (@Optional("Chrome") String browser) {
		
		if(browser.equals("edge")) {
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			System.out.println("Edge Browser");
		}else if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Chrome Browser");
		}
	}
	
		@AfterSuite	
		public void closingBrowser()
		{
			driver.close();
			}
}

