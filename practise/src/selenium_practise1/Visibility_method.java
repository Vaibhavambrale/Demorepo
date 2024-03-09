package selenium_practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Visibility_method {
	static int i=1;
	public static void main(String[] args) {
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/checkboxradio/");
			WebElement frame = driver.findElement(By.className("demo-frame"));
			driver.switchTo().frame(frame);
			WebElement rny=driver.findElement(By.xpath("//label[@for='radio-1']"));
			WebElement rp=driver.findElement(By.xpath("//label[@for='radio-2']//span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']"));
			WebElement rl=driver.findElement(By.xpath("//label[@for='radio-3']"));
			WebElement Hotel_rating_2=driver.findElement(By.xpath("//label[@for='checkbox-1']"));
			WebElement Hotel_rating_3=driver.findElement(By.xpath("//label[@for='checkbox-2']"));
			WebElement Hotel_rating_4=driver.findElement(By.xpath("//label[@for='checkbox-3']"));
			WebElement Hotel_rating_5=driver.findElement(By.xpath("//label[@for='checkbox-4']//span[@class='ui-checkboxradio-icon-space']"));
			WebElement bdouble=driver.findElement(By.xpath("//label[@for='checkbox-nested-1']"));
			WebElement bqueen=driver.findElement(By.xpath("//label[@for='checkbox-nested-2']"));
			WebElement bqueen2=driver.findElement(By.xpath("//label[@for='checkbox-nested-3']"));
			WebElement bking=driver.findElement(By.xpath("//label[@for='checkbox-nested-4']"));
			rny.click();
			rp.click();
			rl.click();
			Hotel_rating_2.click();
			Hotel_rating_3.click();
			Hotel_rating_4.click();
			Hotel_rating_5.click();
			bdouble.click();
			bqueen.click();
			bqueen2.click();
			bking.click();
			System.out.println("New York is selected? : "+rny.isSelected());
			System.out.println("Paris is selected? : "+rp.isSelected());
			System.out.println("London is selected? : "+rl.isSelected());
			System.out.println("Hotel is 2 star? : "+Hotel_rating_2.isSelected());
			System.out.println("Hotel is 3 star is selected? : "+Hotel_rating_3.isSelected());
			System.out.println("Hotel is 4 star is selected? : "+Hotel_rating_4.isSelected());
			System.out.println("Hotel is 5 star is selected? : "+Hotel_rating_5.isSelected());
			System.out.println("Bed is 2 double is selected? : "+bdouble.isSelected());
			System.out.println("Bed Queen size is selected? : "+bqueen.isSelected());
			System.out.println("Bed queen  is selected? : "+bqueen2.isSelected());
			driver.close();
			
	
	}

}
