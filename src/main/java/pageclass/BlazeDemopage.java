package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazeDemopage {
	WebDriver driver;
	
	@FindBy (name = "name")
	WebElement usname;
	
	@FindBy ( name = "company")
	WebElement comp;
	
	@FindBy (name = "email")
	WebElement mail;
	
	@FindBy (name = "password")
	WebElement pass;
	
	@FindBy (name = "password_confirmation")
	WebElement passconfrm;
	
	@FindBy(linkText = "Register")
	WebElement bttn;
	
	public void Register(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setValues(String name,String compn,String mmail,String passw,String confrm) {
		usname.sendKeys(name);
		comp.sendKeys(compn);
		mail.sendKeys(mmail);
		pass.sendKeys(passw);
		passconfrm.sendKeys(confrm);
	}
	
	public void click() {
		bttn.click();
	}
}
