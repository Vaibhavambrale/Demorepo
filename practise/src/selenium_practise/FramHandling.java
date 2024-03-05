package selenium_practise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FramHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Frame_Program");
		Thread.sleep(2000);
		driver.switchTo().frame("demo-frame lazyloaded");
		driver.findElement(By.id("a")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement A=driver.findElement(By.xpath("//select[@id='animals']"));
		Select s=new Select(A);
		s.selectByVisibleText("Avatar");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("head")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
	}
}