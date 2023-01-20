package Annotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
	@Test
	public void TC1() {
		
		Reporter.log("My First test TC1 program in TestNG", true);
		}
	@Test(timeOut = 60000)
	public void TC2() {
		
		Reporter.log("My First test TC2 program in TestNG", true);
}
}
