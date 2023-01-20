package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void TC1() {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("hhttps://demo.actitime.com/login.do");
	    driver.manage().window().maximize();
	    Reporter.log("Open actitime in testNg", true);
	    
	    }
}
