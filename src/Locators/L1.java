package Locators;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class L1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//		
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student",Keys.TAB,"Password123",Keys.TAB,Keys.ENTER);
//	
//	
//		Thread.sleep(4000);
		driver.get("https://www.opencart.com/index.php?route=account/register");
//		
//		//navigate();
//
//		Thread.sleep(4000);
//        driver.navigate().forward();
//        
//		Thread.sleep(4000);
//        driver.navigate().back();
//
//        Thread.sleep(4000);
//        driver.navigate().refresh();
//       
//        Thread.sleep(4000);
//        driver.navigate().back();
//
//        Thread.sleep(8000);


		Thread.sleep(8000);
		//Keys class
		

		//WebElement interface
		WebElement web=driver.findElement(By.xpath("//select[@id='input-country']"));
		//Select class
		Select s=new Select(web);

		s.selectByValue("99");
		
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("PritiDipak",Keys.TAB,"Priti",Keys.TAB,"Jawale",Keys.TAB,"pnjawale30011998@gmail.com",Keys.TAB,"PritiDipak",Keys.ENTER);
		Thread.sleep(8000);

		Thread.sleep(8000);

		//Robot class
		Robot r=new Robot();
		for(int i=1;i<=2;i++) {
			
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
			Thread.sleep(9000);

			//JavascriptExecutor interfce 
		JavascriptExecutor jse=(JavascriptExecutor)driver;	
		jse.executeScript("window.scrollBy(0,1000);");
		
		Thread.sleep(9000);
		//maximize() void
		driver.manage().window().maximize();
		Thread.sleep(9000);
		
		//minimize() void
        driver.manage().window().minimize();
		Thread.sleep(9000);

		//setSize() void
		
			
		Dimension d=new Dimension(500,1000);
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(4000);
	
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		
		Thread.sleep(4000);

		
		//setPosition() void

		Point p= new Point(500,1000);
		driver.manage().window().setPosition(p);
		
	//	Thread.sleep(4000);

		//driver.close();
			
			
			
		}
	
	}
}
