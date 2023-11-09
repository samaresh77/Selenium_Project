package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		WebElement maleRB = driver.findElement(By.id("gender-male"));
		System.out.println(maleRB.getAttribute("type"));
		System.out.println(maleRB.getAttribute("name"));
		System.out.println(maleRB.getAttribute("id"));
		System.out.println(maleRB.getAttribute("value"));
		driver.quit();
	}	
}
