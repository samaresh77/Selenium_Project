package select_Class;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/samar/Downloads/demo.html");
		Thread.sleep(2000);
		
		//step 1 create the object of select class
		WebElement carsDD = driver.findElement(By.id("multiple_cars"));
		Select sel = new Select(carsDD);
		
		sel.selectByVisibleText("Audi");
		sel.selectByVisibleText("Honda");
		sel.selectByVisibleText("Land Rover");
		Thread.sleep(2000);
		
//		sel.deselectByIndex(1);
//		Thread.sleep(2000);
//		sel.deselectByValue("hda");
//		Thread.sleep(2000);
//		sel.deselectByVisibleText("Land Rover");
		
		sel.deselectAll();
		
		
	}
}
