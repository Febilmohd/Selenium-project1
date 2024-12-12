package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebaypge {

	WebDriver driver;
	
	@FindBy (name = "gh-ac")
	WebElement searchbar;
	
	@FindBy (xpath = "//*[@id=\"item5508161056\"]/div/div[1]/div/a/div/img")
	WebElement toy;
	
	@FindBy (xpath = "//*[@id=\"atcBtn_btn_1\"]")
	WebElement addcart;
	
	public Ebaypge(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void search(String searchbarr) {
		searchbar.sendKeys(searchbarr);
		
	}
}
