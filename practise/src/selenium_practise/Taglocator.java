package selenium_practise;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Taglocator {

	public static void main(String args[]) throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://jqueryui.com/droppable/");
	Thread.sleep(2000);
	List<WebElement> tag=driver.findElements(By.tagName("li"));
	System.out.println(tag.size());
	System.out.println("=============");
	for(int i=0;i<tag.size();i++) {
		System.out.println(tag.get(i).getText());
	}
	Thread.sleep(1000);
	driver.close();
}
}