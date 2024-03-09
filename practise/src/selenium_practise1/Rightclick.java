package selenium_practise1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Rightclick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act=new Actions(driver);
		act.contextClick(right).perform();
		WebElement menu=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-cut']"));
		Select s=new Select(menu);
		s.selectByIndex(2);
		Alert al=driver.switchTo().alert();
		al.accept();
		driver.close();
	}

}
