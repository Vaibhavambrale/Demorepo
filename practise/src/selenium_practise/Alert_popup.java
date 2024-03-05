package selenium_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
public class Alert_popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Alert alt=driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(alt.getText());
		alt.accept();
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(6000);
		System.out.println(alt.getText());
		alt.accept();
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		System.out.println(alt.getText());
		alt.accept();
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		alt.sendKeys("name");
		System.out.println(alt.getText());
		Thread.sleep(10000);
		alt.accept();
		driver.close();
	}
}
