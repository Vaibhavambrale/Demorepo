package selenium_practise1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement ide=driver.findElement(By.xpath("//select[@id='ide']"));
		Select a=new Select(ide);
		a.selectByIndex(0);
		a.selectByIndex(1);
		a.selectByIndex(2);
		a.selectByIndex(3);
		List<WebElement> p=a.getAllSelectedOptions();
		for(int i=0;i<p.size();i++) {
			System.out.println(p.get(i).getText());
		}
		a.deselectAll();
		driver.close();
	}

}
