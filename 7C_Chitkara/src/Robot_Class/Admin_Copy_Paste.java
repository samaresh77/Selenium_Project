package Robot_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Admin_Copy_Paste {
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		WebElement ele1 = driver.findElement(By.xpath("//input[@name='q']"));
		action.click(ele1).perform();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_B);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_A);
//		robot.keyPress(KeyEvent.VK_C);
//		robot.keyRelease(KeyEvent.VK_C);
		
		
//		WebElement ele2 = driver.findElement(By.xpath("//input[@name='pwd']"));
//		action.click(ele2).perform();
		
		
		Thread.sleep(3000);
		driver.quit();
	}	
}
