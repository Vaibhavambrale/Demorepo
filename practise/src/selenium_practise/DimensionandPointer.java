package selenium_practise;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionandPointer {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		Dimension d = new Dimension(400,800);
		Point p = new Point(400,400);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		driver.close();
	
	}

}
