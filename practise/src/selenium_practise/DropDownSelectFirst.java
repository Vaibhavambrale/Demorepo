package selenium_practise;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
public class DropDownSelectFirst {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/date-picker");
		driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();
		WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		WebElement year =driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select s=new Select(month);
		Select s1=new Select(year);
		s.selectByVisibleText("March");
		s1.selectByVisibleText("1999");
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println(s1.getFirstSelectedOption().getText());
		driver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, March 2nd, 1999']")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
