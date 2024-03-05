package GroupId_for_11thJuly.Artifact_id_for_11thJuly;

import java.util.Set;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class demo {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		WebElement Childbut=driver.findElement(By.id("newWindowBtn"));
		Childbut.click();
		Set<String> mulid=driver.getWindowHandles();
		ArrayList<String> a=new ArrayList<>(mulid);
		System.out.println(a.get(0));
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("=====================");
		
		//Switch to child browser
		driver.switchTo().window(a.get(1));
		driver.manage().window().maximize();
		String t=driver.getTitle();
	    System.out.println(t);
	    driver.findElement(By.id("firstName")).sendKeys("Vaibhav");
	    Thread.sleep(2000);
	    driver.switchTo().window(a.get(0));
	    driver.findElement(By.id("name")).sendKeys("Today i learnt about child browser popup");
	    Thread.sleep(2000);
	    driver.quit();
	}

}
