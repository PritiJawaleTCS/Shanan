package POMTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	@FindBy(xpath = "//input[@id='username']") private WebElement UN;
	@FindBy(xpath = "//input[@name='password']") private WebElement pwd;
	@FindBy(xpath = "//button[@id='submit']") private WebElement loginBtn;

	public LoginPage2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	
	public void enterPWD(String password) {
		pwd.sendKeys(password);
	}
	
	public void clickLogin() {
		loginBtn.click();
	}
}
