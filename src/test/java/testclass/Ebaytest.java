package testclass;

import org.testng.annotations.Test;

import baseclasspkg.Ebaybasewrk1;
import pageclass.Ebaypge;

public class Ebaytest extends Ebaybasewrk1{

//public static WebDriver driver;
	


	
	@Test
	public void search() {
		Ebaypge ob=new Ebaypge(driver);
		ob.search("toys");
	}
}
