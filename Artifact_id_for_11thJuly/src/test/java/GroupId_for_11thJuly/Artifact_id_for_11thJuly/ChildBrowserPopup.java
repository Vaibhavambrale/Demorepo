package GroupId_for_11thJuly.Artifact_id_for_11thJuly;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\"C:\\Users\\Varun Ambrale\\Desktop\\Testing Notes\\ChromeDriver\\Chromedriver-32\\chrome-win32\\chrome.exe\"");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
        
       Set<String> mulIDS =  driver.getWindowHandles();// to get the window ID
 
       ArrayList<String> a = new ArrayList<>(mulIDS);//values store on basis of index..
       System.out.println(a.get(0)); //Main Page ID(Parent)
       String t1 = driver.getTitle();
       System.out.println(t1);
       System.out.println("=====================================");
       Thread.sleep(3000);
       
       System.out.println(a.get(1)); //printed on console (ID)
       driver.switchTo().window((String) a.get(1));
       String t2 = driver.getCurrentUrl();
       System.out.println(t2);
       
       driver.close();// that window which has selenium control
       
       Thread.sleep(5000);
       driver.quit();
	}

}