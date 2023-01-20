package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}	public void verifyText() {
	String Expt = "Enter Time-Track";
	String Act = text.getText();
	if(Act.equals(Expt)) {
		System.out.println("Tc is Pass");
	}
	else
	{
		System.out.println("TC Is Fail");
	}
}


}
