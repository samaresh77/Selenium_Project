package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_All_Options {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/samar/Downloads/demo.html");
		Thread.sleep(2000);
		
		//step 1 create the object of select class
		WebElement courseDD = driver.findElement(By.id("standard_cars"));
		Select select = new Select(courseDD);
		
		for(int i=1;i<select.getOptions().size();i++) {
			select.selectByIndex(i);
			Thread.sleep(1000);
		}
		
	}
}
