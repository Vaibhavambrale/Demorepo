package com.Collabera.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Browserchoice {
	
	public WebDriver driver=null;

	@Parameters({"browser"})
	@BeforeMethod
	public void RunBrowser(@Optional("chrome") String browser) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}else if(browser.equals("edge")) {
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
