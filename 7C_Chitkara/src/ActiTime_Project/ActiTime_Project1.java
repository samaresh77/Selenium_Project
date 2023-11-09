package ActiTime_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_Project1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=5qs79lmdprdjp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager",Keys.ENTER);
		driver.findElement(By.className("sizer")).click();
	}
}
