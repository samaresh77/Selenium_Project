package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Select_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.get("file:///C:/Users/samar/Downloads/demo.html");
		Thread.sleep(2000);
		
		//step 1 create the object of select class
//		WebElement courseDD = driver.findElement(By.id("course"));
		WebElement courseDD = driver.findElement(By.id("standard_cars"));
		Select select = new Select(courseDD);
		//step 2 use the method using reference variable of select class
		//select ByIndex()
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByIndex(4);
		Thread.sleep(2000);
		
		//select ByValue()
		select.selectByValue("jgr");
		Thread.sleep(2000);
		select.selectByValue("min");
		Thread.sleep(2000);
		
		//select ByVisibletext
		select.selectByVisibleText("Ford");
		Thread.sleep(2000);
		select.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		
	}

}
