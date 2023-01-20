package TestNg;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

	public class Test4 {
		@Test
		public void TC1() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.get("https://www.hackerrank.com/");
		    driver.manage().window().maximize();
		    Reporter.log("Open hackerrank in testNg", true);
		    Assert.fail();
	}
		
		@Test
		public void TC2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
	    Reporter.log("Open actitime in testNg", true);
	    Assert.fail();
	}
		@Test
		public void TC3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.javatpoint.com/python-tutorial");
	    driver.manage().window().maximize();
	    Reporter.log("Open javatpoint in testNg", true);
	    
}@Test
		public void TC4() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.w3schools.com/js/");
	    driver.manage().window().maximize();
	    Reporter.log("Open w3schools in testNg", true);
	    
}
	
}
	


