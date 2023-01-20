package MultiBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class M4 {

	@Parameters("google")
	@Test
	public void TC(String google) {
		WebDriver driver = null;
		if(google.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(google.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Microsoft\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://www.google.com/");
	}
}
