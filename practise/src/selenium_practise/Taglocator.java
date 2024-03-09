package selenium_practise;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Taglocator {
	//Here we find the name/text that every tag has.
	
	public static void main(String args[]) throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
	List<WebElement> tag=driver.findElements(By.tagName("lr"));
	System.out.println("Size of tags:"+tag.size());
	for(int i=0;i<tag.size();i++) {
		System.out.println(tag.get(i).getText());
	}
	driver.close();
}
}