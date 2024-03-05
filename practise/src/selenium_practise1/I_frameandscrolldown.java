package selenium_practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class I_frameandscrolldown {
//googlefcInactive  __tcfapiLocator  googlefcLoaded  oauth2relay435628574  google_esf
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,600)");
		driver.switchTo().frame("frm1");
		WebElement Menu=driver.findElement(By.id("selectnav2"));
		Menu.click();
		Select op=new Select(Menu);
		op.selectByIndex(3);
		System.out.println(op.getFirstSelectedOption().getText());
		driver.switchTo().parentFrame();
		js.executeScript("scroll(0,500)");
		driver.switchTo().frame("frm2");
		js.executeScript("scroll(0,400)");
		WebElement f2name=driver.findElement(By.id("firstName"));
		WebElement f2lastname=driver.findElement(By.id("lastName"));
		WebElement f2radio=driver.findElement(By.id("femalerb"));
		WebElement f2le=driver.findElement(By.id("englishchbx"));
		WebElement f2lh=driver.findElement(By.id("hindichbx"));
		WebElement f2lc=driver.findElement(By.id("chinesechbx"));
		WebElement f2ls=driver.findElement(By.id("spanishchbx"));
		WebElement f2ll=driver.findElement(By.id("latinchbx"));
		WebElement f2lf=driver.findElement(By.id("frenchchbx"));
		WebElement f2email=driver.findElement(By.id("email"));
		WebElement f2pass=driver.findElement(By.id("password"));
		f2name.sendKeys("Vaibhav");
		f2lastname.sendKeys("Ambrale");
		f2radio.click();
		f2le.click();
		f2lh.click();
		f2lc.click();
		f2ls.click();
		f2ll.click();
		f2lf.click();
		f2email.sendKeys("vaibhavambrale@gmail.com");
		f2pass.sendKeys("long@123");
		driver.findElement(By.id("registerbtn")).click();
		driver.switchTo().defaultContent();
		js.executeScript("scroll(0,100)");
		Thread.sleep(1000);
		driver.switchTo().frame("frm3");
		js.executeScript("scroll(0,1000)");
		Thread.sleep(2000);
		driver.findElement(By.id("selectnav2")).click();
		driver.findElement(By.id("selectnav1")).click();
		Thread.sleep(1000);
		js.executeScript("scroll(0,300)");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Now we are in frame 3");
		driver.switchTo().frame("frm1");
		WebElement m=driver.findElement(By.id("registerbtn"));
		Select fm=new Select(m);
		fm.selectByIndex(3);
		driver.switchTo().parentFrame();
		js.executeScript("scroll(0,200)");
		driver.switchTo().frame("frm2");
		js.executeScript("scroll(0,400)");
		
		
		Thread.sleep(3000);
		driver.close();
	}
}
