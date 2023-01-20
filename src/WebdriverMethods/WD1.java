package WebdriverMethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD1 {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//get() void
	driver.get("https://www.selenium.dev/support/");
	
	
	//getTitle() String 
	
	String a = driver.getTitle();
	String b="Support | Selenium";
	//System.out.println(title);
	
	if(a.equals(b)) {
		System.out.println("TC is Pass");
	}
	else
		System.out.println("TC is fail");

	//getCurrentUrl String
	
	String link = driver.getCurrentUrl();
	System.out.println(link);
	
	// navigate() - rrturn type is Navigation
	
	//to(Url url)
	driver.navigate().to("https://www.google.co.in/");
	Thread.sleep(4000);
	
	//to (String url)
	driver.navigate().to(link);
	//forward()
	driver.navigate().forward();
	
	Thread.sleep(4000);

	//back()
	driver.navigate().back();
	
	//refresh
	
	driver.navigate().refresh();
	
	//maximize() void
	
	Thread.sleep(4000);

	driver.manage().window().maximize();
	
	Thread.sleep(4000);
    //minimize() void
	driver.manage().window().minimize();
	
	
	//setSize() void
	
	Thread.sleep(4000);
	Dimension d= new Dimension(200,400);
	driver.manage().window().setSize(d);
	
	//setPosition() void
	Thread.sleep(4000);

	Point p=new Point(300,600);
	
	driver.manage().window().setPosition(p);
	
	
	Thread.sleep(4000);

	driver.close();
	
	Thread.sleep(4000);

	driver.quit();
	

	
	

	
	
	
	
	
}
}
