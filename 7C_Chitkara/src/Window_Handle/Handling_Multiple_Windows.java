package Window_Handle;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Handling_Multiple_Windows {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/samar/Downloads/MultipleWindow.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(30000);
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentWindowId);
		
		System.out.println(parentWindowId);
		System.out.println("=============");
		
		for(String windowId : allWindowId) {
			driver.switchTo().window(windowId);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(3000);
			driver.close();
		}
		
//		driver.quit();
	}	
}
