package practise_New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Reverse_String {

	public static void main(String[] args) {
		
	//	""C:\Users\Varun Ambrale\Desktop\Testing Notes\ChromeDriver\chromedriver-win32\chromedriver.exe""
		System.setProperty("webdriver.edge.driver","C:\\Users\\Varun Ambrale\\Desktop\\Testing Notes\\ChromeDriver\\msedgedriver.exe");
		//WebDriver D = new ChromeDriver();
		WebDriver D = new EdgeDriver();
		D.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=678711876615&hvpos=&hvnetw=g&hvrand=14037926437467774425&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9181926&hvtargid=kwd-10573980&hydadcr=14453_2371562");
		//D.get("https://www.flipkart.com/");
	}
}

