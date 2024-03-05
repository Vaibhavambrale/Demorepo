package practise_New;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
public class Fluent_wait {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.id("display-other-button")).click();
		Wait<WebDriver> w =new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(10L))
		.pollingEvery(Duration.ofSeconds(2))
		.ignoring(NoSuchElementException.class);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
		driver.findElement(By.id("checkbox")).click();
		Thread.sleep(11000);
		driver.close();
	}

}
