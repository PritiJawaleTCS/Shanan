package Compatibility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multi2 {
	@Test
	public void TC1(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
		}
}
