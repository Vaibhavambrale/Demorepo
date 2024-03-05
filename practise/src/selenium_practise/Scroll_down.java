package selenium_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;

public class Scroll_down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/select-menu");
		WebElement l=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Point loc = l.getLocation();
		System.out.println(loc);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("scroll(0,150)");
		Thread.sleep(3000);
		js.executeScript("scroll(0,-150)");
		Thread.sleep(3000);
		driver.close();

	}

}
