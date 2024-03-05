package selenium_practise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/demo-site/draggableboxes/");
		WebElement frame=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame("frame");
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		//WebElement drop=driver.findElement(By.xpath(""));
		Point loc=frame.getLocation();
		System.out.println(loc);
		Actions act=new Actions(driver);
		act.clickAndHold(drag).moveToLocation(200,30).release().build().perform();
		Thread.sleep(3000);
		driver.close();
	}

}
