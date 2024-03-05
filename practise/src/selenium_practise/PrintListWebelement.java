package selenium_practise;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
public class PrintListWebelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/select-menu");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		WebElement cars = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s= new Select(cars);
		s.selectByVisibleText("Volvo");
		s.selectByVisibleText("Audi");
		s.selectByVisibleText("Saab");
		s.selectByVisibleText("Opel");
		
		List<WebElement> listvar= s.getAllSelectedOptions();
		for(int i=0;i<listvar.size();i++) {
			System.out.println(listvar.get(i).getText());
		}
		Thread.sleep(3000);
		s.deselectByVisibleText("Audi");
		Thread.sleep(3000);
		driver.close();
	}	

}
