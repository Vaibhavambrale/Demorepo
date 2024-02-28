package com.Collaber.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pageclass {

	private WebDriver driver=null;
	public Pageclass(WebDriver d) {
		driver=d;
	}
	private By user=By.id("user-name");
	private By pass=By.id("password");
	private By logbtn=By.id("login-button");
	public void logincheck(String username,String password) {
		driver.findElement(user).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(logbtn).click();
	}

}