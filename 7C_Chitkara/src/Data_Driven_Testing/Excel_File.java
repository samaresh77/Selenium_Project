package Data_Driven_Testing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_File {
	public static void main(String[] args) throws IOException {
		
		String firstName = Utility_Class.getExcelData("Register_TC", 1, 0);
		String lastName = Utility_Class.getExcelData("Register_TC", 1, 1);
		String email = Utility_Class.getExcelData("Register_TC", 1, 2);
		String password = Utility_Class.getExcelData("Register_TC", 1, 3);
		String confirmpassword = Utility_Class.getExcelData("Register_TC", 1, 4);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility_Class.getPropertyValue("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
		driver.findElement(By.id("register-button")).click();
		
	}
}
