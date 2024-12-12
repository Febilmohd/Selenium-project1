package baseclasspkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BlazeDemobase {

	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
}
