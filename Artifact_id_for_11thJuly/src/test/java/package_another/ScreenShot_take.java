package package_another;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import package_name.BrowserChoice;

public class ScreenShot_take extends BrowserChoice{
	
	public void ss()  throws InterruptedException,IOException{
		TakesScreenshot ss = (TakesScreenshot) driver;
		File src =  ss.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Varun Ambrale\\Desktop\\Testing Notes\\Practise\\New Bitmap Image.bmp");
		FileHandler.copy(src, des);
		Thread.sleep(1000);
	}

	


	
	
	
	
}
