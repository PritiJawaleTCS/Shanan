package TestNg;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

	public class Test3 {
		@Test
		public void TC1() {
			

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.get("https://www.javatpoint.com/python-tutorial");
		    driver.manage().window().maximize();
		    Reporter.log("Open javatpoint in testNg", true);
		    Assert.fail();
		    }
	}



