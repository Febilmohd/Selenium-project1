package testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class Baseclass {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp(){
		driver=new ChromeDriver();
		driver.get("https://janasya.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
}
