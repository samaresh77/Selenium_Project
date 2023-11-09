package select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_All_Options {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/samar/Downloads/demo.html");
		Thread.sleep(2000);
		
		//step 1 create the object of select class
		WebElement courseDD = driver.findElement(By.id("standard_cars"));
		Select select = new Select(courseDD);
		List<WebElement>allOptions = select.getOptions();
		for(WebElement option:allOptions) {
			System.out.println(option.getText());
			System.out.println("==================");
		}
		driver.quit();
		
		
	}
}
