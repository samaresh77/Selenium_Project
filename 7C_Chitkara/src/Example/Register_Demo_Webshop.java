package Example;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Register_Demo_Webshop {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Random random = new Random();
		int num = random.nextInt(100);
		String email = "chitkara"+num+"@gmail.com";
		
		WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
		if(registerLink.isDisplayed()) {
//			System.out.println("Navigating to demo web shop");
			registerLink.click();
			WebElement registerHeading = driver.findElement(By.xpath("//h1[text()='Register']"));
			if(registerHeading.isDisplayed()) {
				System.out.println("Navigate to register page");
				driver.findElement(By.xpath("//input[@id='gender-male']")).click();
				driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Samaresh");
				driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Mondal");
				driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
				driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("samaresh@123");
				driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("samaresh@123");
				driver.findElement(By.xpath("//input[@id='register-button']")).click();
				Thread.sleep(2000);
				WebElement registrationMessage = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
				if(registrationMessage.isDisplayed()) {
					TakesScreenshot ts = (TakesScreenshot) driver;
					File src = ts.getScreenshotAs(OutputType.FILE);
					File dest = new File("./screenshot/Registerpage.png");
					FileHandler.copy(src, dest);
				}
				else {
					System.out.println("Not registered......");
				}
			}
		}
	}	
}
