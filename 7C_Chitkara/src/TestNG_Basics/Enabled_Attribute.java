package TestNG_Basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_Attribute {
	
	@Test
	public void register() {
		Reporter.log("Executing register test case....",true);
	}
	@Test
	public void login() {
		Reporter.log("Executing login test case....",true);
	}
	@Test(enabled = false)
	public void search() {
		Reporter.log("Executing search test case....",true);
	}
	
}
