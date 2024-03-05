package selenium_practise;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Selenium_home {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://demoqa.com/date-picker");
		//js.executeScript("window.scrollBy(0,150)");				

		driver.findElement(By.id("datePickerMonthYearInput")).click();
		//driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Sub Sub Item 1']")).click();
		//driver.findElement(By.xpath("//body/div[@id='__next']/div/div[contains(@class,'gfg_header_wrapper')]/div[contains(@class,'root gfg_header__root')]/div[@id='comp']/div[contains(@class,'gfgheader_parentContainer')]/div[@id='topMainHeader']/div[contains(@class,'headerContainerDark')]/ul[contains(@class,'headerMainListDark')]/li[contains(@class,'headerMainListItemDark activeNav')]/ul[contains(@class,'class-0')]/li[contains(@class,'megaDropDownListItemDark selected')]/a[contains(@class,'inner_child')]/ul[contains(@class,'megaDropDownDark subDropDown class-1')]/li[contains(@class,'megaDropDownListItemDark selected')]/a[contains(@class,'inner_child')]/ul[contains(@class,'megaDropDownDark subDropDown class-2')]/li[contains(@class,'megaDropDownListItemDark selected')]/a[1]")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Singly Linked List']")).click();
		//WebElement date=driver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, March 2nd, 1999']"));
		WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		WebElement year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		//Select s = new Select(date);
		Select s1 = new Select(month);
		Select s2 = new Select(year);
		//s.selectByIndex(2);
		s2.selectByValue("1999");
		s1.selectByVisibleText("March");
		driver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, March 2nd, 1999']")).click();
		driver.findElement(By.xpath("//input[@id='dateAndTimePickerInput']")).click();
		Thread.sleep(5000);
		driver.close();
	
		
		
	}	

}
