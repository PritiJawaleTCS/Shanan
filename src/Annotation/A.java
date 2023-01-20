package Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A {
	
@BeforeClass
public void openBrowser() {
	Reporter.log("Open Browser", true);
}
@BeforeMethod
public void loginToApp() {
	Reporter.log("login To App", true);

}
@Test
public void verifyText() {
	Reporter.log("Running actual test case", true);
}

@AfterMethod
public void logoutToApp(){
	Reporter.log("Logout From App", true);

}
@AfterClass
public void closeBrowser() {
	Reporter.log("Close Browser", true);
	System.out.println("Comments from Githun by team leader");

}
}
