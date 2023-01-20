package Annotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount =8)
	public void verifyUid() {
		Reporter.log("Running verify User Id", true);
	}
	
	
}
