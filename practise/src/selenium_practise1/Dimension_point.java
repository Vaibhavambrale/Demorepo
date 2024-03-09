package selenium_practise1;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimension_point {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/resizable/");
		Dimension d=new Dimension(300,300);
		Point p=new Point(100,100);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		driver.close();
		

		}

}
