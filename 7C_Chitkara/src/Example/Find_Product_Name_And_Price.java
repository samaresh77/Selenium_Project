package Example;


import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Product_Name_And_Price {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 14 (Blue, 128 GB)')]")).click();
		
		
		Set<String> allWindowId = driver.getWindowHandles();
		for(String windowId : allWindowId) {
			driver.switchTo().window(windowId);
		}
		String title = driver.getTitle();
		System.out.println(title);
		String price = driver.findElement(By.xpath("//div[contains(text(),'₹64,999')]")).getText();
		System.out.println(price);
		
		
	}	
}
