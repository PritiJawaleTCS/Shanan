package Annotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority1 {
	@Test(priority = 1)
	public void eshwar() {
		Reporter.log("Running eshwar", true);
	}
	@Test(priority = 3)
	public void dhanush() {
		Reporter.log("Running dhanush", true);
	}
	@Test(priority = 4)
	public void prabhas() {
		Reporter.log("Running prabhas", true);
	}
	@Test(priority = 2)
	public void alluarjun() {
		Reporter.log("Running alluarjun", true);
	}
}
