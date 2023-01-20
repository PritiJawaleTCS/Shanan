package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test5 {
@Test
public void TC1() {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://www.google.co.in/");
    driver.manage().window().maximize();
    Reporter.log("Open Google in testNg", true);
    }

@Test
public void TC2() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
	Reporter.log("Open amazon in testNg", true);
	
}
@Test
public void TC3() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    driver.get("http://www.shopsy.in/");
    driver.manage().window().maximize();
	Reporter.log("Open shopsy in testNg", true);

}
@Test
public void TC4() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
	Reporter.log("Open flipkart in testNg", true);
	Assert.fail();
}
@Test
public void TC5() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    driver.get("https://www.meesho.com/");
    driver.manage().window().maximize();
	Reporter.log("Open meesho in testNg", true);
	Assert.fail();
}
@Test
public void TC6() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    driver.get("https://www.myntra.com/");
    driver.manage().window().maximize();
	Reporter.log("Open myntra in testNg", true);
	Assert.fail();
}

}

