package Working_with_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
//		driver.findElement(By.id("username")).sendKeys("Samaresh"); //if only line executed
		WebElement usenameTF = driver.findElement(By.id("username"));
		usenameTF.sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.className("initial")).click();
		
	}

}
