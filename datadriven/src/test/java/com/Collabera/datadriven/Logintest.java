package com.Collabera.datadriven;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.asserts.SoftAssert;

import com.Collaber.PageLayer.Pageclass;
import com.Collabera.testBase.Browserchoice;

public class Logintest extends Browserchoice{

	@Test(dataProvider="Credentials",dataProviderClass=DataDrivenTesting.class)
	public void Logincasetest(String u,String p) {
		Pageclass login=new Pageclass(driver);
		login.logincheck(u,p);
		SoftAssert soft=new SoftAssert();
		String exp="https://www.saucedemo.com/inventory.html";
		String act=driver.getCurrentUrl();
		AssertJUnit.assertEquals(act, exp);
		soft.assertAll();

	}

}
