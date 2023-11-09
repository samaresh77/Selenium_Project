package working_with_webDriver_Methodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
		driver.manage().window().fullscreen();
//		Thread.sleep(3000);
//		driver.manage().window().minimize();
		
//		Thread.sleep(3000);
//		int height=driver.manage().window().getSize().getHeight();
//		System.out.println(height);
//		int width=driver.manage().window().getSize().getWidth();
//		System.out.println(width);
		
		Thread.sleep(1000);
		int x=driver.manage().window().getPosition().getX();
		System.out.println(x);
		int y=driver.manage().window().getPosition().getY();
		System.out.println(y);
		driver.quit();
		
		
		
	}

}
