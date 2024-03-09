package selenium_practise1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");
		WebElement a=driver.findElement(By.id("alert"));
		a.click();
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.alertIsPresent());
		Alert alt=driver.switchTo().alert();
		alt.accept();
		WebElement text=driver.findElement(By.className("target-text"));
		WebElement text_change=driver.findElement(By.xpath("//button[@id='populate-text']"));
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(2))
		.ignoring(Exception.class);
		text_change.click();
		w.until(ExpectedConditions.textToBePresentInElementValue(text,"Selenium Webdriver"));
		WebElement enable=driver.findElement(By.xpath("//button[@id='display-other-button']"));
		enable.click();
		WebElement en_but=driver.findElement(By.xpath("//button[@id='hidden']"));
		w.until(ExpectedConditions.visibilityOf(en_but));
		System.out.println(en_but.getText());
		WebElement checked=driver.findElement(By.xpath("//input[@id='ch']"));
		WebElement checkbox=driver.findElement(By.xpath("//button[@id='checkbox']"));
		checkbox.click();
		wait.until(ExpectedConditions.domPropertyToBe(checked, "checked", "true"));
		a.click();
		w.until(ExpectedConditions.alertIsPresent());
		alt.accept();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
