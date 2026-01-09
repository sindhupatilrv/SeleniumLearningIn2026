package BasicSeleniumUsage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		
		//WebElement isselect = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
		WebElement isselect = driver.findElement(By.className("rct-checkbox"));
		if(isselect.isSelected()) {
			isselect.click();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  System.out.println("Checkbox 1 selected? " + isselect.isSelected());
		}
		driver.close();
	}
}
