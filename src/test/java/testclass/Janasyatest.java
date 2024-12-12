package testclass;

import org.testng.annotations.Test;

import pageclass.Janasyapage;

public class Janasyatest extends Baseclass {
	
	@Test
	public void performs() {
		Janasyapage ob=new Janasyapage(driver);
		ob.perfomactions();
		ob.scrolldown();
		ob.wishclick();
		ob.scrollup();
	}

}
