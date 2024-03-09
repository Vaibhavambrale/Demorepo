package selenium_practise1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_doubleclick_action {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");		
		WebElement dc=driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,600)");
		Actions act=new Actions(driver);
		act.doubleClick(dc).perform();
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		al.accept();
		driver.close();
	}
}
