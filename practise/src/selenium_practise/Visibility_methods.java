package selenium_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Visibility_methods {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php?r=101");
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement radio=driver.findElement(By.xpath("//label[text()='Male']"));
		boolean ab=firstname.isDisplayed();
		System.out.println(ab);
		
		System.out.println(radio.isEnabled());
	
		System.out.println(radio.isSelected());
		Thread.sleep(1000);
		driver.close();
	}

}
