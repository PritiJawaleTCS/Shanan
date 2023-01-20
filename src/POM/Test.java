package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demo.actitime.com/login.do");
	LoginPage l=new LoginPage(driver); 
	l.enterUn();
	l.enterPWD();
	l.clickLoginBtn();
	HomePage h=new HomePage(driver);
	h.verifyText();


	
}
}
