package POMTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2 {
  @FindBy(xpath = "//title[text()='Logged In Successfully | Practice Test Automation']") private WebElement text;
  
  public HomePage2(WebDriver driver) {
	  
	 PageFactory.initElements(driver,this); 
  }
  
  public String verifyText() {
	  String actT = text.getText();
		return actT;
  }

}
