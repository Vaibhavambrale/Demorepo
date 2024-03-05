package GroupId_for_11thJuly.Artifact_id_for_11thJuly;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		WebElement button= driver.findElement(By.id("newWindowBtn"));
		button.click();
		Set<String> multid=driver.getWindowHandles();
		ArrayList<String> a=new ArrayList<>(multid);
		driver.switchTo().window(a.get(1));
		driver.manage().window().maximize();
		WebElement first=driver.findElement(By.id("firstName"));
		WebElement last=driver.findElement(By.id("lastName"));
		WebElement radio=driver.findElement(By.id("malerb"));
		WebElement checkbox=driver.findElement(By.id("englishchbx"));
		WebElement checkbox1=driver.findElement(By.id("hindichbx"));
		WebElement email=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("password"));
		WebElement register_button=driver.findElement(By.id("registerbtn"));
		first.sendKeys("Vaibhav");
		last.sendKeys("Ambrale");
		radio.click();
		checkbox.click();
		checkbox1.click();
		email.sendKeys("vaibhavambrale@gmail.com");
		pass.sendKeys("Ilovetang@1");
		register_button.click();
		String title=driver.getCurrentUrl();
		System.out.println("Title: "+title);
		driver.switchTo().window(a.get(0));
		String title_parent=driver.getCurrentUrl();
		System.out.println(title_parent);
		driver.quit();
		
		
	}
}