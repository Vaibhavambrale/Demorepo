package selenium_practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		WebElement frames=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frames);
		WebElement drag = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Point loc=drop.getLocation();
		System.out.println("Location of the drop item--> "+loc);
		Actions a=new Actions(driver);
		//So,.build() is used to combine all the complex actions into one.
		//As if joining all of them together 
		//Once they are joined together they can be exxecuted with the help of perform method.
		//Perform method is used to execute the sequence of actions that the build method has combined/binded together
		//If only one action is there Eg; a.doubleclick().perform() --> Then you don't need to use .build() as 
		//as you don't have to combine any actions as there is only one action present and not a sequence of actions.
		a.clickAndHold(drag).moveToElement(drop).release().build().perform();
		Thread.sleep(3000);
		driver.close();
	}
}
