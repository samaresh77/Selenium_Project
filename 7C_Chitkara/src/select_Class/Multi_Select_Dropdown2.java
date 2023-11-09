package select_Class;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//i.select one by one ii.print iii.deselect one by one
public class Multi_Select_Dropdown2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/samar/Downloads/demo.html");
		Thread.sleep(2000);
		
		//step 1 create the object of select class
		WebElement courseDD = driver.findElement(By.id("multiple_cars"));
		Select select = new Select(courseDD);
		//select all the options
		for(int i=1;i<select.getOptions().size();i++) {
			select.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		//print all the options
		List<WebElement>allOptions = select.getOptions();
		for(WebElement option:allOptions) {
			System.out.println(option.getText());
			System.out.println("==================");
		}
		//deselect all the options
		for(int i=1;i<select.getOptions().size();i++) {
			select.deselectByIndex(i);
			Thread.sleep(1000);
		}
		
		
		
	}
}
