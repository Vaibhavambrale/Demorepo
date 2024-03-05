package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class Login_page {
	@FindBy(id = "userName")
	private WebElement user;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(id = "login")
	private WebElement loginbtn;

	@FindBy(xpath = "//button[@id='newUser']")
	private WebElement register;

	@FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
	private WebElement logo;

	// CONSTRUCTOR
	public Login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// CONSTRUCTOR
	public void login_username() {
		user.sendKeys("vaibhav");
	}

	public void login_password() {
		pass.sendKeys("Ambrale@1");
	}

	public void login_button() {
		loginbtn.click();
	}

	public void new_register() {
		register.click();
	}

	public void logo_pic() {
		boolean lg = logo.isDisplayed();
		if (lg == true) {
			System.out.println("Logo is displayed");
		} else {
			System.out.println("Logo is not displayed");
		}
	}
}