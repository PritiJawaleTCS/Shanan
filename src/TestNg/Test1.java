package TestNg;




import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Test1 {
@Test
public void TC1() {
	
	Reporter.log("My First test TC1 program in TestNG", true);
	}
@Test
public void TC2() {
	
	Reporter.log("My First test TC2 program in TestNG", true);
	Assert.fail();	
	}
}
