package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties_File {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//step-1 Create a java representation object of external file
		FileInputStream fis = new FileInputStream("./Data/commondata.properties");
		
		//step-2 Create the object of properties class
		Properties prop = new Properties();
		
		//step-3 Load all the key into the properties object
		prop.load(fis);
		
		//step-4 use the properties class method to fetch the data
		String URL =  prop.getProperty("url");
		String email = prop.getProperty("Email");
		String password = prop.getProperty("Password");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
//		driver.get(Utility_Class.getPropertyValue("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		
	}
}
