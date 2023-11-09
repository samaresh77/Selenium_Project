package TestNG_Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Register_Test_Case {
	
	@Test(groups = "smokeTest")
	public void register() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		Reporter.log("Executing register test case....",true);
	}
}
