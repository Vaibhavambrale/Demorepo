package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_page {
	WebDriver driver = new ChromeDriver();
	@FindBy(id = "firstname")
	private WebElement First_name;

	@FindBy(id = "lastname")
	private WebElement Last_name;

	@FindBy(id = "userName")
	private WebElement user_name;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(className = "recaptcha-checkbox-border")
	private WebElement captcha;

	@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
	private WebElement Registerbtn;

	public Registration_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void first_name(String name) {
		First_name.sendKeys(name);
	}

	public void last_name(String last) {
		Last_name.sendKeys(last);
	}

	public void username(String user) {
		user_name.sendKeys(user);
	}

	public void password(String Password) {
		password.sendKeys(Password);
	}

	public void captcha() {
		captcha.click();
	}

	public void register_button() {
		Registerbtn.click();
	}

}
