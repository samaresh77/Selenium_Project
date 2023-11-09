package Take_Screenshot_Interface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElement_Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		WebElement actitimelogo = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
		File src = actitimelogo.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/ActiTimeLogo.png");
		FileHandler.copy(src, dest);
	}	
}
