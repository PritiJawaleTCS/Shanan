package POMTestng;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {

	WebDriver driver;
	Sheet sh;
	LoginPage lp;
	HomePage hp;
	
	@BeforeClass
	public void openBrowser() throws Throwable {
		FileInputStream fis =new FileInputStream("C:\\Users\\Microsoft\\Documents\\PracticeLogin.xlsx");
		sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		lp= new LoginPage(driver);
		hp= new HomePage(driver);
	}
	
	@BeforeMethod
	public void loginApp() {
		
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		lp.enterUN(username);
		
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		lp.enterPWD(password);
		
		lp.clickLoginBtn();
		
		
	}
	@Test
	public void verifyText() {
		Reporter.log("Running verify Text ",true);
		String expT = sh.getRow(0).getCell(0).getStringCellValue();
		String actT = hp.verifyText();
		Assert.assertEquals(expT, actT);


		
	}
	@AfterMethod
	public void logOut() {
		Reporter.log("log out from app", true);
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close the browser", true);

	}
}
