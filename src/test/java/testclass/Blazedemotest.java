package testclass;


import org.testng.annotations.Test;

import baseclasspkg.BlazeDemobase;
import pageclass.BlazeDemopage;

public class Blazedemotest extends BlazeDemobase{
	
	@Test
	public void values() {
		BlazeDemopage ob=new BlazeDemopage();
		ob.setValues("ABC", "BCD cpmpany", "abc123@gmail.com", "1234", "1234");
		ob.click();
	}

}
