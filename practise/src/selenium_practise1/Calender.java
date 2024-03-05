package selenium_practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		WebElement f=driver.findElement(By.id("first_date_picker"));
		f.sendKeys("02/03/1999");
		Thread.sleep(2000);
		WebElement s=driver.findElement(By.id("second_date_picker"));
		WebElement t=driver.findElement(By.id("third_date_picker"));
		WebElement fo=driver.findElement(By.id("fourth_date_picker"));
		WebElement fi=driver.findElement(By.id("fifth_date_picker"));
		WebElement si=driver.findElement(By.id("sixth_date_picker"));
		s.sendKeys("02/03/1998");
		Thread.sleep(2000);
		t.sendKeys("02/05/1996");
		Thread.sleep(2000);
		fo.sendKeys("02/02/1999");
		Thread.sleep(2000);
		fi.sendKeys("08/03/1999");
		Thread.sleep(2000);
		si.sendKeys("09/09/2005");
		Thread.sleep(2000);
				driver.close();
		

	}

}
