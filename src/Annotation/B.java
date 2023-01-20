package Annotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class B {
@Test(dependsOnMethods = {"login"})
public void login() {
	Reporter.log("Running Login", true);
}
@Test(dependsOnMethods = {"login"})
public void logOut() {
	Reporter.log("Running log Out", true);
}
}
