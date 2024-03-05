package selenium_practise1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		TakesScreenshot ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Varun Ambrale\\Desktop\\Testing Notes\\PROJECT MAIN\\vaibhav.png");
		FileHandler.copy(src, des);
		driver.close();
		
		
		
		

	}


}
