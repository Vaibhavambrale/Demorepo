package selenium_practise1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_deselect_methods {
	static WebDriver driver=null;
	public static void main(String[] args) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
			WebElement course_name=driver.findElement(By.id("course"));
			Select drops=new Select(course_name);
			drops.selectByIndex(1);
			System.out.println(drops.getFirstSelectedOption().getText());
			drops.selectByIndex(2);
			System.out.println(drops.getFirstSelectedOption().getText());
			drops.selectByIndex(3);
			System.out.println(drops.getFirstSelectedOption().getText());
			drops.selectByIndex(4);
			System.out.println(drops.getFirstSelectedOption().getText());
			driver.close();
	}

}
