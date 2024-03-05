package selenium_practise;

import org.testng.annotations.*;
public class TestNgAnnotations {
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}
	@Test
	public void Test1() {
		System.out.println("First Test case");
	}
	@Test
	public void Test2() {
		System.out.println(2/0);
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
	}
}

