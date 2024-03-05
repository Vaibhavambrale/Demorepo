package selenium_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_right_single_click {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/buttons");
		WebElement doubleclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions act = new Actions(driver);
		WebElement rightclick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]")).click();
		act.doubleClick(doubleclick).perform();
		act.contextClick(rightclick).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
