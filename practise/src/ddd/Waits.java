package ddd;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
public class Waits {
	
	static WebDriver driver=null;
	public static void main(String[] args)throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		WebElement textbox1=driver.findElement(By.id("btn1"));
		textbox1.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement el=wait.until(ExpectedConditions.elementToBeClickable(By.id("txt1")));
		el.sendKeys("Vaibhav");
		WebElement textbox2=driver.findElement(By.id("btn2"));
		textbox2.click();
		   Wait<WebDriver> w = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(12))
			       .pollingEvery(Duration.ofSeconds(2))
			       .ignoring(NoSuchElementException.class);
		  w.until(ExpectedConditions.elementToBeClickable(By.id("txt2")));
		  WebElement ele1=driver.findElement(By.id("txt2"));
		  ele1.sendKeys("This part done");
			 driver.close();
		}
	}
	

