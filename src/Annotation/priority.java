package Annotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
	@Test(priority = 1)
	public void TC1() {
		Reporter.log("Running TC 1", true);
	}
	@Test(priority = 2)
	public void TC2() {
		Reporter.log("Running TC 2", true);
	}
	@Test(priority = 1)
	public void TC3() {
		Reporter.log("Running TC 3", true);
	}
}
