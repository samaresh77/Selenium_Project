package select_Class;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_Multiple {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(2000);
		
		//step 1 Identify the dropDown
		WebElement carsDD = driver.findElement(By.name("country"));
		Select sel = new Select(carsDD);
//		List<WebElement>allOptions = sel.getOptions();
//		if(!sel.isMultiple()) {
//			for(WebElement option:allOptions) {
//				System.out.println(option.getText());
//				System.out.println("==================");
//			}
//		}
		if(!sel.isMultiple()) {
			for(int i=1;i<sel.getOptions().size();i++) {
				sel.selectByIndex(i);
				Thread.sleep(1000);
			}
		}
		else {
			System.out.println("Not selected");
		}
		
		
	}
}
