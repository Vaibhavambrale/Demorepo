package selenium_practise1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_confirm_alerts {
static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		WebElement a=driver.findElement(By.xpath("//button[@id='alertBox']"));
		WebElement b=driver.findElement(By.xpath("//button[@id='confirmBox']"));
		WebElement c=driver.findElement(By.xpath("//button[@id='promptBox']"));
		//Alert alt=driver.switchTo().alert();
		a.click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		b.click();
		alt.accept();
		b.click();
		alt.dismiss();
		c.click();
		alt.sendKeys("Vaibhav Ambrale");
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		driver.close();		
	}
}
