package Take_Screenshot_Interface;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Actitime_Screenshot {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		//TypeCasting driver control to TakesScreenshot Interface
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//Used to take the screenshot and store in Ram/Local Memory
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//Setting the path, Where we want to store the screenshot
		File dest = new File("./screenshot/actiTimeSS.png");
		
		//Coping screenshot from Ram to system memory
		FileHandler.copy(src, dest);
   }	
}
