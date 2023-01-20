package MultiBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class M3 {
	
	@Parameters("Selenium")
	@Test
	public void TC(String Selenium) {
		WebDriver driver = null;
		if(Selenium.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(Selenium.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Microsoft\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		driver.get("https://www.selenium.dev/");
		
	}

}
