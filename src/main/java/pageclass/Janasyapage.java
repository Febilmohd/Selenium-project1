package pageclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Janasyapage{
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-template--16443445936298__collection_list_XCnGJa\"]/div/div/div/div/a[1]/div/img")
	WebElement select;
	
	@FindBy(xpath = "//*[@id=\"product-list-template--16443445608618__main\"]/product-card[1]/div[1]/a/img")
	WebElement item;
	
	@FindBy(xpath = "//*[@id=\"shopify-block-wishlist_engine_product_page_bgTNAV\"]/div/div")
	WebElement addwish;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--16434563743914__header\"]/height-observer/x-header/nav[2]/a[3]/span")
	WebElement viewwish;
	
	@FindBy(xpath = "//*[@id=\"wishlist-move-cart-0\"]")
	WebElement addcart;

	
	
	public Janasyapage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void perfomactions() {
		
		select.click();
		item.click();
		
	}
	
	public void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
		
		}
	
	
	
	public void wishclick() {
		addwish.click();
////		viewwish.click();
////		addcart.click();
	}
	
	public void scrollup() {

		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0, -1000)");
	}
		

}
