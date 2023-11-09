package Project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	WebDriver driver = new ChromeDriver();
	@BeforeClass
	public void openBroser() {
		
	}
	@AfterClass
	public void closeBrowser() {
		
	}
}
