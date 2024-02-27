package com.SauceDemo.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	WebDriver driver;

	public void setup() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	}
	public void tearDown() {
		
		driver.quit();
	}
}